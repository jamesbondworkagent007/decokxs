package com.okinc.crcore.coreapi.net.responsebean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class CategoryPairListResponseBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String baseIcon;
    private final String displayId;
    private final String instId;
    private final String instType;
    private final String lastPrice;
    private final String latestPrice;
    private final String marketCap;
    private final String marketCapChange;
    private final String onlineTs;
    private final String open24h;
    private final String prevPrice;
    private final String priceChange;
    private final String quoteIcon;
    private final String quoteVolume24h;
    private final String sodUtc0;
    private final String sodUtc8;
    private final String views;
    private final String volume;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CategoryPairListResponseBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 262143, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.open24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.sodUtc0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.sodUtc8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.views;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.onlineTs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.marketCapChange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.volume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.quoteVolume24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.prevPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.lastPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.latestPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.baseIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.quoteIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.priceChange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CategoryPairListResponseBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18) {
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
        Intrinsics.checkNotNullParameter(str18, "");
        return new CategoryPairListResponseBean(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryPairListResponseBean)) {
            return false;
        }
        CategoryPairListResponseBean categoryPairListResponseBean = (CategoryPairListResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) categoryPairListResponseBean.instId) && Intrinsics.EZpvd((Object) this.displayId, (Object) categoryPairListResponseBean.displayId) && Intrinsics.EZpvd((Object) this.instType, (Object) categoryPairListResponseBean.instType) && Intrinsics.EZpvd((Object) this.prevPrice, (Object) categoryPairListResponseBean.prevPrice) && Intrinsics.EZpvd((Object) this.lastPrice, (Object) categoryPairListResponseBean.lastPrice) && Intrinsics.EZpvd((Object) this.latestPrice, (Object) categoryPairListResponseBean.latestPrice) && Intrinsics.EZpvd((Object) this.baseIcon, (Object) categoryPairListResponseBean.baseIcon) && Intrinsics.EZpvd((Object) this.quoteIcon, (Object) categoryPairListResponseBean.quoteIcon) && Intrinsics.EZpvd((Object) this.priceChange, (Object) categoryPairListResponseBean.priceChange) && Intrinsics.EZpvd((Object) this.open24h, (Object) categoryPairListResponseBean.open24h) && Intrinsics.EZpvd((Object) this.sodUtc0, (Object) categoryPairListResponseBean.sodUtc0) && Intrinsics.EZpvd((Object) this.sodUtc8, (Object) categoryPairListResponseBean.sodUtc8) && Intrinsics.EZpvd((Object) this.views, (Object) categoryPairListResponseBean.views) && Intrinsics.EZpvd((Object) this.onlineTs, (Object) categoryPairListResponseBean.onlineTs) && Intrinsics.EZpvd((Object) this.marketCap, (Object) categoryPairListResponseBean.marketCap) && Intrinsics.EZpvd((Object) this.marketCapChange, (Object) categoryPairListResponseBean.marketCapChange) && Intrinsics.EZpvd((Object) this.volume, (Object) categoryPairListResponseBean.volume) && Intrinsics.EZpvd((Object) this.quoteVolume24h, (Object) categoryPairListResponseBean.quoteVolume24h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseIcon() {
        return this.baseIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayId() {
        return this.displayId;
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
    public final String getLatestPrice() {
        return this.latestPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketCap() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketCapChange() {
        return this.marketCapChange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOnlineTs() {
        return this.onlineTs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOpen24h() {
        return this.open24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrevPrice() {
        return this.prevPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriceChange() {
        return this.priceChange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteIcon() {
        return this.quoteIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteVolume24h() {
        return this.quoteVolume24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSodUtc0() {
        return this.sodUtc0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSodUtc8() {
        return this.sodUtc8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getViews() {
        return this.views;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVolume() {
        return this.volume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((this.instId.hashCode() * 31) + this.displayId.hashCode()) * 31) + this.instType.hashCode()) * 31) + this.prevPrice.hashCode()) * 31) + this.lastPrice.hashCode()) * 31) + this.latestPrice.hashCode()) * 31) + this.baseIcon.hashCode()) * 31) + this.quoteIcon.hashCode()) * 31) + this.priceChange.hashCode()) * 31) + this.open24h.hashCode()) * 31) + this.sodUtc0.hashCode()) * 31) + this.sodUtc8.hashCode()) * 31) + this.views.hashCode()) * 31) + this.onlineTs.hashCode()) * 31) + this.marketCap.hashCode()) * 31) + this.marketCapChange.hashCode()) * 31) + this.volume.hashCode()) * 31) + this.quoteVolume24h.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CategoryPairListResponseBean(instId=" + this.instId + ", displayId=" + this.displayId + ", instType=" + this.instType + ", prevPrice=" + this.prevPrice + ", lastPrice=" + this.lastPrice + ", latestPrice=" + this.latestPrice + ", baseIcon=" + this.baseIcon + ", quoteIcon=" + this.quoteIcon + ", priceChange=" + this.priceChange + ", open24h=" + this.open24h + ", sodUtc0=" + this.sodUtc0 + ", sodUtc8=" + this.sodUtc8 + ", views=" + this.views + ", onlineTs=" + this.onlineTs + ", marketCap=" + this.marketCap + ", marketCapChange=" + this.marketCapChange + ", volume=" + this.volume + ", quoteVolume24h=" + this.quoteVolume24h + ")";
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.CategoryPairListResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CategoryPairListResponseBean> serializer() {
            return CategoryPairListResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CategoryPairListResponseBean(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.instId = "";
        } else {
            this.instId = str;
        }
        if ((i & 2) == 0) {
            this.displayId = "";
        } else {
            this.displayId = str2;
        }
        if ((i & 4) == 0) {
            this.instType = "";
        } else {
            this.instType = str3;
        }
        if ((i & 8) == 0) {
            this.prevPrice = "";
        } else {
            this.prevPrice = str4;
        }
        if ((i & 16) == 0) {
            this.lastPrice = "";
        } else {
            this.lastPrice = str5;
        }
        if ((i & 32) == 0) {
            this.latestPrice = "";
        } else {
            this.latestPrice = str6;
        }
        if ((i & 64) == 0) {
            this.baseIcon = "";
        } else {
            this.baseIcon = str7;
        }
        if ((i & 128) == 0) {
            this.quoteIcon = "";
        } else {
            this.quoteIcon = str8;
        }
        if ((i & 256) == 0) {
            this.priceChange = "";
        } else {
            this.priceChange = str9;
        }
        if ((i & 512) == 0) {
            this.open24h = "";
        } else {
            this.open24h = str10;
        }
        if ((i & 1024) == 0) {
            this.sodUtc0 = "";
        } else {
            this.sodUtc0 = str11;
        }
        if ((i & 2048) == 0) {
            this.sodUtc8 = "";
        } else {
            this.sodUtc8 = str12;
        }
        if ((i & 4096) == 0) {
            this.views = "";
        } else {
            this.views = str13;
        }
        if ((i & 8192) == 0) {
            this.onlineTs = "";
        } else {
            this.onlineTs = str14;
        }
        if ((i & 16384) == 0) {
            this.marketCap = "";
        } else {
            this.marketCap = str15;
        }
        if ((32768 & i) == 0) {
            this.marketCapChange = "";
        } else {
            this.marketCapChange = str16;
        }
        if ((65536 & i) == 0) {
            this.volume = "";
        } else {
            this.volume = str17;
        }
        if ((i & 131072) == 0) {
            this.quoteVolume24h = "";
        } else {
            this.quoteVolume24h = str18;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(CategoryPairListResponseBean categoryPairListResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) categoryPairListResponseBean.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, categoryPairListResponseBean.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) categoryPairListResponseBean.displayId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, categoryPairListResponseBean.displayId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) categoryPairListResponseBean.instType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, categoryPairListResponseBean.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) categoryPairListResponseBean.prevPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, categoryPairListResponseBean.prevPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) categoryPairListResponseBean.lastPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, categoryPairListResponseBean.lastPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) categoryPairListResponseBean.latestPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, categoryPairListResponseBean.latestPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) categoryPairListResponseBean.baseIcon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, categoryPairListResponseBean.baseIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) categoryPairListResponseBean.quoteIcon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, categoryPairListResponseBean.quoteIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) categoryPairListResponseBean.priceChange, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, categoryPairListResponseBean.priceChange);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) categoryPairListResponseBean.open24h, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, categoryPairListResponseBean.open24h);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) categoryPairListResponseBean.sodUtc0, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, categoryPairListResponseBean.sodUtc0);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) categoryPairListResponseBean.sodUtc8, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, categoryPairListResponseBean.sodUtc8);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) categoryPairListResponseBean.views, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, categoryPairListResponseBean.views);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) categoryPairListResponseBean.onlineTs, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, categoryPairListResponseBean.onlineTs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) categoryPairListResponseBean.marketCap, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, categoryPairListResponseBean.marketCap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) categoryPairListResponseBean.marketCapChange, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, categoryPairListResponseBean.marketCapChange);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) categoryPairListResponseBean.volume, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, categoryPairListResponseBean.volume);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) && Intrinsics.EZpvd((Object) categoryPairListResponseBean.quoteVolume24h, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 17, categoryPairListResponseBean.quoteVolume24h);
    }

    public CategoryPairListResponseBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18) {
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
        Intrinsics.checkNotNullParameter(str18, "");
        this.instId = str;
        this.displayId = str2;
        this.instType = str3;
        this.prevPrice = str4;
        this.lastPrice = str5;
        this.latestPrice = str6;
        this.baseIcon = str7;
        this.quoteIcon = str8;
        this.priceChange = str9;
        this.open24h = str10;
        this.sodUtc0 = str11;
        this.sodUtc8 = str12;
        this.views = str13;
        this.onlineTs = str14;
        this.marketCap = str15;
        this.marketCapChange = str16;
        this.volume = str17;
        this.quoteVolume24h = str18;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00c7: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r38v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r38v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r38v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r38v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r38v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r38v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r38v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r38v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r38v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r38v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r38v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r38v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r38v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r38v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r38v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r38v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r38v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0098: ARITH (r38v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.crcore.coreapi.net.responsebean.CategoryPairListResponseBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CategoryPairListResponseBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17, (i & 131072) != 0 ? "" : str18);
    }
}
