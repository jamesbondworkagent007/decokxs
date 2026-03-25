package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.model.remote.BroadcastMessageRequest;
import com.okinc.okimcore.model.remote.CreateBroadcastChannelRequest;
import com.okinc.okimcore.model.remote.CreateBroadcastChannelResponse;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: renamed from: o.sEd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC44123sEd {
    @POST("/priapi/v1/im/message/v1/bulk-message")
    java.lang.Object AEQbTJ(@Body @NotNull BroadcastMessageRequest broadcastMessageRequest, @NotNull Continuation<? super ResponseData<java.lang.Object>> continuation);

    @POST("/priapi/v1/im/message/v1/broadcast-channel")
    java.lang.Object AEQbTJ(@Body @NotNull CreateBroadcastChannelRequest createBroadcastChannelRequest, @NotNull Continuation<? super ResponseData<CreateBroadcastChannelResponse>> continuation);
}
