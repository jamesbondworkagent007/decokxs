package com.okinc.im.imui.conversationlist.error;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C35837oFn;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.rXL;

/* JADX INFO: loaded from: classes8.dex */
public final class ConversationListSubAccountViewModel$markNotificationConversationAsViewed$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ rXL $notificationChannel;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ConversationListSubAccountViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationListSubAccountViewModel$markNotificationConversationAsViewed$1(ConversationListSubAccountViewModel conversationListSubAccountViewModel, rXL rxl, Continuation<? super ConversationListSubAccountViewModel$markNotificationConversationAsViewed$1> continuation) {
        super(2, continuation);
        this.this$0 = conversationListSubAccountViewModel;
        this.$notificationChannel = rxl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ConversationListSubAccountViewModel$markNotificationConversationAsViewed$1 conversationListSubAccountViewModel$markNotificationConversationAsViewed$1 = new ConversationListSubAccountViewModel$markNotificationConversationAsViewed$1(this.this$0, this.$notificationChannel, continuation);
        conversationListSubAccountViewModel$markNotificationConversationAsViewed$1.L$0 = obj;
        return conversationListSubAccountViewModel$markNotificationConversationAsViewed$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConversationListSubAccountViewModel$markNotificationConversationAsViewed$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        ConversationListSubAccountViewModel conversationListSubAccountViewModel;
        ConversationListSubAccountViewModel conversationListSubAccountViewModel2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ConversationListSubAccountViewModel conversationListSubAccountViewModel3 = this.this$0;
            rXL rxl = this.$notificationChannel;
            Result.Application application2 = Result.Companion;
            C35837oFn c35837oFn = conversationListSubAccountViewModel3.AhwBna;
            this.label = 1;
            obj = C35837oFn.execute$default(c35837oFn, rxl, false, this, 2, null);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                conversationListSubAccountViewModel2 = (ConversationListSubAccountViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                conversationListSubAccountViewModel = conversationListSubAccountViewModel2;
                conversationListSubAccountViewModel.valueOf.KWHzl();
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(((Boolean) obj).booleanValue()));
        conversationListSubAccountViewModel = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault("ConversationListViewModel", "mark notification conversation as read error: " + thM7380exceptionOrNullimpl.getMessage());
            String message = thM7380exceptionOrNullimpl.getMessage();
            if (message != null) {
                MutableSharedFlow mutableSharedFlow = conversationListSubAccountViewModel.copydefault;
                this.L$0 = conversationListSubAccountViewModel;
                this.label = 2;
                if (mutableSharedFlow.emit(message, this) == objCopydefault) {
                    return objCopydefault;
                }
                conversationListSubAccountViewModel2 = conversationListSubAccountViewModel;
                conversationListSubAccountViewModel = conversationListSubAccountViewModel2;
            }
            conversationListSubAccountViewModel.valueOf.KWHzl();
        }
        return Unit.INSTANCE;
    }
}
