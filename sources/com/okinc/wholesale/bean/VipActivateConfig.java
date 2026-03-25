package com.okinc.wholesale.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class VipActivateConfig implements Parcelable {
    private int activateState;
    private String avatarUrl;
    private String feePercentage;
    private String inviteCode;
    private String inviterName;
    private boolean isFromLanding;
    private String nickName;
    private String qrCodeUrl;
    private String trialDays;
    private String uid;
    private Integer vipLevel;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<VipActivateConfig> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<VipActivateConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VipActivateConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new VipActivateConfig(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VipActivateConfig[] newArray(int i) {
            return new VipActivateConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.inviteCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.nickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.qrCodeUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.uid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.vipLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.inviterName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.feePercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.trialDays;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.activateState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.isFromLanding;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.avatarUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VipActivateConfig copy(@NotNull String str, String str2, Integer num, String str3, String str4, String str5, int i, boolean z, String str6, String str7, String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        return new VipActivateConfig(str, str2, num, str3, str4, str5, i, z, str6, str7, str8);
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
        if (!(obj instanceof VipActivateConfig)) {
            return false;
        }
        VipActivateConfig vipActivateConfig = (VipActivateConfig) obj;
        return Intrinsics.EZpvd((Object) this.inviteCode, (Object) vipActivateConfig.inviteCode) && Intrinsics.EZpvd((Object) this.uid, (Object) vipActivateConfig.uid) && Intrinsics.EZpvd(this.vipLevel, vipActivateConfig.vipLevel) && Intrinsics.EZpvd((Object) this.inviterName, (Object) vipActivateConfig.inviterName) && Intrinsics.EZpvd((Object) this.feePercentage, (Object) vipActivateConfig.feePercentage) && Intrinsics.EZpvd((Object) this.trialDays, (Object) vipActivateConfig.trialDays) && this.activateState == vipActivateConfig.activateState && this.isFromLanding == vipActivateConfig.isFromLanding && Intrinsics.EZpvd((Object) this.avatarUrl, (Object) vipActivateConfig.avatarUrl) && Intrinsics.EZpvd((Object) this.nickName, (Object) vipActivateConfig.nickName) && Intrinsics.EZpvd((Object) this.qrCodeUrl, (Object) vipActivateConfig.qrCodeUrl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getActivateState() {
        return this.activateState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeePercentage() {
        return this.feePercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInviteCode() {
        return this.inviteCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInviterName() {
        return this.inviterName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNickName() {
        return this.nickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQrCodeUrl() {
        return this.qrCodeUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTrialDays() {
        return this.trialDays;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUid() {
        return this.uid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getVipLevel() {
        return this.vipLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.inviteCode.hashCode();
        String str = this.uid;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Integer num = this.vipLevel;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        String str2 = this.inviterName;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.feePercentage;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.trialDays;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        int iHashCode7 = Integer.hashCode(this.activateState);
        int iHashCode8 = Boolean.hashCode(this.isFromLanding);
        String str5 = this.avatarUrl;
        int iHashCode9 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.nickName;
        int iHashCode10 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.qrCodeUrl;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isFromLanding() {
        return this.isFromLanding;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActivateState(int i) {
        this.activateState = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvatarUrl(String str) {
        this.avatarUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFeePercentage(String str) {
        this.feePercentage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFromLanding(boolean z) {
        this.isFromLanding = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInviteCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.inviteCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInviterName(String str) {
        this.inviterName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNickName(String str) {
        this.nickName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQrCodeUrl(String str) {
        this.qrCodeUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTrialDays(String str) {
        this.trialDays = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUid(String str) {
        this.uid = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVipLevel(Integer num) {
        this.vipLevel = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "VipActivateConfig(inviteCode=" + this.inviteCode + ", uid=" + this.uid + ", vipLevel=" + this.vipLevel + ", inviterName=" + this.inviterName + ", feePercentage=" + this.feePercentage + ", trialDays=" + this.trialDays + ", activateState=" + this.activateState + ", isFromLanding=" + this.isFromLanding + ", avatarUrl=" + this.avatarUrl + ", nickName=" + this.nickName + ", qrCodeUrl=" + this.qrCodeUrl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.inviteCode);
        parcel.writeString(this.uid);
        Integer num = this.vipLevel;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.inviterName);
        parcel.writeString(this.feePercentage);
        parcel.writeString(this.trialDays);
        parcel.writeInt(this.activateState);
        parcel.writeInt(this.isFromLanding ? 1 : 0);
        parcel.writeString(this.avatarUrl);
        parcel.writeString(this.nickName);
        parcel.writeString(this.qrCodeUrl);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wholesale.bean.VipActivateConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<VipActivateConfig> serializer() {
            return VipActivateConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ VipActivateConfig(int i, String str, String str2, Integer num, String str3, String str4, String str5, int i2, boolean z, String str6, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if (192 != (i & 192)) {
            PluginExceptionsKt.throwMissingFieldException(i, 192, VipActivateConfig$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.inviteCode = "";
        } else {
            this.inviteCode = str;
        }
        if ((i & 2) == 0) {
            this.uid = "";
        } else {
            this.uid = str2;
        }
        if ((i & 4) == 0) {
            this.vipLevel = 1;
        } else {
            this.vipLevel = num;
        }
        if ((i & 8) == 0) {
            this.inviterName = "";
        } else {
            this.inviterName = str3;
        }
        if ((i & 16) == 0) {
            this.feePercentage = "";
        } else {
            this.feePercentage = str4;
        }
        if ((i & 32) == 0) {
            this.trialDays = "";
        } else {
            this.trialDays = str5;
        }
        this.activateState = i2;
        this.isFromLanding = z;
        if ((i & 256) == 0) {
            this.avatarUrl = "";
        } else {
            this.avatarUrl = str6;
        }
        if ((i & 512) == 0) {
            this.nickName = "";
        } else {
            this.nickName = str7;
        }
        if ((i & 1024) == 0) {
            this.qrCodeUrl = "";
        } else {
            this.qrCodeUrl = str8;
        }
    }

    public static final /* synthetic */ void write$Self$OKGrowthTools_biz_rewards(VipActivateConfig vipActivateConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) vipActivateConfig.inviteCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, vipActivateConfig.inviteCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) vipActivateConfig.uid, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, vipActivateConfig.uid);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || (num = vipActivateConfig.vipLevel) == null || num.intValue() != 1) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, vipActivateConfig.vipLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) vipActivateConfig.inviterName, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, vipActivateConfig.inviterName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) vipActivateConfig.feePercentage, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, vipActivateConfig.feePercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) vipActivateConfig.trialDays, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, vipActivateConfig.trialDays);
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 6, vipActivateConfig.activateState);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 7, vipActivateConfig.isFromLanding);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) vipActivateConfig.avatarUrl, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, vipActivateConfig.avatarUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) vipActivateConfig.nickName, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, vipActivateConfig.nickName);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && Intrinsics.EZpvd((Object) vipActivateConfig.qrCodeUrl, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, vipActivateConfig.qrCodeUrl);
    }

    public VipActivateConfig(@NotNull String str, String str2, Integer num, String str3, String str4, String str5, int i, boolean z, String str6, String str7, String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        this.inviteCode = str;
        this.uid = str2;
        this.vipLevel = num;
        this.inviterName = str3;
        this.feePercentage = str4;
        this.trialDays = str5;
        this.activateState = i;
        this.isFromLanding = z;
        this.avatarUrl = str6;
        this.nickName = str7;
        this.qrCodeUrl = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0056: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r27v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r27v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0014: ARITH (r27v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r18v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r27v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r27v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r27v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (r22v0 int)
  (r23v0 boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r27v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0041: ARITH (r27v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r27v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, int, boolean, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:18) call: com.okinc.wholesale.bean.VipActivateConfig.<init>(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, int, boolean, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ VipActivateConfig(String str, String str2, Integer num, String str3, String str4, String str5, int i, boolean z, String str6, String str7, String str8, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 1 : num, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, i, z, (i2 & 256) != 0 ? "" : str6, (i2 & 512) != 0 ? "" : str7, (i2 & 1024) != 0 ? "" : str8);
    }
}
