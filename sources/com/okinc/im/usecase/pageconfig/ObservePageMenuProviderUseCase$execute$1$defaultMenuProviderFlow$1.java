package com.okinc.im.usecase.pageconfig;

import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.other.GroupInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C35341ntW;
import o.C36550odA;
import o.C56391yDq;
import o.C56442yFn;
import o.yHT;

/* JADX INFO: loaded from: classes8.dex */
public final class ObservePageMenuProviderUseCase$execute$1$defaultMenuProviderFlow$1 extends SuspendLambda implements yHT<OKConversation, GroupInfo, C36550odA, Continuation<? super C36550odA>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ObservePageMenuProviderUseCase$execute$1$defaultMenuProviderFlow$1(Continuation<? super ObservePageMenuProviderUseCase$execute$1$defaultMenuProviderFlow$1> continuation) {
        super(4, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHT
    public final Object invoke(OKConversation oKConversation, GroupInfo groupInfo, C36550odA c36550odA, Continuation<? super C36550odA> continuation) {
        ObservePageMenuProviderUseCase$execute$1$defaultMenuProviderFlow$1 observePageMenuProviderUseCase$execute$1$defaultMenuProviderFlow$1 = new ObservePageMenuProviderUseCase$execute$1$defaultMenuProviderFlow$1(continuation);
        observePageMenuProviderUseCase$execute$1$defaultMenuProviderFlow$1.L$0 = oKConversation;
        observePageMenuProviderUseCase$execute$1$defaultMenuProviderFlow$1.L$1 = groupInfo;
        observePageMenuProviderUseCase$execute$1$defaultMenuProviderFlow$1.L$2 = c36550odA;
        return observePageMenuProviderUseCase$execute$1$defaultMenuProviderFlow$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            OKConversation oKConversation = (OKConversation) this.L$0;
            GroupInfo groupInfo = (GroupInfo) this.L$1;
            C36550odA c36550odA = (C36550odA) this.L$2;
            boolean zEZpvd = (oKConversation == null || (groupInfo == null && oKConversation.getConversationType() == OKConversationType.GROUP)) ? false : C35341ntW.EZpvd.EZpvd(oKConversation, groupInfo);
            c36550odA.EZpvd(oKConversation);
            c36550odA.OLrzqt(zEZpvd);
            return c36550odA;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
