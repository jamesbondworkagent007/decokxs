package o;

import com.okinc.business.market.data.model.HomeFavoriteTokenData;
import com.okinc.business.market.data.model.watchlist.FavoriteTokensSortRequest;
import com.okinc.business.market.data.model.watchlist.UpdateFavoriteTokensRequest;
import com.okinc.business.market.features.group.domain.CommonGroupData;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kCt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC27771kCt {
    java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Result<? extends java.util.List<CommonGroupData>>> continuation);

    java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, java.lang.String str3, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<HomeFavoriteTokenData>, OKServerException>> continuation);

    java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull Continuation<? super java.lang.Integer> continuation);

    java.lang.Object KWHzl(@NotNull FavoriteTokensSortRequest favoriteTokensSortRequest, @NotNull Continuation<? super java.lang.Integer> continuation);

    java.lang.Object KWHzl(@NotNull UpdateFavoriteTokensRequest updateFavoriteTokensRequest, @NotNull Continuation<? super java.lang.Integer> continuation);

    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull java.lang.String str3, @NotNull Continuation<? super java.lang.Integer> continuation);

    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<CommonGroupData>, OKServerException>> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super java.lang.Integer> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<java.lang.Integer> list, @NotNull Continuation<? super AbstractC43419rot<Unit, OKServerException>> continuation);
}
