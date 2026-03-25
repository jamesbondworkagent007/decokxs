package o;

import com.okinc.business.defi.biz.core.tx.speedup.bean.UTXOSpeedUpInfoBean;

/* JADX INFO: renamed from: o.cnl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C12482cnl extends AbstractC12484cnn {
    @Override // o.AbstractC12413cmV
    public int fIwbmz() {
        return 1;
    }

    @Override // o.AbstractC12413cmV
    public int values() {
        return 2;
    }

    @Override // o.AbstractC12413cmV
    public java.lang.String fARcdN() {
        java.lang.String from;
        UTXOSpeedUpInfoBean uTXOSpeedUpInfoBeanFJNWhG = fJNWhG();
        return (uTXOSpeedUpInfoBeanFJNWhG == null || (from = uTXOSpeedUpInfoBeanFJNWhG.getFrom()) == null) ? "" : from;
    }
}
