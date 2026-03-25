package com.okinc.find_ui.widgetprovider;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import com.okinc.find_ui.widgetprovider.logic.CryptoWidgetWorker;
import com.okinc.find_ui.widgetprovider.p2p.P2PCryptoWidgetWorker;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC35107npA;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class CryptoWidgetConfigureActivity$onCreate$3$1$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC35107npA this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoWidgetConfigureActivity$onCreate$3$1$job$1(ActivityC35107npA activityC35107npA, Continuation<? super CryptoWidgetConfigureActivity$onCreate$3$1$job$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC35107npA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoWidgetConfigureActivity$onCreate$3$1$job$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CryptoWidgetConfigureActivity$onCreate$3$1$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(this.this$0.getApplicationContext());
            if (Intrinsics.EZpvd((Object) this.this$0.fetchVPNInfo, (Object) "P2P_MARKET_PREFS_KEY_STRING")) {
                P2PCryptoWidgetWorker.Activity activity = P2PCryptoWidgetWorker.Companion;
                Intrinsics.copydefault(appWidgetManager);
                Context applicationContext = this.this$0.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "");
                activity.AEQbTJ(appWidgetManager, applicationContext, true);
            } else {
                CryptoWidgetWorker.StateListAnimator stateListAnimator = CryptoWidgetWorker.Companion;
                Intrinsics.copydefault(appWidgetManager);
                Context applicationContext2 = this.this$0.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext2, "");
                this.label = 1;
                if (stateListAnimator.OLrzqt(appWidgetManager, applicationContext2, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
