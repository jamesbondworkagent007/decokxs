package com.okinc.business.defi.api.model.tx.signdata;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class StarkNetMessageSignData extends MessageSignData {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StarkNetMessageSignData(@NotNull String str) {
        super(str, null);
        Intrinsics.checkNotNullParameter(str, "");
    }
}
