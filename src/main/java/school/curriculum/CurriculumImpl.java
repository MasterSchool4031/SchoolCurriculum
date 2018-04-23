package school.curriculum;

import java.util.Iterator;
import java.util.List;

public class CurriculumImpl implements Curriculum {
	
	List<String> lessonList;

	public CurriculumImpl(List<String> lessonList) {
		super();
		if (lessonList==null)throw new NullPointerException("Liste de cours null");
		this.lessonList = lessonList;
	}

	@Override
	public Iterator<String> iterator() {
		return lessonList.iterator();
	}

}
