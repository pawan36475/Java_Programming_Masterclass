import java.util.*;

public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        double need, have, val = 0;
        int req;
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        } else {
            need = width * height;
            have = areaPerBucket * extraBuckets;
            val = need - have;
            req = (int) Math.ceil(val / areaPerBucket);
        }
        return req;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        int val;
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            val = (int) Math.ceil(area / areaPerBucket);
            return val;
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        int req = 0;
        double need, val = 0;
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            need = width * height;
            req = (int) Math.ceil(need / areaPerBucket);
        }
        return req;
    }


    public static void main(String[] args) {
        System.out.println(getBucketCount(-7.25, 4.3, 2.35));
    }
}
