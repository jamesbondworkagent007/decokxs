package com.okinc.crcore.coreapi.net.responsebean;

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

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class DexQuoteCoinResponseBean implements Parcelable {
    public static final int $stable = 0;
    private final String buyStatus;
    private final String currencyId;
    private final String decimal;
    private final String name;
    private final String sellStatus;
    private final String symbol;
    private final String tokenAddress;
    private final String url;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DexQuoteCoinResponseBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DexQuoteCoinResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexQuoteCoinResponseBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DexQuoteCoinResponseBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexQuoteCoinResponseBean[] newArray(int i) {
            return new DexQuoteCoinResponseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DexQuoteCoinResponseBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
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
    public final DexQuoteCoinResponseBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new DexQuoteCoinResponseBean(str, str2, str3, str4, str5, str6, str7, str8);
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
        if (!(obj instanceof DexQuoteCoinResponseBean)) {
            return false;
        }
        DexQuoteCoinResponseBean dexQuoteCoinResponseBean = (DexQuoteCoinResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.symbol, (Object) dexQuoteCoinResponseBean.symbol) && Intrinsics.EZpvd((Object) this.name, (Object) dexQuoteCoinResponseBean.name) && Intrinsics.EZpvd((Object) this.buyStatus, (Object) dexQuoteCoinResponseBean.buyStatus) && Intrinsics.EZpvd((Object) this.sellStatus, (Object) dexQuoteCoinResponseBean.sellStatus) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) dexQuoteCoinResponseBean.tokenAddress) && Intrinsics.EZpvd((Object) this.decimal, (Object) dexQuoteCoinResponseBean.decimal) && Intrinsics.EZpvd((Object) this.currencyId, (Object) dexQuoteCoinResponseBean.currencyId) && Intrinsics.EZpvd((Object) this.url, (Object) dexQuoteCoinResponseBean.url);
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
        return (((((((((((((this.symbol.hashCode() * 31) + this.name.hashCode()) * 31) + this.buyStatus.hashCode()) * 31) + this.sellStatus.hashCode()) * 31) + this.tokenAddress.hashCode()) * 31) + this.decimal.hashCode()) * 31) + this.currencyId.hashCode()) * 31) + this.url.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexQuoteCoinResponseBean(symbol=" + this.symbol + ", name=" + this.name + ", buyStatus=" + this.buyStatus + ", sellStatus=" + this.sellStatus + ", tokenAddress=" + this.tokenAddress + ", decimal=" + this.decimal + ", currencyId=" + this.currencyId + ", url=" + this.url + ")";
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
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.DexQuoteCoinResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DexQuoteCoinResponseBean> serializer() {
            return DexQuoteCoinResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DexQuoteCoinResponseBean(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
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
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(DexQuoteCoinResponseBean dexQuoteCoinResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) dexQuoteCoinResponseBean.symbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, dexQuoteCoinResponseBean.symbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) dexQuoteCoinResponseBean.name, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, dexQuoteCoinResponseBean.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) dexQuoteCoinResponseBean.buyStatus, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, dexQuoteCoinResponseBean.buyStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) dexQuoteCoinResponseBean.sellStatus, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, dexQuoteCoinResponseBean.sellStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) dexQuoteCoinResponseBean.tokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, dexQuoteCoinResponseBean.tokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) dexQuoteCoinResponseBean.decimal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, dexQuoteCoinResponseBean.decimal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) dexQuoteCoinResponseBean.currencyId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, dexQuoteCoinResponseBean.currencyId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && Intrinsics.EZpvd((Object) dexQuoteCoinResponseBean.url, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 7, dexQuoteCoinResponseBean.url);
    }

    public DexQuoteCoinResponseBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.symbol = str;
        this.name = str2;
        this.buyStatus = str3;
        this.sellStatus = str4;
        this.tokenAddress = str5;
        this.decimal = str6;
        this.currencyId = str7;
        this.url = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0049: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:71) call: com.okinc.crcore.coreapi.net.responsebean.DexQuoteCoinResponseBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DexQuoteCoinResponseBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) == 0 ? str8 : "");
    }
}
