package o;

/* JADX INFO: loaded from: classes5.dex */
public final class gFJ {
    public static final gFJ KWHzl = new gFJ();

    private gFJ() {
    }

    public final boolean KWHzl(java.lang.String str, java.lang.String str2, java.lang.Integer num) {
        if (C33129mqd.OLrzqt(str, "0")) {
            return false;
        }
        if (str2 == null) {
            str2 = "";
        }
        return C33129mqd.gEmmrt(str2, str != null ? C54869xYi.weiToGwei$default(str, num, false, null, false, 12, null) : null);
    }

    public final boolean AEQbTJ(java.lang.String str, java.lang.String str2) {
        if (C33129mqd.OLrzqt(str, "0")) {
            return false;
        }
        return C33129mqd.gEmmrt(str2, str);
    }

    public final boolean OLrzqt(java.lang.String str, java.lang.String str2) {
        if (C33129mqd.OLrzqt(str, "0")) {
            return false;
        }
        return C33129mqd.AEQbTJ(str2, str);
    }

    public final boolean OLrzqt(java.lang.String str) {
        return C33129mqd.valueOf(str, "0");
    }
}
