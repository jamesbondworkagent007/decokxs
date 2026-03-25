package com.okinc.im.imui.broadcastmessages.messagelist;

import com.okinc.okimcore.model.im.OKMessage;
import java.util.Collection;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C35254nrp;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class BroadcastMessageListFragmentViewModel$retryMessage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $messagePosition;
    int label;
    final /* synthetic */ BroadcastMessageListFragmentViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastMessageListFragmentViewModel$retryMessage$1(BroadcastMessageListFragmentViewModel broadcastMessageListFragmentViewModel, int i, Continuation<? super BroadcastMessageListFragmentViewModel$retryMessage$1> continuation) {
        super(2, continuation);
        this.this$0 = broadcastMessageListFragmentViewModel;
        this.$messagePosition = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BroadcastMessageListFragmentViewModel$retryMessage$1(this.this$0, this.$messagePosition, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BroadcastMessageListFragmentViewModel$retryMessage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C35254nrp c35254nrp = (C35254nrp) CollectionsKt___CollectionsKt.AkhnZx(CollectionsKt___CollectionsKt.fJNWhG((Collection) CollectionsKt___CollectionsKt.AuCTelauCTel(this.this$0.OLrzqt().getReplayCache())), this.$messagePosition);
            OKMessage oKMessageOLrzqt = c35254nrp != null ? c35254nrp.OLrzqt() : null;
            if (oKMessageOLrzqt != null) {
                MutableSharedFlow mutableSharedFlow = this.this$0.copydefault;
                this.label = 1;
                if (mutableSharedFlow.emit(oKMessageOLrzqt, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                return Unit.INSTANCE;
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
