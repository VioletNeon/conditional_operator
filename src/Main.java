public class Main {
    public static void main(String[] args) {
        byte minAge = 2;
        byte maxAge = 30;
        byte randomAge = getRandomNumber(minAge, maxAge);
        boolean isAdult = randomAge >= 18;

        if (isAdult) {
            System.out.println("Если возраст человека равен " + randomAge + ", то он совершеннолетний." + "\n");
        } else {
            System.out.println("Если возраст человека равен " + randomAge + ", то он не достиг совершеннолетия, нужно немного подождать." + "\n");
        }

        byte minTemperature = -15;
        byte maxTemperature = 15;
        byte randomTemperature = getRandomNumber(minTemperature, maxTemperature);
        boolean isCold = randomTemperature < 5;

        if (isCold) {
            System.out.println("На улице " + randomTemperature + " градусов, нужно надеть шапку." + "\n");
        } else {
            System.out.println("На улице " + randomTemperature + " градусов, можно идти без шапки." + "\n");
        }

        byte minSpeed = 10;
        byte maxSpeed = 120;
        byte randomSpeed = getRandomNumber(minSpeed, maxSpeed);
        boolean isSpeeding = randomSpeed > 60;

        if (isSpeeding) {
            System.out.println("Если скорость " + randomSpeed + ", то придется заплатить штраф." + "\n");
        } else {
            System.out.println("Если скорость " + randomSpeed + ", то можно ездить спокойно." + "\n");
        }

        boolean isKindergarten = randomAge >= 2 && randomAge <= 6;
        boolean isSchoolboy = randomAge >= 7 && randomAge <= 17;
        boolean isStudent = randomAge >= 18 && randomAge <= 24;
        boolean isEmployee = randomAge > 24;

        if (isKindergarten) {
            System.out.println("Если возраст человека равен " + randomAge + ", то ему нужно ходить" + " в детский сад" + "\n");
        }

        if (isSchoolboy) {
            System.out.println("Если возраст человека равен " + randomAge + ", то ему нужно ходить" + " в школу" + "\n");
        }

        if (isStudent) {
            System.out.println("Если возраст человека равен " + randomAge + ", то ему нужно ходить" + " в университет" + "\n");
        }

        if (isEmployee) {
            System.out.println("Если возраст человека равен " + randomAge + ", то ему нужно ходить" + " на работу" + "\n");
        }

        byte logFalse = 0;
        byte logTrue = 1;
        byte randomLogNumber = getRandomNumber(logFalse, logTrue);
        boolean hasAdult = randomLogNumber == logTrue;
        boolean isBaby = randomAge < 5;
        boolean isJuniorSchoolboy = randomAge >= 7 && randomAge <= 17;
        boolean isTeenager = randomAge > 15;

        if (isBaby) {
            System.out.println("Если возраст ребенка равен " + randomAge + ", то ему нельзя кататься на аттракционе." + "\n");
        }

        if (isJuniorSchoolboy && hasAdult) {
            System.out.println("Если возраст ребенка равен " + randomAge + ", то ему можно кататься на аттракционе в сопровождении взрослого." + "\n");
        }

        if (isTeenager) {
            System.out.println("Если возраст ребенка равен " + randomAge + ", то ему можно кататься на аттракционе без сопровождения взрослого." + "\n");
        }

        byte minPassenger = 10;
        byte maxPassenger = 65;
        byte totalCapacity = 102;
        byte sitingsCapacity = 60;

        byte randomSitingPassengers = getRandomNumber(minPassenger, maxPassenger);
        byte randomStandingPassengers = getRandomNumber(minPassenger, maxPassenger);
        short currentPassengersCount = (short) (randomSitingPassengers + randomStandingPassengers);

        boolean hasPlaces = currentPassengersCount <= totalCapacity;
        boolean hasSittings = randomSitingPassengers <= sitingsCapacity;

        if (hasPlaces) {
            if (hasSittings) {
                System.out.println("В вагоне есть место, сидячее." + "\n");
            } else {
                System.out.println("В вагоне есть место, стоячее." + "\n");
            }
        } else {
            System.out.println("Вагон уже полностью забит." + "\n");
        }
    }

    public static byte getRandomNumber(byte min, byte max) {
        return (byte) (Math.floor((float) Math.random() * (max - min + 1)) + min);
    }
}