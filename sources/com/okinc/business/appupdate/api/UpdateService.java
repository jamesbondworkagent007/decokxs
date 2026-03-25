package com.okinc.business.appupdate.api;

import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface UpdateService {

    /* JADX INFO: loaded from: classes14.dex */
    public static final class DefaultImpls {
        public static void checkUpdate(@NotNull UpdateService updateService) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static String getCurrentVersionNameText(@NotNull UpdateService updateService) {
            return "";
        }

        public static boolean hasNewVersion(@NotNull UpdateService updateService) {
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static void observeUpdate(@NotNull UpdateService updateService, @NotNull FragmentActivity fragmentActivity) {
            Intrinsics.checkNotNullParameter(fragmentActivity, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static void showUpdateInfo(@NotNull UpdateService updateService, @NotNull FragmentActivity fragmentActivity) {
            Intrinsics.checkNotNullParameter(fragmentActivity, "");
        }
    }

    void checkUpdate();

    String getCurrentVersionNameText();

    boolean hasNewVersion();

    void observeUpdate(@NotNull FragmentActivity fragmentActivity);

    void showUpdateInfo(@NotNull FragmentActivity fragmentActivity);
}
