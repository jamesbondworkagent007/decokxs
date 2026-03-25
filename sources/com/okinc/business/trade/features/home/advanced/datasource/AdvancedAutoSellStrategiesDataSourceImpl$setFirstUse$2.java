package com.okinc.business.trade.features.home.advanced.datasource;

import android.content.SharedPreferences;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.kPP;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedAutoSellStrategiesDataSourceImpl$setFirstUse$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isFirstUse;
    int label;
    final /* synthetic */ kPP this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedAutoSellStrategiesDataSourceImpl$setFirstUse$2(kPP kpp, boolean z, Continuation<? super AdvancedAutoSellStrategiesDataSourceImpl$setFirstUse$2> continuation) {
        super(2, continuation);
        this.this$0 = kpp;
        this.$isFirstUse = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedAutoSellStrategiesDataSourceImpl$setFirstUse$2(this.this$0, this.$isFirstUse, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedAutoSellStrategiesDataSourceImpl$setFirstUse$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            SharedPreferences sharedPreferences = this.this$0.OLrzqt;
            boolean z = this.$isFirstUse;
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            Intrinsics.checkNotNullExpressionValue(editorEdit, "");
            editorEdit.putBoolean("key_dex_advanced_auto_sell_strategies_first_use", z);
            editorEdit.apply();
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
