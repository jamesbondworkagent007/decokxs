package com.okinc.kline.ui.bot;

import com.okinc.kline.api.bean.IBotOrdersDataBean;
import com.okinc.kline.data.BotPendingLineVo;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o.C39031pkd;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class GetBotOrderDataUseCase$onExecute$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super BotPendingLineVo>, Object> {
    final /* synthetic */ IBotOrdersDataBean $input;
    final /* synthetic */ C39031pkd $this_runCatching;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetBotOrderDataUseCase$onExecute$2$1(C39031pkd c39031pkd, IBotOrdersDataBean iBotOrdersDataBean, Continuation<? super GetBotOrderDataUseCase$onExecute$2$1> continuation) {
        super(2, continuation);
        this.$this_runCatching = c39031pkd;
        this.$input = iBotOrdersDataBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GetBotOrderDataUseCase$onExecute$2$1 getBotOrderDataUseCase$onExecute$2$1 = new GetBotOrderDataUseCase$onExecute$2$1(this.$this_runCatching, this.$input, continuation);
        getBotOrderDataUseCase$onExecute$2$1.L$0 = obj;
        return getBotOrderDataUseCase$onExecute$2$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super BotPendingLineVo> continuation) {
        return ((GetBotOrderDataUseCase$onExecute$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0113  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        BotPendingLineVo botPendingLineVo;
        C39031pkd c39031pkd;
        Object objAwait;
        IBotOrdersDataBean iBotOrdersDataBean;
        Deferred deferred;
        BotPendingLineVo botPendingLineVo2;
        BotPendingLineVo botPendingLineVo3;
        Object objAwait2;
        BotPendingLineVo botPendingLineVo4;
        IBotOrdersDataBean iBotOrdersDataBean2;
        BotPendingLineVo botPendingLineVo5;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new GetBotOrderDataUseCase$onExecute$2$1$buyListDeferred$1(this.$this_runCatching, this.$input, null), 3, null);
            Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new GetBotOrderDataUseCase$onExecute$2$1$sellListDeferred$1(this.$this_runCatching, this.$input, null), 3, null);
            botPendingLineVo = new BotPendingLineVo(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
            IBotOrdersDataBean iBotOrdersDataBean3 = this.$input;
            c39031pkd = this.$this_runCatching;
            botPendingLineVo.setType(iBotOrdersDataBean3.getType());
            this.L$0 = deferredAsync$default2;
            this.L$1 = botPendingLineVo;
            this.L$2 = iBotOrdersDataBean3;
            this.L$3 = c39031pkd;
            this.L$4 = botPendingLineVo;
            this.L$5 = botPendingLineVo;
            this.label = 1;
            objAwait = deferredAsync$default.await(this);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
            iBotOrdersDataBean = iBotOrdersDataBean3;
            deferred = deferredAsync$default2;
            botPendingLineVo2 = botPendingLineVo;
            botPendingLineVo3 = botPendingLineVo2;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                botPendingLineVo4 = (BotPendingLineVo) this.L$4;
                botPendingLineVo = (BotPendingLineVo) this.L$3;
                C39031pkd c39031pkd2 = (C39031pkd) this.L$2;
                iBotOrdersDataBean2 = (IBotOrdersDataBean) this.L$1;
                botPendingLineVo5 = (BotPendingLineVo) this.L$0;
                C56391yDq.AEQbTJ(obj);
                c39031pkd = c39031pkd2;
                objAwait2 = obj;
                botPendingLineVo4.setSellList((ArrayList) objAwait2);
                botPendingLineVo.setLiqPrice(iBotOrdersDataBean2.getLiqPrice());
                botPendingLineVo.setTpPrice(iBotOrdersDataBean2.getTpPrice());
                botPendingLineVo.setSlPrice(iBotOrdersDataBean2.getSlPrice());
                botPendingLineVo.setStartTriggerPrice(iBotOrdersDataBean2.getStartTriggerPrice());
                botPendingLineVo.setStopTriggerPrice(iBotOrdersDataBean2.getStopTriggerPrice());
                Pair<String, String> initialOrderPair = iBotOrdersDataBean2.getInitialOrderPair();
                botPendingLineVo.setInitialOrder(initialOrderPair != null ? c39031pkd.OLrzqt(initialOrderPair) : null);
                botPendingLineVo.setFillSafetyOrds(iBotOrdersDataBean2.getFillSafetyOrds());
                return botPendingLineVo5;
            }
            BotPendingLineVo botPendingLineVo6 = (BotPendingLineVo) this.L$5;
            BotPendingLineVo botPendingLineVo7 = (BotPendingLineVo) this.L$4;
            C39031pkd c39031pkd3 = (C39031pkd) this.L$3;
            IBotOrdersDataBean iBotOrdersDataBean4 = (IBotOrdersDataBean) this.L$2;
            BotPendingLineVo botPendingLineVo8 = (BotPendingLineVo) this.L$1;
            Deferred deferred2 = (Deferred) this.L$0;
            C56391yDq.AEQbTJ(obj);
            deferred = deferred2;
            botPendingLineVo3 = botPendingLineVo8;
            iBotOrdersDataBean = iBotOrdersDataBean4;
            c39031pkd = c39031pkd3;
            botPendingLineVo2 = botPendingLineVo6;
            botPendingLineVo = botPendingLineVo7;
            objAwait = obj;
        }
        botPendingLineVo2.setBuyList((ArrayList) objAwait);
        this.L$0 = botPendingLineVo3;
        this.L$1 = iBotOrdersDataBean;
        this.L$2 = c39031pkd;
        this.L$3 = botPendingLineVo;
        this.L$4 = botPendingLineVo;
        this.L$5 = null;
        this.label = 2;
        objAwait2 = deferred.await(this);
        if (objAwait2 == objCopydefault) {
            return objCopydefault;
        }
        botPendingLineVo4 = botPendingLineVo;
        iBotOrdersDataBean2 = iBotOrdersDataBean;
        botPendingLineVo5 = botPendingLineVo3;
        botPendingLineVo4.setSellList((ArrayList) objAwait2);
        botPendingLineVo.setLiqPrice(iBotOrdersDataBean2.getLiqPrice());
        botPendingLineVo.setTpPrice(iBotOrdersDataBean2.getTpPrice());
        botPendingLineVo.setSlPrice(iBotOrdersDataBean2.getSlPrice());
        botPendingLineVo.setStartTriggerPrice(iBotOrdersDataBean2.getStartTriggerPrice());
        botPendingLineVo.setStopTriggerPrice(iBotOrdersDataBean2.getStopTriggerPrice());
        Pair<String, String> initialOrderPair2 = iBotOrdersDataBean2.getInitialOrderPair();
        botPendingLineVo.setInitialOrder(initialOrderPair2 != null ? c39031pkd.OLrzqt(initialOrderPair2) : null);
        botPendingLineVo.setFillSafetyOrds(iBotOrdersDataBean2.getFillSafetyOrds());
        return botPendingLineVo5;
    }
}
