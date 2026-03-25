package com.okinc.tradingbot.impl.minimumInvest.domain;

import com.okinc.unify_trade.biz.ArbitrageInfoResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C52020vxx;
import o.C56391yDq;
import o.C56442yFn;
import o.wTM;

/* JADX INFO: loaded from: classes19.dex */
public final class FetchMinimumInvestAmountUseCase$calculateSmartArbitrageMinInvest$2$arbitrageInfoDeferred$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ArbitrageInfoResponse>, Object> {
    final /* synthetic */ C52020vxx.Activity.C0987Activity $input;
    int label;
    final /* synthetic */ C52020vxx this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchMinimumInvestAmountUseCase$calculateSmartArbitrageMinInvest$2$arbitrageInfoDeferred$1(C52020vxx c52020vxx, C52020vxx.Activity.C0987Activity c0987Activity, Continuation<? super FetchMinimumInvestAmountUseCase$calculateSmartArbitrageMinInvest$2$arbitrageInfoDeferred$1> continuation) {
        super(2, continuation);
        this.this$0 = c52020vxx;
        this.$input = c0987Activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FetchMinimumInvestAmountUseCase$calculateSmartArbitrageMinInvest$2$arbitrageInfoDeferred$1(this.this$0, this.$input, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ArbitrageInfoResponse> continuation) {
        return ((FetchMinimumInvestAmountUseCase$calculateSmartArbitrageMinInvest$2$arbitrageInfoDeferred$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return obj;
        }
        C56391yDq.AEQbTJ(obj);
        wTM wtm = this.this$0.KWHzl;
        wTM.Activity activity = new wTM.Activity(this.$input.KWHzl(), this.$input.AhwBna(), this.$input.EZpvd(), null, null, "open", this.$input.copydefault(), this.$input.OLrzqt(), null, 280, null);
        this.label = 1;
        Object objKWHzl = wtm.KWHzl(activity, this);
        return objKWHzl == objCopydefault ? objCopydefault : objKWHzl;
    }
}
