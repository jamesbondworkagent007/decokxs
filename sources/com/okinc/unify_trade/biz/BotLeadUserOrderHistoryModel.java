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
public final class BotLeadUserOrderHistoryModel implements Parcelable {
    private String accumulatedProfitSharing;
    private String algoId;
    private String algoOrdType;
    private String cTime;
    private String completedCycles;
    private String direction;
    private String followerAssets;
    private String followerCount;
    private String instId;
    private String instType;
    private String investmentAmt;
    private String leverage;
    private String maxDrawdown;
    private String pnlRatio;
    private String profitSharingCcy;
    private String profitSharingRatio;
    private String runPx;
    private String totalPnl;
    private TrailingConfig trailingDownConfig;
    private TrailingConfig trailingUpConfig;
    private String uTime;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<BotLeadUserOrderHistoryModel> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<BotLeadUserOrderHistoryModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotLeadUserOrderHistoryModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BotLeadUserOrderHistoryModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : TrailingConfig.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? TrailingConfig.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotLeadUserOrderHistoryModel[] newArray(int i) {
            return new BotLeadUserOrderHistoryModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BotLeadUserOrderHistoryModel() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TrailingConfig) null, (TrailingConfig) null, 2097151, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.algoOrdType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.leverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.followerAssets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.profitSharingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.accumulatedProfitSharing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.profitSharingCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.runPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.completedCycles;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.uTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrailingConfig component20() {
        return this.trailingUpConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrailingConfig component21() {
        return this.trailingDownConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.maxDrawdown;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.investmentAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.followerCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotLeadUserOrderHistoryModel copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, TrailingConfig trailingConfig, TrailingConfig trailingConfig2) {
        return new BotLeadUserOrderHistoryModel(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, trailingConfig, trailingConfig2);
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
        if (!(obj instanceof BotLeadUserOrderHistoryModel)) {
            return false;
        }
        BotLeadUserOrderHistoryModel botLeadUserOrderHistoryModel = (BotLeadUserOrderHistoryModel) obj;
        return Intrinsics.EZpvd((Object) this.cTime, (Object) botLeadUserOrderHistoryModel.cTime) && Intrinsics.EZpvd((Object) this.uTime, (Object) botLeadUserOrderHistoryModel.uTime) && Intrinsics.EZpvd((Object) this.pnlRatio, (Object) botLeadUserOrderHistoryModel.pnlRatio) && Intrinsics.EZpvd((Object) this.maxDrawdown, (Object) botLeadUserOrderHistoryModel.maxDrawdown) && Intrinsics.EZpvd((Object) this.totalPnl, (Object) botLeadUserOrderHistoryModel.totalPnl) && Intrinsics.EZpvd((Object) this.investmentAmt, (Object) botLeadUserOrderHistoryModel.investmentAmt) && Intrinsics.EZpvd((Object) this.followerCount, (Object) botLeadUserOrderHistoryModel.followerCount) && Intrinsics.EZpvd((Object) this.algoId, (Object) botLeadUserOrderHistoryModel.algoId) && Intrinsics.EZpvd((Object) this.instId, (Object) botLeadUserOrderHistoryModel.instId) && Intrinsics.EZpvd((Object) this.instType, (Object) botLeadUserOrderHistoryModel.instType) && Intrinsics.EZpvd((Object) this.algoOrdType, (Object) botLeadUserOrderHistoryModel.algoOrdType) && Intrinsics.EZpvd((Object) this.leverage, (Object) botLeadUserOrderHistoryModel.leverage) && Intrinsics.EZpvd((Object) this.direction, (Object) botLeadUserOrderHistoryModel.direction) && Intrinsics.EZpvd((Object) this.followerAssets, (Object) botLeadUserOrderHistoryModel.followerAssets) && Intrinsics.EZpvd((Object) this.profitSharingRatio, (Object) botLeadUserOrderHistoryModel.profitSharingRatio) && Intrinsics.EZpvd((Object) this.accumulatedProfitSharing, (Object) botLeadUserOrderHistoryModel.accumulatedProfitSharing) && Intrinsics.EZpvd((Object) this.profitSharingCcy, (Object) botLeadUserOrderHistoryModel.profitSharingCcy) && Intrinsics.EZpvd((Object) this.runPx, (Object) botLeadUserOrderHistoryModel.runPx) && Intrinsics.EZpvd((Object) this.completedCycles, (Object) botLeadUserOrderHistoryModel.completedCycles) && Intrinsics.EZpvd(this.trailingUpConfig, botLeadUserOrderHistoryModel.trailingUpConfig) && Intrinsics.EZpvd(this.trailingDownConfig, botLeadUserOrderHistoryModel.trailingDownConfig);
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
    public final String getCTime() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCompletedCycles() {
        return this.completedCycles;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDirection() {
        return this.direction;
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
    public final String getPnlRatio() {
        return this.pnlRatio;
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
    public final String getRunPx() {
        return this.runPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalPnl() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrailingConfig getTrailingDownConfig() {
        return this.trailingDownConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrailingConfig getTrailingUpConfig() {
        return this.trailingUpConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUTime() {
        return this.uTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.cTime;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.uTime;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.pnlRatio;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.maxDrawdown;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.totalPnl;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.investmentAmt;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.followerCount;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.algoId;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.instId;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.instType;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.algoOrdType;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.leverage;
        int iHashCode12 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.direction;
        int iHashCode13 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.followerAssets;
        int iHashCode14 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.profitSharingRatio;
        int iHashCode15 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.accumulatedProfitSharing;
        int iHashCode16 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.profitSharingCcy;
        int iHashCode17 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.runPx;
        int iHashCode18 = str18 == null ? 0 : str18.hashCode();
        String str19 = this.completedCycles;
        int iHashCode19 = str19 == null ? 0 : str19.hashCode();
        TrailingConfig trailingConfig = this.trailingUpConfig;
        int iHashCode20 = trailingConfig == null ? 0 : trailingConfig.hashCode();
        TrailingConfig trailingConfig2 = this.trailingDownConfig;
        return (((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + (trailingConfig2 == null ? 0 : trailingConfig2.hashCode());
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
    public final void setCTime(String str) {
        this.cTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCompletedCycles(String str) {
        this.completedCycles = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDirection(String str) {
        this.direction = str;
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
    public final void setPnlRatio(String str) {
        this.pnlRatio = str;
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
    public final void setRunPx(String str) {
        this.runPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalPnl(String str) {
        this.totalPnl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTrailingDownConfig(TrailingConfig trailingConfig) {
        this.trailingDownConfig = trailingConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTrailingUpConfig(TrailingConfig trailingConfig) {
        this.trailingUpConfig = trailingConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUTime(String str) {
        this.uTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotLeadUserOrderHistoryModel(cTime=" + this.cTime + ", uTime=" + this.uTime + ", pnlRatio=" + this.pnlRatio + ", maxDrawdown=" + this.maxDrawdown + ", totalPnl=" + this.totalPnl + ", investmentAmt=" + this.investmentAmt + ", followerCount=" + this.followerCount + ", algoId=" + this.algoId + ", instId=" + this.instId + ", instType=" + this.instType + ", algoOrdType=" + this.algoOrdType + ", leverage=" + this.leverage + ", direction=" + this.direction + ", followerAssets=" + this.followerAssets + ", profitSharingRatio=" + this.profitSharingRatio + ", accumulatedProfitSharing=" + this.accumulatedProfitSharing + ", profitSharingCcy=" + this.profitSharingCcy + ", runPx=" + this.runPx + ", completedCycles=" + this.completedCycles + ", trailingUpConfig=" + this.trailingUpConfig + ", trailingDownConfig=" + this.trailingDownConfig + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.cTime);
        parcel.writeString(this.uTime);
        parcel.writeString(this.pnlRatio);
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
        parcel.writeString(this.profitSharingCcy);
        parcel.writeString(this.runPx);
        parcel.writeString(this.completedCycles);
        TrailingConfig trailingConfig = this.trailingUpConfig;
        if (trailingConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            trailingConfig.writeToParcel(parcel, i);
        }
        TrailingConfig trailingConfig2 = this.trailingDownConfig;
        if (trailingConfig2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            trailingConfig2.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.BotLeadUserOrderHistoryModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BotLeadUserOrderHistoryModel> serializer() {
            return BotLeadUserOrderHistoryModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BotLeadUserOrderHistoryModel(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, TrailingConfig trailingConfig, TrailingConfig trailingConfig2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.cTime = null;
        } else {
            this.cTime = str;
        }
        if ((i & 2) == 0) {
            this.uTime = null;
        } else {
            this.uTime = str2;
        }
        if ((i & 4) == 0) {
            this.pnlRatio = null;
        } else {
            this.pnlRatio = str3;
        }
        if ((i & 8) == 0) {
            this.maxDrawdown = null;
        } else {
            this.maxDrawdown = str4;
        }
        if ((i & 16) == 0) {
            this.totalPnl = null;
        } else {
            this.totalPnl = str5;
        }
        if ((i & 32) == 0) {
            this.investmentAmt = null;
        } else {
            this.investmentAmt = str6;
        }
        if ((i & 64) == 0) {
            this.followerCount = null;
        } else {
            this.followerCount = str7;
        }
        if ((i & 128) == 0) {
            this.algoId = null;
        } else {
            this.algoId = str8;
        }
        if ((i & 256) == 0) {
            this.instId = null;
        } else {
            this.instId = str9;
        }
        if ((i & 512) == 0) {
            this.instType = null;
        } else {
            this.instType = str10;
        }
        if ((i & 1024) == 0) {
            this.algoOrdType = null;
        } else {
            this.algoOrdType = str11;
        }
        if ((i & 2048) == 0) {
            this.leverage = null;
        } else {
            this.leverage = str12;
        }
        if ((i & 4096) == 0) {
            this.direction = null;
        } else {
            this.direction = str13;
        }
        if ((i & 8192) == 0) {
            this.followerAssets = null;
        } else {
            this.followerAssets = str14;
        }
        if ((i & 16384) == 0) {
            this.profitSharingRatio = null;
        } else {
            this.profitSharingRatio = str15;
        }
        if ((32768 & i) == 0) {
            this.accumulatedProfitSharing = null;
        } else {
            this.accumulatedProfitSharing = str16;
        }
        if ((65536 & i) == 0) {
            this.profitSharingCcy = null;
        } else {
            this.profitSharingCcy = str17;
        }
        if ((131072 & i) == 0) {
            this.runPx = null;
        } else {
            this.runPx = str18;
        }
        if ((262144 & i) == 0) {
            this.completedCycles = null;
        } else {
            this.completedCycles = str19;
        }
        if ((524288 & i) == 0) {
            this.trailingUpConfig = null;
        } else {
            this.trailingUpConfig = trailingConfig;
        }
        if ((i & 1048576) == 0) {
            this.trailingDownConfig = null;
        } else {
            this.trailingDownConfig = trailingConfig2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(BotLeadUserOrderHistoryModel botLeadUserOrderHistoryModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || botLeadUserOrderHistoryModel.cTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, botLeadUserOrderHistoryModel.cTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || botLeadUserOrderHistoryModel.uTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, botLeadUserOrderHistoryModel.uTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || botLeadUserOrderHistoryModel.pnlRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, botLeadUserOrderHistoryModel.pnlRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || botLeadUserOrderHistoryModel.maxDrawdown != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, botLeadUserOrderHistoryModel.maxDrawdown);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || botLeadUserOrderHistoryModel.totalPnl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, botLeadUserOrderHistoryModel.totalPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || botLeadUserOrderHistoryModel.investmentAmt != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, botLeadUserOrderHistoryModel.investmentAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || botLeadUserOrderHistoryModel.followerCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, botLeadUserOrderHistoryModel.followerCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || botLeadUserOrderHistoryModel.algoId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, botLeadUserOrderHistoryModel.algoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || botLeadUserOrderHistoryModel.instId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, botLeadUserOrderHistoryModel.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || botLeadUserOrderHistoryModel.instType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, botLeadUserOrderHistoryModel.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || botLeadUserOrderHistoryModel.algoOrdType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, botLeadUserOrderHistoryModel.algoOrdType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || botLeadUserOrderHistoryModel.leverage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, botLeadUserOrderHistoryModel.leverage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || botLeadUserOrderHistoryModel.direction != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, botLeadUserOrderHistoryModel.direction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || botLeadUserOrderHistoryModel.followerAssets != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, botLeadUserOrderHistoryModel.followerAssets);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || botLeadUserOrderHistoryModel.profitSharingRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, botLeadUserOrderHistoryModel.profitSharingRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || botLeadUserOrderHistoryModel.accumulatedProfitSharing != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, botLeadUserOrderHistoryModel.accumulatedProfitSharing);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || botLeadUserOrderHistoryModel.profitSharingCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, botLeadUserOrderHistoryModel.profitSharingCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || botLeadUserOrderHistoryModel.runPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, botLeadUserOrderHistoryModel.runPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || botLeadUserOrderHistoryModel.completedCycles != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, botLeadUserOrderHistoryModel.completedCycles);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || botLeadUserOrderHistoryModel.trailingUpConfig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, TrailingConfig$$serializer.INSTANCE, botLeadUserOrderHistoryModel.trailingUpConfig);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) && botLeadUserOrderHistoryModel.trailingDownConfig == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, TrailingConfig$$serializer.INSTANCE, botLeadUserOrderHistoryModel.trailingDownConfig);
    }

    public BotLeadUserOrderHistoryModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, TrailingConfig trailingConfig, TrailingConfig trailingConfig2) {
        this.cTime = str;
        this.uTime = str2;
        this.pnlRatio = str3;
        this.maxDrawdown = str4;
        this.totalPnl = str5;
        this.investmentAmt = str6;
        this.followerCount = str7;
        this.algoId = str8;
        this.instId = str9;
        this.instType = str10;
        this.algoOrdType = str11;
        this.leverage = str12;
        this.direction = str13;
        this.followerAssets = str14;
        this.profitSharingRatio = str15;
        this.accumulatedProfitSharing = str16;
        this.profitSharingCcy = str17;
        this.runPx = str18;
        this.completedCycles = str19;
        this.trailingUpConfig = trailingConfig;
        this.trailingDownConfig = trailingConfig2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00e8: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r44v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r44v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r44v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r44v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r44v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r44v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r44v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r44v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r44v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r44v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r44v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r44v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0062: ARITH (r44v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006a: ARITH (r44v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0072: ARITH (r44v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007d: ARITH (r44v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0088: ARITH (r44v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0093: ARITH (r44v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009e: ARITH (r44v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r41v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.TrailingConfig:?: TERNARY null = ((wrap:int:0x00a9: ARITH (r44v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.TrailingConfig) : (r42v0 com.okinc.unify_trade.biz.TrailingConfig))
  (wrap:com.okinc.unify_trade.biz.TrailingConfig:?: TERNARY null = ((wrap:int:0x00b4: ARITH (r44v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.TrailingConfig) : (r43v0 com.okinc.unify_trade.biz.TrailingConfig))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.TrailingConfig, com.okinc.unify_trade.biz.TrailingConfig):void (m)] (LINE:3684) call: com.okinc.unify_trade.biz.BotLeadUserOrderHistoryModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.TrailingConfig, com.okinc.unify_trade.biz.TrailingConfig):void type: THIS */
    public /* synthetic */ BotLeadUserOrderHistoryModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, TrailingConfig trailingConfig, TrailingConfig trailingConfig2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) != 0 ? null : str14, (i & 16384) != 0 ? null : str15, (i & 32768) != 0 ? null : str16, (i & 65536) != 0 ? null : str17, (i & 131072) != 0 ? null : str18, (i & 262144) != 0 ? null : str19, (i & 524288) != 0 ? null : trailingConfig, (i & 1048576) != 0 ? null : trailingConfig2);
    }
}
