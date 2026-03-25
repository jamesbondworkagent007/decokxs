package com.okinc.unify_trade.biz.subscribe;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.trade.manager.common.position.TradeHisPositionManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class TradeHisPostionData implements Parcelable {
    private String bankruptcyPrice;
    private String bizRefType;
    private String cTime;
    private String ccy;
    private String closeAvgPx;
    private String closeTotalAmount;
    private String closeType;
    private String closeUpl;
    private String closeUplRatio;
    private String ctMulti;
    private String ctVal;
    private String fee;
    private String fundingFee;
    private String instFamily;
    private String instId;
    private String instType;
    private String lever;
    private String liqPenalty;
    private String mgnMode;
    private String nonSettleAvgPx;
    private String openAvgPx;
    private String openMaxAmount;
    private String pnlRatio;
    private String posDirection;
    private String posId;
    private String posSide;
    private String realizedPnl;
    private String riskProfit;
    private String ruleType;
    private String settledPnl;
    private String shouldDisplay;
    private String triggerPx;
    private String uTime;
    private String uly;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TradeHisPostionData> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<TradeHisPostionData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeHisPostionData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TradeHisPostionData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeHisPostionData[] newArray(int i) {
            return new TradeHisPostionData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TradeHisPostionData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1, 3, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.posId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.openAvgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.closeAvgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.triggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.closeUpl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.closeUplRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.closeTotalAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.openMaxAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.closeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.ctVal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.ctMulti;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.uly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.instFamily;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.bankruptcyPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.riskProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.bizRefType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.realizedPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.fundingFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.liqPenalty;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.ruleType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.nonSettleAvgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.settledPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component34() {
        return this.shouldDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.mgnMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.posDirection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.uTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeHisPostionData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull String str33, @NotNull String str34) {
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
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(str30, "");
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(str32, "");
        Intrinsics.checkNotNullParameter(str33, "");
        Intrinsics.checkNotNullParameter(str34, "");
        return new TradeHisPostionData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34);
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
        if (!(obj instanceof TradeHisPostionData)) {
            return false;
        }
        TradeHisPostionData tradeHisPostionData = (TradeHisPostionData) obj;
        return Intrinsics.EZpvd((Object) this.posId, (Object) tradeHisPostionData.posId) && Intrinsics.EZpvd((Object) this.instType, (Object) tradeHisPostionData.instType) && Intrinsics.EZpvd((Object) this.instId, (Object) tradeHisPostionData.instId) && Intrinsics.EZpvd((Object) this.mgnMode, (Object) tradeHisPostionData.mgnMode) && Intrinsics.EZpvd((Object) this.posSide, (Object) tradeHisPostionData.posSide) && Intrinsics.EZpvd((Object) this.posDirection, (Object) tradeHisPostionData.posDirection) && Intrinsics.EZpvd((Object) this.lever, (Object) tradeHisPostionData.lever) && Intrinsics.EZpvd((Object) this.cTime, (Object) tradeHisPostionData.cTime) && Intrinsics.EZpvd((Object) this.uTime, (Object) tradeHisPostionData.uTime) && Intrinsics.EZpvd((Object) this.openAvgPx, (Object) tradeHisPostionData.openAvgPx) && Intrinsics.EZpvd((Object) this.closeAvgPx, (Object) tradeHisPostionData.closeAvgPx) && Intrinsics.EZpvd((Object) this.triggerPx, (Object) tradeHisPostionData.triggerPx) && Intrinsics.EZpvd((Object) this.closeUpl, (Object) tradeHisPostionData.closeUpl) && Intrinsics.EZpvd((Object) this.closeUplRatio, (Object) tradeHisPostionData.closeUplRatio) && Intrinsics.EZpvd((Object) this.closeTotalAmount, (Object) tradeHisPostionData.closeTotalAmount) && Intrinsics.EZpvd((Object) this.openMaxAmount, (Object) tradeHisPostionData.openMaxAmount) && Intrinsics.EZpvd((Object) this.closeType, (Object) tradeHisPostionData.closeType) && Intrinsics.EZpvd((Object) this.ctVal, (Object) tradeHisPostionData.ctVal) && Intrinsics.EZpvd((Object) this.ctMulti, (Object) tradeHisPostionData.ctMulti) && Intrinsics.EZpvd((Object) this.uly, (Object) tradeHisPostionData.uly) && Intrinsics.EZpvd((Object) this.instFamily, (Object) tradeHisPostionData.instFamily) && Intrinsics.EZpvd((Object) this.ccy, (Object) tradeHisPostionData.ccy) && Intrinsics.EZpvd((Object) this.bankruptcyPrice, (Object) tradeHisPostionData.bankruptcyPrice) && Intrinsics.EZpvd((Object) this.riskProfit, (Object) tradeHisPostionData.riskProfit) && Intrinsics.EZpvd((Object) this.bizRefType, (Object) tradeHisPostionData.bizRefType) && Intrinsics.EZpvd((Object) this.realizedPnl, (Object) tradeHisPostionData.realizedPnl) && Intrinsics.EZpvd((Object) this.fee, (Object) tradeHisPostionData.fee) && Intrinsics.EZpvd((Object) this.fundingFee, (Object) tradeHisPostionData.fundingFee) && Intrinsics.EZpvd((Object) this.liqPenalty, (Object) tradeHisPostionData.liqPenalty) && Intrinsics.EZpvd((Object) this.pnlRatio, (Object) tradeHisPostionData.pnlRatio) && Intrinsics.EZpvd((Object) this.ruleType, (Object) tradeHisPostionData.ruleType) && Intrinsics.EZpvd((Object) this.nonSettleAvgPx, (Object) tradeHisPostionData.nonSettleAvgPx) && Intrinsics.EZpvd((Object) this.settledPnl, (Object) tradeHisPostionData.settledPnl) && Intrinsics.EZpvd((Object) this.shouldDisplay, (Object) tradeHisPostionData.shouldDisplay);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBankruptcyPrice() {
        return this.bankruptcyPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizRefType() {
        return this.bizRefType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCTime() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCloseAvgPx() {
        return this.closeAvgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCloseTotalAmount() {
        return this.closeTotalAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCloseType() {
        return this.closeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCloseUpl() {
        return this.closeUpl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCloseUplRatio() {
        return this.closeUplRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCtMulti() {
        return this.ctMulti;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCtVal() {
        return this.ctVal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFee() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFundingFee() {
        return this.fundingFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstFamily() {
        return this.instFamily;
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
    public final String getLever() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLiqPenalty() {
        return this.liqPenalty;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMgnMode() {
        return this.mgnMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNonSettleAvgPx() {
        return this.nonSettleAvgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOpenAvgPx() {
        return this.openAvgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOpenMaxAmount() {
        return this.openMaxAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnlRatio() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosDirection() {
        return this.posDirection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosId() {
        return this.posId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosSide() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRealizedPnl() {
        return this.realizedPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRiskProfit() {
        return this.riskProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRuleType() {
        return this.ruleType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSettledPnl() {
        return this.settledPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getShouldDisplay() {
        return this.shouldDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerPx() {
        return this.triggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUTime() {
        return this.uTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUly() {
        return this.uly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.posId.hashCode() * 31) + this.instType.hashCode()) * 31) + this.instId.hashCode()) * 31) + this.mgnMode.hashCode()) * 31) + this.posSide.hashCode()) * 31) + this.posDirection.hashCode()) * 31) + this.lever.hashCode()) * 31) + this.cTime.hashCode()) * 31) + this.uTime.hashCode()) * 31) + this.openAvgPx.hashCode()) * 31) + this.closeAvgPx.hashCode()) * 31) + this.triggerPx.hashCode()) * 31) + this.closeUpl.hashCode()) * 31) + this.closeUplRatio.hashCode()) * 31) + this.closeTotalAmount.hashCode()) * 31) + this.openMaxAmount.hashCode()) * 31) + this.closeType.hashCode()) * 31) + this.ctVal.hashCode()) * 31) + this.ctMulti.hashCode()) * 31) + this.uly.hashCode()) * 31) + this.instFamily.hashCode()) * 31) + this.ccy.hashCode()) * 31) + this.bankruptcyPrice.hashCode()) * 31) + this.riskProfit.hashCode()) * 31) + this.bizRefType.hashCode()) * 31) + this.realizedPnl.hashCode()) * 31) + this.fee.hashCode()) * 31) + this.fundingFee.hashCode()) * 31) + this.liqPenalty.hashCode()) * 31) + this.pnlRatio.hashCode()) * 31) + this.ruleType.hashCode()) * 31) + this.nonSettleAvgPx.hashCode()) * 31) + this.settledPnl.hashCode()) * 31) + this.shouldDisplay.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBankruptcyPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bankruptcyPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBizRefType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bizRefType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ccy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCloseAvgPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.closeAvgPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCloseTotalAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.closeTotalAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCloseType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.closeType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCloseUpl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.closeUpl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCloseUplRatio(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.closeUplRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCtMulti(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ctMulti = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCtVal(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ctVal = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFee(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFundingFee(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fundingFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstFamily(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instFamily = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLever(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.lever = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLiqPenalty(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.liqPenalty = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMgnMode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mgnMode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNonSettleAvgPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.nonSettleAvgPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOpenAvgPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.openAvgPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOpenMaxAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.openMaxAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPnlRatio(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pnlRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPosDirection(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.posDirection = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPosId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.posId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPosSide(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.posSide = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRealizedPnl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.realizedPnl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRiskProfit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.riskProfit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRuleType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ruleType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSettledPnl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.settledPnl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShouldDisplay(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.shouldDisplay = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.triggerPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.uTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUly(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.uly = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TradeHisPostionData(posId=" + this.posId + ", instType=" + this.instType + ", instId=" + this.instId + ", mgnMode=" + this.mgnMode + ", posSide=" + this.posSide + ", posDirection=" + this.posDirection + ", lever=" + this.lever + ", cTime=" + this.cTime + ", uTime=" + this.uTime + ", openAvgPx=" + this.openAvgPx + ", closeAvgPx=" + this.closeAvgPx + ", triggerPx=" + this.triggerPx + ", closeUpl=" + this.closeUpl + ", closeUplRatio=" + this.closeUplRatio + ", closeTotalAmount=" + this.closeTotalAmount + ", openMaxAmount=" + this.openMaxAmount + ", closeType=" + this.closeType + ", ctVal=" + this.ctVal + ", ctMulti=" + this.ctMulti + ", uly=" + this.uly + ", instFamily=" + this.instFamily + ", ccy=" + this.ccy + ", bankruptcyPrice=" + this.bankruptcyPrice + ", riskProfit=" + this.riskProfit + ", bizRefType=" + this.bizRefType + ", realizedPnl=" + this.realizedPnl + ", fee=" + this.fee + ", fundingFee=" + this.fundingFee + ", liqPenalty=" + this.liqPenalty + ", pnlRatio=" + this.pnlRatio + ", ruleType=" + this.ruleType + ", nonSettleAvgPx=" + this.nonSettleAvgPx + ", settledPnl=" + this.settledPnl + ", shouldDisplay=" + this.shouldDisplay + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.posId);
        parcel.writeString(this.instType);
        parcel.writeString(this.instId);
        parcel.writeString(this.mgnMode);
        parcel.writeString(this.posSide);
        parcel.writeString(this.posDirection);
        parcel.writeString(this.lever);
        parcel.writeString(this.cTime);
        parcel.writeString(this.uTime);
        parcel.writeString(this.openAvgPx);
        parcel.writeString(this.closeAvgPx);
        parcel.writeString(this.triggerPx);
        parcel.writeString(this.closeUpl);
        parcel.writeString(this.closeUplRatio);
        parcel.writeString(this.closeTotalAmount);
        parcel.writeString(this.openMaxAmount);
        parcel.writeString(this.closeType);
        parcel.writeString(this.ctVal);
        parcel.writeString(this.ctMulti);
        parcel.writeString(this.uly);
        parcel.writeString(this.instFamily);
        parcel.writeString(this.ccy);
        parcel.writeString(this.bankruptcyPrice);
        parcel.writeString(this.riskProfit);
        parcel.writeString(this.bizRefType);
        parcel.writeString(this.realizedPnl);
        parcel.writeString(this.fee);
        parcel.writeString(this.fundingFee);
        parcel.writeString(this.liqPenalty);
        parcel.writeString(this.pnlRatio);
        parcel.writeString(this.ruleType);
        parcel.writeString(this.nonSettleAvgPx);
        parcel.writeString(this.settledPnl);
        parcel.writeString(this.shouldDisplay);
    }

    public /* synthetic */ TradeHisPostionData(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.posId = "";
        } else {
            this.posId = str;
        }
        if ((i & 2) == 0) {
            this.instType = "";
        } else {
            this.instType = str2;
        }
        if ((i & 4) == 0) {
            this.instId = "";
        } else {
            this.instId = str3;
        }
        if ((i & 8) == 0) {
            this.mgnMode = "";
        } else {
            this.mgnMode = str4;
        }
        if ((i & 16) == 0) {
            this.posSide = "";
        } else {
            this.posSide = str5;
        }
        if ((i & 32) == 0) {
            this.posDirection = "";
        } else {
            this.posDirection = str6;
        }
        if ((i & 64) == 0) {
            this.lever = "";
        } else {
            this.lever = str7;
        }
        if ((i & 128) == 0) {
            this.cTime = "";
        } else {
            this.cTime = str8;
        }
        if ((i & 256) == 0) {
            this.uTime = "";
        } else {
            this.uTime = str9;
        }
        if ((i & 512) == 0) {
            this.openAvgPx = "";
        } else {
            this.openAvgPx = str10;
        }
        if ((i & 1024) == 0) {
            this.closeAvgPx = "";
        } else {
            this.closeAvgPx = str11;
        }
        if ((i & 2048) == 0) {
            this.triggerPx = "";
        } else {
            this.triggerPx = str12;
        }
        if ((i & 4096) == 0) {
            this.closeUpl = "";
        } else {
            this.closeUpl = str13;
        }
        if ((i & 8192) == 0) {
            this.closeUplRatio = "";
        } else {
            this.closeUplRatio = str14;
        }
        if ((i & 16384) == 0) {
            this.closeTotalAmount = "";
        } else {
            this.closeTotalAmount = str15;
        }
        if ((32768 & i) == 0) {
            this.openMaxAmount = "";
        } else {
            this.openMaxAmount = str16;
        }
        if ((65536 & i) == 0) {
            this.closeType = "";
        } else {
            this.closeType = str17;
        }
        if ((131072 & i) == 0) {
            this.ctVal = "";
        } else {
            this.ctVal = str18;
        }
        if ((262144 & i) == 0) {
            this.ctMulti = "";
        } else {
            this.ctMulti = str19;
        }
        if ((524288 & i) == 0) {
            this.uly = "";
        } else {
            this.uly = str20;
        }
        if ((1048576 & i) == 0) {
            this.instFamily = "";
        } else {
            this.instFamily = str21;
        }
        if ((2097152 & i) == 0) {
            this.ccy = "";
        } else {
            this.ccy = str22;
        }
        if ((4194304 & i) == 0) {
            this.bankruptcyPrice = "";
        } else {
            this.bankruptcyPrice = str23;
        }
        if ((8388608 & i) == 0) {
            this.riskProfit = "";
        } else {
            this.riskProfit = str24;
        }
        if ((16777216 & i) == 0) {
            this.bizRefType = "";
        } else {
            this.bizRefType = str25;
        }
        if ((33554432 & i) == 0) {
            this.realizedPnl = "";
        } else {
            this.realizedPnl = str26;
        }
        if ((67108864 & i) == 0) {
            this.fee = "";
        } else {
            this.fee = str27;
        }
        if ((134217728 & i) == 0) {
            this.fundingFee = "";
        } else {
            this.fundingFee = str28;
        }
        if ((268435456 & i) == 0) {
            this.liqPenalty = "";
        } else {
            this.liqPenalty = str29;
        }
        if ((536870912 & i) == 0) {
            this.pnlRatio = "";
        } else {
            this.pnlRatio = str30;
        }
        if ((1073741824 & i) == 0) {
            this.ruleType = "";
        } else {
            this.ruleType = str31;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.nonSettleAvgPx = "";
        } else {
            this.nonSettleAvgPx = str32;
        }
        if ((i2 & 1) == 0) {
            this.settledPnl = "";
        } else {
            this.settledPnl = str33;
        }
        if ((i2 & 2) == 0) {
            this.shouldDisplay = "";
        } else {
            this.shouldDisplay = str34;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(TradeHisPostionData tradeHisPostionData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) tradeHisPostionData.posId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, tradeHisPostionData.posId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) tradeHisPostionData.instType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, tradeHisPostionData.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) tradeHisPostionData.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, tradeHisPostionData.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) tradeHisPostionData.mgnMode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, tradeHisPostionData.mgnMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) tradeHisPostionData.posSide, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, tradeHisPostionData.posSide);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) tradeHisPostionData.posDirection, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, tradeHisPostionData.posDirection);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) tradeHisPostionData.lever, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, tradeHisPostionData.lever);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) tradeHisPostionData.cTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, tradeHisPostionData.cTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) tradeHisPostionData.uTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, tradeHisPostionData.uTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) tradeHisPostionData.openAvgPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, tradeHisPostionData.openAvgPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) tradeHisPostionData.closeAvgPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, tradeHisPostionData.closeAvgPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) tradeHisPostionData.triggerPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, tradeHisPostionData.triggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) tradeHisPostionData.closeUpl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, tradeHisPostionData.closeUpl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) tradeHisPostionData.closeUplRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, tradeHisPostionData.closeUplRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) tradeHisPostionData.closeTotalAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, tradeHisPostionData.closeTotalAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) tradeHisPostionData.openMaxAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, tradeHisPostionData.openMaxAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) tradeHisPostionData.closeType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, tradeHisPostionData.closeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) tradeHisPostionData.ctVal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, tradeHisPostionData.ctVal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) tradeHisPostionData.ctMulti, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, tradeHisPostionData.ctMulti);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) tradeHisPostionData.uly, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, tradeHisPostionData.uly);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) tradeHisPostionData.instFamily, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, tradeHisPostionData.instFamily);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) tradeHisPostionData.ccy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, tradeHisPostionData.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) tradeHisPostionData.bankruptcyPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, tradeHisPostionData.bankruptcyPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) tradeHisPostionData.riskProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, tradeHisPostionData.riskProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) tradeHisPostionData.bizRefType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, tradeHisPostionData.bizRefType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) tradeHisPostionData.realizedPnl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, tradeHisPostionData.realizedPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) tradeHisPostionData.fee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, tradeHisPostionData.fee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) tradeHisPostionData.fundingFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, tradeHisPostionData.fundingFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) tradeHisPostionData.liqPenalty, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, tradeHisPostionData.liqPenalty);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd((Object) tradeHisPostionData.pnlRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 29, tradeHisPostionData.pnlRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) tradeHisPostionData.ruleType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 30, tradeHisPostionData.ruleType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || !Intrinsics.EZpvd((Object) tradeHisPostionData.nonSettleAvgPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 31, tradeHisPostionData.nonSettleAvgPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd((Object) tradeHisPostionData.settledPnl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 32, tradeHisPostionData.settledPnl);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) && Intrinsics.EZpvd((Object) tradeHisPostionData.shouldDisplay, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 33, tradeHisPostionData.shouldDisplay);
    }

    public TradeHisPostionData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull String str33, @NotNull String str34) {
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
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(str30, "");
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(str32, "");
        Intrinsics.checkNotNullParameter(str33, "");
        Intrinsics.checkNotNullParameter(str34, "");
        this.posId = str;
        this.instType = str2;
        this.instId = str3;
        this.mgnMode = str4;
        this.posSide = str5;
        this.posDirection = str6;
        this.lever = str7;
        this.cTime = str8;
        this.uTime = str9;
        this.openAvgPx = str10;
        this.closeAvgPx = str11;
        this.triggerPx = str12;
        this.closeUpl = str13;
        this.closeUplRatio = str14;
        this.closeTotalAmount = str15;
        this.openMaxAmount = str16;
        this.closeType = str17;
        this.ctVal = str18;
        this.ctMulti = str19;
        this.uly = str20;
        this.instFamily = str21;
        this.ccy = str22;
        this.bankruptcyPrice = str23;
        this.riskProfit = str24;
        this.bizRefType = str25;
        this.realizedPnl = str26;
        this.fee = str27;
        this.fundingFee = str28;
        this.liqPenalty = str29;
        this.pnlRatio = str30;
        this.ruleType = str31;
        this.nonSettleAvgPx = str32;
        this.settledPnl = str33;
        this.shouldDisplay = str34;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0193: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r69v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r69v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r69v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r69v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r69v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r69v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r69v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r69v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r69v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r69v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r69v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r69v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r69v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r69v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r69v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r69v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r69v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0098: ARITH (r69v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a3: ARITH (r69v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ae: ARITH (r69v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b9: ARITH (r69v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c4: ARITH (r69v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00cf: ARITH (r69v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00da: ARITH (r69v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e5: ARITH (r69v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f0: ARITH (r69v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fb: ARITH (r69v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r61v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0106: ARITH (r69v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r62v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0111: ARITH (r69v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r63v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x011c: ARITH (r69v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? ("") : (r64v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0127: ARITH (r69v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? ("") : (r65v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0132: ARITH (r69v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? ("") : (r66v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x013b: ARITH (r70v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r67v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0144: ARITH (r70v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r68v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:26) call: com.okinc.unify_trade.biz.subscribe.TradeHisPostionData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TradeHisPostionData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17, (i & 131072) != 0 ? "" : str18, (i & 262144) != 0 ? "" : str19, (i & 524288) != 0 ? "" : str20, (i & 1048576) != 0 ? "" : str21, (i & 2097152) != 0 ? "" : str22, (i & 4194304) != 0 ? "" : str23, (i & 8388608) != 0 ? "" : str24, (i & 16777216) != 0 ? "" : str25, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str26, (i & 67108864) != 0 ? "" : str27, (i & 134217728) != 0 ? "" : str28, (i & 268435456) != 0 ? "" : str29, (i & 536870912) != 0 ? "" : str30, (i & 1073741824) != 0 ? "" : str31, (i & Integer.MIN_VALUE) != 0 ? "" : str32, (i2 & 1) != 0 ? "" : str33, (i2 & 2) != 0 ? "" : str34);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.TradeHisPostionData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TradeHisPostionData> serializer() {
            return TradeHisPostionData$$serializer.INSTANCE;
        }
    }

    public final TradeHisPositionManager.HisPositionItem toHisPositionItem() {
        TradeHisPositionManager.HisPositionItem hisPositionItem = new TradeHisPositionManager.HisPositionItem();
        hisPositionItem.setPosId(this.posId);
        hisPositionItem.setInstType(this.instType);
        hisPositionItem.setInstId(this.instId);
        hisPositionItem.setMgnMode(this.mgnMode);
        hisPositionItem.setPosSide(this.posSide);
        hisPositionItem.setPosDirection(this.posDirection);
        hisPositionItem.setLever(this.lever);
        hisPositionItem.setCTime(this.cTime);
        hisPositionItem.setUTime(this.uTime);
        hisPositionItem.setOpenAvgPx(this.openAvgPx);
        hisPositionItem.setCloseAvgPx(this.closeAvgPx);
        hisPositionItem.setTriggerPx(this.triggerPx);
        hisPositionItem.setCloseUpl(this.closeUpl);
        hisPositionItem.setCloseUplRatio(this.closeUplRatio);
        hisPositionItem.setCloseTotalAmount(this.closeTotalAmount);
        hisPositionItem.setOpenMaxAmount(this.openMaxAmount);
        hisPositionItem.setCloseType(this.closeType);
        hisPositionItem.setCtVal(this.ctVal);
        hisPositionItem.setCtMulti(this.ctMulti);
        hisPositionItem.setUly(this.uly);
        hisPositionItem.setInstFamily(this.instFamily);
        hisPositionItem.setCcy(this.ccy);
        hisPositionItem.setBankruptcyPrice(this.bankruptcyPrice);
        hisPositionItem.setRiskProfit(this.riskProfit);
        hisPositionItem.setBizRefType(this.bizRefType);
        hisPositionItem.setRealizedPnl(this.realizedPnl);
        hisPositionItem.setFee(this.fee);
        hisPositionItem.setFundingFee(this.fundingFee);
        hisPositionItem.setLiqPenalty(this.liqPenalty);
        hisPositionItem.setPnlRatio(this.pnlRatio);
        hisPositionItem.setRuleType(this.ruleType);
        hisPositionItem.setNonSettleAvgPx(this.nonSettleAvgPx);
        hisPositionItem.setSettledPnl(this.settledPnl);
        hisPositionItem.setShouldDisplay(this.shouldDisplay);
        return hisPositionItem;
    }
}
