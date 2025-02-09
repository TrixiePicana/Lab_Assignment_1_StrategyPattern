public class GameApp    //Client code
{
    public static void main(String[] args)
    {
        Character knight = new Knight();    //Create character
        knight.performAttack();
        knight.performDefense();

        Character wizard = new Wizard();
        wizard.performAttack();
        wizard.performDefense();

        Character archer = new Archer();
        archer.performAttack();
        archer.performDefense();
    }
}