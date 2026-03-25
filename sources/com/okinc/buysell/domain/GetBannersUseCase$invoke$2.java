package com.okinc.buysell.domain;

import com.okinc.crcore.shared.net.responsebean.bsc.GetBannerBean;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC31764mDa;
import o.lyM;

/* JADX INFO: loaded from: classes7.dex */
public final class GetBannersUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends GetBannerBean, ? extends OKServerException>>, Object> {
    final /* synthetic */ boolean $useCache;
    int label;
    final /* synthetic */ lyM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetBannersUseCase$invoke$2(boolean z, lyM lym, Continuation<? super GetBannersUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.$useCache = z;
        this.this$0 = lym;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetBannersUseCase$invoke$2(this.$useCache, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends GetBannerBean, ? extends OKServerException>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<GetBannerBean, OKServerException>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<GetBannerBean, OKServerException>> continuation) {
        return ((GetBannersUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                C56391yDq.AEQbTJ(obj);
                return (AbstractC43419rot) obj;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return (AbstractC43419rot) obj;
        }
        C56391yDq.AEQbTJ(obj);
        if (this.$useCache) {
            InterfaceC31764mDa interfaceC31764mDa = this.this$0.AEQbTJ;
            Integer numAEQbTJ = C56443yFo.AEQbTJ(lyM.Companion.EZpvd());
            this.label = 1;
            obj = InterfaceC31764mDa.ActionBar.getBanner$default(interfaceC31764mDa, null, numAEQbTJ, null, this, 5, null);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            return (AbstractC43419rot) obj;
        }
        InterfaceC31764mDa interfaceC31764mDa2 = this.this$0.AEQbTJ;
        this.label = 2;
        obj = InterfaceC31764mDa.ActionBar.getBanner$default(interfaceC31764mDa2, null, null, null, this, 7, null);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        return (AbstractC43419rot) obj;
    }
}
