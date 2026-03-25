package com.okinc.business.defi.wallet.mine.search.ui.uimodel;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class WalletSearchDAppTrackEventModel {
    public static final int $stable = 0;
    private final long id;
    private final String name;
    private final String url;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WalletSearchDAppTrackEventModel copy$default(WalletSearchDAppTrackEventModel walletSearchDAppTrackEventModel, String str, long j, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = walletSearchDAppTrackEventModel.name;
        }
        if ((i & 2) != 0) {
            j = walletSearchDAppTrackEventModel.id;
        }
        if ((i & 4) != 0) {
            str2 = walletSearchDAppTrackEventModel.url;
        }
        return walletSearchDAppTrackEventModel.copy(str, j, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletSearchDAppTrackEventModel copy(@NotNull String str, long j, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new WalletSearchDAppTrackEventModel(str, j, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletSearchDAppTrackEventModel)) {
            return false;
        }
        WalletSearchDAppTrackEventModel walletSearchDAppTrackEventModel = (WalletSearchDAppTrackEventModel) obj;
        return Intrinsics.EZpvd((Object) this.name, (Object) walletSearchDAppTrackEventModel.name) && this.id == walletSearchDAppTrackEventModel.id && Intrinsics.EZpvd((Object) this.url, (Object) walletSearchDAppTrackEventModel.url);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.name.hashCode() * 31) + Long.hashCode(this.id)) * 31) + this.url.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletSearchDAppTrackEventModel(name=" + this.name + ", id=" + this.id + ", url=" + this.url + ")";
    }

    public WalletSearchDAppTrackEventModel(@NotNull String str, long j, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.name = str;
        this.id = j;
        this.url = str2;
    }
}
