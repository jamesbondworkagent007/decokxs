package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class FavouriteDexCoin extends BaseWatch {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String boostPercentage;
    private final String boostRate;
    private final Boolean boosted;
    private final String chainId;
    private final String chainLogo;
    private final String riskLevel;
    private final String tokenContractAddress;
    private final String tokenLogo;
    private final String tokenName;
    private final String tokenSymbol;
    private final Boolean verified;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FavouriteDexCoin() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (Boolean) null, (String) null, (String) null, 2047, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.boostPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.boostRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.riskLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component8() {
        return this.verified;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.boosted;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FavouriteDexCoin copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, Boolean bool, Boolean bool2, @NotNull String str8, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new FavouriteDexCoin(str, str2, str3, str4, str5, str6, str7, bool, bool2, str8, str9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FavouriteDexCoin)) {
            return false;
        }
        FavouriteDexCoin favouriteDexCoin = (FavouriteDexCoin) obj;
        return Intrinsics.EZpvd((Object) this.chainLogo, (Object) favouriteDexCoin.chainLogo) && Intrinsics.EZpvd((Object) this.chainId, (Object) favouriteDexCoin.chainId) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) favouriteDexCoin.tokenContractAddress) && Intrinsics.EZpvd((Object) this.riskLevel, (Object) favouriteDexCoin.riskLevel) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) favouriteDexCoin.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) favouriteDexCoin.tokenLogo) && Intrinsics.EZpvd((Object) this.tokenName, (Object) favouriteDexCoin.tokenName) && Intrinsics.EZpvd(this.verified, favouriteDexCoin.verified) && Intrinsics.EZpvd(this.boosted, favouriteDexCoin.boosted) && Intrinsics.EZpvd((Object) this.boostPercentage, (Object) favouriteDexCoin.boostPercentage) && Intrinsics.EZpvd((Object) this.boostRate, (Object) favouriteDexCoin.boostRate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBoostPercentage() {
        return this.boostPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBoostRate() {
        return this.boostRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getBoosted() {
        return this.boosted;
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
    public final Boolean getVerified() {
        return this.verified;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.chainLogo.hashCode();
        int iHashCode2 = this.chainId.hashCode();
        int iHashCode3 = this.tokenContractAddress.hashCode();
        int iHashCode4 = this.riskLevel.hashCode();
        int iHashCode5 = this.tokenSymbol.hashCode();
        int iHashCode6 = this.tokenLogo.hashCode();
        int iHashCode7 = this.tokenName.hashCode();
        Boolean bool = this.verified;
        int iHashCode8 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.boosted;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (bool2 != null ? bool2.hashCode() : 0)) * 31) + this.boostPercentage.hashCode()) * 31) + this.boostRate.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FavouriteDexCoin(chainLogo=" + this.chainLogo + ", chainId=" + this.chainId + ", tokenContractAddress=" + this.tokenContractAddress + ", riskLevel=" + this.riskLevel + ", tokenSymbol=" + this.tokenSymbol + ", tokenLogo=" + this.tokenLogo + ", tokenName=" + this.tokenName + ", verified=" + this.verified + ", boosted=" + this.boosted + ", boostPercentage=" + this.boostPercentage + ", boostRate=" + this.boostRate + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.FavouriteDexCoin.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FavouriteDexCoin> serializer() {
            return FavouriteDexCoin$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FavouriteDexCoin(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if ((i & 1) == 0) {
            this.chainLogo = "";
        } else {
            this.chainLogo = str;
        }
        if ((i & 2) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str2;
        }
        if ((i & 4) == 0) {
            this.tokenContractAddress = "";
        } else {
            this.tokenContractAddress = str3;
        }
        if ((i & 8) == 0) {
            this.riskLevel = "";
        } else {
            this.riskLevel = str4;
        }
        if ((i & 16) == 0) {
            this.tokenSymbol = "";
        } else {
            this.tokenSymbol = str5;
        }
        if ((i & 32) == 0) {
            this.tokenLogo = "";
        } else {
            this.tokenLogo = str6;
        }
        if ((i & 64) == 0) {
            this.tokenName = "";
        } else {
            this.tokenName = str7;
        }
        if ((i & 128) == 0) {
            this.verified = null;
        } else {
            this.verified = bool;
        }
        if ((i & 256) == 0) {
            this.boosted = null;
        } else {
            this.boosted = bool2;
        }
        if ((i & 512) == 0) {
            this.boostPercentage = "";
        } else {
            this.boostPercentage = str8;
        }
        if ((i & 1024) == 0) {
            this.boostRate = "";
        } else {
            this.boostRate = str9;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(FavouriteDexCoin favouriteDexCoin, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        BaseWatch.write$Self(favouriteDexCoin, compositeEncoder, serialDescriptor);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) favouriteDexCoin.chainLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, favouriteDexCoin.chainLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) favouriteDexCoin.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, favouriteDexCoin.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) favouriteDexCoin.tokenContractAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, favouriteDexCoin.tokenContractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) favouriteDexCoin.riskLevel, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, favouriteDexCoin.riskLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) favouriteDexCoin.tokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, favouriteDexCoin.tokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) favouriteDexCoin.tokenLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, favouriteDexCoin.tokenLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) favouriteDexCoin.tokenName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, favouriteDexCoin.tokenName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || favouriteDexCoin.verified != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, favouriteDexCoin.verified);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || favouriteDexCoin.boosted != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, favouriteDexCoin.boosted);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) favouriteDexCoin.boostPercentage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, favouriteDexCoin.boostPercentage);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && Intrinsics.EZpvd((Object) favouriteDexCoin.boostRate, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 10, favouriteDexCoin.boostRate);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006d: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0039: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r20v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0042: ARITH (r24v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.Boolean) : (null java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r24v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0051: ARITH (r24v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String):void (m)] (LINE:29) call: com.okinc.unify_trade.biz.FavouriteDexCoin.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ FavouriteDexCoin(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? null : bool, (i & 256) == 0 ? bool2 : null, (i & 512) != 0 ? "" : str8, (i & 1024) == 0 ? str9 : "");
    }

    public FavouriteDexCoin(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, Boolean bool, Boolean bool2, @NotNull String str8, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.chainLogo = str;
        this.chainId = str2;
        this.tokenContractAddress = str3;
        this.riskLevel = str4;
        this.tokenSymbol = str5;
        this.tokenLogo = str6;
        this.tokenName = str7;
        this.verified = bool;
        this.boosted = bool2;
        this.boostPercentage = str8;
        this.boostRate = str9;
    }
}
