package o;

import com.okinc.market.watch.data.UserGroup;
import com.okinc.market.watch.data.po.FavGroupItemPo;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qWj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40452qWj {
    public static final UserGroup EZpvd(@NotNull FavGroupItemPo favGroupItemPo) {
        Intrinsics.checkNotNullParameter(favGroupItemPo, "");
        return new UserGroup(favGroupItemPo.getGroupName(), C55686xod.KWHzl(), favGroupItemPo.getGroupIndex(), favGroupItemPo.isHidden(), favGroupItemPo.isPreset(), favGroupItemPo.getTranslatedGroupName());
    }

    public static /* synthetic */ FavGroupItemPo convertFavGroupProductItemPo$default(UserGroup userGroup, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = yDY.AhwBna();
        }
        return AEQbTJ(userGroup, list);
    }

    public static final FavGroupItemPo AEQbTJ(@NotNull UserGroup userGroup, @NotNull java.util.List<WatchListData> list) {
        Intrinsics.checkNotNullParameter(userGroup, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new FavGroupItemPo(list, userGroup.getGroupIndex(), userGroup.getGroupName(), userGroup.isHidden(), userGroup.isPreset(), userGroup.getTranslatedGroupName(), false, null, null, 448, null);
    }

    public static final C40453qWk AEQbTJ(@NotNull FavGroupItemPo favGroupItemPo) {
        Intrinsics.checkNotNullParameter(favGroupItemPo, "");
        UserGroup userGroupEZpvd = EZpvd(favGroupItemPo);
        java.util.List<WatchListData> favouriteList = favGroupItemPo.getFavouriteList();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(favouriteList, 10));
        java.util.Iterator<T> it = favouriteList.iterator();
        while (it.hasNext()) {
            arrayList.add(qWJ.convertToUserFavorite$default((WatchListData) it.next(), null, 1, null));
        }
        return new C40453qWk(userGroupEZpvd, arrayList);
    }
}
