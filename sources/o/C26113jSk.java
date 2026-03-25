package o;

import com.okinc.business.market.features.favorites.editing.data.po.MarketFavoritesAddCryptosToGroupPayload;
import com.okinc.business.market.features.favorites.editing.data.po.MarketFavoritesCryptosInGroupPayload;
import com.okinc.business.market.features.favorites.editing.data.po.MarketFavoritesGroupNamePayload;
import com.okinc.business.market.features.favorites.editing.data.po.MarketFavoritesGroupPo;
import com.okinc.business.market.features.favorites.editing.data.po.MarketFavoritesGroupVisibilityPayload;
import com.okinc.business.market.features.favorites.editing.data.po.MarketFavoritesUpdateGroupNamePayload;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import o.InterfaceC26111jSi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jSk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26113jSk {
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.jSn
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C26113jSk.OLrzqt();
        }
    });

    @yCM
    public C26113jSk() {
    }

    public final InterfaceC26111jSi KWHzl() {
        return (InterfaceC26111jSi) this.EZpvd.getValue();
    }

    public static final InterfaceC26111jSi OLrzqt() {
        return (InterfaceC26111jSi) C38416pXz.copydefault(C56524yIo.AEQbTJ(InterfaceC26111jSi.class));
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.jSi.ActionBar.getMarketFavoritesGroupsData$default(o.jSi, boolean, kotlin.coroutines.Continuation, int, java.lang.Object):java.lang.Object */
    public java.lang.Object AEQbTJ(@NotNull Continuation<? super ResponseData<java.util.List<MarketFavoritesGroupPo>>> continuation) {
        return InterfaceC26111jSi.ActionBar.getMarketFavoritesGroupsData$default(KWHzl(), false, continuation, 1, null);
    }

    public java.lang.Object EZpvd(@NotNull MarketFavoritesGroupNamePayload marketFavoritesGroupNamePayload, @NotNull Continuation<? super ResponseData<Unit>> continuation) {
        return KWHzl().KWHzl(marketFavoritesGroupNamePayload, continuation);
    }

    public java.lang.Object OLrzqt(@NotNull MarketFavoritesUpdateGroupNamePayload marketFavoritesUpdateGroupNamePayload, @NotNull Continuation<? super ResponseData<Unit>> continuation) {
        return KWHzl().copydefault(marketFavoritesUpdateGroupNamePayload, continuation);
    }

    public java.lang.Object OLrzqt(@NotNull MarketFavoritesGroupNamePayload marketFavoritesGroupNamePayload, @NotNull Continuation<? super ResponseData<Unit>> continuation) {
        return KWHzl().AEQbTJ(marketFavoritesGroupNamePayload, continuation);
    }

    public java.lang.Object copydefault(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super ResponseData<Unit>> continuation) {
        return KWHzl().copydefault(list, continuation);
    }

    public java.lang.Object AEQbTJ(@NotNull MarketFavoritesGroupVisibilityPayload marketFavoritesGroupVisibilityPayload, @NotNull Continuation<? super ResponseData<java.util.List<MarketFavoritesGroupPo>>> continuation) {
        return KWHzl().AEQbTJ(marketFavoritesGroupVisibilityPayload, continuation);
    }

    public java.lang.Object EZpvd(@NotNull MarketFavoritesAddCryptosToGroupPayload marketFavoritesAddCryptosToGroupPayload, @NotNull Continuation<? super ResponseData<Unit>> continuation) {
        return InterfaceC26111jSi.ActionBar.addFavoritesCryptosToGroup$default(KWHzl(), 0, null, marketFavoritesAddCryptosToGroupPayload, continuation, 3, null);
    }

    public java.lang.Object EZpvd(@NotNull MarketFavoritesCryptosInGroupPayload marketFavoritesCryptosInGroupPayload, @NotNull Continuation<? super ResponseData<Unit>> continuation) {
        return KWHzl().copydefault(marketFavoritesCryptosInGroupPayload, continuation);
    }

    public java.lang.Object AEQbTJ(@NotNull MarketFavoritesCryptosInGroupPayload marketFavoritesCryptosInGroupPayload, @NotNull Continuation<? super ResponseData<Unit>> continuation) {
        return KWHzl().AEQbTJ(marketFavoritesCryptosInGroupPayload, continuation);
    }
}
