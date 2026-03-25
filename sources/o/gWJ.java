package o;

import com.okinc.business.dex.trade.copytrading.home.data.CopyTradeStatRequest;
import com.okinc.business.dex.trade.copytrading.home.data.CopyTradingPnLResponse;
import com.okinc.business.dex.trade.copytrading.home.usecase.CopyTradingPnLUseCase$getCopyTradeStat$1;
import com.okinc.business.dex.trade.copytrading.home.usecase.CopyTradingPnLUseCase$getCopyTradeStat0E7RQCE$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gWJ {
    public final InterfaceC20053gZd EZpvd;
    public final C28196kSl KWHzl;
    public final CoroutineDispatcher OLrzqt;

    @yCM
    public gWJ(@NotNull InterfaceC20053gZd interfaceC20053gZd, @NotNull C28196kSl c28196kSl, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC20053gZd, "");
        Intrinsics.checkNotNullParameter(c28196kSl, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = interfaceC20053gZd;
        this.KWHzl = c28196kSl;
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: getCopyTradeStat-0E7RQCE$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8606getCopyTradeStat0E7RQCE$default(gWJ gwj, java.lang.String str, CopyTradeStatRequest.TimeRange timeRange, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            timeRange = null;
        }
        return gwj.KWHzl(str, timeRange, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(java.lang.String str, CopyTradeStatRequest.TimeRange timeRange, @NotNull Continuation<? super Result<CopyTradingPnLResponse>> continuation) throws java.lang.Throwable {
        CopyTradingPnLUseCase$getCopyTradeStat$1 copyTradingPnLUseCase$getCopyTradeStat$1;
        if (continuation instanceof CopyTradingPnLUseCase$getCopyTradeStat$1) {
            copyTradingPnLUseCase$getCopyTradeStat$1 = (CopyTradingPnLUseCase$getCopyTradeStat$1) continuation;
            int i = copyTradingPnLUseCase$getCopyTradeStat$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                copyTradingPnLUseCase$getCopyTradeStat$1.label = i - Integer.MIN_VALUE;
            } else {
                copyTradingPnLUseCase$getCopyTradeStat$1 = new CopyTradingPnLUseCase$getCopyTradeStat$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = copyTradingPnLUseCase$getCopyTradeStat$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = copyTradingPnLUseCase$getCopyTradeStat$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            CopyTradingPnLUseCase$getCopyTradeStat0E7RQCE$$inlined$dexRunCatching$1 copyTradingPnLUseCase$getCopyTradeStat0E7RQCE$$inlined$dexRunCatching$1 = new CopyTradingPnLUseCase$getCopyTradeStat0E7RQCE$$inlined$dexRunCatching$1(null, this, str, timeRange);
            copyTradingPnLUseCase$getCopyTradeStat$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, copyTradingPnLUseCase$getCopyTradeStat0E7RQCE$$inlined$dexRunCatching$1, copyTradingPnLUseCase$getCopyTradeStat$1);
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
}
