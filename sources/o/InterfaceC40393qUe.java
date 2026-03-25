package o;

import com.okinc.tradeapi.bean.IndexTickersData;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qUe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC40393qUe {
    java.lang.Object KWHzl(@NotNull java.lang.String str, java.lang.String str2, @NotNull Continuation<? super java.util.List<IndexTickersData>> continuation);

    /* JADX INFO: renamed from: o.qUe$Activity */
    public static final class Activity {
        public static /* synthetic */ java.lang.Object getIndexTickers$default(InterfaceC40393qUe interfaceC40393qUe, java.lang.String str, java.lang.String str2, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getIndexTickers");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return interfaceC40393qUe.KWHzl(str, str2, continuation);
        }
    }
}
