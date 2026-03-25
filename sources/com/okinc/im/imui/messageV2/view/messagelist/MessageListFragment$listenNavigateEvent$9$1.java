package com.okinc.im.imui.messageV2.view.messagelist;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;
import com.okinc.im.imui.messageV2.view.messagelist.MessageListFragment$listenNavigateEvent$9$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C33731nDt;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC31257lqc;
import o.pUU;

/* JADX INFO: loaded from: classes16.dex */
public final class MessageListFragment$listenNavigateEvent$9$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C33731nDt $it;
    int label;
    final /* synthetic */ MessageListFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListFragment$listenNavigateEvent$9$1(MessageListFragment messageListFragment, C33731nDt c33731nDt, Continuation<? super MessageListFragment$listenNavigateEvent$9$1> continuation) {
        super(2, continuation);
        this.this$0 = messageListFragment;
        this.$it = c33731nDt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MessageListFragment$listenNavigateEvent$9$1(this.this$0, this.$it, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MessageListFragment$listenNavigateEvent$9$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            FragmentManager parentFragmentManager = this.this$0.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
            final InterfaceC31257lqc interfaceC31257lqc = (InterfaceC31257lqc) C43251rlk.OLrzqt(InterfaceC31257lqc.class);
            if (interfaceC31257lqc != null) {
                final MessageListFragment messageListFragment = this.this$0;
                C33731nDt c33731nDt = this.$it;
                parentFragmentManager.setFragmentResultListener(interfaceC31257lqc.copydefault(), messageListFragment.getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.omq
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // androidx.fragment.app.FragmentResultListener
                    public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                        MessageListFragment$listenNavigateEvent$9$1.invokeSuspend$lambda$1$lambda$0(interfaceC31257lqc, messageListFragment, str, bundle);
                    }
                });
                InterfaceC31257lqc.StateListAnimator.startReceiverFlow$default(interfaceC31257lqc, parentFragmentManager, c33731nDt.AEQbTJ(), null, 4, null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1$lambda$0(InterfaceC31257lqc interfaceC31257lqc, MessageListFragment messageListFragment, String str, Bundle bundle) {
        boolean zCopydefault = interfaceC31257lqc.copydefault(bundle);
        pUU.KWHzl(messageListFragment.getTAG(), "startReceiverFlowResult=" + zCopydefault);
    }
}
