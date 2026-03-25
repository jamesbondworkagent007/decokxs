package o;

import com.okinc.captcha.impl.geetest.DeepknowRequest;
import com.okinc.captcha.impl.geetest.DeepknowResponse;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import okhttp3.Interceptor;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes7.dex */
public interface lVD {
    public static final ActionBar Companion = ActionBar.KWHzl;

    @POST("/v3/users/support/jiyanDeepKnow")
    java.lang.Object copydefault(@Body @NotNull DeepknowRequest deepknowRequest, @Header("Subdomain-Strategy") @NotNull java.lang.String str, @NotNull Continuation<? super ResponseData<DeepknowResponse>> continuation);

    public static final class ActionBar {
        public static final /* synthetic */ ActionBar KWHzl = new ActionBar();

        private ActionBar() {
        }

        public final lVD KWHzl() {
            return (lVD) C30370lVw.AEQbTJ(C56524yIo.AEQbTJ(lVD.class), new Interceptor[0]);
        }
    }
}
