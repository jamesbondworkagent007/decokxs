package com.okinc.business.market.features.favorites.editing.data.po;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class MarketFavoritesAddCryptosToGroupPayload {
    public static final int $stable = 8;

    @SerializedName("groupNameList")
    private final List<String> groupNameList;

    @SerializedName("userFavouriteDTOs")
    private final List<MarketFavoritesCryptoPayload> userFavouriteDTOs;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final List<String> component1() {
        return this.groupNameList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final List<MarketFavoritesCryptoPayload> component2() {
        return this.userFavouriteDTOs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.favorites.editing.data.po.MarketFavoritesAddCryptosToGroupPayload */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarketFavoritesAddCryptosToGroupPayload copy$default(MarketFavoritesAddCryptosToGroupPayload marketFavoritesAddCryptosToGroupPayload, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = marketFavoritesAddCryptosToGroupPayload.groupNameList;
        }
        if ((i & 2) != 0) {
            list2 = marketFavoritesAddCryptosToGroupPayload.userFavouriteDTOs;
        }
        return marketFavoritesAddCryptosToGroupPayload.copy(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketFavoritesAddCryptosToGroupPayload copy(@NotNull List<String> list, @NotNull List<MarketFavoritesCryptoPayload> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new MarketFavoritesAddCryptosToGroupPayload(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketFavoritesAddCryptosToGroupPayload)) {
            return false;
        }
        MarketFavoritesAddCryptosToGroupPayload marketFavoritesAddCryptosToGroupPayload = (MarketFavoritesAddCryptosToGroupPayload) obj;
        return Intrinsics.EZpvd(this.groupNameList, marketFavoritesAddCryptosToGroupPayload.groupNameList) && Intrinsics.EZpvd(this.userFavouriteDTOs, marketFavoritesAddCryptosToGroupPayload.userFavouriteDTOs);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.groupNameList.hashCode() * 31) + this.userFavouriteDTOs.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MarketFavoritesAddCryptosToGroupPayload(groupNameList=" + this.groupNameList + ", userFavouriteDTOs=" + this.userFavouriteDTOs + ")";
    }

    public MarketFavoritesAddCryptosToGroupPayload(@NotNull List<String> list, @NotNull List<MarketFavoritesCryptoPayload> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.groupNameList = list;
        this.userFavouriteDTOs = list2;
    }
}
