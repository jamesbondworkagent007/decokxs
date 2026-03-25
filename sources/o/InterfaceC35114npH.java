package o;

import com.okinc.find_ui.widgetprovider.feed.NewsResponse;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Header;

/* JADX INFO: renamed from: o.npH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC35114npH {
    @GET("/priapi/v5/rubik/public/content/newsFlash/1")
    java.lang.Object OLrzqt(@Header("Cache-Strategy") @NotNull java.lang.String str, @Header("Cache-Expire") int i, @NotNull Continuation<? super ResponseData<NewsResponse>> continuation);

    /* JADX INFO: renamed from: o.npH$StateListAnimator */
    public static final class StateListAnimator {
        public static /* synthetic */ java.lang.Object getNews$default(InterfaceC35114npH interfaceC35114npH, java.lang.String str, int i, Continuation continuation, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNews");
            }
            if ((i2 & 1) != 0) {
                str = "FIRST_CACHE";
            }
            if ((i2 & 2) != 0) {
                i = 60;
            }
            return interfaceC35114npH.OLrzqt(str, i, continuation);
        }
    }
}
