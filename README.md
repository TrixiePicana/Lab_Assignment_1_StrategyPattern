# Lab_Assignment_1_StrategyPattern

<h2>Problem scenario:</h2>

Suppose we have three types of characters in a GameApp:

1. Knight: Attacks with a sword; uses 3 strategies to defend (shield, dodge, magic barrier)
2. Wizard: Casts spells; uses magic barrier to defend
3. Archer: Shoots arrows; uses dodge to to defend

<h2>Implement two types of Strategy: <br></h2>
<h3>A. DefenseStrategy <br></h3>
     1. Shield <br>
     2. Dodge <br>
  <p>3. CreateMagic <br></p>

<h3>B. AttackStrategy</h3>
     1.  CastSpell <br>
     2.  ShootArrow <br>
  <p>3.  SwingSword  <br></p>


Refactor the existing codes and provide the UML Diagram:

public class Character <br>
{<br>
    private String type;

    public Character(String type) 
    {
        this.type = type;
    }

    public void attack() 
    {
        if (type.equals("Knight")) 
        {
            System.out.println("Knight attacks with a sword!");
        } 
        else if (type.equals("Wizard")) 
        {
            System.out.println("Wizard casts a spell!");
        }
        else if (type.equals("Archer")) 
        {
            System.out.println("Archer shoots an arrow!");
        }
    }

    public void defend() 
    {
        if (type.equals("Knight")) 
        {
            System.out.println("Using a shield to defend!");
	System.out.println("Dodgin to avoid attack!");
            System.out.println("Creating a magic barrier for defense!"");		

        } 
        else if (type.equals("Wizard")) 
        {
            System.out.println("Creating a magic barrier for defense!"");
        } 
        else if (type.equals("Archer")) 
        {
            System.out.println("Using a shield to defend!"");
        }
    }
}


<h2>UML Diagram</h2> <br>

[file:///C:/Users/dell/Downloads/Lab%20Assignment%201_%20Strategy%20Pattern.pdf](path/to/your/file.pdf)
