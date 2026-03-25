package com.okinc.im.imui.chatsettings;

import com.okinc.im.imui.chatsettings.model.ChatSettingsResult;
import com.okinc.im.imui.chatsettings.viewmodel.ChatSettingsViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C32989mnw;
import o.C35490nwO;
import o.C35498nwW;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes15.dex */
public final class ChatSettingsFragment$observeData$1$3 extends SuspendLambda implements yHO<CoroutineScope, C32989mnw<ChatSettingsResult>, Continuation<? super Unit>, Object> {
    final /* synthetic */ ChatSettingsViewModel $this_with;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C35490nwO this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatSettingsFragment$observeData$1$3(ChatSettingsViewModel chatSettingsViewModel, C35490nwO c35490nwO, Continuation<? super ChatSettingsFragment$observeData$1$3> continuation) {
        super(3, continuation);
        this.$this_with = chatSettingsViewModel;
        this.this$0 = c35490nwO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, C32989mnw<ChatSettingsResult> c32989mnw, Continuation<? super Unit> continuation) {
        ChatSettingsFragment$observeData$1$3 chatSettingsFragment$observeData$1$3 = new ChatSettingsFragment$observeData$1$3(this.$this_with, this.this$0, continuation);
        chatSettingsFragment$observeData$1$3.L$0 = c32989mnw;
        return chatSettingsFragment$observeData$1$3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ChatSettingsResult chatSettingsResult;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C32989mnw c32989mnw = (C32989mnw) this.L$0;
            if (c32989mnw != null && (chatSettingsResult = (ChatSettingsResult) c32989mnw.KWHzl()) != null) {
                C35498nwW c35498nwW = this.this$0.EZpvd;
                if (c35498nwW == null) {
                    Intrinsics.gEmmrt("");
                    c35498nwW = null;
                }
                c35498nwW.OLrzqt(chatSettingsResult);
            }
            this.$this_with.AEQbTJ();
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
