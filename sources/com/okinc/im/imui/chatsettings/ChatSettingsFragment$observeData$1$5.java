package com.okinc.im.imui.chatsettings;

import com.okinc.im.imui.chatsettings.viewmodel.ChatSettingsViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import o.C32989mnw;
import o.C33070mpX;
import o.C35399nuc;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes15.dex */
public final class ChatSettingsFragment$observeData$1$5 extends SuspendLambda implements yHO<CoroutineScope, C32989mnw<Unit>, Continuation<? super Unit>, Object> {
    final /* synthetic */ ChatSettingsViewModel $this_with;
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatSettingsFragment$observeData$1$5(ChatSettingsViewModel chatSettingsViewModel, Continuation<? super ChatSettingsFragment$observeData$1$5> continuation) {
        super(3, continuation);
        this.$this_with = chatSettingsViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, C32989mnw<Unit> c32989mnw, Continuation<? super Unit> continuation) {
        ChatSettingsFragment$observeData$1$5 chatSettingsFragment$observeData$1$5 = new ChatSettingsFragment$observeData$1$5(this.$this_with, continuation);
        chatSettingsFragment$observeData$1$5.L$0 = c32989mnw;
        return chatSettingsFragment$observeData$1$5.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C32989mnw c32989mnw = (C32989mnw) this.L$0;
            if (c32989mnw != null && ((Unit) c32989mnw.KWHzl()) != null) {
                C55326xho.toastWithFailedIcon$default(C33070mpX.AYXKKw(C35399nuc.LoaderManager.fupbxE), 0, 1, (Object) null);
            }
            this.$this_with.EZpvd();
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
