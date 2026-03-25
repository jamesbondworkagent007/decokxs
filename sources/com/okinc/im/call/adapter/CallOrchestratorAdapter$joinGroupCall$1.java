package com.okinc.im.call.adapter;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC35221nrI;
import o.AbstractC35226nrN;
import o.C35217nrE;
import o.C35255nrq;
import o.C35258nrt;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC35336ntR;

/* JADX INFO: loaded from: classes8.dex */
public final class CallOrchestratorAdapter$joinGroupCall$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<InterfaceC35336ntR, Unit> $errorCallback;
    final /* synthetic */ String $groupId;
    final /* synthetic */ Function0<Unit> $onSuccess;
    int label;
    final /* synthetic */ C35255nrq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super o.ntR, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CallOrchestratorAdapter$joinGroupCall$1(C35255nrq c35255nrq, String str, Function0<Unit> function0, Function1<? super InterfaceC35336ntR, Unit> function1, Continuation<? super CallOrchestratorAdapter$joinGroupCall$1> continuation) {
        super(2, continuation);
        this.this$0 = c35255nrq;
        this.$groupId = str;
        this.$onSuccess = function0;
        this.$errorCallback = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CallOrchestratorAdapter$joinGroupCall$1(this.this$0, this.$groupId, this.$onSuccess, this.$errorCallback, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CallOrchestratorAdapter$joinGroupCall$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C35217nrE c35217nrE = this.this$0.KWHzl;
            String str = this.$groupId;
            this.label = 1;
            obj = c35217nrE.copydefault(str, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC35226nrN abstractC35226nrN = (AbstractC35226nrN) obj;
        C35255nrq c35255nrq = this.this$0;
        Function0<Unit> function0 = this.$onSuccess;
        if (abstractC35226nrN instanceof AbstractC35226nrN.ActionBar) {
            c35255nrq.copydefault("joinGroupCall: Successfully joined");
            function0.invoke();
        }
        C35255nrq c35255nrq2 = this.this$0;
        Function1<InterfaceC35336ntR, Unit> function1 = this.$errorCallback;
        if (abstractC35226nrN instanceof AbstractC35226nrN.Application) {
            AbstractC35221nrI abstractC35221nrIOLrzqt = ((AbstractC35226nrN.Application) abstractC35226nrN).OLrzqt();
            c35255nrq2.copydefault("joinGroupCall: Error - " + abstractC35221nrIOLrzqt.AEQbTJ());
            if (function1 != null) {
                function1.invoke(C35258nrt.EZpvd(abstractC35221nrIOLrzqt));
            }
        }
        return Unit.INSTANCE;
    }
}
