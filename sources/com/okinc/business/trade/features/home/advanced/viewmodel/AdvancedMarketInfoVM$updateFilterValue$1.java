package com.okinc.business.trade.features.home.advanced.viewmodel;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.ui.cefi.data.FilterValue;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C55276xgr;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedMarketInfoVM$updateFilterValue$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FilterValue $filterValue;
    int label;
    final /* synthetic */ AdvancedMarketInfoVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedMarketInfoVM$updateFilterValue$1(AdvancedMarketInfoVM advancedMarketInfoVM, FilterValue filterValue, Continuation<? super AdvancedMarketInfoVM$updateFilterValue$1> continuation) {
        super(2, continuation);
        this.this$0 = advancedMarketInfoVM;
        this.$filterValue = filterValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedMarketInfoVM$updateFilterValue$1(this.this$0, this.$filterValue, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedMarketInfoVM$updateFilterValue$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        ArrayList arrayList;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow mutableStateFlow = this.this$0.copydefault;
            FilterValue filterValue = this.$filterValue;
            do {
                value = mutableStateFlow.getValue();
                List<C55276xgr> list = (List) value;
                arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                for (C55276xgr c55276xgr : list) {
                    Object objOLrzqt = c55276xgr.OLrzqt();
                    Intrinsics.copydefault(objOLrzqt, "");
                    arrayList.add(C55276xgr.copy$default(c55276xgr, null, null, null, ((FilterValue) objOLrzqt).AEQbTJ(filterValue), false, null, null, 119, null));
                }
            } while (!mutableStateFlow.compareAndSet(value, arrayList));
            MutableStateFlow<FilterValue> mutableStateFlowEZpvd = this.this$0.EZpvd();
            FilterValue filterValue2 = this.$filterValue;
            DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = this.this$0.copydefault();
            String chainId = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getChainId() : null;
            String str = chainId == null ? "" : chainId;
            DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault2 = this.this$0.copydefault();
            String tokenContractAddress = dexMultiTokenInfoBeanCopydefault2 != null ? dexMultiTokenInfoBeanCopydefault2.getTokenContractAddress() : null;
            mutableStateFlowEZpvd.setValue(FilterValue.copy$default(filterValue2, str, tokenContractAddress == null ? "" : tokenContractAddress, null, null, 12, null));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
