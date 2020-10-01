import java.util.Scanner;


public class HowFarAway 
{
    public static void main(String[] args)
    {

      //Gathering input for computing
      Scanner input = new Scanner(System.in); 
      double startLat = input.nextDouble();
      double startLong = input.nextDouble();
      double endLat = input.nextDouble();
      double endLong = input.nextDouble();

      //geolocating stuff
      GeoLocation start = new GeoLocation(startLat, startLong);
      GeoLocation end = new GeoLocation(endLat, endLong);
      double distance = start.distanceFrom(end);
      System.out.print(distance);

    }
}