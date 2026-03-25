package com.okinc.business.market.features.favorites.editing.data.po;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class MarketFavoritesUpdateGroupNamePayload {
    public static final int $stable = 0;

    @SerializedName("newGroupName")
    private final String newGroupName;

    @SerializedName("oldGroupName")
    private final String oldGroupName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MarketFavoritesUpdateGroupNamePayload copy$default(MarketFavoritesUpdateGroupNamePayload marketFavoritesUpdateGroupNamePayload, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marketFavoritesUpdateGroupNamePayload.oldGroupName;
        }
        if ((i & 2) != 0) {
            str2 = marketFavoritesUpdateGroupNamePayload.newGroupName;
        }
        return marketFavoritesUpdateGroupNamePayload.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.oldGroupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.newGroupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketFavoritesUpdateGroupNamePayload copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new MarketFavoritesUpdateGroupNamePayload(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketFavoritesUpdateGroupNamePayload)) {
            return false;
        }
        MarketFavoritesUpdateGroupNamePayload marketFavoritesUpdateGroupNamePayload = (MarketFavoritesUpdateGroupNamePayload) obj;
        return Intrinsics.EZpvd((Object) this.oldGroupName, (Object) marketFavoritesUpdateGroupNamePayload.oldGroupName) && Intrinsics.EZpvd((Object) this.newGroupName, (Object) marketFavoritesUpdateGroupNamePayload.newGroupName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNewGroupName() {
        return this.newGroupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOldGroupName() {
        return this.oldGroupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.oldGroupName.hashCode() * 31) + this.newGroupName.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MarketFavoritesUpdateGroupNamePayload(oldGroupName=" + this.oldGroupName + ", newGroupName=" + this.newGroupName + ")";
    }

    public MarketFavoritesUpdateGroupNamePayload(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.oldGroupName = str;
        this.newGroupName = str2;
    }
}
