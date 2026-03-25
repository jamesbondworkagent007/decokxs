package com.okinc.business.trade.features.home.ui.cefi.data;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class AdvancedMarketToken {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String chainId;
    private final String change;
    private final String circulatingSupply;
    private final String liquidity;
    private final String marketCap;
    private final String price;
    private final String tokenAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AdvancedMarketToken() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AdvancedMarketToken copy$default(AdvancedMarketToken advancedMarketToken, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = advancedMarketToken.chainId;
        }
        if ((i & 2) != 0) {
            str2 = advancedMarketToken.tokenAddress;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = advancedMarketToken.price;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = advancedMarketToken.change;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = advancedMarketToken.liquidity;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = advancedMarketToken.marketCap;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = advancedMarketToken.circulatingSupply;
        }
        return advancedMarketToken.copy(str, str8, str9, str10, str11, str12, str7);
    }

    @SerialName("chainId")
    public static /* synthetic */ void getChainId$annotations() {
    }

    @SerialName("change")
    public static /* synthetic */ void getChange$annotations() {
    }

    @SerialName("circulatingSupply")
    public static /* synthetic */ void getCirculatingSupply$annotations() {
    }

    @SerialName("liquidity")
    public static /* synthetic */ void getLiquidity$annotations() {
    }

    @SerialName("marketCap")
    public static /* synthetic */ void getMarketCap$annotations() {
    }

    @SerialName(FirebaseAnalytics.Param.PRICE)
    public static /* synthetic */ void getPrice$annotations() {
    }

    @SerialName("tokenContractAddress")
    public static /* synthetic */ void getTokenAddress$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.change;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.liquidity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.circulatingSupply;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdvancedMarketToken copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new AdvancedMarketToken(str, str2, str3, str4, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvancedMarketToken)) {
            return false;
        }
        AdvancedMarketToken advancedMarketToken = (AdvancedMarketToken) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) advancedMarketToken.chainId) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) advancedMarketToken.tokenAddress) && Intrinsics.EZpvd((Object) this.price, (Object) advancedMarketToken.price) && Intrinsics.EZpvd((Object) this.change, (Object) advancedMarketToken.change) && Intrinsics.EZpvd((Object) this.liquidity, (Object) advancedMarketToken.liquidity) && Intrinsics.EZpvd((Object) this.marketCap, (Object) advancedMarketToken.marketCap) && Intrinsics.EZpvd((Object) this.circulatingSupply, (Object) advancedMarketToken.circulatingSupply);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChange() {
        return this.change;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCirculatingSupply() {
        return this.circulatingSupply;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLiquidity() {
        return this.liquidity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketCap() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.chainId.hashCode() * 31) + this.tokenAddress.hashCode()) * 31) + this.price.hashCode()) * 31) + this.change.hashCode()) * 31) + this.liquidity.hashCode()) * 31) + this.marketCap.hashCode()) * 31) + this.circulatingSupply.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AdvancedMarketToken(chainId=" + this.chainId + ", tokenAddress=" + this.tokenAddress + ", price=" + this.price + ", change=" + this.change + ", liquidity=" + this.liquidity + ", marketCap=" + this.marketCap + ", circulatingSupply=" + this.circulatingSupply + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.cefi.data.AdvancedMarketToken.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AdvancedMarketToken> serializer() {
            return AdvancedMarketToken$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AdvancedMarketToken(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str;
        }
        if ((i & 2) == 0) {
            this.tokenAddress = "";
        } else {
            this.tokenAddress = str2;
        }
        if ((i & 4) == 0) {
            this.price = "";
        } else {
            this.price = str3;
        }
        if ((i & 8) == 0) {
            this.change = "";
        } else {
            this.change = str4;
        }
        if ((i & 16) == 0) {
            this.liquidity = "";
        } else {
            this.liquidity = str5;
        }
        if ((i & 32) == 0) {
            this.marketCap = "";
        } else {
            this.marketCap = str6;
        }
        if ((i & 64) == 0) {
            this.circulatingSupply = "";
        } else {
            this.circulatingSupply = str7;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(AdvancedMarketToken advancedMarketToken, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) advancedMarketToken.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, advancedMarketToken.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) advancedMarketToken.tokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, advancedMarketToken.tokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) advancedMarketToken.price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, advancedMarketToken.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) advancedMarketToken.change, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, advancedMarketToken.change);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) advancedMarketToken.liquidity, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, advancedMarketToken.liquidity);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) advancedMarketToken.marketCap, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, advancedMarketToken.marketCap);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd((Object) advancedMarketToken.circulatingSupply, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 6, advancedMarketToken.circulatingSupply);
    }

    public AdvancedMarketToken(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.chainId = str;
        this.tokenAddress = str2;
        this.price = str3;
        this.change = str4;
        this.liquidity = str5;
        this.marketCap = str6;
        this.circulatingSupply = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:89) call: com.okinc.business.trade.features.home.ui.cefi.data.AdvancedMarketToken.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AdvancedMarketToken(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7);
    }
}
