package com.okinc.im.imui.messageV2.view.banner.strangerrelation;

import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C35859oGi;
import o.C56379yDe;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class StrangerRelationBannerViewModel$loadRelationInfo$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OKConversation $this_run;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StrangerRelationBannerViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StrangerRelationBannerViewModel$loadRelationInfo$1$1(StrangerRelationBannerViewModel strangerRelationBannerViewModel, OKConversation oKConversation, Continuation<? super StrangerRelationBannerViewModel$loadRelationInfo$1$1> continuation) {
        super(2, continuation);
        this.this$0 = strangerRelationBannerViewModel;
        this.$this_run = oKConversation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        StrangerRelationBannerViewModel$loadRelationInfo$1$1 strangerRelationBannerViewModel$loadRelationInfo$1$1 = new StrangerRelationBannerViewModel$loadRelationInfo$1$1(this.this$0, this.$this_run, continuation);
        strangerRelationBannerViewModel$loadRelationInfo$1$1.L$0 = obj;
        return strangerRelationBannerViewModel$loadRelationInfo$1$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((StrangerRelationBannerViewModel$loadRelationInfo$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                StrangerRelationBannerViewModel strangerRelationBannerViewModel = this.this$0;
                OKConversation oKConversation = this.$this_run;
                Result.Application application = Result.Companion;
                C35859oGi c35859oGi = strangerRelationBannerViewModel.gEmmrt;
                String contactId = oKConversation.getContactId();
                this.label = 1;
                obj = c35859oGi.copydefault(contactId, null, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((RelationInfo) obj);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            pUU.EZpvd("StrangerRelationBannerViewModel", "onSuccess: loadRelationInfo()");
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.EZpvd("StrangerRelationBannerViewModel", "onFailure: loadRelationInfo(), error=" + C56379yDe.AEQbTJ(thM7380exceptionOrNullimpl));
        }
        return Unit.INSTANCE;
    }
}
