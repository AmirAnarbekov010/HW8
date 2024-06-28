package kg.geeks.game.players;

public class Medic extends Hero
{
     private int healPoints;

     public Medic(int health, int damage, String superAbilityType, int healPoints) {
          super(health,int heal,int damege, name;);
          this.healPoints = healPoints;applySuperAbility();setHealPoints();
     }

     public void setHealPoint() {
     }

     public int getHealPoints() {
          return healPoints;
     }

     public void setHealPoints() {
          this.healPoints = healPoints;
     }

     @Override
     public void applySuperAbility() {
          System.out.println("Medic применил суперспособность ");
     }

     public void increaseExperience() {
          this.healPoints += this.healPoints * 0.1;

          System.out.println("Medic увеличил опыт лечения, теперь количество единиц лечения: " + this.healPoints);
     }

     @Override
     public void applySuperPower(Boss boss, Hero[] heroes) {

     }
}



