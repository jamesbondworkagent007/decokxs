package com.okinc.business.trade.features.home.advanced.viewmodel;

import com.okinc.business.dexlogic.bean.MevInfoBean;
import com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo;
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
public final class AdvancedCustomSolPresetVM$initPriority$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $currentPriorityType;
    final /* synthetic */ String $nativeTokenSymbol;
    final /* synthetic */ AdvancedQuoteUiData $quoteData;
    int label;
    final /* synthetic */ AdvancedCustomSolPresetVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedCustomSolPresetVM$initPriority$1(AdvancedQuoteUiData advancedQuoteUiData, AdvancedCustomSolPresetVM advancedCustomSolPresetVM, int i, String str, Continuation<? super AdvancedCustomSolPresetVM$initPriority$1> continuation) {
        super(2, continuation);
        this.$quoteData = advancedQuoteUiData;
        this.this$0 = advancedCustomSolPresetVM;
        this.$currentPriorityType = i;
        this.$nativeTokenSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedCustomSolPresetVM$initPriority$1(this.$quoteData, this.this$0, this.$currentPriorityType, this.$nativeTokenSymbol, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedCustomSolPresetVM$initPriority$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl;
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl2;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            AdvancedQuoteUiData advancedQuoteUiData = this.$quoteData;
            NonMevPriorityFeeInfo newProxyInstance = null;
            MevInfoBean mevInfoBeanFIwbmz = (advancedQuoteUiData == null || (advancedQuoteAndCallDataKWHzl2 = advancedQuoteUiData.KWHzl()) == null) ? null : advancedQuoteAndCallDataKWHzl2.fIwbmz();
            AdvancedQuoteUiData advancedQuoteUiData2 = this.$quoteData;
            if (advancedQuoteUiData2 != null && (advancedQuoteAndCallDataKWHzl = advancedQuoteUiData2.KWHzl()) != null) {
                newProxyInstance = advancedQuoteAndCallDataKWHzl.getNewProxyInstance();
            }
            this.this$0.AEQbTJ.setValue(this.this$0.fJNWhG.OLrzqt(this.$currentPriorityType, mevInfoBeanFIwbmz, newProxyInstance, this.this$0.AkhnZx(), this.$nativeTokenSymbol));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
