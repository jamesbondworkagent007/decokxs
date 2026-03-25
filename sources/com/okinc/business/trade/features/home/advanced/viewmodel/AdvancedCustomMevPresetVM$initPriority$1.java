package com.okinc.business.trade.features.home.advanced.viewmodel;

import com.okinc.business.dexlogic.bean.MevInfoBean;
import com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedPriorityFeeType;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteAndCallData;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteUiData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedCustomMevPresetVM$initPriority$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $currentPriorityType;
    final /* synthetic */ AdvancedQuoteUiData $quoteData;
    int label;
    final /* synthetic */ AdvancedCustomMevPresetVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedCustomMevPresetVM$initPriority$1(AdvancedCustomMevPresetVM advancedCustomMevPresetVM, int i, AdvancedQuoteUiData advancedQuoteUiData, Continuation<? super AdvancedCustomMevPresetVM$initPriority$1> continuation) {
        super(2, continuation);
        this.this$0 = advancedCustomMevPresetVM;
        this.$currentPriorityType = i;
        this.$quoteData = advancedQuoteUiData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedCustomMevPresetVM$initPriority$1(this.this$0, this.$currentPriorityType, this.$quoteData, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedCustomMevPresetVM$initPriority$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl;
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl2;
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl3;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            Boolean boolAkhnZx = this.this$0.AkhnZx();
            if (boolAkhnZx != null) {
                AdvancedCustomMevPresetVM advancedCustomMevPresetVM = this.this$0;
                int i = this.$currentPriorityType;
                AdvancedQuoteUiData advancedQuoteUiData = this.$quoteData;
                boolean zBooleanValue = boolAkhnZx.booleanValue();
                boolean zFetchVPNInfo = false;
                advancedCustomMevPresetVM.AEQbTJ(i == AdvancedPriorityFeeType.Custom.getValue());
                NonMevPriorityFeeInfo newProxyInstance = null;
                MevInfoBean mevInfoBeanFIwbmz = (advancedQuoteUiData == null || (advancedQuoteAndCallDataKWHzl3 = advancedQuoteUiData.KWHzl()) == null) ? null : advancedQuoteAndCallDataKWHzl3.fIwbmz();
                if (advancedQuoteUiData != null && (advancedQuoteAndCallDataKWHzl2 = advancedQuoteUiData.KWHzl()) != null) {
                    newProxyInstance = advancedQuoteAndCallDataKWHzl2.getNewProxyInstance();
                }
                if (advancedQuoteUiData != null && (advancedQuoteAndCallDataKWHzl = advancedQuoteUiData.KWHzl()) != null) {
                    zFetchVPNInfo = advancedQuoteAndCallDataKWHzl.fetchVPNInfo();
                }
                advancedCustomMevPresetVM.KWHzl.setValue(advancedCustomMevPresetVM.AYXKKw.KWHzl(zBooleanValue, i, mevInfoBeanFIwbmz, newProxyInstance, advancedCustomMevPresetVM.AhwBna.KWHzl(advancedCustomMevPresetVM.AhwBna(), zFetchVPNInfo), "Gwei"));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
