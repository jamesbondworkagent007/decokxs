package com.okinc.kline.ui.view;

import com.okinc.kline.news.data.KlineCampaignData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C33129mqd;
import o.C55298xhM;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pAN;

/* JADX INFO: loaded from: classes9.dex */
public final class KlineReferralView$requestData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ KlineReferralView this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KlineReferralView$requestData$1(KlineReferralView klineReferralView, Continuation<? super KlineReferralView$requestData$1> continuation) {
        super(2, continuation);
        this.this$0 = klineReferralView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KlineReferralView$requestData$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KlineReferralView$requestData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            pAN pan = this.this$0.valueOf;
            this.label = 1;
            if (pan.copydefault(this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        KlineCampaignData klineCampaignDataAEQbTJ = this.this$0.valueOf.AEQbTJ();
        boolean zOLrzqt = C33129mqd.OLrzqt((CharSequence) (klineCampaignDataAEQbTJ != null ? klineCampaignDataAEQbTJ.getUrlSlug() : null));
        this.this$0.setVisibility(zOLrzqt ? 0 : 8);
        if (zOLrzqt) {
            Function1 function1 = this.this$0.copydefault;
            if (function1 != null) {
                function1.invoke(C56443yFo.AEQbTJ(C33129mqd.AhwBna(C56443yFo.AEQbTJ(C55298xhM.dp2px$default(24.0f, null, 1, null)))));
            }
            this.this$0.setContent();
        }
        return Unit.INSTANCE;
    }
}
