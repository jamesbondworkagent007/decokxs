package o;

import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;

/* JADX INFO: renamed from: o.aYq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC6941aYq {
    public static final Activity Companion = Activity.AEQbTJ;

    @GET("/priapi/v5/support/bigdata/sendAmpProjectList")
    java.lang.Object EZpvd(@HeaderMap @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<JsonElement>> continuation);

    /* JADX INFO: renamed from: o.aYq$StateListAnimator */
    /* JADX INFO: loaded from: classes14.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.aYq */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ java.lang.Object getAmplitudeList$default(InterfaceC6941aYq interfaceC6941aYq, java.util.Map map, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAmplitudeList");
            }
            if ((i & 1) != 0) {
                map = C56424yEw.gEmmrt(C56390yDp.OLrzqt("Cache-Strategy", "FIRST_CACHE"), C56390yDp.OLrzqt("Cache-Expire", "7200"));
            }
            return interfaceC6941aYq.EZpvd(map, continuation);
        }
    }

    /* JADX INFO: renamed from: o.aYq$Activity */
    public static final class Activity {
        public static final /* synthetic */ Activity AEQbTJ = new Activity();

        private Activity() {
        }

        public final InterfaceC6941aYq EZpvd() {
            return (InterfaceC6941aYq) C43417ror.OLrzqt(C56524yIo.AEQbTJ(InterfaceC6941aYq.class));
        }
    }
}
