public class StringHoster implements StringHost {

    private String thisIsString;

    @Override
    public String getString() {
        return thisIsString;
    }

    @Override
    public void setString(String string) {
        this.thisIsString = string;
    }
}
