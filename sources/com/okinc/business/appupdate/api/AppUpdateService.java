package com.okinc.business.appupdate.api;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.appupdate.api.UpdateService;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC43217rlC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface AppUpdateService extends UpdateService, IUpdate, InterfaceC43217rlC {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final String HAS_SHOW_UPDATE = "is_show_update";

    @Override // com.okinc.business.appupdate.api.UpdateService, com.okinc.business.appupdate.api.IUpdate
    boolean hasNewVersion();

    /* JADX INFO: loaded from: classes14.dex */
    public static final class DefaultImpls {
        public static boolean hasNewVersion(@NotNull AppUpdateService appUpdateService) {
            return false;
        }

        public static void checkUpdate(@NotNull AppUpdateService appUpdateService) {
            UpdateService.DefaultImpls.checkUpdate(appUpdateService);
        }

        public static String getCurrentVersionNameText(@NotNull AppUpdateService appUpdateService) {
            return UpdateService.DefaultImpls.getCurrentVersionNameText(appUpdateService);
        }

        public static void observeUpdate(@NotNull AppUpdateService appUpdateService, @NotNull FragmentActivity fragmentActivity) {
            Intrinsics.checkNotNullParameter(fragmentActivity, "");
            UpdateService.DefaultImpls.observeUpdate(appUpdateService, fragmentActivity);
        }

        public static void showUpdateInfo(@NotNull AppUpdateService appUpdateService, @NotNull FragmentActivity fragmentActivity) {
            Intrinsics.checkNotNullParameter(fragmentActivity, "");
            UpdateService.DefaultImpls.showUpdateInfo(appUpdateService, fragmentActivity);
        }
    }

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String HAS_SHOW_UPDATE = "is_show_update";

        private Companion() {
        }
    }
}
