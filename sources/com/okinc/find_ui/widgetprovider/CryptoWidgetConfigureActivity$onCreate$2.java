package com.okinc.find_ui.widgetprovider;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.ActivityC35107npA;
import o.C33070mpX;
import o.C35119npM;
import o.C35192nqg;
import o.C52794wYp;
import o.C56391yDq;
import o.C56442yFn;
import o.qZH;
import o.yDY;

/* JADX INFO: loaded from: classes18.dex */
public final class CryptoWidgetConfigureActivity$onCreate$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC35107npA this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoWidgetConfigureActivity$onCreate$2(ActivityC35107npA activityC35107npA, Continuation<? super CryptoWidgetConfigureActivity$onCreate$2> continuation) {
        super(2, continuation);
        this.this$0 = activityC35107npA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoWidgetConfigureActivity$onCreate$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CryptoWidgetConfigureActivity$onCreate$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow<List<C35119npM.Application>> mutableStateFlowOLrzqt = this.this$0.AEQbTJ().OLrzqt();
            final ActivityC35107npA activityC35107npA = this.this$0;
            FlowCollector<? super List<C35119npM.Application>> flowCollector = new FlowCollector() { // from class: com.okinc.find_ui.widgetprovider.CryptoWidgetConfigureActivity$onCreate$2.4
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                public final Object emit(List<C35119npM.Application> list, Continuation<? super Unit> continuation) {
                    int i2;
                    String str;
                    if ((list instanceof Collection) && list.isEmpty()) {
                        i2 = 0;
                    } else {
                        Iterator<T> it = list.iterator();
                        i2 = 0;
                        while (it.hasNext()) {
                            if (((C35119npM.Application) it.next()).OLrzqt() == 1 && (i2 = i2 + 1) < 0) {
                                yDY.djBIcL();
                            }
                        }
                    }
                    if (Intrinsics.EZpvd((Object) activityC35107npA.fetchVPNInfo, (Object) "FIVE_INST_PREFS_KEY_STRING") || Intrinsics.EZpvd((Object) activityC35107npA.fetchVPNInfo, (Object) "TWO_INST_PREFS_KEY_STRING")) {
                        str = "";
                    } else {
                        str = "(" + i2 + "/" + C35192nqg.EZpvd(activityC35107npA.fetchVPNInfo) + ")";
                    }
                    String str2 = C33070mpX.AYXKKw(qZH.PendingIntent.dNCPSb) + str;
                    C52794wYp c52794wYp = activityC35107npA.AhwBna;
                    if (c52794wYp != null) {
                        c52794wYp.setText(str2);
                    }
                    C52794wYp c52794wYp2 = activityC35107npA.AhwBna;
                    if (c52794wYp2 != null) {
                        c52794wYp2.setEnabled(i2 > 0);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (mutableStateFlowOLrzqt.collect(flowCollector, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        throw new KotlinNothingValueException();
    }
}
