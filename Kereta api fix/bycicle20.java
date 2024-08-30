public class bycicle20 {
    public static void main(String[] args) {
        String merk1 = "BROMTON";
        int speed1 = 10;
        int gear1 = 1;
        
        String merk2 = "KOLYGON";
        int speed2 = 40;
        int gear2 = 1;
        
        speed1 = increaseSpeed(speed1, 30);
        
        speed2 = increaseSpeed(speed2, 120);
        
        System.out.println("Merk sepeda pertama: " + merk1);
        System.out.println("Kecepatan sepeda pertama: " + speed1);
        
        System.out.println("Merk sepeda kedua: " + merk2);
        System.out.println("Kecepatan sepeda kedua: " + speed2);
    }
    
    public static int increaseSpeed(int speed, int increment) {
        return speed + increment;
    }
}
