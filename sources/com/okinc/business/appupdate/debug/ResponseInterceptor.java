package com.okinc.business.appupdate.debug;

import com.okinc.business.appupdate.update.AppUpdateConfigResp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface ResponseInterceptor {
    AppUpdateConfigResp intercept(@NotNull AppUpdateConfigResp appUpdateConfigResp);
}
