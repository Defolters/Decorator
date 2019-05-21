public class StringHostDecorator implements StringHost {

    private StringHost hoster;

    public StringHostDecorator(StringHost hoster) {
        this.hoster = hoster;
    }

    @Override
    public String getString() {
        return hoster.getString();
    }

    @Override
    public void setString(String string) {
        hoster.setString(string);
    }
}
