package com.okinc.im.imui.chatsettings.viewmodel;

import com.okinc.im.imui.chatsettings.viewmodel.ChatSettingsViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class ChatSettingsViewModel$uiState$1 extends SuspendLambda implements yHO<Boolean, Boolean, Continuation<? super ChatSettingsViewModel.Application>, Object> {
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ChatSettingsViewModel$uiState$1(Continuation<? super ChatSettingsViewModel$uiState$1> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* synthetic */ Object invoke(Boolean bool, Boolean bool2, Continuation<? super ChatSettingsViewModel.Application> continuation) {
        return invoke(bool.booleanValue(), bool2.booleanValue(), continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(boolean z, boolean z2, Continuation<? super ChatSettingsViewModel.Application> continuation) {
        ChatSettingsViewModel$uiState$1 chatSettingsViewModel$uiState$1 = new ChatSettingsViewModel$uiState$1(continuation);
        chatSettingsViewModel$uiState$1.Z$0 = z;
        chatSettingsViewModel$uiState$1.Z$1 = z2;
        return chatSettingsViewModel$uiState$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            boolean z = this.Z$0;
            boolean z2 = this.Z$1;
            if (z) {
                return ChatSettingsViewModel.Application.StateListAnimator.OLrzqt;
            }
            if (z2) {
                return ChatSettingsViewModel.Application.C0400Application.AEQbTJ;
            }
            return ChatSettingsViewModel.Application.TaskDescription.KWHzl;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
