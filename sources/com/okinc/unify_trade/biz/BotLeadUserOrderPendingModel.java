package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class BotLeadUserOrderPendingModel implements Parcelable {
    private String accumulatedProfitSharing;
    private String algoId;
    private String algoOrdType;
    private String avatar;
    private String cTime;
    private String curAmt;
    private String direction;
    private String estimatedProfitSharing;
    private String followerAssets;
    private String followerCount;
    private String instId;
    private String instType;
    private String investmentAmt;
    private String leverage;
    private String maxDrawdown;
    private String pTime;
    private String pnlRatio;
    private List<HomeStrategyCardProfit> profitHistory;
    private String profitSharingCcy;
    private String profitSharingRatio;
    private String status;
    private String totalPnl;
    private String username;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<BotLeadUserOrderPendingModel> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(HomeStrategyCardProfit$$serializer.INSTANCE), null, null};

    public static final class Creator implements Parcelable.Creator<BotLeadUserOrderPendingModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotLeadUserOrderPendingModel createFromParcel(Parcel parcel) {
            String str;
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            String string19 = parcel.readString();
            String string20 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
                str = string13;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                str = string13;
                int i2 = 0;
                while (i2 != i) {
                    arrayList2.add(HomeStrategyCardProfit.CREATOR.createFromParcel(parcel));
                    i2++;
                    i = i;
                }
                arrayList = arrayList2;
            }
            return new BotLeadUserOrderPendingModel(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, str, string14, string15, string16, string17, string18, string19, string20, arrayList, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotLeadUserOrderPendingModel[] newArray(int i) {
            return new BotLeadUserOrderPendingModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BotLeadUserOrderPendingModel() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, 8388607, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.algoOrdType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.leverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.followerAssets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.profitSharingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.accumulatedProfitSharing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.estimatedProfitSharing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.pTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.profitSharingCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HomeStrategyCardProfit> component21() {
        return this.profitHistory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.curAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.username;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.maxDrawdown;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.investmentAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.followerCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotLeadUserOrderPendingModel copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, List<HomeStrategyCardProfit> list, String str21, String str22) {
        return new BotLeadUserOrderPendingModel(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, list, str21, str22);
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
        if (!(obj instanceof BotLeadUserOrderPendingModel)) {
            return false;
        }
        BotLeadUserOrderPendingModel botLeadUserOrderPendingModel = (BotLeadUserOrderPendingModel) obj;
        return Intrinsics.EZpvd((Object) this.cTime, (Object) botLeadUserOrderPendingModel.cTime) && Intrinsics.EZpvd((Object) this.pTime, (Object) botLeadUserOrderPendingModel.pTime) && Intrinsics.EZpvd((Object) this.pnlRatio, (Object) botLeadUserOrderPendingModel.pnlRatio) && Intrinsics.EZpvd((Object) this.curAmt, (Object) botLeadUserOrderPendingModel.curAmt) && Intrinsics.EZpvd((Object) this.username, (Object) botLeadUserOrderPendingModel.username) && Intrinsics.EZpvd((Object) this.maxDrawdown, (Object) botLeadUserOrderPendingModel.maxDrawdown) && Intrinsics.EZpvd((Object) this.totalPnl, (Object) botLeadUserOrderPendingModel.totalPnl) && Intrinsics.EZpvd((Object) this.investmentAmt, (Object) botLeadUserOrderPendingModel.investmentAmt) && Intrinsics.EZpvd((Object) this.followerCount, (Object) botLeadUserOrderPendingModel.followerCount) && Intrinsics.EZpvd((Object) this.algoId, (Object) botLeadUserOrderPendingModel.algoId) && Intrinsics.EZpvd((Object) this.instId, (Object) botLeadUserOrderPendingModel.instId) && Intrinsics.EZpvd((Object) this.instType, (Object) botLeadUserOrderPendingModel.instType) && Intrinsics.EZpvd((Object) this.algoOrdType, (Object) botLeadUserOrderPendingModel.algoOrdType) && Intrinsics.EZpvd((Object) this.leverage, (Object) botLeadUserOrderPendingModel.leverage) && Intrinsics.EZpvd((Object) this.direction, (Object) botLeadUserOrderPendingModel.direction) && Intrinsics.EZpvd((Object) this.followerAssets, (Object) botLeadUserOrderPendingModel.followerAssets) && Intrinsics.EZpvd((Object) this.profitSharingRatio, (Object) botLeadUserOrderPendingModel.profitSharingRatio) && Intrinsics.EZpvd((Object) this.accumulatedProfitSharing, (Object) botLeadUserOrderPendingModel.accumulatedProfitSharing) && Intrinsics.EZpvd((Object) this.estimatedProfitSharing, (Object) botLeadUserOrderPendingModel.estimatedProfitSharing) && Intrinsics.EZpvd((Object) this.profitSharingCcy, (Object) botLeadUserOrderPendingModel.profitSharingCcy) && Intrinsics.EZpvd(this.profitHistory, botLeadUserOrderPendingModel.profitHistory) && Intrinsics.EZpvd((Object) this.status, (Object) botLeadUserOrderPendingModel.status) && Intrinsics.EZpvd((Object) this.avatar, (Object) botLeadUserOrderPendingModel.avatar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccumulatedProfitSharing() {
        return this.accumulatedProfitSharing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoOrdType() {
        return this.algoOrdType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCTime() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurAmt() {
        return this.curAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDirection() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimatedProfitSharing() {
        return this.estimatedProfitSharing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFollowerAssets() {
        return this.followerAssets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFollowerCount() {
        return this.followerCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestmentAmt() {
        return this.investmentAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLeverage() {
        return this.leverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxDrawdown() {
        return this.maxDrawdown;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPTime() {
        return this.pTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnlRatio() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HomeStrategyCardProfit> getProfitHistory() {
        return this.profitHistory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProfitSharingCcy() {
        return this.profitSharingCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProfitSharingRatio() {
        return this.profitSharingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalPnl() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsername() {
        return this.username;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.cTime;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.pTime;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.pnlRatio;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.curAmt;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.username;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.maxDrawdown;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.totalPnl;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.investmentAmt;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.followerCount;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.algoId;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.instId;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.instType;
        int iHashCode12 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.algoOrdType;
        int iHashCode13 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.leverage;
        int iHashCode14 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.direction;
        int iHashCode15 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.followerAssets;
        int iHashCode16 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.profitSharingRatio;
        int iHashCode17 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.accumulatedProfitSharing;
        int iHashCode18 = str18 == null ? 0 : str18.hashCode();
        String str19 = this.estimatedProfitSharing;
        int iHashCode19 = str19 == null ? 0 : str19.hashCode();
        String str20 = this.profitSharingCcy;
        int iHashCode20 = str20 == null ? 0 : str20.hashCode();
        List<HomeStrategyCardProfit> list = this.profitHistory;
        int iHashCode21 = list == null ? 0 : list.hashCode();
        String str21 = this.status;
        int iHashCode22 = str21 == null ? 0 : str21.hashCode();
        String str22 = this.avatar;
        return (((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + (str22 == null ? 0 : str22.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccumulatedProfitSharing(String str) {
        this.accumulatedProfitSharing = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlgoId(String str) {
        this.algoId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlgoOrdType(String str) {
        this.algoOrdType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvatar(String str) {
        this.avatar = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCTime(String str) {
        this.cTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurAmt(String str) {
        this.curAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDirection(String str) {
        this.direction = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstimatedProfitSharing(String str) {
        this.estimatedProfitSharing = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFollowerAssets(String str) {
        this.followerAssets = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFollowerCount(String str) {
        this.followerCount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(String str) {
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstType(String str) {
        this.instType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvestmentAmt(String str) {
        this.investmentAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLeverage(String str) {
        this.leverage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxDrawdown(String str) {
        this.maxDrawdown = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPTime(String str) {
        this.pTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPnlRatio(String str) {
        this.pnlRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProfitHistory(List<HomeStrategyCardProfit> list) {
        this.profitHistory = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProfitSharingCcy(String str) {
        this.profitSharingCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProfitSharingRatio(String str) {
        this.profitSharingRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(String str) {
        this.status = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalPnl(String str) {
        this.totalPnl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUsername(String str) {
        this.username = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotLeadUserOrderPendingModel(cTime=" + this.cTime + ", pTime=" + this.pTime + ", pnlRatio=" + this.pnlRatio + ", curAmt=" + this.curAmt + ", username=" + this.username + ", maxDrawdown=" + this.maxDrawdown + ", totalPnl=" + this.totalPnl + ", investmentAmt=" + this.investmentAmt + ", followerCount=" + this.followerCount + ", algoId=" + this.algoId + ", instId=" + this.instId + ", instType=" + this.instType + ", algoOrdType=" + this.algoOrdType + ", leverage=" + this.leverage + ", direction=" + this.direction + ", followerAssets=" + this.followerAssets + ", profitSharingRatio=" + this.profitSharingRatio + ", accumulatedProfitSharing=" + this.accumulatedProfitSharing + ", estimatedProfitSharing=" + this.estimatedProfitSharing + ", profitSharingCcy=" + this.profitSharingCcy + ", profitHistory=" + this.profitHistory + ", status=" + this.status + ", avatar=" + this.avatar + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.cTime);
        parcel.writeString(this.pTime);
        parcel.writeString(this.pnlRatio);
        parcel.writeString(this.curAmt);
        parcel.writeString(this.username);
        parcel.writeString(this.maxDrawdown);
        parcel.writeString(this.totalPnl);
        parcel.writeString(this.investmentAmt);
        parcel.writeString(this.followerCount);
        parcel.writeString(this.algoId);
        parcel.writeString(this.instId);
        parcel.writeString(this.instType);
        parcel.writeString(this.algoOrdType);
        parcel.writeString(this.leverage);
        parcel.writeString(this.direction);
        parcel.writeString(this.followerAssets);
        parcel.writeString(this.profitSharingRatio);
        parcel.writeString(this.accumulatedProfitSharing);
        parcel.writeString(this.estimatedProfitSharing);
        parcel.writeString(this.profitSharingCcy);
        List<HomeStrategyCardProfit> list = this.profitHistory;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<HomeStrategyCardProfit> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.status);
        parcel.writeString(this.avatar);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.BotLeadUserOrderPendingModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BotLeadUserOrderPendingModel> serializer() {
            return BotLeadUserOrderPendingModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BotLeadUserOrderPendingModel(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, List list, String str21, String str22, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.cTime = null;
        } else {
            this.cTime = str;
        }
        if ((i & 2) == 0) {
            this.pTime = null;
        } else {
            this.pTime = str2;
        }
        if ((i & 4) == 0) {
            this.pnlRatio = null;
        } else {
            this.pnlRatio = str3;
        }
        if ((i & 8) == 0) {
            this.curAmt = null;
        } else {
            this.curAmt = str4;
        }
        if ((i & 16) == 0) {
            this.username = null;
        } else {
            this.username = str5;
        }
        if ((i & 32) == 0) {
            this.maxDrawdown = null;
        } else {
            this.maxDrawdown = str6;
        }
        if ((i & 64) == 0) {
            this.totalPnl = null;
        } else {
            this.totalPnl = str7;
        }
        if ((i & 128) == 0) {
            this.investmentAmt = null;
        } else {
            this.investmentAmt = str8;
        }
        if ((i & 256) == 0) {
            this.followerCount = null;
        } else {
            this.followerCount = str9;
        }
        if ((i & 512) == 0) {
            this.algoId = null;
        } else {
            this.algoId = str10;
        }
        if ((i & 1024) == 0) {
            this.instId = null;
        } else {
            this.instId = str11;
        }
        if ((i & 2048) == 0) {
            this.instType = null;
        } else {
            this.instType = str12;
        }
        if ((i & 4096) == 0) {
            this.algoOrdType = null;
        } else {
            this.algoOrdType = str13;
        }
        if ((i & 8192) == 0) {
            this.leverage = null;
        } else {
            this.leverage = str14;
        }
        if ((i & 16384) == 0) {
            this.direction = null;
        } else {
            this.direction = str15;
        }
        if ((32768 & i) == 0) {
            this.followerAssets = null;
        } else {
            this.followerAssets = str16;
        }
        if ((65536 & i) == 0) {
            this.profitSharingRatio = null;
        } else {
            this.profitSharingRatio = str17;
        }
        if ((131072 & i) == 0) {
            this.accumulatedProfitSharing = null;
        } else {
            this.accumulatedProfitSharing = str18;
        }
        if ((262144 & i) == 0) {
            this.estimatedProfitSharing = null;
        } else {
            this.estimatedProfitSharing = str19;
        }
        if ((524288 & i) == 0) {
            this.profitSharingCcy = null;
        } else {
            this.profitSharingCcy = str20;
        }
        if ((1048576 & i) == 0) {
            this.profitHistory = null;
        } else {
            this.profitHistory = list;
        }
        if ((2097152 & i) == 0) {
            this.status = null;
        } else {
            this.status = str21;
        }
        if ((i & 4194304) == 0) {
            this.avatar = null;
        } else {
            this.avatar = str22;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(BotLeadUserOrderPendingModel botLeadUserOrderPendingModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || botLeadUserOrderPendingModel.cTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, botLeadUserOrderPendingModel.cTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || botLeadUserOrderPendingModel.pTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, botLeadUserOrderPendingModel.pTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || botLeadUserOrderPendingModel.pnlRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, botLeadUserOrderPendingModel.pnlRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || botLeadUserOrderPendingModel.curAmt != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, botLeadUserOrderPendingModel.curAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || botLeadUserOrderPendingModel.username != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, botLeadUserOrderPendingModel.username);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || botLeadUserOrderPendingModel.maxDrawdown != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, botLeadUserOrderPendingModel.maxDrawdown);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || botLeadUserOrderPendingModel.totalPnl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, botLeadUserOrderPendingModel.totalPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || botLeadUserOrderPendingModel.investmentAmt != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, botLeadUserOrderPendingModel.investmentAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || botLeadUserOrderPendingModel.followerCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, botLeadUserOrderPendingModel.followerCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || botLeadUserOrderPendingModel.algoId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, botLeadUserOrderPendingModel.algoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || botLeadUserOrderPendingModel.instId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, botLeadUserOrderPendingModel.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || botLeadUserOrderPendingModel.instType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, botLeadUserOrderPendingModel.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || botLeadUserOrderPendingModel.algoOrdType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, botLeadUserOrderPendingModel.algoOrdType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || botLeadUserOrderPendingModel.leverage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, botLeadUserOrderPendingModel.leverage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || botLeadUserOrderPendingModel.direction != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, botLeadUserOrderPendingModel.direction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || botLeadUserOrderPendingModel.followerAssets != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, botLeadUserOrderPendingModel.followerAssets);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || botLeadUserOrderPendingModel.profitSharingRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, botLeadUserOrderPendingModel.profitSharingRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || botLeadUserOrderPendingModel.accumulatedProfitSharing != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, botLeadUserOrderPendingModel.accumulatedProfitSharing);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || botLeadUserOrderPendingModel.estimatedProfitSharing != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, botLeadUserOrderPendingModel.estimatedProfitSharing);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || botLeadUserOrderPendingModel.profitSharingCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, botLeadUserOrderPendingModel.profitSharingCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || botLeadUserOrderPendingModel.profitHistory != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, kSerializerArr[20], botLeadUserOrderPendingModel.profitHistory);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || botLeadUserOrderPendingModel.status != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.INSTANCE, botLeadUserOrderPendingModel.status);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) && botLeadUserOrderPendingModel.avatar == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.INSTANCE, botLeadUserOrderPendingModel.avatar);
    }

    public BotLeadUserOrderPendingModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, List<HomeStrategyCardProfit> list, String str21, String str22) {
        this.cTime = str;
        this.pTime = str2;
        this.pnlRatio = str3;
        this.curAmt = str4;
        this.username = str5;
        this.maxDrawdown = str6;
        this.totalPnl = str7;
        this.investmentAmt = str8;
        this.followerCount = str9;
        this.algoId = str10;
        this.instId = str11;
        this.instType = str12;
        this.algoOrdType = str13;
        this.leverage = str14;
        this.direction = str15;
        this.followerAssets = str16;
        this.profitSharingRatio = str17;
        this.accumulatedProfitSharing = str18;
        this.estimatedProfitSharing = str19;
        this.profitSharingCcy = str20;
        this.profitHistory = list;
        this.status = str21;
        this.avatar = str22;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0102: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r48v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r48v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r48v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r48v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r48v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r48v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r48v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r48v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r48v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r48v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r48v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r48v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0062: ARITH (r48v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006a: ARITH (r48v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0072: ARITH (r48v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007d: ARITH (r48v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0088: ARITH (r48v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0093: ARITH (r48v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009e: ARITH (r48v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a9: ARITH (r48v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r44v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00b4: ARITH (r48v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r45v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bf: ARITH (r48v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ca: ARITH (r48v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r47v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.unify_trade.biz.HomeStrategyCardProfit>, java.lang.String, java.lang.String):void (m)] (LINE:3720) call: com.okinc.unify_trade.biz.BotLeadUserOrderPendingModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ BotLeadUserOrderPendingModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, List list, String str21, String str22, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) != 0 ? null : str14, (i & 16384) != 0 ? null : str15, (i & 32768) != 0 ? null : str16, (i & 65536) != 0 ? null : str17, (i & 131072) != 0 ? null : str18, (i & 262144) != 0 ? null : str19, (i & 524288) != 0 ? null : str20, (i & 1048576) != 0 ? null : list, (i & 2097152) != 0 ? null : str21, (i & 4194304) != 0 ? null : str22);
    }
}
