package com.okinc.business.market.features.favorites.editing.data.po;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class MarketFavoritesCryptosInGroupPayload {
    public static final int $stable = 8;

    @SerializedName("groupName")
    private final String groupName;

    @SerializedName("userFavouriteDTOs")
    private final List<MarketFavoritesCryptoPayload> userFavouriteDTOs;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final String component1() {
        return this.groupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final List<MarketFavoritesCryptoPayload> component2() {
        return this.userFavouriteDTOs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.favorites.editing.data.po.MarketFavoritesCryptosInGroupPayload */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarketFavoritesCryptosInGroupPayload copy$default(MarketFavoritesCryptosInGroupPayload marketFavoritesCryptosInGroupPayload, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marketFavoritesCryptosInGroupPayload.groupName;
        }
        if ((i & 2) != 0) {
            list = marketFavoritesCryptosInGroupPayload.userFavouriteDTOs;
        }
        return marketFavoritesCryptosInGroupPayload.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketFavoritesCryptosInGroupPayload copy(@NotNull String str, @NotNull List<MarketFavoritesCryptoPayload> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new MarketFavoritesCryptosInGroupPayload(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketFavoritesCryptosInGroupPayload)) {
            return false;
        }
        MarketFavoritesCryptosInGroupPayload marketFavoritesCryptosInGroupPayload = (MarketFavoritesCryptosInGroupPayload) obj;
        return Intrinsics.EZpvd((Object) this.groupName, (Object) marketFavoritesCryptosInGroupPayload.groupName) && Intrinsics.EZpvd(this.userFavouriteDTOs, marketFavoritesCryptosInGroupPayload.userFavouriteDTOs);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.groupName.hashCode() * 31) + this.userFavouriteDTOs.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MarketFavoritesCryptosInGroupPayload(groupName=" + this.groupName + ", userFavouriteDTOs=" + this.userFavouriteDTOs + ")";
    }

    public MarketFavoritesCryptosInGroupPayload(@NotNull String str, @NotNull List<MarketFavoritesCryptoPayload> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.groupName = str;
        this.userFavouriteDTOs = list;
    }
}
