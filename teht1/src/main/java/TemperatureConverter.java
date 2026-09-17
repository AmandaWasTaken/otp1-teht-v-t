public class TemperatureConverter {
	
	public double  fahrenheitToCelsius (double f) { return (f - 32) * 5.0/9.0;    }
	public double  celsiusToFahrenheit (double c) { return (c * 9.0/5.0) + 32;    }
	public boolean isExtremeTemperature(double c) { return c < -40 || c > 50; 	  }
	public double  kelvinToCelsius	   (double k) { return k - 273.15; 			  }
}

