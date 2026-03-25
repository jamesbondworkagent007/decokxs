package com.okinc.business.market.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class UpdateSignalAlertsRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final Long chainId;
    public final int operationType;
    public final String tokenContractAddress;
    public final int tokenRange;
    public final String walletAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UpdateSignalAlertsRequest copy$default(UpdateSignalAlertsRequest updateSignalAlertsRequest, String str, int i, int i2, Long l, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = updateSignalAlertsRequest.walletAddress;
        }
        if ((i3 & 2) != 0) {
            i = updateSignalAlertsRequest.tokenRange;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = updateSignalAlertsRequest.operationType;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            l = updateSignalAlertsRequest.chainId;
        }
        Long l2 = l;
        if ((i3 & 16) != 0) {
            str2 = updateSignalAlertsRequest.tokenContractAddress;
        }
        return updateSignalAlertsRequest.KWHzl(str, i4, i5, l2, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UpdateSignalAlertsRequest KWHzl(@NotNull String str, int i, int i2, Long l, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new UpdateSignalAlertsRequest(str, i, i2, l, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateSignalAlertsRequest)) {
            return false;
        }
        UpdateSignalAlertsRequest updateSignalAlertsRequest = (UpdateSignalAlertsRequest) obj;
        return Intrinsics.EZpvd((Object) this.walletAddress, (Object) updateSignalAlertsRequest.walletAddress) && this.tokenRange == updateSignalAlertsRequest.tokenRange && this.operationType == updateSignalAlertsRequest.operationType && Intrinsics.EZpvd(this.chainId, updateSignalAlertsRequest.chainId) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) updateSignalAlertsRequest.tokenContractAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.walletAddress.hashCode();
        int iHashCode2 = Integer.hashCode(this.tokenRange);
        int iHashCode3 = Integer.hashCode(this.operationType);
        Long l = this.chainId;
        int iHashCode4 = l == null ? 0 : l.hashCode();
        String str = this.tokenContractAddress;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UpdateSignalAlertsRequest(walletAddress=" + this.walletAddress + ", tokenRange=" + this.tokenRange + ", operationType=" + this.operationType + ", chainId=" + this.chainId + ", tokenContractAddress=" + this.tokenContractAddress + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.UpdateSignalAlertsRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UpdateSignalAlertsRequest> serializer() {
            return UpdateSignalAlertsRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UpdateSignalAlertsRequest(int i, String str, int i2, int i3, Long l, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, UpdateSignalAlertsRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.walletAddress = str;
        this.tokenRange = i2;
        this.operationType = i3;
        if ((i & 8) == 0) {
            this.chainId = null;
        } else {
            this.chainId = l;
        }
        if ((i & 16) == 0) {
            this.tokenContractAddress = null;
        } else {
            this.tokenContractAddress = str2;
        }
    }

    public static final /* synthetic */ void copydefault(UpdateSignalAlertsRequest updateSignalAlertsRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, updateSignalAlertsRequest.walletAddress);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, updateSignalAlertsRequest.tokenRange);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, updateSignalAlertsRequest.operationType);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || updateSignalAlertsRequest.chainId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, updateSignalAlertsRequest.chainId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && updateSignalAlertsRequest.tokenContractAddress == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, updateSignalAlertsRequest.tokenContractAddress);
    }

    public UpdateSignalAlertsRequest(@NotNull String str, int i, int i2, Long l, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.walletAddress = str;
        this.tokenRange = i;
        this.operationType = i2;
        this.chainId = l;
        this.tokenContractAddress = str2;
    }
}
