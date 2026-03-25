package o;

import com.okinc.planet.domain.remote.dto.PublishPermissionResp;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface tQR {
    java.lang.Object KWHzl(java.lang.String str, @NotNull Continuation<? super kotlin.Pair<PublishPermissionResp, java.lang.String>> continuation);

    public static final class ActionBar {
        public static /* synthetic */ java.lang.Object invoke$default(tQR tqr, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i & 1) != 0) {
                str = "NO_CACHE";
            }
            return tqr.KWHzl(str, continuation);
        }
    }
}
