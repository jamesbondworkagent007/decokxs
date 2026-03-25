package o;

import androidx.lifecycle.LiveData;
import com.okinc.unify_trade.biz.DcdOrderReq;
import com.okinc.unify_trade.biz.StrategyReqGroup;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC56005xue;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xrs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55860xrs implements InterfaceC56005xue {
    public java.lang.String EZpvd = "";
    public java.lang.String KWHzl = "";
    public StrategyReqGroup OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(StrategyReqGroup strategyReqGroup) {
        this.OLrzqt = strategyReqGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }

    public java.lang.Void copydefault() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
    }

    @Override // o.InterfaceC56005xue
    public void EZpvd(@NotNull java.lang.Object obj) {
        InterfaceC56005xue.ActionBar.AEQbTJ(this, obj);
    }

    @Override // o.InterfaceC56005xue
    public /* synthetic */ LiveData OLrzqt() {
        return (LiveData) copydefault();
    }

    @Override // o.InterfaceC56005xue
    public java.util.List<java.lang.Object> AEQbTJ() {
        java.lang.String expiryTime;
        DcdOrderReq dcdReq;
        java.lang.String str = this.EZpvd;
        java.lang.String str2 = this.KWHzl;
        StrategyReqGroup strategyReqGroup = this.OLrzqt;
        if (strategyReqGroup == null || (dcdReq = strategyReqGroup.getDcdReq()) == null || (expiryTime = dcdReq.getExpiryTime()) == null) {
            expiryTime = "";
        }
        C55855xrn c55855xrn = new C55855xrn(str, str2, expiryTime);
        StrategyReqGroup strategyReqGroup2 = this.OLrzqt;
        return c55855xrn.KWHzl(strategyReqGroup2 != null ? strategyReqGroup2.getDcdReq() : null);
    }

    public java.lang.String valueOf() {
        java.lang.String upperCase = TaskDescription.AEQbTJ(this.EZpvd).AEQbTJ().toUpperCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return upperCase;
    }

    @Override // o.InterfaceC56005xue
    public java.lang.String KWHzl() {
        java.lang.String notional;
        DcdOrderReq dcdReq;
        xMR xmr = xMR.copydefault;
        StrategyReqGroup strategyReqGroup = this.OLrzqt;
        if (strategyReqGroup == null || (dcdReq = strategyReqGroup.getDcdReq()) == null || (notional = dcdReq.getNotional()) == null) {
            notional = "";
        }
        return xmr.copydefault(notional) + " " + valueOf();
    }

    @Override // o.InterfaceC56005xue
    public java.lang.String EZpvd() {
        return valueOf();
    }
}
