package com.okinc.tradingbot.impl.aiBot.domain.usecase;

import com.okinc.unify_trade.biz.AiOrderReq;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o.C56391yDq;
import o.C56442yFn;
import o.uCJ;
import o.uCN;

/* JADX INFO: loaded from: classes11.dex */
public final class GetBacktestRerunConfigUseCase$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super uCN.StateListAnimator>, Object> {
    final /* synthetic */ String $input;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ uCN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetBacktestRerunConfigUseCase$execute$2(uCN ucn, String str, Continuation<? super GetBacktestRerunConfigUseCase$execute$2> continuation) {
        super(2, continuation);
        this.this$0 = ucn;
        this.$input = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GetBacktestRerunConfigUseCase$execute$2 getBacktestRerunConfigUseCase$execute$2 = new GetBacktestRerunConfigUseCase$execute$2(this.this$0, this.$input, continuation);
        getBacktestRerunConfigUseCase$execute$2.L$0 = obj;
        return getBacktestRerunConfigUseCase$execute$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super uCN.StateListAnimator> continuation) {
        return ((GetBacktestRerunConfigUseCase$execute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0082  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Deferred deferredAsync$default;
        AiOrderReq aiOrderReq;
        AiOrderReq aiOrderReq2;
        String str;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            deferredAsync$default = BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.L$0, null, null, new GetBacktestRerunConfigUseCase$execute$2$intervalsDeferred$1(this.this$0, null), 3, null);
            uCJ ucj = this.this$0.OLrzqt;
            uCJ.TaskDescription taskDescription = new uCJ.TaskDescription(this.$input, true);
            this.L$0 = deferredAsync$default;
            this.label = 1;
            obj = ucj.KWHzl(taskDescription, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aiOrderReq = (AiOrderReq) this.L$1;
                aiOrderReq2 = (AiOrderReq) this.L$0;
                C56391yDq.AEQbTJ(obj);
                str = (String) ((Map) obj).get(aiOrderReq2.getDataSetting().getAiThinkingInterval());
                if (str == null) {
                    str = "";
                }
                return new uCN.StateListAnimator(aiOrderReq, str);
            }
            deferredAsync$default = (Deferred) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        AiOrderReq aiOrderReqOLrzqt = ((uCJ.StateListAnimator) obj).OLrzqt();
        this.L$0 = aiOrderReqOLrzqt;
        this.L$1 = aiOrderReqOLrzqt;
        this.label = 2;
        Object objAwait = deferredAsync$default.await(this);
        if (objAwait == objCopydefault) {
            return objCopydefault;
        }
        aiOrderReq = aiOrderReqOLrzqt;
        obj = objAwait;
        aiOrderReq2 = aiOrderReq;
        str = (String) ((Map) obj).get(aiOrderReq2.getDataSetting().getAiThinkingInterval());
        if (str == null) {
        }
        return new uCN.StateListAnimator(aiOrderReq, str);
    }
}
