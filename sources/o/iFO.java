package o;

import com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig;
import com.okinc.business.invest_biz.data.bean.InvestSlippageConfig;
import com.okinc.business.invest_biz.data.bean.request.InvestSubscriptionReceiveReq;
import com.okinc.business.invest_biz.data.models.InvestDetailsAndGasFee;
import com.okinc.business.invest_biz.data.usecase.GetNetworkFeeAndReceiveInfoUseCaseImpl$invoke$1;
import com.okinc.business.invest_biz.data.usecase.GetNetworkFeeAndReceiveInfoUseCaseImpl$invoke$2;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iFO implements iFN {
    public final iNW AEQbTJ;
    public final iNG EZpvd;
    public final C27164jpy KWHzl;
    public final CoroutineDispatcher copydefault;

    @yCM
    public iFO(@NotNull iNW inw, @NotNull iNG ing, @NotNull C27164jpy c27164jpy, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(inw, "");
        Intrinsics.checkNotNullParameter(ing, "");
        Intrinsics.checkNotNullParameter(c27164jpy, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = inw;
        this.EZpvd = ing;
        this.KWHzl = c27164jpy;
        this.copydefault = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iFN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull InvestSubscriptionReceiveReq investSubscriptionReceiveReq, @NotNull java.lang.String str, @NotNull TransactionConfig transactionConfig, @NotNull Continuation<? super Result<InvestDetailsAndGasFee>> continuation) {
        GetNetworkFeeAndReceiveInfoUseCaseImpl$invoke$1 getNetworkFeeAndReceiveInfoUseCaseImpl$invoke$1;
        if (continuation instanceof GetNetworkFeeAndReceiveInfoUseCaseImpl$invoke$1) {
            getNetworkFeeAndReceiveInfoUseCaseImpl$invoke$1 = (GetNetworkFeeAndReceiveInfoUseCaseImpl$invoke$1) continuation;
            int i = getNetworkFeeAndReceiveInfoUseCaseImpl$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getNetworkFeeAndReceiveInfoUseCaseImpl$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getNetworkFeeAndReceiveInfoUseCaseImpl$invoke$1 = new GetNetworkFeeAndReceiveInfoUseCaseImpl$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getNetworkFeeAndReceiveInfoUseCaseImpl$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getNetworkFeeAndReceiveInfoUseCaseImpl$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            GetNetworkFeeAndReceiveInfoUseCaseImpl$invoke$2 getNetworkFeeAndReceiveInfoUseCaseImpl$invoke$2 = new GetNetworkFeeAndReceiveInfoUseCaseImpl$invoke$2(this, transactionConfig, investSubscriptionReceiveReq, str, null);
            getNetworkFeeAndReceiveInfoUseCaseImpl$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getNetworkFeeAndReceiveInfoUseCaseImpl$invoke$2, getNetworkFeeAndReceiveInfoUseCaseImpl$invoke$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    public final kotlin.Pair<java.lang.String, java.lang.Boolean> AEQbTJ(InvestGasPriceConfig investGasPriceConfig, java.lang.String str) {
        C27164jpy c27164jpy = this.KWHzl;
        InvestSlippageConfig investSlippage = investGasPriceConfig.getInvestSlippage();
        java.lang.String automaticValue = investSlippage != null ? investSlippage.getAutomaticValue() : null;
        InvestSlippageConfig investSlippage2 = investGasPriceConfig.getInvestSlippage();
        java.lang.String customMax = investSlippage2 != null ? investSlippage2.getCustomMax() : null;
        InvestSlippageConfig investSlippage3 = investGasPriceConfig.getInvestSlippage();
        return c27164jpy.AEQbTJ(str, automaticValue, customMax, investSlippage3 != null ? java.lang.Integer.valueOf(investSlippage3.getType()) : null);
    }
}
