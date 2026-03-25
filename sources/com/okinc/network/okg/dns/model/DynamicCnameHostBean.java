package com.okinc.network.okg.dns.model;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class DynamicCnameHostBean {
    public static final int $stable = 8;
    private String cname = "";
    private List<String> hostList = new ArrayList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCname() {
        return this.cname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getHostList() {
        return this.hostList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCname(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cname = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHostList(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.hostList = list;
    }

    public String toString() {
        return "DynamicCnameHostBean(cname='" + this.cname + "', hostList=" + this.hostList + ")";
    }
}
