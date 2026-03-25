package com.okinc.buysell.domain;

import com.okinc.crcore.shared.net.responsebean.bsc.CryptoListModelBean;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.okpaymentapi.data.remote.model.experience.CryptoListModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC31764mDa;
import o.InterfaceC33171mrS;
import o.lyC;
import o.lyD;

/* JADX INFO: loaded from: classes7.dex */
public final class BuyCryptoListUseCase$getBuyCryptoListCache$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends CryptoListModel, ? extends OKServerException>>, Object> {
    final /* synthetic */ int $ttl;
    int label;
    final /* synthetic */ lyD this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyCryptoListUseCase$getBuyCryptoListCache$2(lyD lyd, int i, Continuation<? super BuyCryptoListUseCase$getBuyCryptoListCache$2> continuation) {
        super(2, continuation);
        this.this$0 = lyd;
        this.$ttl = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BuyCryptoListUseCase$getBuyCryptoListCache$2(this.this$0, this.$ttl, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends CryptoListModel, ? extends OKServerException>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<CryptoListModel, OKServerException>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<CryptoListModel, OKServerException>> continuation) {
        return ((BuyCryptoListUseCase$getBuyCryptoListCache$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            String str = ((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).ejfBZ() ? "1" : "0";
            InterfaceC31764mDa interfaceC31764mDa = this.this$0.copydefault;
            Integer numAEQbTJ = C56443yFo.AEQbTJ(this.$ttl);
            this.label = 1;
            obj = InterfaceC31764mDa.ActionBar.getBuyCryptoList$default(interfaceC31764mDa, str, "FIRST_CACHE", numAEQbTJ, 1, null, this, 16, null);
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
            return new AbstractC43419rot.StateListAnimator(lyC.AEQbTJ.AEQbTJ((CryptoListModelBean) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl()));
        }
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            return new AbstractC43419rot.ActionBar(((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl());
        }
        throw new NoWhenBranchMatchedException();
    }
}
