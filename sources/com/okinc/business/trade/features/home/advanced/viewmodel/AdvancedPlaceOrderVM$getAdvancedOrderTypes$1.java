package com.okinc.business.trade.features.home.advanced.viewmodel;

import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C55276xgr;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.kRD;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedPlaceOrderVM$getAdvancedOrderTypes$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AdvancedPlaceOrderVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedPlaceOrderVM$getAdvancedOrderTypes$1(AdvancedPlaceOrderVM advancedPlaceOrderVM, Continuation<? super AdvancedPlaceOrderVM$getAdvancedOrderTypes$1> continuation) {
        super(2, continuation);
        this.this$0 = advancedPlaceOrderVM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedPlaceOrderVM$getAdvancedOrderTypes$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedPlaceOrderVM$getAdvancedOrderTypes$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7386unboximpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            kRD krd = this.this$0.flVtFt;
            boolean zBooleanValue = this.this$0.ORxRYg.AYXKKw().getValue().booleanValue();
            this.label = 1;
            Object objOLrzqt = krd.OLrzqt(zBooleanValue, this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            objM7386unboximpl = objOLrzqt;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objM7386unboximpl = ((Result) obj).m7386unboximpl();
        }
        AdvancedPlaceOrderVM advancedPlaceOrderVM = this.this$0;
        if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
            List<C55276xgr> list = (List) objM7386unboximpl;
            MutableStateFlow mutableStateFlow = advancedPlaceOrderVM.values;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            for (C55276xgr c55276xgr : list) {
                Object objOLrzqt2 = c55276xgr.OLrzqt();
                arrayList.add(C55276xgr.copy$default(c55276xgr, null, null, null, (objOLrzqt2 instanceof AdvancedOrderType ? (AdvancedOrderType) objOLrzqt2 : null) == advancedPlaceOrderVM.AkhnZx.getValue(), false, null, null, 119, null));
            }
            mutableStateFlow.setValue(arrayList);
        }
        return Unit.INSTANCE;
    }
}
