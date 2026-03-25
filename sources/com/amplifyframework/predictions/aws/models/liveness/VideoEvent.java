package com.amplifyframework.predictions.aws.models.liveness;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class VideoEvent {
    public static final Companion Companion = new Companion(null);
    private final long timestampMillis;
    private final ByteBuffer videoChunk;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ VideoEvent copy$default(VideoEvent videoEvent, ByteBuffer byteBuffer, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            byteBuffer = videoEvent.videoChunk;
        }
        if ((i & 2) != 0) {
            j = videoEvent.timestampMillis;
        }
        return videoEvent.copy(byteBuffer, j);
    }

    @SerialName("TimestampMillis")
    public static /* synthetic */ void getTimestampMillis$annotations() {
    }

    @SerialName("VideoChunk")
    @Serializable(with = ByteBufferSerializer.class)
    public static /* synthetic */ void getVideoChunk$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ByteBuffer component1() {
        return this.videoChunk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.timestampMillis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VideoEvent copy(@NotNull ByteBuffer byteBuffer, long j) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new VideoEvent(byteBuffer, j);
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
        return Intrinsics.EZpvd(this.videoChunk, videoEvent.videoChunk) && this.timestampMillis == videoEvent.timestampMillis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getTimestampMillis() {
        return this.timestampMillis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ByteBuffer getVideoChunk() {
        return this.videoChunk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.videoChunk.hashCode() * 31) + Long.hashCode(this.timestampMillis);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "VideoEvent(videoChunk=" + this.videoChunk + ", timestampMillis=" + this.timestampMillis + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.predictions.aws.models.liveness.VideoEvent.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<VideoEvent> serializer() {
            return VideoEvent$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ VideoEvent(int i, @SerialName("VideoChunk") @Serializable(with = ByteBufferSerializer.class) ByteBuffer byteBuffer, @SerialName("TimestampMillis") long j, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, VideoEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.videoChunk = byteBuffer;
        this.timestampMillis = j;
    }

    public VideoEvent(@NotNull ByteBuffer byteBuffer, long j) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        this.videoChunk = byteBuffer;
        this.timestampMillis = j;
    }

    public static final /* synthetic */ void write$Self(VideoEvent videoEvent, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, ByteBufferSerializer.INSTANCE, videoEvent.videoChunk);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, videoEvent.timestampMillis);
    }
}
