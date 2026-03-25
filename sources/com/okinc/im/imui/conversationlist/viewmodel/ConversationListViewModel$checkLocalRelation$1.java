package com.okinc.im.imui.conversationlist.viewmodel;

import com.okinc.okimcore.model.biz.relationlocal.PhoneRelation;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C32989mnw;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.nGA;
import o.oFP;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class ConversationListViewModel$checkLocalRelation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PhoneRelation $localRelation;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ConversationListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationListViewModel$checkLocalRelation$1(ConversationListViewModel conversationListViewModel, PhoneRelation phoneRelation, Continuation<? super ConversationListViewModel$checkLocalRelation$1> continuation) {
        super(2, continuation);
        this.this$0 = conversationListViewModel;
        this.$localRelation = phoneRelation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ConversationListViewModel$checkLocalRelation$1 conversationListViewModel$checkLocalRelation$1 = new ConversationListViewModel$checkLocalRelation$1(this.this$0, this.$localRelation, continuation);
        conversationListViewModel$checkLocalRelation$1.L$0 = obj;
        return conversationListViewModel$checkLocalRelation$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConversationListViewModel$checkLocalRelation$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                PhoneRelation phoneRelation = this.$localRelation;
                Result.Application application = Result.Companion;
                oFP ofp = conversationListViewModel.dvKsVJ;
                this.label = 1;
                obj = ofp.EZpvd(phoneRelation, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((oFP.ActionBar) obj);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        ConversationListViewModel conversationListViewModel2 = this.this$0;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            oFP.ActionBar actionBar = (oFP.ActionBar) objM7377constructorimpl;
            if (actionBar instanceof oFP.ActionBar.C0902ActionBar) {
                oFP.ActionBar.C0902ActionBar c0902ActionBar = (oFP.ActionBar.C0902ActionBar) actionBar;
                conversationListViewModel2.OLrzqt(c0902ActionBar.EZpvd(), c0902ActionBar.copydefault());
            } else {
                if (!(actionBar instanceof oFP.ActionBar.Activity)) {
                    throw new NoWhenBranchMatchedException();
                }
                oFP.ActionBar.Activity activity = (oFP.ActionBar.Activity) actionBar;
                conversationListViewModel2.AuCTelauCTel().setValue(new C32989mnw<>(new nGA.Application(activity.EZpvd(), activity.copydefault())));
            }
        }
        ConversationListViewModel conversationListViewModel3 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault("ConversationListViewModel", "check local relation error:" + thM7380exceptionOrNullimpl);
            String message = thM7380exceptionOrNullimpl.getMessage();
            if (message != null) {
                conversationListViewModel3.AuCTelauCTel().setValue(new C32989mnw<>(new nGA.Dialog(message)));
            }
        }
        this.this$0.QOLQEE().setValue(C56443yFo.KWHzl(false));
        return Unit.INSTANCE;
    }
}
