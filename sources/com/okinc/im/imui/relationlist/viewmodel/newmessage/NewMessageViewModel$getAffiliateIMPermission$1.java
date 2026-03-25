package com.okinc.im.imui.relationlist.viewmodel.newmessage;

import com.okinc.affiliate.bean.AffiliateIMPermission;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C35744oCb;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class NewMessageViewModel$getAffiliateIMPermission$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NewMessageViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewMessageViewModel$getAffiliateIMPermission$1(NewMessageViewModel newMessageViewModel, Continuation<? super NewMessageViewModel$getAffiliateIMPermission$1> continuation) {
        super(2, continuation);
        this.this$0 = newMessageViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NewMessageViewModel$getAffiliateIMPermission$1 newMessageViewModel$getAffiliateIMPermission$1 = new NewMessageViewModel$getAffiliateIMPermission$1(this.this$0, continuation);
        newMessageViewModel$getAffiliateIMPermission$1.L$0 = obj;
        return newMessageViewModel$getAffiliateIMPermission$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NewMessageViewModel$getAffiliateIMPermission$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                NewMessageViewModel newMessageViewModel = this.this$0;
                Result.Application application = Result.Companion;
                pUU.KWHzl("NewMessageViewModel", "start fetching for affiliate permission");
                C35744oCb c35744oCb = newMessageViewModel.isConnected;
                this.label = 1;
                obj = c35744oCb.KWHzl(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((AffiliateIMPermission) obj);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        pUU.KWHzl("NewMessageViewModel", "affiliateIMPermission: " + this.this$0.AhwBna);
        this.this$0.AhwBna.setValue((AffiliateIMPermission) objM7377constructorimpl);
        return Unit.INSTANCE;
    }
}
