package academy.learning;

public class UserInput {

    public static class TextInput {
        String value = "";

        public void add(char c) {
            value += c;
        }

        public String getValue() {
            return this.value;
        }
    }

    public static class NumericInput extends TextInput {
        @Override
        public void add(char c) {
            if(Character.isDigit(c)){
                value+=c;
            }
        }
    }

    public static void main(String[] args) {
        NumericInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}