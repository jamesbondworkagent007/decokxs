package com.okinc.oklive.app.data.model.remote;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.oklive.app.common.util.BooleanOrIntDeserializer;
import com.okinc.oklive.app.data.LiveStreamStatus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class LivestreamStatusResponse {
    public static final int $stable = 0;

    @SerializedName("allowRecording")
    @JsonAdapter(BooleanOrIntDeserializer.class)
    private final Boolean allowRecording;

    @SerializedName(RemoteMessageConst.Notification.CHANNEL_ID)
    private final String channelId;

    @SerializedName("status")
    private final Integer statusCode;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LivestreamStatusResponse copy$default(LivestreamStatusResponse livestreamStatusResponse, String str, Integer num, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = livestreamStatusResponse.channelId;
        }
        if ((i & 2) != 0) {
            num = livestreamStatusResponse.statusCode;
        }
        if ((i & 4) != 0) {
            bool = livestreamStatusResponse.allowRecording;
        }
        return livestreamStatusResponse.copy(str, num, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.statusCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.allowRecording;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LivestreamStatusResponse copy(@NotNull String str, Integer num, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        return new LivestreamStatusResponse(str, num, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LivestreamStatusResponse)) {
            return false;
        }
        LivestreamStatusResponse livestreamStatusResponse = (LivestreamStatusResponse) obj;
        return Intrinsics.EZpvd((Object) this.channelId, (Object) livestreamStatusResponse.channelId) && Intrinsics.EZpvd(this.statusCode, livestreamStatusResponse.statusCode) && Intrinsics.EZpvd(this.allowRecording, livestreamStatusResponse.allowRecording);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAllowRecording() {
        return this.allowRecording;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannelId() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getStatusCode() {
        return this.statusCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.channelId.hashCode();
        Integer num = this.statusCode;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        Boolean bool = this.allowRecording;
        return (((iHashCode * 31) + iHashCode2) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LivestreamStatusResponse(channelId=" + this.channelId + ", statusCode=" + this.statusCode + ", allowRecording=" + this.allowRecording + ")";
    }

    public LivestreamStatusResponse(@NotNull String str, Integer num, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        this.channelId = str;
        this.statusCode = num;
        this.allowRecording = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 java.lang.String)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r3v0 java.lang.Integer))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r4v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.Integer, java.lang.Boolean):void (m)] (LINE:14) call: com.okinc.oklive.app.data.model.remote.LivestreamStatusResponse.<init>(java.lang.String, java.lang.Integer, java.lang.Boolean):void type: THIS */
    public /* synthetic */ LivestreamStatusResponse(String str, Integer num, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : bool);
    }

    public final LiveStreamStatus getStatus() {
        Integer num = this.statusCode;
        if (num == null) {
            return null;
        }
        return LiveStreamStatus.Companion.OLrzqt(num.intValue());
    }
}
