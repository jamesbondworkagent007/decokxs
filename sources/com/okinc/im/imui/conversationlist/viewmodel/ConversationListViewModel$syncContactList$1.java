package com.okinc.im.imui.conversationlist.viewmodel;

import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C44124sEe;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC44177sGd;
import o.sDZ;

/* JADX INFO: loaded from: classes8.dex */
public final class ConversationListViewModel$syncContactList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ConversationListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationListViewModel$syncContactList$1(ConversationListViewModel conversationListViewModel, Continuation<? super ConversationListViewModel$syncContactList$1> continuation) {
        super(2, continuation);
        this.this$0 = conversationListViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ConversationListViewModel$syncContactList$1 conversationListViewModel$syncContactList$1 = new ConversationListViewModel$syncContactList$1(this.this$0, continuation);
        conversationListViewModel$syncContactList$1.L$0 = obj;
        return conversationListViewModel$syncContactList$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConversationListViewModel$syncContactList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                ConversationListViewModel conversationListViewModel = this.this$0;
                Result.Application application = Result.Companion;
                C44124sEe.imLogSync$default("ConversationListViewModel: Syncing Contact List: started, updating DB", null, null, 6, null);
                InterfaceC44177sGd interfaceC44177sGdFvQaOB = conversationListViewModel.fvQaOB();
                this.label = 1;
                obj = interfaceC44177sGdFvQaOB.gEmmrt(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((List) obj);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            sDZ.AEQbTJ.copydefault(true);
            C44124sEe.imLogSync$default("ConversationListViewModel: Syncing Contact List: completed", null, null, 6, null);
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            C44124sEe.imLogSync$default("ConversationListViewModel: Syncing Contact List: failed", thM7380exceptionOrNullimpl, null, 4, null);
        }
        return Unit.INSTANCE;
    }
}
