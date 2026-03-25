package com.okinc.kline.ui.view;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.Intrinsics;
import o.pAM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class MyLifecycleEventObserver implements LifecycleEventObserver {
    public String KWHzl;
    public final pAM OLrzqt;

    public MyLifecycleEventObserver(@NotNull pAM pam) {
        Intrinsics.checkNotNullParameter(pam, "");
        this.OLrzqt = pam;
        this.KWHzl = "MultiChartView";
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@NotNull LifecycleOwner lifecycleOwner, @NotNull Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(event, "");
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.OLrzqt.AuCTel();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            this.OLrzqt.getFieldNames();
        } else if (event == Lifecycle.Event.ON_RESUME) {
            this.OLrzqt.getNewProxyInstance();
        }
    }
}
