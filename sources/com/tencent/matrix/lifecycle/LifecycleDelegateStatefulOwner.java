package com.tencent.matrix.lifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C57983ysh;

/* JADX INFO: loaded from: classes17.dex */
public final class LifecycleDelegateStatefulOwner extends C57983ysh implements LifecycleObserver {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public final LifecycleOwner AEQbTJ;

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.tencent.matrix.lifecycle.LifecycleDelegateStatefulOwner.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        djBIcL();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onReceiveStart() {
        valueOf();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onReceiveStop() {
        djBIcL();
    }

    public String toString() {
        return this.AEQbTJ.toString();
    }
}
