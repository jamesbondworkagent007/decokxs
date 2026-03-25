package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: o.uxA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C49890uxA implements Function1 {
    public static int EZpvd;
    public static int copydefault;
    public final /* synthetic */ C49924uxi OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [o.uxi.AkhnZx():void] */
    public /* synthetic */ C49890uxA(C49924uxi c49924uxi) {
        this.OLrzqt = c49924uxi;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.uxi.KWHzl(o.uxi, java.util.List):kotlin.Unit */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        return C49924uxi.AEQbTJ(this.OLrzqt, (java.util.List) obj);
    }

    public static int KWHzl() {
        int i = EZpvd;
        int i2 = i % 5854568;
        EZpvd = i + 1;
        if (i2 != 0) {
            return copydefault;
        }
        int iMyUid = android.os.Process.myUid();
        copydefault = iMyUid;
        return iMyUid;
    }
}
