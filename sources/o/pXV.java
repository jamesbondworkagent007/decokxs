package o;

/* JADX INFO: loaded from: classes9.dex */
public final class pXV {
    public static volatile boolean AEQbTJ;

    public static final void KWHzl() {
        synchronized (pXV.class) {
            if (AEQbTJ) {
                return;
            }
            AEQbTJ = true;
            BlA.registerRetailTradingGlobalNativeApi(((pXU) C58114yvF.OLrzqt(C43246rlf.OLrzqt.valueOf(), pXU.class)).ixgjPv());
        }
    }
}
