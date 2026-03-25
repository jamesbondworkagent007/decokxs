package com.okinc.im.imui.conversation.message.provider;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C33674nBq;
import o.C56391yDq;
import o.C56442yFn;
import o.sIS;

/* JADX INFO: loaded from: classes18.dex */
public final class FileSendMessageViewProvider$reDownloadAndOpen$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $messageId;
    final /* synthetic */ sIS $result;
    int label;
    final /* synthetic */ C33674nBq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSendMessageViewProvider$reDownloadAndOpen$2$1$1(C33674nBq c33674nBq, String str, sIS sis, Continuation<? super FileSendMessageViewProvider$reDownloadAndOpen$2$1$1> continuation) {
        super(2, continuation);
        this.this$0 = c33674nBq;
        this.$messageId = str;
        this.$result = sis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FileSendMessageViewProvider$reDownloadAndOpen$2$1$1(this.this$0, this.$messageId, this.$result, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FileSendMessageViewProvider$reDownloadAndOpen$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            Function1 function1 = (Function1) this.this$0.valueOf.get(this.$messageId);
            if (function1 != null) {
                function1.invoke(this.$result);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
