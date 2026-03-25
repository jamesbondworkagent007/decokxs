package com.okinc.im.usecase.banner;

import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C36562odM;
import o.C56391yDq;
import o.C56442yFn;
import o.oBF;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class ObserveUnblockRelationBannerUseCase$execute$1 extends SuspendLambda implements yHO<OKConversation, RelationInfo, Continuation<? super C36562odM>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ObserveUnblockRelationBannerUseCase$execute$1(Continuation<? super ObserveUnblockRelationBannerUseCase$execute$1> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(OKConversation oKConversation, RelationInfo relationInfo, Continuation<? super C36562odM> continuation) {
        ObserveUnblockRelationBannerUseCase$execute$1 observeUnblockRelationBannerUseCase$execute$1 = new ObserveUnblockRelationBannerUseCase$execute$1(continuation);
        observeUnblockRelationBannerUseCase$execute$1.L$0 = oKConversation;
        observeUnblockRelationBannerUseCase$execute$1.L$1 = relationInfo;
        return observeUnblockRelationBannerUseCase$execute$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            OKConversation oKConversation = (OKConversation) this.L$0;
            RelationInfo relationInfo = (RelationInfo) this.L$1;
            boolean zKWHzl = (oKConversation == null || relationInfo == null) ? false : oBF.OLrzqt.KWHzl(oKConversation, relationInfo);
            C36562odM c36562odM = C36562odM.OLrzqt;
            if (zKWHzl) {
                return c36562odM;
            }
            return null;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
