import java.util.Map;

public class HairFactory {
    public  HairInterface getHairByClass(String key){

        try {
            Map<String,String>map = new PropertiseReader().getProperties();
            HairInterface hair =( HairInterface) Class.forName(map.get(key)).newInstance();
            return hair;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
