package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: o.dhO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14220dhO implements InterfaceC58229yxO {
    public static int AEQbTJ;
    public static int EZpvd;
    public final /* synthetic */ Function1 copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [o.dfo.EZpvd(java.lang.String, long, java.lang.String):o.yxt<java.lang.String>] */
    public /* synthetic */ C14220dhO(Function1 function1) {
        this.copydefault = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC58229yxO
    public final java.lang.Object apply(java.lang.Object obj) {
        return C14140dfo.DaRZkR(this.copydefault, obj);
    }

    public static int OLrzqt() {
        int i = AEQbTJ;
        int i2 = i % 6224292;
        AEQbTJ = i + 1;
        if (i2 != 0) {
            return EZpvd;
        }
        int iElapsedRealtime = (int) android.os.SystemClock.elapsedRealtime();
        EZpvd = iElapsedRealtime;
        return iElapsedRealtime;
    }
}
