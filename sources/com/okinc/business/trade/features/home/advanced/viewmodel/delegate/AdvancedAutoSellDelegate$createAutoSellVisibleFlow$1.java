package com.okinc.business.trade.features.home.advanced.viewmodel.delegate;

import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderType;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedTradeType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.yHT;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedAutoSellDelegate$createAutoSellVisibleFlow$1 extends SuspendLambda implements yHT<Boolean, AdvancedOrderType, AdvancedTradeType, Continuation<? super Boolean>, Object> {
    final /* synthetic */ Function0<Boolean> $isSAEnabled;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedAutoSellDelegate$createAutoSellVisibleFlow$1(Function0<Boolean> function0, Continuation<? super AdvancedAutoSellDelegate$createAutoSellVisibleFlow$1> continuation) {
        super(4, continuation);
        this.$isSAEnabled = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHT
    public /* synthetic */ Object invoke(Boolean bool, AdvancedOrderType advancedOrderType, AdvancedTradeType advancedTradeType, Continuation<? super Boolean> continuation) {
        return invoke(bool.booleanValue(), advancedOrderType, advancedTradeType, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(boolean z, AdvancedOrderType advancedOrderType, AdvancedTradeType advancedTradeType, Continuation<? super Boolean> continuation) {
        AdvancedAutoSellDelegate$createAutoSellVisibleFlow$1 advancedAutoSellDelegate$createAutoSellVisibleFlow$1 = new AdvancedAutoSellDelegate$createAutoSellVisibleFlow$1(this.$isSAEnabled, continuation);
        advancedAutoSellDelegate$createAutoSellVisibleFlow$1.Z$0 = z;
        advancedAutoSellDelegate$createAutoSellVisibleFlow$1.L$0 = advancedOrderType;
        advancedAutoSellDelegate$createAutoSellVisibleFlow$1.L$1 = advancedTradeType;
        return advancedAutoSellDelegate$createAutoSellVisibleFlow$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return C56443yFo.KWHzl(this.$isSAEnabled.invoke().booleanValue() && this.Z$0 && ((AdvancedOrderType) this.L$0) == AdvancedOrderType.MARKET && ((AdvancedTradeType) this.L$1) == AdvancedTradeType.BUY);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
