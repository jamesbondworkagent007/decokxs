package com.okinc.find_ui.widgetprovider.logic;

import com.okinc.find_ui.widgetprovider.p2p.data.P2PTradeSide;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C35119npM;
import o.C35127npU;
import o.C43296rmc;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class AppWidgetSearchViewModel$initType$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $appWidgetId;
    final /* synthetic */ String $appWidgetType;
    int label;
    final /* synthetic */ C35119npM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppWidgetSearchViewModel$initType$1(String str, C35119npM c35119npM, int i, Continuation<? super AppWidgetSearchViewModel$initType$1> continuation) {
        super(2, continuation);
        this.$appWidgetType = str;
        this.this$0 = c35119npM;
        this.$appWidgetId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AppWidgetSearchViewModel$initType$1(this.$appWidgetType, this.this$0, this.$appWidgetId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AppWidgetSearchViewModel$initType$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        P2PTradeSide p2PTradeSideKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C43296rmc.AEQbTJ("AppWidgetSearchViewModel", "initType() called");
            if (!Intrinsics.EZpvd((Object) this.$appWidgetType, (Object) "P2P_MARKET_PREFS_KEY_STRING")) {
                C35119npM c35119npM = this.this$0;
                int i2 = this.$appWidgetId;
                String str = this.$appWidgetType;
                this.label = 2;
                if (c35119npM.AEQbTJ(i2, str, (Continuation<? super Unit>) this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                String strCopydefault = C35127npU.copydefault(this.this$0.getApplication(), this.$appWidgetId);
                if (strCopydefault.length() > 0) {
                    p2PTradeSideKWHzl = P2PTradeSide.Companion.KWHzl(strCopydefault);
                } else {
                    p2PTradeSideKWHzl = P2PTradeSide.BUY;
                }
                C35119npM c35119npM2 = this.this$0;
                this.label = 1;
                if (c35119npM2.EZpvd(p2PTradeSideKWHzl, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
