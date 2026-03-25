package o;

import com.okinc.business.defi.biz.core.tx.speedup.bean.UTXOSpeedUpInfoBean;

/* JADX INFO: renamed from: o.cos, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12540cos extends AbstractC12484cnn {
    @Override // o.AbstractC12413cmV
    public int values() {
        return 1;
    }

    @Override // o.AbstractC12413cmV
    public int fIwbmz() {
        java.lang.Integer txSource;
        UTXOSpeedUpInfoBean uTXOSpeedUpInfoBeanFJNWhG = fJNWhG();
        if (uTXOSpeedUpInfoBeanFJNWhG == null || (txSource = uTXOSpeedUpInfoBeanFJNWhG.getTxSource()) == null) {
            return 0;
        }
        return txSource.intValue();
    }

    @Override // o.AbstractC12413cmV
    public java.lang.String fARcdN() {
        return AhwBna();
    }
}
