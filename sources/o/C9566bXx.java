package o;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: o.bXx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C9566bXx implements InterfaceC58223yxI {
    public static int AEQbTJ;
    public static int EZpvd;
    public final /* synthetic */ Function2 copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [o.bWL.OLrzqt(java.util.Map<java.lang.Integer, kotlin.Pair<java.lang.String, java.lang.String>>, java.util.Map<java.lang.Integer, java.lang.String>, java.util.Map<java.lang.Integer, kotlin.Pair<java.lang.String, java.lang.String>>):o.yxt<kotlin.Unit>] */
    public /* synthetic */ C9566bXx(Function2 function2) {
        this.copydefault = function2;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.bWL.EZpvd(kotlin.jvm.functions.Function2, java.lang.Object, java.lang.Object):kotlin.Unit */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC58223yxI
    public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
        return C9475bWL.copydefault(this.copydefault, obj, obj2);
    }

    public static int OLrzqt() {
        int i = AEQbTJ;
        int i2 = i % 5542200;
        AEQbTJ = i + 1;
        if (i2 != 0) {
            return EZpvd;
        }
        int iUptimeMillis = (int) android.os.SystemClock.uptimeMillis();
        EZpvd = iUptimeMillis;
        return iUptimeMillis;
    }
}
