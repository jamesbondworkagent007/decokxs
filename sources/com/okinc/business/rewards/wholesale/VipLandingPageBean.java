package com.okinc.business.rewards.wholesale;

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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class VipLandingPageBean implements Parcelable {
    public static final int $stable = 0;
    private final String bizId;
    private final VipLandingPageButton button;
    private final String discountPercentage;
    private final VipLandingPageShareInfo shareInfo;
    private final String userUid;
    private final Integer vipLevel;
    private final String vipLevelName;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<VipLandingPageBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<VipLandingPageBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VipLandingPageBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new VipLandingPageBean(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), VipLandingPageButton.CREATOR.createFromParcel(parcel), VipLandingPageShareInfo.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VipLandingPageBean[] newArray(int i) {
            return new VipLandingPageBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ VipLandingPageBean copy$default(VipLandingPageBean vipLandingPageBean, Integer num, String str, String str2, String str3, String str4, VipLandingPageButton vipLandingPageButton, VipLandingPageShareInfo vipLandingPageShareInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            num = vipLandingPageBean.vipLevel;
        }
        if ((i & 2) != 0) {
            str = vipLandingPageBean.vipLevelName;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = vipLandingPageBean.userUid;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = vipLandingPageBean.bizId;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = vipLandingPageBean.discountPercentage;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            vipLandingPageButton = vipLandingPageBean.button;
        }
        VipLandingPageButton vipLandingPageButton2 = vipLandingPageButton;
        if ((i & 64) != 0) {
            vipLandingPageShareInfo = vipLandingPageBean.shareInfo;
        }
        return vipLandingPageBean.copy(num, str5, str6, str7, str8, vipLandingPageButton2, vipLandingPageShareInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.vipLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.vipLevelName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.userUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.bizId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.discountPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VipLandingPageButton component6() {
        return this.button;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VipLandingPageShareInfo component7() {
        return this.shareInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VipLandingPageBean copy(Integer num, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull VipLandingPageButton vipLandingPageButton, @NotNull VipLandingPageShareInfo vipLandingPageShareInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(vipLandingPageButton, "");
        Intrinsics.checkNotNullParameter(vipLandingPageShareInfo, "");
        return new VipLandingPageBean(num, str, str2, str3, str4, vipLandingPageButton, vipLandingPageShareInfo);
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
        if (!(obj instanceof VipLandingPageBean)) {
            return false;
        }
        VipLandingPageBean vipLandingPageBean = (VipLandingPageBean) obj;
        return Intrinsics.EZpvd(this.vipLevel, vipLandingPageBean.vipLevel) && Intrinsics.EZpvd((Object) this.vipLevelName, (Object) vipLandingPageBean.vipLevelName) && Intrinsics.EZpvd((Object) this.userUid, (Object) vipLandingPageBean.userUid) && Intrinsics.EZpvd((Object) this.bizId, (Object) vipLandingPageBean.bizId) && Intrinsics.EZpvd((Object) this.discountPercentage, (Object) vipLandingPageBean.discountPercentage) && Intrinsics.EZpvd(this.button, vipLandingPageBean.button) && Intrinsics.EZpvd(this.shareInfo, vipLandingPageBean.shareInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizId() {
        return this.bizId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VipLandingPageButton getButton() {
        return this.button;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDiscountPercentage() {
        return this.discountPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VipLandingPageShareInfo getShareInfo() {
        return this.shareInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserUid() {
        return this.userUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getVipLevel() {
        return this.vipLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVipLevelName() {
        return this.vipLevelName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.vipLevel;
        return ((((((((((((num == null ? 0 : num.hashCode()) * 31) + this.vipLevelName.hashCode()) * 31) + this.userUid.hashCode()) * 31) + this.bizId.hashCode()) * 31) + this.discountPercentage.hashCode()) * 31) + this.button.hashCode()) * 31) + this.shareInfo.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "VipLandingPageBean(vipLevel=" + this.vipLevel + ", vipLevelName=" + this.vipLevelName + ", userUid=" + this.userUid + ", bizId=" + this.bizId + ", discountPercentage=" + this.discountPercentage + ", button=" + this.button + ", shareInfo=" + this.shareInfo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.vipLevel;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.vipLevelName);
        parcel.writeString(this.userUid);
        parcel.writeString(this.bizId);
        parcel.writeString(this.discountPercentage);
        this.button.writeToParcel(parcel, i);
        this.shareInfo.writeToParcel(parcel, i);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.rewards.wholesale.VipLandingPageBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<VipLandingPageBean> serializer() {
            return VipLandingPageBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ VipLandingPageBean(int i, Integer num, String str, String str2, String str3, String str4, VipLandingPageButton vipLandingPageButton, VipLandingPageShareInfo vipLandingPageShareInfo, SerializationConstructorMarker serializationConstructorMarker) {
        if (96 != (i & 96)) {
            PluginExceptionsKt.throwMissingFieldException(i, 96, VipLandingPageBean$$serializer.INSTANCE.getDescriptor());
        }
        this.vipLevel = (i & 1) == 0 ? 0 : num;
        if ((i & 2) == 0) {
            this.vipLevelName = "";
        } else {
            this.vipLevelName = str;
        }
        if ((i & 4) == 0) {
            this.userUid = "";
        } else {
            this.userUid = str2;
        }
        if ((i & 8) == 0) {
            this.bizId = "";
        } else {
            this.bizId = str3;
        }
        if ((i & 16) == 0) {
            this.discountPercentage = "";
        } else {
            this.discountPercentage = str4;
        }
        this.button = vipLandingPageButton;
        this.shareInfo = vipLandingPageShareInfo;
    }

    public static final /* synthetic */ void write$Self$OKGrowthTools_rewards_api(VipLandingPageBean vipLandingPageBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || (num = vipLandingPageBean.vipLevel) == null || num.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, vipLandingPageBean.vipLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) vipLandingPageBean.vipLevelName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, vipLandingPageBean.vipLevelName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) vipLandingPageBean.userUid, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, vipLandingPageBean.userUid);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) vipLandingPageBean.bizId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, vipLandingPageBean.bizId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) vipLandingPageBean.discountPercentage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, vipLandingPageBean.discountPercentage);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 5, VipLandingPageButton$$serializer.INSTANCE, vipLandingPageBean.button);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 6, VipLandingPageShareInfo$$serializer.INSTANCE, vipLandingPageBean.shareInfo);
    }

    public VipLandingPageBean(Integer num, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull VipLandingPageButton vipLandingPageButton, @NotNull VipLandingPageShareInfo vipLandingPageShareInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(vipLandingPageButton, "");
        Intrinsics.checkNotNullParameter(vipLandingPageShareInfo, "");
        this.vipLevel = num;
        this.vipLevelName = str;
        this.userUid = str2;
        this.bizId = str3;
        this.discountPercentage = str4;
        this.button = vipLandingPageButton;
        this.shareInfo = vipLandingPageShareInfo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002e: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r10v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r17v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r17v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r17v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r17v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (r15v0 com.okinc.business.rewards.wholesale.VipLandingPageButton)
  (r16v0 com.okinc.business.rewards.wholesale.VipLandingPageShareInfo)
 A[MD:(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.rewards.wholesale.VipLandingPageButton, com.okinc.business.rewards.wholesale.VipLandingPageShareInfo):void (m)] (LINE:15) call: com.okinc.business.rewards.wholesale.VipLandingPageBean.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.rewards.wholesale.VipLandingPageButton, com.okinc.business.rewards.wholesale.VipLandingPageShareInfo):void type: THIS */
    public /* synthetic */ VipLandingPageBean(Integer num, String str, String str2, String str3, String str4, VipLandingPageButton vipLandingPageButton, VipLandingPageShareInfo vipLandingPageShareInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, vipLandingPageButton, vipLandingPageShareInfo);
    }
}
