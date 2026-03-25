package com.okinc.im.usecase.banner;

import com.okinc.im.config.page.IMPageType;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C35753oCk;
import o.C36559odJ;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class ObserveScamBannerUseCase$execute$1 extends SuspendLambda implements yHO<OKConversation, RelationInfo, Continuation<? super C36559odJ>, Object> {
    final /* synthetic */ IMPageType $pageType;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ C35753oCk this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObserveScamBannerUseCase$execute$1(C35753oCk c35753oCk, IMPageType iMPageType, Continuation<? super ObserveScamBannerUseCase$execute$1> continuation) {
        super(3, continuation);
        this.this$0 = c35753oCk;
        this.$pageType = iMPageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(OKConversation oKConversation, RelationInfo relationInfo, Continuation<? super C36559odJ> continuation) {
        ObserveScamBannerUseCase$execute$1 observeScamBannerUseCase$execute$1 = new ObserveScamBannerUseCase$execute$1(this.this$0, this.$pageType, continuation);
        observeScamBannerUseCase$execute$1.L$0 = oKConversation;
        observeScamBannerUseCase$execute$1.L$1 = relationInfo;
        return observeScamBannerUseCase$execute$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return this.this$0.AEQbTJ((OKConversation) this.L$0, (RelationInfo) this.L$1, this.$pageType);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
