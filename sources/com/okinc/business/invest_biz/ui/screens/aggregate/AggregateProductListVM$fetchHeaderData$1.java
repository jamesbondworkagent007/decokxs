package com.okinc.business.invest_biz.ui.screens.aggregate;

import com.okinc.business.invest_biz.data.bean.AggregateHeaderData;
import com.okinc.business.invest_biz.data.bean.SubTabsData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C23613iCw;
import o.C23722iGx;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC23690iFs;
import o.iWU;
import o.iWV;
import o.iWX;
import o.pUU;

/* JADX INFO: loaded from: classes6.dex */
public final class AggregateProductListVM$fetchHeaderData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $itemKey;
    final /* synthetic */ int $tabId;
    final /* synthetic */ String $tokenAmt;
    Object L$0;
    int label;
    final /* synthetic */ AggregateProductListVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AggregateProductListVM$fetchHeaderData$1(AggregateProductListVM aggregateProductListVM, int i, String str, String str2, Continuation<? super AggregateProductListVM$fetchHeaderData$1> continuation) {
        super(2, continuation);
        this.this$0 = aggregateProductListVM;
        this.$tabId = i;
        this.$itemKey = str;
        this.$tokenAmt = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AggregateProductListVM$fetchHeaderData$1(this.this$0, this.$tabId, this.$itemKey, this.$tokenAmt, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AggregateProductListVM$fetchHeaderData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        Object obj2;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC23690iFs interfaceC23690iFs = this.this$0.AhwBna;
            C23722iGx c23722iGx = new C23722iGx(this.$tabId, this.$itemKey, this.$tokenAmt);
            this.label = 1;
            objEZpvd = interfaceC23690iFs.EZpvd(c23722iGx, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                objEZpvd = obj2;
                AggregateProductListVM aggregateProductListVM = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objEZpvd);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.KWHzl(thM7380exceptionOrNullimpl);
                    aggregateProductListVM.EZpvd.setValue(iWU.TaskDescription.EZpvd);
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
        }
        AggregateProductListVM aggregateProductListVM2 = this.this$0;
        if (Result.m7384isSuccessimpl(objEZpvd)) {
            AggregateHeaderData aggregateHeaderData = (AggregateHeaderData) objEZpvd;
            aggregateProductListVM2.EZpvd.setValue(new iWU.Activity(aggregateProductListVM2.AYXKKw.KWHzl(aggregateHeaderData)));
            List<SubTabsData> listAEQbTJ = aggregateHeaderData.ejfBZ().AEQbTJ();
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
            for (SubTabsData subTabsData : listAEQbTJ) {
                arrayList.add(new iWX(subTabsData.EZpvd(), subTabsData.KWHzl(), C23613iCw.mapToAggregateFilter$default(subTabsData.AEQbTJ(), null, 1, null), 0, 8, null));
            }
            MutableStateFlow mutableStateFlow = aggregateProductListVM2.KWHzl;
            iWV.ActionBar actionBar = new iWV.ActionBar(arrayList);
            this.L$0 = objEZpvd;
            this.label = 2;
            if (mutableStateFlow.emit(actionBar, this) == objCopydefault) {
                return objCopydefault;
            }
            obj2 = objEZpvd;
            objEZpvd = obj2;
        }
        AggregateProductListVM aggregateProductListVM3 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objEZpvd);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
