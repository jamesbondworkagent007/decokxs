package o;

/* JADX INFO: renamed from: o.the, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46993the {
    public static boolean KWHzl;
    public static boolean OLrzqt;
    public static boolean valueOf;
    public static final C46993the copydefault = new C46993the();
    public static final java.lang.String AEQbTJ = "PushVerify";
    public static pUV AhwBna = new pUV("PushVerify", false, false, false, 14, null);
    public static final int EZpvd = 8;

    private C46993the() {
    }

    public final void copydefault(boolean z) {
        if (OLrzqt) {
            return;
        }
        if (z) {
            AhwBna.copydefault("Push bind pass");
            OLrzqt = true;
        } else {
            AhwBna.EZpvd("Push bind fail");
        }
    }

    public final void EZpvd() {
        if (KWHzl) {
            return;
        }
        KWHzl = true;
        AhwBna.copydefault("JpushOnline receive pass");
    }

    public final void copydefault() {
        if (valueOf) {
            return;
        }
        valueOf = true;
        AhwBna.copydefault("OneSignal FCM receive pass");
    }
}
