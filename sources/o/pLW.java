package o;

import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import o.pLW;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* JADX INFO: loaded from: classes9.dex */
public interface pLW {
    public static final Activity Companion = Activity.KWHzl;

    @GET("/v2/support/h5DeeplinkMapping")
    java.lang.Object AEQbTJ(@Header("Cache-Strategy") @NotNull java.lang.String str, @Header("Cache-Expire") int i, @NotNull Continuation<? super ResponseData<java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>>> continuation);

    @GET("/v2/support/universal/link/info")
    java.lang.Object KWHzl(@QueryMap @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super ResponseData<C38108pMn>> continuation);

    @GET("/v2/support/universal/link/info")
    java.lang.Object copydefault(@NotNull @Query("shortCode") java.lang.String str, @NotNull Continuation<? super ResponseData<C38108pMn>> continuation);

    public static final class Activity {
        public static final /* synthetic */ Activity KWHzl = new Activity();
        public static final InterfaceC56387yDm<pLW> OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.pMb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return pLW.Activity.AEQbTJ();
            }
        });

        private Activity() {
        }

        public static final pLW AEQbTJ() {
            return (pLW) C43417ror.OLrzqt(C56524yIo.AEQbTJ(pLW.class));
        }

        public final pLW KWHzl() {
            return OLrzqt.getValue();
        }

        public final pLW copydefault() {
            return KWHzl();
        }
    }

    public static final class ActionBar {
        public static /* synthetic */ java.lang.Object getH5DeeplinkMapping$default(pLW plw, java.lang.String str, int i, Continuation continuation, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getH5DeeplinkMapping");
            }
            if ((i2 & 1) != 0) {
                str = "FIRST_CACHE";
            }
            if ((i2 & 2) != 0) {
                i = 21600;
            }
            return plw.AEQbTJ(str, i, continuation);
        }
    }
}
