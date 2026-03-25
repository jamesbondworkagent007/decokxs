package com.okinc.im.imui.messageV2.view;

import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.okinc.okimcore.model.im.OKConversation;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC36573odX;
import o.C35399nuc;
import o.C44170sFx;
import o.C56391yDq;
import o.C56442yFn;
import o.nHP;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class ChatActivity$observeTitle$2 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ActivityC36573odX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatActivity$observeTitle$2(ActivityC36573odX activityC36573odX, Continuation<? super ChatActivity$observeTitle$2> continuation) {
        super(2, continuation);
        this.this$0 = activityC36573odX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatActivity$observeTitle$2 chatActivity$observeTitle$2 = new ChatActivity$observeTitle$2(this.this$0, continuation);
        chatActivity$observeTitle$2.L$0 = obj;
        return chatActivity$observeTitle$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Unit> continuation) {
        return ((ChatActivity$observeTitle$2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            String str = (String) this.L$0;
            pUU.KWHzl("ChatActivity", "title update: " + str);
            TextView textView = ((nHP) this.this$0.KWHzl()).fetchVPNInfo;
            ActivityC36573odX activityC36573odX = this.this$0;
            Intrinsics.copydefault(textView);
            textView.setVisibility(0);
            textView.setText(str);
            OKConversation value = activityC36573odX.OLrzqt().valueOf().getValue();
            if (value != null && C44170sFx.AEQbTJ(value)) {
                textView.setTextColor(ContextCompat.getColor(activityC36573odX, C35399nuc.Application.djBIcL));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
