package com.okinc.crcore.coreapi.net.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class AlertRemindResponseBean implements Parcelable {
    private int active;
    private int bizType;
    private String chainId;
    private String chainLogoUrl;
    private String customMsg;
    private String displayId;
    private String instrumentName;
    private long modifyTime;
    private int percentageTime;
    private String promptThreshold;
    private int promptType;
    private int repeatType;
    private long ruleId;
    private int sourceType;
    private String token;
    private String tokenAddress;
    private String tokenLogoUrl;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AlertRemindResponseBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<AlertRemindResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AlertRemindResponseBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AlertRemindResponseBean(parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readLong(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AlertRemindResponseBean[] newArray(int i) {
            return new AlertRemindResponseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AlertRemindResponseBean() {
        this(0L, 0, 0, (String) null, (String) null, 0, 0, (String) null, 0L, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 131071, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.ruleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component10() {
        return this.active;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.customMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.tokenLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component17() {
        return this.percentageTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.sourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.instrumentName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.promptType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.repeatType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.promptThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component9() {
        return this.modifyTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AlertRemindResponseBean copy(long j, int i, int i2, @NotNull String str, @NotNull String str2, int i3, int i4, @NotNull String str3, long j2, int i5, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, int i6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new AlertRemindResponseBean(j, i, i2, str, str2, i3, i4, str3, j2, i5, str4, str5, str6, str7, str8, str9, i6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlertRemindResponseBean)) {
            return false;
        }
        AlertRemindResponseBean alertRemindResponseBean = (AlertRemindResponseBean) obj;
        return this.ruleId == alertRemindResponseBean.ruleId && this.sourceType == alertRemindResponseBean.sourceType && this.bizType == alertRemindResponseBean.bizType && Intrinsics.EZpvd((Object) this.instrumentName, (Object) alertRemindResponseBean.instrumentName) && Intrinsics.EZpvd((Object) this.displayId, (Object) alertRemindResponseBean.displayId) && this.promptType == alertRemindResponseBean.promptType && this.repeatType == alertRemindResponseBean.repeatType && Intrinsics.EZpvd((Object) this.promptThreshold, (Object) alertRemindResponseBean.promptThreshold) && this.modifyTime == alertRemindResponseBean.modifyTime && this.active == alertRemindResponseBean.active && Intrinsics.EZpvd((Object) this.customMsg, (Object) alertRemindResponseBean.customMsg) && Intrinsics.EZpvd((Object) this.chainId, (Object) alertRemindResponseBean.chainId) && Intrinsics.EZpvd((Object) this.token, (Object) alertRemindResponseBean.token) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) alertRemindResponseBean.tokenAddress) && Intrinsics.EZpvd((Object) this.chainLogoUrl, (Object) alertRemindResponseBean.chainLogoUrl) && Intrinsics.EZpvd((Object) this.tokenLogoUrl, (Object) alertRemindResponseBean.tokenLogoUrl) && this.percentageTime == alertRemindResponseBean.percentageTime;
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
    public int hashCode() {
        return (((((((((((((((((((((((((((((((Long.hashCode(this.ruleId) * 31) + Integer.hashCode(this.sourceType)) * 31) + Integer.hashCode(this.bizType)) * 31) + this.instrumentName.hashCode()) * 31) + this.displayId.hashCode()) * 31) + Integer.hashCode(this.promptType)) * 31) + Integer.hashCode(this.repeatType)) * 31) + this.promptThreshold.hashCode()) * 31) + Long.hashCode(this.modifyTime)) * 31) + Integer.hashCode(this.active)) * 31) + this.customMsg.hashCode()) * 31) + this.chainId.hashCode()) * 31) + this.token.hashCode()) * 31) + this.tokenAddress.hashCode()) * 31) + this.chainLogoUrl.hashCode()) * 31) + this.tokenLogoUrl.hashCode()) * 31) + Integer.hashCode(this.percentageTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActive(int i) {
        this.active = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBizType(int i) {
        this.bizType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainLogoUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainLogoUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCustomMsg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.customMsg = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDisplayId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.displayId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstrumentName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instrumentName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setModifyTime(long j) {
        this.modifyTime = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPercentageTime(int i) {
        this.percentageTime = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPromptThreshold(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.promptThreshold = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPromptType(int i) {
        this.promptType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRepeatType(int i) {
        this.repeatType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRuleId(long j) {
        this.ruleId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSourceType(int i) {
        this.sourceType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.token = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tokenAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenLogoUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tokenLogoUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AlertRemindResponseBean(ruleId=" + this.ruleId + ", sourceType=" + this.sourceType + ", bizType=" + this.bizType + ", instrumentName=" + this.instrumentName + ", displayId=" + this.displayId + ", promptType=" + this.promptType + ", repeatType=" + this.repeatType + ", promptThreshold=" + this.promptThreshold + ", modifyTime=" + this.modifyTime + ", active=" + this.active + ", customMsg=" + this.customMsg + ", chainId=" + this.chainId + ", token=" + this.token + ", tokenAddress=" + this.tokenAddress + ", chainLogoUrl=" + this.chainLogoUrl + ", tokenLogoUrl=" + this.tokenLogoUrl + ", percentageTime=" + this.percentageTime + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.ruleId);
        parcel.writeInt(this.sourceType);
        parcel.writeInt(this.bizType);
        parcel.writeString(this.instrumentName);
        parcel.writeString(this.displayId);
        parcel.writeInt(this.promptType);
        parcel.writeInt(this.repeatType);
        parcel.writeString(this.promptThreshold);
        parcel.writeLong(this.modifyTime);
        parcel.writeInt(this.active);
        parcel.writeString(this.customMsg);
        parcel.writeString(this.chainId);
        parcel.writeString(this.token);
        parcel.writeString(this.tokenAddress);
        parcel.writeString(this.chainLogoUrl);
        parcel.writeString(this.tokenLogoUrl);
        parcel.writeInt(this.percentageTime);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.AlertRemindResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AlertRemindResponseBean> serializer() {
            return AlertRemindResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AlertRemindResponseBean(int i, long j, int i2, int i3, String str, String str2, int i4, int i5, String str3, long j2, int i6, String str4, String str5, String str6, String str7, String str8, String str9, int i7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.ruleId = 0L;
        } else {
            this.ruleId = j;
        }
        if ((i & 2) == 0) {
            this.sourceType = 0;
        } else {
            this.sourceType = i2;
        }
        if ((i & 4) == 0) {
            this.bizType = 0;
        } else {
            this.bizType = i3;
        }
        if ((i & 8) == 0) {
            this.instrumentName = "";
        } else {
            this.instrumentName = str;
        }
        if ((i & 16) == 0) {
            this.displayId = "";
        } else {
            this.displayId = str2;
        }
        if ((i & 32) == 0) {
            this.promptType = 0;
        } else {
            this.promptType = i4;
        }
        if ((i & 64) == 0) {
            this.repeatType = 0;
        } else {
            this.repeatType = i5;
        }
        if ((i & 128) == 0) {
            this.promptThreshold = "";
        } else {
            this.promptThreshold = str3;
        }
        if ((i & 256) == 0) {
            this.modifyTime = 0L;
        } else {
            this.modifyTime = j2;
        }
        this.active = (i & 512) == 0 ? 1 : i6;
        if ((i & 1024) == 0) {
            this.customMsg = "";
        } else {
            this.customMsg = str4;
        }
        if ((i & 2048) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str5;
        }
        if ((i & 4096) == 0) {
            this.token = "";
        } else {
            this.token = str6;
        }
        if ((i & 8192) == 0) {
            this.tokenAddress = "";
        } else {
            this.tokenAddress = str7;
        }
        if ((i & 16384) == 0) {
            this.chainLogoUrl = "";
        } else {
            this.chainLogoUrl = str8;
        }
        if ((32768 & i) == 0) {
            this.tokenLogoUrl = "";
        } else {
            this.tokenLogoUrl = str9;
        }
        if ((i & 65536) == 0) {
            this.percentageTime = 0;
        } else {
            this.percentageTime = i7;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(AlertRemindResponseBean alertRemindResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || alertRemindResponseBean.ruleId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, alertRemindResponseBean.ruleId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || alertRemindResponseBean.sourceType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, alertRemindResponseBean.sourceType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || alertRemindResponseBean.bizType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, alertRemindResponseBean.bizType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) alertRemindResponseBean.instrumentName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, alertRemindResponseBean.instrumentName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) alertRemindResponseBean.displayId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, alertRemindResponseBean.displayId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || alertRemindResponseBean.promptType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 5, alertRemindResponseBean.promptType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || alertRemindResponseBean.repeatType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 6, alertRemindResponseBean.repeatType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) alertRemindResponseBean.promptThreshold, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, alertRemindResponseBean.promptThreshold);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || alertRemindResponseBean.modifyTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 8, alertRemindResponseBean.modifyTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || alertRemindResponseBean.active != 1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 9, alertRemindResponseBean.active);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) alertRemindResponseBean.customMsg, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, alertRemindResponseBean.customMsg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) alertRemindResponseBean.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, alertRemindResponseBean.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) alertRemindResponseBean.token, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, alertRemindResponseBean.token);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) alertRemindResponseBean.tokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, alertRemindResponseBean.tokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) alertRemindResponseBean.chainLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, alertRemindResponseBean.chainLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) alertRemindResponseBean.tokenLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, alertRemindResponseBean.tokenLogoUrl);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) && alertRemindResponseBean.percentageTime == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 16, alertRemindResponseBean.percentageTime);
    }

    public AlertRemindResponseBean(long j, int i, int i2, @NotNull String str, @NotNull String str2, int i3, int i4, @NotNull String str3, long j2, int i5, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, int i6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.ruleId = j;
        this.sourceType = i;
        this.bizType = i2;
        this.instrumentName = str;
        this.displayId = str2;
        this.promptType = i3;
        this.repeatType = i4;
        this.promptThreshold = str3;
        this.modifyTime = j2;
        this.active = i5;
        this.customMsg = str4;
        this.chainId = str5;
        this.token = str6;
        this.tokenAddress = str7;
        this.chainLogoUrl = str8;
        this.tokenLogoUrl = str9;
        this.percentageTime = i6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00c0: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r39v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r20v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000c: ARITH (r39v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r22v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0014: ARITH (r39v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r23v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r39v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r39v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x002e: ARITH (r39v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r26v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0036: ARITH (r39v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r27v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r39v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0046: ARITH (r39v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r29v0 long) : (0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x004d: ARITH (r39v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r31v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r39v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005d: ARITH (r39v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:0x0070: TERNARY null = ((wrap:int:0x0067: ARITH (r39v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:0x007b: TERNARY null = ((wrap:int:0x0072: ARITH (r39v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007d: ARITH (r39v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0089: ARITH (r39v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0094: ARITH (r39v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r38v0 int))
 A[MD:(long, int, int, java.lang.String, java.lang.String, int, int, java.lang.String, long, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void (m)] (LINE:11) call: com.okinc.crcore.coreapi.net.responsebean.AlertRemindResponseBean.<init>(long, int, int, java.lang.String, java.lang.String, int, int, java.lang.String, long, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void type: THIS */
    public /* synthetic */ AlertRemindResponseBean(long j, int i, int i2, String str, String str2, int i3, int i4, String str3, long j2, int i5, String str4, String str5, String str6, String str7, String str8, String str9, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0L : j, (i7 & 2) != 0 ? 0 : i, (i7 & 4) != 0 ? 0 : i2, (i7 & 8) != 0 ? "" : str, (i7 & 16) != 0 ? "" : str2, (i7 & 32) != 0 ? 0 : i3, (i7 & 64) != 0 ? 0 : i4, (i7 & 128) != 0 ? "" : str3, (i7 & 256) == 0 ? j2 : 0L, (i7 & 512) != 0 ? 1 : i5, (i7 & 1024) != 0 ? "" : str4, (i7 & 2048) != 0 ? "" : str5, (i7 & 4096) != 0 ? "" : str6, (i7 & 8192) != 0 ? "" : str7, (i7 & 16384) != 0 ? "" : str8, (i7 & 32768) != 0 ? "" : str9, (i7 & 65536) != 0 ? 0 : i6);
    }
}
