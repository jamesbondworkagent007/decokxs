package com.okinc.okimcore.model.im.inhouseim.ws;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class ReactionUpdateTime {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String channelId;
    private final String seq;
    private final long updateTime;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ReactionUpdateTime copy$default(ReactionUpdateTime reactionUpdateTime, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reactionUpdateTime.channelId;
        }
        if ((i & 2) != 0) {
            str2 = reactionUpdateTime.seq;
        }
        if ((i & 4) != 0) {
            j = reactionUpdateTime.updateTime;
        }
        return reactionUpdateTime.copy(str, str2, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.seq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.updateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReactionUpdateTime copy(@NotNull String str, @NotNull String str2, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new ReactionUpdateTime(str, str2, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReactionUpdateTime)) {
            return false;
        }
        ReactionUpdateTime reactionUpdateTime = (ReactionUpdateTime) obj;
        return Intrinsics.EZpvd((Object) this.channelId, (Object) reactionUpdateTime.channelId) && Intrinsics.EZpvd((Object) this.seq, (Object) reactionUpdateTime.seq) && this.updateTime == reactionUpdateTime.updateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannelId() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSeq() {
        return this.seq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.channelId.hashCode() * 31) + this.seq.hashCode()) * 31) + Long.hashCode(this.updateTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ReactionUpdateTime(channelId=" + this.channelId + ", seq=" + this.seq + ", updateTime=" + this.updateTime + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.ReactionUpdateTime.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ReactionUpdateTime> serializer() {
            return ReactionUpdateTime$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ReactionUpdateTime(int i, String str, String str2, long j, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, ReactionUpdateTime$$serializer.INSTANCE.getDescriptor());
        }
        this.channelId = str;
        this.seq = str2;
        this.updateTime = j;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(ReactionUpdateTime reactionUpdateTime, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, reactionUpdateTime.channelId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, reactionUpdateTime.seq);
        compositeEncoder.encodeLongElement(serialDescriptor, 2, reactionUpdateTime.updateTime);
    }

    public ReactionUpdateTime(@NotNull String str, @NotNull String str2, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.channelId = str;
        this.seq = str2;
        this.updateTime = j;
    }
}
