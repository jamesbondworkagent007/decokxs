package com.okinc.okmarket.ui.market.remind.fragment;

import com.okinc.business.market.bean.TokenInfoForAlert;
import com.okinc.market.common.biz_spot.bean.AlertRemindPo;
import com.okinc.market.common.service.BizMarketService;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.reactive.AwaitKt;
import o.AbstractC58185ywX;
import o.C43417ror;
import o.C56391yDq;
import o.C56442yFn;
import o.C56524yIo;

/* JADX INFO: loaded from: classes10.dex */
public final class PriceEditViewModel$requestEdit$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<Unit>>, Object> {
    final /* synthetic */ AlertRemindPo $item;
    final /* synthetic */ int $sourceType;
    final /* synthetic */ TokenInfoForAlert $tokenAlertInfo;
    int label;
    final /* synthetic */ PriceEditViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceEditViewModel$requestEdit$2(PriceEditViewModel priceEditViewModel, int i, AlertRemindPo alertRemindPo, TokenInfoForAlert tokenInfoForAlert, Continuation<? super PriceEditViewModel$requestEdit$2> continuation) {
        super(2, continuation);
        this.this$0 = priceEditViewModel;
        this.$sourceType = i;
        this.$item = alertRemindPo;
        this.$tokenAlertInfo = tokenInfoForAlert;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PriceEditViewModel$requestEdit$2(this.this$0, this.$sourceType, this.$item, this.$tokenAlertInfo, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<Unit>> continuation) {
        return ((PriceEditViewModel$requestEdit$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC58185ywX<ResponseData<Unit>> abstractC58185ywXAddPriceRemind = ((BizMarketService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(BizMarketService.class))).addPriceRemind(this.this$0.copydefault(this.$sourceType, this.$item, this.$tokenAlertInfo));
            this.label = 1;
            obj = AwaitKt.awaitFirst(abstractC58185ywXAddPriceRemind, this);
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
