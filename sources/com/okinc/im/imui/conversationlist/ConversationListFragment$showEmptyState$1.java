package com.okinc.im.imui.conversationlist;

import android.widget.LinearLayout;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.C35399nuc;
import o.C37716ozA;
import o.C56391yDq;
import o.C56442yFn;
import o.nOM;
import o.pUU;

/* JADX INFO: loaded from: classes16.dex */
public final class ConversationListFragment$showEmptyState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ConversationListFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationListFragment$showEmptyState$1(ConversationListFragment conversationListFragment, Continuation<? super ConversationListFragment$showEmptyState$1> continuation) {
        super(2, continuation);
        this.this$0 = conversationListFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConversationListFragment$showEmptyState$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConversationListFragment$showEmptyState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.label = 1;
            if (DelayKt.delay(500L, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        pUU.KWHzl("ConversationListFragment", "ShowEmptyState: show empty view");
        nOM nom = this.this$0.isConnected;
        if (nom == null) {
            Intrinsics.gEmmrt("");
            nom = null;
        }
        LinearLayout linearLayout = nom.OLrzqt.KWHzl;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(0);
        nOM nom2 = this.this$0.isConnected;
        if (nom2 == null) {
            Intrinsics.gEmmrt("");
            nom2 = null;
        }
        LinearLayout linearLayout2 = nom2.OLrzqt.KWHzl;
        String string = this.this$0.getString(C35399nuc.LoaderManager.fiXcQa);
        Intrinsics.checkNotNullExpressionValue(string, "");
        C37716ozA.updateConversationEmptyStatusView$default(linearLayout2, string, null, 4, null);
        return Unit.INSTANCE;
    }
}
