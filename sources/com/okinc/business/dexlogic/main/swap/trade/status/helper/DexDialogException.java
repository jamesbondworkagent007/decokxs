package com.okinc.business.dexlogic.main.swap.trade.status.helper;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class DexDialogException extends Exception {
    public static final int $stable = 0;
    private final String msg;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMsg() {
        return this.msg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DexDialogException(@NotNull String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "");
        this.msg = str;
    }
}
