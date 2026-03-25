package com.okinc.components.track.appsflyer;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class AppsflyerConfig {
    public static final int $stable = 8;
    private List<String> whitelist = yDY.AhwBna();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getWhitelist() {
        return this.whitelist;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWhitelist(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.whitelist = list;
    }
}
