package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: o.yLn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56604yLn implements Function0 {
    public static int KWHzl;
    public static int OLrzqt;
    public final C56607yLq copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C56604yLn(C56607yLq c56607yLq) {
        this.copydefault = c56607yLq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.jvm.functions.Function0
    public java.lang.Object invoke() {
        return C56607yLq.KWHzl(this.copydefault);
    }

    public static int EZpvd() {
        int i = OLrzqt;
        int i2 = i % 8057990;
        OLrzqt = i + 1;
        if (i2 != 0) {
            return KWHzl;
        }
        int iFreeMemory = (int) java.lang.Runtime.getRuntime().freeMemory();
        KWHzl = iFreeMemory;
        return iFreeMemory;
    }
}
