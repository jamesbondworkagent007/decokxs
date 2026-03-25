package com.okinc.im.imui.capture;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C35773oDd;
import o.C56391yDq;
import o.C56442yFn;
import o.oCS;

/* JADX INFO: loaded from: classes8.dex */
public final class BroadcastMessageSightRecordActivityViewModel$confirmSend$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $onConfirm;
    final /* synthetic */ Function0<Unit> $onProceed;
    int label;
    final /* synthetic */ BroadcastMessageSightRecordActivityViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastMessageSightRecordActivityViewModel$confirmSend$1(BroadcastMessageSightRecordActivityViewModel broadcastMessageSightRecordActivityViewModel, Function0<Unit> function0, Function0<Unit> function02, Continuation<? super BroadcastMessageSightRecordActivityViewModel$confirmSend$1> continuation) {
        super(2, continuation);
        this.this$0 = broadcastMessageSightRecordActivityViewModel;
        this.$onConfirm = function0;
        this.$onProceed = function02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BroadcastMessageSightRecordActivityViewModel$confirmSend$1(this.this$0, this.$onConfirm, this.$onProceed, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BroadcastMessageSightRecordActivityViewModel$confirmSend$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            oCS ocs = this.this$0.copydefault;
            this.label = 1;
            obj = ocs.OLrzqt(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (((C35773oDd) obj) != null) {
            this.$onConfirm.invoke();
        } else {
            this.$onProceed.invoke();
        }
        return Unit.INSTANCE;
    }
}
