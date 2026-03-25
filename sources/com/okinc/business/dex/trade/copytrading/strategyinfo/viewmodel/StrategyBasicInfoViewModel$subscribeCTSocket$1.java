package com.okinc.business.dex.trade.copytrading.strategyinfo.viewmodel;

import com.okinc.business.dex.trade.copytrading.home.data.CopyTradeStatRequest;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C56391yDq;
import o.C56442yFn;
import o.gWM;

/* JADX INFO: loaded from: classes5.dex */
public final class StrategyBasicInfoViewModel$subscribeCTSocket$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $strategyOrderId;
    int label;
    final /* synthetic */ StrategyBasicInfoViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StrategyBasicInfoViewModel$subscribeCTSocket$1(StrategyBasicInfoViewModel strategyBasicInfoViewModel, String str, String str2, Continuation<? super StrategyBasicInfoViewModel$subscribeCTSocket$1> continuation) {
        super(2, continuation);
        this.this$0 = strategyBasicInfoViewModel;
        this.$strategyOrderId = str;
        this.$chainId = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StrategyBasicInfoViewModel$subscribeCTSocket$1(this.this$0, this.$strategyOrderId, this.$chainId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((StrategyBasicInfoViewModel$subscribeCTSocket$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            gWM gwm = this.this$0.AYXKKw;
            CopyTradeStatRequest.TimeRange timeRange = CopyTradeStatRequest.TimeRange.LastOneYear;
            String str = this.$strategyOrderId;
            String str2 = this.$chainId;
            this.label = 1;
            obj = gWM.subscribeCTSocket$default(gwm, timeRange, str, str2, 0, this, 8, null);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) obj;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
        }
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
        }
        return Unit.INSTANCE;
    }
}
