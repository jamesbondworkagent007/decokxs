package com.okinc.business.defi.wallet.mine.data;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletAddressEmpty {
    public static final int $stable = 8;
    private String network;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetwork() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNetwork(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.network = str;
    }

    public WalletAddressEmpty(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.network = str;
    }
}
