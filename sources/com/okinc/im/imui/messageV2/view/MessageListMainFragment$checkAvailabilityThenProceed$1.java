package com.okinc.im.imui.messageV2.view;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import o.C36442oaz;
import o.C36609oeG;
import o.C37127onv;
import o.C56391yDq;
import o.C56442yFn;
import o.sDN;
import o.sNK;

/* JADX INFO: loaded from: classes18.dex */
public final class MessageListMainFragment$checkAvailabilityThenProceed$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $targetId;
    final /* synthetic */ List<String> $uidList;
    int label;
    final /* synthetic */ C36609oeG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListMainFragment$checkAvailabilityThenProceed$1(C36609oeG c36609oeG, String str, List<String> list, Continuation<? super MessageListMainFragment$checkAvailabilityThenProceed$1> continuation) {
        super(2, continuation);
        this.this$0 = c36609oeG;
        this.$targetId = str;
        this.$uidList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MessageListMainFragment$checkAvailabilityThenProceed$1(this.this$0, this.$targetId, this.$uidList, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MessageListMainFragment$checkAvailabilityThenProceed$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineDispatcher coroutineDispatcherCopydefault = sDN.copydefault.copydefault();
            MessageListMainFragment$checkAvailabilityThenProceed$1$result$1 messageListMainFragment$checkAvailabilityThenProceed$1$result$1 = new MessageListMainFragment$checkAvailabilityThenProceed$1$result$1(this.$targetId, null);
            this.label = 1;
            obj = BuildersKt.withContext(coroutineDispatcherCopydefault, messageListMainFragment$checkAvailabilityThenProceed$1$result$1, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        sNK snk = (sNK) obj;
        if (snk instanceof sNK.Application) {
            this.this$0.copydefault(this.$targetId, (List<String>) this.$uidList);
        } else {
            C37127onv.AEQbTJ.copydefault(C36442oaz.EZpvd.EZpvd(snk));
        }
        return Unit.INSTANCE;
    }
}
