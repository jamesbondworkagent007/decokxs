package com.okinc.im.imui.conversation.message.provider;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C33670nBm;
import o.C56391yDq;
import o.C56442yFn;
import o.sIS;

/* JADX INFO: loaded from: classes18.dex */
public final class FileReceiveMessageViewProvider$startDownload$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $messageId;
    final /* synthetic */ sIS $result;
    int label;
    final /* synthetic */ C33670nBm this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileReceiveMessageViewProvider$startDownload$1$1$1(C33670nBm c33670nBm, String str, sIS sis, Continuation<? super FileReceiveMessageViewProvider$startDownload$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = c33670nBm;
        this.$messageId = str;
        this.$result = sis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FileReceiveMessageViewProvider$startDownload$1$1$1(this.this$0, this.$messageId, this.$result, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FileReceiveMessageViewProvider$startDownload$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            Function1 function1 = (Function1) this.this$0.djBIcL.get(this.$messageId);
            if (function1 != null) {
                function1.invoke(this.$result);
            }
            this.this$0.copydefault(this.$result, this.$messageId);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
