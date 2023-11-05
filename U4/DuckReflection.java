// SPDX-FileCopyrightText: Ondřej Surý
//
// SPDX-License-Identifier: WTFPL

import DuckFactory.*;
import java.lang.Class;
import java.lang.reflect.*;
import java.util.List;

public class DuckReflection {
	private static void printClass(Class<?> obj) {
		System.out.print(obj.toGenericString());

		Class<?> superClass = obj.getSuperclass() ;
		if (superClass.getName() != "java.lang.Object") {
			System.out.print(" extends " + superClass.getName());
		}
		System.out.println();
	}

	private static void printMethods(Class<?> obj) {
		Method[] methods = obj.getDeclaredMethods();
		if (methods.length == 0) {
			return;
		}

		System.out.println("Methods:");
		for (Method m : methods) {
			System.out.println("  " + m.toGenericString());
		}
	}

	private static void printFields(Class<?> obj) {
		Field[] fields = obj.getDeclaredFields();
		if (fields.length == 0) {
			return;
		}

		System.out.println("Fields:");
		for (Field f : fields) {
			System.out.println("  " + f.toGenericString());
		}
	}

	private static void printInterfaces(Class<?> obj) {
		Class<?>[] interfaces = obj.getInterfaces();
		if (interfaces.length == 0) {
			return;
		}

		System.out.println("Interfaces:");
		for (Class<?> i : interfaces) {
			System.out.println("  " + i.toGenericString());
		}
	}

	public static void main(String args[]) {
		DuckFactoryProduce producer = new DuckFactoryProduce(new DuckFactory());

		List<String> ducks = List.of("wild", "lure", "rubber");

		for (String duckType : ducks) {
			Duck duck = producer.newDuck(duckType);

			System.out.println("Reflection on the " + duckType + " duck:");

			Class<?> obj = duck.getClass();

			printClass(obj);
			printMethods(obj);
			printFields(obj);
			printInterfaces(obj);

			System.out.println();
		}
	}
}

