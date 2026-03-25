package o;

import com.okinc.business.dexlogic.bean.CheckServiceOfflineBean;
import com.okinc.business.market.domain.CheckTradeOfflineUseCase$checkSwapTradeOffline$1;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jAj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25626jAj {
    public final InterfaceC27611jyU KWHzl;

    @yCM
    public C25626jAj(@NotNull InterfaceC27611jyU interfaceC27611jyU) {
        Intrinsics.checkNotNullParameter(interfaceC27611jyU, "");
        this.KWHzl = interfaceC27611jyU;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super Result<CheckServiceOfflineBean>> continuation) {
        CheckTradeOfflineUseCase$checkSwapTradeOffline$1 checkTradeOfflineUseCase$checkSwapTradeOffline$1;
        if (continuation instanceof CheckTradeOfflineUseCase$checkSwapTradeOffline$1) {
            checkTradeOfflineUseCase$checkSwapTradeOffline$1 = (CheckTradeOfflineUseCase$checkSwapTradeOffline$1) continuation;
            int i = checkTradeOfflineUseCase$checkSwapTradeOffline$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkTradeOfflineUseCase$checkSwapTradeOffline$1.label = i - Integer.MIN_VALUE;
            } else {
                checkTradeOfflineUseCase$checkSwapTradeOffline$1 = new CheckTradeOfflineUseCase$checkSwapTradeOffline$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = checkTradeOfflineUseCase$checkSwapTradeOffline$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = checkTradeOfflineUseCase$checkSwapTradeOffline$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                Result.Application application = Result.Companion;
                InterfaceC27611jyU interfaceC27611jyU = this.KWHzl;
                checkTradeOfflineUseCase$checkSwapTradeOffline$1.label = 1;
                objAEQbTJ = interfaceC27611jyU.AEQbTJ(checkTradeOfflineUseCase$checkSwapTradeOffline$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
            }
            return Result.m7377constructorimpl((CheckServiceOfflineBean) ((AbstractC43419rot) objAEQbTJ).AEQbTJ());
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
