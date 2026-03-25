package com.okinc.business.defi.biz.core.ws.channel.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class PriceDetail {
    private String currency;
    private String currencyUrl;
    private String price;
    private String usdPrice;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PriceDetail copy$default(PriceDetail priceDetail, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = priceDetail.currency;
        }
        if ((i & 2) != 0) {
            str2 = priceDetail.currencyUrl;
        }
        if ((i & 4) != 0) {
            str3 = priceDetail.price;
        }
        if ((i & 8) != 0) {
            str4 = priceDetail.usdPrice;
        }
        return priceDetail.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.currencyUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.usdPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriceDetail copy(String str, String str2, String str3, String str4) {
        return new PriceDetail(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriceDetail)) {
            return false;
        }
        PriceDetail priceDetail = (PriceDetail) obj;
        return Intrinsics.EZpvd((Object) this.currency, (Object) priceDetail.currency) && Intrinsics.EZpvd((Object) this.currencyUrl, (Object) priceDetail.currencyUrl) && Intrinsics.EZpvd((Object) this.price, (Object) priceDetail.price) && Intrinsics.EZpvd((Object) this.usdPrice, (Object) priceDetail.usdPrice);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyUrl() {
        return this.currencyUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdPrice() {
        return this.usdPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.currency;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.currencyUrl;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.price;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.usdPrice;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrency(String str) {
        this.currency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyUrl(String str) {
        this.currencyUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrice(String str) {
        this.price = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUsdPrice(String str) {
        this.usdPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PriceDetail(currency=" + this.currency + ", currencyUrl=" + this.currencyUrl + ", price=" + this.price + ", usdPrice=" + this.usdPrice + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.ws.channel.bean.PriceDetail.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PriceDetail> serializer() {
            return PriceDetail$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PriceDetail(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i & 2)) {
            PluginExceptionsKt.throwMissingFieldException(i, 2, PriceDetail$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.currency = "";
        } else {
            this.currency = str;
        }
        this.currencyUrl = str2;
        if ((i & 4) == 0) {
            this.price = "";
        } else {
            this.price = str3;
        }
        if ((i & 8) == 0) {
            this.usdPrice = "";
        } else {
            this.usdPrice = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(PriceDetail priceDetail, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) priceDetail.currency, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, priceDetail.currency);
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, priceDetail.currencyUrl);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) priceDetail.price, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, priceDetail.price);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) priceDetail.usdPrice, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, priceDetail.usdPrice);
    }

    public PriceDetail(String str, String str2, String str3, String str4) {
        this.currency = str;
        this.currencyUrl = str2;
        this.price = str3;
        this.usdPrice = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (r3v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:39) call: com.okinc.business.defi.biz.core.ws.channel.bean.PriceDetail.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ PriceDetail(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
