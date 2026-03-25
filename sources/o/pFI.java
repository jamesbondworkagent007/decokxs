package o;

/* JADX INFO: loaded from: classes9.dex */
public class pFI {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static java.lang.String AEQbTJ(int i) {
        return i == 0 ? "MARGIN" : i == 1 ? "SPOT" : i == 2 ? "FUTURES" : i == 3 ? "SWAP" : i == 5 ? "OPTION" : "ANY";
    }

    public static int KWHzl(java.lang.String str) {
        if (str.equals("SPOT")) {
            return 1;
        }
        if (str.equals("MARGIN")) {
            return 0;
        }
        if (str.equals("SWAP")) {
            return 3;
        }
        if (str.equals("FUTURES")) {
            return 2;
        }
        return str.equals("OPTION") ? 5 : 0;
    }

    public static java.lang.String AEQbTJ(int i, java.lang.String str) {
        if (i == 0 || i == 1) {
            return C37876pDz.copydefault(str.replace("-", "_"));
        }
        if (i == 2) {
            return C37874pDx.EZpvd.EZpvd(str, "FUTURES", false, false);
        }
        if (i != 3) {
            return i != 5 ? "" : C37874pDx.EZpvd.EZpvd(str, "OPTION", true, false);
        }
        return C37874pDx.EZpvd.EZpvd(str, "SWAP", false, false);
    }

    public static java.lang.String copydefault(int i, java.lang.String str) {
        if (i == 0 || i == 1) {
            return C37876pDz.copydefault(str.replace("-", "_"));
        }
        if (i == 2) {
            return C37874pDx.EZpvd.copydefault(str, "FUTURES", false);
        }
        if (i != 3) {
            return i != 5 ? "" : C37874pDx.EZpvd.copydefault(str, "OPTION", true);
        }
        return C37874pDx.EZpvd.copydefault(str, "SWAP", false);
    }

    public static java.lang.String AEQbTJ(int i, java.lang.String str, boolean z) {
        if (i == 2) {
            return C37874pDx.EZpvd.OLrzqt(str, "FUTURES", false, z);
        }
        if (i != 3) {
            return i != 5 ? "" : C37874pDx.EZpvd.OLrzqt(str, "OPTION", true, z);
        }
        return C37874pDx.EZpvd.OLrzqt(str, "SWAP", false, z);
    }
}
