package com.okinc.business.appupdate.impl;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.okinc.business.appupdate.api.AppUpdateService;
import com.okinc.business.appupdate.api.IUpdate;
import com.okinc.business.appupdate.api.IUpdateStateChange;
import com.okinc.business.appupdate.core.adapter.OKUpgradeAdapter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractActivityC33041mov;
import o.AbstractC43215rlA;
import o.InterfaceC46518tXh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class AppUpdateServiceImpl extends AbstractC43215rlA implements AppUpdateService, IUpdate {
    public static final int $stable = 8;
    private final /* synthetic */ OKUpgradeAdapter $$delegate_0 = AppUpdateServiceImplKt.getAppUpdateService();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.appupdate.api.IUpdate
    public void addUpdateStateChangeListener(@NotNull IUpdateStateChange iUpdateStateChange) {
        Intrinsics.checkNotNullParameter(iUpdateStateChange, "");
        this.$$delegate_0.addUpdateStateChangeListener(iUpdateStateChange);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.appupdate.api.IUpdate
    public void checkUpdate(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, boolean z) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        this.$$delegate_0.checkUpdate(abstractActivityC33041mov, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.appupdate.api.IUpdate
    public void checkUpdate(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, boolean z, IUpdate.DialogInfo dialogInfo) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        this.$$delegate_0.checkUpdate(abstractActivityC33041mov, z, dialogInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.appupdate.api.IUpdate
    public void getLatestVersion(@NotNull Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.$$delegate_0.getLatestVersion(function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.appupdate.api.IUpdate
    public InterfaceC46518tXh getUpdateManageableContainer(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull FragmentManager fragmentManager, boolean z) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        return this.$$delegate_0.getUpdateManageableContainer(abstractActivityC33041mov, fragmentManager, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.appupdate.api.IUpdate
    public Integer getUpdateProgress() {
        return this.$$delegate_0.getUpdateProgress();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.appupdate.api.AppUpdateService, com.okinc.business.appupdate.api.UpdateService, com.okinc.business.appupdate.api.IUpdate
    public boolean hasNewVersion() {
        return this.$$delegate_0.hasNewVersion();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.appupdate.api.IUpdate
    public void onActivityResult(int i, int i2, Intent intent) {
        this.$$delegate_0.onActivityResult(i, i2, intent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.appupdate.api.IUpdate
    public void removeUpdateStateChangeListener(@NotNull IUpdateStateChange iUpdateStateChange) {
        Intrinsics.checkNotNullParameter(iUpdateStateChange, "");
        this.$$delegate_0.removeUpdateStateChangeListener(iUpdateStateChange);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.appupdate.api.IUpdate
    public void startReview(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.$$delegate_0.startReview(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.appupdate.api.IUpdate
    public void startReviewFlow(@NotNull Activity activity, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.$$delegate_0.startReviewFlow(activity, function0);
    }

    @Override // com.okinc.business.appupdate.api.UpdateService
    public void checkUpdate() {
        AppUpdateService.DefaultImpls.checkUpdate(this);
    }

    @Override // com.okinc.business.appupdate.api.UpdateService
    public String getCurrentVersionNameText() {
        return AppUpdateService.DefaultImpls.getCurrentVersionNameText(this);
    }

    @Override // com.okinc.business.appupdate.api.UpdateService
    public void observeUpdate(@NotNull FragmentActivity fragmentActivity) {
        AppUpdateService.DefaultImpls.observeUpdate(this, fragmentActivity);
    }

    @Override // com.okinc.business.appupdate.api.UpdateService
    public void showUpdateInfo(@NotNull FragmentActivity fragmentActivity) {
        AppUpdateService.DefaultImpls.showUpdateInfo(this, fragmentActivity);
    }
}
