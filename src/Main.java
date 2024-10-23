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
    }

    public static byte getRandomNumber(byte min, byte max) {
        return (byte) (Math.floor((float) Math.random() * (max - min + 1)) + min);
    }
}