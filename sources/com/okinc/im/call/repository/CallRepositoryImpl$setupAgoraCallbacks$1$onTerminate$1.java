package com.okinc.im.call.repository;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC35238nrZ;
import o.C35235nrW;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes15.dex */
public final class CallRepositoryImpl$setupAgoraCallbacks$1$onTerminate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Integer $errorCode;
    int label;
    final /* synthetic */ C35235nrW this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallRepositoryImpl$setupAgoraCallbacks$1$onTerminate$1(C35235nrW c35235nrW, Integer num, Continuation<? super CallRepositoryImpl$setupAgoraCallbacks$1$onTerminate$1> continuation) {
        super(2, continuation);
        this.this$0 = c35235nrW;
        this.$errorCode = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CallRepositoryImpl$setupAgoraCallbacks$1$onTerminate$1(this.this$0, this.$errorCode, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CallRepositoryImpl$setupAgoraCallbacks$1$onTerminate$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            String strOLrzqt = this.this$0.OLrzqt.OLrzqt(this.$errorCode.intValue());
            C35235nrW.logError$default(this.this$0, "Agora terminated with error: " + this.$errorCode + " - " + strOLrzqt, null, 2, null);
            MutableSharedFlow mutableSharedFlow = this.this$0.EZpvd;
            AbstractC35238nrZ.Activity activity = new AbstractC35238nrZ.Activity(this.$errorCode.intValue(), strOLrzqt);
            this.label = 1;
            if (mutableSharedFlow.emit(activity, this) == objCopydefault) {
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
