package com.okinc.business.market.data.model.alert;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class CheckSubscribeRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String chainId;
    public final String deviceId;
    public final String tokenAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CheckSubscribeRequest copy$default(CheckSubscribeRequest checkSubscribeRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkSubscribeRequest.tokenAddress;
        }
        if ((i & 2) != 0) {
            str2 = checkSubscribeRequest.chainId;
        }
        if ((i & 4) != 0) {
            str3 = checkSubscribeRequest.deviceId;
        }
        return checkSubscribeRequest.EZpvd(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CheckSubscribeRequest EZpvd(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new CheckSubscribeRequest(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.deviceId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckSubscribeRequest)) {
            return false;
        }
        CheckSubscribeRequest checkSubscribeRequest = (CheckSubscribeRequest) obj;
        return Intrinsics.EZpvd((Object) this.tokenAddress, (Object) checkSubscribeRequest.tokenAddress) && Intrinsics.EZpvd((Object) this.chainId, (Object) checkSubscribeRequest.chainId) && Intrinsics.EZpvd((Object) this.deviceId, (Object) checkSubscribeRequest.deviceId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.tokenAddress.hashCode() * 31) + this.chainId.hashCode()) * 31) + this.deviceId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CheckSubscribeRequest(tokenAddress=" + this.tokenAddress + ", chainId=" + this.chainId + ", deviceId=" + this.deviceId + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.alert.CheckSubscribeRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CheckSubscribeRequest> serializer() {
            return CheckSubscribeRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CheckSubscribeRequest(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, CheckSubscribeRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.tokenAddress = str;
        this.chainId = str2;
        this.deviceId = str3;
    }

    public static final /* synthetic */ void EZpvd(CheckSubscribeRequest checkSubscribeRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, checkSubscribeRequest.tokenAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, checkSubscribeRequest.chainId);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, checkSubscribeRequest.deviceId);
    }

    public CheckSubscribeRequest(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.tokenAddress = str;
        this.chainId = str2;
        this.deviceId = str3;
    }
}
