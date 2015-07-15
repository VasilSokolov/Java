import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import sun.util.BuddhistCalendar;


public abstract class Factory implements Serialize  /*...*/ {
	
	@SuppressWarnings("unused")
	private boolean sharedZone;

	public static Factory getInstance() {
		Factory cal = createCalendar(
				TimeZone.getDefault(),
				Locale.getDefault());
		cal.sharedZone = true;
		return cal;
	}

	private static Factory createCalendar(TimeZone zone, Locale aLocale) {
		//if the specified locale is a Thai locale,
		//return BuddhistCalendar instance.
		
		if ("th".equals(aLocale.getLanguage())
				&&("TH".equals(aLocale.getCountry()))) {
			return new sun.util.BuddhistCalendar(zone, aLocale);
		} else if ("JP".equals(aLocale.getVariant())
				&&("JP".equals(aLocale.getCountry())
				&&("ja".equals(aLocale.getLanguage()))) {
			return new JapanesImperialCalendar(zone, aLocale)
		}

		//else create the default calendar
		
		return new GregorianCalendar(zone, aLocale);
	} 
	
	
}
