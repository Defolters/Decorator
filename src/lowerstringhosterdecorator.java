public class lowerstringhosterdecorator extends StringHostDecorator {

    public lowerstringhosterdecorator(StringHost hoster) {
        super(hoster);
    }

    @Override
    public String getString() {
        return super.getString().toLowerCase();
    }
}
