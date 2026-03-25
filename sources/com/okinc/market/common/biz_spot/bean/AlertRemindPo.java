package com.okinc.market.common.biz_spot.bean;

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

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class AlertRemindPo implements Parcelable {
    private int active;
    private int bizType;
    private String chainId;
    private String chainLogoUrl;
    private String condition1;
    private String condition2;
    private String customMsg;
    private String displayId;
    private String indicatorType;
    private String instrumentName;
    private long modifyTime;
    private int percentageTime;
    private int presetCondition;
    private String promptThreshold;
    private int promptType;
    private int repeatType;
    private long ruleId;
    private String signalType;
    private int sourceType;
    private int timePeriod;
    private String token;
    private String tokenAddress;
    private String tokenLogoUrl;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AlertRemindPo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AlertRemindPo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AlertRemindPo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AlertRemindPo(parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readLong(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AlertRemindPo[] newArray(int i) {
            return new AlertRemindPo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AlertRemindPo() {
        this(0L, 0, 0, (String) null, (String) null, 0, 0, (String) null, 0L, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, (String) null, (String) null, (String) null, (String) null, 0, 8388607, (DefaultConstructorMarker) null);
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
    public final int component18() {
        return this.timePeriod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.indicatorType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.sourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.signalType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.condition1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.condition2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component23() {
        return this.presetCondition;
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
    public final AlertRemindPo copy(long j, int i, int i2, @NotNull String str, @NotNull String str2, int i3, int i4, @NotNull String str3, long j2, int i5, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, int i6, int i7, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, int i8) {
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
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        return new AlertRemindPo(j, i, i2, str, str2, i3, i4, str3, j2, i5, str4, str5, str6, str7, str8, str9, i6, i7, str10, str11, str12, str13, i8);
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
        if (!(obj instanceof AlertRemindPo)) {
            return false;
        }
        AlertRemindPo alertRemindPo = (AlertRemindPo) obj;
        return this.ruleId == alertRemindPo.ruleId && this.sourceType == alertRemindPo.sourceType && this.bizType == alertRemindPo.bizType && Intrinsics.EZpvd((Object) this.instrumentName, (Object) alertRemindPo.instrumentName) && Intrinsics.EZpvd((Object) this.displayId, (Object) alertRemindPo.displayId) && this.promptType == alertRemindPo.promptType && this.repeatType == alertRemindPo.repeatType && Intrinsics.EZpvd((Object) this.promptThreshold, (Object) alertRemindPo.promptThreshold) && this.modifyTime == alertRemindPo.modifyTime && this.active == alertRemindPo.active && Intrinsics.EZpvd((Object) this.customMsg, (Object) alertRemindPo.customMsg) && Intrinsics.EZpvd((Object) this.chainId, (Object) alertRemindPo.chainId) && Intrinsics.EZpvd((Object) this.token, (Object) alertRemindPo.token) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) alertRemindPo.tokenAddress) && Intrinsics.EZpvd((Object) this.chainLogoUrl, (Object) alertRemindPo.chainLogoUrl) && Intrinsics.EZpvd((Object) this.tokenLogoUrl, (Object) alertRemindPo.tokenLogoUrl) && this.percentageTime == alertRemindPo.percentageTime && this.timePeriod == alertRemindPo.timePeriod && Intrinsics.EZpvd((Object) this.indicatorType, (Object) alertRemindPo.indicatorType) && Intrinsics.EZpvd((Object) this.signalType, (Object) alertRemindPo.signalType) && Intrinsics.EZpvd((Object) this.condition1, (Object) alertRemindPo.condition1) && Intrinsics.EZpvd((Object) this.condition2, (Object) alertRemindPo.condition2) && this.presetCondition == alertRemindPo.presetCondition;
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
    public final String getCondition1() {
        return this.condition1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCondition2() {
        return this.condition2;
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
    public final String getIndicatorType() {
        return this.indicatorType;
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
    public final int getPresetCondition() {
        return this.presetCondition;
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
    public final String getSignalType() {
        return this.signalType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSourceType() {
        return this.sourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTimePeriod() {
        return this.timePeriod;
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
        return (((((((((((((((((((((((((((((((((((((((((((Long.hashCode(this.ruleId) * 31) + Integer.hashCode(this.sourceType)) * 31) + Integer.hashCode(this.bizType)) * 31) + this.instrumentName.hashCode()) * 31) + this.displayId.hashCode()) * 31) + Integer.hashCode(this.promptType)) * 31) + Integer.hashCode(this.repeatType)) * 31) + this.promptThreshold.hashCode()) * 31) + Long.hashCode(this.modifyTime)) * 31) + Integer.hashCode(this.active)) * 31) + this.customMsg.hashCode()) * 31) + this.chainId.hashCode()) * 31) + this.token.hashCode()) * 31) + this.tokenAddress.hashCode()) * 31) + this.chainLogoUrl.hashCode()) * 31) + this.tokenLogoUrl.hashCode()) * 31) + Integer.hashCode(this.percentageTime)) * 31) + Integer.hashCode(this.timePeriod)) * 31) + this.indicatorType.hashCode()) * 31) + this.signalType.hashCode()) * 31) + this.condition1.hashCode()) * 31) + this.condition2.hashCode()) * 31) + Integer.hashCode(this.presetCondition);
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
    public final void setCondition1(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.condition1 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCondition2(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.condition2 = str;
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
    public final void setIndicatorType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.indicatorType = str;
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
    public final void setPresetCondition(int i) {
        this.presetCondition = i;
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
    public final void setSignalType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.signalType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSourceType(int i) {
        this.sourceType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTimePeriod(int i) {
        this.timePeriod = i;
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
        return "AlertRemindPo(ruleId=" + this.ruleId + ", sourceType=" + this.sourceType + ", bizType=" + this.bizType + ", instrumentName=" + this.instrumentName + ", displayId=" + this.displayId + ", promptType=" + this.promptType + ", repeatType=" + this.repeatType + ", promptThreshold=" + this.promptThreshold + ", modifyTime=" + this.modifyTime + ", active=" + this.active + ", customMsg=" + this.customMsg + ", chainId=" + this.chainId + ", token=" + this.token + ", tokenAddress=" + this.tokenAddress + ", chainLogoUrl=" + this.chainLogoUrl + ", tokenLogoUrl=" + this.tokenLogoUrl + ", percentageTime=" + this.percentageTime + ", timePeriod=" + this.timePeriod + ", indicatorType=" + this.indicatorType + ", signalType=" + this.signalType + ", condition1=" + this.condition1 + ", condition2=" + this.condition2 + ", presetCondition=" + this.presetCondition + ")";
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
        parcel.writeInt(this.timePeriod);
        parcel.writeString(this.indicatorType);
        parcel.writeString(this.signalType);
        parcel.writeString(this.condition1);
        parcel.writeString(this.condition2);
        parcel.writeInt(this.presetCondition);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.market.common.biz_spot.bean.AlertRemindPo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AlertRemindPo> serializer() {
            return AlertRemindPo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AlertRemindPo(int i, long j, int i2, int i3, String str, String str2, int i4, int i5, String str3, long j2, int i6, String str4, String str5, String str6, String str7, String str8, String str9, int i7, int i8, String str10, String str11, String str12, String str13, int i9, SerializationConstructorMarker serializationConstructorMarker) {
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
        if ((i & 512) == 0) {
            this.active = 1;
        } else {
            this.active = i6;
        }
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
        if ((65536 & i) == 0) {
            this.percentageTime = 0;
        } else {
            this.percentageTime = i7;
        }
        if ((131072 & i) == 0) {
            this.timePeriod = 1;
        } else {
            this.timePeriod = i8;
        }
        if ((262144 & i) == 0) {
            this.indicatorType = "";
        } else {
            this.indicatorType = str10;
        }
        if ((524288 & i) == 0) {
            this.signalType = "";
        } else {
            this.signalType = str11;
        }
        if ((1048576 & i) == 0) {
            this.condition1 = "";
        } else {
            this.condition1 = str12;
        }
        if ((2097152 & i) == 0) {
            this.condition2 = "";
        } else {
            this.condition2 = str13;
        }
        if ((i & 4194304) == 0) {
            this.presetCondition = 0;
        } else {
            this.presetCondition = i9;
        }
    }

    public static final /* synthetic */ void write$Self$OKMarket_market_api(AlertRemindPo alertRemindPo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || alertRemindPo.ruleId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, alertRemindPo.ruleId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || alertRemindPo.sourceType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, alertRemindPo.sourceType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || alertRemindPo.bizType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, alertRemindPo.bizType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) alertRemindPo.instrumentName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, alertRemindPo.instrumentName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) alertRemindPo.displayId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, alertRemindPo.displayId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || alertRemindPo.promptType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 5, alertRemindPo.promptType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || alertRemindPo.repeatType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 6, alertRemindPo.repeatType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) alertRemindPo.promptThreshold, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, alertRemindPo.promptThreshold);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || alertRemindPo.modifyTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 8, alertRemindPo.modifyTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || alertRemindPo.active != 1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 9, alertRemindPo.active);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) alertRemindPo.customMsg, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, alertRemindPo.customMsg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) alertRemindPo.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, alertRemindPo.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) alertRemindPo.token, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, alertRemindPo.token);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) alertRemindPo.tokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, alertRemindPo.tokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) alertRemindPo.chainLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, alertRemindPo.chainLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) alertRemindPo.tokenLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, alertRemindPo.tokenLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || alertRemindPo.percentageTime != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 16, alertRemindPo.percentageTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || alertRemindPo.timePeriod != 1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 17, alertRemindPo.timePeriod);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) alertRemindPo.indicatorType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, alertRemindPo.indicatorType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) alertRemindPo.signalType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, alertRemindPo.signalType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) alertRemindPo.condition1, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, alertRemindPo.condition1);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) alertRemindPo.condition2, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, alertRemindPo.condition2);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) && alertRemindPo.presetCondition == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 22, alertRemindPo.presetCondition);
    }

    public AlertRemindPo(long j, int i, int i2, @NotNull String str, @NotNull String str2, int i3, int i4, @NotNull String str3, long j2, int i5, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, int i6, int i7, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, int i8) {
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
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
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
        this.timePeriod = i7;
        this.indicatorType = str10;
        this.signalType = str11;
        this.condition1 = str12;
        this.condition2 = str13;
        this.presetCondition = i8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x010e: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r51v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r26v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000c: ARITH (r51v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r28v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0014: ARITH (r51v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r29v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r51v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r51v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x002e: ARITH (r51v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r32v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0036: ARITH (r51v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r33v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r51v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0046: ARITH (r51v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r35v0 long) : (0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x004d: ARITH (r51v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r37v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r51v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005d: ARITH (r51v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:0x0070: TERNARY null = ((wrap:int:0x0067: ARITH (r51v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:0x007b: TERNARY null = ((wrap:int:0x0072: ARITH (r51v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007d: ARITH (r51v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0089: ARITH (r51v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0094: ARITH (r51v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r44v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x009f: ARITH (r51v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r45v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00aa: ARITH (r51v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b5: ARITH (r51v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c0: ARITH (r51v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00cb: ARITH (r51v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00d6: ARITH (r51v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r50v0 int))
 A[MD:(long, int, int, java.lang.String, java.lang.String, int, int, java.lang.String, long, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void (m)] (LINE:21) call: com.okinc.market.common.biz_spot.bean.AlertRemindPo.<init>(long, int, int, java.lang.String, java.lang.String, int, int, java.lang.String, long, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void type: THIS */
    public /* synthetic */ AlertRemindPo(long j, int i, int i2, String str, String str2, int i3, int i4, String str3, long j2, int i5, String str4, String str5, String str6, String str7, String str8, String str9, int i6, int i7, String str10, String str11, String str12, String str13, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? 0L : j, (i9 & 2) != 0 ? 0 : i, (i9 & 4) != 0 ? 0 : i2, (i9 & 8) != 0 ? "" : str, (i9 & 16) != 0 ? "" : str2, (i9 & 32) != 0 ? 0 : i3, (i9 & 64) != 0 ? 0 : i4, (i9 & 128) != 0 ? "" : str3, (i9 & 256) == 0 ? j2 : 0L, (i9 & 512) != 0 ? 1 : i5, (i9 & 1024) != 0 ? "" : str4, (i9 & 2048) != 0 ? "" : str5, (i9 & 4096) != 0 ? "" : str6, (i9 & 8192) != 0 ? "" : str7, (i9 & 16384) != 0 ? "" : str8, (i9 & 32768) != 0 ? "" : str9, (i9 & 65536) != 0 ? 0 : i6, (i9 & 131072) != 0 ? 1 : i7, (i9 & 262144) != 0 ? "" : str10, (i9 & 524288) != 0 ? "" : str11, (i9 & 1048576) != 0 ? "" : str12, (i9 & 2097152) != 0 ? "" : str13, (i9 & 4194304) != 0 ? 0 : i8);
    }
}
