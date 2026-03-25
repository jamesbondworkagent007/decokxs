package com.okinc.im.usecase.banner;

import com.okinc.im.config.page.IMPageType;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import o.C35758oCp;
import o.C36557odH;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.oBF;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class ObserveStrangerRelationBannerUseCase$execute$1 extends SuspendLambda implements yHO<OKConversation, RelationInfo, Continuation<? super C36557odH>, Object> {
    final /* synthetic */ boolean $isKycPass;
    final /* synthetic */ IMPageType $pageType;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ C35758oCp this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObserveStrangerRelationBannerUseCase$execute$1(C35758oCp c35758oCp, IMPageType iMPageType, boolean z, Continuation<? super ObserveStrangerRelationBannerUseCase$execute$1> continuation) {
        super(3, continuation);
        this.this$0 = c35758oCp;
        this.$pageType = iMPageType;
        this.$isKycPass = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(OKConversation oKConversation, RelationInfo relationInfo, Continuation<? super C36557odH> continuation) {
        ObserveStrangerRelationBannerUseCase$execute$1 observeStrangerRelationBannerUseCase$execute$1 = new ObserveStrangerRelationBannerUseCase$execute$1(this.this$0, this.$pageType, this.$isKycPass, continuation);
        observeStrangerRelationBannerUseCase$execute$1.L$0 = oKConversation;
        observeStrangerRelationBannerUseCase$execute$1.L$1 = relationInfo;
        return observeStrangerRelationBannerUseCase$execute$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            OKConversation oKConversation = (OKConversation) this.L$0;
            RelationInfo relationInfo = (RelationInfo) this.L$1;
            boolean zKWHzl = false;
            if (this.this$0.KWHzl.KWHzl(this.$pageType).isConnected() && oKConversation != null && relationInfo != null && !Intrinsics.EZpvd(relationInfo.getShowUnknownContactBanner(), C56443yFo.KWHzl(false))) {
                zKWHzl = oBF.OLrzqt.KWHzl(oKConversation, relationInfo, C56443yFo.KWHzl(this.$isKycPass));
            }
            C36557odH c36557odH = C36557odH.AEQbTJ;
            if (zKWHzl) {
                return c36557odH;
            }
            return null;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
