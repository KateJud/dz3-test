/**
 * Copyright (c) 2009 ISP RAS.
 * 109004, A. Solzhenitsina, 25, Moscow, Russia.
 * All rights reserved.
 * <p>
 * $Id$
 * Created on Dec 22, 2015
 */

package root.gcd;

/**
 * @author Victor Kuliamin
 */
//Changed
public class GCD {
    public long gcd(int x, int y) {
        long t;
        long xTemp = x;
        long yTemp = y;
        if (xTemp < 0) {
            xTemp = -xTemp;
        }
        if (yTemp < 0) {
            yTemp = -yTemp;
        }


        while (yTemp != 0) {
            if (yTemp > xTemp) {
                xTemp = yTemp - xTemp;
                yTemp = yTemp - xTemp;
                xTemp = xTemp + yTemp;
            }

            if (yTemp == 0) {
                return xTemp;
            }

            t = yTemp;
            yTemp = xTemp % yTemp;
            xTemp = t;
        }
        return xTemp;
    }


}
