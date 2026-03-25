package com.okinc.business.market.features.meme.ui;

import com.okinc.business.market.features.meme.domain.model.ConfigInfoData;
import com.okinc.business.market.features.meme.domain.model.RankInfoData;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28693kfb;

/* JADX INFO: loaded from: classes7.dex */
public final class MemePumpUseCase$getMemeConfig$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends ConfigInfoData, ? extends OKServerException>>, Object> {
    int label;
    final /* synthetic */ MemePumpUseCase this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemePumpUseCase$getMemeConfig$2(MemePumpUseCase memePumpUseCase, Continuation<? super MemePumpUseCase$getMemeConfig$2> continuation) {
        super(2, continuation);
        this.this$0 = memePumpUseCase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemePumpUseCase$getMemeConfig$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends ConfigInfoData, ? extends OKServerException>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<ConfigInfoData, OKServerException>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<ConfigInfoData, OKServerException>> continuation) {
        return ((MemePumpUseCase$getMemeConfig$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC28693kfb interfaceC28693kfb = this.this$0.AkhnZx;
            this.label = 1;
            obj = interfaceC28693kfb.KWHzl(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) obj;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            AbstractC43419rot.StateListAnimator stateListAnimator = (AbstractC43419rot.StateListAnimator) abstractC43419rot;
            this.this$0.AYXKKw = (ConfigInfoData) stateListAnimator.KWHzl();
            RankInfoData rankInfoData = (RankInfoData) CollectionsKt___CollectionsKt.firstOrNull(((ConfigInfoData) stateListAnimator.KWHzl()).getRankInfos());
            int iAhwBna = C33129mqd.AhwBna(rankInfoData != null ? rankInfoData.getMaxTokenCount() : null);
            MemePumpUseCase memePumpUseCase = this.this$0;
            if (iAhwBna != 0) {
                memePumpUseCase.fetchVPNInfo = (int) (((double) iAhwBna) * 1.5d);
            }
        }
        return abstractC43419rot;
    }
}
