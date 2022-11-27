public class StringReplacer implements StringTransformer{
    private char out;
    private char in;
    public StringReplacer(char out, char in){
        this.out=out;
        this.in=in;
    }
    @Override
    public void execute(StringDrink drink){
        drink.setText(drink.getText().replace(out, in));
    }
    @Override
    public void undo(StringDrink drink) {
        drink.setText(drink.getText().replace(in, out));
    }
}
