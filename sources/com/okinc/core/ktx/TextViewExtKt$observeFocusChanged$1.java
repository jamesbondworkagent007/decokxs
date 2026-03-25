package com.okinc.core.ktx;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class TextViewExtKt$observeFocusChanged$1 implements LifecycleEventObserver {
    public final /* synthetic */ LifecycleOwner OLrzqt;
    public final /* synthetic */ View copydefault;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(event, "");
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.copydefault.setOnFocusChangeListener(null);
            this.OLrzqt.getLifecycle().removeObserver(this);
        }
    }
}
