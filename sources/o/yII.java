package o;

/* JADX INFO: loaded from: classes13.dex */
public class yII extends yIM {
    public static int EZpvd(double d) {
        if (java.lang.Double.isNaN(d)) {
            throw new java.lang.IllegalArgumentException("Cannot round NaN value.");
        }
        if (d > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) java.lang.Math.round(d);
    }

    public static long copydefault(double d) {
        if (java.lang.Double.isNaN(d)) {
            throw new java.lang.IllegalArgumentException("Cannot round NaN value.");
        }
        return java.lang.Math.round(d);
    }

    public static int EZpvd(float f) {
        if (java.lang.Float.isNaN(f)) {
            throw new java.lang.IllegalArgumentException("Cannot round NaN value.");
        }
        return java.lang.Math.round(f);
    }

    public static long OLrzqt(float f) {
        return copydefault(f);
    }

    public static int AEQbTJ(int i) {
        return java.lang.Integer.signum(i);
    }

    public static int AEQbTJ(long j) {
        return java.lang.Long.signum(j);
    }
}
