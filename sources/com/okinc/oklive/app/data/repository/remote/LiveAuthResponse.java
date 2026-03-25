package com.okinc.oklive.app.data.repository.remote;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class LiveAuthResponse {
    public static final int $stable = 0;

    @SerializedName("token")
    private final String token;

    @SerializedName("userUid")
    private final long userUid;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LiveAuthResponse copy$default(LiveAuthResponse liveAuthResponse, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = liveAuthResponse.token;
        }
        if ((i & 2) != 0) {
            j = liveAuthResponse.userUid;
        }
        return liveAuthResponse.copy(str, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.userUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveAuthResponse copy(@NotNull String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return new LiveAuthResponse(str, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveAuthResponse)) {
            return false;
        }
        LiveAuthResponse liveAuthResponse = (LiveAuthResponse) obj;
        return Intrinsics.EZpvd((Object) this.token, (Object) liveAuthResponse.token) && this.userUid == liveAuthResponse.userUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToken() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getUserUid() {
        return this.userUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.token.hashCode() * 31) + Long.hashCode(this.userUid);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LiveAuthResponse(token=" + this.token + ", userUid=" + this.userUid + ")";
    }

    public LiveAuthResponse(@NotNull String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        this.token = str;
        this.userUid = j;
    }
}
