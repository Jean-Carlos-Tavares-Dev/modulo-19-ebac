package br.com.jcarlos.reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AppReflections {

	public static void main (String args []) {
		 Class clas = Produto.class;
		 System.out.println(clas);
		 
		 try {
			 
			 Constructor cons = clas.getConstructor();
			 Produto prod1  = (Produto) cons.newInstance();
			 System.out.println(cons);
			 System.out.println(prod1);
			 
			 Field [] fields = prod1.getClass().getDeclaredFields();
			 for  (Field  field: fields ) {				 
				 Class <?> type=field.getType();
				 String nome = field.getName();
				 System.out.println(type);
				 System.out.println(nome );
			 }
			 Method [] methods = prod1.getClass().getDeclaredMethods();
			 for  (Method  m : methods ) {				 
				 Class <?> type= m.getReturnType();
				 String nome = m.getName();
				 System.out.println(type);
				 System.out.println(nome );
				 
				 System.out.println("Executando metodos");
				 if (m.getName().startsWith("get")) {
					 System.out.println(m.invoke(prod1));
					 }else {
						 for (Class classesTypes:m.getParameterTypes()) {
							 if (classesTypes.equals(String.class)) {
									System.out.println(m.invoke(prod1, "Jean")); 
								 } else if (classesTypes.equals(Long.class)) {
									System.out.println(m.invoke(prod1, 1L)); 
								 } else {
									 System.out.println(m.invoke(prod1, 2D));
								 }
							 }
						 }
					 }
				 
						 }
								 
		  catch (NoSuchMethodException e) { 
		
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
}
