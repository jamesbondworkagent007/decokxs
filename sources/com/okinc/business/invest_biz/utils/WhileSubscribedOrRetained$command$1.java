package com.okinc.business.invest_biz.utils;

import android.view.Choreographer;
import com.okinc.business.invest_biz.utils.WhileSubscribedOrRetained$command$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharingCommand;
import o.C27549jxL;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes6.dex */
public final class WhileSubscribedOrRetained$command$1 extends SuspendLambda implements yHO<FlowCollector<? super SharingCommand>, Integer, Continuation<? super Unit>, Object> {
    /* synthetic */ int I$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WhileSubscribedOrRetained$command$1(Continuation<? super WhileSubscribedOrRetained$command$1> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* synthetic */ Object invoke(FlowCollector<? super SharingCommand> flowCollector, Integer num, Continuation<? super Unit> continuation) {
        return invoke(flowCollector, num.intValue(), continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(FlowCollector<? super SharingCommand> flowCollector, int i, Continuation<? super Unit> continuation) {
        WhileSubscribedOrRetained$command$1 whileSubscribedOrRetained$command$1 = new WhileSubscribedOrRetained$command$1(continuation);
        whileSubscribedOrRetained$command$1.L$0 = flowCollector;
        whileSubscribedOrRetained$command$1.I$0 = i;
        return whileSubscribedOrRetained$command$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        FlowCollector flowCollector;
        SharingCommand sharingCommand;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    flowCollector = (FlowCollector) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    sharingCommand = SharingCommand.STOP;
                    this.L$0 = null;
                    this.label = 3;
                    if (flowCollector.emit(sharingCommand, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            C56391yDq.AEQbTJ(obj);
        } else {
            C56391yDq.AEQbTJ(obj);
            flowCollector = (FlowCollector) this.L$0;
            if (this.I$0 > 0) {
                SharingCommand sharingCommand2 = SharingCommand.START;
                this.label = 1;
                if (flowCollector.emit(sharingCommand2, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                final CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: o.jxH
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.Choreographer.FrameCallback
                    public final void doFrame(long j) {
                        WhileSubscribedOrRetained$command$1.invokeSuspend$lambda$2(completableDeferredCompletableDeferred$default, j);
                    }
                });
                this.L$0 = flowCollector;
                this.label = 2;
                if (completableDeferredCompletableDeferred$default.await(this) == objCopydefault) {
                    return objCopydefault;
                }
                sharingCommand = SharingCommand.STOP;
                this.L$0 = null;
                this.label = 3;
                if (flowCollector.emit(sharingCommand, this) == objCopydefault) {
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$2(final CompletableDeferred completableDeferred, long j) {
        C27549jxL.copydefault.postAtFrontOfQueue(new Runnable() { // from class: o.jxJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                WhileSubscribedOrRetained$command$1.invokeSuspend$lambda$2$lambda$1(completableDeferred);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$2$lambda$1(final CompletableDeferred completableDeferred) {
        C27549jxL.copydefault.post(new Runnable() { // from class: o.jxK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                WhileSubscribedOrRetained$command$1.invokeSuspend$lambda$2$lambda$1$lambda$0(completableDeferred);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$2$lambda$1$lambda$0(CompletableDeferred completableDeferred) {
        completableDeferred.complete(Unit.INSTANCE);
    }
}
