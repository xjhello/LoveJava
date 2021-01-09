import com.sun.org.apache.xml.internal.resolver.readers.ExtendedXMLCatalogReader;
import src.mian.java.com.xj.demo.Demo2;

import java.util.ArrayList;
import java.util.List;

public class Man {
    public static int getTopFace(int driveunitHeading, int bucketHeading) {
        final int THRESHOLD = 1500;

        int bucketAngleOffset = 9000;
        int bucketHeadingAfterCompensation = bucketHeading + bucketAngleOffset;

        bucketHeadingAfterCompensation = bucketHeadingAfterCompensation % 36000;
        if (bucketHeadingAfterCompensation < 0) {
            bucketHeadingAfterCompensation = bucketHeadingAfterCompensation + 36000;
        }
        int bucket2Driveunit = 0;
        int delta1 = Math.abs(bucketHeadingAfterCompensation);
        int delta2 = Math.abs(bucketHeadingAfterCompensation - 9000);
        int delta3 = Math.abs(bucketHeadingAfterCompensation - 18000);
        int delta4 = Math.abs(bucketHeadingAfterCompensation - 27000);
        int delta5 = Math.abs(bucketHeadingAfterCompensation - 36000);

        if (delta1 < THRESHOLD || delta5 < THRESHOLD) {
            bucket2Driveunit = 0;
        } else if (delta2 < THRESHOLD) {
            bucket2Driveunit = 27000;
        } else if (delta3 < THRESHOLD) {
            bucket2Driveunit = 18000;
        } else if (delta4 < THRESHOLD) {
            bucket2Driveunit = 9000;
        } else {
            return 0;
        }

        int bucketActualFace = 0;
        int bucketActualHeading = bucket2Driveunit + driveunitHeading;

        bucketActualHeading = bucketActualHeading % 36000;
        if (bucketActualHeading < 0) {
            bucketActualHeading = bucketActualHeading + 36000;
        }

        delta1 = Math.abs(bucketActualHeading);
        delta2 = Math.abs(bucketActualHeading - 9000);
        delta3 = Math.abs(bucketActualHeading - 18000);
        delta4 = Math.abs(bucketActualHeading - 27000);
        delta5 = Math.abs(bucketActualHeading - 36000);

        if (delta1 < THRESHOLD || delta5 < THRESHOLD) {
            bucketActualFace = 4;
        } else if (delta2 < THRESHOLD) {
            bucketActualFace = 1;
        } else if (delta3 < THRESHOLD) {
            bucketActualFace = 2;
        } else if (delta4 < THRESHOLD) {
            bucketActualFace = 3;
        }
        return bucketActualFace;
    }

    public static void main(String[] args) {
        int a = -8899;
        System.out.println(getTopFace(a,0));
    }
}
