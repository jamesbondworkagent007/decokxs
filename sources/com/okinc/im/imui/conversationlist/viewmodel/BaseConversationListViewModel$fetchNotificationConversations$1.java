package com.okinc.im.imui.conversationlist.viewmodel;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C35830oFg;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.rXL;

/* JADX INFO: loaded from: classes8.dex */
public final class BaseConversationListViewModel$fetchNotificationConversations$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BaseConversationListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseConversationListViewModel$fetchNotificationConversations$1(BaseConversationListViewModel baseConversationListViewModel, Continuation<? super BaseConversationListViewModel$fetchNotificationConversations$1> continuation) {
        super(2, continuation);
        this.this$0 = baseConversationListViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BaseConversationListViewModel$fetchNotificationConversations$1 baseConversationListViewModel$fetchNotificationConversations$1 = new BaseConversationListViewModel$fetchNotificationConversations$1(this.this$0, continuation);
        baseConversationListViewModel$fetchNotificationConversations$1.L$0 = obj;
        return baseConversationListViewModel$fetchNotificationConversations$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseConversationListViewModel$fetchNotificationConversations$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        BaseConversationListViewModel baseConversationListViewModel;
        BaseConversationListViewModel baseConversationListViewModel2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            baseConversationListViewModel = this.this$0;
            Result.Application application2 = Result.Companion;
            if (rXL.Companion.KWHzl().size() <= 1) {
                C35830oFg c35830oFgFJNWhG = baseConversationListViewModel.fJNWhG();
                this.L$0 = baseConversationListViewModel;
                this.label = 1;
                if (c35830oFgFJNWhG.AEQbTJ(this) == objCopydefault) {
                    return objCopydefault;
                }
                baseConversationListViewModel2 = baseConversationListViewModel;
            }
            baseConversationListViewModel.RcXXUw();
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                pUU.KWHzl("ConversationListViewModel", "fetchNotificationConversation success");
            }
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.copydefault("ConversationListViewModel", "fetchNotificationConversation error: " + thM7380exceptionOrNullimpl.getMessage());
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        baseConversationListViewModel2 = (BaseConversationListViewModel) this.L$0;
        C56391yDq.AEQbTJ(obj);
        baseConversationListViewModel = baseConversationListViewModel2;
        baseConversationListViewModel.RcXXUw();
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
        }
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
