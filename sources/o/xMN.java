package o;

/* JADX INFO: loaded from: classes17.dex */
public final class xMN {
    public static final java.lang.String KWHzl(long j) {
        java.lang.String strValueOf;
        java.lang.String strValueOf2;
        java.lang.String strValueOf3;
        if (j <= 0) {
            return "00:00:00";
        }
        long j2 = 3600000;
        long j3 = j / j2;
        long j4 = 60000;
        long j5 = (j % j2) / j4;
        long j6 = (j % j4) / ((long) 1000);
        if (j3 >= 10) {
            strValueOf = java.lang.String.valueOf(j3);
        } else {
            strValueOf = "0" + j3;
        }
        if (j5 >= 10) {
            strValueOf2 = java.lang.String.valueOf(j5);
        } else {
            strValueOf2 = "0" + j5;
        }
        if (j6 >= 10) {
            strValueOf3 = java.lang.String.valueOf(j6);
        } else {
            strValueOf3 = "0" + j6;
        }
        return strValueOf + ":" + strValueOf2 + ":" + strValueOf3;
    }
}
