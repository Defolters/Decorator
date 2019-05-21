public class Main {

    public static void main(String[] args) {
        
        String hello = "Hello World, I just want to sleep! Help me somebody, I miss my mind!";

        StringHoster stringHoster = new StringHoster();
        stringHoster.setString(hello);
        System.out.println("StringHoster:\n"+stringHoster.getString());

        StringHostDecorator lowerDecorator = new lowerstringhosterdecorator(stringHoster);
        System.out.println("\nlowerDecorator:\n"+lowerDecorator.getString());

        StringHostDecorator russianInnovations = new RussianInnovationsStringHostDecorator(stringHoster);
        System.out.println("\nrussianInnovations:\n"+russianInnovations.getString());

        StringHostDecorator capitalizeTanos = new CAPITALIZESTRINGHOSTDECORATOR(
                new TanosStringHostDecorator(stringHoster)
        );
        System.out.println("\ncapitalizeTanos:\n"+capitalizeTanos.getString());


    }
}
