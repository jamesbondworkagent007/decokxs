package com.okinc.okimcore.channel.inhouse.impl;

import com.okinc.okimcore.model.im.OKMessage;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C44138sEs;
import o.C44502sSe;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC44289sKh;

/* JADX INFO: loaded from: classes10.dex */
public final class InHouseIMSendImpl$sendNormalMessageOnChannel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC44289sKh $callback;
    final /* synthetic */ OKMessage $message;
    int label;
    final /* synthetic */ C44138sEs this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InHouseIMSendImpl$sendNormalMessageOnChannel$1(C44138sEs c44138sEs, OKMessage oKMessage, InterfaceC44289sKh interfaceC44289sKh, Continuation<? super InHouseIMSendImpl$sendNormalMessageOnChannel$1> continuation) {
        super(2, continuation);
        this.this$0 = c44138sEs;
        this.$message = oKMessage;
        this.$callback = interfaceC44289sKh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InHouseIMSendImpl$sendNormalMessageOnChannel$1(this.this$0, this.$message, this.$callback, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InHouseIMSendImpl$sendNormalMessageOnChannel$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C44138sEs c44138sEs = this.this$0;
            Flow<C44502sSe.StateListAnimator> flowAEQbTJ = c44138sEs.AEQbTJ(c44138sEs.EZpvd.AkhnZx().KWHzl(this.$message), this.$message, this.$callback);
            this.label = 1;
            if (FlowKt.collect(flowAEQbTJ, this) == objCopydefault) {
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
