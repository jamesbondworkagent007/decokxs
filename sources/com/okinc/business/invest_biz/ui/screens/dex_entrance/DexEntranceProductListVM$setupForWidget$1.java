package com.okinc.business.invest_biz.ui.screens.dex_entrance;

import com.okinc.business.invest_biz.data.bean.SearchHeaderInfoResponse;
import com.okinc.business.invest_biz.data.bean.SubTabsData;
import com.okinc.business.invest_biz.data.usecase.DexEntranceProductQuery;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC23635iDr;

/* JADX INFO: loaded from: classes6.dex */
public final class DexEntranceProductListVM$setupForWidget$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ DexEntranceProductListVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DexEntranceProductListVM$setupForWidget$1(DexEntranceProductListVM dexEntranceProductListVM, Continuation<? super DexEntranceProductListVM$setupForWidget$1> continuation) {
        super(2, continuation);
        this.this$0 = dexEntranceProductListVM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DexEntranceProductListVM$setupForWidget$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DexEntranceProductListVM$setupForWidget$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7386unboximpl;
        List<SubTabsData> listAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.this$0.AkhnZx != null && this.this$0.isConnected != null) {
                InterfaceC23635iDr interfaceC23635iDr = this.this$0.copydefault;
                long jLongValue = this.this$0.AkhnZx.longValue();
                String str = this.this$0.isConnected;
                this.label = 1;
                Object objOLrzqt = interfaceC23635iDr.OLrzqt(jLongValue, str, this);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                objM7386unboximpl = objOLrzqt;
            } else {
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objM7386unboximpl = ((Result) obj).m7386unboximpl();
        }
        Object obj2 = null;
        if (Result.m7383isFailureimpl(objM7386unboximpl)) {
            objM7386unboximpl = null;
        }
        SearchHeaderInfoResponse searchHeaderInfoResponse = (SearchHeaderInfoResponse) objM7386unboximpl;
        if (searchHeaderInfoResponse != null && (listAEQbTJ = searchHeaderInfoResponse.AEQbTJ()) != null) {
            Iterator<T> it = listAEQbTJ.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((SubTabsData) next).copydefault() > 0) {
                    obj2 = next;
                    break;
                }
            }
            SubTabsData subTabsData = (SubTabsData) obj2;
            if (subTabsData != null) {
                DexEntranceProductListVM dexEntranceProductListVM = this.this$0;
                int iAhwBna = C33129mqd.AhwBna(subTabsData.EZpvd());
                Long l = dexEntranceProductListVM.AkhnZx;
                String str2 = dexEntranceProductListVM.isConnected;
                DexEntranceSortType dexEntranceSortType = DexEntranceSortType.RATE;
                String value = dexEntranceSortType.getValue();
                DexEntranceSortOrder dexEntranceSortOrder = DexEntranceSortOrder.DESC;
                dexEntranceProductListVM.OLrzqt(new DexEntranceProductQuery(iAhwBna, l.longValue(), str2, null, value, dexEntranceSortOrder.getValue(), C56443yFo.KWHzl(false), subTabsData.KWHzl(), 8, null));
                dexEntranceProductListVM.EZpvd(dexEntranceSortType.getValue(), dexEntranceSortOrder.getValue());
            }
        }
        return Unit.INSTANCE;
    }
}
