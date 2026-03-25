package com.okinc.kline.ui.trade;

import com.okinc.kline.api.bean.IBotOrdersDataBean;
import com.okinc.kline.data.BotPendingLineVo;
import com.okinc.kline.ui.bot.KlineBotViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C36250oUv;
import o.C39678pwq;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class TradeHeaderKlineFragment$setBotOrdersData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ IBotOrdersDataBean $iBotOrdersDataBean;
    int label;
    final /* synthetic */ C39678pwq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeHeaderKlineFragment$setBotOrdersData$1(C39678pwq c39678pwq, IBotOrdersDataBean iBotOrdersDataBean, Continuation<? super TradeHeaderKlineFragment$setBotOrdersData$1> continuation) {
        super(2, continuation);
        this.this$0 = c39678pwq;
        this.$iBotOrdersDataBean = iBotOrdersDataBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradeHeaderKlineFragment$setBotOrdersData$1(this.this$0, this.$iBotOrdersDataBean, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TradeHeaderKlineFragment$setBotOrdersData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C36250oUv c36250oUv;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            KlineBotViewModel klineBotViewModelFJNWhG = this.this$0.fJNWhG();
            IBotOrdersDataBean iBotOrdersDataBean = this.$iBotOrdersDataBean;
            this.label = 1;
            obj = klineBotViewModelFJNWhG.EZpvd(iBotOrdersDataBean, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        BotPendingLineVo botPendingLineVo = (BotPendingLineVo) obj;
        if (botPendingLineVo != null && (c36250oUv = this.this$0.hDKMBd) != null) {
            c36250oUv.setBotOrdersData(botPendingLineVo);
        }
        return Unit.INSTANCE;
    }
}
