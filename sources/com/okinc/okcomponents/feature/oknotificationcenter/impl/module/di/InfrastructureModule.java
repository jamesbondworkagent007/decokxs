package com.okinc.okcomponents.feature.oknotificationcenter.impl.module.di;

import android.app.NotificationManager;
import android.content.Context;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.jvm.internal.Intrinsics;
import o.C42596rYs;
import o.yCR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class InfrastructureModule {
    public static final InfrastructureModule AEQbTJ = new InfrastructureModule();

    private InfrastructureModule() {
    }

    @yCR
    public final NotificationManager copydefault(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        Object systemService = context.getSystemService(RemoteMessageConst.NOTIFICATION);
        Intrinsics.copydefault(systemService, "");
        return (NotificationManager) systemService;
    }

    @yCR
    public final C42596rYs AEQbTJ(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return new C42596rYs(context, "notification_center_settings");
    }
}
