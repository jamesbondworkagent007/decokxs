package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class OrderConfirmData implements Parcelable {
    public static final Parcelable.Creator<OrderConfirmData> CREATOR = new Creator();
    public final OrderShowConfirmInfo EZpvd;
    public TradeStrategyOrderGroupData KWHzl;
    public TradeOrderGroupData copydefault;

    public static final class Creator implements Parcelable.Creator<OrderConfirmData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderConfirmData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OrderConfirmData(OrderShowConfirmInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : TradeOrderGroupData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? TradeStrategyOrderGroupData.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderConfirmData[] newArray(int i) {
            return new OrderConfirmData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OrderConfirmData copy$default(OrderConfirmData orderConfirmData, OrderShowConfirmInfo orderShowConfirmInfo, TradeOrderGroupData tradeOrderGroupData, TradeStrategyOrderGroupData tradeStrategyOrderGroupData, int i, Object obj) {
        if ((i & 1) != 0) {
            orderShowConfirmInfo = orderConfirmData.EZpvd;
        }
        if ((i & 2) != 0) {
            tradeOrderGroupData = orderConfirmData.copydefault;
        }
        if ((i & 4) != 0) {
            tradeStrategyOrderGroupData = orderConfirmData.KWHzl;
        }
        return orderConfirmData.KWHzl(orderShowConfirmInfo, tradeOrderGroupData, tradeStrategyOrderGroupData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderConfirmData KWHzl(@NotNull OrderShowConfirmInfo orderShowConfirmInfo, TradeOrderGroupData tradeOrderGroupData, TradeStrategyOrderGroupData tradeStrategyOrderGroupData) {
        Intrinsics.checkNotNullParameter(orderShowConfirmInfo, "");
        return new OrderConfirmData(orderShowConfirmInfo, tradeOrderGroupData, tradeStrategyOrderGroupData);
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
        if (!(obj instanceof OrderConfirmData)) {
            return false;
        }
        OrderConfirmData orderConfirmData = (OrderConfirmData) obj;
        return Intrinsics.EZpvd(this.EZpvd, orderConfirmData.EZpvd) && Intrinsics.EZpvd(this.copydefault, orderConfirmData.copydefault) && Intrinsics.EZpvd(this.KWHzl, orderConfirmData.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        TradeOrderGroupData tradeOrderGroupData = this.copydefault;
        int iHashCode2 = tradeOrderGroupData == null ? 0 : tradeOrderGroupData.hashCode();
        TradeStrategyOrderGroupData tradeStrategyOrderGroupData = this.KWHzl;
        return (((iHashCode * 31) + iHashCode2) * 31) + (tradeStrategyOrderGroupData != null ? tradeStrategyOrderGroupData.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OrderConfirmData(orderShowData=" + this.EZpvd + ", limit=" + this.copydefault + ", strategy=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.EZpvd.writeToParcel(parcel, i);
        TradeOrderGroupData tradeOrderGroupData = this.copydefault;
        if (tradeOrderGroupData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tradeOrderGroupData.writeToParcel(parcel, i);
        }
        TradeStrategyOrderGroupData tradeStrategyOrderGroupData = this.KWHzl;
        if (tradeStrategyOrderGroupData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tradeStrategyOrderGroupData.writeToParcel(parcel, i);
        }
    }

    public OrderConfirmData(@NotNull OrderShowConfirmInfo orderShowConfirmInfo, TradeOrderGroupData tradeOrderGroupData, TradeStrategyOrderGroupData tradeStrategyOrderGroupData) {
        Intrinsics.checkNotNullParameter(orderShowConfirmInfo, "");
        this.EZpvd = orderShowConfirmInfo;
        this.copydefault = tradeOrderGroupData;
        this.KWHzl = tradeStrategyOrderGroupData;
    }
}
