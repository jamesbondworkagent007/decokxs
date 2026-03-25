package com.okinc.unify_find.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class MarketCapRank extends BaseRank {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String ccyV2;
    private final String changePerDay24h;
    private final String changePerDayUtc0;
    private final String changePerDayUtc8;
    private final String iconV2;
    private final String lastPrice;
    private final String marketCap;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MarketCapRank copy$default(MarketCapRank marketCapRank, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marketCapRank.iconV2;
        }
        if ((i & 2) != 0) {
            str2 = marketCapRank.marketCap;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = marketCapRank.changePerDay24h;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = marketCapRank.lastPrice;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = marketCapRank.changePerDayUtc0;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = marketCapRank.changePerDayUtc8;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = marketCapRank.ccyV2;
        }
        return marketCapRank.copy(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.iconV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.changePerDay24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.lastPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.changePerDayUtc0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.changePerDayUtc8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.ccyV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketCapRank copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new MarketCapRank(str, str2, str3, str4, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCapRank)) {
            return false;
        }
        MarketCapRank marketCapRank = (MarketCapRank) obj;
        return Intrinsics.EZpvd((Object) this.iconV2, (Object) marketCapRank.iconV2) && Intrinsics.EZpvd((Object) this.marketCap, (Object) marketCapRank.marketCap) && Intrinsics.EZpvd((Object) this.changePerDay24h, (Object) marketCapRank.changePerDay24h) && Intrinsics.EZpvd((Object) this.lastPrice, (Object) marketCapRank.lastPrice) && Intrinsics.EZpvd((Object) this.changePerDayUtc0, (Object) marketCapRank.changePerDayUtc0) && Intrinsics.EZpvd((Object) this.changePerDayUtc8, (Object) marketCapRank.changePerDayUtc8) && Intrinsics.EZpvd((Object) this.ccyV2, (Object) marketCapRank.ccyV2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcyV2() {
        return this.ccyV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangePerDay24h() {
        return this.changePerDay24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangePerDayUtc0() {
        return this.changePerDayUtc0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangePerDayUtc8() {
        return this.changePerDayUtc8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconV2() {
        return this.iconV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLastPrice() {
        return this.lastPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketCap() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.iconV2.hashCode() * 31) + this.marketCap.hashCode()) * 31) + this.changePerDay24h.hashCode()) * 31) + this.lastPrice.hashCode()) * 31) + this.changePerDayUtc0.hashCode()) * 31) + this.changePerDayUtc8.hashCode()) * 31) + this.ccyV2.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MarketCapRank(iconV2=" + this.iconV2 + ", marketCap=" + this.marketCap + ", changePerDay24h=" + this.changePerDay24h + ", lastPrice=" + this.lastPrice + ", changePerDayUtc0=" + this.changePerDayUtc0 + ", changePerDayUtc8=" + this.changePerDayUtc8 + ", ccyV2=" + this.ccyV2 + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_find.data.MarketCapRank.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MarketCapRank> serializer() {
            return MarketCapRank$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MarketCapRank(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, str, str2, serializationConstructorMarker);
        if (32 != (i & 32)) {
            PluginExceptionsKt.throwMissingFieldException(i, 32, MarketCapRank$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 4) == 0) {
            this.iconV2 = "";
        } else {
            this.iconV2 = str3;
        }
        if ((i & 8) == 0) {
            this.marketCap = "";
        } else {
            this.marketCap = str4;
        }
        if ((i & 16) == 0) {
            this.changePerDay24h = "";
        } else {
            this.changePerDay24h = str5;
        }
        this.lastPrice = str6;
        if ((i & 64) == 0) {
            this.changePerDayUtc0 = "";
        } else {
            this.changePerDayUtc0 = str7;
        }
        if ((i & 128) == 0) {
            this.changePerDayUtc8 = "";
        } else {
            this.changePerDayUtc8 = str8;
        }
        if ((i & 256) == 0) {
            this.ccyV2 = "";
        } else {
            this.ccyV2 = str9;
        }
    }

    public static final /* synthetic */ void write$Self$OKMarket_market_impl(MarketCapRank marketCapRank, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        BaseRank.write$Self(marketCapRank, compositeEncoder, serialDescriptor);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) marketCapRank.iconV2, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, marketCapRank.iconV2);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) marketCapRank.marketCap, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, marketCapRank.marketCap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) marketCapRank.changePerDay24h, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, marketCapRank.changePerDay24h);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, marketCapRank.lastPrice);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) marketCapRank.changePerDayUtc0, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, marketCapRank.changePerDayUtc0);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) marketCapRank.changePerDayUtc8, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, marketCapRank.changePerDayUtc8);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && Intrinsics.EZpvd((Object) marketCapRank.ccyV2, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 8, marketCapRank.ccyV2);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0030: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (r14v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:116) call: com.okinc.unify_find.data.MarketCapRank.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ MarketCapRank(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketCapRank(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        super((String) null, (String) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.iconV2 = str;
        this.marketCap = str2;
        this.changePerDay24h = str3;
        this.lastPrice = str4;
        this.changePerDayUtc0 = str5;
        this.changePerDayUtc8 = str6;
        this.ccyV2 = str7;
    }
}
