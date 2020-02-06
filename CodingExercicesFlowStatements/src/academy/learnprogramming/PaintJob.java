package academy.learnprogramming;

public class PaintJob {
    public static int getBucketCount (double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        } else {
            double wall = width * height;
            double areaHome = areaPerBucket * extraBuckets;
            double diff = wall - areaHome;
            return (int)(Math.ceil(diff / areaPerBucket));
        }
    }
    public static int getBucketCount (double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            return (int)(Math.ceil(width * height / areaPerBucket));
        }
    }
    public static int getBucketCount (double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            return (int)(Math.ceil(area / areaPerBucket));
        }
    }
}
