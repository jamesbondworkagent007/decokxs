package com.okinc.business.defi.wallet.mine.search.ui.uimodel;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class WalletSearchDAppExtraTrackEventModel {
    public static final int $stable = 0;
    private final String url;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WalletSearchDAppExtraTrackEventModel copy$default(WalletSearchDAppExtraTrackEventModel walletSearchDAppExtraTrackEventModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = walletSearchDAppExtraTrackEventModel.url;
        }
        return walletSearchDAppExtraTrackEventModel.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletSearchDAppExtraTrackEventModel copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new WalletSearchDAppExtraTrackEventModel(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WalletSearchDAppExtraTrackEventModel) && Intrinsics.EZpvd((Object) this.url, (Object) ((WalletSearchDAppExtraTrackEventModel) obj).url);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.url.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletSearchDAppExtraTrackEventModel(url=" + this.url + ")";
    }

    public WalletSearchDAppExtraTrackEventModel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.url = str;
    }
}
