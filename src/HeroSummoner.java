public class HeroSummoner {
    public static void main(String[] args){
        Hero[] heros = new Hero[3];

        FlyingHero flyingHero = new FlyingHero();
        SwimmingHero swimmingHero = new SwimmingHero();
        SwimmerFlyer swimmerFlyer = new SwimmerFlyer();

        heros[0] = flyingHero;
        heros[1] = swimmingHero;
        heros[2] = swimmerFlyer;

        for (Hero hero : heros){
        hero.move();
        hero.HeroClass();
        System.out.println("----------------");
        }

    }
}
