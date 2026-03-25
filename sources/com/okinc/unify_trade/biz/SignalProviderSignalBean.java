package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class SignalProviderSignalBean implements Parcelable {
    private final String accumulatedProfitSharing;
    private final String accumulatedSubscriptionAmount;
    private final String approvalStatus;
    private final String cTime;
    private final String estimatedProfitSharing;
    private final String estimatedSubscriptionAmount;
    private final String freeFollowerAssets;
    private final String freeFollowerCount;
    private final String instIds;
    private final String profitSharingCcy;
    private final String profitSharingFollowerAssets;
    private final String profitSharingFollowerCount;
    private final String profitSharingRatio;
    private String recommendInvestAmount;
    private String recommendLeverage;
    private final String signalChanId;
    private final String signalChanName;
    private final String signalDescription;
    private final String subscriptionFee;
    private final String subscriptionFeeCcy;
    private final String subscriptionFollowerAssets;
    private final String subscriptionFollowerCount;
    private final String subscriptionType;
    private final String totalFollowerCount;
    private final String uTime;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SignalProviderSignalBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SignalProviderSignalBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalProviderSignalBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SignalProviderSignalBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalProviderSignalBean[] newArray(int i) {
            return new SignalProviderSignalBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignalProviderSignalBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 33554431, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accumulatedProfitSharing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.profitSharingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.signalChanId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.signalDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.signalChanName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.subscriptionFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.subscriptionFeeCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.subscriptionFollowerAssets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.subscriptionFollowerCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.subscriptionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.totalFollowerCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.accumulatedSubscriptionAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.uTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.freeFollowerAssets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.freeFollowerCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.instIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.recommendInvestAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.recommendLeverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.approvalStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.estimatedProfitSharing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.estimatedSubscriptionAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.profitSharingCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.profitSharingFollowerAssets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.profitSharingFollowerCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalProviderSignalBean copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, @NotNull String str12, @NotNull String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25) {
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        return new SignalProviderSignalBean(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25);
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
        if (!(obj instanceof SignalProviderSignalBean)) {
            return false;
        }
        SignalProviderSignalBean signalProviderSignalBean = (SignalProviderSignalBean) obj;
        return Intrinsics.EZpvd((Object) this.accumulatedProfitSharing, (Object) signalProviderSignalBean.accumulatedProfitSharing) && Intrinsics.EZpvd((Object) this.accumulatedSubscriptionAmount, (Object) signalProviderSignalBean.accumulatedSubscriptionAmount) && Intrinsics.EZpvd((Object) this.approvalStatus, (Object) signalProviderSignalBean.approvalStatus) && Intrinsics.EZpvd((Object) this.cTime, (Object) signalProviderSignalBean.cTime) && Intrinsics.EZpvd((Object) this.estimatedProfitSharing, (Object) signalProviderSignalBean.estimatedProfitSharing) && Intrinsics.EZpvd((Object) this.estimatedSubscriptionAmount, (Object) signalProviderSignalBean.estimatedSubscriptionAmount) && Intrinsics.EZpvd((Object) this.profitSharingCcy, (Object) signalProviderSignalBean.profitSharingCcy) && Intrinsics.EZpvd((Object) this.profitSharingFollowerAssets, (Object) signalProviderSignalBean.profitSharingFollowerAssets) && Intrinsics.EZpvd((Object) this.profitSharingFollowerCount, (Object) signalProviderSignalBean.profitSharingFollowerCount) && Intrinsics.EZpvd((Object) this.profitSharingRatio, (Object) signalProviderSignalBean.profitSharingRatio) && Intrinsics.EZpvd((Object) this.signalChanId, (Object) signalProviderSignalBean.signalChanId) && Intrinsics.EZpvd((Object) this.signalDescription, (Object) signalProviderSignalBean.signalDescription) && Intrinsics.EZpvd((Object) this.signalChanName, (Object) signalProviderSignalBean.signalChanName) && Intrinsics.EZpvd((Object) this.subscriptionFee, (Object) signalProviderSignalBean.subscriptionFee) && Intrinsics.EZpvd((Object) this.subscriptionFeeCcy, (Object) signalProviderSignalBean.subscriptionFeeCcy) && Intrinsics.EZpvd((Object) this.subscriptionFollowerAssets, (Object) signalProviderSignalBean.subscriptionFollowerAssets) && Intrinsics.EZpvd((Object) this.subscriptionFollowerCount, (Object) signalProviderSignalBean.subscriptionFollowerCount) && Intrinsics.EZpvd((Object) this.subscriptionType, (Object) signalProviderSignalBean.subscriptionType) && Intrinsics.EZpvd((Object) this.totalFollowerCount, (Object) signalProviderSignalBean.totalFollowerCount) && Intrinsics.EZpvd((Object) this.uTime, (Object) signalProviderSignalBean.uTime) && Intrinsics.EZpvd((Object) this.freeFollowerAssets, (Object) signalProviderSignalBean.freeFollowerAssets) && Intrinsics.EZpvd((Object) this.freeFollowerCount, (Object) signalProviderSignalBean.freeFollowerCount) && Intrinsics.EZpvd((Object) this.instIds, (Object) signalProviderSignalBean.instIds) && Intrinsics.EZpvd((Object) this.recommendInvestAmount, (Object) signalProviderSignalBean.recommendInvestAmount) && Intrinsics.EZpvd((Object) this.recommendLeverage, (Object) signalProviderSignalBean.recommendLeverage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccumulatedProfitSharing() {
        return this.accumulatedProfitSharing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccumulatedSubscriptionAmount() {
        return this.accumulatedSubscriptionAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApprovalStatus() {
        return this.approvalStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCTime() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimatedProfitSharing() {
        return this.estimatedProfitSharing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimatedSubscriptionAmount() {
        return this.estimatedSubscriptionAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFreeFollowerAssets() {
        return this.freeFollowerAssets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFreeFollowerCount() {
        return this.freeFollowerCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstIds() {
        return this.instIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProfitSharingCcy() {
        return this.profitSharingCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProfitSharingFollowerAssets() {
        return this.profitSharingFollowerAssets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProfitSharingFollowerCount() {
        return this.profitSharingFollowerCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProfitSharingRatio() {
        return this.profitSharingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRecommendInvestAmount() {
        return this.recommendInvestAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRecommendLeverage() {
        return this.recommendLeverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignalChanId() {
        return this.signalChanId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignalChanName() {
        return this.signalChanName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignalDescription() {
        return this.signalDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubscriptionFee() {
        return this.subscriptionFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubscriptionFeeCcy() {
        return this.subscriptionFeeCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubscriptionFollowerAssets() {
        return this.subscriptionFollowerAssets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubscriptionFollowerCount() {
        return this.subscriptionFollowerCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubscriptionType() {
        return this.subscriptionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalFollowerCount() {
        return this.totalFollowerCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUTime() {
        return this.uTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.accumulatedProfitSharing;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.accumulatedSubscriptionAmount;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.approvalStatus;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.cTime;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.estimatedProfitSharing;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.estimatedSubscriptionAmount;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.profitSharingCcy;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.profitSharingFollowerAssets;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.profitSharingFollowerCount;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.profitSharingRatio;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.signalChanId;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        int iHashCode12 = this.signalDescription.hashCode();
        int iHashCode13 = this.signalChanName.hashCode();
        String str12 = this.subscriptionFee;
        int iHashCode14 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.subscriptionFeeCcy;
        int iHashCode15 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.subscriptionFollowerAssets;
        int iHashCode16 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.subscriptionFollowerCount;
        int iHashCode17 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.subscriptionType;
        int iHashCode18 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.totalFollowerCount;
        int iHashCode19 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.uTime;
        int iHashCode20 = str18 == null ? 0 : str18.hashCode();
        String str19 = this.freeFollowerAssets;
        int iHashCode21 = str19 == null ? 0 : str19.hashCode();
        String str20 = this.freeFollowerCount;
        int iHashCode22 = str20 == null ? 0 : str20.hashCode();
        String str21 = this.instIds;
        int iHashCode23 = str21 == null ? 0 : str21.hashCode();
        String str22 = this.recommendInvestAmount;
        int iHashCode24 = str22 == null ? 0 : str22.hashCode();
        String str23 = this.recommendLeverage;
        return (((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + (str23 == null ? 0 : str23.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRecommendInvestAmount(String str) {
        this.recommendInvestAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRecommendLeverage(String str) {
        this.recommendLeverage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalProviderSignalBean(accumulatedProfitSharing=" + this.accumulatedProfitSharing + ", accumulatedSubscriptionAmount=" + this.accumulatedSubscriptionAmount + ", approvalStatus=" + this.approvalStatus + ", cTime=" + this.cTime + ", estimatedProfitSharing=" + this.estimatedProfitSharing + ", estimatedSubscriptionAmount=" + this.estimatedSubscriptionAmount + ", profitSharingCcy=" + this.profitSharingCcy + ", profitSharingFollowerAssets=" + this.profitSharingFollowerAssets + ", profitSharingFollowerCount=" + this.profitSharingFollowerCount + ", profitSharingRatio=" + this.profitSharingRatio + ", signalChanId=" + this.signalChanId + ", signalDescription=" + this.signalDescription + ", signalChanName=" + this.signalChanName + ", subscriptionFee=" + this.subscriptionFee + ", subscriptionFeeCcy=" + this.subscriptionFeeCcy + ", subscriptionFollowerAssets=" + this.subscriptionFollowerAssets + ", subscriptionFollowerCount=" + this.subscriptionFollowerCount + ", subscriptionType=" + this.subscriptionType + ", totalFollowerCount=" + this.totalFollowerCount + ", uTime=" + this.uTime + ", freeFollowerAssets=" + this.freeFollowerAssets + ", freeFollowerCount=" + this.freeFollowerCount + ", instIds=" + this.instIds + ", recommendInvestAmount=" + this.recommendInvestAmount + ", recommendLeverage=" + this.recommendLeverage + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.accumulatedProfitSharing);
        parcel.writeString(this.accumulatedSubscriptionAmount);
        parcel.writeString(this.approvalStatus);
        parcel.writeString(this.cTime);
        parcel.writeString(this.estimatedProfitSharing);
        parcel.writeString(this.estimatedSubscriptionAmount);
        parcel.writeString(this.profitSharingCcy);
        parcel.writeString(this.profitSharingFollowerAssets);
        parcel.writeString(this.profitSharingFollowerCount);
        parcel.writeString(this.profitSharingRatio);
        parcel.writeString(this.signalChanId);
        parcel.writeString(this.signalDescription);
        parcel.writeString(this.signalChanName);
        parcel.writeString(this.subscriptionFee);
        parcel.writeString(this.subscriptionFeeCcy);
        parcel.writeString(this.subscriptionFollowerAssets);
        parcel.writeString(this.subscriptionFollowerCount);
        parcel.writeString(this.subscriptionType);
        parcel.writeString(this.totalFollowerCount);
        parcel.writeString(this.uTime);
        parcel.writeString(this.freeFollowerAssets);
        parcel.writeString(this.freeFollowerCount);
        parcel.writeString(this.instIds);
        parcel.writeString(this.recommendInvestAmount);
        parcel.writeString(this.recommendLeverage);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SignalProviderSignalBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SignalProviderSignalBean> serializer() {
            return SignalProviderSignalBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SignalProviderSignalBean(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.accumulatedProfitSharing = null;
        } else {
            this.accumulatedProfitSharing = str;
        }
        if ((i & 2) == 0) {
            this.accumulatedSubscriptionAmount = null;
        } else {
            this.accumulatedSubscriptionAmount = str2;
        }
        if ((i & 4) == 0) {
            this.approvalStatus = null;
        } else {
            this.approvalStatus = str3;
        }
        if ((i & 8) == 0) {
            this.cTime = null;
        } else {
            this.cTime = str4;
        }
        if ((i & 16) == 0) {
            this.estimatedProfitSharing = null;
        } else {
            this.estimatedProfitSharing = str5;
        }
        if ((i & 32) == 0) {
            this.estimatedSubscriptionAmount = null;
        } else {
            this.estimatedSubscriptionAmount = str6;
        }
        if ((i & 64) == 0) {
            this.profitSharingCcy = null;
        } else {
            this.profitSharingCcy = str7;
        }
        if ((i & 128) == 0) {
            this.profitSharingFollowerAssets = null;
        } else {
            this.profitSharingFollowerAssets = str8;
        }
        if ((i & 256) == 0) {
            this.profitSharingFollowerCount = null;
        } else {
            this.profitSharingFollowerCount = str9;
        }
        if ((i & 512) == 0) {
            this.profitSharingRatio = null;
        } else {
            this.profitSharingRatio = str10;
        }
        if ((i & 1024) == 0) {
            this.signalChanId = null;
        } else {
            this.signalChanId = str11;
        }
        if ((i & 2048) == 0) {
            this.signalDescription = "";
        } else {
            this.signalDescription = str12;
        }
        if ((i & 4096) == 0) {
            this.signalChanName = "";
        } else {
            this.signalChanName = str13;
        }
        if ((i & 8192) == 0) {
            this.subscriptionFee = null;
        } else {
            this.subscriptionFee = str14;
        }
        if ((i & 16384) == 0) {
            this.subscriptionFeeCcy = null;
        } else {
            this.subscriptionFeeCcy = str15;
        }
        if ((32768 & i) == 0) {
            this.subscriptionFollowerAssets = null;
        } else {
            this.subscriptionFollowerAssets = str16;
        }
        if ((65536 & i) == 0) {
            this.subscriptionFollowerCount = null;
        } else {
            this.subscriptionFollowerCount = str17;
        }
        if ((131072 & i) == 0) {
            this.subscriptionType = null;
        } else {
            this.subscriptionType = str18;
        }
        if ((262144 & i) == 0) {
            this.totalFollowerCount = null;
        } else {
            this.totalFollowerCount = str19;
        }
        if ((524288 & i) == 0) {
            this.uTime = null;
        } else {
            this.uTime = str20;
        }
        if ((1048576 & i) == 0) {
            this.freeFollowerAssets = null;
        } else {
            this.freeFollowerAssets = str21;
        }
        if ((2097152 & i) == 0) {
            this.freeFollowerCount = null;
        } else {
            this.freeFollowerCount = str22;
        }
        if ((4194304 & i) == 0) {
            this.instIds = null;
        } else {
            this.instIds = str23;
        }
        if ((8388608 & i) == 0) {
            this.recommendInvestAmount = null;
        } else {
            this.recommendInvestAmount = str24;
        }
        if ((i & 16777216) == 0) {
            this.recommendLeverage = null;
        } else {
            this.recommendLeverage = str25;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SignalProviderSignalBean signalProviderSignalBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || signalProviderSignalBean.accumulatedProfitSharing != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, signalProviderSignalBean.accumulatedProfitSharing);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || signalProviderSignalBean.accumulatedSubscriptionAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, signalProviderSignalBean.accumulatedSubscriptionAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || signalProviderSignalBean.approvalStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, signalProviderSignalBean.approvalStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || signalProviderSignalBean.cTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, signalProviderSignalBean.cTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || signalProviderSignalBean.estimatedProfitSharing != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, signalProviderSignalBean.estimatedProfitSharing);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || signalProviderSignalBean.estimatedSubscriptionAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, signalProviderSignalBean.estimatedSubscriptionAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || signalProviderSignalBean.profitSharingCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, signalProviderSignalBean.profitSharingCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || signalProviderSignalBean.profitSharingFollowerAssets != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, signalProviderSignalBean.profitSharingFollowerAssets);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || signalProviderSignalBean.profitSharingFollowerCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, signalProviderSignalBean.profitSharingFollowerCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || signalProviderSignalBean.profitSharingRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, signalProviderSignalBean.profitSharingRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || signalProviderSignalBean.signalChanId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, signalProviderSignalBean.signalChanId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) signalProviderSignalBean.signalDescription, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, signalProviderSignalBean.signalDescription);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) signalProviderSignalBean.signalChanName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, signalProviderSignalBean.signalChanName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || signalProviderSignalBean.subscriptionFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, signalProviderSignalBean.subscriptionFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || signalProviderSignalBean.subscriptionFeeCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, signalProviderSignalBean.subscriptionFeeCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || signalProviderSignalBean.subscriptionFollowerAssets != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, signalProviderSignalBean.subscriptionFollowerAssets);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || signalProviderSignalBean.subscriptionFollowerCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, signalProviderSignalBean.subscriptionFollowerCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || signalProviderSignalBean.subscriptionType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, signalProviderSignalBean.subscriptionType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || signalProviderSignalBean.totalFollowerCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, signalProviderSignalBean.totalFollowerCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || signalProviderSignalBean.uTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, signalProviderSignalBean.uTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || signalProviderSignalBean.freeFollowerAssets != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, StringSerializer.INSTANCE, signalProviderSignalBean.freeFollowerAssets);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || signalProviderSignalBean.freeFollowerCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.INSTANCE, signalProviderSignalBean.freeFollowerCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || signalProviderSignalBean.instIds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.INSTANCE, signalProviderSignalBean.instIds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || signalProviderSignalBean.recommendInvestAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.INSTANCE, signalProviderSignalBean.recommendInvestAmount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) && signalProviderSignalBean.recommendLeverage == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, StringSerializer.INSTANCE, signalProviderSignalBean.recommendLeverage);
    }

    public SignalProviderSignalBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, @NotNull String str12, @NotNull String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25) {
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        this.accumulatedProfitSharing = str;
        this.accumulatedSubscriptionAmount = str2;
        this.approvalStatus = str3;
        this.cTime = str4;
        this.estimatedProfitSharing = str5;
        this.estimatedSubscriptionAmount = str6;
        this.profitSharingCcy = str7;
        this.profitSharingFollowerAssets = str8;
        this.profitSharingFollowerCount = str9;
        this.profitSharingRatio = str10;
        this.signalChanId = str11;
        this.signalDescription = str12;
        this.signalChanName = str13;
        this.subscriptionFee = str14;
        this.subscriptionFeeCcy = str15;
        this.subscriptionFollowerAssets = str16;
        this.subscriptionFollowerCount = str17;
        this.subscriptionType = str18;
        this.totalFollowerCount = str19;
        this.uTime = str20;
        this.freeFollowerAssets = str21;
        this.freeFollowerCount = str22;
        this.instIds = str23;
        this.recommendInvestAmount = str24;
        this.recommendLeverage = str25;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x011d: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r52v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r52v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r52v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r52v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r52v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r52v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r52v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r52v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r52v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r52v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r52v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r52v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r52v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r39v0 java.lang.String) : (""))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006b: ARITH (r52v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0073: ARITH (r52v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007e: ARITH (r52v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0089: ARITH (r52v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0094: ARITH (r52v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009f: ARITH (r52v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00aa: ARITH (r52v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b5: ARITH (r52v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c0: ARITH (r52v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00cb: ARITH (r52v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d6: ARITH (r52v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e1: ARITH (r52v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r51v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:4074) call: com.okinc.unify_trade.biz.SignalProviderSignalBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SignalProviderSignalBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) == 0 ? str13 : "", (i & 8192) != 0 ? null : str14, (i & 16384) != 0 ? null : str15, (i & 32768) != 0 ? null : str16, (i & 65536) != 0 ? null : str17, (i & 131072) != 0 ? null : str18, (i & 262144) != 0 ? null : str19, (i & 524288) != 0 ? null : str20, (i & 1048576) != 0 ? null : str21, (i & 2097152) != 0 ? null : str22, (i & 4194304) != 0 ? null : str23, (i & 8388608) != 0 ? null : str24, (i & 16777216) != 0 ? null : str25);
    }
}
