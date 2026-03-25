package com.okinc.business.market.features.favorites.editing.data.po;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class MarketFavoritesGroupNamePayload {
    public static final int $stable = 0;

    @SerializedName("groupName")
    private final String groupName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MarketFavoritesGroupNamePayload copy$default(MarketFavoritesGroupNamePayload marketFavoritesGroupNamePayload, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marketFavoritesGroupNamePayload.groupName;
        }
        return marketFavoritesGroupNamePayload.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.groupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketFavoritesGroupNamePayload copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new MarketFavoritesGroupNamePayload(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarketFavoritesGroupNamePayload) && Intrinsics.EZpvd((Object) this.groupName, (Object) ((MarketFavoritesGroupNamePayload) obj).groupName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupName() {
        return this.groupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.groupName.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MarketFavoritesGroupNamePayload(groupName=" + this.groupName + ")";
    }

    public MarketFavoritesGroupNamePayload(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.groupName = str;
    }
}
