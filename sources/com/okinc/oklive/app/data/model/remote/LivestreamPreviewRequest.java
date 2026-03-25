package com.okinc.oklive.app.data.model.remote;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes16.dex */
public final class LivestreamPreviewRequest {
    public static final int $stable = 0;

    @SerializedName("uid")
    private final long uid;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LivestreamPreviewRequest copy$default(LivestreamPreviewRequest livestreamPreviewRequest, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = livestreamPreviewRequest.uid;
        }
        return livestreamPreviewRequest.copy(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.uid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LivestreamPreviewRequest copy(long j) {
        return new LivestreamPreviewRequest(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LivestreamPreviewRequest) && this.uid == ((LivestreamPreviewRequest) obj).uid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getUid() {
        return this.uid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return Long.hashCode(this.uid);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LivestreamPreviewRequest(uid=" + this.uid + ")";
    }

    public LivestreamPreviewRequest(long j) {
        this.uid = j;
    }
}
