package com.okinc.im.imui.conversationlist.viewmodel;

import com.okinc.im.imui.relationlist.model.ReferralData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C32989mnw;
import o.C35856oGf;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.nGA;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class ConversationListViewModel$fetchReferralData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $displayName;
    final /* synthetic */ String $phoneNumber;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ConversationListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationListViewModel$fetchReferralData$1(ConversationListViewModel conversationListViewModel, String str, String str2, Continuation<? super ConversationListViewModel$fetchReferralData$1> continuation) {
        super(2, continuation);
        this.this$0 = conversationListViewModel;
        this.$displayName = str;
        this.$phoneNumber = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ConversationListViewModel$fetchReferralData$1 conversationListViewModel$fetchReferralData$1 = new ConversationListViewModel$fetchReferralData$1(this.this$0, this.$displayName, this.$phoneNumber, continuation);
        conversationListViewModel$fetchReferralData$1.L$0 = obj;
        return conversationListViewModel$fetchReferralData$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConversationListViewModel$fetchReferralData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                this.this$0.QOLQEE().setValue(C56443yFo.KWHzl(true));
                ConversationListViewModel conversationListViewModel = this.this$0;
                String str = this.$displayName;
                String str2 = this.$phoneNumber;
                Result.Application application = Result.Companion;
                C35856oGf c35856oGf = conversationListViewModel.dxcTrN;
                this.label = 1;
                obj = c35856oGf.KWHzl(str, str2, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((ReferralData) obj);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        ConversationListViewModel conversationListViewModel2 = this.this$0;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            conversationListViewModel2.AuCTelauCTel().setValue(new C32989mnw<>(new nGA.Activity((ReferralData) objM7377constructorimpl)));
        }
        ConversationListViewModel conversationListViewModel3 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault("ConversationListViewModel", "fetchReferralData failed: " + thM7380exceptionOrNullimpl);
            String message = thM7380exceptionOrNullimpl.getMessage();
            if (message != null) {
                conversationListViewModel3.AuCTelauCTel().setValue(new C32989mnw<>(new nGA.Dialog(message)));
            }
        }
        this.this$0.QOLQEE().setValue(C56443yFo.KWHzl(false));
        return Unit.INSTANCE;
    }
}
