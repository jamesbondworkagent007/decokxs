package com.okinc.core.appdelegate;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.okinc.core.appdelegate.ProcessLifecycleMonitor$appLifecycleObserver$2$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C32986mnt;

/* JADX INFO: loaded from: classes7.dex */
public final class ProcessLifecycleMonitor$appLifecycleObserver$2$1 implements LifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onEnterForeground() {
        C32986mnt.copydefault.set(true);
        C32986mnt.EZpvd.KWHzl((Function1<? super C32986mnt.Application, Unit>) new Function1() { // from class: o.mns
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ProcessLifecycleMonitor$appLifecycleObserver$2$1.EZpvd((C32986mnt.Application) obj);
            }
        });
    }

    public static final Unit EZpvd(C32986mnt.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        application.AEQbTJ();
        return Unit.INSTANCE;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onEnterBackground() {
        C32986mnt.copydefault.set(false);
        C32986mnt.EZpvd.KWHzl((Function1<? super C32986mnt.Application, Unit>) new Function1() { // from class: o.mnq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ProcessLifecycleMonitor$appLifecycleObserver$2$1.AEQbTJ((C32986mnt.Application) obj);
            }
        });
    }

    public static final Unit AEQbTJ(C32986mnt.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        application.OLrzqt();
        return Unit.INSTANCE;
    }
}
