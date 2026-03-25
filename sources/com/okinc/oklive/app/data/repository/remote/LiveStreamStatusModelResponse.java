package com.okinc.oklive.app.data.repository.remote;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.sTE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class LiveStreamStatusModelResponse {
    public static final int $stable = 0;

    @SerializedName(RemoteMessageConst.Notification.CHANNEL_ID)
    private final String channelId;

    @SerializedName("failedCode")
    private final Integer failedCode;

    @SerializedName("status")
    private final Integer status;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LiveStreamStatusModelResponse copy$default(LiveStreamStatusModelResponse liveStreamStatusModelResponse, String str, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = liveStreamStatusModelResponse.channelId;
        }
        if ((i & 2) != 0) {
            num = liveStreamStatusModelResponse.status;
        }
        if ((i & 4) != 0) {
            num2 = liveStreamStatusModelResponse.failedCode;
        }
        return liveStreamStatusModelResponse.copy(str, num, num2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.failedCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveStreamStatusModelResponse copy(@NotNull String str, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new LiveStreamStatusModelResponse(str, num, num2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveStreamStatusModelResponse)) {
            return false;
        }
        LiveStreamStatusModelResponse liveStreamStatusModelResponse = (LiveStreamStatusModelResponse) obj;
        return Intrinsics.EZpvd((Object) this.channelId, (Object) liveStreamStatusModelResponse.channelId) && Intrinsics.EZpvd(this.status, liveStreamStatusModelResponse.status) && Intrinsics.EZpvd(this.failedCode, liveStreamStatusModelResponse.failedCode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannelId() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getFailedCode() {
        return this.failedCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.channelId.hashCode();
        Integer num = this.status;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        Integer num2 = this.failedCode;
        return (((iHashCode * 31) + iHashCode2) * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LiveStreamStatusModelResponse(channelId=" + this.channelId + ", status=" + this.status + ", failedCode=" + this.failedCode + ")";
    }

    public LiveStreamStatusModelResponse(@NotNull String str, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.channelId = str;
        this.status = num;
        this.failedCode = num2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 java.lang.String)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r3v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r4v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.Integer, java.lang.Integer):void (m)] (LINE:7) call: com.okinc.oklive.app.data.repository.remote.LiveStreamStatusModelResponse.<init>(java.lang.String, java.lang.Integer, java.lang.Integer):void type: THIS */
    public /* synthetic */ LiveStreamStatusModelResponse(String str, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2);
    }

    public final sTE getModeratorInvitationResult() {
        Integer num = this.failedCode;
        if (num == null) {
            return sTE.Activity.AEQbTJ;
        }
        return num.intValue() == 1 ? sTE.TaskDescription.OLrzqt : num.intValue() == 2 ? sTE.StateListAnimator.OLrzqt : num.intValue() == 3 ? new sTE.ActionBar(this.channelId) : num.intValue() == 4 ? sTE.Fragment.EZpvd : new sTE.Application(num.intValue());
    }
}
