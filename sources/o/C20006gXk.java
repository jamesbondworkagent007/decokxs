package o;

import com.okinc.business.dex.trade.copytrading.home.data.CTFilteredOrderRequest;
import com.okinc.business.dex.trade.copytrading.home.data.CTFilteredOrderResponse;
import com.okinc.business.dex.trade.copytrading.strategyinfo.domain.usecase.GetCopyTradeFilteredOrderUseCase$invoke$1;
import com.okinc.business.dex.trade.order.domain.model.OrderListPagerResult;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gXk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C20006gXk {
    public final InterfaceC20053gZd KWHzl;
    public final gLS OLrzqt;

    @yCM
    public C20006gXk(@NotNull InterfaceC20053gZd interfaceC20053gZd, @NotNull gLS gls) {
        Intrinsics.checkNotNullParameter(interfaceC20053gZd, "");
        Intrinsics.checkNotNullParameter(gls, "");
        this.KWHzl = interfaceC20053gZd;
        this.OLrzqt = gls;
    }

    /* JADX INFO: renamed from: invoke-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8608invokeBWLJW6A$default(C20006gXk c20006gXk, java.lang.String str, java.lang.String str2, int i, Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = 20;
        }
        return c20006gXk.KWHzl(str, str2, i, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, java.lang.String str2, int i, @NotNull Continuation<? super Result<OrderListPagerResult<CTFilteredOrderResponse>>> continuation) throws java.lang.Throwable {
        GetCopyTradeFilteredOrderUseCase$invoke$1 getCopyTradeFilteredOrderUseCase$invoke$1;
        if (continuation instanceof GetCopyTradeFilteredOrderUseCase$invoke$1) {
            getCopyTradeFilteredOrderUseCase$invoke$1 = (GetCopyTradeFilteredOrderUseCase$invoke$1) continuation;
            int i2 = getCopyTradeFilteredOrderUseCase$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getCopyTradeFilteredOrderUseCase$invoke$1.label = i2 - Integer.MIN_VALUE;
            } else {
                getCopyTradeFilteredOrderUseCase$invoke$1 = new GetCopyTradeFilteredOrderUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = getCopyTradeFilteredOrderUseCase$invoke$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i3 = getCopyTradeFilteredOrderUseCase$invoke$1.label;
        try {
            if (i3 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                Result.Application application = Result.Companion;
                InterfaceC20053gZd interfaceC20053gZd = this.KWHzl;
                InterfaceC9738bbJ interfaceC9738bbJAEQbTJ = this.OLrzqt.AEQbTJ();
                java.lang.String strDbNXlk = interfaceC9738bbJAEQbTJ != null ? interfaceC9738bbJAEQbTJ.DbNXlk() : null;
                if (strDbNXlk == null) {
                    strDbNXlk = "";
                }
                CTFilteredOrderRequest cTFilteredOrderRequest = new CTFilteredOrderRequest(strDbNXlk, str, str2, i);
                getCopyTradeFilteredOrderUseCase$invoke$1.label = 1;
                objCopydefault = interfaceC20053gZd.copydefault(cTFilteredOrderRequest, getCopyTradeFilteredOrderUseCase$invoke$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
            }
            return Result.m7377constructorimpl((OrderListPagerResult) C25389ivm.KWHzl((AbstractC43419rot) objCopydefault));
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
