import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertiseReader {
    public Map<String,String> getProperties(){
        Properties prop = new Properties();
        Map<String,String>map = new HashMap<String,String>();
        try{
            InputStream in = getClass().getResourceAsStream("type");
            prop.load(in);
            Enumeration en = prop.propertyNames();
            while (en.hasMoreElements()) {
                String key = (String) en.nextElement();
                String property = prop.getProperty(key);
                map.put(key, property);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return map;
    }

}
