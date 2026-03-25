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
public final class RemovePayloadData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String command;
    private final String teeId;
    private final long timestamp;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RemovePayloadData copy$default(RemovePayloadData removePayloadData, String str, long j, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = removePayloadData.teeId;
        }
        if ((i & 2) != 0) {
            j = removePayloadData.timestamp;
        }
        if ((i & 4) != 0) {
            str2 = removePayloadData.command;
        }
        return removePayloadData.copy(str, j, str2);
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
    public final String component3() {
        return this.command;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RemovePayloadData copy(@NotNull String str, long j, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new RemovePayloadData(str, j, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemovePayloadData)) {
            return false;
        }
        RemovePayloadData removePayloadData = (RemovePayloadData) obj;
        return Intrinsics.EZpvd((Object) this.teeId, (Object) removePayloadData.teeId) && this.timestamp == removePayloadData.timestamp && Intrinsics.EZpvd((Object) this.command, (Object) removePayloadData.command);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCommand() {
        return this.command;
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
        return (((this.teeId.hashCode() * 31) + Long.hashCode(this.timestamp)) * 31) + this.command.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RemovePayloadData(teeId=" + this.teeId + ", timestamp=" + this.timestamp + ", command=" + this.command + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.tee.common.model.RemovePayloadData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RemovePayloadData> serializer() {
            return RemovePayloadData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RemovePayloadData(int i, String str, long j, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, RemovePayloadData$$serializer.INSTANCE.getDescriptor());
        }
        this.teeId = str;
        this.timestamp = j;
        this.command = str2;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(RemovePayloadData removePayloadData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, removePayloadData.teeId);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, removePayloadData.timestamp);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, removePayloadData.command);
    }

    public RemovePayloadData(@NotNull String str, long j, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.teeId = str;
        this.timestamp = j;
        this.command = str2;
    }

    public final String toJson() {
        return C54907xZt.encodeToString$default(Companion.serializer(), this, false, 2, null);
    }
}
