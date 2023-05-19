package mavenpluginown;

import java.util.Map;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "sayhi")
public class GreetingMojo extends AbstractMojo {

	@Parameter(property = "sayhi.greeting", defaultValue = "Hello World!")
	private String greeting;

	public void execute() throws MojoExecutionException, MojoFailureException {
		getLog().info("Hello, world. >> Sitaram >> " + greeting);

		Map details = this.getPluginContext();
		System.out.println(details);
	}
}
