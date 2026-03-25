package com.okinc.im.call.domain;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC35264nrz;
import o.C35225nrM;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC35234nrV;

/* JADX INFO: loaded from: classes8.dex */
public final class GroupCallManager$handleGroupCallEnded$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C35225nrM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupCallManager$handleGroupCallEnded$1(C35225nrM c35225nrM, Continuation<? super GroupCallManager$handleGroupCallEnded$1> continuation) {
        super(2, continuation);
        this.this$0 = c35225nrM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GroupCallManager$handleGroupCallEnded$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GroupCallManager$handleGroupCallEnded$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC35234nrV interfaceC35234nrV = this.this$0.AYXKKw;
            this.label = 1;
            if (interfaceC35234nrV.EZpvd(this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        C35225nrM.Application application = this.this$0.KWHzl;
        if (application == null) {
            Intrinsics.gEmmrt("");
            application = null;
        }
        application.AEQbTJ(AbstractC35264nrz.TaskStackBuilder.KWHzl);
        this.this$0.AEQbTJ();
        return Unit.INSTANCE;
    }
}
