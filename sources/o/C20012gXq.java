package o;

import com.okinc.business.dex.trade.copytrading.home.data.CTTradesOrderRequest;
import com.okinc.business.dex.trade.copytrading.strategyinfo.domain.usecase.GetCopyTradeTradesOrderUseCase$invoke$1;
import com.okinc.business.dex.trade.order.domain.model.OrderListPagerResult;
import com.okinc.business.dex.trade.order.domain.model.OrderStrategyMode;
import com.okinc.business.dex.trade.order.domain.model.TradesOrderData;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gXq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C20012gXq {
    public final InterfaceC20053gZd AEQbTJ;
    public final C19700gMb copydefault;

    @yCM
    public C20012gXq(@NotNull InterfaceC20053gZd interfaceC20053gZd, @NotNull C19700gMb c19700gMb) {
        Intrinsics.checkNotNullParameter(interfaceC20053gZd, "");
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        this.AEQbTJ = interfaceC20053gZd;
        this.copydefault = c19700gMb;
    }

    /* JADX INFO: renamed from: invoke-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8610invokeBWLJW6A$default(C20012gXq c20012gXq, java.lang.String str, java.lang.String str2, int i, Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = 20;
        }
        return c20012gXq.copydefault(str, str2, i, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, java.lang.String str2, int i, @NotNull Continuation<? super Result<OrderListPagerResult<TradesOrderData>>> continuation) throws java.lang.Throwable {
        GetCopyTradeTradesOrderUseCase$invoke$1 getCopyTradeTradesOrderUseCase$invoke$1;
        if (continuation instanceof GetCopyTradeTradesOrderUseCase$invoke$1) {
            getCopyTradeTradesOrderUseCase$invoke$1 = (GetCopyTradeTradesOrderUseCase$invoke$1) continuation;
            int i2 = getCopyTradeTradesOrderUseCase$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getCopyTradeTradesOrderUseCase$invoke$1.label = i2 - Integer.MIN_VALUE;
            } else {
                getCopyTradeTradesOrderUseCase$invoke$1 = new GetCopyTradeTradesOrderUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = getCopyTradeTradesOrderUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = getCopyTradeTradesOrderUseCase$invoke$1.label;
        try {
            if (i3 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                Result.Application application = Result.Companion;
                InterfaceC20053gZd interfaceC20053gZd = this.AEQbTJ;
                InterfaceC9738bbJ interfaceC9738bbJKWHzl = this.copydefault.KWHzl();
                java.lang.String strDbNXlk = interfaceC9738bbJKWHzl != null ? interfaceC9738bbJKWHzl.DbNXlk() : null;
                if (strDbNXlk == null) {
                    strDbNXlk = "";
                }
                CTTradesOrderRequest cTTradesOrderRequest = new CTTradesOrderRequest(str, C56443yFo.AEQbTJ(OrderStrategyMode.TEE_SA_COPY_TRADE.getStrategyMode()), strDbNXlk, str2, i);
                getCopyTradeTradesOrderUseCase$invoke$1.label = 1;
                objAEQbTJ = interfaceC20053gZd.AEQbTJ(cTTradesOrderRequest, getCopyTradeTradesOrderUseCase$invoke$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
            }
            return Result.m7377constructorimpl((OrderListPagerResult) ((AbstractC43419rot) objAEQbTJ).AEQbTJ());
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
