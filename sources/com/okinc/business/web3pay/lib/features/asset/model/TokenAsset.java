package com.okinc.business.web3pay.lib.features.asset.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class TokenAsset {
    private final boolean cefiSupport;
    private final String masterCurrencyId;
    private final boolean sendSupport;
    private final String tokenAmount;
    private final int tokenDecimal;
    private final List<TokenDetail> tokenDetails;
    private final String tokenLogo;
    private final String tokenName;
    private final String tokenSymbolTicker;
    private final String usdAmount;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, new ArrayListSerializer(TokenDetail$$serializer.INSTANCE), null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tokenSymbolTicker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component10() {
        return this.sendSupport;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.tokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.usdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.masterCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TokenDetail> component8() {
        return this.tokenDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component9() {
        return this.cefiSupport;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenAsset copy(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, String str6, @NotNull List<TokenDetail> list, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new TokenAsset(str, i, str2, str3, str4, str5, str6, list, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenAsset)) {
            return false;
        }
        TokenAsset tokenAsset = (TokenAsset) obj;
        return Intrinsics.EZpvd((Object) this.tokenSymbolTicker, (Object) tokenAsset.tokenSymbolTicker) && this.tokenDecimal == tokenAsset.tokenDecimal && Intrinsics.EZpvd((Object) this.tokenName, (Object) tokenAsset.tokenName) && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) tokenAsset.tokenLogo) && Intrinsics.EZpvd((Object) this.tokenAmount, (Object) tokenAsset.tokenAmount) && Intrinsics.EZpvd((Object) this.usdAmount, (Object) tokenAsset.usdAmount) && Intrinsics.EZpvd((Object) this.masterCurrencyId, (Object) tokenAsset.masterCurrencyId) && Intrinsics.EZpvd(this.tokenDetails, tokenAsset.tokenDetails) && this.cefiSupport == tokenAsset.cefiSupport && this.sendSupport == tokenAsset.sendSupport;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCefiSupport() {
        return this.cefiSupport;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMasterCurrencyId() {
        return this.masterCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSendSupport() {
        return this.sendSupport;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAmount() {
        return this.tokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTokenDecimal() {
        return this.tokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TokenDetail> getTokenDetails() {
        return this.tokenDetails;
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
    public final String getTokenSymbolTicker() {
        return this.tokenSymbolTicker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdAmount() {
        return this.usdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.tokenSymbolTicker.hashCode();
        int iHashCode2 = Integer.hashCode(this.tokenDecimal);
        int iHashCode3 = this.tokenName.hashCode();
        int iHashCode4 = this.tokenLogo.hashCode();
        int iHashCode5 = this.tokenAmount.hashCode();
        int iHashCode6 = this.usdAmount.hashCode();
        String str = this.masterCurrencyId;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.tokenDetails.hashCode()) * 31) + Boolean.hashCode(this.cefiSupport)) * 31) + Boolean.hashCode(this.sendSupport);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenAsset(tokenSymbolTicker=" + this.tokenSymbolTicker + ", tokenDecimal=" + this.tokenDecimal + ", tokenName=" + this.tokenName + ", tokenLogo=" + this.tokenLogo + ", tokenAmount=" + this.tokenAmount + ", usdAmount=" + this.usdAmount + ", masterCurrencyId=" + this.masterCurrencyId + ", tokenDetails=" + this.tokenDetails + ", cefiSupport=" + this.cefiSupport + ", sendSupport=" + this.sendSupport + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.asset.model.TokenAsset.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TokenAsset> serializer() {
            return TokenAsset$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TokenAsset(int i, String str, int i2, String str2, String str3, String str4, String str5, String str6, List list, boolean z, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        if (959 != (i & 959)) {
            PluginExceptionsKt.throwMissingFieldException(i, 959, TokenAsset$$serializer.INSTANCE.getDescriptor());
        }
        this.tokenSymbolTicker = str;
        this.tokenDecimal = i2;
        this.tokenName = str2;
        this.tokenLogo = str3;
        this.tokenAmount = str4;
        this.usdAmount = str5;
        if ((i & 64) == 0) {
            this.masterCurrencyId = null;
        } else {
            this.masterCurrencyId = str6;
        }
        this.tokenDetails = list;
        this.cefiSupport = z;
        this.sendSupport = z2;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(TokenAsset tokenAsset, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, tokenAsset.tokenSymbolTicker);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, tokenAsset.tokenDecimal);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, tokenAsset.tokenName);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, tokenAsset.tokenLogo);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, tokenAsset.tokenAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, tokenAsset.usdAmount);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || tokenAsset.masterCurrencyId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, tokenAsset.masterCurrencyId);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], tokenAsset.tokenDetails);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 8, tokenAsset.cefiSupport);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 9, tokenAsset.sendSupport);
    }

    public TokenAsset(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, String str6, @NotNull List<TokenDetail> list, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.tokenSymbolTicker = str;
        this.tokenDecimal = i;
        this.tokenName = str2;
        this.tokenLogo = str3;
        this.tokenAmount = str4;
        this.usdAmount = str5;
        this.masterCurrencyId = str6;
        this.tokenDetails = list;
        this.cefiSupport = z;
        this.sendSupport = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (r13v0 java.lang.String)
  (r14v0 int)
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r23v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (r20v0 java.util.List)
  (r21v0 boolean)
  (r22v0 boolean)
 A[MD:(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.web3pay.lib.features.asset.model.TokenDetail>, boolean, boolean):void (m)] (LINE:23) call: com.okinc.business.web3pay.lib.features.asset.model.TokenAsset.<init>(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, boolean, boolean):void type: THIS */
    public /* synthetic */ TokenAsset(String str, int i, String str2, String str3, String str4, String str5, String str6, List list, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, str3, str4, str5, (i2 & 64) != 0 ? null : str6, list, z, z2);
    }
}
