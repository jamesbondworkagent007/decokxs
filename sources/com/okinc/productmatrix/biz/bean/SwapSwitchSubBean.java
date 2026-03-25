package com.okinc.productmatrix.biz.bean;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class SwapSwitchSubBean {
    public static final int $stable = 8;
    private String isHidden = "0";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isHidden() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHidden(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isHidden = str;
    }
}
