package com.okinc.im.imui.broadcastmessages;

import android.os.Bundle;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentManager;
import com.okinc.im.imui.broadcastmessages.BroadcastMessagesActivity$onConsumeViewModel$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C35464nvp;
import o.C35772oDc;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes15.dex */
public final class BroadcastMessagesActivity$onConsumeViewModel$2 extends SuspendLambda implements Function2<C35772oDc, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ BroadcastMessagesActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastMessagesActivity$onConsumeViewModel$2(BroadcastMessagesActivity broadcastMessagesActivity, Continuation<? super BroadcastMessagesActivity$onConsumeViewModel$2> continuation) {
        super(2, continuation);
        this.this$0 = broadcastMessagesActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BroadcastMessagesActivity$onConsumeViewModel$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C35772oDc c35772oDc, Continuation<? super Unit> continuation) {
        return ((BroadcastMessagesActivity$onConsumeViewModel$2) create(c35772oDc, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C35464nvp.Application application = C35464nvp.Companion;
            C35464nvp c35464nvpCopydefault = application.copydefault("FRAGMENT_RESULT_KEY_LEAVE_THIS_CHAT_DIALOG");
            FragmentManager supportFragmentManager = this.this$0.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            c35464nvpCopydefault.show(supportFragmentManager, (String) null);
            String strAEQbTJ = application.AEQbTJ("FRAGMENT_RESULT_KEY_LEAVE_THIS_CHAT_DIALOG");
            final BroadcastMessagesActivity broadcastMessagesActivity = this.this$0;
            FragmentKt.setFragmentResultListener(c35464nvpCopydefault, strAEQbTJ, new Function2() { // from class: o.nuM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return BroadcastMessagesActivity$onConsumeViewModel$2.invokeSuspend$lambda$0(broadcastMessagesActivity, (java.lang.String) obj2, (android.os.Bundle) obj3);
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(BroadcastMessagesActivity broadcastMessagesActivity, String str, Bundle bundle) {
        broadcastMessagesActivity.finish();
        return Unit.INSTANCE;
    }
}
