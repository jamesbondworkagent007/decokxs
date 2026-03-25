package com.okinc.business.defi.biz.net.bean;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class DappInfo {
    public static final int $stable = 0;
    private final String host;
    private final String icon;
    private final String name;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DappInfo copy$default(DappInfo dappInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dappInfo.host;
        }
        if ((i & 2) != 0) {
            str2 = dappInfo.name;
        }
        if ((i & 4) != 0) {
            str3 = dappInfo.icon;
        }
        return dappInfo.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.host;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DappInfo copy(String str, String str2, String str3) {
        return new DappInfo(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DappInfo)) {
            return false;
        }
        DappInfo dappInfo = (DappInfo) obj;
        return Intrinsics.EZpvd((Object) this.host, (Object) dappInfo.host) && Intrinsics.EZpvd((Object) this.name, (Object) dappInfo.name) && Intrinsics.EZpvd((Object) this.icon, (Object) dappInfo.icon);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHost() {
        return this.host;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.host;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.name;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.icon;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DappInfo(host=" + this.host + ", name=" + this.name + ", icon=" + this.icon + ")";
    }

    public DappInfo(String str, String str2, String str3) {
        this.host = str;
        this.name = str2;
        this.icon = str3;
    }
}
