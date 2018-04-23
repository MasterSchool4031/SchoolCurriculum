package school.curriculum;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;

public class CurriculumFactoryImpl implements CurriculumFactory {

	private Hashtable<String, Curriculum> curriculumlMap;


	@Override
	public Map<String, Curriculum> getCurriculumMap() {
		if (this.curriculumlMap == null) {
			this.curriculumlMap = new Hashtable<String, Curriculum>();
			CurriculumImpl cours;
			Properties prop = new Properties();

			try {
				this.LoadProperties(prop, "formations.txt");

				for (String trainingName : prop.stringPropertyNames()) {
					cours = new CurriculumImpl(Arrays.asList(prop.getProperty(
							trainingName).split(",")));
					this.curriculumlMap.put(trainingName, cours);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return curriculumlMap;
	}

	private void LoadProperties(Properties prop, String path)
			throws IOException {
		InputStream in = CurriculumFactoryImpl.class.getResourceAsStream(path);
		if (in == null)
			throw new FileNotFoundException(path);
		prop.load(in);
	}

	@Override
	public String getSchoolName() {
		return "STE-Formations";
	}

}
