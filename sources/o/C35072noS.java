package o;

import com.okinc.market.quotation.data.model.stock.StockListPo;
import kotlin.Unit;

/* JADX INFO: renamed from: o.noS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35072noS {
    public long AEQbTJ;
    public StockListPo EZpvd;
    public final java.lang.Object KWHzl = new java.lang.Object();
    public final long copydefault;

    public C35072noS(long j) {
        this.copydefault = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final StockListPo OLrzqt() {
        StockListPo stockListPo;
        synchronized (this.KWHzl) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            long j = this.AEQbTJ;
            stockListPo = this.EZpvd;
            if (stockListPo != null) {
                if (jCurrentTimeMillis - j >= this.copydefault) {
                    stockListPo = null;
                }
            }
        }
        return stockListPo;
    }

    public final long AEQbTJ() {
        long jCurrentTimeMillis;
        long j;
        synchronized (this.KWHzl) {
            jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            j = this.AEQbTJ;
        }
        return jCurrentTimeMillis - j;
    }

    public final void copydefault(StockListPo stockListPo) {
        synchronized (this.KWHzl) {
            this.EZpvd = stockListPo;
            this.AEQbTJ = java.lang.System.currentTimeMillis();
            Unit unit = Unit.INSTANCE;
        }
    }
}
