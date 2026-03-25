package com.okinc.business.dex.api.bean.sa_small_assets;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class QuoteDetail {
    private final String expectedAmountOut;
    private final String fromAmount;
    private final String fromAmount64;
    private final String fromTokenAddress;
    private final String minAmountOut;
    private final String minAmountOut64;
    private final JsonElement rawQuoteResult;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public QuoteDetail() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (JsonElement) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ QuoteDetail copy$default(QuoteDetail quoteDetail, String str, String str2, String str3, String str4, String str5, String str6, JsonElement jsonElement, int i, Object obj) {
        if ((i & 1) != 0) {
            str = quoteDetail.fromTokenAddress;
        }
        if ((i & 2) != 0) {
            str2 = quoteDetail.fromAmount;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = quoteDetail.fromAmount64;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = quoteDetail.expectedAmountOut;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = quoteDetail.minAmountOut;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = quoteDetail.minAmountOut64;
        }
        String str11 = str6;
        if ((i & 64) != 0) {
            jsonElement = quoteDetail.rawQuoteResult;
        }
        return quoteDetail.copy(str, str7, str8, str9, str10, str11, jsonElement);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fromAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.fromAmount64;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.expectedAmountOut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.minAmountOut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.minAmountOut64;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonElement component7() {
        return this.rawQuoteResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuoteDetail copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new QuoteDetail(str, str2, str3, str4, str5, str6, jsonElement);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuoteDetail)) {
            return false;
        }
        QuoteDetail quoteDetail = (QuoteDetail) obj;
        return Intrinsics.EZpvd((Object) this.fromTokenAddress, (Object) quoteDetail.fromTokenAddress) && Intrinsics.EZpvd((Object) this.fromAmount, (Object) quoteDetail.fromAmount) && Intrinsics.EZpvd((Object) this.fromAmount64, (Object) quoteDetail.fromAmount64) && Intrinsics.EZpvd((Object) this.expectedAmountOut, (Object) quoteDetail.expectedAmountOut) && Intrinsics.EZpvd((Object) this.minAmountOut, (Object) quoteDetail.minAmountOut) && Intrinsics.EZpvd((Object) this.minAmountOut64, (Object) quoteDetail.minAmountOut64) && Intrinsics.EZpvd(this.rawQuoteResult, quoteDetail.rawQuoteResult);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpectedAmountOut() {
        return this.expectedAmountOut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromAmount() {
        return this.fromAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromAmount64() {
        return this.fromAmount64;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenAddress() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinAmountOut() {
        return this.minAmountOut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinAmountOut64() {
        return this.minAmountOut64;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonElement getRawQuoteResult() {
        return this.rawQuoteResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.fromTokenAddress.hashCode();
        int iHashCode2 = this.fromAmount.hashCode();
        int iHashCode3 = this.fromAmount64.hashCode();
        int iHashCode4 = this.expectedAmountOut.hashCode();
        int iHashCode5 = this.minAmountOut.hashCode();
        int iHashCode6 = this.minAmountOut64.hashCode();
        JsonElement jsonElement = this.rawQuoteResult;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (jsonElement == null ? 0 : jsonElement.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "QuoteDetail(fromTokenAddress=" + this.fromTokenAddress + ", fromAmount=" + this.fromAmount + ", fromAmount64=" + this.fromAmount64 + ", expectedAmountOut=" + this.expectedAmountOut + ", minAmountOut=" + this.minAmountOut + ", minAmountOut64=" + this.minAmountOut64 + ", rawQuoteResult=" + this.rawQuoteResult + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.api.bean.sa_small_assets.QuoteDetail.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<QuoteDetail> serializer() {
            return QuoteDetail$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ QuoteDetail(int i, String str, String str2, String str3, String str4, String str5, String str6, JsonElement jsonElement, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.fromTokenAddress = "";
        } else {
            this.fromTokenAddress = str;
        }
        if ((i & 2) == 0) {
            this.fromAmount = "";
        } else {
            this.fromAmount = str2;
        }
        if ((i & 4) == 0) {
            this.fromAmount64 = "";
        } else {
            this.fromAmount64 = str3;
        }
        if ((i & 8) == 0) {
            this.expectedAmountOut = "";
        } else {
            this.expectedAmountOut = str4;
        }
        if ((i & 16) == 0) {
            this.minAmountOut = "";
        } else {
            this.minAmountOut = str5;
        }
        if ((i & 32) == 0) {
            this.minAmountOut64 = "";
        } else {
            this.minAmountOut64 = str6;
        }
        if ((i & 64) == 0) {
            this.rawQuoteResult = null;
        } else {
            this.rawQuoteResult = jsonElement;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_api(QuoteDetail quoteDetail, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) quoteDetail.fromTokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, quoteDetail.fromTokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) quoteDetail.fromAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, quoteDetail.fromAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) quoteDetail.fromAmount64, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, quoteDetail.fromAmount64);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) quoteDetail.expectedAmountOut, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, quoteDetail.expectedAmountOut);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) quoteDetail.minAmountOut, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, quoteDetail.minAmountOut);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) quoteDetail.minAmountOut64, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, quoteDetail.minAmountOut64);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && quoteDetail.rawQuoteResult == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, JsonElementSerializer.INSTANCE, quoteDetail.rawQuoteResult);
    }

    public QuoteDetail(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.fromTokenAddress = str;
        this.fromAmount = str2;
        this.fromAmount64 = str3;
        this.expectedAmountOut = str4;
        this.minAmountOut = str5;
        this.minAmountOut64 = str6;
        this.rawQuoteResult = jsonElement;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0038: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r13v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r11v0 java.lang.String) : (""))
  (wrap:kotlinx.serialization.json.JsonElement:?: TERNARY null = ((wrap:int:0x002b: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null kotlinx.serialization.json.JsonElement) : (r12v0 kotlinx.serialization.json.JsonElement))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlinx.serialization.json.JsonElement):void (m)] (LINE:33) call: com.okinc.business.dex.api.bean.sa_small_assets.QuoteDetail.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlinx.serialization.json.JsonElement):void type: THIS */
    public /* synthetic */ QuoteDetail(String str, String str2, String str3, String str4, String str5, String str6, JsonElement jsonElement, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) == 0 ? str6 : "", (i & 64) != 0 ? null : jsonElement);
    }
}
