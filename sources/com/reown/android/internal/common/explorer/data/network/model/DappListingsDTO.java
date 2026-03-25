package com.reown.android.internal.common.explorer.data.network.model;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@JsonClass(generateAdapter = true)
public final class DappListingsDTO {
    public final int count;
    public final Map<String, ListingDTO> listings;
    public final int total;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.android.internal.common.explorer.data.network.model.DappListingsDTO */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DappListingsDTO copy$default(DappListingsDTO dappListingsDTO, Map map, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            map = dappListingsDTO.listings;
        }
        if ((i3 & 2) != 0) {
            i = dappListingsDTO.count;
        }
        if ((i3 & 4) != 0) {
            i2 = dappListingsDTO.total;
        }
        return dappListingsDTO.copy(map, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, ListingDTO> component1() {
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
    public final DappListingsDTO copy(@Json(name = "listings") @NotNull Map<String, ListingDTO> map, @Json(name = "count") int i, @Json(name = "total") int i2) {
        Intrinsics.checkNotNullParameter(map, "");
        return new DappListingsDTO(map, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DappListingsDTO)) {
            return false;
        }
        DappListingsDTO dappListingsDTO = (DappListingsDTO) obj;
        return Intrinsics.EZpvd(this.listings, dappListingsDTO.listings) && this.count == dappListingsDTO.count && this.total == dappListingsDTO.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCount() {
        return this.count;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, ListingDTO> getListings() {
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
        return "DappListingsDTO(listings=" + this.listings + ", count=" + this.count + ", total=" + this.total + ")";
    }

    public DappListingsDTO(@Json(name = "listings") @NotNull Map<String, ListingDTO> map, @Json(name = "count") int i, @Json(name = "total") int i2) {
        Intrinsics.checkNotNullParameter(map, "");
        this.listings = map;
        this.count = i;
        this.total = i2;
    }
}
