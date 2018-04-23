package school.curriculum;

import java.util.Map;

/**
 * Fabrique abstraite donnant accès aux {@link Curriculum}s de formation.
 * 
 * @author boogaerts
 * 
 */
public interface CurriculumFactory {

	/**
	 * Retourne une collection clés valeurs dont les clés sont les noms de
	 * formations et les valeurs le curriculum de la formation.
	 * 
	 * @return les Curriculums de formation
	 */
	Map<String, Curriculum> getCurriculumMap();

	/**
	 * retourne le nom de l’école fournissant les {@link Curriculum}s.
	 * 
	 * @return le nom de l’école.
	 */
	String getSchoolName();

}
