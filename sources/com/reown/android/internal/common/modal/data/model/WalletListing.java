package com.reown.android.internal.common.modal.data.model;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class WalletListing {
    public final int page;
    public final int totalCount;
    public final List<Wallet> wallets;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.android.internal.common.modal.data.model.WalletListing */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WalletListing copy$default(WalletListing walletListing, int i, int i2, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = walletListing.page;
        }
        if ((i3 & 2) != 0) {
            i2 = walletListing.totalCount;
        }
        if ((i3 & 4) != 0) {
            list = walletListing.wallets;
        }
        return walletListing.copy(i, i2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.page;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.totalCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Wallet> component3() {
        return this.wallets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletListing copy(int i, int i2, @NotNull List<Wallet> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new WalletListing(i, i2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletListing)) {
            return false;
        }
        WalletListing walletListing = (WalletListing) obj;
        return this.page == walletListing.page && this.totalCount == walletListing.totalCount && Intrinsics.EZpvd(this.wallets, walletListing.wallets);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPage() {
        return this.page;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTotalCount() {
        return this.totalCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Wallet> getWallets() {
        return this.wallets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Integer.hashCode(this.page) * 31) + Integer.hashCode(this.totalCount)) * 31) + this.wallets.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletListing(page=" + this.page + ", totalCount=" + this.totalCount + ", wallets=" + this.wallets + ")";
    }

    public WalletListing(int i, int i2, @NotNull List<Wallet> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.page = i;
        this.totalCount = i2;
        this.wallets = list;
    }
}
