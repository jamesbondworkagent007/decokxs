package com.okinc.business.defi.wallet.tee.common.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C54907xZt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class ExtendPayloadData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final boolean autoRenew;
    private final String command;
    private final long expiredTimestamp;
    private final String teeId;
    private final long timestamp;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ExtendPayloadData copy$default(ExtendPayloadData extendPayloadData, String str, long j, long j2, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = extendPayloadData.teeId;
        }
        if ((i & 2) != 0) {
            j = extendPayloadData.timestamp;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = extendPayloadData.expiredTimestamp;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            z = extendPayloadData.autoRenew;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            str2 = extendPayloadData.command;
        }
        return extendPayloadData.copy(str, j3, j4, z2, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.teeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.expiredTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.autoRenew;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.command;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExtendPayloadData copy(@NotNull String str, long j, long j2, boolean z, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new ExtendPayloadData(str, j, j2, z, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtendPayloadData)) {
            return false;
        }
        ExtendPayloadData extendPayloadData = (ExtendPayloadData) obj;
        return Intrinsics.EZpvd((Object) this.teeId, (Object) extendPayloadData.teeId) && this.timestamp == extendPayloadData.timestamp && this.expiredTimestamp == extendPayloadData.expiredTimestamp && this.autoRenew == extendPayloadData.autoRenew && Intrinsics.EZpvd((Object) this.command, (Object) extendPayloadData.command);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAutoRenew() {
        return this.autoRenew;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCommand() {
        return this.command;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getExpiredTimestamp() {
        return this.expiredTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTeeId() {
        return this.teeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.teeId.hashCode() * 31) + Long.hashCode(this.timestamp)) * 31) + Long.hashCode(this.expiredTimestamp)) * 31) + Boolean.hashCode(this.autoRenew)) * 31) + this.command.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ExtendPayloadData(teeId=" + this.teeId + ", timestamp=" + this.timestamp + ", expiredTimestamp=" + this.expiredTimestamp + ", autoRenew=" + this.autoRenew + ", command=" + this.command + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.tee.common.model.ExtendPayloadData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ExtendPayloadData> serializer() {
            return ExtendPayloadData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ExtendPayloadData(int i, String str, long j, long j2, boolean z, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, ExtendPayloadData$$serializer.INSTANCE.getDescriptor());
        }
        this.teeId = str;
        this.timestamp = j;
        this.expiredTimestamp = j2;
        this.autoRenew = z;
        this.command = str2;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(ExtendPayloadData extendPayloadData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, extendPayloadData.teeId);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, extendPayloadData.timestamp);
        compositeEncoder.encodeLongElement(serialDescriptor, 2, extendPayloadData.expiredTimestamp);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 3, extendPayloadData.autoRenew);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, extendPayloadData.command);
    }

    public ExtendPayloadData(@NotNull String str, long j, long j2, boolean z, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.teeId = str;
        this.timestamp = j;
        this.expiredTimestamp = j2;
        this.autoRenew = z;
        this.command = str2;
    }

    public final String toJson() {
        return C54907xZt.encodeToString$default(Companion.serializer(), this, false, 2, null);
    }
}
