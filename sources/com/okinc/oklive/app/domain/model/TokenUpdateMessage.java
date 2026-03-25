package com.okinc.oklive.app.domain.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class TokenUpdateMessage {
    private final CedefiToken cedefiToken;
    private final CefiToken cefiToken;
    private final String chainLogo;
    private final String change1h;
    private final String currentPrice;
    private final List<TokenIconData> icons;
    private final Boolean isDexListed;
    private final String marketCap;
    private final String tokenLogo;
    private final String tokenName;
    private final String tokenSymbol;
    private final int tokenType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, new ArrayListSerializer(TokenUpdateMessage$TokenIconData$$serializer.INSTANCE), null, null, null};

    @SerialName("cedefiToken")
    public static /* synthetic */ void getCedefiToken$annotations() {
    }

    @SerialName("cefiToken")
    public static /* synthetic */ void getCefiToken$annotations() {
    }

    @SerialName("chainLogo")
    public static /* synthetic */ void getChainLogo$annotations() {
    }

    @SerialName("change1h")
    public static /* synthetic */ void getChange1h$annotations() {
    }

    @SerialName("currentPrice")
    public static /* synthetic */ void getCurrentPrice$annotations() {
    }

    @SerialName("icons")
    public static /* synthetic */ void getIcons$annotations() {
    }

    @SerialName("marketCap")
    public static /* synthetic */ void getMarketCap$annotations() {
    }

    @SerialName("tokenLogo")
    public static /* synthetic */ void getTokenLogo$annotations() {
    }

    @SerialName("tokenName")
    public static /* synthetic */ void getTokenName$annotations() {
    }

    @SerialName("tokenSymbol")
    public static /* synthetic */ void getTokenSymbol$annotations() {
    }

    @SerialName("tokenType")
    public static /* synthetic */ void getTokenType$annotations() {
    }

    @SerialName("isDexListed")
    public static /* synthetic */ void isDexListed$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.tokenType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.currentPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.change1h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CefiToken component2() {
        return this.cefiToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CedefiToken component3() {
        return this.cedefiToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component6() {
        return this.isDexListed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TokenIconData> component9() {
        return this.icons;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenUpdateMessage copy(int i, CefiToken cefiToken, CedefiToken cedefiToken, String str, String str2, Boolean bool, String str3, String str4, List<TokenIconData> list, String str5, String str6, String str7) {
        return new TokenUpdateMessage(i, cefiToken, cedefiToken, str, str2, bool, str3, str4, list, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenUpdateMessage)) {
            return false;
        }
        TokenUpdateMessage tokenUpdateMessage = (TokenUpdateMessage) obj;
        return this.tokenType == tokenUpdateMessage.tokenType && Intrinsics.EZpvd(this.cefiToken, tokenUpdateMessage.cefiToken) && Intrinsics.EZpvd(this.cedefiToken, tokenUpdateMessage.cedefiToken) && Intrinsics.EZpvd((Object) this.tokenName, (Object) tokenUpdateMessage.tokenName) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) tokenUpdateMessage.tokenSymbol) && Intrinsics.EZpvd(this.isDexListed, tokenUpdateMessage.isDexListed) && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) tokenUpdateMessage.tokenLogo) && Intrinsics.EZpvd((Object) this.chainLogo, (Object) tokenUpdateMessage.chainLogo) && Intrinsics.EZpvd(this.icons, tokenUpdateMessage.icons) && Intrinsics.EZpvd((Object) this.currentPrice, (Object) tokenUpdateMessage.currentPrice) && Intrinsics.EZpvd((Object) this.change1h, (Object) tokenUpdateMessage.change1h) && Intrinsics.EZpvd((Object) this.marketCap, (Object) tokenUpdateMessage.marketCap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CedefiToken getCedefiToken() {
        return this.cedefiToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CefiToken getCefiToken() {
        return this.cefiToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainLogo() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChange1h() {
        return this.change1h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentPrice() {
        return this.currentPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TokenIconData> getIcons() {
        return this.icons;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketCap() {
        return this.marketCap;
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
    public final int getTokenType() {
        return this.tokenType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.tokenType);
        CefiToken cefiToken = this.cefiToken;
        int iHashCode2 = cefiToken == null ? 0 : cefiToken.hashCode();
        CedefiToken cedefiToken = this.cedefiToken;
        int iHashCode3 = cedefiToken == null ? 0 : cedefiToken.hashCode();
        String str = this.tokenName;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.tokenSymbol;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.isDexListed;
        int iHashCode6 = bool == null ? 0 : bool.hashCode();
        String str3 = this.tokenLogo;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.chainLogo;
        int iHashCode8 = str4 == null ? 0 : str4.hashCode();
        List<TokenIconData> list = this.icons;
        int iHashCode9 = list == null ? 0 : list.hashCode();
        String str5 = this.currentPrice;
        int iHashCode10 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.change1h;
        int iHashCode11 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.marketCap;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isDexListed() {
        return this.isDexListed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenUpdateMessage(tokenType=" + this.tokenType + ", cefiToken=" + this.cefiToken + ", cedefiToken=" + this.cedefiToken + ", tokenName=" + this.tokenName + ", tokenSymbol=" + this.tokenSymbol + ", isDexListed=" + this.isDexListed + ", tokenLogo=" + this.tokenLogo + ", chainLogo=" + this.chainLogo + ", icons=" + this.icons + ", currentPrice=" + this.currentPrice + ", change1h=" + this.change1h + ", marketCap=" + this.marketCap + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.oklive.app.domain.model.TokenUpdateMessage.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TokenUpdateMessage> serializer() {
            return TokenUpdateMessage$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TokenUpdateMessage(int i, int i2, CefiToken cefiToken, CedefiToken cedefiToken, String str, String str2, Boolean bool, String str3, String str4, List list, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, TokenUpdateMessage$$serializer.INSTANCE.getDescriptor());
        }
        this.tokenType = i2;
        if ((i & 2) == 0) {
            this.cefiToken = null;
        } else {
            this.cefiToken = cefiToken;
        }
        if ((i & 4) == 0) {
            this.cedefiToken = null;
        } else {
            this.cedefiToken = cedefiToken;
        }
        if ((i & 8) == 0) {
            this.tokenName = null;
        } else {
            this.tokenName = str;
        }
        if ((i & 16) == 0) {
            this.tokenSymbol = null;
        } else {
            this.tokenSymbol = str2;
        }
        if ((i & 32) == 0) {
            this.isDexListed = null;
        } else {
            this.isDexListed = bool;
        }
        if ((i & 64) == 0) {
            this.tokenLogo = null;
        } else {
            this.tokenLogo = str3;
        }
        if ((i & 128) == 0) {
            this.chainLogo = null;
        } else {
            this.chainLogo = str4;
        }
        if ((i & 256) == 0) {
            this.icons = null;
        } else {
            this.icons = list;
        }
        if ((i & 512) == 0) {
            this.currentPrice = null;
        } else {
            this.currentPrice = str5;
        }
        if ((i & 1024) == 0) {
            this.change1h = null;
        } else {
            this.change1h = str6;
        }
        if ((i & 2048) == 0) {
            this.marketCap = null;
        } else {
            this.marketCap = str7;
        }
    }

    public static final /* synthetic */ void write$Self$OKLive_oklive_impl(TokenUpdateMessage tokenUpdateMessage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeIntElement(serialDescriptor, 0, tokenUpdateMessage.tokenType);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || tokenUpdateMessage.cefiToken != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, TokenUpdateMessage$CefiToken$$serializer.INSTANCE, tokenUpdateMessage.cefiToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || tokenUpdateMessage.cedefiToken != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, TokenUpdateMessage$CedefiToken$$serializer.INSTANCE, tokenUpdateMessage.cedefiToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || tokenUpdateMessage.tokenName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, tokenUpdateMessage.tokenName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || tokenUpdateMessage.tokenSymbol != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, tokenUpdateMessage.tokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || tokenUpdateMessage.isDexListed != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, tokenUpdateMessage.isDexListed);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || tokenUpdateMessage.tokenLogo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, tokenUpdateMessage.tokenLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || tokenUpdateMessage.chainLogo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, tokenUpdateMessage.chainLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || tokenUpdateMessage.icons != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], tokenUpdateMessage.icons);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || tokenUpdateMessage.currentPrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, tokenUpdateMessage.currentPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || tokenUpdateMessage.change1h != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, tokenUpdateMessage.change1h);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && tokenUpdateMessage.marketCap == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, tokenUpdateMessage.marketCap);
    }

    public TokenUpdateMessage(int i, CefiToken cefiToken, CedefiToken cedefiToken, String str, String str2, Boolean bool, String str3, String str4, List<TokenIconData> list, String str5, String str6, String str7) {
        this.tokenType = i;
        this.cefiToken = cefiToken;
        this.cedefiToken = cedefiToken;
        this.tokenName = str;
        this.tokenSymbol = str2;
        this.isDexListed = bool;
        this.tokenLogo = str3;
        this.chainLogo = str4;
        this.icons = list;
        this.currentPrice = str5;
        this.change1h = str6;
        this.marketCap = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0070: CONSTRUCTOR 
  (r13v0 int)
  (wrap:com.okinc.oklive.app.domain.model.TokenUpdateMessage$CefiToken:?: TERNARY null = ((wrap:int:0x0002: ARITH (r25v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.oklive.app.domain.model.TokenUpdateMessage$CefiToken) : (r14v0 com.okinc.oklive.app.domain.model.TokenUpdateMessage$CefiToken))
  (wrap:com.okinc.oklive.app.domain.model.TokenUpdateMessage$CedefiToken:?: TERNARY null = ((wrap:int:0x000a: ARITH (r25v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.oklive.app.domain.model.TokenUpdateMessage$CedefiToken) : (r15v0 com.okinc.oklive.app.domain.model.TokenUpdateMessage$CedefiToken))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r25v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r25v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0021: ARITH (r25v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r18v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r25v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r25v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0039: ARITH (r25v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r21v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0041: ARITH (r25v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r25v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0051: ARITH (r25v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r24v0 java.lang.String) : (null java.lang.String))
 A[MD:(int, com.okinc.oklive.app.domain.model.TokenUpdateMessage$CefiToken, com.okinc.oklive.app.domain.model.TokenUpdateMessage$CedefiToken, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.util.List<com.okinc.oklive.app.domain.model.TokenUpdateMessage$TokenIconData>, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:29) call: com.okinc.oklive.app.domain.model.TokenUpdateMessage.<init>(int, com.okinc.oklive.app.domain.model.TokenUpdateMessage$CefiToken, com.okinc.oklive.app.domain.model.TokenUpdateMessage$CedefiToken, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TokenUpdateMessage(int i, CefiToken cefiToken, CedefiToken cedefiToken, String str, String str2, Boolean bool, String str3, String str4, List list, String str5, String str6, String str7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : cefiToken, (i2 & 4) != 0 ? null : cedefiToken, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? null : bool, (i2 & 64) != 0 ? null : str3, (i2 & 128) != 0 ? null : str4, (i2 & 256) != 0 ? null : list, (i2 & 512) != 0 ? null : str5, (i2 & 1024) != 0 ? null : str6, (i2 & 2048) == 0 ? str7 : null);
    }

    @Serializable
    public static final class CefiToken {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final String instId;
        private final String instType;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ CefiToken copy$default(CefiToken cefiToken, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cefiToken.instId;
            }
            if ((i & 2) != 0) {
                str2 = cefiToken.instType;
            }
            return cefiToken.copy(str, str2);
        }

        @SerialName("instId")
        public static /* synthetic */ void getInstId$annotations() {
        }

        @SerialName("instType")
        public static /* synthetic */ void getInstType$annotations() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.instId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.instType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CefiToken copy(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new CefiToken(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CefiToken)) {
                return false;
            }
            CefiToken cefiToken = (CefiToken) obj;
            return Intrinsics.EZpvd((Object) this.instId, (Object) cefiToken.instId) && Intrinsics.EZpvd((Object) this.instType, (Object) cefiToken.instType);
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
        public int hashCode() {
            return (this.instId.hashCode() * 31) + this.instType.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "CefiToken(instId=" + this.instId + ", instType=" + this.instType + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.oklive.app.domain.model.TokenUpdateMessage.CefiToken.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<CefiToken> serializer() {
                return TokenUpdateMessage$CefiToken$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ CefiToken(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i, 3, TokenUpdateMessage$CefiToken$$serializer.INSTANCE.getDescriptor());
            }
            this.instId = str;
            this.instType = str2;
        }

        public static final /* synthetic */ void write$Self$OKLive_oklive_impl(CefiToken cefiToken, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, cefiToken.instId);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, cefiToken.instType);
        }

        public CefiToken(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.instId = str;
            this.instType = str2;
        }
    }

    @Serializable
    public static final class CedefiToken {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final String chainId;
        private final String contractAddress;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ CedefiToken copy$default(CedefiToken cedefiToken, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cedefiToken.chainId;
            }
            if ((i & 2) != 0) {
                str2 = cedefiToken.contractAddress;
            }
            return cedefiToken.copy(str, str2);
        }

        @SerialName("chainId")
        public static /* synthetic */ void getChainId$annotations() {
        }

        @SerialName("contractAddress")
        public static /* synthetic */ void getContractAddress$annotations() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.contractAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CedefiToken copy(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new CedefiToken(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CedefiToken)) {
                return false;
            }
            CedefiToken cedefiToken = (CedefiToken) obj;
            return Intrinsics.EZpvd((Object) this.chainId, (Object) cedefiToken.chainId) && Intrinsics.EZpvd((Object) this.contractAddress, (Object) cedefiToken.contractAddress);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getChainId() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getContractAddress() {
            return this.contractAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.chainId.hashCode() * 31) + this.contractAddress.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "CedefiToken(chainId=" + this.chainId + ", contractAddress=" + this.contractAddress + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.oklive.app.domain.model.TokenUpdateMessage.CedefiToken.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<CedefiToken> serializer() {
                return TokenUpdateMessage$CedefiToken$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ CedefiToken(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i, 3, TokenUpdateMessage$CedefiToken$$serializer.INSTANCE.getDescriptor());
            }
            this.chainId = str;
            this.contractAddress = str2;
        }

        public static final /* synthetic */ void write$Self$OKLive_oklive_impl(CedefiToken cedefiToken, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, cedefiToken.chainId);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, cedefiToken.contractAddress);
        }

        public CedefiToken(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.chainId = str;
            this.contractAddress = str2;
        }
    }

    @Serializable
    public static final class TokenIconData {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final String dark;
        private final String light;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TokenIconData copy$default(TokenIconData tokenIconData, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tokenIconData.light;
            }
            if ((i & 2) != 0) {
                str2 = tokenIconData.dark;
            }
            return tokenIconData.copy(str, str2);
        }

        @SerialName("dark")
        public static /* synthetic */ void getDark$annotations() {
        }

        @SerialName("light")
        public static /* synthetic */ void getLight$annotations() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.light;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.dark;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TokenIconData copy(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new TokenIconData(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TokenIconData)) {
                return false;
            }
            TokenIconData tokenIconData = (TokenIconData) obj;
            return Intrinsics.EZpvd((Object) this.light, (Object) tokenIconData.light) && Intrinsics.EZpvd((Object) this.dark, (Object) tokenIconData.dark);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDark() {
            return this.dark;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getLight() {
            return this.light;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.light.hashCode() * 31) + this.dark.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TokenIconData(light=" + this.light + ", dark=" + this.dark + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.oklive.app.domain.model.TokenUpdateMessage.TokenIconData.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<TokenIconData> serializer() {
                return TokenUpdateMessage$TokenIconData$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ TokenIconData(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i, 3, TokenUpdateMessage$TokenIconData$$serializer.INSTANCE.getDescriptor());
            }
            this.light = str;
            this.dark = str2;
        }

        public static final /* synthetic */ void write$Self$OKLive_oklive_impl(TokenIconData tokenIconData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, tokenIconData.light);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, tokenIconData.dark);
        }

        public TokenIconData(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.light = str;
            this.dark = str2;
        }
    }
}
