package com.okinc.oklive.app.ui.list.viewmodel;

import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.oklive.app.ui.list.displaymodel.LiveStreamCustomMessageUpdate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.sUN;

/* JADX INFO: loaded from: classes19.dex */
public final class LivestreamListViewModel$startCustomMessageListenerForChannel$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OKMessage $message;
    int label;
    final /* synthetic */ sUN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivestreamListViewModel$startCustomMessageListenerForChannel$1$1(sUN sun, OKMessage oKMessage, Continuation<? super LivestreamListViewModel$startCustomMessageListenerForChannel$1$1> continuation) {
        super(2, continuation);
        this.this$0 = sun;
        this.$message = oKMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LivestreamListViewModel$startCustomMessageListenerForChannel$1$1(this.this$0, this.$message, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LivestreamListViewModel$startCustomMessageListenerForChannel$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Flow<LiveStreamCustomMessageUpdate> flowCopydefault = this.this$0.AubY.copydefault(this.$message);
                final sUN sun = this.this$0;
                FlowCollector<? super LiveStreamCustomMessageUpdate> flowCollector = new FlowCollector() { // from class: com.okinc.oklive.app.ui.list.viewmodel.LivestreamListViewModel$startCustomMessageListenerForChannel$1$1.3
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                    public final Object emit(LiveStreamCustomMessageUpdate liveStreamCustomMessageUpdate, Continuation<? super Unit> continuation) {
                        sun.OLrzqt(liveStreamCustomMessageUpdate);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowCopydefault.collect(flowCollector, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
        } catch (Exception e) {
            pUU.AEQbTJ("LivestreamListViewModel", "Error processing custom message", e);
        }
        return Unit.INSTANCE;
    }
}
