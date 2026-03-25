package com.okinc.business.defi.wallet.transfer.receive.exchange;

import com.okinc.business.defi.biz.net.bean.CoinInfoResponse;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C13934dbu;
import o.C21085gtB;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes18.dex */
public final class WithdrawNetworksViewModel$requestNetworksData$2$1$deferredResults$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends CoinInfoResponse>>, Object> {
    final /* synthetic */ List<Integer> $chunk;
    int label;
    final /* synthetic */ C21085gtB this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WithdrawNetworksViewModel$requestNetworksData$2$1$deferredResults$1$1(C21085gtB c21085gtB, List<Integer> list, Continuation<? super WithdrawNetworksViewModel$requestNetworksData$2$1$deferredResults$1$1> continuation) {
        super(2, continuation);
        this.this$0 = c21085gtB;
        this.$chunk = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WithdrawNetworksViewModel$requestNetworksData$2$1$deferredResults$1$1(this.this$0, this.$chunk, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends CoinInfoResponse>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<CoinInfoResponse>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<CoinInfoResponse>> continuation) {
        return ((WithdrawNetworksViewModel$requestNetworksData$2$1$deferredResults$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C21085gtB c21085gtB = this.this$0;
                List<Integer> list = this.$chunk;
                Result.Application application = Result.Companion;
                C13934dbu c13934dbu = c21085gtB.AEQbTJ;
                this.label = 1;
                obj = c13934dbu.AEQbTJ(list, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((List) ((AbstractC43419rot) obj).AEQbTJ());
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl == null) {
            return objM7377constructorimpl;
        }
        pUU.AEQbTJ("WithdrawNetworksViewModel", "Failed to get coin info", thM7380exceptionOrNullimpl);
        return yDY.AhwBna();
    }
}
