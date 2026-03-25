package com.okinc.components.report;

import android.app.Activity;
import com.okinc.components.report.db.EventData;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C32625mhC;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class ReportManager$reportMemory$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Activity $activity;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportManager$reportMemory$1(Activity activity, Continuation<? super ReportManager$reportMemory$1> continuation) {
        super(2, continuation);
        this.$activity = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReportManager$reportMemory$1(this.$activity, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReportManager$reportMemory$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C32625mhC c32625mhC = C32625mhC.KWHzl;
            c32625mhC.KWHzl();
            EventData eventData = new EventData();
            eventData.setAct(EventAction.APP_MEMORY.getType());
            eventData.setPath(this.$activity.getClass().getName());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("java_heap_used", String.valueOf(c32625mhC.EZpvd().EZpvd() * ((long) 1024)));
            linkedHashMap.put("java_heap_rate", String.valueOf(c32625mhC.EZpvd().KWHzl()));
            eventData.setAttribute(linkedHashMap);
            ReportManager reportManager = ReportManager.AEQbTJ;
            reportManager.EZpvd(eventData);
            if (c32625mhC.EZpvd().KWHzl() > 0.8d) {
                long jEZpvd = c32625mhC.EZpvd().EZpvd();
                long jAEQbTJ = c32625mhC.EZpvd().AEQbTJ();
                this.label = 1;
                if (reportManager.OLrzqt(jEZpvd, jAEQbTJ, this) == objCopydefault) {
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
