package p_jenk_mvn_java.app;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class p_jenk_mvn_javaApplication extends Application<p_jenk_mvn_javaConfiguration> {

    public static void main(final String[] args) throws Exception {
        new p_jenk_mvn_javaApplication().run(args);
    }

    @Override
    public String getName() {
        return "p_jenk_mvn_java";
    }

    @Override
    public void initialize(final Bootstrap<p_jenk_mvn_javaConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final p_jenk_mvn_javaConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
