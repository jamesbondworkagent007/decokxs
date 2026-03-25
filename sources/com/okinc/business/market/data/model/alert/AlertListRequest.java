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
public final class AlertListRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String chainId;
    public final String deviceId;
    public final String tokenAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AlertListRequest copy$default(AlertListRequest alertListRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = alertListRequest.deviceId;
        }
        if ((i & 2) != 0) {
            str2 = alertListRequest.tokenAddress;
        }
        if ((i & 4) != 0) {
            str3 = alertListRequest.chainId;
        }
        return alertListRequest.OLrzqt(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.deviceId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AlertListRequest OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new AlertListRequest(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
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
        if (!(obj instanceof AlertListRequest)) {
            return false;
        }
        AlertListRequest alertListRequest = (AlertListRequest) obj;
        return Intrinsics.EZpvd((Object) this.deviceId, (Object) alertListRequest.deviceId) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) alertListRequest.tokenAddress) && Intrinsics.EZpvd((Object) this.chainId, (Object) alertListRequest.chainId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.deviceId.hashCode() * 31) + this.tokenAddress.hashCode()) * 31) + this.chainId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AlertListRequest(deviceId=" + this.deviceId + ", tokenAddress=" + this.tokenAddress + ", chainId=" + this.chainId + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.alert.AlertListRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AlertListRequest> serializer() {
            return AlertListRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AlertListRequest(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, AlertListRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.deviceId = str;
        if ((i & 2) == 0) {
            this.tokenAddress = "";
        } else {
            this.tokenAddress = str2;
        }
        if ((i & 4) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str3;
        }
    }

    public static final /* synthetic */ void copydefault(AlertListRequest alertListRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, alertListRequest.deviceId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) alertListRequest.tokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, alertListRequest.tokenAddress);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) alertListRequest.chainId, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, alertListRequest.chainId);
    }

    public AlertListRequest(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.deviceId = str;
        this.tokenAddress = str2;
        this.chainId = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (r2v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:7) call: com.okinc.business.market.data.model.alert.AlertListRequest.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AlertListRequest(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
