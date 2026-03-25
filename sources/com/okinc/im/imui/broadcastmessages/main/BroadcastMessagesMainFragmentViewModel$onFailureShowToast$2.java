package com.okinc.im.imui.broadcastmessages.main;

import com.okinc.im.imui.messageV2.model.StringResource;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C43422row;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class BroadcastMessagesMainFragmentViewModel$onFailureShowToast$2 extends SuspendLambda implements yHO<FlowCollector<? super Object>, Throwable, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BroadcastMessagesMainFragmentViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastMessagesMainFragmentViewModel$onFailureShowToast$2(BroadcastMessagesMainFragmentViewModel broadcastMessagesMainFragmentViewModel, Continuation<? super BroadcastMessagesMainFragmentViewModel$onFailureShowToast$2> continuation) {
        super(3, continuation);
        this.this$0 = broadcastMessagesMainFragmentViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Object> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<Object>) flowCollector, th, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<Object> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        BroadcastMessagesMainFragmentViewModel$onFailureShowToast$2 broadcastMessagesMainFragmentViewModel$onFailureShowToast$2 = new BroadcastMessagesMainFragmentViewModel$onFailureShowToast$2(this.this$0, continuation);
        broadcastMessagesMainFragmentViewModel$onFailureShowToast$2.L$0 = th;
        return broadcastMessagesMainFragmentViewModel$onFailureShowToast$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            String message = C43422row.OLrzqt((Throwable) this.L$0).getMessage();
            if (message != null) {
                MutableSharedFlow mutableSharedFlow = this.this$0.KWHzl;
                StringResource.Raw raw = new StringResource.Raw(message);
                this.label = 1;
                if (mutableSharedFlow.emit(raw, this) == objCopydefault) {
                    return objCopydefault;
                }
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
