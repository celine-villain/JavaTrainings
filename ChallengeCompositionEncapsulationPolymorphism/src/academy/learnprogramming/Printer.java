package academy.learnprogramming;

public class Printer {
    private int levelToner = 100;
    private double numberOfPages;
    private boolean duplexPrinter;

    public Printer(int levelToner, int numberOfPages, boolean duplexPrinter) {
        this.levelToner = levelToner < 0 || levelToner > 100 ? 100 : levelToner;
        this.numberOfPages = numberOfPages < 0 ? 0 : numberOfPages;
        this.duplexPrinter = duplexPrinter;
    }

    public int getLevelToner() {
        return levelToner;
    }

    public int getNumberOfPages() {
        return (int)Math.round(numberOfPages);
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }

    public void fillUp(int addedToner) {
        if (addedToner > 0) {
            if (this.levelToner + addedToner > 100) {
                this.levelToner = 100;
            } else {
                this.levelToner += addedToner;
            }
        }
    }

    public void print () {
        if (duplexPrinter) {
            this.numberOfPages += 0.5;
        } else {
            this.numberOfPages += 1;
        }
    }

    public void printDocument (String document, int pages, int numberOfCopies) {
        for (int i = 1; i <= numberOfCopies; i++) {
            for (int j = 1; j <= pages; j++) {
                print();
            }
        }
        System.out.println("Your document is printed in " + numberOfCopies + " copies, and there are " + this.getNumberOfPages() + " pages printed.");
    }
}
