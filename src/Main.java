public class Main {
    public static void main(String[] args) {

        Boss boss1 = new Boss();
        boss1.setHealth(700);
        boss1.setDamage(50);
        boss1.setBossDefenceType("magical");

        System.out.println("boss health: "
                + boss1.getHealth() + ", damage: " + boss1.getDamage() + ", defense: " + boss1.getBossDefenceType());

        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println("heroes "+(i+1)+": " + createHeroes()[i]);

        }
    }

    public static Hero[] createHeroes() {
        Hero ang = new Hero(250, 25, "сила воздуха");
        Hero katara = new Hero(260, 20, "сила воды");
        Hero tof = new Hero(270, 15, "сила земли");
        Hero[] allHeroes = {ang, katara, tof};
        return allHeroes;
    }
}