package o;

import com.okinc.market.watch.data.MarketUserFavorite;
import com.okinc.market.watch.data.UserGroup;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qWq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC40459qWq {
    java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super java.util.List<MarketUserFavorite>> continuation);

    java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.List<MarketUserFavorite> list, @NotNull java.lang.String str2, boolean z, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super java.util.List<UserGroup>> continuation);

    java.lang.Object EZpvd(@NotNull MarketUserFavorite marketUserFavorite, @NotNull java.lang.String str, boolean z, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull UserGroup userGroup, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object copydefault(@NotNull MarketUserFavorite marketUserFavorite, @NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super java.util.List<C40453qWk>> continuation);

    java.lang.Object copydefault(@NotNull java.util.List<MarketUserFavorite> list, @NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation);

    /* JADX INFO: renamed from: o.qWq$ActionBar */
    public static final class ActionBar {
        public static /* synthetic */ java.lang.Object getUserFavoritesByUserId$default(InterfaceC40459qWq interfaceC40459qWq, java.lang.String str, java.lang.String str2, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUserFavoritesByUserId");
            }
            if ((i & 2) != 0) {
                str2 = "ALL";
            }
            return interfaceC40459qWq.AEQbTJ(str, str2, continuation);
        }

        public static /* synthetic */ java.lang.Object deleteUserFavorite$default(InterfaceC40459qWq interfaceC40459qWq, java.util.List list, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteUserFavorite");
            }
            if ((i & 2) != 0) {
                str = "ALL";
            }
            return interfaceC40459qWq.copydefault((java.util.List<MarketUserFavorite>) list, str, (Continuation<? super Unit>) continuation);
        }

        public static /* synthetic */ java.lang.Object replaceFavorites$default(InterfaceC40459qWq interfaceC40459qWq, java.lang.String str, java.util.List list, java.lang.String str2, boolean z, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: replaceFavorites");
            }
            if ((i & 4) != 0) {
                str2 = "ALL";
            }
            java.lang.String str3 = str2;
            if ((i & 8) != 0) {
                z = false;
            }
            return interfaceC40459qWq.AEQbTJ(str, list, str3, z, continuation);
        }

        public static /* synthetic */ java.lang.Object insertUserFavorite$default(InterfaceC40459qWq interfaceC40459qWq, MarketUserFavorite marketUserFavorite, java.lang.String str, boolean z, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: insertUserFavorite");
            }
            if ((i & 2) != 0) {
                str = "ALL";
            }
            if ((i & 4) != 0) {
                z = false;
            }
            return interfaceC40459qWq.EZpvd(marketUserFavorite, str, z, continuation);
        }

        public static /* synthetic */ java.lang.Object setTop$default(InterfaceC40459qWq interfaceC40459qWq, MarketUserFavorite marketUserFavorite, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setTop");
            }
            if ((i & 2) != 0) {
                str = "ALL";
            }
            return interfaceC40459qWq.copydefault(marketUserFavorite, str, (Continuation<? super Unit>) continuation);
        }
    }
}
