package o;

import com.okinc.unify_trade.biz.subscribe.WatchListData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qTz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC40387qTz {
    java.lang.Object EZpvd(boolean z, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object EZpvd(boolean z, boolean z2, @NotNull Continuation<? super java.util.List<WatchListData>> continuation);

    java.lang.Object KWHzl(@NotNull WatchListData watchListData, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object OLrzqt(@NotNull WatchListData watchListData, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object copydefault(@NotNull WatchListData watchListData, @NotNull Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object copydefault(boolean z, @NotNull Continuation<? super Flow<? extends java.util.List<WatchListData>>> continuation);

    /* JADX INFO: renamed from: o.qTz$Activity */
    public static final class Activity {
        public static /* synthetic */ java.lang.Object initWatchList$default(InterfaceC40387qTz interfaceC40387qTz, boolean z, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initWatchList");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            return interfaceC40387qTz.EZpvd(z, continuation);
        }

        public static /* synthetic */ java.lang.Object queryWatchList$default(InterfaceC40387qTz interfaceC40387qTz, boolean z, boolean z2, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryWatchList");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = false;
            }
            return interfaceC40387qTz.EZpvd(z, z2, continuation);
        }

        public static /* synthetic */ java.lang.Object watchListFlow$default(InterfaceC40387qTz interfaceC40387qTz, boolean z, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: watchListFlow");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            return interfaceC40387qTz.copydefault(z, (Continuation<? super Flow<? extends java.util.List<WatchListData>>>) continuation);
        }
    }
}
