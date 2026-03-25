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
public final class TradeAssetPlanetBean implements Parcelable {
    public static final int $stable = 0;
    private final String cTimestamp;
    private final String costPrice;
    private final String deepLink;
    private final String instId;
    private final String instType;
    private final String lastPrice;
    private final String pnl;
    private final String pnlRate;
    private final String pnlRiseFall;
    private final String tokenIcon;
    private final String tokenName;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<TradeAssetPlanetBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TradeAssetPlanetBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeAssetPlanetBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TradeAssetPlanetBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeAssetPlanetBean[] newArray(int i) {
            return new TradeAssetPlanetBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.deepLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.cTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.pnlRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.pnlRiseFall;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.costPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.lastPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeAssetPlanetBean copy(@NotNull String str, String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, String str9, String str10, String str11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new TradeAssetPlanetBean(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
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
        if (!(obj instanceof TradeAssetPlanetBean)) {
            return false;
        }
        TradeAssetPlanetBean tradeAssetPlanetBean = (TradeAssetPlanetBean) obj;
        return Intrinsics.EZpvd((Object) this.tokenName, (Object) tradeAssetPlanetBean.tokenName) && Intrinsics.EZpvd((Object) this.tokenIcon, (Object) tradeAssetPlanetBean.tokenIcon) && Intrinsics.EZpvd((Object) this.cTimestamp, (Object) tradeAssetPlanetBean.cTimestamp) && Intrinsics.EZpvd((Object) this.pnl, (Object) tradeAssetPlanetBean.pnl) && Intrinsics.EZpvd((Object) this.pnlRate, (Object) tradeAssetPlanetBean.pnlRate) && Intrinsics.EZpvd((Object) this.pnlRiseFall, (Object) tradeAssetPlanetBean.pnlRiseFall) && Intrinsics.EZpvd((Object) this.costPrice, (Object) tradeAssetPlanetBean.costPrice) && Intrinsics.EZpvd((Object) this.lastPrice, (Object) tradeAssetPlanetBean.lastPrice) && Intrinsics.EZpvd((Object) this.instId, (Object) tradeAssetPlanetBean.instId) && Intrinsics.EZpvd((Object) this.instType, (Object) tradeAssetPlanetBean.instType) && Intrinsics.EZpvd((Object) this.deepLink, (Object) tradeAssetPlanetBean.deepLink);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCTimestamp() {
        return this.cTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCostPrice() {
        return this.costPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeepLink() {
        return this.deepLink;
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
    public final String getLastPrice() {
        return this.lastPrice;
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
    public final String getPnlRiseFall() {
        return this.pnlRiseFall;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenIcon() {
        return this.tokenIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenName() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.tokenName.hashCode();
        String str = this.tokenIcon;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = this.cTimestamp.hashCode();
        int iHashCode4 = this.pnl.hashCode();
        int iHashCode5 = this.pnlRate.hashCode();
        int iHashCode6 = this.pnlRiseFall.hashCode();
        int iHashCode7 = this.costPrice.hashCode();
        int iHashCode8 = this.lastPrice.hashCode();
        String str2 = this.instId;
        int iHashCode9 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.instType;
        int iHashCode10 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.deepLink;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TradeAssetPlanetBean(tokenName=" + this.tokenName + ", tokenIcon=" + this.tokenIcon + ", cTimestamp=" + this.cTimestamp + ", pnl=" + this.pnl + ", pnlRate=" + this.pnlRate + ", pnlRiseFall=" + this.pnlRiseFall + ", costPrice=" + this.costPrice + ", lastPrice=" + this.lastPrice + ", instId=" + this.instId + ", instType=" + this.instType + ", deepLink=" + this.deepLink + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.tokenName);
        parcel.writeString(this.tokenIcon);
        parcel.writeString(this.cTimestamp);
        parcel.writeString(this.pnl);
        parcel.writeString(this.pnlRate);
        parcel.writeString(this.pnlRiseFall);
        parcel.writeString(this.costPrice);
        parcel.writeString(this.lastPrice);
        parcel.writeString(this.instId);
        parcel.writeString(this.instType);
        parcel.writeString(this.deepLink);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradeshare.api.TradeAssetPlanetBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TradeAssetPlanetBean> serializer() {
            return TradeAssetPlanetBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TradeAssetPlanetBean(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, SerializationConstructorMarker serializationConstructorMarker) {
        if (2047 != (i & 2047)) {
            PluginExceptionsKt.throwMissingFieldException(i, 2047, TradeAssetPlanetBean$$serializer.INSTANCE.getDescriptor());
        }
        this.tokenName = str;
        this.tokenIcon = str2;
        this.cTimestamp = str3;
        this.pnl = str4;
        this.pnlRate = str5;
        this.pnlRiseFall = str6;
        this.costPrice = str7;
        this.lastPrice = str8;
        this.instId = str9;
        this.instType = str10;
        this.deepLink = str11;
    }

    public static final /* synthetic */ void write$Self$OKTrade_trade_api(TradeAssetPlanetBean tradeAssetPlanetBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, tradeAssetPlanetBean.tokenName);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, tradeAssetPlanetBean.tokenIcon);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, tradeAssetPlanetBean.cTimestamp);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, tradeAssetPlanetBean.pnl);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, tradeAssetPlanetBean.pnlRate);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, tradeAssetPlanetBean.pnlRiseFall);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, tradeAssetPlanetBean.costPrice);
        compositeEncoder.encodeStringElement(serialDescriptor, 7, tradeAssetPlanetBean.lastPrice);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, tradeAssetPlanetBean.instId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, tradeAssetPlanetBean.instType);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, tradeAssetPlanetBean.deepLink);
    }

    public TradeAssetPlanetBean(@NotNull String str, String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, String str9, String str10, String str11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.tokenName = str;
        this.tokenIcon = str2;
        this.cTimestamp = str3;
        this.pnl = str4;
        this.pnlRate = str5;
        this.pnlRiseFall = str6;
        this.costPrice = str7;
        this.lastPrice = str8;
        this.instId = str9;
        this.instType = str10;
        this.deepLink = str11;
    }
}
