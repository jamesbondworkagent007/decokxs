package com.okinc.business.trade.features.home.advanced.viewmodel;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
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
import o.C28163kRf;
import o.C55276xgr;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC30595leC;
import o.kQV;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedPlaceOrderVM$updateOrderType$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AdvancedOrderType $orderType;
    Object L$0;
    int label;
    final /* synthetic */ AdvancedPlaceOrderVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedPlaceOrderVM$updateOrderType$1(AdvancedPlaceOrderVM advancedPlaceOrderVM, AdvancedOrderType advancedOrderType, Continuation<? super AdvancedPlaceOrderVM$updateOrderType$1> continuation) {
        super(2, continuation);
        this.this$0 = advancedPlaceOrderVM;
        this.$orderType = advancedOrderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedPlaceOrderVM$updateOrderType$1(this.this$0, this.$orderType, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedPlaceOrderVM$updateOrderType$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        ArrayList arrayList;
        AdvancedPlaceOrderVM advancedPlaceOrderVM;
        Object objOLrzqt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow mutableStateFlow = this.this$0.values;
            AdvancedOrderType advancedOrderType = this.$orderType;
            do {
                value = mutableStateFlow.getValue();
                List<C55276xgr> list = (List) value;
                arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                for (C55276xgr c55276xgr : list) {
                    arrayList.add(C55276xgr.copy$default(c55276xgr, null, null, null, (c55276xgr.OLrzqt() instanceof AdvancedOrderType) && c55276xgr.OLrzqt() == advancedOrderType, false, null, null, 119, null));
                }
            } while (!mutableStateFlow.compareAndSet(value, arrayList));
            this.this$0.AkhnZx.setValue(this.$orderType);
            this.this$0.AEQbTJ("");
            AdvancedPlaceOrderVM.stopCheckingQuote$default(this.this$0, false, false, 3, null);
            advancedPlaceOrderVM = this.this$0;
            kQV kqv = advancedPlaceOrderVM.ORxRYg;
            AdvancedOrderType advancedOrderType2 = this.$orderType;
            this.L$0 = advancedPlaceOrderVM;
            this.label = 1;
            objOLrzqt = kqv.OLrzqt(advancedOrderType2, this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                ((Result) obj).m7386unboximpl();
                return Unit.INSTANCE;
            }
            advancedPlaceOrderVM = (AdvancedPlaceOrderVM) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = obj;
        }
        advancedPlaceOrderVM.EZpvd((InterfaceC30595leC) objOLrzqt);
        this.this$0.dNCPSb.OLrzqt(this.this$0.accept);
        C28163kRf c28163kRf = this.this$0.dNCPSb;
        String str = this.this$0.accept;
        DexMultiTokenInfoBean value2 = this.this$0.ejfBZ().getValue();
        String chainId = value2 != null ? value2.getChainId() : null;
        String str2 = chainId != null ? chainId : "";
        this.L$0 = null;
        this.label = 2;
        if (c28163kRf.OLrzqt(str, str2, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
