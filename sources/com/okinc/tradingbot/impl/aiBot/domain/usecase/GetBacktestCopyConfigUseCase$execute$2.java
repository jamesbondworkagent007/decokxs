package com.okinc.tradingbot.impl.aiBot.domain.usecase;

import com.okinc.tradingbot.impl.aiBot.dto.AiHomeDto;
import com.okinc.unify_trade.biz.AiOrderReq;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o.C56391yDq;
import o.C56442yFn;
import o.uCG;

/* JADX INFO: loaded from: classes11.dex */
public final class GetBacktestCopyConfigUseCase$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super uCG.Activity>, Object> {
    final /* synthetic */ uCG.StateListAnimator $input;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ uCG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetBacktestCopyConfigUseCase$execute$2(uCG ucg, uCG.StateListAnimator stateListAnimator, Continuation<? super GetBacktestCopyConfigUseCase$execute$2> continuation) {
        super(2, continuation);
        this.this$0 = ucg;
        this.$input = stateListAnimator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GetBacktestCopyConfigUseCase$execute$2 getBacktestCopyConfigUseCase$execute$2 = new GetBacktestCopyConfigUseCase$execute$2(this.this$0, this.$input, continuation);
        getBacktestCopyConfigUseCase$execute$2.L$0 = obj;
        return getBacktestCopyConfigUseCase$execute$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super uCG.Activity> continuation) {
        return ((GetBacktestCopyConfigUseCase$execute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Deferred deferred;
        AiOrderReq aiOrderReq;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new GetBacktestCopyConfigUseCase$execute$2$copyConfigDeferred$1(this.this$0, this.$input, null), 3, null);
            Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new GetBacktestCopyConfigUseCase$execute$2$aiHomeDeferred$1(this.this$0, null), 3, null);
            this.L$0 = deferredAsync$default2;
            this.label = 1;
            Object objAwait = deferredAsync$default.await(this);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
            deferred = deferredAsync$default2;
            obj = objAwait;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aiOrderReq = (AiOrderReq) this.L$0;
                C56391yDq.AEQbTJ(obj);
                return new uCG.Activity(aiOrderReq, (AiHomeDto) obj);
            }
            deferred = (Deferred) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        AiOrderReq aiOrderReq2 = (AiOrderReq) obj;
        this.L$0 = aiOrderReq2;
        this.label = 2;
        Object objAwait2 = deferred.await(this);
        if (objAwait2 == objCopydefault) {
            return objCopydefault;
        }
        aiOrderReq = aiOrderReq2;
        obj = objAwait2;
        return new uCG.Activity(aiOrderReq, (AiHomeDto) obj);
    }
}
