package com.okinc.business.appupdate.utils;

import com.okinc.business.appupdate.core.adapter.OKUpgradeAdapter;
import com.okinc.business.appupdate.update.AppUpdateFragment;
import com.okinc.business.appupdate.update.AppUpdateInfo;
import kotlin.coroutines.Continuation;
import o.InterfaceC43295rmb;
import org.jetbrains.annotations.NotNull;
import uniffi.upgrade.UpgradeCore;

/* JADX INFO: loaded from: classes3.dex */
public interface UpgradeInterceptor extends InterfaceC43295rmb {
    Object intercept(@NotNull AppUpdateFragment appUpdateFragment, @NotNull OKUpgradeAdapter oKUpgradeAdapter, UpgradeCore upgradeCore, @NotNull AppUpdateInfo appUpdateInfo, @NotNull Continuation<? super AppUpdateInfo> continuation);
}
