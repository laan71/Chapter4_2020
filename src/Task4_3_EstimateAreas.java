public class Task4_3_EstimateAreas {

    /* Use the GPS locations for Atlanta, Georgia; Orlando,
Florida; Savannah, Georgia; and Charlotte, North Carolina in the figure in Section
4.1 to compute the estimated area enclosed by these four cities. (Hint: Use the
formula in Programming Exercise 4.2 to compute the distance between two cities.
Divide the polygon into two triangles and use the formula in Programming Exercise
2.19 to compute the area of a triangle.) */

    public static void main(String[] args) {

        Location atlanta = new Location(33.7405800, -84.5545400);
        Location orlando = new Location(28.4115300, -81.5250400);
        Location savannah = new Location(32.1672300, -81.1998900);
        Location charlotte = new Location(35.2072400, -80.9567600);

        double area = Location.areaOfThreeLocations(atlanta, charlotte, savannah) +
                Location.areaOfThreeLocations(atlanta, savannah, orlando);

        System.out.println("The area included in Atlanta (GA), " +
                "Orlando (FL), Savannah (GA), and Charlotte (NC) is " + area + " sq km");
    }

    private static class Location {
        private double latitude;
        private double longitude;

        public Location(double latitude, double longitude) {
            this.latitude = latitude;
            this.longitude = longitude;
        }

        public double getLatitude() {
            return latitude;
        }

        public double getLongitude() {
            return longitude;
        }

        public static double gcDistance(Location a, Location b) {
            double x1 = Math.toRadians(a.getLatitude());
            double y1 = Math.toRadians(a.getLongitude());
            double x2 = Math.toRadians(b.getLatitude());
            double y2 = Math.toRadians(b.getLongitude());

            final double RADIUS = 6371.01;
            double d = RADIUS * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) *
                    Math.cos(x2) * Math.cos(y1 - y2));

            return d;
        }

        public static double areaOfThreeLocations(Location a, Location b, Location c) {
            double s1 = gcDistance(a, b);
            double s2 = gcDistance(b, c);
            double s3 = gcDistance(c, a);
            double s = (s1 + s2 + s3) / 2.0;
            return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
        }
    }



}
