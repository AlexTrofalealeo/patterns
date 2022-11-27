public class StringInverter implements StringTransformer{
    @Override
    public void execute(StringDrink drink){
        String inverted=new StringBuilder(drink.getText()).reverse().toString();
        drink.setText(inverted);
    }
    @Override
    public void undo(StringDrink drink) {
        execute(drink);
    }
}
