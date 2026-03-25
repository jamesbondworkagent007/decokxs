package com.reown.android.internal.common.explorer.data.model;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class DappListings {
    public final int count;
    public final List<Listing> listings;
    public final int total;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.android.internal.common.explorer.data.model.DappListings */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DappListings copy$default(DappListings dappListings, List list, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = dappListings.listings;
        }
        if ((i3 & 2) != 0) {
            i = dappListings.count;
        }
        if ((i3 & 4) != 0) {
            i2 = dappListings.total;
        }
        return dappListings.copy(list, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Listing> component1() {
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
    public final DappListings copy(@NotNull List<Listing> list, int i, int i2) {
        Intrinsics.checkNotNullParameter(list, "");
        return new DappListings(list, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DappListings)) {
            return false;
        }
        DappListings dappListings = (DappListings) obj;
        return Intrinsics.EZpvd(this.listings, dappListings.listings) && this.count == dappListings.count && this.total == dappListings.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCount() {
        return this.count;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Listing> getListings() {
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
        return "DappListings(listings=" + this.listings + ", count=" + this.count + ", total=" + this.total + ")";
    }

    public DappListings(@NotNull List<Listing> list, int i, int i2) {
        Intrinsics.checkNotNullParameter(list, "");
        this.listings = list;
        this.count = i;
        this.total = i2;
    }
}
