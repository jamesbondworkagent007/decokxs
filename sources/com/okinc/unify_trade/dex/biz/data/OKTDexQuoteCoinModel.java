package com.okinc.unify_trade.dex.biz.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C33129mqd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class OKTDexQuoteCoinModel implements Parcelable {
    public static final int $stable = 0;
    private final String buyStatus;
    private final String currencyId;
    private final String decimal;
    private final String name;
    private final String sellStatus;
    private final String supportTradeWith;
    private final String symbol;
    private final String tokenAddress;
    private final String url;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<OKTDexQuoteCoinModel> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<OKTDexQuoteCoinModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OKTDexQuoteCoinModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OKTDexQuoteCoinModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OKTDexQuoteCoinModel[] newArray(int i) {
            return new OKTDexQuoteCoinModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OKTDexQuoteCoinModel() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.buyStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.sellStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.decimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.supportTradeWith;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKTDexQuoteCoinModel copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new OKTDexQuoteCoinModel(str, str2, str3, str4, str5, str6, str7, str8, str9);
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
        if (!(obj instanceof OKTDexQuoteCoinModel)) {
            return false;
        }
        OKTDexQuoteCoinModel oKTDexQuoteCoinModel = (OKTDexQuoteCoinModel) obj;
        return Intrinsics.EZpvd((Object) this.symbol, (Object) oKTDexQuoteCoinModel.symbol) && Intrinsics.EZpvd((Object) this.name, (Object) oKTDexQuoteCoinModel.name) && Intrinsics.EZpvd((Object) this.buyStatus, (Object) oKTDexQuoteCoinModel.buyStatus) && Intrinsics.EZpvd((Object) this.sellStatus, (Object) oKTDexQuoteCoinModel.sellStatus) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) oKTDexQuoteCoinModel.tokenAddress) && Intrinsics.EZpvd((Object) this.decimal, (Object) oKTDexQuoteCoinModel.decimal) && Intrinsics.EZpvd((Object) this.currencyId, (Object) oKTDexQuoteCoinModel.currencyId) && Intrinsics.EZpvd((Object) this.url, (Object) oKTDexQuoteCoinModel.url) && Intrinsics.EZpvd((Object) this.supportTradeWith, (Object) oKTDexQuoteCoinModel.supportTradeWith);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBuyStatus() {
        return this.buyStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDecimal() {
        return this.decimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSellStatus() {
        return this.sellStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSupportTradeWith() {
        return this.supportTradeWith;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((this.symbol.hashCode() * 31) + this.name.hashCode()) * 31) + this.buyStatus.hashCode()) * 31) + this.sellStatus.hashCode()) * 31) + this.tokenAddress.hashCode()) * 31) + this.decimal.hashCode()) * 31) + this.currencyId.hashCode()) * 31) + this.url.hashCode()) * 31) + this.supportTradeWith.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OKTDexQuoteCoinModel(symbol=" + this.symbol + ", name=" + this.name + ", buyStatus=" + this.buyStatus + ", sellStatus=" + this.sellStatus + ", tokenAddress=" + this.tokenAddress + ", decimal=" + this.decimal + ", currencyId=" + this.currencyId + ", url=" + this.url + ", supportTradeWith=" + this.supportTradeWith + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.symbol);
        parcel.writeString(this.name);
        parcel.writeString(this.buyStatus);
        parcel.writeString(this.sellStatus);
        parcel.writeString(this.tokenAddress);
        parcel.writeString(this.decimal);
        parcel.writeString(this.currencyId);
        parcel.writeString(this.url);
        parcel.writeString(this.supportTradeWith);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.dex.biz.data.OKTDexQuoteCoinModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OKTDexQuoteCoinModel> serializer() {
            return OKTDexQuoteCoinModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OKTDexQuoteCoinModel(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.symbol = "";
        } else {
            this.symbol = str;
        }
        if ((i & 2) == 0) {
            this.name = "";
        } else {
            this.name = str2;
        }
        if ((i & 4) == 0) {
            this.buyStatus = "";
        } else {
            this.buyStatus = str3;
        }
        if ((i & 8) == 0) {
            this.sellStatus = "";
        } else {
            this.sellStatus = str4;
        }
        if ((i & 16) == 0) {
            this.tokenAddress = "";
        } else {
            this.tokenAddress = str5;
        }
        if ((i & 32) == 0) {
            this.decimal = "";
        } else {
            this.decimal = str6;
        }
        if ((i & 64) == 0) {
            this.currencyId = "";
        } else {
            this.currencyId = str7;
        }
        if ((i & 128) == 0) {
            this.url = "";
        } else {
            this.url = str8;
        }
        if ((i & 256) == 0) {
            this.supportTradeWith = "";
        } else {
            this.supportTradeWith = str9;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(OKTDexQuoteCoinModel oKTDexQuoteCoinModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) oKTDexQuoteCoinModel.symbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, oKTDexQuoteCoinModel.symbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) oKTDexQuoteCoinModel.name, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, oKTDexQuoteCoinModel.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) oKTDexQuoteCoinModel.buyStatus, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, oKTDexQuoteCoinModel.buyStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) oKTDexQuoteCoinModel.sellStatus, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, oKTDexQuoteCoinModel.sellStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) oKTDexQuoteCoinModel.tokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, oKTDexQuoteCoinModel.tokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) oKTDexQuoteCoinModel.decimal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, oKTDexQuoteCoinModel.decimal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) oKTDexQuoteCoinModel.currencyId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, oKTDexQuoteCoinModel.currencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) oKTDexQuoteCoinModel.url, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, oKTDexQuoteCoinModel.url);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && Intrinsics.EZpvd((Object) oKTDexQuoteCoinModel.supportTradeWith, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 8, oKTDexQuoteCoinModel.supportTradeWith);
    }

    public OKTDexQuoteCoinModel(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.symbol = str;
        this.name = str2;
        this.buyStatus = str3;
        this.sellStatus = str4;
        this.tokenAddress = str5;
        this.decimal = str6;
        this.currencyId = str7;
        this.url = str8;
        this.supportTradeWith = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0055: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:13) call: com.okinc.unify_trade.dex.biz.data.OKTDexQuoteCoinModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ OKTDexQuoteCoinModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) == 0 ? str9 : "");
    }

    public final OKTDexQuoteModel toSimplified() {
        return new OKTDexQuoteModel(this.symbol, this.name, this.tokenAddress, this.decimal, this.currencyId, this.url, (Boolean) null, this.supportTradeWith, 64, (DefaultConstructorMarker) null);
    }

    public final boolean isSupportTradeWith() {
        return C33129mqd.OLrzqt(this.supportTradeWith, "1");
    }
}
