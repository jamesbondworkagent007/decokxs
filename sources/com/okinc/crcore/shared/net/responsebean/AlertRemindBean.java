package com.okinc.crcore.shared.net.responsebean;

import com.okinc.crcore.coreapi.net.responsebean.AlertRemindResponseBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.mDA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class AlertRemindBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int active;
    private final int bizType;
    private final String chainId;
    private final String chainLogoUrl;
    private final String customMsg;
    private final String displayId;
    private final String instrumentName;
    private final long modifyTime;
    private final int percentageTime;
    private final String promptThreshold;
    private final int promptType;
    private final int repeatType;
    private final long ruleId;
    private final int sourceType;
    private final String token;
    private final String tokenAddress;
    private final String tokenLogoUrl;
    private final String uniqueId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AlertRemindBean() {
        this((String) null, 0L, 0, 0, (String) null, (String) null, 0, 0, (String) null, 0L, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 262143, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.uniqueId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component10() {
        return this.modifyTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component11() {
        return this.active;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.customMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.tokenLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component18() {
        return this.percentageTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.ruleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.sourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.instrumentName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.promptType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.repeatType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.promptThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AlertRemindBean copy(@NotNull String str, long j, int i, int i2, @NotNull String str2, @NotNull String str3, int i3, int i4, @NotNull String str4, long j2, int i5, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, int i6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        return new AlertRemindBean(str, j, i, i2, str2, str3, i3, i4, str4, j2, i5, str5, str6, str7, str8, str9, str10, i6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlertRemindBean)) {
            return false;
        }
        AlertRemindBean alertRemindBean = (AlertRemindBean) obj;
        return Intrinsics.EZpvd((Object) this.uniqueId, (Object) alertRemindBean.uniqueId) && this.ruleId == alertRemindBean.ruleId && this.sourceType == alertRemindBean.sourceType && this.bizType == alertRemindBean.bizType && Intrinsics.EZpvd((Object) this.instrumentName, (Object) alertRemindBean.instrumentName) && Intrinsics.EZpvd((Object) this.displayId, (Object) alertRemindBean.displayId) && this.promptType == alertRemindBean.promptType && this.repeatType == alertRemindBean.repeatType && Intrinsics.EZpvd((Object) this.promptThreshold, (Object) alertRemindBean.promptThreshold) && this.modifyTime == alertRemindBean.modifyTime && this.active == alertRemindBean.active && Intrinsics.EZpvd((Object) this.customMsg, (Object) alertRemindBean.customMsg) && Intrinsics.EZpvd((Object) this.chainId, (Object) alertRemindBean.chainId) && Intrinsics.EZpvd((Object) this.token, (Object) alertRemindBean.token) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) alertRemindBean.tokenAddress) && Intrinsics.EZpvd((Object) this.chainLogoUrl, (Object) alertRemindBean.chainLogoUrl) && Intrinsics.EZpvd((Object) this.tokenLogoUrl, (Object) alertRemindBean.tokenLogoUrl) && this.percentageTime == alertRemindBean.percentageTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getActive() {
        return this.active;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getBizType() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainLogoUrl() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCustomMsg() {
        return this.customMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayId() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstrumentName() {
        return this.instrumentName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getModifyTime() {
        return this.modifyTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPercentageTime() {
        return this.percentageTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPromptThreshold() {
        return this.promptThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPromptType() {
        return this.promptType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRepeatType() {
        return this.repeatType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getRuleId() {
        return this.ruleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSourceType() {
        return this.sourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToken() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenLogoUrl() {
        return this.tokenLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUniqueId() {
        return this.uniqueId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((this.uniqueId.hashCode() * 31) + Long.hashCode(this.ruleId)) * 31) + Integer.hashCode(this.sourceType)) * 31) + Integer.hashCode(this.bizType)) * 31) + this.instrumentName.hashCode()) * 31) + this.displayId.hashCode()) * 31) + Integer.hashCode(this.promptType)) * 31) + Integer.hashCode(this.repeatType)) * 31) + this.promptThreshold.hashCode()) * 31) + Long.hashCode(this.modifyTime)) * 31) + Integer.hashCode(this.active)) * 31) + this.customMsg.hashCode()) * 31) + this.chainId.hashCode()) * 31) + this.token.hashCode()) * 31) + this.tokenAddress.hashCode()) * 31) + this.chainLogoUrl.hashCode()) * 31) + this.tokenLogoUrl.hashCode()) * 31) + Integer.hashCode(this.percentageTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AlertRemindBean(uniqueId=" + this.uniqueId + ", ruleId=" + this.ruleId + ", sourceType=" + this.sourceType + ", bizType=" + this.bizType + ", instrumentName=" + this.instrumentName + ", displayId=" + this.displayId + ", promptType=" + this.promptType + ", repeatType=" + this.repeatType + ", promptThreshold=" + this.promptThreshold + ", modifyTime=" + this.modifyTime + ", active=" + this.active + ", customMsg=" + this.customMsg + ", chainId=" + this.chainId + ", token=" + this.token + ", tokenAddress=" + this.tokenAddress + ", chainLogoUrl=" + this.chainLogoUrl + ", tokenLogoUrl=" + this.tokenLogoUrl + ", percentageTime=" + this.percentageTime + ")";
    }

    public /* synthetic */ AlertRemindBean(int i, String str, long j, int i2, int i3, String str2, String str3, int i4, int i5, String str4, long j2, int i6, String str5, String str6, String str7, String str8, String str9, String str10, int i7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.uniqueId = "";
        } else {
            this.uniqueId = str;
        }
        if ((i & 2) == 0) {
            this.ruleId = 0L;
        } else {
            this.ruleId = j;
        }
        if ((i & 4) == 0) {
            this.sourceType = 0;
        } else {
            this.sourceType = i2;
        }
        if ((i & 8) == 0) {
            this.bizType = 0;
        } else {
            this.bizType = i3;
        }
        if ((i & 16) == 0) {
            this.instrumentName = "";
        } else {
            this.instrumentName = str2;
        }
        if ((i & 32) == 0) {
            this.displayId = "";
        } else {
            this.displayId = str3;
        }
        if ((i & 64) == 0) {
            this.promptType = 0;
        } else {
            this.promptType = i4;
        }
        if ((i & 128) == 0) {
            this.repeatType = 0;
        } else {
            this.repeatType = i5;
        }
        if ((i & 256) == 0) {
            this.promptThreshold = "";
        } else {
            this.promptThreshold = str4;
        }
        this.modifyTime = (i & 512) != 0 ? j2 : 0L;
        this.active = (i & 1024) == 0 ? 1 : i6;
        if ((i & 2048) == 0) {
            this.customMsg = "";
        } else {
            this.customMsg = str5;
        }
        if ((i & 4096) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str6;
        }
        if ((i & 8192) == 0) {
            this.token = "";
        } else {
            this.token = str7;
        }
        if ((i & 16384) == 0) {
            this.tokenAddress = "";
        } else {
            this.tokenAddress = str8;
        }
        if ((32768 & i) == 0) {
            this.chainLogoUrl = "";
        } else {
            this.chainLogoUrl = str9;
        }
        if ((65536 & i) == 0) {
            this.tokenLogoUrl = "";
        } else {
            this.tokenLogoUrl = str10;
        }
        if ((i & 131072) == 0) {
            this.percentageTime = 0;
        } else {
            this.percentageTime = i7;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(AlertRemindBean alertRemindBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) alertRemindBean.uniqueId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, alertRemindBean.uniqueId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || alertRemindBean.ruleId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 1, alertRemindBean.ruleId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || alertRemindBean.sourceType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, alertRemindBean.sourceType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || alertRemindBean.bizType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, alertRemindBean.bizType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) alertRemindBean.instrumentName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, alertRemindBean.instrumentName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) alertRemindBean.displayId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, alertRemindBean.displayId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || alertRemindBean.promptType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 6, alertRemindBean.promptType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || alertRemindBean.repeatType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 7, alertRemindBean.repeatType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) alertRemindBean.promptThreshold, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, alertRemindBean.promptThreshold);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || alertRemindBean.modifyTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 9, alertRemindBean.modifyTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || alertRemindBean.active != 1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 10, alertRemindBean.active);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) alertRemindBean.customMsg, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, alertRemindBean.customMsg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) alertRemindBean.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, alertRemindBean.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) alertRemindBean.token, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, alertRemindBean.token);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) alertRemindBean.tokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, alertRemindBean.tokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) alertRemindBean.chainLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, alertRemindBean.chainLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) alertRemindBean.tokenLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, alertRemindBean.tokenLogoUrl);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) && alertRemindBean.percentageTime == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 17, alertRemindBean.percentageTime);
    }

    public AlertRemindBean(@NotNull String str, long j, int i, int i2, @NotNull String str2, @NotNull String str3, int i3, int i4, @NotNull String str4, long j2, int i5, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, int i6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        this.uniqueId = str;
        this.ruleId = j;
        this.sourceType = i;
        this.bizType = i2;
        this.instrumentName = str2;
        this.displayId = str3;
        this.promptType = i3;
        this.repeatType = i4;
        this.promptThreshold = str4;
        this.modifyTime = j2;
        this.active = i5;
        this.customMsg = str5;
        this.chainId = str6;
        this.token = str7;
        this.tokenAddress = str8;
        this.chainLogoUrl = str9;
        this.tokenLogoUrl = str10;
        this.percentageTime = i6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00cd: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r42v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000c: ARITH (r42v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r23v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0016: ARITH (r42v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r25v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001e: ARITH (r42v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r26v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r42v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r42v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0036: ARITH (r42v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r29v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x003e: ARITH (r42v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r30v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0046: ARITH (r42v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x004e: ARITH (r42v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r32v0 long) : (0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0055: ARITH (r42v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r34v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005d: ARITH (r42v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:0x0070: TERNARY null = ((wrap:int:0x0067: ARITH (r42v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:0x007b: TERNARY null = ((wrap:int:0x0072: ARITH (r42v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007d: ARITH (r42v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0089: ARITH (r42v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0094: ARITH (r42v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x009f: ARITH (r42v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r41v0 int))
 A[MD:(java.lang.String, long, int, int, java.lang.String, java.lang.String, int, int, java.lang.String, long, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void (m)] (LINE:10) call: com.okinc.crcore.shared.net.responsebean.AlertRemindBean.<init>(java.lang.String, long, int, int, java.lang.String, java.lang.String, int, int, java.lang.String, long, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void type: THIS */
    public /* synthetic */ AlertRemindBean(String str, long j, int i, int i2, String str2, String str3, int i3, int i4, String str4, long j2, int i5, String str5, String str6, String str7, String str8, String str9, String str10, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? 0L : j, (i7 & 4) != 0 ? 0 : i, (i7 & 8) != 0 ? 0 : i2, (i7 & 16) != 0 ? "" : str2, (i7 & 32) != 0 ? "" : str3, (i7 & 64) != 0 ? 0 : i3, (i7 & 128) != 0 ? 0 : i4, (i7 & 256) != 0 ? "" : str4, (i7 & 512) == 0 ? j2 : 0L, (i7 & 1024) != 0 ? 1 : i5, (i7 & 2048) != 0 ? "" : str5, (i7 & 4096) != 0 ? "" : str6, (i7 & 8192) != 0 ? "" : str7, (i7 & 16384) != 0 ? "" : str8, (i7 & 32768) != 0 ? "" : str9, (i7 & 65536) != 0 ? "" : str10, (i7 & 131072) != 0 ? 0 : i6);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.AlertRemindBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AlertRemindBean> serializer() {
            return AlertRemindBean$$serializer.INSTANCE;
        }

        public final AlertRemindBean KWHzl(@NotNull AlertRemindResponseBean alertRemindResponseBean) {
            Intrinsics.checkNotNullParameter(alertRemindResponseBean, "");
            return new AlertRemindBean(mDA.EZpvd.EZpvd(alertRemindResponseBean.getChainId(), alertRemindResponseBean.getTokenAddress()), alertRemindResponseBean.getRuleId(), alertRemindResponseBean.getSourceType(), alertRemindResponseBean.getBizType(), alertRemindResponseBean.getInstrumentName(), alertRemindResponseBean.getDisplayId(), alertRemindResponseBean.getPromptType(), alertRemindResponseBean.getRepeatType(), alertRemindResponseBean.getPromptThreshold(), alertRemindResponseBean.getModifyTime(), alertRemindResponseBean.getActive(), alertRemindResponseBean.getCustomMsg(), alertRemindResponseBean.getChainId(), alertRemindResponseBean.getToken(), alertRemindResponseBean.getTokenAddress(), alertRemindResponseBean.getChainLogoUrl(), alertRemindResponseBean.getTokenLogoUrl(), alertRemindResponseBean.getPercentageTime());
        }
    }
}
