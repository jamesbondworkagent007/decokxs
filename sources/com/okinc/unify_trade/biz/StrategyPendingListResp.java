package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public class StrategyPendingListResp implements Parcelable {
    private String actualSz;
    private String algoId;
    private String algoOrdType;
    private String arbitrageNum;
    private String avgPx;
    private String baseSz;
    private String cTime;
    private String cancelType;
    private String ccy;
    private String completedCycles;
    private String count;
    private String fillSafetyOrds;
    private String gridNum;
    private String instId;
    private String instType;
    private String investment;
    private String lever;
    private String maxPx;
    private String maxSafetyOrds;
    private String minPx;
    private String notionalUsd;
    private String ordId;
    private String pnlRatio;
    private String posSide;
    private String profitNum;
    private String pxLimit;
    private String pxSpread;
    private String pxVar;
    private String quoteSz;
    private String runType;
    private String side;
    private String slOrderPx;
    private String slPx;
    private String slTriggerPx;
    private String state;
    private String stopResult;
    private String sz;
    private String szLimit;
    private String tdMode;
    private String timeInterval;
    private String totalPnl;
    private String tpOrderPx;
    private String tpPx;
    private String tpTriggerPx;
    private String tradeNum;
    private String triggerTime;
    private String triggerType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<StrategyPendingListResp> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<StrategyPendingListResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StrategyPendingListResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new StrategyPendingListResp(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StrategyPendingListResp[] newArray(int i) {
            return new StrategyPendingListResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StrategyPendingListResp() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1, 32767, (DefaultConstructorMarker) null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActualSz() {
        return this.actualSz;
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
    public final String getArbitrageNum() {
        return this.arbitrageNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvgPx() {
        return this.avgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseSz() {
        return this.baseSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCTime() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCancelType() {
        return this.cancelType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCompletedCycles() {
        return this.completedCycles;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCount() {
        return this.count;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFillSafetyOrds() {
        return this.fillSafetyOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGridNum() {
        return this.gridNum;
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
    public final String getInvestment() {
        return this.investment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLever() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxPx() {
        return this.maxPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxSafetyOrds() {
        return this.maxSafetyOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinPx() {
        return this.minPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNotionalUsd() {
        return this.notionalUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdId() {
        return this.ordId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnlRatio() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosSide() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProfitNum() {
        return this.profitNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPxLimit() {
        return this.pxLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPxSpread() {
        return this.pxSpread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPxVar() {
        return this.pxVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteSz() {
        return this.quoteSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRunType() {
        return this.runType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSide() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlOrderPx() {
        return this.slOrderPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlPx() {
        return this.slPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlTriggerPx() {
        return this.slTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getState() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStopResult() {
        return this.stopResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSz() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSzLimit() {
        return this.szLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTdMode() {
        return this.tdMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTimeInterval() {
        return this.timeInterval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalPnl() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpOrderPx() {
        return this.tpOrderPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpPx() {
        return this.tpPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpTriggerPx() {
        return this.tpTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeNum() {
        return this.tradeNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerTime() {
        return this.triggerTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerType() {
        return this.triggerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActualSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.actualSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlgoId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.algoId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlgoOrdType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.algoOrdType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setArbitrageNum(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.arbitrageNum = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvgPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.avgPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCancelType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cancelType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ccy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCompletedCycles(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.completedCycles = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.count = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFillSafetyOrds(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fillSafetyOrds = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGridNum(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gridNum = str;
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
    public final void setInvestment(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.investment = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLever(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.lever = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.maxPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxSafetyOrds(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.maxSafetyOrds = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.minPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNotionalUsd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.notionalUsd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ordId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPnlRatio(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pnlRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPosSide(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.posSide = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProfitNum(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.profitNum = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPxLimit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pxLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPxSpread(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pxSpread = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPxVar(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pxVar = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRunType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.runType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSide(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.side = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlOrderPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.slOrderPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.slPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlTriggerPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.slTriggerPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setState(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.state = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStopResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.stopResult = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSzLimit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.szLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTdMode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tdMode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTimeInterval(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.timeInterval = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalPnl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.totalPnl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpOrderPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tpOrderPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tpPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpTriggerPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tpTriggerPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeNum(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tradeNum = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.triggerTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.triggerType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.instType);
        parcel.writeString(this.instId);
        parcel.writeString(this.ccy);
        parcel.writeString(this.ordId);
        parcel.writeString(this.algoId);
        parcel.writeString(this.algoOrdType);
        parcel.writeString(this.tdMode);
        parcel.writeString(this.lever);
        parcel.writeString(this.state);
        parcel.writeString(this.triggerTime);
        parcel.writeString(this.cTime);
        parcel.writeString(this.pxVar);
        parcel.writeString(this.pxSpread);
        parcel.writeString(this.szLimit);
        parcel.writeString(this.pxLimit);
        parcel.writeString(this.actualSz);
        parcel.writeString(this.sz);
        parcel.writeString(this.side);
        parcel.writeString(this.posSide);
        parcel.writeString(this.timeInterval);
        parcel.writeString(this.maxPx);
        parcel.writeString(this.minPx);
        parcel.writeString(this.gridNum);
        parcel.writeString(this.runType);
        parcel.writeString(this.quoteSz);
        parcel.writeString(this.baseSz);
        parcel.writeString(this.tpTriggerPx);
        parcel.writeString(this.slTriggerPx);
        parcel.writeString(this.tpOrderPx);
        parcel.writeString(this.slOrderPx);
        parcel.writeString(this.tradeNum);
        parcel.writeString(this.totalPnl);
        parcel.writeString(this.pnlRatio);
        parcel.writeString(this.investment);
        parcel.writeString(this.cancelType);
        parcel.writeString(this.notionalUsd);
        parcel.writeString(this.count);
        parcel.writeString(this.stopResult);
        parcel.writeString(this.profitNum);
        parcel.writeString(this.arbitrageNum);
        parcel.writeString(this.triggerType);
        parcel.writeString(this.maxSafetyOrds);
        parcel.writeString(this.fillSafetyOrds);
        parcel.writeString(this.avgPx);
        parcel.writeString(this.tpPx);
        parcel.writeString(this.slPx);
        parcel.writeString(this.completedCycles);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.StrategyPendingListResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StrategyPendingListResp> serializer() {
            return StrategyPendingListResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StrategyPendingListResp(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.instType = "";
        } else {
            this.instType = str;
        }
        if ((i & 2) == 0) {
            this.instId = "";
        } else {
            this.instId = str2;
        }
        if ((i & 4) == 0) {
            this.ccy = "";
        } else {
            this.ccy = str3;
        }
        if ((i & 8) == 0) {
            this.ordId = "";
        } else {
            this.ordId = str4;
        }
        if ((i & 16) == 0) {
            this.algoId = "";
        } else {
            this.algoId = str5;
        }
        if ((i & 32) == 0) {
            this.algoOrdType = "";
        } else {
            this.algoOrdType = str6;
        }
        if ((i & 64) == 0) {
            this.tdMode = "";
        } else {
            this.tdMode = str7;
        }
        if ((i & 128) == 0) {
            this.lever = "";
        } else {
            this.lever = str8;
        }
        if ((i & 256) == 0) {
            this.state = "";
        } else {
            this.state = str9;
        }
        if ((i & 512) == 0) {
            this.triggerTime = "";
        } else {
            this.triggerTime = str10;
        }
        if ((i & 1024) == 0) {
            this.cTime = "";
        } else {
            this.cTime = str11;
        }
        if ((i & 2048) == 0) {
            this.pxVar = "";
        } else {
            this.pxVar = str12;
        }
        if ((i & 4096) == 0) {
            this.pxSpread = "";
        } else {
            this.pxSpread = str13;
        }
        if ((i & 8192) == 0) {
            this.szLimit = "";
        } else {
            this.szLimit = str14;
        }
        if ((i & 16384) == 0) {
            this.pxLimit = "";
        } else {
            this.pxLimit = str15;
        }
        if ((32768 & i) == 0) {
            this.actualSz = "";
        } else {
            this.actualSz = str16;
        }
        if ((65536 & i) == 0) {
            this.sz = "";
        } else {
            this.sz = str17;
        }
        if ((131072 & i) == 0) {
            this.side = "";
        } else {
            this.side = str18;
        }
        if ((262144 & i) == 0) {
            this.posSide = "";
        } else {
            this.posSide = str19;
        }
        if ((524288 & i) == 0) {
            this.timeInterval = "";
        } else {
            this.timeInterval = str20;
        }
        if ((1048576 & i) == 0) {
            this.maxPx = "";
        } else {
            this.maxPx = str21;
        }
        if ((2097152 & i) == 0) {
            this.minPx = "";
        } else {
            this.minPx = str22;
        }
        if ((4194304 & i) == 0) {
            this.gridNum = "";
        } else {
            this.gridNum = str23;
        }
        if ((8388608 & i) == 0) {
            this.runType = "";
        } else {
            this.runType = str24;
        }
        if ((16777216 & i) == 0) {
            this.quoteSz = "";
        } else {
            this.quoteSz = str25;
        }
        if ((33554432 & i) == 0) {
            this.baseSz = "";
        } else {
            this.baseSz = str26;
        }
        if ((67108864 & i) == 0) {
            this.tpTriggerPx = "";
        } else {
            this.tpTriggerPx = str27;
        }
        if ((134217728 & i) == 0) {
            this.slTriggerPx = "";
        } else {
            this.slTriggerPx = str28;
        }
        if ((268435456 & i) == 0) {
            this.tpOrderPx = "";
        } else {
            this.tpOrderPx = str29;
        }
        if ((536870912 & i) == 0) {
            this.slOrderPx = "";
        } else {
            this.slOrderPx = str30;
        }
        if ((1073741824 & i) == 0) {
            this.tradeNum = "";
        } else {
            this.tradeNum = str31;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.totalPnl = "";
        } else {
            this.totalPnl = str32;
        }
        if ((i2 & 1) == 0) {
            this.pnlRatio = "";
        } else {
            this.pnlRatio = str33;
        }
        if ((i2 & 2) == 0) {
            this.investment = "";
        } else {
            this.investment = str34;
        }
        if ((i2 & 4) == 0) {
            this.cancelType = "";
        } else {
            this.cancelType = str35;
        }
        if ((i2 & 8) == 0) {
            this.notionalUsd = "";
        } else {
            this.notionalUsd = str36;
        }
        if ((i2 & 16) == 0) {
            this.count = "";
        } else {
            this.count = str37;
        }
        if ((i2 & 32) == 0) {
            this.stopResult = "";
        } else {
            this.stopResult = str38;
        }
        if ((i2 & 64) == 0) {
            this.profitNum = "";
        } else {
            this.profitNum = str39;
        }
        if ((i2 & 128) == 0) {
            this.arbitrageNum = "";
        } else {
            this.arbitrageNum = str40;
        }
        if ((i2 & 256) == 0) {
            this.triggerType = "";
        } else {
            this.triggerType = str41;
        }
        if ((i2 & 512) == 0) {
            this.maxSafetyOrds = "";
        } else {
            this.maxSafetyOrds = str42;
        }
        if ((i2 & 1024) == 0) {
            this.fillSafetyOrds = "";
        } else {
            this.fillSafetyOrds = str43;
        }
        if ((i2 & 2048) == 0) {
            this.avgPx = "";
        } else {
            this.avgPx = str44;
        }
        if ((i2 & 4096) == 0) {
            this.tpPx = "";
        } else {
            this.tpPx = str45;
        }
        if ((i2 & 8192) == 0) {
            this.slPx = "";
        } else {
            this.slPx = str46;
        }
        if ((i2 & 16384) == 0) {
            this.completedCycles = "";
        } else {
            this.completedCycles = str47;
        }
    }

    public static final /* synthetic */ void write$Self(StrategyPendingListResp strategyPendingListResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) strategyPendingListResp.instType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, strategyPendingListResp.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) strategyPendingListResp.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, strategyPendingListResp.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) strategyPendingListResp.ccy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, strategyPendingListResp.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) strategyPendingListResp.ordId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, strategyPendingListResp.ordId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) strategyPendingListResp.algoId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, strategyPendingListResp.algoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) strategyPendingListResp.algoOrdType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, strategyPendingListResp.algoOrdType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) strategyPendingListResp.tdMode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, strategyPendingListResp.tdMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) strategyPendingListResp.lever, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, strategyPendingListResp.lever);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) strategyPendingListResp.state, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, strategyPendingListResp.state);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) strategyPendingListResp.triggerTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, strategyPendingListResp.triggerTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) strategyPendingListResp.cTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, strategyPendingListResp.cTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) strategyPendingListResp.pxVar, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, strategyPendingListResp.pxVar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) strategyPendingListResp.pxSpread, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, strategyPendingListResp.pxSpread);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) strategyPendingListResp.szLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, strategyPendingListResp.szLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) strategyPendingListResp.pxLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, strategyPendingListResp.pxLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) strategyPendingListResp.actualSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, strategyPendingListResp.actualSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) strategyPendingListResp.sz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, strategyPendingListResp.sz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) strategyPendingListResp.side, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, strategyPendingListResp.side);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) strategyPendingListResp.posSide, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, strategyPendingListResp.posSide);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) strategyPendingListResp.timeInterval, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, strategyPendingListResp.timeInterval);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) strategyPendingListResp.maxPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, strategyPendingListResp.maxPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) strategyPendingListResp.minPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, strategyPendingListResp.minPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) strategyPendingListResp.gridNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, strategyPendingListResp.gridNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) strategyPendingListResp.runType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, strategyPendingListResp.runType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) strategyPendingListResp.quoteSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, strategyPendingListResp.quoteSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) strategyPendingListResp.baseSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, strategyPendingListResp.baseSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) strategyPendingListResp.tpTriggerPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, strategyPendingListResp.tpTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) strategyPendingListResp.slTriggerPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, strategyPendingListResp.slTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) strategyPendingListResp.tpOrderPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, strategyPendingListResp.tpOrderPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd((Object) strategyPendingListResp.slOrderPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 29, strategyPendingListResp.slOrderPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) strategyPendingListResp.tradeNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 30, strategyPendingListResp.tradeNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || !Intrinsics.EZpvd((Object) strategyPendingListResp.totalPnl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 31, strategyPendingListResp.totalPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd((Object) strategyPendingListResp.pnlRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 32, strategyPendingListResp.pnlRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || !Intrinsics.EZpvd((Object) strategyPendingListResp.investment, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 33, strategyPendingListResp.investment);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || !Intrinsics.EZpvd((Object) strategyPendingListResp.cancelType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 34, strategyPendingListResp.cancelType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || !Intrinsics.EZpvd((Object) strategyPendingListResp.notionalUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 35, strategyPendingListResp.notionalUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || !Intrinsics.EZpvd((Object) strategyPendingListResp.count, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 36, strategyPendingListResp.count);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || !Intrinsics.EZpvd((Object) strategyPendingListResp.stopResult, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 37, strategyPendingListResp.stopResult);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || !Intrinsics.EZpvd((Object) strategyPendingListResp.profitNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 38, strategyPendingListResp.profitNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || !Intrinsics.EZpvd((Object) strategyPendingListResp.arbitrageNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 39, strategyPendingListResp.arbitrageNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || !Intrinsics.EZpvd((Object) strategyPendingListResp.triggerType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 40, strategyPendingListResp.triggerType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) || !Intrinsics.EZpvd((Object) strategyPendingListResp.maxSafetyOrds, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 41, strategyPendingListResp.maxSafetyOrds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 42) || !Intrinsics.EZpvd((Object) strategyPendingListResp.fillSafetyOrds, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 42, strategyPendingListResp.fillSafetyOrds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 43) || !Intrinsics.EZpvd((Object) strategyPendingListResp.avgPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 43, strategyPendingListResp.avgPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 44) || !Intrinsics.EZpvd((Object) strategyPendingListResp.tpPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 44, strategyPendingListResp.tpPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 45) || !Intrinsics.EZpvd((Object) strategyPendingListResp.slPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 45, strategyPendingListResp.slPx);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 46) && Intrinsics.EZpvd((Object) strategyPendingListResp.completedCycles, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 46, strategyPendingListResp.completedCycles);
    }

    public StrategyPendingListResp(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull String str33, @NotNull String str34, @NotNull String str35, @NotNull String str36, @NotNull String str37, @NotNull String str38, @NotNull String str39, @NotNull String str40, @NotNull String str41, @NotNull String str42, @NotNull String str43, @NotNull String str44, @NotNull String str45, @NotNull String str46, @NotNull String str47) {
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
        Intrinsics.checkNotNullParameter(str35, "");
        Intrinsics.checkNotNullParameter(str36, "");
        Intrinsics.checkNotNullParameter(str37, "");
        Intrinsics.checkNotNullParameter(str38, "");
        Intrinsics.checkNotNullParameter(str39, "");
        Intrinsics.checkNotNullParameter(str40, "");
        Intrinsics.checkNotNullParameter(str41, "");
        Intrinsics.checkNotNullParameter(str42, "");
        Intrinsics.checkNotNullParameter(str43, "");
        Intrinsics.checkNotNullParameter(str44, "");
        Intrinsics.checkNotNullParameter(str45, "");
        Intrinsics.checkNotNullParameter(str46, "");
        Intrinsics.checkNotNullParameter(str47, "");
        this.instType = str;
        this.instId = str2;
        this.ccy = str3;
        this.ordId = str4;
        this.algoId = str5;
        this.algoOrdType = str6;
        this.tdMode = str7;
        this.lever = str8;
        this.state = str9;
        this.triggerTime = str10;
        this.cTime = str11;
        this.pxVar = str12;
        this.pxSpread = str13;
        this.szLimit = str14;
        this.pxLimit = str15;
        this.actualSz = str16;
        this.sz = str17;
        this.side = str18;
        this.posSide = str19;
        this.timeInterval = str20;
        this.maxPx = str21;
        this.minPx = str22;
        this.gridNum = str23;
        this.runType = str24;
        this.quoteSz = str25;
        this.baseSz = str26;
        this.tpTriggerPx = str27;
        this.slTriggerPx = str28;
        this.tpOrderPx = str29;
        this.slOrderPx = str30;
        this.tradeNum = str31;
        this.totalPnl = str32;
        this.pnlRatio = str33;
        this.investment = str34;
        this.cancelType = str35;
        this.notionalUsd = str36;
        this.count = str37;
        this.stopResult = str38;
        this.profitNum = str39;
        this.arbitrageNum = str40;
        this.triggerType = str41;
        this.maxSafetyOrds = str42;
        this.fillSafetyOrds = str43;
        this.avgPx = str44;
        this.tpPx = str45;
        this.slPx = str46;
        this.completedCycles = str47;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0235: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0004: ARITH (r94v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r94v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r94v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r94v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r94v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r94v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r94v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r94v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0046: ARITH (r94v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004e: ARITH (r94v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0056: ARITH (r94v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005e: ARITH (r94v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0066: ARITH (r94v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r59v0 java.lang.String))
  (wrap:java.lang.String:0x0079: TERNARY null = ((wrap:int:0x0070: ARITH (r94v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007b: ARITH (r94v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r61v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0087: ARITH (r94v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r62v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0092: ARITH (r94v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r63v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009d: ARITH (r94v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r64v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a8: ARITH (r94v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r65v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b3: ARITH (r94v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r66v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00be: ARITH (r94v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r67v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c9: ARITH (r94v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r68v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d4: ARITH (r94v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r69v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00df: ARITH (r94v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r70v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ea: ARITH (r94v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r71v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f5: ARITH (r94v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r72v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0100: ARITH (r94v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r73v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x010b: ARITH (r94v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r74v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0116: ARITH (r94v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r75v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0121: ARITH (r94v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? ("") : (r76v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x012c: ARITH (r94v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? ("") : (r77v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0137: ARITH (r94v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? ("") : (r78v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0140: ARITH (r95v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r79v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0149: ARITH (r95v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r80v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0152: ARITH (r95v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r81v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x015b: ARITH (r95v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r82v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0164: ARITH (r95v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r83v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x016d: ARITH (r95v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r84v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0176: ARITH (r95v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r85v0 java.lang.String))
  (wrap:java.lang.String:0x018a: TERNARY null = ((wrap:int:0x0181: ARITH (r95v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r86v0 java.lang.String))
  (wrap:java.lang.String:0x0195: TERNARY null = ((wrap:int:0x018c: ARITH (r95v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r87v0 java.lang.String))
  (wrap:java.lang.String:0x01a0: TERNARY null = ((wrap:int:0x0197: ARITH (r95v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r88v0 java.lang.String))
  (wrap:java.lang.String:0x01ab: TERNARY null = ((wrap:int:0x01a2: ARITH (r95v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r89v0 java.lang.String))
  (wrap:java.lang.String:0x01b6: TERNARY null = ((wrap:int:0x01ad: ARITH (r95v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r90v0 java.lang.String))
  (wrap:java.lang.String:0x01c1: TERNARY null = ((wrap:int:0x01b8: ARITH (r95v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r91v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01c3: ARITH (r95v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r92v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01cc: ARITH (r95v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r93v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:1403) call: com.okinc.unify_trade.biz.StrategyPendingListResp.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ StrategyPendingListResp(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17, (i & 131072) != 0 ? "" : str18, (i & 262144) != 0 ? "" : str19, (i & 524288) != 0 ? "" : str20, (i & 1048576) != 0 ? "" : str21, (i & 2097152) != 0 ? "" : str22, (i & 4194304) != 0 ? "" : str23, (i & 8388608) != 0 ? "" : str24, (i & 16777216) != 0 ? "" : str25, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str26, (i & 67108864) != 0 ? "" : str27, (i & 134217728) != 0 ? "" : str28, (i & 268435456) != 0 ? "" : str29, (i & 536870912) != 0 ? "" : str30, (i & 1073741824) != 0 ? "" : str31, (i & Integer.MIN_VALUE) != 0 ? "" : str32, (i2 & 1) != 0 ? "" : str33, (i2 & 2) != 0 ? "" : str34, (i2 & 4) != 0 ? "" : str35, (i2 & 8) != 0 ? "" : str36, (i2 & 16) != 0 ? "" : str37, (i2 & 32) != 0 ? "" : str38, (i2 & 64) != 0 ? "" : str39, (i2 & 128) != 0 ? "" : str40, (i2 & 256) != 0 ? "" : str41, (i2 & 512) != 0 ? "" : str42, (i2 & 1024) != 0 ? "" : str43, (i2 & 2048) != 0 ? "" : str44, (i2 & 4096) != 0 ? "" : str45, (i2 & 8192) != 0 ? "" : str46, (i2 & 16384) != 0 ? "" : str47);
    }
}
