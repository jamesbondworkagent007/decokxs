package com.okinc.pop.manager;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC46516tXf;
import o.InterfaceC46518tXh;
import o.InterfaceC46524tXn;
import o.InterfaceC56387yDm;

/* JADX INFO: loaded from: classes17.dex */
public final class ManageableGroup implements InterfaceC46516tXf {
    public Lifecycle AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public InterfaceC46524tXn KWHzl;
    public Lifecycle OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46516tXf
    public Lifecycle copydefault() {
        return this.OLrzqt;
    }

    public final List<InterfaceC46518tXh> AEQbTJ() {
        return (List) this.EZpvd.getValue();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onStart() {
        InterfaceC46524tXn interfaceC46524tXn = this.KWHzl;
        if (interfaceC46524tXn == null) {
            return;
        }
        interfaceC46524tXn.AEQbTJ();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        InterfaceC46524tXn interfaceC46524tXn = this.KWHzl;
        if (interfaceC46524tXn == null) {
            return;
        }
        Lifecycle.State currentState = this.AEQbTJ.getCurrentState();
        Intrinsics.checkNotNullExpressionValue(currentState, "");
        interfaceC46524tXn.OLrzqt(currentState);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        InterfaceC46524tXn interfaceC46524tXn = this.KWHzl;
        if (interfaceC46524tXn == null) {
            return;
        }
        Lifecycle.State currentState = this.AEQbTJ.getCurrentState();
        Intrinsics.checkNotNullExpressionValue(currentState, "");
        interfaceC46524tXn.OLrzqt(currentState);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        InterfaceC46524tXn interfaceC46524tXn = this.KWHzl;
        if (interfaceC46524tXn == null) {
            return;
        }
        Lifecycle.State currentState = this.AEQbTJ.getCurrentState();
        Intrinsics.checkNotNullExpressionValue(currentState, "");
        interfaceC46524tXn.OLrzqt(currentState);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        InterfaceC46524tXn interfaceC46524tXn = this.KWHzl;
        if (interfaceC46524tXn == null) {
            return;
        }
        Lifecycle.State currentState = this.AEQbTJ.getCurrentState();
        Intrinsics.checkNotNullExpressionValue(currentState, "");
        interfaceC46524tXn.OLrzqt(currentState);
    }

    @Override // o.InterfaceC46516tXf
    public List<InterfaceC46518tXh> OLrzqt() {
        return AEQbTJ();
    }
}
