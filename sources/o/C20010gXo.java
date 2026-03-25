package o;

import com.okinc.business.dex.trade.copytrading.home.data.CTOpenOrderRequest;
import com.okinc.business.dex.trade.copytrading.home.data.CTOpenOrderResponse;
import com.okinc.business.dex.trade.copytrading.strategyinfo.domain.usecase.GetCopyTradeOpenOrderUseCase$invoke$1;
import com.okinc.business.dex.trade.order.domain.model.OrderListPagerResult;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gXo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C20010gXo {
    public final InterfaceC20053gZd KWHzl;
    public final gLS copydefault;

    @yCM
    public C20010gXo(@NotNull InterfaceC20053gZd interfaceC20053gZd, @NotNull gLS gls) {
        Intrinsics.checkNotNullParameter(interfaceC20053gZd, "");
        Intrinsics.checkNotNullParameter(gls, "");
        this.KWHzl = interfaceC20053gZd;
        this.copydefault = gls;
    }

    /* JADX INFO: renamed from: invoke-yxL6bBk$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8609invokeyxL6bBk$default(C20010gXo c20010gXo, java.lang.String str, boolean z, java.lang.String str2, int i, Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 8) != 0) {
            i = 20;
        }
        return c20010gXo.KWHzl(str, z, str2, i, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2, int i, @NotNull Continuation<? super Result<OrderListPagerResult<CTOpenOrderResponse>>> continuation) throws java.lang.Throwable {
        GetCopyTradeOpenOrderUseCase$invoke$1 getCopyTradeOpenOrderUseCase$invoke$1;
        if (continuation instanceof GetCopyTradeOpenOrderUseCase$invoke$1) {
            getCopyTradeOpenOrderUseCase$invoke$1 = (GetCopyTradeOpenOrderUseCase$invoke$1) continuation;
            int i2 = getCopyTradeOpenOrderUseCase$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getCopyTradeOpenOrderUseCase$invoke$1.label = i2 - Integer.MIN_VALUE;
            } else {
                getCopyTradeOpenOrderUseCase$invoke$1 = new GetCopyTradeOpenOrderUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = getCopyTradeOpenOrderUseCase$invoke$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i3 = getCopyTradeOpenOrderUseCase$invoke$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            InterfaceC20053gZd interfaceC20053gZd = this.KWHzl;
            InterfaceC9738bbJ interfaceC9738bbJAEQbTJ = this.copydefault.AEQbTJ();
            java.lang.String strDbNXlk = interfaceC9738bbJAEQbTJ != null ? interfaceC9738bbJAEQbTJ.DbNXlk() : null;
            if (strDbNXlk == null) {
                strDbNXlk = "";
            }
            CTOpenOrderRequest cTOpenOrderRequest = new CTOpenOrderRequest(str, strDbNXlk, (java.util.List) null, C56443yFo.AEQbTJ(z ? 1 : 0), (java.lang.Integer) null, str2, i, 20, (DefaultConstructorMarker) null);
            getCopyTradeOpenOrderUseCase$invoke$1.label = 1;
            objCopydefault = interfaceC20053gZd.copydefault(cTOpenOrderRequest, getCopyTradeOpenOrderUseCase$invoke$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objCopydefault);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) objCopydefault;
        try {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl((OrderListPagerResult) C25389ivm.KWHzl(abstractC43419rot));
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
