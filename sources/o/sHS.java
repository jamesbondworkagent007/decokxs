package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.model.other.AnnouncementBanner;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;

/* JADX INFO: loaded from: classes10.dex */
public interface sHS {
    @GET("/priapi/v1/im/banner/v1/announcement")
    java.lang.Object EZpvd(@NotNull Continuation<? super ResponseData<AnnouncementBanner>> continuation);
}
