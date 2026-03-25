package com.okinc.im.imui.messageV2.view;

import android.widget.TextView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.ActivityC36573odX;
import o.C56391yDq;
import o.C56442yFn;
import o.nHP;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class ChatActivity$observeConnectionStatusBanner$2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ ActivityC36573odX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatActivity$observeConnectionStatusBanner$2(ActivityC36573odX activityC36573odX, Continuation<? super ChatActivity$observeConnectionStatusBanner$2> continuation) {
        super(2, continuation);
        this.this$0 = activityC36573odX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatActivity$observeConnectionStatusBanner$2 chatActivity$observeConnectionStatusBanner$2 = new ChatActivity$observeConnectionStatusBanner$2(this.this$0, continuation);
        chatActivity$observeConnectionStatusBanner$2.Z$0 = ((Boolean) obj).booleanValue();
        return chatActivity$observeConnectionStatusBanner$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
        return invoke(bool.booleanValue(), continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
        return ((ChatActivity$observeConnectionStatusBanner$2) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v9, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            boolean z = this.Z$0;
            pUU.KWHzl("ChatActivity", "isShowConnectionStatusBanner update: " + z);
            if (z) {
                T tKWHzl = this.this$0.KWHzl();
                ActivityC36573odX activityC36573odX = this.this$0;
                nHP nhp = (nHP) tKWHzl;
                TextView textView = nhp.AYXKKw;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(0);
                TextView textView2 = nhp.DbNXlk;
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                textView2.setVisibility(8);
                TextView textView3 = nhp.AkhnZx;
                Intrinsics.checkNotNullExpressionValue(textView3, "");
                textView3.setVisibility(8);
                TextView textView4 = nhp.values;
                Intrinsics.checkNotNullExpressionValue(textView4, "");
                textView4.setVisibility(8);
                activityC36573odX.KWHzl = false;
            } else {
                T tKWHzl2 = this.this$0.KWHzl();
                ActivityC36573odX activityC36573odX2 = this.this$0;
                nHP nhp2 = (nHP) tKWHzl2;
                activityC36573odX2.KWHzl(activityC36573odX2.OLrzqt().hDKMBd().getValue());
                TextView textView5 = nhp2.AYXKKw;
                Intrinsics.checkNotNullExpressionValue(textView5, "");
                textView5.setVisibility(8);
                TextView textView6 = nhp2.DbNXlk;
                Intrinsics.copydefault(textView6);
                CharSequence text = textView6.getText();
                Intrinsics.checkNotNullExpressionValue(text, "");
                textView6.setVisibility(StringsKt__StringsKt.fARcdN(text) ^ true ? 0 : 8);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
