package com.okinc.common.util;

import androidx.fragment.app.Fragment;
import com.okinc.components.report.EventAction;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.lib.monitor.bean.FragmentInfo;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC32996moC;
import o.AbstractC42536rWm;
import o.C42529rWf;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes7.dex */
public final class MonitorUtils$onFragmentInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentInfo $counterInfo;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MonitorUtils$onFragmentInfo$1(FragmentInfo fragmentInfo, Continuation<? super MonitorUtils$onFragmentInfo$1> continuation) {
        super(2, continuation);
        this.$counterInfo = fragmentInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MonitorUtils$onFragmentInfo$1(this.$counterInfo, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MonitorUtils$onFragmentInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            FragmentInfo fragmentInfo = this.$counterInfo;
            if (fragmentInfo != null) {
                String string = fragmentInfo.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                pUU.copydefault("Monitor.Lifecycle", string);
                Fragment fragment = fragmentInfo.fragment.get();
                if (fragment != null && (fragment instanceof AbstractC32996moC)) {
                    AbstractC42536rWm okQPL = ((AbstractC32996moC) fragment).getOkQPL();
                    Intrinsics.copydefault(okQPL, "");
                    ((C42529rWf) okQPL).EZpvd(fragmentInfo.onAttachCost, fragmentInfo.onCreateCost, fragmentInfo.onStartCost, fragmentInfo.onResumeCost, fragmentInfo.onCreateViewCost, fragmentInfo.onViewCreatedCost);
                }
                EventData eventData = new EventData();
                eventData.setAct(EventAction.PAGE_RENDER_TIME.getType());
                eventData.setPath(fragmentInfo.fragmentName);
                HashMap map = new HashMap();
                map.put("type", "2");
                map.put("totalTime", String.valueOf(fragmentInfo.totalCost));
                map.put("isApplicationHooked", String.valueOf(fragmentInfo.onAttachCost));
                map.put("isDeviceRooted", String.valueOf(fragmentInfo.onCreateCost));
                map.put("isAppDebuggable", String.valueOf(fragmentInfo.onActivityCreatedCost));
                map.put("isRunningInEmulator", String.valueOf(fragmentInfo.onCreateViewCost));
                map.put("isDebuggerAttached", String.valueOf(fragmentInfo.onViewCreatedCost));
                map.put("isRunningInVirtualEnvironment", String.valueOf(fragmentInfo.onStartCost));
                map.put("isTampered", String.valueOf(fragmentInfo.onResumeCost));
                map.put("isAppTampered", String.valueOf(fragmentInfo.onHiddenChangedCost));
                map.put("isFileTampered", String.valueOf(fragmentInfo.setUserVisibleHintCost));
                eventData.setAttrs(map);
                ReportManager.AEQbTJ.EZpvd(eventData);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
