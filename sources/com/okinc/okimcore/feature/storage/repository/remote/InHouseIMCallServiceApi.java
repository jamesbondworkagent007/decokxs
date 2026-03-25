package com.okinc.okimcore.feature.storage.repository.remote;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.model.remote.InHouseIMGetAgoraTokenResponse;
import com.okinc.okimcore.model.remote.InHouseIMRejectCallRequest;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes10.dex */
public interface InHouseIMCallServiceApi {
    public static final Activity Companion = Activity.EZpvd;
    public static final int ROLE_CALLEE = 1;
    public static final int ROLE_CALLER = 0;

    @GET("/priapi/v1/im/rtc/v1/token")
    Object getAgoraToken(@NotNull @Query(RemoteMessageConst.Notification.CHANNEL_ID) String str, @Query("role") int i, @NotNull Continuation<? super ResponseData<InHouseIMGetAgoraTokenResponse>> continuation);

    @POST("/priapi/v1/im/rtc/v1/reject")
    Object rejectCall(@Body @NotNull InHouseIMRejectCallRequest inHouseIMRejectCallRequest, @NotNull Continuation<? super ResponseData<RejectCallResponse>> continuation);

    public static final class Activity {
        public static final /* synthetic */ Activity EZpvd = new Activity();

        private Activity() {
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    @Serializable
    public static final class RejectCallResponse {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);

        public static final /* synthetic */ void AEQbTJ(RejectCallResponse rejectCallResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        }

        /* JADX INFO: loaded from: classes24.dex */
        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.feature.storage.repository.remote.InHouseIMCallServiceApi.RejectCallResponse.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<RejectCallResponse> serializer() {
                return InHouseIMCallServiceApi$RejectCallResponse$$serializer.INSTANCE;
            }
        }

        public RejectCallResponse() {
        }

        public /* synthetic */ RejectCallResponse(int i, SerializationConstructorMarker serializationConstructorMarker) {
        }
    }
}
