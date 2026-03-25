package com.okinc.business.trade.features.home.advanced.viewmodel;

import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedCustomMevPresetVM$setSlippageMode$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SlippageMode $slippageMode;
    int label;
    final /* synthetic */ AdvancedCustomMevPresetVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedCustomMevPresetVM$setSlippageMode$1(AdvancedCustomMevPresetVM advancedCustomMevPresetVM, SlippageMode slippageMode, Continuation<? super AdvancedCustomMevPresetVM$setSlippageMode$1> continuation) {
        super(2, continuation);
        this.this$0 = advancedCustomMevPresetVM;
        this.$slippageMode = slippageMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedCustomMevPresetVM$setSlippageMode$1(this.this$0, this.$slippageMode, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedCustomMevPresetVM$setSlippageMode$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        this.this$0.EZpvd.setValue(this.$slippageMode);
        return Unit.INSTANCE;
    }
}
