package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: o.cxQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12989cxQ implements InterfaceC58229yxO {
    public static int AEQbTJ;
    public static int EZpvd;
    public final /* synthetic */ Function1 copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [o.cxL.gEmmrt(o.cuH):o.yxt<kotlin.Pair<com.okinc.business.defi.biz.database.wallet.entity.RootWalletEntity, java.util.List<com.okinc.business.defi.biz.database.wallet.entity.RootWalletEntity>>>] */
    public /* synthetic */ C12989cxQ(Function1 function1) {
        this.copydefault = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC58229yxO
    public final java.lang.Object apply(java.lang.Object obj) {
        return AbstractC12984cxL.AkhnZx(this.copydefault, obj);
    }

    public static int KWHzl() {
        int i = EZpvd;
        int i2 = i % 9385389;
        EZpvd = i + 1;
        if (i2 != 0) {
            return AEQbTJ;
        }
        int elapsedCpuTime = (int) android.os.Process.getElapsedCpuTime();
        AEQbTJ = elapsedCpuTime;
        return elapsedCpuTime;
    }
}
