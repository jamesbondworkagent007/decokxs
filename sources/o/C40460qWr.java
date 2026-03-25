package o;

import com.okinc.market.watch.data.po.FavGroupItemPo;
import com.okinc.market.watch.data.po.FavGroupProductItemPo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qWr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40460qWr {
    public static final FavGroupItemPo AEQbTJ(@NotNull FavGroupProductItemPo favGroupProductItemPo) {
        Intrinsics.checkNotNullParameter(favGroupProductItemPo, "");
        return new FavGroupItemPo(favGroupProductItemPo.getCombineFavouriteBean().getFavorites(), favGroupProductItemPo.getGroupIndex(), favGroupProductItemPo.getGroupName(), favGroupProductItemPo.isHidden(), favGroupProductItemPo.isPreset(), favGroupProductItemPo.getTranslatedGroupName(), false, null, null, 448, null);
    }
}
