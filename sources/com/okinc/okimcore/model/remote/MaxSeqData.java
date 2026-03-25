package com.okinc.okimcore.model.remote;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class MaxSeqData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String channelId;
    private final String lastMsgSeq;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MaxSeqData copy$default(MaxSeqData maxSeqData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = maxSeqData.channelId;
        }
        if ((i & 2) != 0) {
            str2 = maxSeqData.lastMsgSeq;
        }
        return maxSeqData.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.lastMsgSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MaxSeqData copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new MaxSeqData(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MaxSeqData)) {
            return false;
        }
        MaxSeqData maxSeqData = (MaxSeqData) obj;
        return Intrinsics.EZpvd((Object) this.channelId, (Object) maxSeqData.channelId) && Intrinsics.EZpvd((Object) this.lastMsgSeq, (Object) maxSeqData.lastMsgSeq);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannelId() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLastMsgSeq() {
        return this.lastMsgSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.channelId.hashCode() * 31) + this.lastMsgSeq.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MaxSeqData(channelId=" + this.channelId + ", lastMsgSeq=" + this.lastMsgSeq + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.MaxSeqData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MaxSeqData> serializer() {
            return MaxSeqData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MaxSeqData(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, MaxSeqData$$serializer.INSTANCE.getDescriptor());
        }
        this.channelId = str;
        this.lastMsgSeq = str2;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(MaxSeqData maxSeqData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, maxSeqData.channelId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, maxSeqData.lastMsgSeq);
    }

    public MaxSeqData(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.channelId = str;
        this.lastMsgSeq = str2;
    }
}
