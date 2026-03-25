package com.okinc.account.api.model.security;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class SuspiciousApp {
    public static final int $stable = 8;
    private final String appId;
    private final String appName;
    private final List<String> permissions;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.account.api.model.security.SuspiciousApp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SuspiciousApp copy$default(SuspiciousApp suspiciousApp, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = suspiciousApp.appName;
        }
        if ((i & 2) != 0) {
            str2 = suspiciousApp.appId;
        }
        if ((i & 4) != 0) {
            list = suspiciousApp.permissions;
        }
        return suspiciousApp.copy(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.appName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.appId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component3() {
        return this.permissions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SuspiciousApp copy(@NotNull String str, @NotNull String str2, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new SuspiciousApp(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspiciousApp)) {
            return false;
        }
        SuspiciousApp suspiciousApp = (SuspiciousApp) obj;
        return Intrinsics.EZpvd((Object) this.appName, (Object) suspiciousApp.appName) && Intrinsics.EZpvd((Object) this.appId, (Object) suspiciousApp.appId) && Intrinsics.EZpvd(this.permissions, suspiciousApp.permissions);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAppId() {
        return this.appId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAppName() {
        return this.appName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getPermissions() {
        return this.permissions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.appName.hashCode() * 31) + this.appId.hashCode()) * 31) + this.permissions.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SuspiciousApp(appName=" + this.appName + ", appId=" + this.appId + ", permissions=" + this.permissions + ")";
    }

    public SuspiciousApp(@NotNull String str, @NotNull String str2, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.appName = str;
        this.appId = str2;
        this.permissions = list;
    }
}
