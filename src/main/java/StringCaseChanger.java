public class StringCaseChanger implements StringTransformer{
    @Override
    public void execute(StringDrink drink){
        StringBuilder changed = new StringBuilder();
        for(char c:drink.getText().toCharArray()){
            if (Character.isLowerCase(c)){changed.append(Character.toUpperCase(c));}
            else {changed.append(Character.toLowerCase(c));}
        }
        drink.setText(changed.toString());
    }
    @Override
    public void undo(StringDrink drink) {
        execute(drink);
    }
}
