package com.okinc.tradingbot.impl.order.strategy;

import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC49495upd;
import o.ActivityC52122vzt;
import o.C52478wMx;
import o.C54589xNz;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC54581xNr;
import o.xOU;

/* JADX INFO: loaded from: classes11.dex */
public final class BotTradeActivity$subscribeOnUIChange$6$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BizInstrument $it;
    int label;
    final /* synthetic */ ActivityC52122vzt this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotTradeActivity$subscribeOnUIChange$6$1(ActivityC52122vzt activityC52122vzt, BizInstrument bizInstrument, Continuation<? super BotTradeActivity$subscribeOnUIChange$6$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC52122vzt;
        this.$it = bizInstrument;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BotTradeActivity$subscribeOnUIChange$6$1(this.this$0, this.$it, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotTradeActivity$subscribeOnUIChange$6$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        xOU xouWlaJM;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C52478wMx c52478wMxAkhnZx = ActivityC52122vzt.AEQbTJ(this.this$0).AkhnZx();
            Boolean boolKWHzl = C56443yFo.KWHzl(false);
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            String strOLrzqt = (interfaceC54581xNrOLrzqt == null || (xouWlaJM = interfaceC54581xNrOLrzqt.wlaJM()) == null) ? null : xouWlaJM.OLrzqt();
            BizInstrument bizInstrument = this.$it;
            String instId = bizInstrument != null ? bizInstrument.getInstId() : null;
            BizInstrument bizInstrument2 = this.$it;
            String instType = bizInstrument2 != null ? bizInstrument2.getInstType() : null;
            this.label = 1;
            if (AbstractC49495upd.routeInnerRefreshLoader$default(c52478wMxAkhnZx, boolKWHzl, strOLrzqt, instId, instType, null, this, 16, null) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
