package o;

import com.okinc.okmarket.app.callauction.ws.data.model.CallAuctionData;
import com.okinc.okmarket.app.callauction.ws.repo.CallAuctionRepository$getWsCallAuctionFlow$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sZq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44594sZq {
    public final CoroutineDispatcher KWHzl;
    public final C44595sZr OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoroutineDispatcher AEQbTJ() {
        return this.KWHzl;
    }

    @yCM
    public C44594sZq(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C44595sZr c44595sZr) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c44595sZr, "");
        this.KWHzl = coroutineDispatcher;
        this.OLrzqt = c44595sZr;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull Continuation<? super Flow<? extends java.util.List<CallAuctionData>>> continuation) throws java.lang.Throwable {
        CallAuctionRepository$getWsCallAuctionFlow$1 callAuctionRepository$getWsCallAuctionFlow$1;
        C44594sZq c44594sZq;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof CallAuctionRepository$getWsCallAuctionFlow$1) {
            callAuctionRepository$getWsCallAuctionFlow$1 = (CallAuctionRepository$getWsCallAuctionFlow$1) continuation;
            int i = callAuctionRepository$getWsCallAuctionFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                callAuctionRepository$getWsCallAuctionFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                callAuctionRepository$getWsCallAuctionFlow$1 = new CallAuctionRepository$getWsCallAuctionFlow$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = callAuctionRepository$getWsCallAuctionFlow$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = callAuctionRepository$getWsCallAuctionFlow$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            try {
                Result.Application application = Result.Companion;
                C44595sZr c44595sZr = this.OLrzqt;
                callAuctionRepository$getWsCallAuctionFlow$1.L$0 = this;
                callAuctionRepository$getWsCallAuctionFlow$1.label = 1;
                objAEQbTJ = c44595sZr.AEQbTJ(callAuctionRepository$getWsCallAuctionFlow$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                c44594sZq = this;
            } catch (java.lang.Throwable th) {
                th = th;
                c44594sZq = this;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c44594sZq = (C44594sZq) callAuctionRepository$getWsCallAuctionFlow$1.L$0;
            try {
                C56391yDq.AEQbTJ(objAEQbTJ);
            } catch (java.lang.Throwable th2) {
                th = th2;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        objM7377constructorimpl = Result.m7377constructorimpl((Flow) objAEQbTJ);
        Flow flowEmptyFlow = FlowKt.emptyFlow();
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = flowEmptyFlow;
        }
        return FlowKt.flowOn((Flow) objM7377constructorimpl, c44594sZq.AEQbTJ());
    }
}
