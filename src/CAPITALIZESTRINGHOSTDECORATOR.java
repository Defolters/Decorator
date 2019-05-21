public class CAPITALIZESTRINGHOSTDECORATOR extends StringHostDecorator {

    public CAPITALIZESTRINGHOSTDECORATOR(StringHost hoster) {
        super(hoster);
    }

    @Override
    public String getString() {
        return super.getString().toUpperCase();
    }
}
