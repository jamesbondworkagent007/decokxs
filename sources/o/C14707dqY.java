package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.defi.biz.net.bean.WalletCoinLatestPnlResponse;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dqY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14707dqY extends ConstraintLayout {
    public AbstractC17132ewy OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14707dqY(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14707dqY(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        KWHzl();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14707dqY(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        KWHzl();
    }

    private final void KWHzl() {
        this.OLrzqt = (AbstractC17132ewy) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C13754dXa.TaskDescription.getConnectivityMgr, this, true);
    }

    public final void setPnlData(@NotNull WalletCoinLatestPnlResponse walletCoinLatestPnlResponse) {
        java.lang.String currentProfit;
        java.lang.String realizedProfit;
        java.lang.String currentProfitPercentage;
        java.lang.String realizedProfitPercentage;
        Intrinsics.checkNotNullParameter(walletCoinLatestPnlResponse, "");
        if (!Intrinsics.EZpvd(walletCoinLatestPnlResponse.isPnlSupported(), java.lang.Boolean.TRUE) || C33129mqd.valueOf(walletCoinLatestPnlResponse.getBoughtVolume(), 0) || (((currentProfit = walletCoinLatestPnlResponse.getCurrentProfit()) == null || currentProfit.length() == 0) && (((realizedProfit = walletCoinLatestPnlResponse.getRealizedProfit()) == null || realizedProfit.length() == 0) && (((currentProfitPercentage = walletCoinLatestPnlResponse.getCurrentProfitPercentage()) == null || currentProfitPercentage.length() == 0) && ((realizedProfitPercentage = walletCoinLatestPnlResponse.getRealizedProfitPercentage()) == null || realizedProfitPercentage.length() == 0))))) {
            setVisibility(8);
            return;
        }
        AbstractC17132ewy abstractC17132ewy = this.OLrzqt;
        if (abstractC17132ewy != null) {
            setVisibility(0);
            int iEZpvd = EZpvd(walletCoinLatestPnlResponse.getCurrentProfitPercentage());
            abstractC17132ewy.djBIcL.setText(KWHzl(walletCoinLatestPnlResponse.getCurrentProfit()));
            abstractC17132ewy.djBIcL.setTextColor(iEZpvd);
            abstractC17132ewy.AhwBna.setText(AEQbTJ(walletCoinLatestPnlResponse.getCurrentProfitPercentage()));
            abstractC17132ewy.AhwBna.setTextColor(iEZpvd);
            int iEZpvd2 = EZpvd(walletCoinLatestPnlResponse.getRealizedProfitPercentage());
            abstractC17132ewy.EZpvd.setText(KWHzl(walletCoinLatestPnlResponse.getRealizedProfit()));
            abstractC17132ewy.EZpvd.setTextColor(iEZpvd2);
            abstractC17132ewy.gEmmrt.setText(AEQbTJ(walletCoinLatestPnlResponse.getRealizedProfitPercentage()));
            abstractC17132ewy.gEmmrt.setTextColor(iEZpvd2);
        }
    }

    public final java.lang.String KWHzl(java.lang.String str) {
        return (str == null || str.length() == 0) ? "--" : C54880xYt.formatValuation$default(C33129mqd.EZpvd(str), 0, 0, null, CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, null, null, false, 119, null);
    }

    public final java.lang.String AEQbTJ(java.lang.String str) {
        return (str == null || str.length() == 0) ? "--" : C54873xYm.formatPriceChangePercentage$default(C33129mqd.EZpvd(str), 0, 0, false, null, null, 31, null);
    }

    public static /* synthetic */ int getPnlColor$default(C14707dqY c14707dqY, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "0";
        }
        return c14707dqY.EZpvd(str);
    }

    public final int EZpvd(java.lang.String str) {
        if (C33129mqd.AEQbTJ(str, 0)) {
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            return C33512mxp.tradeRiseDefault$default(c33512mxp, context, 0.0f, 2, null);
        }
        if (C33129mqd.OLrzqt((java.lang.Object) str, (java.lang.Object) 0)) {
            return C33070mpX.copydefault(C52761wXj.Activity.QwvEab);
        }
        C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        return C33512mxp.tradeFallDefault$default(c33512mxp2, context2, 0.0f, 2, null);
    }
}
