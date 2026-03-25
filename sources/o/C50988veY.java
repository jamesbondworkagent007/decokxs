package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: o.veY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C50988veY implements Function0 {
    public static int KWHzl;
    public static int OLrzqt;
    public final /* synthetic */ C51045vfc EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [o.veP.AEQbTJ(o.vfc, kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.String>, java.lang.String, androidx.compose.runtime.Composer, int):void] */
    public /* synthetic */ C50988veY(C51045vfc c51045vfc) {
        this.EZpvd = c51045vfc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        return C50979veP.copydefault(this.EZpvd);
    }

    public static int KWHzl() {
        int i = KWHzl;
        int i2 = i % 7590172;
        KWHzl = i + 1;
        if (i2 != 0) {
            return OLrzqt;
        }
        int iNextInt = new java.util.Random().nextInt();
        OLrzqt = iNextInt;
        return iNextInt;
    }
}
