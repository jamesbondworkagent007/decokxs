package com.okinc.buysell.ui.base;

import com.okinc.buysell.data.GetBannerResp;
import com.okinc.buysell.util.PaymentLogger;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.okx.paymentapi.service.SupportBanner;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C56391yDq;
import o.C56442yFn;
import o.lTU;
import o.lyM;
import o.lzT;

/* JADX INFO: loaded from: classes7.dex */
public final class BaseBscFragmentViewModel$runBannerCheck$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $useCache;
    int label;
    final /* synthetic */ lzT this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseBscFragmentViewModel$runBannerCheck$2(lzT lzt, boolean z, Continuation<? super BaseBscFragmentViewModel$runBannerCheck$2> continuation) {
        super(2, continuation);
        this.this$0 = lzt;
        this.$useCache = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseBscFragmentViewModel$runBannerCheck$2(this.this$0, this.$useCache, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseBscFragmentViewModel$runBannerCheck$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ArrayList<SupportBanner> supportBanners;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            lyM lym = this.this$0.copydefault;
            boolean z = this.$useCache;
            this.label = 1;
            obj = lym.EZpvd(z, this);
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
        lzT lzt = this.this$0;
        if ((abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) && (supportBanners = ((GetBannerResp) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl()).getSupportBanners()) != null) {
            lTU.OLrzqt.OLrzqt(new ArrayList<>(supportBanners));
            lzt.OLrzqt();
        }
        lzT lzt2 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            OKServerException oKServerException = (OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl();
            PaymentLogger.EZpvd.AEQbTJ(PaymentLogger.Type.OTHER, "Get banner call failed " + oKServerException.getMessage());
            lzt2.EZpvd();
        }
        return Unit.INSTANCE;
    }
}
