package com.okinc.business.market.data.model.alert;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class AlertDataResponse {
    public static final int $stable = 0;
    public final boolean active;
    public final AlertType alertType;
    public final String chainId;
    public final String createTime;
    public final String modifyTime;
    public final AlertPromptType promptType;
    public final AlertRepeatType repeatType;
    public final String ruleId;
    public final String threshold;
    public final String tokenAddress;
    public final String tokenSymbol;
    public static final Companion Companion = new Companion(null);
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, AlertPromptType.Companion.serializer(), AlertRepeatType.Companion.serializer(), null, null, null, null, AlertType.Companion.serializer()};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AlertPromptType AEQbTJ() {
        return this.promptType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.threshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AlertDataResponse EZpvd(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull AlertPromptType alertPromptType, @NotNull AlertRepeatType alertRepeatType, @NotNull String str5, boolean z, String str6, String str7, @NotNull AlertType alertType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(alertPromptType, "");
        Intrinsics.checkNotNullParameter(alertRepeatType, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(alertType, "");
        return new AlertDataResponse(str, str2, str3, str4, alertPromptType, alertRepeatType, str5, z, str6, str7, alertType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.active;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AlertType copydefault() {
        return this.alertType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AlertRepeatType djBIcL() {
        return this.repeatType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlertDataResponse)) {
            return false;
        }
        AlertDataResponse alertDataResponse = (AlertDataResponse) obj;
        return Intrinsics.EZpvd((Object) this.ruleId, (Object) alertDataResponse.ruleId) && Intrinsics.EZpvd((Object) this.chainId, (Object) alertDataResponse.chainId) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) alertDataResponse.tokenAddress) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) alertDataResponse.tokenSymbol) && this.promptType == alertDataResponse.promptType && this.repeatType == alertDataResponse.repeatType && Intrinsics.EZpvd((Object) this.threshold, (Object) alertDataResponse.threshold) && this.active == alertDataResponse.active && Intrinsics.EZpvd((Object) this.createTime, (Object) alertDataResponse.createTime) && Intrinsics.EZpvd((Object) this.modifyTime, (Object) alertDataResponse.modifyTime) && this.alertType == alertDataResponse.alertType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.ruleId.hashCode();
        int iHashCode2 = this.chainId.hashCode();
        int iHashCode3 = this.tokenAddress.hashCode();
        int iHashCode4 = this.tokenSymbol.hashCode();
        int iHashCode5 = this.promptType.hashCode();
        int iHashCode6 = this.repeatType.hashCode();
        int iHashCode7 = this.threshold.hashCode();
        int iHashCode8 = Boolean.hashCode(this.active);
        String str = this.createTime;
        int iHashCode9 = str == null ? 0 : str.hashCode();
        String str2 = this.modifyTime;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.alertType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AlertDataResponse(ruleId=" + this.ruleId + ", chainId=" + this.chainId + ", tokenAddress=" + this.tokenAddress + ", tokenSymbol=" + this.tokenSymbol + ", promptType=" + this.promptType + ", repeatType=" + this.repeatType + ", threshold=" + this.threshold + ", active=" + this.active + ", createTime=" + this.createTime + ", modifyTime=" + this.modifyTime + ", alertType=" + this.alertType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.ruleId;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.alert.AlertDataResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AlertDataResponse> serializer() {
            return AlertDataResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AlertDataResponse(int i, String str, String str2, String str3, String str4, AlertPromptType alertPromptType, AlertRepeatType alertRepeatType, String str5, boolean z, String str6, String str7, AlertType alertType, SerializationConstructorMarker serializationConstructorMarker) {
        if (207 != (i & 207)) {
            PluginExceptionsKt.throwMissingFieldException(i, 207, AlertDataResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.ruleId = str;
        this.chainId = str2;
        this.tokenAddress = str3;
        this.tokenSymbol = str4;
        if ((i & 16) == 0) {
            this.promptType = AlertPromptType.PRICE_REACHES;
        } else {
            this.promptType = alertPromptType;
        }
        if ((i & 32) == 0) {
            this.repeatType = AlertRepeatType.REPEAT;
        } else {
            this.repeatType = alertRepeatType;
        }
        this.threshold = str5;
        this.active = z;
        if ((i & 256) == 0) {
            this.createTime = "";
        } else {
            this.createTime = str6;
        }
        if ((i & 512) == 0) {
            this.modifyTime = "";
        } else {
            this.modifyTime = str7;
        }
        if ((i & 1024) == 0) {
            this.alertType = AlertType.PRICE;
        } else {
            this.alertType = alertType;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [6=4] */
    public static final /* synthetic */ void copydefault(AlertDataResponse alertDataResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, alertDataResponse.ruleId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, alertDataResponse.chainId);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, alertDataResponse.tokenAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, alertDataResponse.tokenSymbol);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || alertDataResponse.promptType != AlertPromptType.PRICE_REACHES) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], alertDataResponse.promptType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || alertDataResponse.repeatType != AlertRepeatType.REPEAT) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], alertDataResponse.repeatType);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 6, alertDataResponse.threshold);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 7, alertDataResponse.active);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) alertDataResponse.createTime, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, alertDataResponse.createTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) alertDataResponse.modifyTime, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, alertDataResponse.modifyTime);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && alertDataResponse.alertType == AlertType.PRICE) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], alertDataResponse.alertType);
    }

    public AlertDataResponse(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull AlertPromptType alertPromptType, @NotNull AlertRepeatType alertRepeatType, @NotNull String str5, boolean z, String str6, String str7, @NotNull AlertType alertType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(alertPromptType, "");
        Intrinsics.checkNotNullParameter(alertRepeatType, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(alertType, "");
        this.ruleId = str;
        this.chainId = str2;
        this.tokenAddress = str3;
        this.tokenSymbol = str4;
        this.promptType = alertPromptType;
        this.repeatType = alertRepeatType;
        this.threshold = str5;
        this.active = z;
        this.createTime = str6;
        this.modifyTime = str7;
        this.alertType = alertType;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003e: CONSTRUCTOR 
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (wrap:com.okinc.business.market.data.model.alert.AlertPromptType:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: SGET  A[WRAPPED] (LINE:17) com.okinc.business.market.data.model.alert.AlertPromptType.PRICE_REACHES com.okinc.business.market.data.model.alert.AlertPromptType) : (r19v0 com.okinc.business.market.data.model.alert.AlertPromptType))
  (wrap:com.okinc.business.market.data.model.alert.AlertRepeatType:?: TERNARY null = ((wrap:int:0x000c: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0012: SGET  A[WRAPPED] (LINE:20) com.okinc.business.market.data.model.alert.AlertRepeatType.REPEAT com.okinc.business.market.data.model.alert.AlertRepeatType) : (r20v0 com.okinc.business.market.data.model.alert.AlertRepeatType))
  (r21v0 java.lang.String)
  (r22v0 boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:com.okinc.business.market.data.model.alert.AlertType:?: TERNARY null = ((wrap:int:0x0028: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002e: SGET  A[WRAPPED] (LINE:33) com.okinc.business.market.data.model.alert.AlertType.PRICE com.okinc.business.market.data.model.alert.AlertType) : (r25v0 com.okinc.business.market.data.model.alert.AlertType))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.data.model.alert.AlertPromptType, com.okinc.business.market.data.model.alert.AlertRepeatType, java.lang.String, boolean, java.lang.String, java.lang.String, com.okinc.business.market.data.model.alert.AlertType):void (m)] (LINE:7) call: com.okinc.business.market.data.model.alert.AlertDataResponse.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.data.model.alert.AlertPromptType, com.okinc.business.market.data.model.alert.AlertRepeatType, java.lang.String, boolean, java.lang.String, java.lang.String, com.okinc.business.market.data.model.alert.AlertType):void type: THIS */
    public /* synthetic */ AlertDataResponse(String str, String str2, String str3, String str4, AlertPromptType alertPromptType, AlertRepeatType alertRepeatType, String str5, boolean z, String str6, String str7, AlertType alertType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? AlertPromptType.PRICE_REACHES : alertPromptType, (i & 32) != 0 ? AlertRepeatType.REPEAT : alertRepeatType, str5, z, (i & 256) != 0 ? "" : str6, (i & 512) != 0 ? "" : str7, (i & 1024) != 0 ? AlertType.PRICE : alertType);
    }
}
