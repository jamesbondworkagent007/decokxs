package com.okinc.liveness.lca.debugtool;

import android.content.Context;
import android.content.Intent;
import com.okinc.liveness.lca.debugtool.ui.LcaDebugSettingActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class LcaDebugToolManager {
    public static final int $stable = 0;
    public static final LcaDebugToolManager INSTANCE = new LcaDebugToolManager();

    private LcaDebugToolManager() {
    }

    public final void startLcaSampleApp(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        context.startActivity(new Intent(context, (Class<?>) LcaDebugSettingActivity.class));
    }
}
