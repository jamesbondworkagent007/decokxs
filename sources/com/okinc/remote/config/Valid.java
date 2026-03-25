package com.okinc.remote.config;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class Valid {
    public static final int $stable = 8;
    private String timeRange = "";
    private String versionRange = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTimeRange() {
        return this.timeRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVersionRange() {
        return this.versionRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTimeRange(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.timeRange = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVersionRange(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.versionRange = str;
    }
}
