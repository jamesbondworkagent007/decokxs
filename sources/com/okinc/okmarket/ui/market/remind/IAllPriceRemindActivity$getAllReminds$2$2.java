package com.okinc.okmarket.ui.market.remind;

import com.okinc.market.alert.data.MarketUserAlert;
import com.okinc.market.common.biz_spot.bean.AlertRemindPo;
import com.okinc.network.okg.response.ResponseData;
import java.util.ArrayList;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractActivityC46767tdQ;
import o.C33129mqd;
import o.C38383pWt;
import o.C55686xod;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes10.dex */
public final class IAllPriceRemindActivity$getAllReminds$2$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ResponseData<ArrayList<AlertRemindPo>> $resp;
    int label;
    final /* synthetic */ AbstractActivityC46767tdQ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IAllPriceRemindActivity$getAllReminds$2$2(ResponseData<ArrayList<AlertRemindPo>> responseData, AbstractActivityC46767tdQ abstractActivityC46767tdQ, Continuation<? super IAllPriceRemindActivity$getAllReminds$2$2> continuation) {
        super(2, continuation);
        this.$resp = responseData;
        this.this$0 = abstractActivityC46767tdQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IAllPriceRemindActivity$getAllReminds$2$2(this.$resp, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((IAllPriceRemindActivity$getAllReminds$2$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
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
                        arrayList2.add(C56443yFo.KWHzl(arrayList.add(new MarketUserAlert(0L, alertRemindPo.getInstrumentName(), C55686xod.KWHzl(), String.valueOf(alertRemindPo.getBizType()), alertRemindPo.getModifyTime(), C33129mqd.gEmmrt(C56443yFo.KWHzl(alertRemindPo.getRuleId())), alertRemindPo.getChainId(), alertRemindPo.getTokenAddress(), 1, null))));
                    }
                }
                AbstractActivityC46767tdQ abstractActivityC46767tdQ = this.this$0;
                Result.Application application = Result.Companion;
                C38383pWt c38383pWtOLrzqt = abstractActivityC46767tdQ.OLrzqt();
                this.label = 1;
                if (c38383pWtOLrzqt.EZpvd(arrayList, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault("IAllPriceRemindActivity", "getAllReminds: Database operation failed, error: " + thM7380exceptionOrNullimpl.getMessage());
        }
        return Unit.INSTANCE;
    }
}
