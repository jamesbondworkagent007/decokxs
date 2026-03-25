package com.okinc.im.imui.conversation.message.provider;

import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import o.C33674nBq;
import o.C44385sNw;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.sDN;

/* JADX INFO: loaded from: classes18.dex */
public final class FileSendMessageViewProvider$attachProgressObserver$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $messageId;
    int label;
    final /* synthetic */ C33674nBq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSendMessageViewProvider$attachProgressObserver$2(C33674nBq c33674nBq, String str, Continuation<? super FileSendMessageViewProvider$attachProgressObserver$2> continuation) {
        super(2, continuation);
        this.this$0 = c33674nBq;
        this.$messageId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FileSendMessageViewProvider$attachProgressObserver$2(this.this$0, this.$messageId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FileSendMessageViewProvider$attachProgressObserver$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.EZpvd(this.this$0.uzCIH(), "[" + C33674nBq.Companion.KWHzl(this.$messageId) + "] observer coroutine: started collecting");
            SharedFlow<C44385sNw.TaskDescription> sharedFlowEZpvd = C44385sNw.KWHzl.EZpvd(this.$messageId);
            final C33674nBq c33674nBq = this.this$0;
            final String str = this.$messageId;
            FlowCollector<? super C44385sNw.TaskDescription> flowCollector = new FlowCollector() { // from class: com.okinc.im.imui.conversation.message.provider.FileSendMessageViewProvider$attachProgressObserver$2.2
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
                public final Object emit(C44385sNw.TaskDescription taskDescription, Continuation<? super Unit> continuation) {
                    pUU.EZpvd(c33674nBq.uzCIH(), "[" + C33674nBq.Companion.KWHzl(str) + "] observer coroutine: received event=" + taskDescription);
                    Object objWithContext = BuildersKt.withContext(sDN.copydefault.AEQbTJ(), new FileSendMessageViewProvider$attachProgressObserver$2$1$1(c33674nBq, taskDescription, str, null), continuation);
                    return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (sharedFlowEZpvd.collect(flowCollector, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        throw new KotlinNothingValueException();
    }
}
