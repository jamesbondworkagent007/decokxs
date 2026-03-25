package com.okinc.unify_trade.core.ws;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.BotUserSummaryReq;
import com.okinc.unify_trade.core.ws.BotUserSummaryTask$queryUserSummary$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o.C54326xEg;
import o.C56200xyN;
import o.C56391yDq;
import o.C56442yFn;
import o.xAF;
import o.xKK;

/* JADX INFO: loaded from: classes12.dex */
public final class BotUserSummaryTask$queryUserSummary$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C54326xEg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotUserSummaryTask$queryUserSummary$1(C54326xEg c54326xEg, Continuation<? super BotUserSummaryTask$queryUserSummary$1> continuation) {
        super(2, continuation);
        this.this$0 = c54326xEg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BotUserSummaryTask$queryUserSummary$1 botUserSummaryTask$queryUserSummary$1 = new BotUserSummaryTask$queryUserSummary$1(this.this$0, continuation);
        botUserSummaryTask$queryUserSummary$1.L$0 = obj;
        return botUserSummaryTask$queryUserSummary$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotUserSummaryTask$queryUserSummary$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        BotUserSummaryReq botUserSummaryReqEZpvd;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            final Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.L$0, null, null, new BotUserSummaryTask$queryUserSummary$1$data$1(this.this$0, null), 3, null);
            C56200xyN c56200xyN = this.this$0.gEmmrt;
            final C54326xEg c54326xEg = this.this$0;
            xAF xaf = c54326xEg.AYXKKw;
            c56200xyN.OLrzqt((xaf == null || (botUserSummaryReqEZpvd = xaf.EZpvd()) == null) ? null : botUserSummaryReqEZpvd.getOrderType());
            c56200xyN.KWHzl(new Function1() { // from class: o.xEl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return BotUserSummaryTask$queryUserSummary$1.invokeSuspend$lambda$1$lambda$0(c54326xEg, deferredAsync$default, (ResponseData) obj2);
                }
            });
            xKK.Activity.execute$default(c56200xyN, 0L, 1, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1$lambda$0(C54326xEg c54326xEg, Deferred deferred, ResponseData responseData) {
        BuildersKt__Builders_commonKt.launch$default(c54326xEg.KWHzl(), c54326xEg.valueOf(), null, new BotUserSummaryTask$queryUserSummary$1$1$1$1(responseData, deferred, c54326xEg, null), 2, null);
        return Unit.INSTANCE;
    }
}
