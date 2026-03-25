package com.okinc.unify_trade.biz.subscribe;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class TradeAllOrderApiExternalModel implements Parcelable {
    private String activatePrice;
    private String actualAmount;
    private String actualPrice;
    private String fee;
    private String fillPrice;
    private String filledAmount;
    private String filledTime;
    private String filledValue;
    private String instrument;
    private boolean isUprising;
    private String leverage;
    private String marginMode;
    private String orderOptions;
    private String orderPrice;
    private String orderTime;
    private String orderValue;
    private String pnl;
    private String pnlRate;
    private String reduceOnly;
    private String side;
    private String slOrderPrice;
    private String slTriggerPrice;
    private String status;
    private String symbol;
    private String totalAmount;
    private String tpOrderPrice;
    private String tpSl;
    private String tpTriggerPrice;
    private String trailVariance;
    private String triggerPrice;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TradeAllOrderApiExternalModel> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TradeAllOrderApiExternalModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeAllOrderApiExternalModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TradeAllOrderApiExternalModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeAllOrderApiExternalModel[] newArray(int i) {
            return new TradeAllOrderApiExternalModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TradeAllOrderApiExternalModel() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, LockFreeTaskQueueCore.MAX_CAPACITY_MASK, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.fillPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.filledAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.filledValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.tpTriggerPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.tpOrderPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.slTriggerPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.slOrderPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.reduceOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.filledTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instrument;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.pnlRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.orderOptions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.trailVariance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.activatePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.tpSl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component26() {
        return this.isUprising;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.triggerPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.actualPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.orderTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.actualAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.marginMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.leverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.orderPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.totalAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.orderValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeAllOrderApiExternalModel copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, boolean z, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29) {
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
        return new TradeAllOrderApiExternalModel(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, z, str26, str27, str28, str29);
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
        if (!(obj instanceof TradeAllOrderApiExternalModel)) {
            return false;
        }
        TradeAllOrderApiExternalModel tradeAllOrderApiExternalModel = (TradeAllOrderApiExternalModel) obj;
        return Intrinsics.EZpvd((Object) this.symbol, (Object) tradeAllOrderApiExternalModel.symbol) && Intrinsics.EZpvd((Object) this.instrument, (Object) tradeAllOrderApiExternalModel.instrument) && Intrinsics.EZpvd((Object) this.orderTime, (Object) tradeAllOrderApiExternalModel.orderTime) && Intrinsics.EZpvd((Object) this.side, (Object) tradeAllOrderApiExternalModel.side) && Intrinsics.EZpvd((Object) this.marginMode, (Object) tradeAllOrderApiExternalModel.marginMode) && Intrinsics.EZpvd((Object) this.leverage, (Object) tradeAllOrderApiExternalModel.leverage) && Intrinsics.EZpvd((Object) this.orderPrice, (Object) tradeAllOrderApiExternalModel.orderPrice) && Intrinsics.EZpvd((Object) this.totalAmount, (Object) tradeAllOrderApiExternalModel.totalAmount) && Intrinsics.EZpvd((Object) this.orderValue, (Object) tradeAllOrderApiExternalModel.orderValue) && Intrinsics.EZpvd((Object) this.fillPrice, (Object) tradeAllOrderApiExternalModel.fillPrice) && Intrinsics.EZpvd((Object) this.filledAmount, (Object) tradeAllOrderApiExternalModel.filledAmount) && Intrinsics.EZpvd((Object) this.filledValue, (Object) tradeAllOrderApiExternalModel.filledValue) && Intrinsics.EZpvd((Object) this.tpTriggerPrice, (Object) tradeAllOrderApiExternalModel.tpTriggerPrice) && Intrinsics.EZpvd((Object) this.tpOrderPrice, (Object) tradeAllOrderApiExternalModel.tpOrderPrice) && Intrinsics.EZpvd((Object) this.slTriggerPrice, (Object) tradeAllOrderApiExternalModel.slTriggerPrice) && Intrinsics.EZpvd((Object) this.slOrderPrice, (Object) tradeAllOrderApiExternalModel.slOrderPrice) && Intrinsics.EZpvd((Object) this.reduceOnly, (Object) tradeAllOrderApiExternalModel.reduceOnly) && Intrinsics.EZpvd((Object) this.status, (Object) tradeAllOrderApiExternalModel.status) && Intrinsics.EZpvd((Object) this.filledTime, (Object) tradeAllOrderApiExternalModel.filledTime) && Intrinsics.EZpvd((Object) this.pnl, (Object) tradeAllOrderApiExternalModel.pnl) && Intrinsics.EZpvd((Object) this.pnlRate, (Object) tradeAllOrderApiExternalModel.pnlRate) && Intrinsics.EZpvd((Object) this.orderOptions, (Object) tradeAllOrderApiExternalModel.orderOptions) && Intrinsics.EZpvd((Object) this.trailVariance, (Object) tradeAllOrderApiExternalModel.trailVariance) && Intrinsics.EZpvd((Object) this.activatePrice, (Object) tradeAllOrderApiExternalModel.activatePrice) && Intrinsics.EZpvd((Object) this.tpSl, (Object) tradeAllOrderApiExternalModel.tpSl) && this.isUprising == tradeAllOrderApiExternalModel.isUprising && Intrinsics.EZpvd((Object) this.fee, (Object) tradeAllOrderApiExternalModel.fee) && Intrinsics.EZpvd((Object) this.triggerPrice, (Object) tradeAllOrderApiExternalModel.triggerPrice) && Intrinsics.EZpvd((Object) this.actualPrice, (Object) tradeAllOrderApiExternalModel.actualPrice) && Intrinsics.EZpvd((Object) this.actualAmount, (Object) tradeAllOrderApiExternalModel.actualAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActivatePrice() {
        return this.activatePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActualAmount() {
        return this.actualAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActualPrice() {
        return this.actualPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFee() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFillPrice() {
        return this.fillPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFilledAmount() {
        return this.filledAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFilledTime() {
        return this.filledTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFilledValue() {
        return this.filledValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstrument() {
        return this.instrument;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLeverage() {
        return this.leverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarginMode() {
        return this.marginMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderOptions() {
        return this.orderOptions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderPrice() {
        return this.orderPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderTime() {
        return this.orderTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderValue() {
        return this.orderValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnl() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnlRate() {
        return this.pnlRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReduceOnly() {
        return this.reduceOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSide() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlOrderPrice() {
        return this.slOrderPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlTriggerPrice() {
        return this.slTriggerPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalAmount() {
        return this.totalAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpOrderPrice() {
        return this.tpOrderPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpSl() {
        return this.tpSl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpTriggerPrice() {
        return this.tpTriggerPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTrailVariance() {
        return this.trailVariance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerPrice() {
        return this.triggerPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.symbol.hashCode() * 31) + this.instrument.hashCode()) * 31) + this.orderTime.hashCode()) * 31) + this.side.hashCode()) * 31) + this.marginMode.hashCode()) * 31) + this.leverage.hashCode()) * 31) + this.orderPrice.hashCode()) * 31) + this.totalAmount.hashCode()) * 31) + this.orderValue.hashCode()) * 31) + this.fillPrice.hashCode()) * 31) + this.filledAmount.hashCode()) * 31) + this.filledValue.hashCode()) * 31) + this.tpTriggerPrice.hashCode()) * 31) + this.tpOrderPrice.hashCode()) * 31) + this.slTriggerPrice.hashCode()) * 31) + this.slOrderPrice.hashCode()) * 31) + this.reduceOnly.hashCode()) * 31) + this.status.hashCode()) * 31) + this.filledTime.hashCode()) * 31) + this.pnl.hashCode()) * 31) + this.pnlRate.hashCode()) * 31) + this.orderOptions.hashCode()) * 31) + this.trailVariance.hashCode()) * 31) + this.activatePrice.hashCode()) * 31) + this.tpSl.hashCode()) * 31) + Boolean.hashCode(this.isUprising)) * 31) + this.fee.hashCode()) * 31) + this.triggerPrice.hashCode()) * 31) + this.actualPrice.hashCode()) * 31) + this.actualAmount.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isUprising() {
        return this.isUprising;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActivatePrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.activatePrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActualAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.actualAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActualPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.actualPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFee(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFillPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fillPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFilledAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.filledAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFilledTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.filledTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFilledValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.filledValue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstrument(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instrument = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLeverage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.leverage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMarginMode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.marginMode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderOptions(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.orderOptions = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.orderPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.orderTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.orderValue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPnl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pnl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPnlRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pnlRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReduceOnly(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.reduceOnly = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSide(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.side = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlOrderPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.slOrderPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlTriggerPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.slTriggerPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.status = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.symbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.totalAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpOrderPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tpOrderPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpSl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tpSl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpTriggerPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tpTriggerPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTrailVariance(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.trailVariance = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.triggerPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUprising(boolean z) {
        this.isUprising = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TradeAllOrderApiExternalModel(symbol=" + this.symbol + ", instrument=" + this.instrument + ", orderTime=" + this.orderTime + ", side=" + this.side + ", marginMode=" + this.marginMode + ", leverage=" + this.leverage + ", orderPrice=" + this.orderPrice + ", totalAmount=" + this.totalAmount + ", orderValue=" + this.orderValue + ", fillPrice=" + this.fillPrice + ", filledAmount=" + this.filledAmount + ", filledValue=" + this.filledValue + ", tpTriggerPrice=" + this.tpTriggerPrice + ", tpOrderPrice=" + this.tpOrderPrice + ", slTriggerPrice=" + this.slTriggerPrice + ", slOrderPrice=" + this.slOrderPrice + ", reduceOnly=" + this.reduceOnly + ", status=" + this.status + ", filledTime=" + this.filledTime + ", pnl=" + this.pnl + ", pnlRate=" + this.pnlRate + ", orderOptions=" + this.orderOptions + ", trailVariance=" + this.trailVariance + ", activatePrice=" + this.activatePrice + ", tpSl=" + this.tpSl + ", isUprising=" + this.isUprising + ", fee=" + this.fee + ", triggerPrice=" + this.triggerPrice + ", actualPrice=" + this.actualPrice + ", actualAmount=" + this.actualAmount + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.symbol);
        parcel.writeString(this.instrument);
        parcel.writeString(this.orderTime);
        parcel.writeString(this.side);
        parcel.writeString(this.marginMode);
        parcel.writeString(this.leverage);
        parcel.writeString(this.orderPrice);
        parcel.writeString(this.totalAmount);
        parcel.writeString(this.orderValue);
        parcel.writeString(this.fillPrice);
        parcel.writeString(this.filledAmount);
        parcel.writeString(this.filledValue);
        parcel.writeString(this.tpTriggerPrice);
        parcel.writeString(this.tpOrderPrice);
        parcel.writeString(this.slTriggerPrice);
        parcel.writeString(this.slOrderPrice);
        parcel.writeString(this.reduceOnly);
        parcel.writeString(this.status);
        parcel.writeString(this.filledTime);
        parcel.writeString(this.pnl);
        parcel.writeString(this.pnlRate);
        parcel.writeString(this.orderOptions);
        parcel.writeString(this.trailVariance);
        parcel.writeString(this.activatePrice);
        parcel.writeString(this.tpSl);
        parcel.writeInt(this.isUprising ? 1 : 0);
        parcel.writeString(this.fee);
        parcel.writeString(this.triggerPrice);
        parcel.writeString(this.actualPrice);
        parcel.writeString(this.actualAmount);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.TradeAllOrderApiExternalModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TradeAllOrderApiExternalModel> serializer() {
            return TradeAllOrderApiExternalModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TradeAllOrderApiExternalModel(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, boolean z, String str26, String str27, String str28, String str29, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.symbol = "";
        } else {
            this.symbol = str;
        }
        if ((i & 2) == 0) {
            this.instrument = "";
        } else {
            this.instrument = str2;
        }
        if ((i & 4) == 0) {
            this.orderTime = "";
        } else {
            this.orderTime = str3;
        }
        if ((i & 8) == 0) {
            this.side = "";
        } else {
            this.side = str4;
        }
        if ((i & 16) == 0) {
            this.marginMode = "";
        } else {
            this.marginMode = str5;
        }
        if ((i & 32) == 0) {
            this.leverage = "";
        } else {
            this.leverage = str6;
        }
        if ((i & 64) == 0) {
            this.orderPrice = "";
        } else {
            this.orderPrice = str7;
        }
        if ((i & 128) == 0) {
            this.totalAmount = "";
        } else {
            this.totalAmount = str8;
        }
        if ((i & 256) == 0) {
            this.orderValue = "";
        } else {
            this.orderValue = str9;
        }
        if ((i & 512) == 0) {
            this.fillPrice = "";
        } else {
            this.fillPrice = str10;
        }
        if ((i & 1024) == 0) {
            this.filledAmount = "";
        } else {
            this.filledAmount = str11;
        }
        if ((i & 2048) == 0) {
            this.filledValue = "";
        } else {
            this.filledValue = str12;
        }
        if ((i & 4096) == 0) {
            this.tpTriggerPrice = "";
        } else {
            this.tpTriggerPrice = str13;
        }
        if ((i & 8192) == 0) {
            this.tpOrderPrice = "";
        } else {
            this.tpOrderPrice = str14;
        }
        if ((i & 16384) == 0) {
            this.slTriggerPrice = "";
        } else {
            this.slTriggerPrice = str15;
        }
        if ((32768 & i) == 0) {
            this.slOrderPrice = "";
        } else {
            this.slOrderPrice = str16;
        }
        if ((65536 & i) == 0) {
            this.reduceOnly = "";
        } else {
            this.reduceOnly = str17;
        }
        if ((131072 & i) == 0) {
            this.status = "";
        } else {
            this.status = str18;
        }
        if ((262144 & i) == 0) {
            this.filledTime = "";
        } else {
            this.filledTime = str19;
        }
        if ((524288 & i) == 0) {
            this.pnl = "";
        } else {
            this.pnl = str20;
        }
        if ((1048576 & i) == 0) {
            this.pnlRate = "";
        } else {
            this.pnlRate = str21;
        }
        if ((2097152 & i) == 0) {
            this.orderOptions = "";
        } else {
            this.orderOptions = str22;
        }
        if ((4194304 & i) == 0) {
            this.trailVariance = "";
        } else {
            this.trailVariance = str23;
        }
        if ((8388608 & i) == 0) {
            this.activatePrice = "";
        } else {
            this.activatePrice = str24;
        }
        if ((16777216 & i) == 0) {
            this.tpSl = "";
        } else {
            this.tpSl = str25;
        }
        this.isUprising = (33554432 & i) == 0 ? false : z;
        if ((67108864 & i) == 0) {
            this.fee = "";
        } else {
            this.fee = str26;
        }
        if ((134217728 & i) == 0) {
            this.triggerPrice = "";
        } else {
            this.triggerPrice = str27;
        }
        if ((268435456 & i) == 0) {
            this.actualPrice = "";
        } else {
            this.actualPrice = str28;
        }
        if ((i & 536870912) == 0) {
            this.actualAmount = "";
        } else {
            this.actualAmount = str29;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(TradeAllOrderApiExternalModel tradeAllOrderApiExternalModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) tradeAllOrderApiExternalModel.symbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, tradeAllOrderApiExternalModel.symbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) tradeAllOrderApiExternalModel.instrument, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, tradeAllOrderApiExternalModel.instrument);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) tradeAllOrderApiExternalModel.orderTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, tradeAllOrderApiExternalModel.orderTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) tradeAllOrderApiExternalModel.side, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, tradeAllOrderApiExternalModel.side);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) tradeAllOrderApiExternalModel.marginMode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, tradeAllOrderApiExternalModel.marginMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) tradeAllOrderApiExternalModel.leverage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, tradeAllOrderApiExternalModel.leverage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) tradeAllOrderApiExternalModel.orderPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, tradeAllOrderApiExternalModel.orderPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) tradeAllOrderApiExternalModel.totalAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, tradeAllOrderApiExternalModel.totalAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) tradeAllOrderApiExternalModel.orderValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, tradeAllOrderApiExternalModel.orderValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) tradeAllOrderApiExternalModel.fillPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, tradeAllOrderApiExternalModel.fillPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) tradeAllOrderApiExternalModel.filledAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, tradeAllOrderApiExternalModel.filledAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) tradeAllOrderApiExternalModel.filledValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, tradeAllOrderApiExternalModel.filledValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) tradeAllOrderApiExternalModel.tpTriggerPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, tradeAllOrderApiExternalModel.tpTriggerPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) tradeAllOrderApiExternalModel.tpOrderPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, tradeAllOrderApiExternalModel.tpOrderPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) tradeAllOrderApiExternalModel.slTriggerPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, tradeAllOrderApiExternalModel.slTriggerPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) tradeAllOrderApiExternalModel.slOrderPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, tradeAllOrderApiExternalModel.slOrderPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) tradeAllOrderApiExternalModel.reduceOnly, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, tradeAllOrderApiExternalModel.reduceOnly);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) tradeAllOrderApiExternalModel.status, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, tradeAllOrderApiExternalModel.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) tradeAllOrderApiExternalModel.filledTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, tradeAllOrderApiExternalModel.filledTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) tradeAllOrderApiExternalModel.pnl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, tradeAllOrderApiExternalModel.pnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) tradeAllOrderApiExternalModel.pnlRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, tradeAllOrderApiExternalModel.pnlRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) tradeAllOrderApiExternalModel.orderOptions, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, tradeAllOrderApiExternalModel.orderOptions);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) tradeAllOrderApiExternalModel.trailVariance, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, tradeAllOrderApiExternalModel.trailVariance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) tradeAllOrderApiExternalModel.activatePrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, tradeAllOrderApiExternalModel.activatePrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) tradeAllOrderApiExternalModel.tpSl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, tradeAllOrderApiExternalModel.tpSl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || tradeAllOrderApiExternalModel.isUprising) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 25, tradeAllOrderApiExternalModel.isUprising);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) tradeAllOrderApiExternalModel.fee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, tradeAllOrderApiExternalModel.fee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) tradeAllOrderApiExternalModel.triggerPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, tradeAllOrderApiExternalModel.triggerPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) tradeAllOrderApiExternalModel.actualPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, tradeAllOrderApiExternalModel.actualPrice);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) && Intrinsics.EZpvd((Object) tradeAllOrderApiExternalModel.actualAmount, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 29, tradeAllOrderApiExternalModel.actualAmount);
    }

    public TradeAllOrderApiExternalModel(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, boolean z, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29) {
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
        this.symbol = str;
        this.instrument = str2;
        this.orderTime = str3;
        this.side = str4;
        this.marginMode = str5;
        this.leverage = str6;
        this.orderPrice = str7;
        this.totalAmount = str8;
        this.orderValue = str9;
        this.fillPrice = str10;
        this.filledAmount = str11;
        this.filledValue = str12;
        this.tpTriggerPrice = str13;
        this.tpOrderPrice = str14;
        this.slTriggerPrice = str15;
        this.slOrderPrice = str16;
        this.reduceOnly = str17;
        this.status = str18;
        this.filledTime = str19;
        this.pnl = str20;
        this.pnlRate = str21;
        this.orderOptions = str22;
        this.trailVariance = str23;
        this.activatePrice = str24;
        this.tpSl = str25;
        this.isUprising = z;
        this.fee = str26;
        this.triggerPrice = str27;
        this.actualPrice = str28;
        this.actualAmount = str29;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0163: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r62v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r62v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r62v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r62v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r62v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r62v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r62v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r62v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r62v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r62v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r62v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r62v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r62v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r62v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r62v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r62v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r62v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0098: ARITH (r62v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a3: ARITH (r62v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ae: ARITH (r62v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b9: ARITH (r62v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c4: ARITH (r62v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00cf: ARITH (r62v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00da: ARITH (r62v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e5: ARITH (r62v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00f0: ARITH (r62v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? false : (r57v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fb: ARITH (r62v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0106: ARITH (r62v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0111: ARITH (r62v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x011c: ARITH (r62v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? ("") : (r61v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:11) call: com.okinc.unify_trade.biz.subscribe.TradeAllOrderApiExternalModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TradeAllOrderApiExternalModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, boolean z, String str26, String str27, String str28, String str29, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17, (i & 131072) != 0 ? "" : str18, (i & 262144) != 0 ? "" : str19, (i & 524288) != 0 ? "" : str20, (i & 1048576) != 0 ? "" : str21, (i & 2097152) != 0 ? "" : str22, (i & 4194304) != 0 ? "" : str23, (i & 8388608) != 0 ? "" : str24, (i & 16777216) != 0 ? "" : str25, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? false : z, (i & 67108864) != 0 ? "" : str26, (i & 134217728) != 0 ? "" : str27, (i & 268435456) != 0 ? "" : str28, (i & 536870912) != 0 ? "" : str29);
    }
}
