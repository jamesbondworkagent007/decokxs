package com.okinc.trade.manager.common.position;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class PosFooterItem {
    public static final int $stable = 0;
    private final String content;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    public PosFooterItem(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.content = str;
    }
}
