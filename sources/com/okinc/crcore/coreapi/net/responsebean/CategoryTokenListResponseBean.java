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
public final class CategoryTokenListResponseBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String baseIcon;
    private final String changePer;
    private final String instType;
    private final String latestPrice;
    private final String marketCap;
    private final String onlineTs;
    private final String open24h;
    private final String sodUtc0;
    private final String sodUtc8;
    private final String tokenFullName;
    private final String tokenName;
    private final String views;
    private final String volume;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CategoryTokenListResponseBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 8191, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.views;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.onlineTs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.volume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenFullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.latestPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.open24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.sodUtc0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.sodUtc8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.baseIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.changePer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CategoryTokenListResponseBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13) {
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
        return new CategoryTokenListResponseBean(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryTokenListResponseBean)) {
            return false;
        }
        CategoryTokenListResponseBean categoryTokenListResponseBean = (CategoryTokenListResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.tokenName, (Object) categoryTokenListResponseBean.tokenName) && Intrinsics.EZpvd((Object) this.tokenFullName, (Object) categoryTokenListResponseBean.tokenFullName) && Intrinsics.EZpvd((Object) this.instType, (Object) categoryTokenListResponseBean.instType) && Intrinsics.EZpvd((Object) this.latestPrice, (Object) categoryTokenListResponseBean.latestPrice) && Intrinsics.EZpvd((Object) this.open24h, (Object) categoryTokenListResponseBean.open24h) && Intrinsics.EZpvd((Object) this.sodUtc0, (Object) categoryTokenListResponseBean.sodUtc0) && Intrinsics.EZpvd((Object) this.sodUtc8, (Object) categoryTokenListResponseBean.sodUtc8) && Intrinsics.EZpvd((Object) this.baseIcon, (Object) categoryTokenListResponseBean.baseIcon) && Intrinsics.EZpvd((Object) this.changePer, (Object) categoryTokenListResponseBean.changePer) && Intrinsics.EZpvd((Object) this.views, (Object) categoryTokenListResponseBean.views) && Intrinsics.EZpvd((Object) this.onlineTs, (Object) categoryTokenListResponseBean.onlineTs) && Intrinsics.EZpvd((Object) this.marketCap, (Object) categoryTokenListResponseBean.marketCap) && Intrinsics.EZpvd((Object) this.volume, (Object) categoryTokenListResponseBean.volume);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseIcon() {
        return this.baseIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangePer() {
        return this.changePer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
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
    public final String getOnlineTs() {
        return this.onlineTs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOpen24h() {
        return this.open24h;
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
    public final String getTokenFullName() {
        return this.tokenFullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenName() {
        return this.tokenName;
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
        return (((((((((((((((((((((((this.tokenName.hashCode() * 31) + this.tokenFullName.hashCode()) * 31) + this.instType.hashCode()) * 31) + this.latestPrice.hashCode()) * 31) + this.open24h.hashCode()) * 31) + this.sodUtc0.hashCode()) * 31) + this.sodUtc8.hashCode()) * 31) + this.baseIcon.hashCode()) * 31) + this.changePer.hashCode()) * 31) + this.views.hashCode()) * 31) + this.onlineTs.hashCode()) * 31) + this.marketCap.hashCode()) * 31) + this.volume.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CategoryTokenListResponseBean(tokenName=" + this.tokenName + ", tokenFullName=" + this.tokenFullName + ", instType=" + this.instType + ", latestPrice=" + this.latestPrice + ", open24h=" + this.open24h + ", sodUtc0=" + this.sodUtc0 + ", sodUtc8=" + this.sodUtc8 + ", baseIcon=" + this.baseIcon + ", changePer=" + this.changePer + ", views=" + this.views + ", onlineTs=" + this.onlineTs + ", marketCap=" + this.marketCap + ", volume=" + this.volume + ")";
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.CategoryTokenListResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CategoryTokenListResponseBean> serializer() {
            return CategoryTokenListResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CategoryTokenListResponseBean(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.tokenName = "";
        } else {
            this.tokenName = str;
        }
        if ((i & 2) == 0) {
            this.tokenFullName = "";
        } else {
            this.tokenFullName = str2;
        }
        if ((i & 4) == 0) {
            this.instType = "";
        } else {
            this.instType = str3;
        }
        if ((i & 8) == 0) {
            this.latestPrice = "";
        } else {
            this.latestPrice = str4;
        }
        if ((i & 16) == 0) {
            this.open24h = "";
        } else {
            this.open24h = str5;
        }
        if ((i & 32) == 0) {
            this.sodUtc0 = "";
        } else {
            this.sodUtc0 = str6;
        }
        if ((i & 64) == 0) {
            this.sodUtc8 = "";
        } else {
            this.sodUtc8 = str7;
        }
        if ((i & 128) == 0) {
            this.baseIcon = "";
        } else {
            this.baseIcon = str8;
        }
        if ((i & 256) == 0) {
            this.changePer = "";
        } else {
            this.changePer = str9;
        }
        if ((i & 512) == 0) {
            this.views = "";
        } else {
            this.views = str10;
        }
        if ((i & 1024) == 0) {
            this.onlineTs = "";
        } else {
            this.onlineTs = str11;
        }
        if ((i & 2048) == 0) {
            this.marketCap = "";
        } else {
            this.marketCap = str12;
        }
        if ((i & 4096) == 0) {
            this.volume = "";
        } else {
            this.volume = str13;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(CategoryTokenListResponseBean categoryTokenListResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) categoryTokenListResponseBean.tokenName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, categoryTokenListResponseBean.tokenName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) categoryTokenListResponseBean.tokenFullName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, categoryTokenListResponseBean.tokenFullName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) categoryTokenListResponseBean.instType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, categoryTokenListResponseBean.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) categoryTokenListResponseBean.latestPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, categoryTokenListResponseBean.latestPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) categoryTokenListResponseBean.open24h, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, categoryTokenListResponseBean.open24h);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) categoryTokenListResponseBean.sodUtc0, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, categoryTokenListResponseBean.sodUtc0);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) categoryTokenListResponseBean.sodUtc8, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, categoryTokenListResponseBean.sodUtc8);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) categoryTokenListResponseBean.baseIcon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, categoryTokenListResponseBean.baseIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) categoryTokenListResponseBean.changePer, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, categoryTokenListResponseBean.changePer);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) categoryTokenListResponseBean.views, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, categoryTokenListResponseBean.views);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) categoryTokenListResponseBean.onlineTs, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, categoryTokenListResponseBean.onlineTs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) categoryTokenListResponseBean.marketCap, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, categoryTokenListResponseBean.marketCap);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) && Intrinsics.EZpvd((Object) categoryTokenListResponseBean.volume, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 12, categoryTokenListResponseBean.volume);
    }

    public CategoryTokenListResponseBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13) {
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
        this.tokenName = str;
        this.tokenFullName = str2;
        this.instType = str3;
        this.latestPrice = str4;
        this.open24h = str5;
        this.sodUtc0 = str6;
        this.sodUtc8 = str7;
        this.baseIcon = str8;
        this.changePer = str9;
        this.views = str10;
        this.onlineTs = str11;
        this.marketCap = str12;
        this.volume = str13;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0085: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r28v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r28v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r28v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r28v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r28v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r28v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r28v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r28v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0043: ARITH (r28v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r28v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (r28v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005b: ARITH (r28v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0063: ARITH (r28v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r27v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.crcore.coreapi.net.responsebean.CategoryTokenListResponseBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CategoryTokenListResponseBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) == 0 ? str13 : "");
    }
}
