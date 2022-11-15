/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later.
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.annotations.common.test.reflection.java.generics;


public class MultipleBoundWithClass<T extends String & MultipleBoundWithClass.Bound> {
	T genericType;

	public T getGenericType(){
		return genericType;
	}

	public interface Bound{

	}
}
