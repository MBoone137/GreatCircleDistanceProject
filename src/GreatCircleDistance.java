public class GreatCircleDistance {

    public double getDistance(double x1, double y1, double x2, double y2){
        double distance = 6371.01 * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

        return distance;

    }
}
