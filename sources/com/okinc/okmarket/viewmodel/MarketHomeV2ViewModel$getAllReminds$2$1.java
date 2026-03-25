package com.okinc.okmarket.viewmodel;

import com.okinc.market.alert.data.MarketUserAlert;
import com.okinc.market.common.biz_spot.bean.AlertRemindPo;
import com.okinc.network.okg.response.ResponseData;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C33129mqd;
import o.C38383pWt;
import o.C55686xod;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes10.dex */
public final class MarketHomeV2ViewModel$getAllReminds$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ResponseData<ArrayList<AlertRemindPo>> $resp;
    int label;
    final /* synthetic */ MarketHomeV2ViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketHomeV2ViewModel$getAllReminds$2$1(ResponseData<ArrayList<AlertRemindPo>> responseData, MarketHomeV2ViewModel marketHomeV2ViewModel, Continuation<? super MarketHomeV2ViewModel$getAllReminds$2$1> continuation) {
        super(2, continuation);
        this.$resp = responseData;
        this.this$0 = marketHomeV2ViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketHomeV2ViewModel$getAllReminds$2$1(this.$resp, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketHomeV2ViewModel$getAllReminds$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            } else {
                C56391yDq.AEQbTJ(obj);
                ArrayList arrayList = new ArrayList();
                ArrayList<AlertRemindPo> data = this.$resp.getData();
                if (data != null) {
                    ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(data, 10));
                    for (AlertRemindPo alertRemindPo : data) {
                        String instrumentName = alertRemindPo.getInstrumentName();
                        String strKWHzl = C55686xod.KWHzl();
                        int bizType = alertRemindPo.getBizType();
                        arrayList2.add(C56443yFo.KWHzl(arrayList.add(new MarketUserAlert(0L, instrumentName, strKWHzl, String.valueOf(bizType), alertRemindPo.getModifyTime(), C33129mqd.gEmmrt(C56443yFo.KWHzl(alertRemindPo.getRuleId())), alertRemindPo.getChainId(), alertRemindPo.getTokenAddress(), 1, null))));
                    }
                }
                C38383pWt c38383pWtGEmmrt = this.this$0.gEmmrt();
                this.label = 1;
                if (c38383pWtGEmmrt.EZpvd(arrayList, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } catch (Exception e) {
            pUU.AEQbTJ("MarketHomeV2ViewModel", "getAllReminds: Database operation failed", e);
        }
        return Unit.INSTANCE;
    }
}
