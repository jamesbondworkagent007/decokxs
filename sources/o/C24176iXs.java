package o;

import com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig;
import com.okinc.business.invest_biz.data.bean.InvestSlippageConfig;
import com.okinc.business.invest_biz.data.logic.InvestTradeManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iXs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24176iXs implements InterfaceC24171iXn {
    public final C27164jpy AEQbTJ;
    public java.util.List<java.lang.Object> AYXKKw;
    public java.util.List<java.lang.Object> EZpvd;
    public boolean KWHzl;
    public InvestTradeManager.TransactionResultExtraData OLrzqt;
    public android.os.Bundle copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC24171iXn
    public android.os.Bundle AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC24171iXn
    public void EZpvd(@NotNull InvestTradeManager.TransactionResultExtraData transactionResultExtraData) {
        Intrinsics.checkNotNullParameter(transactionResultExtraData, "");
        this.KWHzl = true;
        this.OLrzqt = transactionResultExtraData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(android.os.Bundle bundle) {
        this.copydefault = bundle;
    }

    @yCM
    public C24176iXs(@NotNull C27164jpy c27164jpy) {
        Intrinsics.checkNotNullParameter(c27164jpy, "");
        this.AEQbTJ = c27164jpy;
        this.AYXKKw = yDY.AhwBna();
        this.EZpvd = yDY.AhwBna();
    }

    @Override // o.InterfaceC24171iXn
    public void EZpvd(android.os.Bundle bundle) {
        this.KWHzl = true;
        OLrzqt(bundle);
    }

    @Override // o.InterfaceC24171iXn
    public void EZpvd(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ.AEQbTJ(str, z);
    }

    @Override // o.InterfaceC24171iXn
    public void OLrzqt(@NotNull java.lang.String str, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ.AEQbTJ(str, num);
    }

    @Override // o.InterfaceC24171iXn
    public kotlin.Pair<java.lang.String, java.lang.Boolean> copydefault(@NotNull java.lang.String str, @NotNull InvestGasPriceConfig investGasPriceConfig) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(investGasPriceConfig, "");
        C27164jpy c27164jpy = this.AEQbTJ;
        InvestSlippageConfig investSlippage = investGasPriceConfig.getInvestSlippage();
        java.lang.String automaticValue = investSlippage != null ? investSlippage.getAutomaticValue() : null;
        InvestSlippageConfig investSlippage2 = investGasPriceConfig.getInvestSlippage();
        java.lang.String customMax = investSlippage2 != null ? investSlippage2.getCustomMax() : null;
        InvestSlippageConfig investSlippage3 = investGasPriceConfig.getInvestSlippage();
        return c27164jpy.AEQbTJ(str, automaticValue, customMax, investSlippage3 != null ? java.lang.Integer.valueOf(investSlippage3.getType()) : null);
    }

    @Override // o.InterfaceC24171iXn
    public void copydefault() {
        this.AEQbTJ.copydefault();
    }
}
