package com.okinc.im.imui.conversationlist.viewmodel;

import com.okinc.im.imui.conversationlist.viewmodel.ConversationListViewModel$startGetSuggestedList$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import o.C35868oGr;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class ConversationListViewModel$startGetSuggestedList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ConversationListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationListViewModel$startGetSuggestedList$1(ConversationListViewModel conversationListViewModel, Continuation<? super ConversationListViewModel$startGetSuggestedList$1> continuation) {
        super(2, continuation);
        this.this$0 = conversationListViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ConversationListViewModel$startGetSuggestedList$1 conversationListViewModel$startGetSuggestedList$1 = new ConversationListViewModel$startGetSuggestedList$1(this.this$0, continuation);
        conversationListViewModel$startGetSuggestedList$1.L$0 = obj;
        return conversationListViewModel$startGetSuggestedList$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConversationListViewModel$startGetSuggestedList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                C35868oGr c35868oGr = conversationListViewModel.flVtFt;
                this.label = 1;
                obj = c35868oGr.AEQbTJ(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(!((Boolean) obj).booleanValue()));
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            objM7377constructorimpl = C56443yFo.KWHzl(true);
        }
        if (((Boolean) objM7377constructorimpl).booleanValue()) {
            pUU.KWHzl("ConversationListViewModel", "startGetSuggestedList => empty phone table, sync phonebook first");
            Job jobEZpvd = this.this$0.DAIeex.EZpvd();
            if (jobEZpvd != null) {
                final ConversationListViewModel conversationListViewModel2 = this.this$0;
                jobEZpvd.invokeOnCompletion(new Function1() { // from class: o.nHy
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return ConversationListViewModel$startGetSuggestedList$1.invokeSuspend$lambda$2(conversationListViewModel2, (java.lang.Throwable) obj2);
                    }
                });
            }
        } else {
            pUU.KWHzl("ConversationListViewModel", "startGetSuggestedList => start getting suggested list");
            ConversationListViewModel.startObserveSuggestedList$default(this.this$0, null, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2(ConversationListViewModel conversationListViewModel, Throwable th) {
        pUU.KWHzl("ConversationListViewModel", "startGetSuggestedList => sync phone book completed, start getting suggested list");
        conversationListViewModel.AEQbTJ((Long) 500L);
        return Unit.INSTANCE;
    }
}
