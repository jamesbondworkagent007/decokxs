package com.okinc.business.web3pay.lib.features.asset.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class TokenDetailInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String chainIndex;
    private final String chainLogo;
    private final String chainName;
    private final String deficitAmount;
    private final boolean pay;
    private final String tokenAmount;
    private final String tokenCoinTypeNo;
    private final String tokenPrice;
    private final String tokenSymbolTicker;
    private final String usdAmount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.pay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.tokenSymbolTicker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.usdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.tokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.deficitAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenDetailInfo copy(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, String str7, @NotNull String str8, String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new TokenDetailInfo(z, str, str2, str3, str4, str5, str6, str7, str8, str9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenDetailInfo)) {
            return false;
        }
        TokenDetailInfo tokenDetailInfo = (TokenDetailInfo) obj;
        return this.pay == tokenDetailInfo.pay && Intrinsics.EZpvd((Object) this.tokenAmount, (Object) tokenDetailInfo.tokenAmount) && Intrinsics.EZpvd((Object) this.usdAmount, (Object) tokenDetailInfo.usdAmount) && Intrinsics.EZpvd((Object) this.tokenCoinTypeNo, (Object) tokenDetailInfo.tokenCoinTypeNo) && Intrinsics.EZpvd((Object) this.chainLogo, (Object) tokenDetailInfo.chainLogo) && Intrinsics.EZpvd((Object) this.chainIndex, (Object) tokenDetailInfo.chainIndex) && Intrinsics.EZpvd((Object) this.chainName, (Object) tokenDetailInfo.chainName) && Intrinsics.EZpvd((Object) this.tokenPrice, (Object) tokenDetailInfo.tokenPrice) && Intrinsics.EZpvd((Object) this.deficitAmount, (Object) tokenDetailInfo.deficitAmount) && Intrinsics.EZpvd((Object) this.tokenSymbolTicker, (Object) tokenDetailInfo.tokenSymbolTicker);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIndex() {
        return this.chainIndex;
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
    public final String getDeficitAmount() {
        return this.deficitAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getPay() {
        return this.pay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAmount() {
        return this.tokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenCoinTypeNo() {
        return this.tokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenPrice() {
        return this.tokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbolTicker() {
        return this.tokenSymbolTicker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdAmount() {
        return this.usdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.pay);
        int iHashCode2 = this.tokenAmount.hashCode();
        int iHashCode3 = this.usdAmount.hashCode();
        int iHashCode4 = this.tokenCoinTypeNo.hashCode();
        int iHashCode5 = this.chainLogo.hashCode();
        int iHashCode6 = this.chainIndex.hashCode();
        int iHashCode7 = this.chainName.hashCode();
        String str = this.tokenPrice;
        int iHashCode8 = str == null ? 0 : str.hashCode();
        int iHashCode9 = this.deficitAmount.hashCode();
        String str2 = this.tokenSymbolTicker;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenDetailInfo(pay=" + this.pay + ", tokenAmount=" + this.tokenAmount + ", usdAmount=" + this.usdAmount + ", tokenCoinTypeNo=" + this.tokenCoinTypeNo + ", chainLogo=" + this.chainLogo + ", chainIndex=" + this.chainIndex + ", chainName=" + this.chainName + ", tokenPrice=" + this.tokenPrice + ", deficitAmount=" + this.deficitAmount + ", tokenSymbolTicker=" + this.tokenSymbolTicker + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.asset.model.TokenDetailInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TokenDetailInfo> serializer() {
            return TokenDetailInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TokenDetailInfo(int i, boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i, 255, TokenDetailInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.pay = z;
        this.tokenAmount = str;
        this.usdAmount = str2;
        this.tokenCoinTypeNo = str3;
        this.chainLogo = str4;
        this.chainIndex = str5;
        this.chainName = str6;
        this.tokenPrice = str7;
        if ((i & 256) == 0) {
            this.deficitAmount = "0";
        } else {
            this.deficitAmount = str8;
        }
        if ((i & 512) == 0) {
            this.tokenSymbolTicker = null;
        } else {
            this.tokenSymbolTicker = str9;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(TokenDetailInfo tokenDetailInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeBooleanElement(serialDescriptor, 0, tokenDetailInfo.pay);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, tokenDetailInfo.tokenAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, tokenDetailInfo.usdAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, tokenDetailInfo.tokenCoinTypeNo);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, tokenDetailInfo.chainLogo);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, tokenDetailInfo.chainIndex);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, tokenDetailInfo.chainName);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, tokenDetailInfo.tokenPrice);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) tokenDetailInfo.deficitAmount, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, tokenDetailInfo.deficitAmount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && tokenDetailInfo.tokenSymbolTicker == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, tokenDetailInfo.tokenSymbolTicker);
    }

    public TokenDetailInfo(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, String str7, @NotNull String str8, String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.pay = z;
        this.tokenAmount = str;
        this.usdAmount = str2;
        this.tokenCoinTypeNo = str3;
        this.chainLogo = str4;
        this.chainIndex = str5;
        this.chainName = str6;
        this.tokenPrice = str7;
        this.deficitAmount = str8;
        this.tokenSymbolTicker = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0024: CONSTRUCTOR 
  (r14v0 boolean)
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("0") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r24v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
 A[MD:(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:49) call: com.okinc.business.web3pay.lib.features.asset.model.TokenDetailInfo.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TokenDetailInfo(boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, str2, str3, str4, str5, str6, str7, (i & 256) != 0 ? "0" : str8, (i & 512) != 0 ? null : str9);
    }
}
