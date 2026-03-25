package com.okinc.common.util;

import com.okinc.components.report.EventAction;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.lib.monitor.bean.ActivityInfo;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C32650mhb;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes7.dex */
public final class MonitorUtils$onActivityInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ActivityInfo $counterInfo;
    int label;
    final /* synthetic */ C32650mhb this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MonitorUtils$onActivityInfo$1(ActivityInfo activityInfo, C32650mhb c32650mhb, Continuation<? super MonitorUtils$onActivityInfo$1> continuation) {
        super(2, continuation);
        this.$counterInfo = activityInfo;
        this.this$0 = c32650mhb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MonitorUtils$onActivityInfo$1(this.$counterInfo, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MonitorUtils$onActivityInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            ActivityInfo activityInfo = this.$counterInfo;
            if (activityInfo != null) {
                String strOLrzqt = this.this$0.OLrzqt();
                String string = activityInfo.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                pUU.copydefault(strOLrzqt, string);
                EventData eventData = new EventData();
                eventData.setAct(EventAction.PAGE_RENDER_TIME.getType());
                eventData.setPath(activityInfo.activityName);
                HashMap map = new HashMap();
                map.put("type", "1");
                map.put("totalTime", String.valueOf(activityInfo.totalCost));
                map.put("pauseTime", String.valueOf(activityInfo.pauseCost));
                map.put("launchTime", String.valueOf(activityInfo.launchCost));
                map.put("renderTime", String.valueOf(activityInfo.renderCost));
                map.put("otherTime", String.valueOf(activityInfo.otherCost));
                eventData.setAttrs(map);
                ReportManager.AEQbTJ.EZpvd(eventData);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
