package com.okinc.core.widget;

import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.Intrinsics;
import o.C33606mzd;

/* JADX INFO: loaded from: classes8.dex */
public final class WidgetExtKt$observeTextChanged$2 implements LifecycleEventObserver {
    public final /* synthetic */ TextView EZpvd;
    public final /* synthetic */ LifecycleOwner OLrzqt;
    public final /* synthetic */ C33606mzd.TaskDescription copydefault;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(event, "");
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.EZpvd.removeTextChangedListener(this.copydefault);
            this.OLrzqt.getLifecycle().removeObserver(this);
        }
    }
}
