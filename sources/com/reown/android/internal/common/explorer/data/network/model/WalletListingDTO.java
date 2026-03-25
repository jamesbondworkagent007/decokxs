package com.reown.android.internal.common.explorer.data.network.model;

import com.squareup.moshi.Json;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class WalletListingDTO {
    public final int count;
    public final Map<String, WalletDTO> listings;
    public final int total;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.android.internal.common.explorer.data.network.model.WalletListingDTO */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WalletListingDTO copy$default(WalletListingDTO walletListingDTO, Map map, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            map = walletListingDTO.listings;
        }
        if ((i3 & 2) != 0) {
            i = walletListingDTO.count;
        }
        if ((i3 & 4) != 0) {
            i2 = walletListingDTO.total;
        }
        return walletListingDTO.copy(map, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, WalletDTO> component1() {
        return this.listings;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.count;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletListingDTO copy(@Json(name = "listings") @NotNull Map<String, WalletDTO> map, @Json(name = "count") int i, @Json(name = "total") int i2) {
        Intrinsics.checkNotNullParameter(map, "");
        return new WalletListingDTO(map, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletListingDTO)) {
            return false;
        }
        WalletListingDTO walletListingDTO = (WalletListingDTO) obj;
        return Intrinsics.EZpvd(this.listings, walletListingDTO.listings) && this.count == walletListingDTO.count && this.total == walletListingDTO.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCount() {
        return this.count;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, WalletDTO> getListings() {
        return this.listings;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTotal() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.listings.hashCode() * 31) + Integer.hashCode(this.count)) * 31) + Integer.hashCode(this.total);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletListingDTO(listings=" + this.listings + ", count=" + this.count + ", total=" + this.total + ")";
    }

    public WalletListingDTO(@Json(name = "listings") @NotNull Map<String, WalletDTO> map, @Json(name = "count") int i, @Json(name = "total") int i2) {
        Intrinsics.checkNotNullParameter(map, "");
        this.listings = map;
        this.count = i;
        this.total = i2;
    }
}
