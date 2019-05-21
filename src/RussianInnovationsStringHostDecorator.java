public class RussianInnovationsStringHostDecorator extends StringHostDecorator {

    public RussianInnovationsStringHostDecorator(StringHost hoster) {
        super(hoster);
    }

    @Override
    public String getString() {
        // just spend all money in vain
        return "WE NEED MORE BILLIONS!!";
    }
}
