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
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: o.jSi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC26111jSi {
    @POST("/priapi/v5/users/favorite/add-to-group")
    java.lang.Object AEQbTJ(@Query("includeType") int i, @Query("instIds") java.lang.String str, @Body @NotNull MarketFavoritesAddCryptosToGroupPayload marketFavoritesAddCryptosToGroupPayload, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @POST("/priapi/v5/users/favorite/rearrange-all-in-group")
    java.lang.Object AEQbTJ(@Body @NotNull MarketFavoritesCryptosInGroupPayload marketFavoritesCryptosInGroupPayload, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @POST("/priapi/v5/users/favorite/delete-group")
    java.lang.Object AEQbTJ(@Body @NotNull MarketFavoritesGroupNamePayload marketFavoritesGroupNamePayload, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @POST("/priapi/v5/users/favorite/set-hidden-groups")
    java.lang.Object AEQbTJ(@Body @NotNull MarketFavoritesGroupVisibilityPayload marketFavoritesGroupVisibilityPayload, @NotNull Continuation<? super ResponseData<java.util.List<MarketFavoritesGroupPo>>> continuation);

    @POST("/priapi/v5/users/favorite/add-group-name")
    java.lang.Object KWHzl(@Body @NotNull MarketFavoritesGroupNamePayload marketFavoritesGroupNamePayload, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @GET("/priapi/v5/users/favorite/all-grouped")
    java.lang.Object KWHzl(@Query("shouldRemoveMargin") boolean z, @NotNull Continuation<? super ResponseData<java.util.List<MarketFavoritesGroupPo>>> continuation);

    @POST("/priapi/v5/users/favorite/remove-from-group")
    java.lang.Object copydefault(@Body @NotNull MarketFavoritesCryptosInGroupPayload marketFavoritesCryptosInGroupPayload, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @POST("/priapi/v5/users/favorite/update-group-name")
    java.lang.Object copydefault(@Body @NotNull MarketFavoritesUpdateGroupNamePayload marketFavoritesUpdateGroupNamePayload, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @POST("/priapi/v5/users/favorite/rearrange-groups")
    java.lang.Object copydefault(@Body @NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    /* JADX INFO: renamed from: o.jSi$ActionBar */
    public static final class ActionBar {
        public static /* synthetic */ java.lang.Object addFavoritesCryptosToGroup$default(InterfaceC26111jSi interfaceC26111jSi, int i, java.lang.String str, MarketFavoritesAddCryptosToGroupPayload marketFavoritesAddCryptosToGroupPayload, Continuation continuation, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addFavoritesCryptosToGroup");
            }
            if ((i2 & 1) != 0) {
                i = 1;
            }
            if ((i2 & 2) != 0) {
                str = null;
            }
            return interfaceC26111jSi.AEQbTJ(i, str, marketFavoritesAddCryptosToGroupPayload, continuation);
        }

        public static /* synthetic */ java.lang.Object getMarketFavoritesGroupsData$default(InterfaceC26111jSi interfaceC26111jSi, boolean z, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMarketFavoritesGroupsData");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            return interfaceC26111jSi.KWHzl(z, (Continuation<? super ResponseData<java.util.List<MarketFavoritesGroupPo>>>) continuation);
        }
    }
}
