package com.okinc.crcore.shared.net.responsebean;

import com.okinc.crcore.coreapi.net.responsebean.DexTokenResponseBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.mDA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Serializable
public final class DexTokenBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final boolean cexListing;
    private final String cexListingName;
    private final String chainId;
    private final String chainLogo;
    private final String chainName;
    private final boolean communityRecognized;
    private final String liquidity;
    private final String marketCap;
    private final String price;
    private final String priceChange;
    private final String riskLevel;
    private final String tokenContractAddress;
    private final String tokenLogo;
    private final String tokenName;
    private final String tokenSymbol;
    private final String turnOver;
    private final String uniqueId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DexTokenBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, false, (String) null, 131071, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.uniqueId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.priceChange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.liquidity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.turnOver;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component14() {
        return this.communityRecognized;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.riskLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component16() {
        return this.cexListing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.cexListingName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexTokenBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, boolean z, @NotNull String str14, boolean z2, @NotNull String str15) {
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
        return new DexTokenBean(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, z, str14, z2, str15);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DexTokenBean)) {
            return false;
        }
        DexTokenBean dexTokenBean = (DexTokenBean) obj;
        return Intrinsics.EZpvd((Object) this.uniqueId, (Object) dexTokenBean.uniqueId) && Intrinsics.EZpvd((Object) this.chainId, (Object) dexTokenBean.chainId) && Intrinsics.EZpvd((Object) this.chainName, (Object) dexTokenBean.chainName) && Intrinsics.EZpvd((Object) this.chainLogo, (Object) dexTokenBean.chainLogo) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) dexTokenBean.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenName, (Object) dexTokenBean.tokenName) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) dexTokenBean.tokenContractAddress) && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) dexTokenBean.tokenLogo) && Intrinsics.EZpvd((Object) this.price, (Object) dexTokenBean.price) && Intrinsics.EZpvd((Object) this.priceChange, (Object) dexTokenBean.priceChange) && Intrinsics.EZpvd((Object) this.liquidity, (Object) dexTokenBean.liquidity) && Intrinsics.EZpvd((Object) this.turnOver, (Object) dexTokenBean.turnOver) && Intrinsics.EZpvd((Object) this.marketCap, (Object) dexTokenBean.marketCap) && this.communityRecognized == dexTokenBean.communityRecognized && Intrinsics.EZpvd((Object) this.riskLevel, (Object) dexTokenBean.riskLevel) && this.cexListing == dexTokenBean.cexListing && Intrinsics.EZpvd((Object) this.cexListingName, (Object) dexTokenBean.cexListingName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCexListing() {
        return this.cexListing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCexListingName() {
        return this.cexListingName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainLogo() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainName() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCommunityRecognized() {
        return this.communityRecognized;
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
    public final String getPriceChange() {
        return this.priceChange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRiskLevel() {
        return this.riskLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenContractAddress() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenLogo() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenName() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTurnOver() {
        return this.turnOver;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUniqueId() {
        return this.uniqueId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((this.uniqueId.hashCode() * 31) + this.chainId.hashCode()) * 31) + this.chainName.hashCode()) * 31) + this.chainLogo.hashCode()) * 31) + this.tokenSymbol.hashCode()) * 31) + this.tokenName.hashCode()) * 31) + this.tokenContractAddress.hashCode()) * 31) + this.tokenLogo.hashCode()) * 31) + this.price.hashCode()) * 31) + this.priceChange.hashCode()) * 31) + this.liquidity.hashCode()) * 31) + this.turnOver.hashCode()) * 31) + this.marketCap.hashCode()) * 31) + Boolean.hashCode(this.communityRecognized)) * 31) + this.riskLevel.hashCode()) * 31) + Boolean.hashCode(this.cexListing)) * 31) + this.cexListingName.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexTokenBean(uniqueId=" + this.uniqueId + ", chainId=" + this.chainId + ", chainName=" + this.chainName + ", chainLogo=" + this.chainLogo + ", tokenSymbol=" + this.tokenSymbol + ", tokenName=" + this.tokenName + ", tokenContractAddress=" + this.tokenContractAddress + ", tokenLogo=" + this.tokenLogo + ", price=" + this.price + ", priceChange=" + this.priceChange + ", liquidity=" + this.liquidity + ", turnOver=" + this.turnOver + ", marketCap=" + this.marketCap + ", communityRecognized=" + this.communityRecognized + ", riskLevel=" + this.riskLevel + ", cexListing=" + this.cexListing + ", cexListingName=" + this.cexListingName + ")";
    }

    public /* synthetic */ DexTokenBean(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, boolean z, String str14, boolean z2, String str15, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.uniqueId = "";
        } else {
            this.uniqueId = str;
        }
        if ((i & 2) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str2;
        }
        if ((i & 4) == 0) {
            this.chainName = "";
        } else {
            this.chainName = str3;
        }
        if ((i & 8) == 0) {
            this.chainLogo = "";
        } else {
            this.chainLogo = str4;
        }
        if ((i & 16) == 0) {
            this.tokenSymbol = "";
        } else {
            this.tokenSymbol = str5;
        }
        if ((i & 32) == 0) {
            this.tokenName = "";
        } else {
            this.tokenName = str6;
        }
        if ((i & 64) == 0) {
            this.tokenContractAddress = "";
        } else {
            this.tokenContractAddress = str7;
        }
        if ((i & 128) == 0) {
            this.tokenLogo = "";
        } else {
            this.tokenLogo = str8;
        }
        if ((i & 256) == 0) {
            this.price = "";
        } else {
            this.price = str9;
        }
        if ((i & 512) == 0) {
            this.priceChange = "";
        } else {
            this.priceChange = str10;
        }
        if ((i & 1024) == 0) {
            this.liquidity = "";
        } else {
            this.liquidity = str11;
        }
        if ((i & 2048) == 0) {
            this.turnOver = "";
        } else {
            this.turnOver = str12;
        }
        if ((i & 4096) == 0) {
            this.marketCap = "";
        } else {
            this.marketCap = str13;
        }
        if ((i & 8192) == 0) {
            this.communityRecognized = false;
        } else {
            this.communityRecognized = z;
        }
        if ((i & 16384) == 0) {
            this.riskLevel = "";
        } else {
            this.riskLevel = str14;
        }
        if ((32768 & i) == 0) {
            this.cexListing = false;
        } else {
            this.cexListing = z2;
        }
        if ((i & 65536) == 0) {
            this.cexListingName = "";
        } else {
            this.cexListingName = str15;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(DexTokenBean dexTokenBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) dexTokenBean.uniqueId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, dexTokenBean.uniqueId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) dexTokenBean.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, dexTokenBean.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) dexTokenBean.chainName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, dexTokenBean.chainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) dexTokenBean.chainLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, dexTokenBean.chainLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) dexTokenBean.tokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, dexTokenBean.tokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) dexTokenBean.tokenName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, dexTokenBean.tokenName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) dexTokenBean.tokenContractAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, dexTokenBean.tokenContractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) dexTokenBean.tokenLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, dexTokenBean.tokenLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) dexTokenBean.price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, dexTokenBean.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) dexTokenBean.priceChange, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, dexTokenBean.priceChange);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) dexTokenBean.liquidity, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, dexTokenBean.liquidity);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) dexTokenBean.turnOver, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, dexTokenBean.turnOver);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) dexTokenBean.marketCap, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, dexTokenBean.marketCap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || dexTokenBean.communityRecognized) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 13, dexTokenBean.communityRecognized);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) dexTokenBean.riskLevel, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, dexTokenBean.riskLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || dexTokenBean.cexListing) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 15, dexTokenBean.cexListing);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) && Intrinsics.EZpvd((Object) dexTokenBean.cexListingName, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 16, dexTokenBean.cexListingName);
    }

    public DexTokenBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, boolean z, @NotNull String str14, boolean z2, @NotNull String str15) {
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
        this.uniqueId = str;
        this.chainId = str2;
        this.chainName = str3;
        this.chainLogo = str4;
        this.tokenSymbol = str5;
        this.tokenName = str6;
        this.tokenContractAddress = str7;
        this.tokenLogo = str8;
        this.price = str9;
        this.priceChange = str10;
        this.liquidity = str11;
        this.turnOver = str12;
        this.marketCap = str13;
        this.communityRecognized = z;
        this.riskLevel = str14;
        this.cexListing = z2;
        this.cexListingName = str15;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00bb: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r36v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r36v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r36v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r36v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r36v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r36v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r36v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r36v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r36v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r36v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r36v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r36v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r36v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x006c: ARITH (r36v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? false : (r32v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0079: ARITH (r36v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0085: ARITH (r36v0 int) & (32768 int) A[WRAPPED]) == (0 int)) ? (r34v0 boolean) : false)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008e: ARITH (r36v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, java.lang.String):void (m)] (LINE:14) call: com.okinc.crcore.shared.net.responsebean.DexTokenBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ DexTokenBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, boolean z, String str14, boolean z2, String str15, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? false : z, (i & 16384) != 0 ? "" : str14, (i & 32768) == 0 ? z2 : false, (i & 65536) != 0 ? "" : str15);
    }

    public final boolean isTradeable() {
        Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(this.riskLevel);
        return intOrNull == null || intOrNull.intValue() <= 4;
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.DexTokenBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DexTokenBean> serializer() {
            return DexTokenBean$$serializer.INSTANCE;
        }

        public final DexTokenBean KWHzl(@NotNull DexTokenResponseBean dexTokenResponseBean) {
            Intrinsics.checkNotNullParameter(dexTokenResponseBean, "");
            String tokenName = dexTokenResponseBean.getTokenName();
            if (tokenName.length() == 0) {
                tokenName = dexTokenResponseBean.getTokenSymbol();
            }
            return new DexTokenBean(mDA.EZpvd.EZpvd(dexTokenResponseBean.getChainId(), dexTokenResponseBean.getTokenContractAddress()), dexTokenResponseBean.getChainId(), dexTokenResponseBean.getChainName(), dexTokenResponseBean.getChainLogo(), dexTokenResponseBean.getTokenSymbol(), tokenName, dexTokenResponseBean.getTokenContractAddress(), dexTokenResponseBean.getTokenLogo(), dexTokenResponseBean.getPrice(), dexTokenResponseBean.getPriceChange(), dexTokenResponseBean.getLiquidity(), dexTokenResponseBean.getTurnOver(), dexTokenResponseBean.getMarketCap(), dexTokenResponseBean.getCommunityRecognized(), dexTokenResponseBean.getRiskLevel(), dexTokenResponseBean.getCexListing(), dexTokenResponseBean.getCexListingName());
        }
    }
}
