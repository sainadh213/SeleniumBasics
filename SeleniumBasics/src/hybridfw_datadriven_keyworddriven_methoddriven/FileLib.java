package hybridfw_datadriven_keyworddriven_methoddriven;

import java.io.InputStream;
import java.util.Properties;
import java.io.FileInputStream;
public class FileLib {
	public String readPropertyData(String path, String key) throws Throwable {
        FileInputStream fis = new FileInputStream(path);
        Properties prop = new Properties();
        prop.load(fis);
        String propValue = prop.getProperty(key, "Incorrct Key");
        return propValue;
    }

}
