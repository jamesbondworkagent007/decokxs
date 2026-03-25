package com.okinc.unify_trade.dex.biz.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class OKTDexQuoteModel implements Parcelable {
    public static final int $stable = 0;
    private final String currencyId;
    private final String decimal;
    private final Boolean illegalStatus;
    private final String name;
    private final String supportTradeWith;
    private final String symbol;
    private final String tokenAddress;
    private final String url;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<OKTDexQuoteModel> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<OKTDexQuoteModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OKTDexQuoteModel createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new OKTDexQuoteModel(string, string2, string3, string4, string5, string6, boolValueOf, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OKTDexQuoteModel[] newArray(int i) {
            return new OKTDexQuoteModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OKTDexQuoteModel() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, 255, (DefaultConstructorMarker) null);
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
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.decimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component7() {
        return this.illegalStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.supportTradeWith;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKTDexQuoteModel copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, Boolean bool, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new OKTDexQuoteModel(str, str2, str3, str4, str5, str6, bool, str7);
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
        if (!(obj instanceof OKTDexQuoteModel)) {
            return false;
        }
        OKTDexQuoteModel oKTDexQuoteModel = (OKTDexQuoteModel) obj;
        return Intrinsics.EZpvd((Object) this.symbol, (Object) oKTDexQuoteModel.symbol) && Intrinsics.EZpvd((Object) this.name, (Object) oKTDexQuoteModel.name) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) oKTDexQuoteModel.tokenAddress) && Intrinsics.EZpvd((Object) this.decimal, (Object) oKTDexQuoteModel.decimal) && Intrinsics.EZpvd((Object) this.currencyId, (Object) oKTDexQuoteModel.currencyId) && Intrinsics.EZpvd((Object) this.url, (Object) oKTDexQuoteModel.url) && Intrinsics.EZpvd(this.illegalStatus, oKTDexQuoteModel.illegalStatus) && Intrinsics.EZpvd((Object) this.supportTradeWith, (Object) oKTDexQuoteModel.supportTradeWith);
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
    public final Boolean getIllegalStatus() {
        return this.illegalStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
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
        int iHashCode = this.symbol.hashCode();
        int iHashCode2 = this.name.hashCode();
        int iHashCode3 = this.tokenAddress.hashCode();
        int iHashCode4 = this.decimal.hashCode();
        int iHashCode5 = this.currencyId.hashCode();
        int iHashCode6 = this.url.hashCode();
        Boolean bool = this.illegalStatus;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (bool == null ? 0 : bool.hashCode())) * 31) + this.supportTradeWith.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OKTDexQuoteModel(symbol=" + this.symbol + ", name=" + this.name + ", tokenAddress=" + this.tokenAddress + ", decimal=" + this.decimal + ", currencyId=" + this.currencyId + ", url=" + this.url + ", illegalStatus=" + this.illegalStatus + ", supportTradeWith=" + this.supportTradeWith + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.symbol);
        parcel.writeString(this.name);
        parcel.writeString(this.tokenAddress);
        parcel.writeString(this.decimal);
        parcel.writeString(this.currencyId);
        parcel.writeString(this.url);
        Boolean bool = this.illegalStatus;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
        parcel.writeString(this.supportTradeWith);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.dex.biz.data.OKTDexQuoteModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OKTDexQuoteModel> serializer() {
            return OKTDexQuoteModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OKTDexQuoteModel(int i, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.tokenAddress = "";
        } else {
            this.tokenAddress = str3;
        }
        if ((i & 8) == 0) {
            this.decimal = "";
        } else {
            this.decimal = str4;
        }
        if ((i & 16) == 0) {
            this.currencyId = "";
        } else {
            this.currencyId = str5;
        }
        if ((i & 32) == 0) {
            this.url = "";
        } else {
            this.url = str6;
        }
        if ((i & 64) == 0) {
            this.illegalStatus = null;
        } else {
            this.illegalStatus = bool;
        }
        if ((i & 128) == 0) {
            this.supportTradeWith = "";
        } else {
            this.supportTradeWith = str7;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(OKTDexQuoteModel oKTDexQuoteModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) oKTDexQuoteModel.symbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, oKTDexQuoteModel.symbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) oKTDexQuoteModel.name, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, oKTDexQuoteModel.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) oKTDexQuoteModel.tokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, oKTDexQuoteModel.tokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) oKTDexQuoteModel.decimal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, oKTDexQuoteModel.decimal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) oKTDexQuoteModel.currencyId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, oKTDexQuoteModel.currencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) oKTDexQuoteModel.url, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, oKTDexQuoteModel.url);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || oKTDexQuoteModel.illegalStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, oKTDexQuoteModel.illegalStatus);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && Intrinsics.EZpvd((Object) oKTDexQuoteModel.supportTradeWith, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 7, oKTDexQuoteModel.supportTradeWith);
    }

    public OKTDexQuoteModel(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, Boolean bool, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.symbol = str;
        this.name = str2;
        this.tokenAddress = str3;
        this.decimal = str4;
        this.currencyId = str5;
        this.url = str6;
        this.illegalStatus = bool;
        this.supportTradeWith = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0049: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x002e: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r16v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String):void (m)] (LINE:56) call: com.okinc.unify_trade.dex.biz.data.OKTDexQuoteModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String):void type: THIS */
    public /* synthetic */ OKTDexQuoteModel(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? null : bool, (i & 128) == 0 ? str7 : "");
    }

    public final boolean isSupportTradeWith() {
        return Intrinsics.EZpvd((Object) this.supportTradeWith, (Object) "1");
    }
}
