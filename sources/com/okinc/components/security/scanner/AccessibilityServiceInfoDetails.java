package com.okinc.components.security.scanner;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class AccessibilityServiceInfoDetails {
    public static final int $stable = 8;
    private final String appName;
    private final String packageName;
    private final List<String> permissions;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.components.security.scanner.AccessibilityServiceInfoDetails */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AccessibilityServiceInfoDetails copy$default(AccessibilityServiceInfoDetails accessibilityServiceInfoDetails, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accessibilityServiceInfoDetails.appName;
        }
        if ((i & 2) != 0) {
            str2 = accessibilityServiceInfoDetails.packageName;
        }
        if ((i & 4) != 0) {
            list = accessibilityServiceInfoDetails.permissions;
        }
        return accessibilityServiceInfoDetails.copy(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.appName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.packageName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component3() {
        return this.permissions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccessibilityServiceInfoDetails copy(@NotNull String str, @NotNull String str2, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new AccessibilityServiceInfoDetails(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessibilityServiceInfoDetails)) {
            return false;
        }
        AccessibilityServiceInfoDetails accessibilityServiceInfoDetails = (AccessibilityServiceInfoDetails) obj;
        return Intrinsics.EZpvd((Object) this.appName, (Object) accessibilityServiceInfoDetails.appName) && Intrinsics.EZpvd((Object) this.packageName, (Object) accessibilityServiceInfoDetails.packageName) && Intrinsics.EZpvd(this.permissions, accessibilityServiceInfoDetails.permissions);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAppName() {
        return this.appName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPackageName() {
        return this.packageName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getPermissions() {
        return this.permissions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.appName.hashCode() * 31) + this.packageName.hashCode()) * 31) + this.permissions.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AccessibilityServiceInfoDetails(appName=" + this.appName + ", packageName=" + this.packageName + ", permissions=" + this.permissions + ")";
    }

    public AccessibilityServiceInfoDetails(@NotNull String str, @NotNull String str2, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.appName = str;
        this.packageName = str2;
        this.permissions = list;
    }
}
