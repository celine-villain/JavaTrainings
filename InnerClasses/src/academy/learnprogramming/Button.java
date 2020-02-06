package academy.learnprogramming;

public class Button {
    private String title;
    private OnClickListener onClickListener;

    public Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public OnClickListener getOnClickListener() {
        return onClickListener;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public void onClick () {
        this.onClickListener.onClick(this.title);
    }

    @Override
    public String toString() {
        return "Button{" +
                "title='" + title + '\'' +
                ", onClickListener=" + onClickListener +
                '}';
    }

    public interface OnClickListener {
        public void onClick(String title) ;
    }
}
