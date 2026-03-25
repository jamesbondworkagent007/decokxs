package com.trello.lifecycle2.android.lifecycle;

import androidx.lifecycle.GeneratedAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MethodCallsLogger;

/* JADX INFO: loaded from: classes24.dex */
public class AndroidLifecycle_LifecycleAdapter implements GeneratedAdapter {
    public final AndroidLifecycle OLrzqt;

    public AndroidLifecycle_LifecycleAdapter(AndroidLifecycle androidLifecycle) {
        this.OLrzqt = androidLifecycle;
    }

    @Override // androidx.lifecycle.GeneratedAdapter
    public void callMethods(LifecycleOwner lifecycleOwner, Lifecycle.Event event, boolean z, MethodCallsLogger methodCallsLogger) {
        boolean z2 = methodCallsLogger != null;
        if (z) {
            if (!z2 || methodCallsLogger.approveCall("onEvent", 4)) {
                this.OLrzqt.onEvent(lifecycleOwner, event);
            }
        }
    }
}
