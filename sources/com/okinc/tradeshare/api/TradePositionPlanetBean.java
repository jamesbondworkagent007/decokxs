package com.okinc.tradeshare.api;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class TradePositionPlanetBean implements Parcelable {
    public static final int $stable = 0;
    private final String cTimestamp;
    private final String ccy;
    private final String deepLink;
    private final String entryPrice;
    private final String instId;
    private final String instName;
    private final String instType;
    private final boolean isPositive;
    private final String leverage;
    private final String listTime;
    private final String mgnMode;
    private final String pnl;
    private final String pnlPrice;
    private final String pnlPriceLabel;
    private final String pnlRate;
    private final String pnlRiseFall;
    private final String pnlUnit;
    private final String posDirection;
    private final String posId;
    private final String shareType;
    private final String side;
    private final String tag;
    private final String tokenIcon;
    private final String uTimestamp;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<TradePositionPlanetBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TradePositionPlanetBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradePositionPlanetBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TradePositionPlanetBean(parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradePositionPlanetBean[] newArray(int i) {
            return new TradePositionPlanetBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.posId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.listTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.instName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.tokenIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.leverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.shareType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.pnlUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.pnlRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.isPositive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.pnlRiseFall;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.entryPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.pnlPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.pnlPriceLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.deepLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.mgnMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.posDirection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.cTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.uTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradePositionPlanetBean copy(@NotNull String str, boolean z, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23) {
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
        return new TradePositionPlanetBean(str, z, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23);
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
        if (!(obj instanceof TradePositionPlanetBean)) {
            return false;
        }
        TradePositionPlanetBean tradePositionPlanetBean = (TradePositionPlanetBean) obj;
        return Intrinsics.EZpvd((Object) this.posId, (Object) tradePositionPlanetBean.posId) && this.isPositive == tradePositionPlanetBean.isPositive && Intrinsics.EZpvd((Object) this.side, (Object) tradePositionPlanetBean.side) && Intrinsics.EZpvd((Object) this.instId, (Object) tradePositionPlanetBean.instId) && Intrinsics.EZpvd((Object) this.instType, (Object) tradePositionPlanetBean.instType) && Intrinsics.EZpvd((Object) this.mgnMode, (Object) tradePositionPlanetBean.mgnMode) && Intrinsics.EZpvd((Object) this.posDirection, (Object) tradePositionPlanetBean.posDirection) && Intrinsics.EZpvd((Object) this.cTimestamp, (Object) tradePositionPlanetBean.cTimestamp) && Intrinsics.EZpvd((Object) this.uTimestamp, (Object) tradePositionPlanetBean.uTimestamp) && Intrinsics.EZpvd((Object) this.listTime, (Object) tradePositionPlanetBean.listTime) && Intrinsics.EZpvd((Object) this.instName, (Object) tradePositionPlanetBean.instName) && Intrinsics.EZpvd((Object) this.tokenIcon, (Object) tradePositionPlanetBean.tokenIcon) && Intrinsics.EZpvd((Object) this.ccy, (Object) tradePositionPlanetBean.ccy) && Intrinsics.EZpvd((Object) this.tag, (Object) tradePositionPlanetBean.tag) && Intrinsics.EZpvd((Object) this.leverage, (Object) tradePositionPlanetBean.leverage) && Intrinsics.EZpvd((Object) this.shareType, (Object) tradePositionPlanetBean.shareType) && Intrinsics.EZpvd((Object) this.pnl, (Object) tradePositionPlanetBean.pnl) && Intrinsics.EZpvd((Object) this.pnlUnit, (Object) tradePositionPlanetBean.pnlUnit) && Intrinsics.EZpvd((Object) this.pnlRate, (Object) tradePositionPlanetBean.pnlRate) && Intrinsics.EZpvd((Object) this.pnlRiseFall, (Object) tradePositionPlanetBean.pnlRiseFall) && Intrinsics.EZpvd((Object) this.entryPrice, (Object) tradePositionPlanetBean.entryPrice) && Intrinsics.EZpvd((Object) this.pnlPrice, (Object) tradePositionPlanetBean.pnlPrice) && Intrinsics.EZpvd((Object) this.pnlPriceLabel, (Object) tradePositionPlanetBean.pnlPriceLabel) && Intrinsics.EZpvd((Object) this.deepLink, (Object) tradePositionPlanetBean.deepLink);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCTimestamp() {
        return this.cTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeepLink() {
        return this.deepLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEntryPrice() {
        return this.entryPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstName() {
        return this.instName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLeverage() {
        return this.leverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getListTime() {
        return this.listTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMgnMode() {
        return this.mgnMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnl() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnlPrice() {
        return this.pnlPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnlPriceLabel() {
        return this.pnlPriceLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnlRate() {
        return this.pnlRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnlRiseFall() {
        return this.pnlRiseFall;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnlUnit() {
        return this.pnlUnit;
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
    public final String getShareType() {
        return this.shareType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSide() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTag() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenIcon() {
        return this.tokenIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUTimestamp() {
        return this.uTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.posId.hashCode();
        int iHashCode2 = Boolean.hashCode(this.isPositive);
        int iHashCode3 = this.side.hashCode();
        int iHashCode4 = this.instId.hashCode();
        int iHashCode5 = this.instType.hashCode();
        int iHashCode6 = this.mgnMode.hashCode();
        int iHashCode7 = this.posDirection.hashCode();
        int iHashCode8 = this.cTimestamp.hashCode();
        int iHashCode9 = this.uTimestamp.hashCode();
        int iHashCode10 = this.listTime.hashCode();
        int iHashCode11 = this.instName.hashCode();
        String str = this.tokenIcon;
        return (((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.ccy.hashCode()) * 31) + this.tag.hashCode()) * 31) + this.leverage.hashCode()) * 31) + this.shareType.hashCode()) * 31) + this.pnl.hashCode()) * 31) + this.pnlUnit.hashCode()) * 31) + this.pnlRate.hashCode()) * 31) + this.pnlRiseFall.hashCode()) * 31) + this.entryPrice.hashCode()) * 31) + this.pnlPrice.hashCode()) * 31) + this.pnlPriceLabel.hashCode()) * 31) + this.deepLink.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isPositive() {
        return this.isPositive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TradePositionPlanetBean(posId=" + this.posId + ", isPositive=" + this.isPositive + ", side=" + this.side + ", instId=" + this.instId + ", instType=" + this.instType + ", mgnMode=" + this.mgnMode + ", posDirection=" + this.posDirection + ", cTimestamp=" + this.cTimestamp + ", uTimestamp=" + this.uTimestamp + ", listTime=" + this.listTime + ", instName=" + this.instName + ", tokenIcon=" + this.tokenIcon + ", ccy=" + this.ccy + ", tag=" + this.tag + ", leverage=" + this.leverage + ", shareType=" + this.shareType + ", pnl=" + this.pnl + ", pnlUnit=" + this.pnlUnit + ", pnlRate=" + this.pnlRate + ", pnlRiseFall=" + this.pnlRiseFall + ", entryPrice=" + this.entryPrice + ", pnlPrice=" + this.pnlPrice + ", pnlPriceLabel=" + this.pnlPriceLabel + ", deepLink=" + this.deepLink + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.posId);
        parcel.writeInt(this.isPositive ? 1 : 0);
        parcel.writeString(this.side);
        parcel.writeString(this.instId);
        parcel.writeString(this.instType);
        parcel.writeString(this.mgnMode);
        parcel.writeString(this.posDirection);
        parcel.writeString(this.cTimestamp);
        parcel.writeString(this.uTimestamp);
        parcel.writeString(this.listTime);
        parcel.writeString(this.instName);
        parcel.writeString(this.tokenIcon);
        parcel.writeString(this.ccy);
        parcel.writeString(this.tag);
        parcel.writeString(this.leverage);
        parcel.writeString(this.shareType);
        parcel.writeString(this.pnl);
        parcel.writeString(this.pnlUnit);
        parcel.writeString(this.pnlRate);
        parcel.writeString(this.pnlRiseFall);
        parcel.writeString(this.entryPrice);
        parcel.writeString(this.pnlPrice);
        parcel.writeString(this.pnlPriceLabel);
        parcel.writeString(this.deepLink);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradeshare.api.TradePositionPlanetBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TradePositionPlanetBean> serializer() {
            return TradePositionPlanetBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TradePositionPlanetBean(int i, String str, boolean z, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, SerializationConstructorMarker serializationConstructorMarker) {
        if (16777215 != (i & 16777215)) {
            PluginExceptionsKt.throwMissingFieldException(i, 16777215, TradePositionPlanetBean$$serializer.INSTANCE.getDescriptor());
        }
        this.posId = str;
        this.isPositive = z;
        this.side = str2;
        this.instId = str3;
        this.instType = str4;
        this.mgnMode = str5;
        this.posDirection = str6;
        this.cTimestamp = str7;
        this.uTimestamp = str8;
        this.listTime = str9;
        this.instName = str10;
        this.tokenIcon = str11;
        this.ccy = str12;
        this.tag = str13;
        this.leverage = str14;
        this.shareType = str15;
        this.pnl = str16;
        this.pnlUnit = str17;
        this.pnlRate = str18;
        this.pnlRiseFall = str19;
        this.entryPrice = str20;
        this.pnlPrice = str21;
        this.pnlPriceLabel = str22;
        this.deepLink = str23;
    }

    public static final /* synthetic */ void write$Self$OKTrade_trade_api(TradePositionPlanetBean tradePositionPlanetBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, tradePositionPlanetBean.posId);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 1, tradePositionPlanetBean.isPositive);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, tradePositionPlanetBean.side);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, tradePositionPlanetBean.instId);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, tradePositionPlanetBean.instType);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, tradePositionPlanetBean.mgnMode);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, tradePositionPlanetBean.posDirection);
        compositeEncoder.encodeStringElement(serialDescriptor, 7, tradePositionPlanetBean.cTimestamp);
        compositeEncoder.encodeStringElement(serialDescriptor, 8, tradePositionPlanetBean.uTimestamp);
        compositeEncoder.encodeStringElement(serialDescriptor, 9, tradePositionPlanetBean.listTime);
        compositeEncoder.encodeStringElement(serialDescriptor, 10, tradePositionPlanetBean.instName);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, tradePositionPlanetBean.tokenIcon);
        compositeEncoder.encodeStringElement(serialDescriptor, 12, tradePositionPlanetBean.ccy);
        compositeEncoder.encodeStringElement(serialDescriptor, 13, tradePositionPlanetBean.tag);
        compositeEncoder.encodeStringElement(serialDescriptor, 14, tradePositionPlanetBean.leverage);
        compositeEncoder.encodeStringElement(serialDescriptor, 15, tradePositionPlanetBean.shareType);
        compositeEncoder.encodeStringElement(serialDescriptor, 16, tradePositionPlanetBean.pnl);
        compositeEncoder.encodeStringElement(serialDescriptor, 17, tradePositionPlanetBean.pnlUnit);
        compositeEncoder.encodeStringElement(serialDescriptor, 18, tradePositionPlanetBean.pnlRate);
        compositeEncoder.encodeStringElement(serialDescriptor, 19, tradePositionPlanetBean.pnlRiseFall);
        compositeEncoder.encodeStringElement(serialDescriptor, 20, tradePositionPlanetBean.entryPrice);
        compositeEncoder.encodeStringElement(serialDescriptor, 21, tradePositionPlanetBean.pnlPrice);
        compositeEncoder.encodeStringElement(serialDescriptor, 22, tradePositionPlanetBean.pnlPriceLabel);
        compositeEncoder.encodeStringElement(serialDescriptor, 23, tradePositionPlanetBean.deepLink);
    }

    public TradePositionPlanetBean(@NotNull String str, boolean z, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23) {
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
        this.posId = str;
        this.isPositive = z;
        this.side = str2;
        this.instId = str3;
        this.instType = str4;
        this.mgnMode = str5;
        this.posDirection = str6;
        this.cTimestamp = str7;
        this.uTimestamp = str8;
        this.listTime = str9;
        this.instName = str10;
        this.tokenIcon = str11;
        this.ccy = str12;
        this.tag = str13;
        this.leverage = str14;
        this.shareType = str15;
        this.pnl = str16;
        this.pnlUnit = str17;
        this.pnlRate = str18;
        this.pnlRiseFall = str19;
        this.entryPrice = str20;
        this.pnlPrice = str21;
        this.pnlPriceLabel = str22;
        this.deepLink = str23;
    }
}
