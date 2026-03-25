package com.okinc.business.trade.features.home.advanced.viewmodel;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.ui.cefi.common.OrderFilter;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C28179kRv;
import o.C55276xgr;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedMarketInfoVM$getFilterSwitches$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ AdvancedMarketInfoVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedMarketInfoVM$getFilterSwitches$1(AdvancedMarketInfoVM advancedMarketInfoVM, Continuation<? super AdvancedMarketInfoVM$getFilterSwitches$1> continuation) {
        super(2, continuation);
        this.this$0 = advancedMarketInfoVM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedMarketInfoVM$getFilterSwitches$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedMarketInfoVM$getFilterSwitches$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        MutableStateFlow mutableStateFlow;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow mutableStateFlow2 = this.this$0.KWHzl;
            C28179kRv c28179kRv = this.this$0.AuCTel;
            this.L$0 = mutableStateFlow2;
            this.label = 1;
            objOLrzqt = c28179kRv.OLrzqt(this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            mutableStateFlow = mutableStateFlow2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableStateFlow = (MutableStateFlow) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = obj;
        }
        Iterable<C55276xgr> iterable = (Iterable) objOLrzqt;
        AdvancedMarketInfoVM advancedMarketInfoVM = this.this$0;
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(iterable, 10));
        for (C55276xgr c55276xgr : iterable) {
            arrayList.add(C55276xgr.copy$default(c55276xgr, null, null, null, c55276xgr.OLrzqt() != OrderFilter.Amount ? !((dexMultiTokenInfoBeanCopydefault = advancedMarketInfoVM.copydefault()) == null || dexMultiTokenInfoBeanCopydefault.isMemeToken()) : !((dexMultiTokenInfoBeanCopydefault2 = advancedMarketInfoVM.copydefault()) == null || !dexMultiTokenInfoBeanCopydefault2.isMemeToken()), false, null, null, 119, null));
        }
        mutableStateFlow.setValue(arrayList);
        return Unit.INSTANCE;
    }
}
