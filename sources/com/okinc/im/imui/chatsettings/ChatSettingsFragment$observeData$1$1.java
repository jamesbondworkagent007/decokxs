package com.okinc.im.imui.chatsettings;

import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.okinc.im.imui.chatsettings.viewmodel.ChatSettingsViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C33894nJu;
import o.C35490nwO;
import o.C55113xdn;
import o.C55173xeu;
import o.C56391yDq;
import o.C56442yFn;
import o.rVN;
import o.yHO;

/* JADX INFO: loaded from: classes15.dex */
public final class ChatSettingsFragment$observeData$1$1 extends SuspendLambda implements yHO<CoroutineScope, ChatSettingsViewModel.Application, Continuation<? super Unit>, Object> {
    final /* synthetic */ ChatSettingsViewModel $this_with;
    int label;
    final /* synthetic */ C35490nwO this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatSettingsFragment$observeData$1$1(C35490nwO c35490nwO, ChatSettingsViewModel chatSettingsViewModel, Continuation<? super ChatSettingsFragment$observeData$1$1> continuation) {
        super(3, continuation);
        this.this$0 = c35490nwO;
        this.$this_with = chatSettingsViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, ChatSettingsViewModel.Application application, Continuation<? super Unit> continuation) {
        return new ChatSettingsFragment$observeData$1$1(this.this$0, this.$this_with, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C33894nJu c33894nJu = this.this$0.copydefault;
            if (c33894nJu == null) {
                Intrinsics.gEmmrt("");
                c33894nJu = null;
            }
            ChatSettingsViewModel chatSettingsViewModel = this.$this_with;
            C35490nwO c35490nwO = this.this$0;
            ChatSettingsViewModel.Application value = chatSettingsViewModel.AYXKKw().getValue();
            if (Intrinsics.EZpvd(value, ChatSettingsViewModel.Application.TaskDescription.KWHzl)) {
                LinearLayout linearLayout = c33894nJu.EZpvd;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                linearLayout.setVisibility(0);
                C55113xdn c55113xdn = c33894nJu.djBIcL;
                Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
                c55113xdn.setVisibility(8);
                C55173xeu c55173xeu = c33894nJu.AhwBna;
                Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
                c55173xeu.setVisibility(8);
                rVN.reportFullyDrawn$default((Fragment) c35490nwO, true, (String) null, 2, (Object) null);
            } else if (Intrinsics.EZpvd(value, ChatSettingsViewModel.Application.C0400Application.AEQbTJ)) {
                LinearLayout linearLayout2 = c33894nJu.EZpvd;
                Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
                linearLayout2.setVisibility(8);
                C55113xdn c55113xdn2 = c33894nJu.djBIcL;
                Intrinsics.checkNotNullExpressionValue(c55113xdn2, "");
                c55113xdn2.setVisibility(8);
                C55173xeu c55173xeu2 = c33894nJu.AhwBna;
                Intrinsics.checkNotNullExpressionValue(c55173xeu2, "");
                c55173xeu2.setVisibility(0);
                rVN.reportFullyDrawn$default((Fragment) c35490nwO, false, (String) null, 2, (Object) null);
            } else {
                if (!Intrinsics.EZpvd(value, ChatSettingsViewModel.Application.StateListAnimator.OLrzqt)) {
                    throw new NoWhenBranchMatchedException();
                }
                LinearLayout linearLayout3 = c33894nJu.EZpvd;
                Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
                linearLayout3.setVisibility(8);
                C55113xdn c55113xdn3 = c33894nJu.djBIcL;
                Intrinsics.checkNotNullExpressionValue(c55113xdn3, "");
                c55113xdn3.setVisibility(0);
                C55173xeu c55173xeu3 = c33894nJu.AhwBna;
                Intrinsics.checkNotNullExpressionValue(c55173xeu3, "");
                c55173xeu3.setVisibility(8);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
