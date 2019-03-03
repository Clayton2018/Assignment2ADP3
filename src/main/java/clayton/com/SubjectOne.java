package clayton.com;

import java.util.*;

/**
 * Hello world!
 *
 */
public class SubjectOne implements SubjectsCollectionInterface{

      private ArrayList subjects;
      private Map subjectCode;
      private Set classNum;

    public SubjectOne(){

        subjects = new ArrayList();
        subjectCode = new HashMap();
        classNum = new HashSet();

    }

    @Override
    public void addToArrayList(String item) {

        subjects.add(item);

    }

    @Override
    public void addToMap(String key, String value) {

        subjectCode.put(key,value);

    }

    @Override
    public void addToSet(double item) {

        classNum.add(item);

    }

    public static void main( String[] args ){



    }

}
