package o;

import com.okinc.business.dex.trade.copytrading.home.data.CTUpdateStatusRequest;
import com.okinc.business.dex.trade.copytrading.home.data.StrategyStatus;
import com.okinc.business.dex.trade.copytrading.strategyinfo.domain.usecase.UpdateCopeTradeOrderStatusUseCase$invoke$1;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gXr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C20013gXr {
    public final C19868gSh AEQbTJ;
    public final gLS EZpvd;
    public final InterfaceC20053gZd copydefault;

    @yCM
    public C20013gXr(@NotNull InterfaceC20053gZd interfaceC20053gZd, @NotNull C19868gSh c19868gSh, @NotNull gLS gls) {
        Intrinsics.checkNotNullParameter(interfaceC20053gZd, "");
        Intrinsics.checkNotNullParameter(c19868gSh, "");
        Intrinsics.checkNotNullParameter(gls, "");
        this.copydefault = interfaceC20053gZd;
        this.AEQbTJ = c19868gSh;
        this.EZpvd = gls;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.util.List<java.lang.String> list, @NotNull StrategyStatus strategyStatus, @NotNull Continuation<? super Result<java.lang.Integer>> continuation) {
        UpdateCopeTradeOrderStatusUseCase$invoke$1 updateCopeTradeOrderStatusUseCase$invoke$1;
        if (continuation instanceof UpdateCopeTradeOrderStatusUseCase$invoke$1) {
            updateCopeTradeOrderStatusUseCase$invoke$1 = (UpdateCopeTradeOrderStatusUseCase$invoke$1) continuation;
            int i = updateCopeTradeOrderStatusUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                updateCopeTradeOrderStatusUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                updateCopeTradeOrderStatusUseCase$invoke$1 = new UpdateCopeTradeOrderStatusUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = updateCopeTradeOrderStatusUseCase$invoke$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = updateCopeTradeOrderStatusUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                Result.Application application = Result.Companion;
                InterfaceC20053gZd interfaceC20053gZd = this.copydefault;
                InterfaceC9738bbJ interfaceC9738bbJAEQbTJ = this.EZpvd.AEQbTJ();
                java.lang.String strDbNXlk = interfaceC9738bbJAEQbTJ != null ? interfaceC9738bbJAEQbTJ.DbNXlk() : null;
                if (strDbNXlk == null) {
                    strDbNXlk = "";
                }
                CTUpdateStatusRequest cTUpdateStatusRequest = new CTUpdateStatusRequest(strDbNXlk, list, strategyStatus.getStatus(), this.AEQbTJ.OLrzqt());
                updateCopeTradeOrderStatusUseCase$invoke$1.label = 1;
                objCopydefault = interfaceC20053gZd.copydefault(cTUpdateStatusRequest, updateCopeTradeOrderStatusUseCase$invoke$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
            }
            return Result.m7377constructorimpl(C56443yFo.AEQbTJ(((java.lang.Number) C25389ivm.KWHzl((AbstractC43419rot) objCopydefault)).intValue()));
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
