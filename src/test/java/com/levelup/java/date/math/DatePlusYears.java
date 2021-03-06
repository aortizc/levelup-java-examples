package com.levelup.java.date.math;

import static org.junit.Assert.assertTrue;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;
import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.Test;

/**
 * This java example will demonstrate adding years to a date
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/examples/add-years-to-date/'>Add years to date</a>
 * 
 */
public class DatePlusYears {
	
	private static final Logger logger = Logger.getLogger(DatePlusYears.class);

	@Test
	public void add_years_to_date_in_java () {

		Calendar superBowlXLV = Calendar.getInstance();
		superBowlXLV.set(2011, 1, 6, 0, 0);
		
		Calendar fortyNinersSuck = Calendar.getInstance();
		fortyNinersSuck.setTimeInMillis(superBowlXLV.getTimeInMillis());
		fortyNinersSuck.add(Calendar.YEAR, 2);		
		
		SimpleDateFormat dateFormatter = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss z");

		logger.info(dateFormatter.format(superBowlXLV.getTime()));
		logger.info(dateFormatter.format(fortyNinersSuck.getTime()));

		assertTrue(fortyNinersSuck.after(superBowlXLV));
	}
	
	@Test
	public void add_years_to_date_in_java8() {

		LocalDateTime superBowlXLV = LocalDateTime.of(2011, Month.FEBRUARY, 6,
				0, 0);
		LocalDateTime fortyNinersSuck = superBowlXLV.plusYears(2);

		java.time.format.DateTimeFormatter formatter = java.time.format.DateTimeFormatter
				.ofPattern("MM/dd/yyyy HH:mm:ss S");

		logger.info(superBowlXLV.format(formatter));
		logger.info(fortyNinersSuck.format(formatter));

		assertTrue(fortyNinersSuck.isAfter(superBowlXLV));
	}
	
	@Test
	public void add_years_to_date_in_java_joda () {

		DateTime superBowlXLV = new DateTime(2011, 2, 6, 0, 0, 0, 0);
		DateTime fortyNinersSuck = superBowlXLV.plusYears(2);

		DateTimeFormatter fmt = DateTimeFormat.forPattern("MM/dd/yyyy HH:mm:ss z");
		
		logger.info(superBowlXLV.toString(fmt));
		logger.info(fortyNinersSuck.toString(fmt));

		assertTrue(fortyNinersSuck.isAfter(superBowlXLV));
	}

	@Test
	public void add_years_to_date_in_java_apachecommons () {

		Calendar superBowlXLV = Calendar.getInstance();
		superBowlXLV.set(2011, 1, 6, 0, 0);
		
		Date fortyNinersSuck = DateUtils.addYears(superBowlXLV.getTime(), 2);
		
		SimpleDateFormat dateFormatter = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss z");

		logger.info(dateFormatter.format(superBowlXLV.getTime()));
		logger.info(dateFormatter.format(fortyNinersSuck));

		assertTrue(fortyNinersSuck.after(superBowlXLV.getTime()));
	}

}
