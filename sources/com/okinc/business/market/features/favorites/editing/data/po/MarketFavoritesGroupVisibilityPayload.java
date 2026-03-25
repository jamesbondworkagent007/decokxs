package com.okinc.business.market.features.favorites.editing.data.po;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class MarketFavoritesGroupVisibilityPayload {
    public static final int $stable = 0;

    @SerializedName("groupName")
    private final String groupName;

    @SerializedName("isHidden")
    private final boolean isHidden;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MarketFavoritesGroupVisibilityPayload copy$default(MarketFavoritesGroupVisibilityPayload marketFavoritesGroupVisibilityPayload, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marketFavoritesGroupVisibilityPayload.groupName;
        }
        if ((i & 2) != 0) {
            z = marketFavoritesGroupVisibilityPayload.isHidden;
        }
        return marketFavoritesGroupVisibilityPayload.copy(str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.groupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketFavoritesGroupVisibilityPayload copy(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return new MarketFavoritesGroupVisibilityPayload(str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketFavoritesGroupVisibilityPayload)) {
            return false;
        }
        MarketFavoritesGroupVisibilityPayload marketFavoritesGroupVisibilityPayload = (MarketFavoritesGroupVisibilityPayload) obj;
        return Intrinsics.EZpvd((Object) this.groupName, (Object) marketFavoritesGroupVisibilityPayload.groupName) && this.isHidden == marketFavoritesGroupVisibilityPayload.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupName() {
        return this.groupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.groupName.hashCode() * 31) + Boolean.hashCode(this.isHidden);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isHidden() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MarketFavoritesGroupVisibilityPayload(groupName=" + this.groupName + ", isHidden=" + this.isHidden + ")";
    }

    public MarketFavoritesGroupVisibilityPayload(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.groupName = str;
        this.isHidden = z;
    }
}
