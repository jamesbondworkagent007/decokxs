package com.amplifyframework.predictions.models;

import com.amplifyframework.annotations.InternalAmplifyApi;
import java.util.Arrays;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@InternalAmplifyApi
public final class VideoEvent {
    private final byte[] bytes;
    private final Date timestamp;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ VideoEvent copy$default(VideoEvent videoEvent, byte[] bArr, Date date, int i, Object obj) {
        if ((i & 1) != 0) {
            bArr = videoEvent.bytes;
        }
        if ((i & 2) != 0) {
            date = videoEvent.timestamp;
        }
        return videoEvent.copy(bArr, date);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte[] component1() {
        return this.bytes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Date component2() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VideoEvent copy(@NotNull byte[] bArr, @NotNull Date date) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(date, "");
        return new VideoEvent(bArr, date);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoEvent)) {
            return false;
        }
        VideoEvent videoEvent = (VideoEvent) obj;
        return Intrinsics.EZpvd(this.bytes, videoEvent.bytes) && Intrinsics.EZpvd(this.timestamp, videoEvent.timestamp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte[] getBytes() {
        return this.bytes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Date getTimestamp() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Arrays.hashCode(this.bytes) * 31) + this.timestamp.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "VideoEvent(bytes=" + Arrays.toString(this.bytes) + ", timestamp=" + this.timestamp + ")";
    }

    public VideoEvent(@NotNull byte[] bArr, @NotNull Date date) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(date, "");
        this.bytes = bArr;
        this.timestamp = date;
    }
}
