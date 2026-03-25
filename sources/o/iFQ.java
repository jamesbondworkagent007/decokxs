package o;

import com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig;
import com.okinc.business.invest_biz.data.bean.InvestSlippageConfig;
import com.okinc.business.invest_biz.data.bean.request.InvestUniv3RedeemReceiveReq;
import com.okinc.business.invest_biz.data.models.RedeemDetailsAndGasFee;
import com.okinc.business.invest_biz.data.usecase.GetUniv3RedeemReceiveInfoUseCaseImpl$invoke$1;
import com.okinc.business.invest_biz.data.usecase.GetUniv3RedeemReceiveInfoUseCaseImpl$invoke$2$1;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iFQ implements iFR {
    public final CoroutineDispatcher AEQbTJ;
    public final iDF KWHzl;
    public final C27164jpy OLrzqt;
    public final iDH copydefault;

    @yCM
    public iFQ(@NotNull iDH idh, @NotNull iDF idf, @NotNull C27164jpy c27164jpy, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(idh, "");
        Intrinsics.checkNotNullParameter(idf, "");
        Intrinsics.checkNotNullParameter(c27164jpy, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = idh;
        this.KWHzl = idf;
        this.OLrzqt = c27164jpy;
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iFR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull InvestUniv3RedeemReceiveReq investUniv3RedeemReceiveReq, @NotNull Continuation<? super Result<RedeemDetailsAndGasFee>> continuation) {
        GetUniv3RedeemReceiveInfoUseCaseImpl$invoke$1 getUniv3RedeemReceiveInfoUseCaseImpl$invoke$1;
        if (continuation instanceof GetUniv3RedeemReceiveInfoUseCaseImpl$invoke$1) {
            getUniv3RedeemReceiveInfoUseCaseImpl$invoke$1 = (GetUniv3RedeemReceiveInfoUseCaseImpl$invoke$1) continuation;
            int i = getUniv3RedeemReceiveInfoUseCaseImpl$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getUniv3RedeemReceiveInfoUseCaseImpl$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getUniv3RedeemReceiveInfoUseCaseImpl$invoke$1 = new GetUniv3RedeemReceiveInfoUseCaseImpl$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getUniv3RedeemReceiveInfoUseCaseImpl$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getUniv3RedeemReceiveInfoUseCaseImpl$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                Result.Application application = Result.Companion;
                CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
                GetUniv3RedeemReceiveInfoUseCaseImpl$invoke$2$1 getUniv3RedeemReceiveInfoUseCaseImpl$invoke$2$1 = new GetUniv3RedeemReceiveInfoUseCaseImpl$invoke$2$1(this, investUniv3RedeemReceiveReq, null);
                getUniv3RedeemReceiveInfoUseCaseImpl$invoke$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, getUniv3RedeemReceiveInfoUseCaseImpl$invoke$2$1, getUniv3RedeemReceiveInfoUseCaseImpl$invoke$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            java.lang.Object objM7386unboximpl = ((Result) objWithContext).m7386unboximpl();
            C56391yDq.AEQbTJ(objM7386unboximpl);
            return Result.m7377constructorimpl((RedeemDetailsAndGasFee) objM7386unboximpl);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public final kotlin.Pair<java.lang.String, java.lang.Boolean> EZpvd(InvestGasPriceConfig investGasPriceConfig, java.lang.String str) {
        C27164jpy c27164jpy = this.OLrzqt;
        InvestSlippageConfig investSlippage = investGasPriceConfig.getInvestSlippage();
        java.lang.String automaticValue = investSlippage != null ? investSlippage.getAutomaticValue() : null;
        InvestSlippageConfig investSlippage2 = investGasPriceConfig.getInvestSlippage();
        java.lang.String customMax = investSlippage2 != null ? investSlippage2.getCustomMax() : null;
        InvestSlippageConfig investSlippage3 = investGasPriceConfig.getInvestSlippage();
        return c27164jpy.AEQbTJ(str, automaticValue, customMax, investSlippage3 != null ? java.lang.Integer.valueOf(investSlippage3.getType()) : null);
    }
}
