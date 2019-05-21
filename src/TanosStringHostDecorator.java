/**
 * If you want to catch: https://memepedia.ru/memy-s-dezintegraciej-i-don-t-feel-so-good/
 */
public class TanosStringHostDecorator extends StringHostDecorator {

    public TanosStringHostDecorator(StringHost hoster) {
        super(hoster);
    }

    @Override
    public String getString() {
        String tanosString = super.getString();

        tanosString = tanosString.substring(tanosString.length()/2);
        return tanosString;
    }
}
