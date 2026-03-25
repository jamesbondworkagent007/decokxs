package o;

import com.okinc.market.watch.data.MarketUserFavorite;
import com.okinc.market.watch.data.UserGroup;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qWv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC40464qWv extends InterfaceC40459qWq {
    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull MarketUserFavorite marketUserFavorite, @NotNull Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Flow<? extends java.util.List<MarketUserFavorite>>> continuation);

    Flow<java.lang.Boolean> KWHzl(@NotNull java.lang.String str, @NotNull MarketUserFavorite marketUserFavorite);

    java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super Flow<? extends java.util.List<UserGroup>>> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.util.List<C40453qWk> list, @NotNull Continuation<? super Unit> continuation);

    /* JADX INFO: renamed from: o.qWv$StateListAnimator */
    public static final class StateListAnimator {
        public static /* synthetic */ java.lang.Object cursorUserFav$default(InterfaceC40464qWv interfaceC40464qWv, java.lang.String str, java.lang.String str2, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cursorUserFav");
            }
            if ((i & 2) != 0) {
                str2 = "ALL";
            }
            return interfaceC40464qWv.KWHzl(str, str2, (Continuation<? super Flow<? extends java.util.List<MarketUserFavorite>>>) continuation);
        }
    }
}
