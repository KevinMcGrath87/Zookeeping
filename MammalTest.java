import com.kevin.animals.Mammal;
import com.kevin.animals.Gorilla;
import com.kevin.animals.Bat;

public class MammalTest{
    public static void main(String[] args){
        Gorilla beebee = new Gorilla();
        for(int x = 0; x < 3; x++){
            beebee.throwSomething();
                if (x>0){
                    beebee.eatBanana();
                }
                if (x<1){
                    beebee.climb();
                }
            }
        Bat beebat = new Bat();
        beebat.eatBanana();
        for(int x =0; x <3; x++){
            beebat.attackTown();
            if(x > 0){
                beebat.eatHumans();
                beebat.fly();
            }
        }
        }

    }

