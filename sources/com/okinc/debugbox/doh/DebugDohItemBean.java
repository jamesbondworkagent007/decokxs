package com.okinc.debugbox.doh;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class DebugDohItemBean {
    public static final int $stable = 8;
    private String domain;
    private String ip;
    private String type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DebugDohItemBean copy$default(DebugDohItemBean debugDohItemBean, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = debugDohItemBean.type;
        }
        if ((i & 2) != 0) {
            str2 = debugDohItemBean.domain;
        }
        if ((i & 4) != 0) {
            str3 = debugDohItemBean.ip;
        }
        return debugDohItemBean.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.domain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.ip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DebugDohItemBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new DebugDohItemBean(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebugDohItemBean)) {
            return false;
        }
        DebugDohItemBean debugDohItemBean = (DebugDohItemBean) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) debugDohItemBean.type) && Intrinsics.EZpvd((Object) this.domain, (Object) debugDohItemBean.domain) && Intrinsics.EZpvd((Object) this.ip, (Object) debugDohItemBean.ip);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDomain() {
        return this.domain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIp() {
        return this.ip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.type.hashCode() * 31) + this.domain.hashCode()) * 31) + this.ip.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDomain(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.domain = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIp(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ip = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.type = str;
    }

    public DebugDohItemBean(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.type = str;
        this.domain = str2;
        this.ip = str3;
    }

    public DebugDohItemBean() {
        this("", "", "");
    }

    public String toString() {
        return "type: " + this.type + ", domain: " + this.domain + ", ip: " + this.ip;
    }
}
