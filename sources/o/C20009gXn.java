package o;

import com.okinc.business.dex.trade.copytrading.home.data.CTPositionsRequest;
import com.okinc.business.dex.trade.copytrading.home.data.CTPositionsResponse;
import com.okinc.business.dex.trade.copytrading.strategyinfo.domain.usecase.GetCopyTradePositionsUseCase$invoke$1;
import com.okinc.business.dex.trade.order.domain.model.OrderStrategyMode;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedAssetsFilter;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gXn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C20009gXn {
    public final C19700gMb AEQbTJ;
    public final InterfaceC20053gZd OLrzqt;

    @yCM
    public C20009gXn(@NotNull InterfaceC20053gZd interfaceC20053gZd, @NotNull C19700gMb c19700gMb) {
        Intrinsics.checkNotNullParameter(interfaceC20053gZd, "");
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        this.OLrzqt = interfaceC20053gZd;
        this.AEQbTJ = c19700gMb;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull AdvancedAssetsFilter advancedAssetsFilter, @NotNull Continuation<? super Result<CTPositionsResponse>> continuation) throws java.lang.Throwable {
        GetCopyTradePositionsUseCase$invoke$1 getCopyTradePositionsUseCase$invoke$1;
        if (continuation instanceof GetCopyTradePositionsUseCase$invoke$1) {
            getCopyTradePositionsUseCase$invoke$1 = (GetCopyTradePositionsUseCase$invoke$1) continuation;
            int i = getCopyTradePositionsUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getCopyTradePositionsUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getCopyTradePositionsUseCase$invoke$1 = new GetCopyTradePositionsUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = getCopyTradePositionsUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getCopyTradePositionsUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                Result.Application application = Result.Companion;
                InterfaceC20053gZd interfaceC20053gZd = this.OLrzqt;
                InterfaceC9738bbJ interfaceC9738bbJKWHzl = this.AEQbTJ.KWHzl();
                java.lang.String strDbNXlk = interfaceC9738bbJKWHzl != null ? interfaceC9738bbJKWHzl.DbNXlk() : null;
                if (strDbNXlk == null) {
                    strDbNXlk = "";
                }
                CTPositionsRequest cTPositionsRequest = new CTPositionsRequest(str, strDbNXlk, C56443yFo.AEQbTJ(OrderStrategyMode.TEE_SA_COPY_TRADE.getStrategyMode()), advancedAssetsFilter.getSortByString(), advancedAssetsFilter.getSortDesc() ? "true" : "false");
                getCopyTradePositionsUseCase$invoke$1.label = 1;
                objOLrzqt = interfaceC20053gZd.OLrzqt(cTPositionsRequest, getCopyTradePositionsUseCase$invoke$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objOLrzqt);
            }
            return Result.m7377constructorimpl((CTPositionsResponse) ((AbstractC43419rot) objOLrzqt).AEQbTJ());
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
