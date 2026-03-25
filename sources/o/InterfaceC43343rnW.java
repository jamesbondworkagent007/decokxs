package o;

import com.okinc.network.okg.encrypt.TimeBeanNew;
import com.okinc.network.okg.response.ResponseData;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;

/* JADX INFO: renamed from: o.rnW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC43343rnW {
    @GET("/v2/asset/accounts/time")
    AbstractC58185ywX<ResponseData<TimeBeanNew>> AEQbTJ(@HeaderMap @NotNull java.util.Map<java.lang.String, java.lang.String> map);

    /* JADX INFO: renamed from: o.rnW$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.rnW */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AbstractC58185ywX getRemoteTimestamp$default(InterfaceC43343rnW interfaceC43343rnW, java.util.Map map, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRemoteTimestamp");
            }
            if ((i & 1) != 0) {
                map = C56424yEw.gEmmrt(C56390yDp.OLrzqt("Cache-Strategy", "FIRST_CACHE"), C56390yDp.OLrzqt("Cache-Expire", "10"));
            }
            return interfaceC43343rnW.AEQbTJ(map);
        }
    }
}
