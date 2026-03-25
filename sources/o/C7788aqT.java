package o;

import o.C7343ahz;

/* JADX INFO: renamed from: o.aqT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7788aqT {
    public static java.lang.String AEQbTJ = null;
    public static C7791aqW KWHzl = null;
    public static int OLrzqt = 8172;
    public static boolean copydefault = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static C7791aqW AEQbTJ() {
        return KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean EZpvd() {
        return copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int KWHzl() {
        return OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void copydefault(C7791aqW c7791aqW) {
        KWHzl = c7791aqW;
    }

    public static java.lang.String copydefault() {
        if (AEQbTJ == null) {
            InterfaceC7341ahx interfaceC7341ahxEZpvd = C7323ahf.EZpvd();
            AEQbTJ = interfaceC7341ahxEZpvd.OLrzqt("debugIp", "172.16.39.13");
            OLrzqt = java.lang.Integer.parseInt(interfaceC7341ahxEZpvd.OLrzqt("debugPort", OLrzqt + ""));
        }
        return AEQbTJ;
    }

    public static void OLrzqt(java.lang.String str) {
        AEQbTJ = str;
        C7323ahf.EZpvd().EZpvd("debugIp", str);
    }

    public static void OLrzqt(int i) {
        OLrzqt = i;
        C7323ahf.EZpvd().EZpvd("debugPort", i + "");
    }

    public static void EZpvd(boolean z, android.content.Context context) {
        if (z) {
            C7323ahf.fIwbmz().copydefault(context.getString(C7343ahz.Fragment.OLrzqt));
        }
        copydefault = z;
    }

    public static boolean OLrzqt() {
        C7791aqW c7791aqW = KWHzl;
        return c7791aqW != null && c7791aqW.AkhnZx();
    }
}
