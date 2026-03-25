package com.okinc.business.trade.features.home.advanced.viewmodel;

import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedPriorityFeeType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C30563ldX;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedCustomMevPresetVM$initParameters$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $priorityFeeTypeValue;
    final /* synthetic */ String $priorityValue;
    final /* synthetic */ SlippageMode $slippageMode;
    final /* synthetic */ String $slippageValue;
    int label;
    final /* synthetic */ AdvancedCustomMevPresetVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedCustomMevPresetVM$initParameters$1(AdvancedCustomMevPresetVM advancedCustomMevPresetVM, int i, String str, String str2, SlippageMode slippageMode, Continuation<? super AdvancedCustomMevPresetVM$initParameters$1> continuation) {
        super(2, continuation);
        this.this$0 = advancedCustomMevPresetVM;
        this.$priorityFeeTypeValue = i;
        this.$priorityValue = str;
        this.$slippageValue = str2;
        this.$slippageMode = slippageMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedCustomMevPresetVM$initParameters$1(this.this$0, this.$priorityFeeTypeValue, this.$priorityValue, this.$slippageValue, this.$slippageMode, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedCustomMevPresetVM$initParameters$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.AEQbTJ.setValue(new C30563ldX(AdvancedPriorityFeeType.Companion.EZpvd(this.$priorityFeeTypeValue), this.$priorityValue, true));
            this.this$0.OLrzqt.setValue(this.$slippageValue);
            this.this$0.OLrzqt(this.$slippageMode);
            this.this$0.AEQbTJ(this.$priorityFeeTypeValue);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
