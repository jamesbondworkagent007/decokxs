package com.okinc.liveness.lca.ui;

import androidx.lifecycle.Observer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class LcaLivenessScanActivity$sam$androidx_lifecycle_Observer$0 implements Observer, InterfaceC56514yIe {
    public final /* synthetic */ Function1 function;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LcaLivenessScanActivity$sam$androidx_lifecycle_Observer$0(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.function = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean equals(Object obj) {
        if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
            return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56514yIe
    public final InterfaceC56388yDn<?> getFunctionDelegate() {
        return this.function;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        this.function.invoke(obj);
    }
}
