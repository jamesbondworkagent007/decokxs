package com.okinc.im.imui.conversationlist;

import android.content.Context;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.nFG;
import o.pUU;
import o.tWM;

/* JADX INFO: loaded from: classes16.dex */
public final class ConversationListToolbarFragment$listenFragmentResult$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ nFG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationListToolbarFragment$listenFragmentResult$1$1(nFG nfg, Continuation<? super ConversationListToolbarFragment$listenFragmentResult$1$1> continuation) {
        super(2, continuation);
        this.this$0 = nfg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ConversationListToolbarFragment$listenFragmentResult$1$1 conversationListToolbarFragment$listenFragmentResult$1$1 = new ConversationListToolbarFragment$listenFragmentResult$1$1(this.this$0, continuation);
        conversationListToolbarFragment$listenFragmentResult$1$1.L$0 = obj;
        return conversationListToolbarFragment$listenFragmentResult$1$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConversationListToolbarFragment$listenFragmentResult$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        Unit unit;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            nFG nfg = this.this$0;
            Result.Application application2 = Result.Companion;
            tWM twm = (tWM) C43251rlk.OLrzqt(tWM.class);
            if (twm == null) {
                unit = null;
                objM7377constructorimpl = Result.m7377constructorimpl(unit);
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.AEQbTJ("ConversationListToolbarFragment", "Failed to open orbit post publisher page", thM7380exceptionOrNullimpl);
                }
                return Unit.INSTANCE;
            }
            Context contextRequireContext = nfg.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            this.label = 1;
            if (tWM.StateListAnimator.openPublishPage$default(twm, contextRequireContext, null, null, null, null, false, this, 62, null) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        unit = Unit.INSTANCE;
        objM7377constructorimpl = Result.m7377constructorimpl(unit);
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
