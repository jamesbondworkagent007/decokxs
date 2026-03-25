package com.okinc.business.defi.wallet.mine.data;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletSearchEmpty {
    public static final int $stable = 8;
    private String searchText;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSearchText() {
        return this.searchText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSearchText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.searchText = str;
    }

    public WalletSearchEmpty(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.searchText = str;
    }
}
