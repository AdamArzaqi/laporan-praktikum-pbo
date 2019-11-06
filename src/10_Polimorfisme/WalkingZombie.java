package TugasPolimorfism_1841720075Adam;

public class WalkingZombie extends Zombie {

    public WalkingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        switch(level){
            case 1:
                health = health + (this.health) * 20/100;
                break;
            case 2:
                health = health + (this.health) * 30/100;
                break;
            case 3:
                health = health + (this.health) * 50/100;
                break;
        }   
       }

    @Override
    public void destroyed() {
        health = health - (this.health * 2/100);
    }

    @Override
    public String getZombieInfo() {
        String info = super.getZombieInfo() + "\n";
        info += "Walking Zombie Data = \n" + "Health = " + health + "\n" + "Level = " +level;
        return info;
    }
    
}

    

