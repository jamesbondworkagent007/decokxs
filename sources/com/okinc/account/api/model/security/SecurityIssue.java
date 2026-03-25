package com.okinc.account.api.model.security;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class SecurityIssue {
    public static final int $stable = 8;
    private final List<SuspiciousApp> suspiciousApps;
    private final String type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.account.api.model.security.SecurityIssue */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SecurityIssue copy$default(SecurityIssue securityIssue, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = securityIssue.type;
        }
        if ((i & 2) != 0) {
            list = securityIssue.suspiciousApps;
        }
        return securityIssue.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SuspiciousApp> component2() {
        return this.suspiciousApps;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SecurityIssue copy(@NotNull String str, @NotNull List<SuspiciousApp> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new SecurityIssue(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SecurityIssue)) {
            return false;
        }
        SecurityIssue securityIssue = (SecurityIssue) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) securityIssue.type) && Intrinsics.EZpvd(this.suspiciousApps, securityIssue.suspiciousApps);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SuspiciousApp> getSuspiciousApps() {
        return this.suspiciousApps;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.type.hashCode() * 31) + this.suspiciousApps.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SecurityIssue(type=" + this.type + ", suspiciousApps=" + this.suspiciousApps + ")";
    }

    public SecurityIssue(@NotNull String str, @NotNull List<SuspiciousApp> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.type = str;
        this.suspiciousApps = list;
    }
}
