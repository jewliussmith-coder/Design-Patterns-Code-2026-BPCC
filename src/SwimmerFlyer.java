public class SwimmerFlyer extends Hero{

    @Override
    public void move(){
        System.out.println("I can glide through the water!");
        System.out.println("I can soar through the clouds!");
    }

    @Override
    public void HeroClass(){
        System.out.println("Hero Class: Swimmer/Flyer");
    }
}
