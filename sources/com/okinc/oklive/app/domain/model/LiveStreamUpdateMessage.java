package com.okinc.oklive.app.domain.model;

import com.google.gson.annotations.SerializedName;
import com.okinc.oklive.app.data.LiveStreamStatus;

/* JADX INFO: loaded from: classes10.dex */
public final class LiveStreamUpdateMessage {
    public static final int $stable = 0;

    @SerializedName("status")
    private final int statusCode;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LiveStreamUpdateMessage copy$default(LiveStreamUpdateMessage liveStreamUpdateMessage, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = liveStreamUpdateMessage.statusCode;
        }
        return liveStreamUpdateMessage.copy(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.statusCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveStreamUpdateMessage copy(int i) {
        return new LiveStreamUpdateMessage(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LiveStreamUpdateMessage) && this.statusCode == ((LiveStreamUpdateMessage) obj).statusCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatusCode() {
        return this.statusCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return Integer.hashCode(this.statusCode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LiveStreamUpdateMessage(statusCode=" + this.statusCode + ")";
    }

    public LiveStreamUpdateMessage(int i) {
        this.statusCode = i;
    }

    public final LiveStreamStatus getStatus() {
        return LiveStreamStatus.Companion.OLrzqt(this.statusCode);
    }
}
