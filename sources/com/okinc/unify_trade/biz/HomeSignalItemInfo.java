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
public final class HomeSignalItemInfo implements Parcelable {
    private String annualizedRate;
    private String avatar;
    private String ccy;
    private String followerWinRate;
    private boolean isSubscribed;
    private String profitSharingRatio;
    private String signalChanId;
    private String signalChanName;
    private String subscriptionFee;
    private String subscriptionType;
    private String totalFollowerAssets;
    private String totalFollowerCount;
    private String traderUniqueName;
    private String type;
    private String userSubscriptionType;
    private String username;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<HomeSignalItemInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<HomeSignalItemInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HomeSignalItemInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new HomeSignalItemInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HomeSignalItemInfo[] newArray(int i) {
            return new HomeSignalItemInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HomeSignalItemInfo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, 65535, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.signalChanId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.subscriptionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.userSubscriptionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.username;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.traderUniqueName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component15() {
        return this.isSubscribed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.signalChanName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.annualizedRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.followerWinRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.totalFollowerAssets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.totalFollowerCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.profitSharingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.subscriptionFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HomeSignalItemInfo copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z, String str15) {
        return new HomeSignalItemInfo(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, z, str15);
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
        if (!(obj instanceof HomeSignalItemInfo)) {
            return false;
        }
        HomeSignalItemInfo homeSignalItemInfo = (HomeSignalItemInfo) obj;
        return Intrinsics.EZpvd((Object) this.signalChanId, (Object) homeSignalItemInfo.signalChanId) && Intrinsics.EZpvd((Object) this.signalChanName, (Object) homeSignalItemInfo.signalChanName) && Intrinsics.EZpvd((Object) this.annualizedRate, (Object) homeSignalItemInfo.annualizedRate) && Intrinsics.EZpvd((Object) this.followerWinRate, (Object) homeSignalItemInfo.followerWinRate) && Intrinsics.EZpvd((Object) this.totalFollowerAssets, (Object) homeSignalItemInfo.totalFollowerAssets) && Intrinsics.EZpvd((Object) this.ccy, (Object) homeSignalItemInfo.ccy) && Intrinsics.EZpvd((Object) this.totalFollowerCount, (Object) homeSignalItemInfo.totalFollowerCount) && Intrinsics.EZpvd((Object) this.profitSharingRatio, (Object) homeSignalItemInfo.profitSharingRatio) && Intrinsics.EZpvd((Object) this.subscriptionFee, (Object) homeSignalItemInfo.subscriptionFee) && Intrinsics.EZpvd((Object) this.subscriptionType, (Object) homeSignalItemInfo.subscriptionType) && Intrinsics.EZpvd((Object) this.userSubscriptionType, (Object) homeSignalItemInfo.userSubscriptionType) && Intrinsics.EZpvd((Object) this.username, (Object) homeSignalItemInfo.username) && Intrinsics.EZpvd((Object) this.avatar, (Object) homeSignalItemInfo.avatar) && Intrinsics.EZpvd((Object) this.traderUniqueName, (Object) homeSignalItemInfo.traderUniqueName) && this.isSubscribed == homeSignalItemInfo.isSubscribed && Intrinsics.EZpvd((Object) this.type, (Object) homeSignalItemInfo.type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAnnualizedRate() {
        return this.annualizedRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFollowerWinRate() {
        return this.followerWinRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProfitSharingRatio() {
        return this.profitSharingRatio;
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
    public final String getSubscriptionFee() {
        return this.subscriptionFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubscriptionType() {
        return this.subscriptionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalFollowerAssets() {
        return this.totalFollowerAssets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalFollowerCount() {
        return this.totalFollowerCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTraderUniqueName() {
        return this.traderUniqueName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserSubscriptionType() {
        return this.userSubscriptionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsername() {
        return this.username;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.signalChanId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.signalChanName;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.annualizedRate;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.followerWinRate;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.totalFollowerAssets;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.ccy;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.totalFollowerCount;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.profitSharingRatio;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.subscriptionFee;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.subscriptionType;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.userSubscriptionType;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.username;
        int iHashCode12 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.avatar;
        int iHashCode13 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.traderUniqueName;
        int iHashCode14 = str14 == null ? 0 : str14.hashCode();
        int iHashCode15 = Boolean.hashCode(this.isSubscribed);
        String str15 = this.type;
        return (((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + (str15 == null ? 0 : str15.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSubscribed() {
        return this.isSubscribed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAnnualizedRate(String str) {
        this.annualizedRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvatar(String str) {
        this.avatar = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCcy(String str) {
        this.ccy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFollowerWinRate(String str) {
        this.followerWinRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProfitSharingRatio(String str) {
        this.profitSharingRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignalChanId(String str) {
        this.signalChanId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignalChanName(String str) {
        this.signalChanName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubscribed(boolean z) {
        this.isSubscribed = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubscriptionFee(String str) {
        this.subscriptionFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubscriptionType(String str) {
        this.subscriptionType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalFollowerAssets(String str) {
        this.totalFollowerAssets = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalFollowerCount(String str) {
        this.totalFollowerCount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTraderUniqueName(String str) {
        this.traderUniqueName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(String str) {
        this.type = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserSubscriptionType(String str) {
        this.userSubscriptionType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUsername(String str) {
        this.username = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HomeSignalItemInfo(signalChanId=" + this.signalChanId + ", signalChanName=" + this.signalChanName + ", annualizedRate=" + this.annualizedRate + ", followerWinRate=" + this.followerWinRate + ", totalFollowerAssets=" + this.totalFollowerAssets + ", ccy=" + this.ccy + ", totalFollowerCount=" + this.totalFollowerCount + ", profitSharingRatio=" + this.profitSharingRatio + ", subscriptionFee=" + this.subscriptionFee + ", subscriptionType=" + this.subscriptionType + ", userSubscriptionType=" + this.userSubscriptionType + ", username=" + this.username + ", avatar=" + this.avatar + ", traderUniqueName=" + this.traderUniqueName + ", isSubscribed=" + this.isSubscribed + ", type=" + this.type + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.signalChanId);
        parcel.writeString(this.signalChanName);
        parcel.writeString(this.annualizedRate);
        parcel.writeString(this.followerWinRate);
        parcel.writeString(this.totalFollowerAssets);
        parcel.writeString(this.ccy);
        parcel.writeString(this.totalFollowerCount);
        parcel.writeString(this.profitSharingRatio);
        parcel.writeString(this.subscriptionFee);
        parcel.writeString(this.subscriptionType);
        parcel.writeString(this.userSubscriptionType);
        parcel.writeString(this.username);
        parcel.writeString(this.avatar);
        parcel.writeString(this.traderUniqueName);
        parcel.writeInt(this.isSubscribed ? 1 : 0);
        parcel.writeString(this.type);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.HomeSignalItemInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HomeSignalItemInfo> serializer() {
            return HomeSignalItemInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HomeSignalItemInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z, String str15, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.signalChanId = null;
        } else {
            this.signalChanId = str;
        }
        if ((i & 2) == 0) {
            this.signalChanName = null;
        } else {
            this.signalChanName = str2;
        }
        if ((i & 4) == 0) {
            this.annualizedRate = null;
        } else {
            this.annualizedRate = str3;
        }
        if ((i & 8) == 0) {
            this.followerWinRate = null;
        } else {
            this.followerWinRate = str4;
        }
        if ((i & 16) == 0) {
            this.totalFollowerAssets = null;
        } else {
            this.totalFollowerAssets = str5;
        }
        if ((i & 32) == 0) {
            this.ccy = null;
        } else {
            this.ccy = str6;
        }
        if ((i & 64) == 0) {
            this.totalFollowerCount = null;
        } else {
            this.totalFollowerCount = str7;
        }
        if ((i & 128) == 0) {
            this.profitSharingRatio = null;
        } else {
            this.profitSharingRatio = str8;
        }
        if ((i & 256) == 0) {
            this.subscriptionFee = null;
        } else {
            this.subscriptionFee = str9;
        }
        if ((i & 512) == 0) {
            this.subscriptionType = null;
        } else {
            this.subscriptionType = str10;
        }
        if ((i & 1024) == 0) {
            this.userSubscriptionType = null;
        } else {
            this.userSubscriptionType = str11;
        }
        if ((i & 2048) == 0) {
            this.username = null;
        } else {
            this.username = str12;
        }
        if ((i & 4096) == 0) {
            this.avatar = null;
        } else {
            this.avatar = str13;
        }
        if ((i & 8192) == 0) {
            this.traderUniqueName = null;
        } else {
            this.traderUniqueName = str14;
        }
        this.isSubscribed = (i & 16384) == 0 ? false : z;
        if ((i & 32768) == 0) {
            this.type = null;
        } else {
            this.type = str15;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(HomeSignalItemInfo homeSignalItemInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || homeSignalItemInfo.signalChanId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, homeSignalItemInfo.signalChanId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || homeSignalItemInfo.signalChanName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, homeSignalItemInfo.signalChanName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || homeSignalItemInfo.annualizedRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, homeSignalItemInfo.annualizedRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || homeSignalItemInfo.followerWinRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, homeSignalItemInfo.followerWinRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || homeSignalItemInfo.totalFollowerAssets != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, homeSignalItemInfo.totalFollowerAssets);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || homeSignalItemInfo.ccy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, homeSignalItemInfo.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || homeSignalItemInfo.totalFollowerCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, homeSignalItemInfo.totalFollowerCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || homeSignalItemInfo.profitSharingRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, homeSignalItemInfo.profitSharingRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || homeSignalItemInfo.subscriptionFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, homeSignalItemInfo.subscriptionFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || homeSignalItemInfo.subscriptionType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, homeSignalItemInfo.subscriptionType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || homeSignalItemInfo.userSubscriptionType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, homeSignalItemInfo.userSubscriptionType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || homeSignalItemInfo.username != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, homeSignalItemInfo.username);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || homeSignalItemInfo.avatar != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, homeSignalItemInfo.avatar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || homeSignalItemInfo.traderUniqueName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, homeSignalItemInfo.traderUniqueName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || homeSignalItemInfo.isSubscribed) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 14, homeSignalItemInfo.isSubscribed);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) && homeSignalItemInfo.type == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, homeSignalItemInfo.type);
    }

    public HomeSignalItemInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z, String str15) {
        this.signalChanId = str;
        this.signalChanName = str2;
        this.annualizedRate = str3;
        this.followerWinRate = str4;
        this.totalFollowerAssets = str5;
        this.ccy = str6;
        this.totalFollowerCount = str7;
        this.profitSharingRatio = str8;
        this.subscriptionFee = str9;
        this.subscriptionType = str10;
        this.userSubscriptionType = str11;
        this.username = str12;
        this.avatar = str13;
        this.traderUniqueName = str14;
        this.isSubscribed = z;
        this.type = str15;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00a7: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r34v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r34v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r34v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r34v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r34v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r34v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r34v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r34v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r34v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r34v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r34v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r34v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0062: ARITH (r34v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006a: ARITH (r34v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0072: ARITH (r34v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? false : (r32v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007d: ARITH (r34v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String):void (m)] (LINE:4161) call: com.okinc.unify_trade.biz.HomeSignalItemInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ HomeSignalItemInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z, String str15, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) != 0 ? null : str14, (i & 16384) != 0 ? false : z, (i & 32768) != 0 ? null : str15);
    }
}
