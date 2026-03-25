package o;

import com.google.gson.JsonObject;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes10.dex */
public interface rUP {
    public static final ActionBar Companion = ActionBar.copydefault;

    @GET("/v3/users/mobile/support/common/check-country-limit")
    java.lang.Object copydefault(@Query("type") java.lang.String str, @Header("X-First-Install-Lang") java.lang.String str2, @NotNull Continuation<? super ResponseData<JsonObject>> continuation);

    public static final class ActionBar {
        public static final /* synthetic */ ActionBar copydefault = new ActionBar();

        private ActionBar() {
        }

        public final rUP AEQbTJ() {
            return (rUP) C43417ror.OLrzqt(C56524yIo.AEQbTJ(rUP.class));
        }
    }

    public static final class StateListAnimator {
        public static /* synthetic */ java.lang.Object getFeatureRestrictions$default(rUP rup, java.lang.String str, java.lang.String str2, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFeatureRestrictions");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return rup.copydefault(str, str2, continuation);
        }
    }
}
