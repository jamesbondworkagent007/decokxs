package com.okinc.im.imui.chatsettings;

import android.widget.ImageView;
import android.widget.TextView;
import com.okinc.im.imui.chatsettings.viewmodel.ChatSettingsViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C33894nJu;
import o.C35490nwO;
import o.C35501nwZ;
import o.C43248rlh;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC8101awQ;
import o.yHO;

/* JADX INFO: loaded from: classes15.dex */
public final class ChatSettingsFragment$observeData$1$4 extends SuspendLambda implements yHO<CoroutineScope, C35501nwZ, Continuation<? super Unit>, Object> {
    final /* synthetic */ ChatSettingsViewModel $this_with;
    int label;
    final /* synthetic */ C35490nwO this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatSettingsFragment$observeData$1$4(C35490nwO c35490nwO, ChatSettingsViewModel chatSettingsViewModel, Continuation<? super ChatSettingsFragment$observeData$1$4> continuation) {
        super(3, continuation);
        this.this$0 = c35490nwO;
        this.$this_with = chatSettingsViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, C35501nwZ c35501nwZ, Continuation<? super Unit> continuation) {
        return new ChatSettingsFragment$observeData$1$4(this.this$0, this.$this_with, continuation).invokeSuspend(Unit.INSTANCE);
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
            C35501nwZ value = this.$this_with.OLrzqt().getValue();
            if (value != null) {
                InterfaceC8101awQ interfaceC8101awQ = (InterfaceC8101awQ) C43248rlh.KWHzl.AEQbTJ(InterfaceC8101awQ.class);
                ImageView imageView = c33894nJu.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                InterfaceC8101awQ.Activity.loadUserAvatar$default(interfaceC8101awQ, imageView, false, null, 4, null);
                c33894nJu.valueOf.setText(value.KWHzl());
                c33894nJu.values.setText(value.OLrzqt().EZpvd());
                TextView textView = c33894nJu.values;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(value.OLrzqt().EZpvd().length() > 0 ? 0 : 8);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
