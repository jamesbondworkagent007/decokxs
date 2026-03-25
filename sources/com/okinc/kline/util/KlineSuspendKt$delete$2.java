package com.okinc.kline.util;

import com.okinc.kline.data.PriceWarningItemBean;
import com.okinc.market.common.biz_spot.bean.DeleteRuleRep;
import com.okinc.market.common.service.KlineBizMarketService;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C43417ror;
import o.C56391yDq;
import o.C56442yFn;
import o.C56524yIo;

/* JADX INFO: loaded from: classes16.dex */
public final class KlineSuspendKt$delete$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<Unit>>, Object> {
    final /* synthetic */ PriceWarningItemBean $priceWarningItemBean;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KlineSuspendKt$delete$2(PriceWarningItemBean priceWarningItemBean, Continuation<? super KlineSuspendKt$delete$2> continuation) {
        super(2, continuation);
        this.$priceWarningItemBean = priceWarningItemBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KlineSuspendKt$delete$2(this.$priceWarningItemBean, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<Unit>> continuation) {
        return ((KlineSuspendKt$delete$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            KlineBizMarketService klineBizMarketService = (KlineBizMarketService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(KlineBizMarketService.class));
            DeleteRuleRep deleteRuleRep = new DeleteRuleRep(this.$priceWarningItemBean.getSourceType(), this.$priceWarningItemBean.getRuleId(), this.$priceWarningItemBean.getBizType());
            this.label = 1;
            obj = klineBizMarketService.deletePriceRemindsByInstName(deleteRuleRep, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
