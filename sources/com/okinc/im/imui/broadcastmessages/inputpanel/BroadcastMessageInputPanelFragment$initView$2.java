package com.okinc.im.imui.broadcastmessages.inputpanel;

import com.okinc.im.config.serviceprovider.GeneralAction;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C35290nsY;
import o.C35454nvf;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes15.dex */
public final class BroadcastMessageInputPanelFragment$initView$2 extends SuspendLambda implements Function2<GeneralAction, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C35454nvf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastMessageInputPanelFragment$initView$2(C35454nvf c35454nvf, Continuation<? super BroadcastMessageInputPanelFragment$initView$2> continuation) {
        super(2, continuation);
        this.this$0 = c35454nvf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BroadcastMessageInputPanelFragment$initView$2 broadcastMessageInputPanelFragment$initView$2 = new BroadcastMessageInputPanelFragment$initView$2(this.this$0, continuation);
        broadcastMessageInputPanelFragment$initView$2.L$0 = obj;
        return broadcastMessageInputPanelFragment$initView$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GeneralAction generalAction, Continuation<? super Unit> continuation) {
        return ((BroadcastMessageInputPanelFragment$initView$2) create(generalAction, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C35290nsY.copydefault(this.this$0, (GeneralAction) this.L$0);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
