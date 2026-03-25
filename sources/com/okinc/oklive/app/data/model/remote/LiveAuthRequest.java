package com.okinc.oklive.app.data.model.remote;

import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class LiveAuthRequest {
    public static final int $stable = 0;

    @SerializedName("deviceId")
    private final String deviceId;

    @SerializedName(MTPushConstants.PlatformNode.KEY_PLATFORM)
    private final int platform;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LiveAuthRequest copy$default(LiveAuthRequest liveAuthRequest, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = liveAuthRequest.deviceId;
        }
        if ((i2 & 2) != 0) {
            i = liveAuthRequest.platform;
        }
        return liveAuthRequest.copy(str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.deviceId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.platform;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveAuthRequest copy(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return new LiveAuthRequest(str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveAuthRequest)) {
            return false;
        }
        LiveAuthRequest liveAuthRequest = (LiveAuthRequest) obj;
        return Intrinsics.EZpvd((Object) this.deviceId, (Object) liveAuthRequest.deviceId) && this.platform == liveAuthRequest.platform;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPlatform() {
        return this.platform;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.deviceId.hashCode() * 31) + Integer.hashCode(this.platform);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LiveAuthRequest(deviceId=" + this.deviceId + ", platform=" + this.platform + ")";
    }

    public LiveAuthRequest(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.deviceId = str;
        this.platform = i;
    }
}
