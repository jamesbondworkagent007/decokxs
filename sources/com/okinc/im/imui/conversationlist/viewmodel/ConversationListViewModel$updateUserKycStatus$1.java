package com.okinc.im.imui.conversationlist.viewmodel;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.oDZ;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class ConversationListViewModel$updateUserKycStatus$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Boolean, Unit> $successCallback;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ConversationListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConversationListViewModel$updateUserKycStatus$1(ConversationListViewModel conversationListViewModel, Function1<? super Boolean, Unit> function1, Continuation<? super ConversationListViewModel$updateUserKycStatus$1> continuation) {
        super(2, continuation);
        this.this$0 = conversationListViewModel;
        this.$successCallback = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ConversationListViewModel$updateUserKycStatus$1 conversationListViewModel$updateUserKycStatus$1 = new ConversationListViewModel$updateUserKycStatus$1(this.this$0, this.$successCallback, continuation);
        conversationListViewModel$updateUserKycStatus$1.L$0 = obj;
        return conversationListViewModel$updateUserKycStatus$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConversationListViewModel$updateUserKycStatus$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                oDZ odz = conversationListViewModel.fFgQHt;
                this.label = 1;
                obj = odz.AEQbTJ(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(((Boolean) obj).booleanValue()));
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        ConversationListViewModel conversationListViewModel2 = this.this$0;
        Function1<Boolean, Unit> function1 = this.$successCallback;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            boolean zBooleanValue = ((Boolean) objM7377constructorimpl).booleanValue();
            conversationListViewModel2.getNewProxyInstance.setValue(C56443yFo.KWHzl(zBooleanValue));
            if (function1 != null) {
                function1.invoke(C56443yFo.KWHzl(zBooleanValue));
            }
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault("ConversationListViewModel", "updateUserInfoFromRemote error:" + thM7380exceptionOrNullimpl.getMessage());
        }
        return Unit.INSTANCE;
    }
}
