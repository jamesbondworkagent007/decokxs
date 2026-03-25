package com.okinc.business.market.features.alert.list.ui;

import com.okinc.business.market.data.model.alert.AlertDataUiItem;
import com.okinc.business.market.data.model.alert.AlertDeleteRequest;
import com.okinc.business.market.data.model.alert.AlertType;
import com.okinc.business.market.data.model.alert.AlertUiItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C25802jGx;
import o.C25813jHh;
import o.C25829jHx;
import o.C33129mqd;
import o.C43296rmc;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC25830jHy;
import o.xVW;

/* JADX INFO: loaded from: classes18.dex */
public final class Web3AlertListViewModel$deleteSelectedAlerts$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<AlertDataUiItem> $selectedAlerts;
    Object L$0;
    int label;
    final /* synthetic */ C25829jHx this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Web3AlertListViewModel$deleteSelectedAlerts$1(C25829jHx c25829jHx, List<AlertDataUiItem> list, Continuation<? super Web3AlertListViewModel$deleteSelectedAlerts$1> continuation) {
        super(2, continuation);
        this.this$0 = c25829jHx;
        this.$selectedAlerts = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Web3AlertListViewModel$deleteSelectedAlerts$1(this.this$0, this.$selectedAlerts, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Web3AlertListViewModel$deleteSelectedAlerts$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        InterfaceC25830jHy.ActionBar actionBar;
        Object objM7386unboximpl;
        Object value2;
        Object value3;
        Object value4;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.this$0.KWHzl.getValue() instanceof InterfaceC25830jHy.ActionBar) {
                Object value5 = this.this$0.KWHzl.getValue();
                Intrinsics.copydefault(value5, "");
                InterfaceC25830jHy.ActionBar actionBar2 = (InterfaceC25830jHy.ActionBar) value5;
                MutableStateFlow mutableStateFlow = this.this$0.KWHzl;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, new InterfaceC25830jHy.ActionBar.Dialog(actionBar2.EZpvd(), actionBar2.AEQbTJ())));
                C25802jGx c25802jGx = this.this$0.EZpvd;
                List<AlertDataUiItem> list = this.$selectedAlerts;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((AlertDataUiItem) obj2).AEQbTJ() == AlertType.MARKETCAP) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(C56443yFo.AEQbTJ(C33129mqd.AhwBna(((AlertDataUiItem) it.next()).OLrzqt())));
                }
                List<AlertDataUiItem> list2 = this.$selectedAlerts;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : list2) {
                    if (((AlertDataUiItem) obj3).AEQbTJ() == AlertType.PRICE) {
                        arrayList3.add(obj3);
                    }
                }
                ArrayList arrayList4 = new ArrayList(C56403yEb.AYXKKw(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(C56443yFo.AEQbTJ(C33129mqd.AhwBna(((AlertDataUiItem) it2.next()).OLrzqt())));
                }
                String strCopydefault = xVW.copydefault();
                Intrinsics.checkNotNullExpressionValue(strCopydefault, "");
                AlertDeleteRequest alertDeleteRequest = new AlertDeleteRequest(arrayList2, arrayList4, strCopydefault);
                this.L$0 = actionBar2;
                this.label = 1;
                Object objOLrzqt = c25802jGx.OLrzqt(alertDeleteRequest, this);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                actionBar = actionBar2;
                objM7386unboximpl = objOLrzqt;
            } else {
                C56443yFo.AEQbTJ(C43296rmc.KWHzl("Web3AlertListViewModel", "Cannot delete selected items from alert list, current state is not success"));
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (InterfaceC25830jHy.ActionBar) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objM7386unboximpl = ((Result) obj).m7386unboximpl();
        }
        List<AlertDataUiItem> list3 = this.$selectedAlerts;
        C25829jHx c25829jHx = this.this$0;
        if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
            ((Number) objM7386unboximpl).intValue();
            List<AlertUiItem> listEZpvd = actionBar.EZpvd();
            ArrayList arrayList5 = new ArrayList(C56403yEb.AYXKKw(list3, 10));
            Iterator<T> it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList5.add(((AlertDataUiItem) it3.next()).OLrzqt());
            }
            List<AlertUiItem> listKWHzl = C25813jHh.KWHzl(listEZpvd, arrayList5);
            if (listKWHzl.isEmpty()) {
                MutableStateFlow mutableStateFlow2 = c25829jHx.KWHzl;
                do {
                    value4 = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.compareAndSet(value4, new InterfaceC25830jHy.Application(true, false, 2, null)));
            } else {
                MutableStateFlow mutableStateFlow3 = c25829jHx.KWHzl;
                do {
                    value3 = mutableStateFlow3.getValue();
                } while (!mutableStateFlow3.compareAndSet(value3, new InterfaceC25830jHy.ActionBar.TaskDescription(C25813jHh.OLrzqt(listKWHzl), false)));
            }
        }
        C25829jHx c25829jHx2 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objM7386unboximpl) != null) {
            MutableStateFlow mutableStateFlow4 = c25829jHx2.KWHzl;
            do {
                value2 = mutableStateFlow4.getValue();
            } while (!mutableStateFlow4.compareAndSet(value2, new InterfaceC25830jHy.ActionBar.Application(actionBar.EZpvd(), actionBar.AEQbTJ())));
        }
        Result.m7376boximpl(objM7386unboximpl);
        return Unit.INSTANCE;
    }
}
