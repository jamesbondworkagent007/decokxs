package o;

/* JADX INFO: loaded from: classes9.dex */
public final class pDO {
    public static final pDO copydefault = new pDO();

    private pDO() {
    }

    public final java.lang.String EZpvd(long j) {
        java.lang.String strDivS$default = C33129mqd.divS$default(java.lang.Double.valueOf(C33129mqd.divD$default(java.lang.Double.valueOf(C33129mqd.divD$default(java.lang.Long.valueOf(j), 60, null, null, null, 14, null)), 60, null, null, null, 14, null)), 24, 0, null, null, 12, null);
        if (C33129mqd.gEmmrt(strDivS$default, 10)) {
            strDivS$default = "0" + strDivS$default;
        }
        if (!C33129mqd.valueOf(strDivS$default, "0")) {
            return strDivS$default;
        }
        return "00";
    }

    public final java.lang.String copydefault(long j) {
        java.lang.String strRemS$default = C33129mqd.remS$default(java.lang.Double.valueOf(C33129mqd.divD$default(java.lang.Double.valueOf(C33129mqd.divD$default(java.lang.Long.valueOf(j), 60, null, null, null, 14, null)), 60, null, null, null, 14, null)), 24, 0, null, null, 12, null);
        if (C33129mqd.gEmmrt(strRemS$default, 10)) {
            strRemS$default = "0" + strRemS$default;
        }
        if (!C33129mqd.valueOf(strRemS$default, "0")) {
            return strRemS$default;
        }
        return "00";
    }

    public final java.lang.String OLrzqt(long j) {
        java.lang.String strRemS$default = C33129mqd.remS$default(java.lang.Double.valueOf(C33129mqd.divD$default(java.lang.Long.valueOf(j), 60, null, null, null, 14, null)), 60, 0, null, null, 12, null);
        if (C33129mqd.gEmmrt(strRemS$default, 10)) {
            strRemS$default = "0" + strRemS$default;
        }
        if (!C33129mqd.valueOf(strRemS$default, "0")) {
            return strRemS$default;
        }
        return "00";
    }

    public final java.lang.String KWHzl(long j) {
        java.lang.String strRemS$default = C33129mqd.remS$default(java.lang.Long.valueOf(j), 60, 0, null, null, 12, null);
        if (C33129mqd.gEmmrt(strRemS$default, 10)) {
            strRemS$default = "0" + strRemS$default;
        }
        if (!C33129mqd.valueOf(strRemS$default, "0")) {
            return strRemS$default;
        }
        return "00";
    }
}
