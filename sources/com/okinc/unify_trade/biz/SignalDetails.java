package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class SignalDetails implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SignalDetails> CREATOR = new Creator();
    private boolean autoRenewal;
    private final String avatar;
    private String botOrderType;
    private final String ccy;
    private final String followerWinRate;
    private String instIds;
    private String instIdsCount;
    private boolean isSubscribed;
    private final String profitSharingRatio;
    private final String signalChanId;
    private final String signalChanName;
    private final String signalDescription;
    private final String subscriptionExpireTime;
    private final String subscriptionFee;
    private String subscriptionType;
    private final String tickType;
    private String tipLever;
    private String tipMinInvest;
    private final String totalFollowerAssets;
    private final String totalFollowerCount;
    private final String totalFollowerPnl;
    private final String traderUniqueName;
    private final String triggerCount7d;
    private final String type;
    private String userSubscriptionType;
    private final String username;

    public static final class Creator implements Parcelable.Creator<SignalDetails> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalDetails createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SignalDetails(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalDetails[] newArray(int i) {
            return new SignalDetails[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignalDetails() {
        this(null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 67108863, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.signalChanId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.userSubscriptionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.subscriptionExpireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.subscriptionFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.profitSharingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.totalFollowerCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.traderUniqueName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.username;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.signalChanName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.instIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component21() {
        return this.autoRenewal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.instIdsCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.tickType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.tipLever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.tipMinInvest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.botOrderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.signalDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.totalFollowerPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.followerWinRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.totalFollowerAssets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.triggerCount7d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.subscriptionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component9() {
        return this.isSubscribed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalDetails copy(@NotNull String str, @NotNull String str2, String str3, String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, String str8, boolean z, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, String str19, boolean z2, @NotNull String str20, String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        return new SignalDetails(str, str2, str3, str4, str5, str6, str7, str8, z, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, z2, str20, str21, str22, str23, str24);
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
        if (!(obj instanceof SignalDetails)) {
            return false;
        }
        SignalDetails signalDetails = (SignalDetails) obj;
        return Intrinsics.EZpvd((Object) this.signalChanId, (Object) signalDetails.signalChanId) && Intrinsics.EZpvd((Object) this.signalChanName, (Object) signalDetails.signalChanName) && Intrinsics.EZpvd((Object) this.signalDescription, (Object) signalDetails.signalDescription) && Intrinsics.EZpvd((Object) this.totalFollowerPnl, (Object) signalDetails.totalFollowerPnl) && Intrinsics.EZpvd((Object) this.followerWinRate, (Object) signalDetails.followerWinRate) && Intrinsics.EZpvd((Object) this.totalFollowerAssets, (Object) signalDetails.totalFollowerAssets) && Intrinsics.EZpvd((Object) this.triggerCount7d, (Object) signalDetails.triggerCount7d) && Intrinsics.EZpvd((Object) this.subscriptionType, (Object) signalDetails.subscriptionType) && this.isSubscribed == signalDetails.isSubscribed && Intrinsics.EZpvd((Object) this.type, (Object) signalDetails.type) && Intrinsics.EZpvd((Object) this.userSubscriptionType, (Object) signalDetails.userSubscriptionType) && Intrinsics.EZpvd((Object) this.subscriptionExpireTime, (Object) signalDetails.subscriptionExpireTime) && Intrinsics.EZpvd((Object) this.subscriptionFee, (Object) signalDetails.subscriptionFee) && Intrinsics.EZpvd((Object) this.ccy, (Object) signalDetails.ccy) && Intrinsics.EZpvd((Object) this.profitSharingRatio, (Object) signalDetails.profitSharingRatio) && Intrinsics.EZpvd((Object) this.totalFollowerCount, (Object) signalDetails.totalFollowerCount) && Intrinsics.EZpvd((Object) this.traderUniqueName, (Object) signalDetails.traderUniqueName) && Intrinsics.EZpvd((Object) this.username, (Object) signalDetails.username) && Intrinsics.EZpvd((Object) this.avatar, (Object) signalDetails.avatar) && Intrinsics.EZpvd((Object) this.instIds, (Object) signalDetails.instIds) && this.autoRenewal == signalDetails.autoRenewal && Intrinsics.EZpvd((Object) this.instIdsCount, (Object) signalDetails.instIdsCount) && Intrinsics.EZpvd((Object) this.tickType, (Object) signalDetails.tickType) && Intrinsics.EZpvd((Object) this.tipLever, (Object) signalDetails.tipLever) && Intrinsics.EZpvd((Object) this.tipMinInvest, (Object) signalDetails.tipMinInvest) && Intrinsics.EZpvd((Object) this.botOrderType, (Object) signalDetails.botOrderType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAutoRenewal() {
        return this.autoRenewal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBotOrderType() {
        return this.botOrderType;
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
    public final String getInstIds() {
        return this.instIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstIdsCount() {
        return this.instIdsCount;
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
    public final String getSignalDescription() {
        return this.signalDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubscriptionExpireTime() {
        return this.subscriptionExpireTime;
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
    public final String getTickType() {
        return this.tickType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTipLever() {
        return this.tipLever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTipMinInvest() {
        return this.tipMinInvest;
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
    public final String getTotalFollowerPnl() {
        return this.totalFollowerPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTraderUniqueName() {
        return this.traderUniqueName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerCount7d() {
        return this.triggerCount7d;
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
        int iHashCode = this.signalChanId.hashCode();
        int iHashCode2 = this.signalChanName.hashCode();
        String str = this.signalDescription;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.totalFollowerPnl;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        int iHashCode5 = this.followerWinRate.hashCode();
        int iHashCode6 = this.totalFollowerAssets.hashCode();
        int iHashCode7 = this.triggerCount7d.hashCode();
        String str3 = this.subscriptionType;
        int iHashCode8 = str3 == null ? 0 : str3.hashCode();
        int iHashCode9 = Boolean.hashCode(this.isSubscribed);
        int iHashCode10 = this.type.hashCode();
        int iHashCode11 = this.userSubscriptionType.hashCode();
        int iHashCode12 = this.subscriptionExpireTime.hashCode();
        int iHashCode13 = this.subscriptionFee.hashCode();
        int iHashCode14 = this.ccy.hashCode();
        int iHashCode15 = this.profitSharingRatio.hashCode();
        int iHashCode16 = this.totalFollowerCount.hashCode();
        int iHashCode17 = this.traderUniqueName.hashCode();
        int iHashCode18 = this.username.hashCode();
        int iHashCode19 = this.avatar.hashCode();
        String str4 = this.instIds;
        int iHashCode20 = str4 == null ? 0 : str4.hashCode();
        int iHashCode21 = Boolean.hashCode(this.autoRenewal);
        int iHashCode22 = this.instIdsCount.hashCode();
        String str5 = this.tickType;
        return (((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + (str5 == null ? 0 : str5.hashCode())) * 31) + this.tipLever.hashCode()) * 31) + this.tipMinInvest.hashCode()) * 31) + this.botOrderType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSubscribed() {
        return this.isSubscribed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAutoRenewal(boolean z) {
        this.autoRenewal = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBotOrderType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.botOrderType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstIds(String str) {
        this.instIds = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstIdsCount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instIdsCount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubscribed(boolean z) {
        this.isSubscribed = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubscriptionType(String str) {
        this.subscriptionType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTipLever(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tipLever = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTipMinInvest(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tipMinInvest = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserSubscriptionType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.userSubscriptionType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalDetails(signalChanId=" + this.signalChanId + ", signalChanName=" + this.signalChanName + ", signalDescription=" + this.signalDescription + ", totalFollowerPnl=" + this.totalFollowerPnl + ", followerWinRate=" + this.followerWinRate + ", totalFollowerAssets=" + this.totalFollowerAssets + ", triggerCount7d=" + this.triggerCount7d + ", subscriptionType=" + this.subscriptionType + ", isSubscribed=" + this.isSubscribed + ", type=" + this.type + ", userSubscriptionType=" + this.userSubscriptionType + ", subscriptionExpireTime=" + this.subscriptionExpireTime + ", subscriptionFee=" + this.subscriptionFee + ", ccy=" + this.ccy + ", profitSharingRatio=" + this.profitSharingRatio + ", totalFollowerCount=" + this.totalFollowerCount + ", traderUniqueName=" + this.traderUniqueName + ", username=" + this.username + ", avatar=" + this.avatar + ", instIds=" + this.instIds + ", autoRenewal=" + this.autoRenewal + ", instIdsCount=" + this.instIdsCount + ", tickType=" + this.tickType + ", tipLever=" + this.tipLever + ", tipMinInvest=" + this.tipMinInvest + ", botOrderType=" + this.botOrderType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.signalChanId);
        parcel.writeString(this.signalChanName);
        parcel.writeString(this.signalDescription);
        parcel.writeString(this.totalFollowerPnl);
        parcel.writeString(this.followerWinRate);
        parcel.writeString(this.totalFollowerAssets);
        parcel.writeString(this.triggerCount7d);
        parcel.writeString(this.subscriptionType);
        parcel.writeInt(this.isSubscribed ? 1 : 0);
        parcel.writeString(this.type);
        parcel.writeString(this.userSubscriptionType);
        parcel.writeString(this.subscriptionExpireTime);
        parcel.writeString(this.subscriptionFee);
        parcel.writeString(this.ccy);
        parcel.writeString(this.profitSharingRatio);
        parcel.writeString(this.totalFollowerCount);
        parcel.writeString(this.traderUniqueName);
        parcel.writeString(this.username);
        parcel.writeString(this.avatar);
        parcel.writeString(this.instIds);
        parcel.writeInt(this.autoRenewal ? 1 : 0);
        parcel.writeString(this.instIdsCount);
        parcel.writeString(this.tickType);
        parcel.writeString(this.tipLever);
        parcel.writeString(this.tipMinInvest);
        parcel.writeString(this.botOrderType);
    }

    public SignalDetails(@NotNull String str, @NotNull String str2, String str3, String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, String str8, boolean z, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, String str19, boolean z2, @NotNull String str20, String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        this.signalChanId = str;
        this.signalChanName = str2;
        this.signalDescription = str3;
        this.totalFollowerPnl = str4;
        this.followerWinRate = str5;
        this.totalFollowerAssets = str6;
        this.triggerCount7d = str7;
        this.subscriptionType = str8;
        this.isSubscribed = z;
        this.type = str9;
        this.userSubscriptionType = str10;
        this.subscriptionExpireTime = str11;
        this.subscriptionFee = str12;
        this.ccy = str13;
        this.profitSharingRatio = str14;
        this.totalFollowerCount = str15;
        this.traderUniqueName = str16;
        this.username = str17;
        this.avatar = str18;
        this.instIds = str19;
        this.autoRenewal = z2;
        this.instIdsCount = str20;
        this.tickType = str21;
        this.tipLever = str22;
        this.tipMinInvest = str23;
        this.botOrderType = str24;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x012f: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r54v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r54v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r54v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r54v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r54v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r54v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r54v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r54v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0044: ARITH (r54v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r36v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r54v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r54v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r54v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r54v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r54v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r54v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r54v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r54v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0098: ARITH (r54v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a3: ARITH (r54v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ae: ARITH (r54v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r47v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00b9: ARITH (r54v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? false : (r48v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c4: ARITH (r54v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00cf: ARITH (r54v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00da: ARITH (r54v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e5: ARITH (r54v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f0: ARITH (r54v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:903) call: com.okinc.unify_trade.biz.SignalDetails.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SignalDetails(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, boolean z2, String str20, String str21, String str22, String str23, String str24, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? false : z, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? "" : str10, (i & 2048) != 0 ? "" : str11, (i & 4096) != 0 ? "" : str12, (i & 8192) != 0 ? "" : str13, (i & 16384) != 0 ? "" : str14, (i & 32768) != 0 ? "" : str15, (i & 65536) != 0 ? "" : str16, (i & 131072) != 0 ? "" : str17, (i & 262144) != 0 ? "" : str18, (i & 524288) != 0 ? null : str19, (i & 1048576) != 0 ? false : z2, (i & 2097152) != 0 ? "" : str20, (i & 4194304) != 0 ? null : str21, (i & 8388608) != 0 ? "" : str22, (i & 16777216) != 0 ? "" : str23, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str24);
    }
}
