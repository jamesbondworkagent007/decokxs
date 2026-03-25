package o;

import com.okinc.business.dexlogic.bean.CollectionTokenParam;
import com.okinc.business.market.data.model.watchlist.PinTokenToTopRequest;
import com.okinc.business.market.features.home_favorite_list.repo.HomeFavoriteListRepo$pinWatchlistItem$2;
import com.okinc.business.market.features.home_favorite_list.repo.HomeFavoriteListRepo$removeWatchlist$2;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kaX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28424kaX {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public final InterfaceC27595jyE AEQbTJ;
    public final InterfaceC23229huL KWHzl;
    public final CoroutineDispatcher OLrzqt;

    @yCM
    public C28424kaX(@NotNull InterfaceC27595jyE interfaceC27595jyE, @NotNull InterfaceC23229huL interfaceC23229huL, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        Intrinsics.checkNotNullParameter(interfaceC23229huL, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = interfaceC27595jyE;
        this.KWHzl = interfaceC23229huL;
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o.kaX$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kaX.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, int i, @NotNull Continuation<? super AbstractC43419rot<java.lang.Boolean, OKServerException>> continuation) {
        return kAB.EZpvd(new HomeFavoriteListRepo$pinWatchlistItem$2(this, new PinTokenToTopRequest(str, str2, str3, str4, i), null), continuation);
    }

    public final java.lang.Object EZpvd(@NotNull java.util.List<CollectionTokenParam> list, @NotNull Continuation<? super AbstractC43419rot<java.lang.Integer, OKServerException>> continuation) {
        return kAB.EZpvd(new HomeFavoriteListRepo$removeWatchlist$2(this, list, null), continuation);
    }
}
