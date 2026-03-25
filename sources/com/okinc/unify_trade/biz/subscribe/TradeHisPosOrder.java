package com.okinc.unify_trade.biz.subscribe;

import android.os.Parcel;
import android.os.Parcelable;
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
public final class TradeHisPosOrder implements Parcelable {
    private String category;
    private String fee;
    private String feeCcy;
    private String feeRate;
    private String fillPx;
    private String fillSz;
    private String fillTime;
    private String ordId;
    private String ordType;
    private String paginateId;
    private String paginateTime;
    private String pnl;
    private String pnlCcy;
    private String posSide;
    private String rebate;
    private String rebateCcy;
    private String side;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TradeHisPosOrder> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<TradeHisPosOrder> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeHisPosOrder createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TradeHisPosOrder(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeHisPosOrder[] newArray(int i) {
            return new TradeHisPosOrder[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TradeHisPosOrder() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 131071, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.category;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.feeCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.ordId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.rebate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.rebateCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.feeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.paginateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.paginateId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.fillTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.pnlCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.fillSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.fillPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeHisPosOrder copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17) {
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
        return new TradeHisPosOrder(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17);
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
        if (!(obj instanceof TradeHisPosOrder)) {
            return false;
        }
        TradeHisPosOrder tradeHisPosOrder = (TradeHisPosOrder) obj;
        return Intrinsics.EZpvd((Object) this.category, (Object) tradeHisPosOrder.category) && Intrinsics.EZpvd((Object) this.side, (Object) tradeHisPosOrder.side) && Intrinsics.EZpvd((Object) this.posSide, (Object) tradeHisPosOrder.posSide) && Intrinsics.EZpvd((Object) this.fillTime, (Object) tradeHisPosOrder.fillTime) && Intrinsics.EZpvd((Object) this.pnl, (Object) tradeHisPosOrder.pnl) && Intrinsics.EZpvd((Object) this.pnlCcy, (Object) tradeHisPosOrder.pnlCcy) && Intrinsics.EZpvd((Object) this.fillSz, (Object) tradeHisPosOrder.fillSz) && Intrinsics.EZpvd((Object) this.fillPx, (Object) tradeHisPosOrder.fillPx) && Intrinsics.EZpvd((Object) this.fee, (Object) tradeHisPosOrder.fee) && Intrinsics.EZpvd((Object) this.feeCcy, (Object) tradeHisPosOrder.feeCcy) && Intrinsics.EZpvd((Object) this.ordId, (Object) tradeHisPosOrder.ordId) && Intrinsics.EZpvd((Object) this.rebate, (Object) tradeHisPosOrder.rebate) && Intrinsics.EZpvd((Object) this.rebateCcy, (Object) tradeHisPosOrder.rebateCcy) && Intrinsics.EZpvd((Object) this.feeRate, (Object) tradeHisPosOrder.feeRate) && Intrinsics.EZpvd((Object) this.ordType, (Object) tradeHisPosOrder.ordType) && Intrinsics.EZpvd((Object) this.paginateTime, (Object) tradeHisPosOrder.paginateTime) && Intrinsics.EZpvd((Object) this.paginateId, (Object) tradeHisPosOrder.paginateId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCategory() {
        return this.category;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFee() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeCcy() {
        return this.feeCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeRate() {
        return this.feeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFillPx() {
        return this.fillPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFillSz() {
        return this.fillSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFillTime() {
        return this.fillTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdId() {
        return this.ordId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdType() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaginateId() {
        return this.paginateId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaginateTime() {
        return this.paginateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnl() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnlCcy() {
        return this.pnlCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosSide() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRebate() {
        return this.rebate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRebateCcy() {
        return this.rebateCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSide() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((this.category.hashCode() * 31) + this.side.hashCode()) * 31) + this.posSide.hashCode()) * 31) + this.fillTime.hashCode()) * 31) + this.pnl.hashCode()) * 31) + this.pnlCcy.hashCode()) * 31) + this.fillSz.hashCode()) * 31) + this.fillPx.hashCode()) * 31) + this.fee.hashCode()) * 31) + this.feeCcy.hashCode()) * 31) + this.ordId.hashCode()) * 31) + this.rebate.hashCode()) * 31) + this.rebateCcy.hashCode()) * 31) + this.feeRate.hashCode()) * 31) + this.ordType.hashCode()) * 31) + this.paginateTime.hashCode()) * 31) + this.paginateId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCategory(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.category = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFee(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFeeCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.feeCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFeeRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.feeRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFillPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fillPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFillSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fillSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFillTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fillTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ordId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ordType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaginateId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.paginateId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaginateTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.paginateTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPnl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pnl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPnlCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pnlCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPosSide(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.posSide = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRebate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.rebate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRebateCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.rebateCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSide(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.side = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TradeHisPosOrder(category=" + this.category + ", side=" + this.side + ", posSide=" + this.posSide + ", fillTime=" + this.fillTime + ", pnl=" + this.pnl + ", pnlCcy=" + this.pnlCcy + ", fillSz=" + this.fillSz + ", fillPx=" + this.fillPx + ", fee=" + this.fee + ", feeCcy=" + this.feeCcy + ", ordId=" + this.ordId + ", rebate=" + this.rebate + ", rebateCcy=" + this.rebateCcy + ", feeRate=" + this.feeRate + ", ordType=" + this.ordType + ", paginateTime=" + this.paginateTime + ", paginateId=" + this.paginateId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.category);
        parcel.writeString(this.side);
        parcel.writeString(this.posSide);
        parcel.writeString(this.fillTime);
        parcel.writeString(this.pnl);
        parcel.writeString(this.pnlCcy);
        parcel.writeString(this.fillSz);
        parcel.writeString(this.fillPx);
        parcel.writeString(this.fee);
        parcel.writeString(this.feeCcy);
        parcel.writeString(this.ordId);
        parcel.writeString(this.rebate);
        parcel.writeString(this.rebateCcy);
        parcel.writeString(this.feeRate);
        parcel.writeString(this.ordType);
        parcel.writeString(this.paginateTime);
        parcel.writeString(this.paginateId);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.TradeHisPosOrder.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TradeHisPosOrder> serializer() {
            return TradeHisPosOrder$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TradeHisPosOrder(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.category = "";
        } else {
            this.category = str;
        }
        if ((i & 2) == 0) {
            this.side = "";
        } else {
            this.side = str2;
        }
        if ((i & 4) == 0) {
            this.posSide = "";
        } else {
            this.posSide = str3;
        }
        if ((i & 8) == 0) {
            this.fillTime = "";
        } else {
            this.fillTime = str4;
        }
        if ((i & 16) == 0) {
            this.pnl = "";
        } else {
            this.pnl = str5;
        }
        if ((i & 32) == 0) {
            this.pnlCcy = "";
        } else {
            this.pnlCcy = str6;
        }
        if ((i & 64) == 0) {
            this.fillSz = "";
        } else {
            this.fillSz = str7;
        }
        if ((i & 128) == 0) {
            this.fillPx = "";
        } else {
            this.fillPx = str8;
        }
        if ((i & 256) == 0) {
            this.fee = "";
        } else {
            this.fee = str9;
        }
        if ((i & 512) == 0) {
            this.feeCcy = "";
        } else {
            this.feeCcy = str10;
        }
        if ((i & 1024) == 0) {
            this.ordId = "";
        } else {
            this.ordId = str11;
        }
        if ((i & 2048) == 0) {
            this.rebate = "";
        } else {
            this.rebate = str12;
        }
        if ((i & 4096) == 0) {
            this.rebateCcy = "";
        } else {
            this.rebateCcy = str13;
        }
        if ((i & 8192) == 0) {
            this.feeRate = "";
        } else {
            this.feeRate = str14;
        }
        if ((i & 16384) == 0) {
            this.ordType = "";
        } else {
            this.ordType = str15;
        }
        if ((32768 & i) == 0) {
            this.paginateTime = "";
        } else {
            this.paginateTime = str16;
        }
        if ((i & 65536) == 0) {
            this.paginateId = "";
        } else {
            this.paginateId = str17;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(TradeHisPosOrder tradeHisPosOrder, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) tradeHisPosOrder.category, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, tradeHisPosOrder.category);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) tradeHisPosOrder.side, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, tradeHisPosOrder.side);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) tradeHisPosOrder.posSide, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, tradeHisPosOrder.posSide);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) tradeHisPosOrder.fillTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, tradeHisPosOrder.fillTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) tradeHisPosOrder.pnl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, tradeHisPosOrder.pnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) tradeHisPosOrder.pnlCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, tradeHisPosOrder.pnlCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) tradeHisPosOrder.fillSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, tradeHisPosOrder.fillSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) tradeHisPosOrder.fillPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, tradeHisPosOrder.fillPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) tradeHisPosOrder.fee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, tradeHisPosOrder.fee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) tradeHisPosOrder.feeCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, tradeHisPosOrder.feeCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) tradeHisPosOrder.ordId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, tradeHisPosOrder.ordId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) tradeHisPosOrder.rebate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, tradeHisPosOrder.rebate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) tradeHisPosOrder.rebateCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, tradeHisPosOrder.rebateCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) tradeHisPosOrder.feeRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, tradeHisPosOrder.feeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) tradeHisPosOrder.ordType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, tradeHisPosOrder.ordType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) tradeHisPosOrder.paginateTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, tradeHisPosOrder.paginateTime);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) && Intrinsics.EZpvd((Object) tradeHisPosOrder.paginateId, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 16, tradeHisPosOrder.paginateId);
    }

    public TradeHisPosOrder(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17) {
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
        this.category = str;
        this.side = str2;
        this.posSide = str3;
        this.fillTime = str4;
        this.pnl = str5;
        this.pnlCcy = str6;
        this.fillSz = str7;
        this.fillPx = str8;
        this.fee = str9;
        this.feeCcy = str10;
        this.ordId = str11;
        this.rebate = str12;
        this.rebateCcy = str13;
        this.feeRate = str14;
        this.ordType = str15;
        this.paginateTime = str16;
        this.paginateId = str17;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00ba: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r36v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r36v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r36v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r36v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r36v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r36v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r36v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r36v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r36v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r36v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r36v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r36v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r36v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r36v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r36v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r36v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r36v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:128) call: com.okinc.unify_trade.biz.subscribe.TradeHisPosOrder.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TradeHisPosOrder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17);
    }
}
