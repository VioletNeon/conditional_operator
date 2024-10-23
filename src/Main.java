public class Main {
    public static void main(String[] args) {
        byte minAge = 5;
        byte maxAge = 70;
        byte randomAge = getRandomNumber(minAge, maxAge);

        if (randomAge >= 18) {
            System.out.println("Если возраст человека равен " + randomAge + ", то он совершеннолетний." + "\n");
        } else {
            System.out.println("Если возраст человека равен " + randomAge + ", то он не достиг совершеннолетия, нужно немного подождать." + "\n");
        }

        byte minTemperature = -15;
        byte maxTemperature = 15;
        byte randomTemperature = getRandomNumber(minTemperature, maxTemperature);

        if (randomTemperature < 5) {
            System.out.println("На улице " + randomTemperature + " градусов, нужно надеть шапку." + "\n");
        } else {
            System.out.println("На улице " + randomTemperature + " градусов, можно идти без шапки." + "\n");
        }

        byte minSpeed = 10;
        byte maxSpeed = 120;
        byte randomSpeed = getRandomNumber(minSpeed, maxSpeed);

        if (randomSpeed > 60) {
            System.out.println("Если скорость " + randomSpeed + ", то придется заплатить штраф." + "\n");
        } else {
            System.out.println("Если скорость " + randomSpeed + ", то можно ездить спокойно." + "\n");
        }
    }

    public static byte getRandomNumber(byte min, byte max) {
        return (byte) (Math.floor((float) Math.random() * (max - min + 1)) + min);
    }
}