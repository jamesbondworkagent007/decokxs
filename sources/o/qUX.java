package o;

import com.okinc.market.ticker.model.DexTickerPo;
import com.okinc.market.ticker.repo.DexTickersRepository$getWsBatchPairTickersFlow$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qUX {
    public final qUB AEQbTJ;
    public final CoroutineDispatcher OLrzqt;
    public final CoroutineDispatcher copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final CoroutineDispatcher AEQbTJ() {
        return this.OLrzqt;
    }

    @yCM
    public qUX(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull CoroutineDispatcher coroutineDispatcher2, @NotNull qUB qub) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher2, "");
        Intrinsics.checkNotNullParameter(qub, "");
        this.copydefault = coroutineDispatcher;
        this.OLrzqt = coroutineDispatcher2;
        this.AEQbTJ = qub;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> list, @NotNull Continuation<? super Flow<DexTickerPo>> continuation) throws java.lang.Throwable {
        DexTickersRepository$getWsBatchPairTickersFlow$1 dexTickersRepository$getWsBatchPairTickersFlow$1;
        java.lang.Throwable th;
        qUX qux;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof DexTickersRepository$getWsBatchPairTickersFlow$1) {
            dexTickersRepository$getWsBatchPairTickersFlow$1 = (DexTickersRepository$getWsBatchPairTickersFlow$1) continuation;
            int i = dexTickersRepository$getWsBatchPairTickersFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dexTickersRepository$getWsBatchPairTickersFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                dexTickersRepository$getWsBatchPairTickersFlow$1 = new DexTickersRepository$getWsBatchPairTickersFlow$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = dexTickersRepository$getWsBatchPairTickersFlow$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dexTickersRepository$getWsBatchPairTickersFlow$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            try {
                Result.Application application = Result.Companion;
                qUB qub = this.AEQbTJ;
                dexTickersRepository$getWsBatchPairTickersFlow$1.L$0 = this;
                dexTickersRepository$getWsBatchPairTickersFlow$1.label = 1;
                objEZpvd = qub.EZpvd(list, dexTickersRepository$getWsBatchPairTickersFlow$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                qux = this;
            } catch (java.lang.Throwable th2) {
                th = th2;
                qux = this;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qux = (qUX) dexTickersRepository$getWsBatchPairTickersFlow$1.L$0;
            try {
                C56391yDq.AEQbTJ(objEZpvd);
            } catch (java.lang.Throwable th3) {
                th = th3;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        objM7377constructorimpl = Result.m7377constructorimpl((Flow) objEZpvd);
        Flow flowEmptyFlow = FlowKt.emptyFlow();
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = flowEmptyFlow;
        }
        return FlowKt.flowOn((Flow) objM7377constructorimpl, qux.AEQbTJ());
    }
}
