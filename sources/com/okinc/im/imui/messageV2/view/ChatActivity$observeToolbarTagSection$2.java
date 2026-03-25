package com.okinc.im.imui.messageV2.view;

import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.AbstractC35351ntg;
import o.ActivityC36573odX;
import o.C35399nuc;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class ChatActivity$observeToolbarTagSection$2 extends SuspendLambda implements Function2<AbstractC35351ntg, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ActivityC36573odX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatActivity$observeToolbarTagSection$2(ActivityC36573odX activityC36573odX, Continuation<? super ChatActivity$observeToolbarTagSection$2> continuation) {
        super(2, continuation);
        this.this$0 = activityC36573odX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatActivity$observeToolbarTagSection$2 chatActivity$observeToolbarTagSection$2 = new ChatActivity$observeToolbarTagSection$2(this.this$0, continuation);
        chatActivity$observeToolbarTagSection$2.L$0 = obj;
        return chatActivity$observeToolbarTagSection$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC35351ntg abstractC35351ntg, Continuation<? super Unit> continuation) {
        return ((ChatActivity$observeToolbarTagSection$2) create(abstractC35351ntg, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC35351ntg abstractC35351ntg = (AbstractC35351ntg) this.L$0;
            pUU.KWHzl("ChatActivity", "toolbarSecondarySection update: " + abstractC35351ntg);
            if (abstractC35351ntg == null) {
                Fragment fragmentFindFragmentById = this.this$0.getSupportFragmentManager().findFragmentById(C35399nuc.StateListAnimator.iOIMNp);
                if (fragmentFindFragmentById != null) {
                    this.this$0.getSupportFragmentManager().beginTransaction().remove(fragmentFindFragmentById).commitAllowingStateLoss();
                }
            } else {
                C56443yFo.AEQbTJ(this.this$0.getSupportFragmentManager().beginTransaction().replace(C35399nuc.StateListAnimator.iOIMNp, abstractC35351ntg).commitAllowingStateLoss());
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
