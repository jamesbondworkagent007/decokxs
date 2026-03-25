package o;

import com.okinc.business.invest_biz.data.bean.request.InvestRedeemReceiveReq;
import com.okinc.business.invest_biz.data.models.RedeemDetailsAndGasFee;
import com.okinc.business.invest_biz.data.usecase.GetRedeemReceiveInfoWithNetworkFeeUseCaseImpl$invoke$1;
import com.okinc.business.invest_biz.data.usecase.GetRedeemReceiveInfoWithNetworkFeeUseCaseImpl$invoke$2$1;
import com.okinc.business.invest_biz.di.TransactionBiz;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iFM implements iFL {
    public final iNW EZpvd;
    public final CoroutineDispatcher KWHzl;
    public final iNQ OLrzqt;

    @yCM
    public iFM(@NotNull iNW inw, @NotNull iNQ inq, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(inw, "");
        Intrinsics.checkNotNullParameter(inq, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = inw;
        this.OLrzqt = inq;
        this.KWHzl = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iFL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull InvestRedeemReceiveReq investRedeemReceiveReq, @NotNull Continuation<? super Result<RedeemDetailsAndGasFee>> continuation) {
        GetRedeemReceiveInfoWithNetworkFeeUseCaseImpl$invoke$1 getRedeemReceiveInfoWithNetworkFeeUseCaseImpl$invoke$1;
        TransactionBiz transactionBiz;
        if (continuation instanceof GetRedeemReceiveInfoWithNetworkFeeUseCaseImpl$invoke$1) {
            getRedeemReceiveInfoWithNetworkFeeUseCaseImpl$invoke$1 = (GetRedeemReceiveInfoWithNetworkFeeUseCaseImpl$invoke$1) continuation;
            int i = getRedeemReceiveInfoWithNetworkFeeUseCaseImpl$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getRedeemReceiveInfoWithNetworkFeeUseCaseImpl$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getRedeemReceiveInfoWithNetworkFeeUseCaseImpl$invoke$1 = new GetRedeemReceiveInfoWithNetworkFeeUseCaseImpl$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getRedeemReceiveInfoWithNetworkFeeUseCaseImpl$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getRedeemReceiveInfoWithNetworkFeeUseCaseImpl$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                Result.Application application = Result.Companion;
                if (investRedeemReceiveReq.isBoostTrade()) {
                    transactionBiz = TransactionBiz.BOOST;
                } else {
                    transactionBiz = TransactionBiz.DEFI;
                }
                TransactionBiz transactionBiz2 = transactionBiz;
                iDH idhAEQbTJ = this.EZpvd.AEQbTJ(transactionBiz2);
                CoroutineDispatcher coroutineDispatcher = this.KWHzl;
                GetRedeemReceiveInfoWithNetworkFeeUseCaseImpl$invoke$2$1 getRedeemReceiveInfoWithNetworkFeeUseCaseImpl$invoke$2$1 = new GetRedeemReceiveInfoWithNetworkFeeUseCaseImpl$invoke$2$1(idhAEQbTJ, investRedeemReceiveReq, this, transactionBiz2, null);
                getRedeemReceiveInfoWithNetworkFeeUseCaseImpl$invoke$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, getRedeemReceiveInfoWithNetworkFeeUseCaseImpl$invoke$2$1, getRedeemReceiveInfoWithNetworkFeeUseCaseImpl$invoke$1);
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
}
