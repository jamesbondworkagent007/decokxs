package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: o.pwC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C39638pwC implements Function1 {
    public static int AEQbTJ;
    public static int copydefault;
    public final /* synthetic */ C39678pwq EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [o.pwq.KWHzl(o.xLw):void] */
    public /* synthetic */ C39638pwC(C39678pwq c39678pwq) {
        this.EZpvd = c39678pwq;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.pwq.KWHzl(o.pwq, boolean):kotlin.Unit */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        return C39678pwq.AEQbTJ(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
    }

    public static int OLrzqt() {
        int i = copydefault;
        int i2 = i % 6114288;
        copydefault = i + 1;
        if (i2 != 0) {
            return AEQbTJ;
        }
        int iMyTid = android.os.Process.myTid();
        AEQbTJ = iMyTid;
        return iMyTid;
    }
}
