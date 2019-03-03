package clayton.com;

import clayton.com.SubjectsCollectionInterface;

import java.util.*;

public class SubjectTwo implements SubjectsCollectionInterface {


    private ArrayList subjects;
    private Map subjectCode;
    private Set classNum;

    public SubjectTwo(){

        subjects = new ArrayList();
        subjectCode = new HashMap();
        classNum = new HashSet();

    }

    public static void main( String[] args ){



    }

    @Override
    public void addToArrayList(String item) {

        subjects.add(item);

    }

    @Override
    public void addToMap(String key, String value) {

        subjectCode.put(key,value);
        subjectCode.put(key, value);

    }

    @Override
    public void addToSet(double item) {

        classNum.add(item);

    }

}
