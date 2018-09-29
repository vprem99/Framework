package DEmo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demoReflection {

	public static void main(String[] args) throws Exception
	{
		FirefoxDriver w;
		Class cls=Class.forName("DEmo.Employee");
		//Class cls=Class.forName("org.openqa.selenium.firefox.FirefoxDriver");
		Constructor[] cons=	cls.getConstructors();
		System.out.println(cons.length);
		for(Constructor c: cons)
		{
			System.out.println(c);
		}
		
		Field[] fl=	cls.getDeclaredFields();
		
		System.out.println("Total variable "+fl.length);

		for(Field f:fl )
		{
			System.out.println(f);
		}

			Method[] mth=	cls.getMethods();
		System.out.println("Method are "+mth);
		for(Method m:mth )
		{
			System.out.println(m);
		}
		
		System.out.println("Super Class "+cls.getSuperclass());
		System.out.println("Interface "+cls.getInterfaces());
	}

}
