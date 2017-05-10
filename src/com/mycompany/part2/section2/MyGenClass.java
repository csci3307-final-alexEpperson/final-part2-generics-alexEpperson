/**
 * 
 */
package com.mycompany.part2.section2;

/**
 * @author green
 *
 */
public class MyGenClass<K,V> implements MyGenInterface<K, V>
{
	protected K key;
	protected V value;
	public MyGenClass(K _key, V _value)
	{
		this.key = _key;
		this.value = _value;
	}
	public K getKey() 
	{
		return this.key;
	}
	public V getValue()
	{
		return this.value;
	}
	
}
