public class bycicle 
{
    public static void main (String[] args)
    {
        String merk, merk2;
        int speed, speed2, gear, gear2;
        
        merk = "Polygon";
        speed = 10;
        gear = 1;
        
        merk = "Wiim Cycle";
        speed = 10;
        gear = 1;
        
        
        speed = increaseSpeed(speed, 10);
        speed2 = increaseSpeed(speed2, 10);
        
        system.out.println("merk + " +merk);
        system.out.println("speed + " +speed);
        
            system.out.println("merk + " +merk);
        system.out.println("speed + " +speed);
        
        
        public static int increaseSpeed(int speed, int increment)
        {
            speed += increment;
            return speed;
        }
        
            public static int increaseSpeed(int speed, int decrement)
        {
            speed += decrement;
            return speed;
        }
    }
    
