package com.okinc.business.trade.features.home.advanced.viewmodel;

import com.okinc.business.dexlogic.bean.SlippageSelectionBean;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedSlippageType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.yDY;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedCustomOtherChainPresetVM$initSlippage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $autoSlippageValue;
    final /* synthetic */ String $slippageValue;
    final /* synthetic */ int $type;
    int label;
    final /* synthetic */ AdvancedCustomOtherChainPresetVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedCustomOtherChainPresetVM$initSlippage$1(String str, int i, String str2, AdvancedCustomOtherChainPresetVM advancedCustomOtherChainPresetVM, Continuation<? super AdvancedCustomOtherChainPresetVM$initSlippage$1> continuation) {
        super(2, continuation);
        this.$autoSlippageValue = str;
        this.$type = i;
        this.$slippageValue = str2;
        this.this$0 = advancedCustomOtherChainPresetVM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedCustomOtherChainPresetVM$initSlippage$1(this.$autoSlippageValue, this.$type, this.$slippageValue, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedCustomOtherChainPresetVM$initSlippage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            String str = this.$autoSlippageValue;
            AdvancedSlippageType advancedSlippageType = AdvancedSlippageType.Auto;
            SlippageSelectionBean slippageSelectionBean = new SlippageSelectionBean(str, str, advancedSlippageType.getValue(), this.$type == advancedSlippageType.getValue());
            String str2 = this.$slippageValue;
            AdvancedSlippageType advancedSlippageType2 = AdvancedSlippageType.Custom;
            this.this$0.copydefault.setValue(yDY.gEmmrt(slippageSelectionBean, new SlippageSelectionBean(str2, str2, advancedSlippageType2.getValue(), this.$type == advancedSlippageType2.getValue())));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
