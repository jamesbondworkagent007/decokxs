package com.okinc.business.defi.api.model.tx.signdata;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class RuneMainMintItemInfo extends UTXOMintBaseItemInfo {
    public static final int $stable = 0;
    private final String tokenId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenId() {
        return this.tokenId;
    }

    public RuneMainMintItemInfo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tokenId = str;
    }
}
