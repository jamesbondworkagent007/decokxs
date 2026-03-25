package o;

import androidx.lifecycle.ViewModel;
import com.okinc.trade.manager.common.position.TradePositionManager;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.TradeMenuItemBean;
import com.okinc.unify_trade.trade.biz.BizInfoConfig;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uxG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC49896uxG extends ViewModel {
    public java.lang.String AEQbTJ;
    public BizInfoConfig EZpvd = BizInfoConfig.DefaultBizConfig.copydefault;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        java.lang.String str = this.OLrzqt;
        return str == null ? "" : str;
    }

    public boolean AEQbTJ(BizInstrument bizInstrument) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BizInfoConfig EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(java.lang.String str) {
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean EZpvd(@NotNull TradePositionManager.MarginModeType marginModeType) {
        Intrinsics.checkNotNullParameter(marginModeType, "");
        return false;
    }

    public boolean EZpvd(BizInstrument bizInstrument) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        java.lang.String str = this.copydefault;
        return str == null ? "" : str;
    }

    public void KWHzl(BizInstrument bizInstrument) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull BizInfoConfig bizInfoConfig) {
        Intrinsics.checkNotNullParameter(bizInfoConfig, "");
        this.EZpvd = bizInfoConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(java.lang.String str) {
        this.copydefault = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(java.lang.String str) {
        this.OLrzqt = str;
    }

    public final java.lang.String copydefault() {
        xLY xlyOLrzqt;
        java.lang.String str = this.AEQbTJ;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "margin_base")) {
            xLY xlyOLrzqt2 = xLX.OLrzqt(this.EZpvd);
            if (xlyOLrzqt2 != null) {
                return xlyOLrzqt2.djBIcL();
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "margin_quote") && (xlyOLrzqt = xLX.OLrzqt(this.EZpvd)) != null) {
            return xlyOLrzqt.OLrzqt();
        }
        return null;
    }

    public java.util.List<TradeMenuItemBean> OLrzqt(@NotNull java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> list, java.lang.String str, BizInstrument bizInstrument) {
        Intrinsics.checkNotNullParameter(list, "");
        java.lang.String second = list.get(0).getSecond();
        Intrinsics.checkNotNullExpressionValue(second, "");
        TradeMenuItemBean tradeMenuItemBean = new TradeMenuItemBean(second, Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) list.get(0).getFirst()), list.get(0).getFirst(), null, false, null, null, 0, false, null, 0, false, 0, null, null, 32760, null);
        java.lang.String second2 = list.get(1).getSecond();
        Intrinsics.checkNotNullExpressionValue(second2, "");
        return yDY.gEmmrt(tradeMenuItemBean, new TradeMenuItemBean(second2, Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) list.get(1).getFirst()), list.get(1).getFirst(), null, false, null, null, 0, false, null, 0, false, 0, null, null, 32760, null));
    }

    public void KWHzl(BizInstrument bizInstrument, @NotNull TradePositionManager.MarginModeType marginModeType) {
        Intrinsics.checkNotNullParameter(marginModeType, "");
        C55326xho.toastWithSuccessfulIcon$default(C33070mpX.AYXKKw(C55688xof.Application.ActivityResultRegistryLifecycleContainer), 0, 1, (java.lang.Object) null);
    }
}
