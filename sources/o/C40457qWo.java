package o;

import com.okinc.market.watch.data.MarketUserFavorite;
import com.okinc.market.watch.data.po.UserFavouriteGroupNameMapDTO;
import com.okinc.unify_trade.biz.subscribe.SettingWatchList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qWo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40457qWo {
    public static final UserFavouriteGroupNameMapDTO OLrzqt(@NotNull MarketUserFavorite marketUserFavorite, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(marketUserFavorite, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new UserFavouriteGroupNameMapDTO(str, C56402yEa.EZpvd(new SettingWatchList(str2, marketUserFavorite.getInstId(), marketUserFavorite.getInstType(), marketUserFavorite.getAlias(), marketUserFavorite.getExpTime(), marketUserFavorite.getChainId(), marketUserFavorite.getTokenContractAddress())));
    }

    public static final UserFavouriteGroupNameMapDTO AEQbTJ(@NotNull java.util.List<MarketUserFavorite> list, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (MarketUserFavorite marketUserFavorite : list) {
            arrayList.add(new SettingWatchList(str2, marketUserFavorite.getInstId(), marketUserFavorite.getInstType(), marketUserFavorite.getAlias(), marketUserFavorite.getExpTime(), marketUserFavorite.getChainId(), marketUserFavorite.getTokenContractAddress()));
        }
        return new UserFavouriteGroupNameMapDTO(str, arrayList);
    }
}
