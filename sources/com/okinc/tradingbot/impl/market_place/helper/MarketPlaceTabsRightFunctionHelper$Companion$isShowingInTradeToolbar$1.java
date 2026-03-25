package com.okinc.tradingbot.impl.market_place.helper;

import android.content.SharedPreferences;
import com.okinc.core.util.SPUtils;
import com.okinc.tradingbot.impl.market_place.helper.MarketPlaceTabsRightFunctionHelper$Companion$isShowingInTradeToolbar$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import o.C43246rlf;
import o.C49707utd;
import o.C51404vmQ;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes19.dex */
public final class MarketPlaceTabsRightFunctionHelper$Companion$isShowingInTradeToolbar$1 extends SuspendLambda implements Function2<ProducerScope<? super Boolean>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MarketPlaceTabsRightFunctionHelper$Companion$isShowingInTradeToolbar$1(Continuation<? super MarketPlaceTabsRightFunctionHelper$Companion$isShowingInTradeToolbar$1> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarketPlaceTabsRightFunctionHelper$Companion$isShowingInTradeToolbar$1 marketPlaceTabsRightFunctionHelper$Companion$isShowingInTradeToolbar$1 = new MarketPlaceTabsRightFunctionHelper$Companion$isShowingInTradeToolbar$1(continuation);
        marketPlaceTabsRightFunctionHelper$Companion$isShowingInTradeToolbar$1.L$0 = obj;
        return marketPlaceTabsRightFunctionHelper$Companion$isShowingInTradeToolbar$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super Boolean> producerScope, Continuation<? super Unit> continuation) {
        return ((MarketPlaceTabsRightFunctionHelper$Companion$isShowingInTradeToolbar$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            final SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: o.vmV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String str) {
                    MarketPlaceTabsRightFunctionHelper$Companion$isShowingInTradeToolbar$1.invokeSuspend$lambda$0(producerScope, sharedPreferences, str);
                }
            };
            SPUtils.registerOnSPChangeListener(null, onSharedPreferenceChangeListener);
            Function0 function0 = new Function0() { // from class: o.vmW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return MarketPlaceTabsRightFunctionHelper$Companion$isShowingInTradeToolbar$1.invokeSuspend$lambda$1(onSharedPreferenceChangeListener);
                }
            };
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, function0, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(ProducerScope producerScope, SharedPreferences sharedPreferences, String str) {
        if (Intrinsics.EZpvd((Object) str, (Object) C49707utd.Companion.KWHzl())) {
            producerScope.mo5769trySendJP2dKIU(Boolean.valueOf(C51404vmQ.Companion.EZpvd()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        SharedPreferences sharedPreferences = C43246rlf.OLrzqt.valueOf().getSharedPreferences("config", 0);
        if (sharedPreferences != null) {
            sharedPreferences.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        }
        return Unit.INSTANCE;
    }
}
