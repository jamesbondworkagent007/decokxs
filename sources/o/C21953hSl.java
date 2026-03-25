package o;

import com.okinc.business.dexlogic.main.market.detail.MarketCoinDetailViewModel;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.library.data.ChartViewOutSideConfig;
import com.okinc.rxutils.RxBus;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import o.oKD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hSl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21953hSl implements oKD {
    public final int AEQbTJ;
    public final MarketCoinDetailViewModel EZpvd;
    public final WeakReference<C36250oUv> OLrzqt;
    public final int copydefault;

    @Override // o.oKD
    public void AhwBna(boolean z) {
    }

    @Override // o.oKD
    public void KWHzl(boolean z) {
    }

    public C21953hSl(WeakReference<C36250oUv> weakReference, @NotNull MarketCoinDetailViewModel marketCoinDetailViewModel, int i, int i2) {
        Intrinsics.checkNotNullParameter(marketCoinDetailViewModel, "");
        this.OLrzqt = weakReference;
        this.EZpvd = marketCoinDetailViewModel;
        this.AEQbTJ = i;
        this.copydefault = i2;
    }

    @Override // o.oKD
    public void AEQbTJ(boolean z) {
        oKD.TaskDescription.OLrzqt(this, z);
    }

    @Override // o.oKD
    public void EZpvd() {
        oKD.TaskDescription.OLrzqt(this);
    }

    @Override // o.oKD
    public void EZpvd(boolean z) {
        oKD.TaskDescription.copydefault(this, z);
    }

    @Override // o.oKD
    public void KWHzl(long j) {
        oKD.TaskDescription.OLrzqt(this, j);
    }

    @Override // o.oKD
    public void OLrzqt() {
        oKD.TaskDescription.copydefault(this);
    }

    @Override // o.oKD
    public void valueOf(boolean z) {
        oKD.TaskDescription.AEQbTJ(this, z);
    }

    @Override // o.oKD
    public void OLrzqt(boolean z) {
        WeakReference<C36250oUv> weakReference;
        C36250oUv c36250oUv;
        C36250oUv c36250oUv2;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        SPUtils.put("chart_countdown", java.lang.Boolean.valueOf(z));
        WeakReference<C36250oUv> weakReference2 = this.OLrzqt;
        if (weakReference2 != null && (c36250oUv2 = weakReference2.get()) != null && (chartViewOutSideConfigAkhnZx = c36250oUv2.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setShowCountdown(z);
        }
        KWHzl(this.OLrzqt);
        if (!z || (weakReference = this.OLrzqt) == null || (c36250oUv = weakReference.get()) == null) {
            return;
        }
        c36250oUv.QKVWgx();
    }

    @Override // o.oKD
    public void copydefault(boolean z) {
        C36250oUv c36250oUv;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        this.EZpvd.copydefault("key_kline_market_show_current_order", java.lang.Boolean.valueOf(z), "dex_market");
        WeakReference<C36250oUv> weakReference = this.OLrzqt;
        if (weakReference != null && (c36250oUv = weakReference.get()) != null && (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setMShowCurrentOrder(z);
        }
        KWHzl(this.OLrzqt);
    }

    @Override // o.oKD
    public void djBIcL(boolean z) {
        C36250oUv c36250oUv;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        C36250oUv c36250oUv2;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        C21952hSk.copydefault.OLrzqt(z);
        WeakReference<C36250oUv> weakReference = this.OLrzqt;
        if (weakReference != null && (c36250oUv2 = weakReference.get()) != null && (chartViewOutSideConfigAkhnZx2 = c36250oUv2.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx2.setMShowHistoryOrder(z);
        }
        WeakReference<C36250oUv> weakReference2 = this.OLrzqt;
        if (weakReference2 != null && (c36250oUv = weakReference2.get()) != null && (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setMChartOffsetInit(false);
        }
        KWHzl(this.OLrzqt);
    }

    @Override // o.oKD
    public void KWHzl() {
        this.EZpvd.isConnected().setValue(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, java.lang.Integer.valueOf(this.copydefault)));
    }

    @Override // o.oKD
    public void EZpvd(float f) {
        C36250oUv c36250oUv;
        WeakReference<C36250oUv> weakReference = this.OLrzqt;
        if (weakReference == null || (c36250oUv = weakReference.get()) == null) {
            return;
        }
        c36250oUv.setMinimumHeight((int) (this.AEQbTJ * (f + 1.0f)));
    }

    @Override // o.oKD
    public void copydefault() {
        RxBus.KWHzl("kline_full_screen");
    }

    @Override // o.oKD
    public void AYXKKw(boolean z) {
        C36250oUv c36250oUv;
        WeakReference<C36250oUv> weakReference = this.OLrzqt;
        if (weakReference != null && (c36250oUv = weakReference.get()) != null) {
            c36250oUv.AEQbTJ(z);
        }
        KWHzl(this.OLrzqt);
    }

    @Override // o.oKD
    public void gEmmrt(boolean z) {
        C36250oUv c36250oUv;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        C36250oUv c36250oUv2;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        this.EZpvd.copydefault("key_kline_market_show_avg_line", java.lang.Boolean.valueOf(z), "dex_market");
        WeakReference<C36250oUv> weakReference = this.OLrzqt;
        if (weakReference != null && (c36250oUv2 = weakReference.get()) != null && (chartViewOutSideConfigAkhnZx2 = c36250oUv2.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx2.setShowSpotAveragePrice(z);
        }
        WeakReference<C36250oUv> weakReference2 = this.OLrzqt;
        if (weakReference2 != null && (c36250oUv = weakReference2.get()) != null && (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setMChartOffsetInit(false);
        }
        KWHzl(this.OLrzqt);
    }

    public final void KWHzl(WeakReference<C36250oUv> weakReference) {
        C36250oUv c36250oUv;
        C36250oUv c36250oUv2;
        if (weakReference != null && (c36250oUv2 = weakReference.get()) != null) {
            c36250oUv2.QfsBiF();
        }
        if (weakReference == null || (c36250oUv = weakReference.get()) == null) {
            return;
        }
        c36250oUv.invalidate();
    }
}
