package com.levelup.java;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.StringTokenizer;

import org.junit.Test;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;

/**
 * This java snippet will demonstrate splitting of a string based on a delimiter. 
 * 
 * It is likely if you are dealing with single field with multiple  
 * values such as select_139393_494949, you may need to parse string values.  
 * OR you want to iterate over a string to determine the number of times a word occurred.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/'>Split String Into Tokens</a>
 * 
 */
public class SplitStringsIntoTokens {

	private static final String CONSTANT_STRING = "The Dog goes woof, The cat goes meow, the cow says moo, the duck says quack";
	
	@Test
	public void split_string_using_stringtokenizer () {

		StringTokenizer stringTokenizer = new StringTokenizer(CONSTANT_STRING);
		
		int numberOfTokens = stringTokenizer.countTokens();
		
		assertTrue(numberOfTokens == 16);
	}
	
	@Test
	public void split_string_using_string_split () {
		String delims = "[ ]+";
		String[] tokens = CONSTANT_STRING.split(delims);
		
		assertTrue(tokens.length == 16);	
	}

	@Test
	public void split_string_using_guava () {
		
		List<String> elementsInString = Lists.newArrayList(Splitter.on(" ").split(CONSTANT_STRING));
		
		// elementsInString = [The, Dog, goes, woof,, The, cat, goes, meow,, the, cow, says, moo,, the, duck, says, quack]
		assertTrue(elementsInString.size() == 16);
	}
}
