import java.util.Scanner;

public class Main {
	private static final String getGeneratedClass(final CommandLine cl) {
		// get the name of the generated class
		final String className;
		if (cl.hasOption('n')) {
			className = cl.getOptionValue('n');
		} else {
			String s = "";
			for (final File f : inputFiles) {
				if (s.length() != 0)
					s += "_";
				if (f.getName().indexOf('.') != -1)
					s += f.getName().substring(0, f.getName().lastIndexOf('.'));
				else
					s += f.getName();
			}
			className = pascalCase(s);
		}
		return className;
	}
}
