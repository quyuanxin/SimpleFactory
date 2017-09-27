public class SunnyTest {
    public  static  void main(String[]args) {
        //   HairInterface left = new LeftHair();
        //  left.draw();
        //普通工厂模式，增加一个类，配置相应文件内容
        HairFactory factory = new HairFactory();
        HairInterface left = factory.getHairByClass("right");
        left.draw();
    }
}
