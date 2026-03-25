package com.okinc.lib.internal.monitor.memory.leak;

import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C38030pJq;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class LeakDetectorImpl$activityCallbacks$1 extends FunctionReferenceImpl implements Function1<Activity, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LeakDetectorImpl$activityCallbacks$1(Object obj) {
        super(1, obj, C38030pJq.class, "attachListener", "attachListener$OKAPM_monitor(Landroid/app/Activity;)V", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Activity activity) {
        invoke2(activity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        ((C38030pJq) this.receiver).KWHzl(activity);
    }
}
