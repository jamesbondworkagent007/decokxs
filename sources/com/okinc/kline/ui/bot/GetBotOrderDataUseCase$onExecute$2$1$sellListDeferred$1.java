package com.okinc.kline.ui.bot;

import com.okinc.kline.api.bean.IBotOrdersDataBean;
import com.okinc.kline.data.BotOrderItem;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C39031pkd;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class GetBotOrderDataUseCase$onExecute$2$1$sellListDeferred$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ArrayList<BotOrderItem>>, Object> {
    final /* synthetic */ IBotOrdersDataBean $input;
    final /* synthetic */ C39031pkd $this_runCatching;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetBotOrderDataUseCase$onExecute$2$1$sellListDeferred$1(C39031pkd c39031pkd, IBotOrdersDataBean iBotOrdersDataBean, Continuation<? super GetBotOrderDataUseCase$onExecute$2$1$sellListDeferred$1> continuation) {
        super(2, continuation);
        this.$this_runCatching = c39031pkd;
        this.$input = iBotOrdersDataBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetBotOrderDataUseCase$onExecute$2$1$sellListDeferred$1(this.$this_runCatching, this.$input, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ArrayList<BotOrderItem>> continuation) {
        return ((GetBotOrderDataUseCase$onExecute$2$1$sellListDeferred$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return this.$this_runCatching.EZpvd(this.$input.getSellListPairs());
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
