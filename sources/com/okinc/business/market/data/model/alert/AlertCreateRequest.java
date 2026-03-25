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

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class AlertCreateRequest {
    public static final int $stable = 0;
    public final AlertType alertType;
    public final String chainId;
    public final String deviceId;
    public final AlertPromptType promptType;
    public final AlertRepeatType repeatType;
    public final String threshold;
    public final String tokenAddress;
    public static final Companion Companion = new Companion(null);
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, AlertType.Companion.serializer(), AlertPromptType.Companion.serializer(), null, AlertRepeatType.Companion.serializer()};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AlertCreateRequest copy$default(AlertCreateRequest alertCreateRequest, String str, String str2, String str3, AlertType alertType, AlertPromptType alertPromptType, String str4, AlertRepeatType alertRepeatType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = alertCreateRequest.tokenAddress;
        }
        if ((i & 2) != 0) {
            str2 = alertCreateRequest.chainId;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = alertCreateRequest.deviceId;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            alertType = alertCreateRequest.alertType;
        }
        AlertType alertType2 = alertType;
        if ((i & 16) != 0) {
            alertPromptType = alertCreateRequest.promptType;
        }
        AlertPromptType alertPromptType2 = alertPromptType;
        if ((i & 32) != 0) {
            str4 = alertCreateRequest.threshold;
        }
        String str7 = str4;
        if ((i & 64) != 0) {
            alertRepeatType = alertCreateRequest.repeatType;
        }
        return alertCreateRequest.copydefault(str, str5, str6, alertType2, alertPromptType2, str7, alertRepeatType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AlertType AEQbTJ() {
        return this.alertType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AlertRepeatType AYXKKw() {
        return this.repeatType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AlertPromptType KWHzl() {
        return this.promptType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AlertCreateRequest copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull AlertType alertType, @NotNull AlertPromptType alertPromptType, @NotNull String str4, @NotNull AlertRepeatType alertRepeatType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(alertType, "");
        Intrinsics.checkNotNullParameter(alertPromptType, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(alertRepeatType, "");
        return new AlertCreateRequest(str, str2, str3, alertType, alertPromptType, str4, alertRepeatType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.deviceId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.threshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlertCreateRequest)) {
            return false;
        }
        AlertCreateRequest alertCreateRequest = (AlertCreateRequest) obj;
        return Intrinsics.EZpvd((Object) this.tokenAddress, (Object) alertCreateRequest.tokenAddress) && Intrinsics.EZpvd((Object) this.chainId, (Object) alertCreateRequest.chainId) && Intrinsics.EZpvd((Object) this.deviceId, (Object) alertCreateRequest.deviceId) && this.alertType == alertCreateRequest.alertType && this.promptType == alertCreateRequest.promptType && Intrinsics.EZpvd((Object) this.threshold, (Object) alertCreateRequest.threshold) && this.repeatType == alertCreateRequest.repeatType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.tokenAddress.hashCode() * 31) + this.chainId.hashCode()) * 31) + this.deviceId.hashCode()) * 31) + this.alertType.hashCode()) * 31) + this.promptType.hashCode()) * 31) + this.threshold.hashCode()) * 31) + this.repeatType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AlertCreateRequest(tokenAddress=" + this.tokenAddress + ", chainId=" + this.chainId + ", deviceId=" + this.deviceId + ", alertType=" + this.alertType + ", promptType=" + this.promptType + ", threshold=" + this.threshold + ", repeatType=" + this.repeatType + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.alert.AlertCreateRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AlertCreateRequest> serializer() {
            return AlertCreateRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AlertCreateRequest(int i, String str, String str2, String str3, AlertType alertType, AlertPromptType alertPromptType, String str4, AlertRepeatType alertRepeatType, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i, 127, AlertCreateRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.tokenAddress = str;
        this.chainId = str2;
        this.deviceId = str3;
        this.alertType = alertType;
        this.promptType = alertPromptType;
        this.threshold = str4;
        this.repeatType = alertRepeatType;
    }

    public static final /* synthetic */ void EZpvd(AlertCreateRequest alertCreateRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, alertCreateRequest.tokenAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, alertCreateRequest.chainId);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, alertCreateRequest.deviceId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], alertCreateRequest.alertType);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], alertCreateRequest.promptType);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, alertCreateRequest.threshold);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], alertCreateRequest.repeatType);
    }

    public AlertCreateRequest(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull AlertType alertType, @NotNull AlertPromptType alertPromptType, @NotNull String str4, @NotNull AlertRepeatType alertRepeatType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(alertType, "");
        Intrinsics.checkNotNullParameter(alertPromptType, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(alertRepeatType, "");
        this.tokenAddress = str;
        this.chainId = str2;
        this.deviceId = str3;
        this.alertType = alertType;
        this.promptType = alertPromptType;
        this.threshold = str4;
        this.repeatType = alertRepeatType;
    }
}
