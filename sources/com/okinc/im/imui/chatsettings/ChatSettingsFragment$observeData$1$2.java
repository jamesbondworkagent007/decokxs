package com.okinc.im.imui.chatsettings;

import com.okinc.im.imui.chatsettings.model.ChatSettingsResult;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C35490nwO;
import o.C35498nwW;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes15.dex */
public final class ChatSettingsFragment$observeData$1$2 extends SuspendLambda implements yHO<CoroutineScope, ChatSettingsResult, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C35490nwO this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatSettingsFragment$observeData$1$2(C35490nwO c35490nwO, Continuation<? super ChatSettingsFragment$observeData$1$2> continuation) {
        super(3, continuation);
        this.this$0 = c35490nwO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, ChatSettingsResult chatSettingsResult, Continuation<? super Unit> continuation) {
        ChatSettingsFragment$observeData$1$2 chatSettingsFragment$observeData$1$2 = new ChatSettingsFragment$observeData$1$2(this.this$0, continuation);
        chatSettingsFragment$observeData$1$2.L$0 = chatSettingsResult;
        return chatSettingsFragment$observeData$1$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            ChatSettingsResult chatSettingsResult = (ChatSettingsResult) this.L$0;
            if (chatSettingsResult != null) {
                C35498nwW c35498nwW = this.this$0.EZpvd;
                if (c35498nwW == null) {
                    Intrinsics.gEmmrt("");
                    c35498nwW = null;
                }
                c35498nwW.OLrzqt(chatSettingsResult);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
