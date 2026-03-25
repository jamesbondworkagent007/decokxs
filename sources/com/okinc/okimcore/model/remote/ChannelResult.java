package com.okinc.okimcore.model.remote;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class ChannelResult {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final long channelId;
    private final int errorCode;
    private final String errorMsg;
    private final boolean isSuccess;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ChannelResult copy$default(ChannelResult channelResult, long j, boolean z, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = channelResult.channelId;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            z = channelResult.isSuccess;
        }
        boolean z2 = z;
        if ((i2 & 4) != 0) {
            i = channelResult.errorCode;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str = channelResult.errorMsg;
        }
        return channelResult.copy(j2, z2, i3, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.isSuccess;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.errorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.errorMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChannelResult copy(long j, boolean z, int i, String str) {
        return new ChannelResult(j, z, i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelResult)) {
            return false;
        }
        ChannelResult channelResult = (ChannelResult) obj;
        return this.channelId == channelResult.channelId && this.isSuccess == channelResult.isSuccess && this.errorCode == channelResult.errorCode && Intrinsics.EZpvd((Object) this.errorMsg, (Object) channelResult.errorMsg);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChannelId() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getErrorCode() {
        return this.errorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.channelId);
        int iHashCode2 = Boolean.hashCode(this.isSuccess);
        int iHashCode3 = Integer.hashCode(this.errorCode);
        String str = this.errorMsg;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSuccess() {
        return this.isSuccess;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ChannelResult(channelId=" + this.channelId + ", isSuccess=" + this.isSuccess + ", errorCode=" + this.errorCode + ", errorMsg=" + this.errorMsg + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.ChannelResult.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ChannelResult> serializer() {
            return ChannelResult$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ChannelResult(int i, long j, boolean z, int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, ChannelResult$$serializer.INSTANCE.getDescriptor());
        }
        this.channelId = j;
        this.isSuccess = z;
        this.errorCode = i2;
        this.errorMsg = str;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(ChannelResult channelResult, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, channelResult.channelId);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 1, channelResult.isSuccess);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, channelResult.errorCode);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, channelResult.errorMsg);
    }

    public ChannelResult(long j, boolean z, int i, String str) {
        this.channelId = j;
        this.isSuccess = z;
        this.errorCode = i;
        this.errorMsg = str;
    }
}
