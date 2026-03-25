package o;

import java.math.BigDecimal;

/* JADX INFO: renamed from: o.mxA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@java.lang.Deprecated
public class C33471mxA {
    public static double AEQbTJ(double d, int i) {
        double dPow = (int) java.lang.Math.pow(10.0d, i);
        return AEQbTJ(java.lang.Math.floor(EZpvd(d, dPow)), dPow, i);
    }

    public static double KWHzl(double d, double d2) {
        return new BigDecimal(java.lang.Double.toString(d)).add(new BigDecimal(java.lang.Double.toString(d2))).doubleValue();
    }

    public static double EZpvd(double d, double d2) {
        return new BigDecimal(java.lang.Double.toString(d)).multiply(new BigDecimal(java.lang.Double.toString(d2))).doubleValue();
    }

    public static double AEQbTJ(double d, double d2, int i) {
        return new BigDecimal(java.lang.Double.toString(d)).divide(new BigDecimal(java.lang.Double.toString(d2)), i, 4).doubleValue();
    }

    public static double copydefault(double d, double d2, int i) {
        return new BigDecimal(java.lang.Double.toString(d)).divide(new BigDecimal(java.lang.Double.toString(d2)), i, 2).doubleValue();
    }

    public static double KWHzl(double d, double d2, int i) {
        return new BigDecimal(java.lang.Double.toString(d)).divide(new BigDecimal(java.lang.Double.toString(d2)), i, 3).doubleValue();
    }

    public static double KWHzl(double d, int i) {
        double dPow = (int) java.lang.Math.pow(10.0d, i);
        return AEQbTJ(java.lang.Math.ceil(EZpvd(d, dPow)), dPow, i);
    }
}
