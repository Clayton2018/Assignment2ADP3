package Configuration;


import clayton.com.SubjectTwo;
import clayton.com.SubjectOne;
import clayton.com.SubjectsCollectionInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {

    @Bean(name = "collections1")

    public SubjectsCollectionInterface getSubjectsCollectionInterface(){

        return new SubjectOne();

    }

    @Bean(name = "collections2")

    public SubjectsCollectionInterface getSubjectsCollectionInterface2(){

        return new SubjectTwo();

    }



}
