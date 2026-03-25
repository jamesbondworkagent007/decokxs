package com.okinc.unify_trade.trade.setting.setting_data;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.Intrinsics;
import o.C56177xxr;

/* JADX INFO: loaded from: classes12.dex */
public final class OkTradeSettingManager$setMaxAccountLevel$2 implements LifecycleEventObserver {
    public final /* synthetic */ Lifecycle AEQbTJ;
    public final /* synthetic */ C56177xxr OLrzqt;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(event, "");
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.OLrzqt.AYXKKw();
            this.AEQbTJ.removeObserver(this);
        }
    }
}
