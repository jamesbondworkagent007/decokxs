package com.okinc.components.track.amplitude;

import com.okinc.components.report.EventAction;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.components.track.amplitude.AmplitudeTracker$SkylabExperiment$reportSkylabRequest$1;
import java.util.concurrent.Future;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C32883mlw;
import o.C32905mmR;
import o.C32971mne;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.LI;
import o.LL;

/* JADX INFO: loaded from: classes7.dex */
public final class AmplitudeTracker$SkylabExperiment$reportSkylabRequest$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Future<LI> $future;
    int label;
    final /* synthetic */ C32883mlw this$0;
    final /* synthetic */ C32883mlw.Activity this$1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmplitudeTracker$SkylabExperiment$reportSkylabRequest$1(Future<LI> future, C32883mlw c32883mlw, C32883mlw.Activity activity, Continuation<? super AmplitudeTracker$SkylabExperiment$reportSkylabRequest$1> continuation) {
        super(2, continuation);
        this.$future = future;
        this.this$0 = c32883mlw;
        this.this$1 = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AmplitudeTracker$SkylabExperiment$reportSkylabRequest$1(this.$future, this.this$0, this.this$1, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AmplitudeTracker$SkylabExperiment$reportSkylabRequest$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            EventData eventData = new EventData();
            C32883mlw.Activity activity = this.this$1;
            eventData.setAct(EventAction.SKYLAB.getType());
            eventData.setPath(activity.KWHzl.getDisplayName());
            eventData.setCode("0");
            eventData.setAttrs(C56423yEv.EZpvd(C56390yDp.OLrzqt("base_url", String.valueOf(LL.AEQbTJ(activity.copydefault)))));
            C32883mlw.TaskDescription taskDescription = C32883mlw.Companion;
            final C32883mlw.Activity activity2 = this.this$1;
            taskDescription.KWHzl((Function0<String>) new Function0() { // from class: o.mlE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return AmplitudeTracker$SkylabExperiment$reportSkylabRequest$1.invokeSuspend$lambda$1(activity2);
                }
            });
            try {
                this.$future.get();
                C32971mne.verifySkyLab$default(this.this$0.values, this.this$1.copydefault.copydefault(), this.this$1.KWHzl, null, 4, null);
                C32905mmR.EZpvd.AEQbTJ(this.this$1.KWHzl);
            } catch (Exception e) {
                C32883mlw.Companion.KWHzl((Function0<String>) new Function0() { // from class: o.mlG
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return AmplitudeTracker$SkylabExperiment$reportSkylabRequest$1.invokeSuspend$lambda$2(e);
                    }
                });
                this.this$0.values.KWHzl(this.this$1.copydefault.copydefault(), this.this$1.KWHzl, e);
                eventData.setCode("1");
                eventData.setMsg(e.getMessage());
            }
            ReportManager.AEQbTJ.EZpvd(eventData);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invokeSuspend$lambda$1(C32883mlw.Activity activity) throws NoSuchFieldException {
        return "reportSkylabRequest: " + LL.AEQbTJ(activity.copydefault);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invokeSuspend$lambda$2(Exception exc) {
        return "reportSkylabRequest Exception : " + exc;
    }
}
