package com.okinc.business.market.features.scanner.surge.signal.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class GemItemWsData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String currentMcap;
    public final String firstSignalTime;
    public final String gemsType;
    public final String maxIncreaseMultiplier;
    public final String maxIncreasePercentage;
    public final String signalLabel;
    public final TokenInfoWsData tokenInfo;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GemItemWsData() {
        this((TokenInfoWsData) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GemItemWsData copy$default(GemItemWsData gemItemWsData, TokenInfoWsData tokenInfoWsData, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            tokenInfoWsData = gemItemWsData.tokenInfo;
        }
        if ((i & 2) != 0) {
            str = gemItemWsData.gemsType;
        }
        String str7 = str;
        if ((i & 4) != 0) {
            str2 = gemItemWsData.signalLabel;
        }
        String str8 = str2;
        if ((i & 8) != 0) {
            str3 = gemItemWsData.currentMcap;
        }
        String str9 = str3;
        if ((i & 16) != 0) {
            str4 = gemItemWsData.firstSignalTime;
        }
        String str10 = str4;
        if ((i & 32) != 0) {
            str5 = gemItemWsData.maxIncreasePercentage;
        }
        String str11 = str5;
        if ((i & 64) != 0) {
            str6 = gemItemWsData.maxIncreaseMultiplier;
        }
        return gemItemWsData.KWHzl(tokenInfoWsData, str7, str8, str9, str10, str11, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GemItemWsData KWHzl(TokenInfoWsData tokenInfoWsData, String str, String str2, String str3, String str4, String str5, String str6) {
        return new GemItemWsData(tokenInfoWsData, str, str2, str3, str4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GemItemWsData)) {
            return false;
        }
        GemItemWsData gemItemWsData = (GemItemWsData) obj;
        return Intrinsics.EZpvd(this.tokenInfo, gemItemWsData.tokenInfo) && Intrinsics.EZpvd((Object) this.gemsType, (Object) gemItemWsData.gemsType) && Intrinsics.EZpvd((Object) this.signalLabel, (Object) gemItemWsData.signalLabel) && Intrinsics.EZpvd((Object) this.currentMcap, (Object) gemItemWsData.currentMcap) && Intrinsics.EZpvd((Object) this.firstSignalTime, (Object) gemItemWsData.firstSignalTime) && Intrinsics.EZpvd((Object) this.maxIncreasePercentage, (Object) gemItemWsData.maxIncreasePercentage) && Intrinsics.EZpvd((Object) this.maxIncreaseMultiplier, (Object) gemItemWsData.maxIncreaseMultiplier);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        TokenInfoWsData tokenInfoWsData = this.tokenInfo;
        int iHashCode = tokenInfoWsData == null ? 0 : tokenInfoWsData.hashCode();
        String str = this.gemsType;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.signalLabel;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.currentMcap;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.firstSignalTime;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.maxIncreasePercentage;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.maxIncreaseMultiplier;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GemItemWsData(tokenInfo=" + this.tokenInfo + ", gemsType=" + this.gemsType + ", signalLabel=" + this.signalLabel + ", currentMcap=" + this.currentMcap + ", firstSignalTime=" + this.firstSignalTime + ", maxIncreasePercentage=" + this.maxIncreasePercentage + ", maxIncreaseMultiplier=" + this.maxIncreaseMultiplier + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.scanner.surge.signal.data.GemItemWsData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GemItemWsData> serializer() {
            return GemItemWsData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GemItemWsData(int i, TokenInfoWsData tokenInfoWsData, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.tokenInfo = null;
        } else {
            this.tokenInfo = tokenInfoWsData;
        }
        if ((i & 2) == 0) {
            this.gemsType = null;
        } else {
            this.gemsType = str;
        }
        if ((i & 4) == 0) {
            this.signalLabel = null;
        } else {
            this.signalLabel = str2;
        }
        if ((i & 8) == 0) {
            this.currentMcap = null;
        } else {
            this.currentMcap = str3;
        }
        if ((i & 16) == 0) {
            this.firstSignalTime = null;
        } else {
            this.firstSignalTime = str4;
        }
        if ((i & 32) == 0) {
            this.maxIncreasePercentage = null;
        } else {
            this.maxIncreasePercentage = str5;
        }
        if ((i & 64) == 0) {
            this.maxIncreaseMultiplier = null;
        } else {
            this.maxIncreaseMultiplier = str6;
        }
    }

    public static final /* synthetic */ void AEQbTJ(GemItemWsData gemItemWsData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || gemItemWsData.tokenInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, GemItemWsData$TokenInfoWsData$$serializer.INSTANCE, gemItemWsData.tokenInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || gemItemWsData.gemsType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, gemItemWsData.gemsType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || gemItemWsData.signalLabel != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, gemItemWsData.signalLabel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || gemItemWsData.currentMcap != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, gemItemWsData.currentMcap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || gemItemWsData.firstSignalTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, gemItemWsData.firstSignalTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || gemItemWsData.maxIncreasePercentage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, gemItemWsData.maxIncreasePercentage);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && gemItemWsData.maxIncreaseMultiplier == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, gemItemWsData.maxIncreaseMultiplier);
    }

    public GemItemWsData(TokenInfoWsData tokenInfoWsData, String str, String str2, String str3, String str4, String str5, String str6) {
        this.tokenInfo = tokenInfoWsData;
        this.gemsType = str;
        this.signalLabel = str2;
        this.currentMcap = str3;
        this.firstSignalTime = str4;
        this.maxIncreasePercentage = str5;
        this.maxIncreaseMultiplier = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:com.okinc.business.market.features.scanner.surge.signal.data.GemItemWsData$TokenInfoWsData:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.scanner.surge.signal.data.GemItemWsData$TokenInfoWsData) : (r7v0 com.okinc.business.market.features.scanner.surge.signal.data.GemItemWsData$TokenInfoWsData))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
 A[MD:(com.okinc.business.market.features.scanner.surge.signal.data.GemItemWsData$TokenInfoWsData, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:64) call: com.okinc.business.market.features.scanner.surge.signal.data.GemItemWsData.<init>(com.okinc.business.market.features.scanner.surge.signal.data.GemItemWsData$TokenInfoWsData, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ GemItemWsData(TokenInfoWsData tokenInfoWsData, String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : tokenInfoWsData, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6);
    }

    @Serializable
    public static final class TokenInfoWsData {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        public final String chainId;
        public final String chainLogo;
        public final String tokenContractAddress;
        public final Long tokenCreateTime;
        public final String tokenLogoUrl;
        public final String tokenName;
        public final String tokenSymbol;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TokenInfoWsData() {
            this((String) null, (String) null, (String) null, (Long) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TokenInfoWsData copy$default(TokenInfoWsData tokenInfoWsData, String str, String str2, String str3, Long l, String str4, String str5, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tokenInfoWsData.chainId;
            }
            if ((i & 2) != 0) {
                str2 = tokenInfoWsData.chainLogo;
            }
            String str7 = str2;
            if ((i & 4) != 0) {
                str3 = tokenInfoWsData.tokenContractAddress;
            }
            String str8 = str3;
            if ((i & 8) != 0) {
                l = tokenInfoWsData.tokenCreateTime;
            }
            Long l2 = l;
            if ((i & 16) != 0) {
                str4 = tokenInfoWsData.tokenLogoUrl;
            }
            String str9 = str4;
            if ((i & 32) != 0) {
                str5 = tokenInfoWsData.tokenName;
            }
            String str10 = str5;
            if ((i & 64) != 0) {
                str6 = tokenInfoWsData.tokenSymbol;
            }
            return tokenInfoWsData.KWHzl(str, str7, str8, l2, str9, str10, str6);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.tokenLogoUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TokenInfoWsData KWHzl(String str, String str2, String str3, Long l, String str4, String str5, String str6) {
            return new TokenInfoWsData(str, str2, str3, l, str4, str5, str6);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.tokenSymbol;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.tokenContractAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TokenInfoWsData)) {
                return false;
            }
            TokenInfoWsData tokenInfoWsData = (TokenInfoWsData) obj;
            return Intrinsics.EZpvd((Object) this.chainId, (Object) tokenInfoWsData.chainId) && Intrinsics.EZpvd((Object) this.chainLogo, (Object) tokenInfoWsData.chainLogo) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) tokenInfoWsData.tokenContractAddress) && Intrinsics.EZpvd(this.tokenCreateTime, tokenInfoWsData.tokenCreateTime) && Intrinsics.EZpvd((Object) this.tokenLogoUrl, (Object) tokenInfoWsData.tokenLogoUrl) && Intrinsics.EZpvd((Object) this.tokenName, (Object) tokenInfoWsData.tokenName) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) tokenInfoWsData.tokenSymbol);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.chainId;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.chainLogo;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.tokenContractAddress;
            int iHashCode3 = str3 == null ? 0 : str3.hashCode();
            Long l = this.tokenCreateTime;
            int iHashCode4 = l == null ? 0 : l.hashCode();
            String str4 = this.tokenLogoUrl;
            int iHashCode5 = str4 == null ? 0 : str4.hashCode();
            String str5 = this.tokenName;
            int iHashCode6 = str5 == null ? 0 : str5.hashCode();
            String str6 = this.tokenSymbol;
            return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str6 != null ? str6.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TokenInfoWsData(chainId=" + this.chainId + ", chainLogo=" + this.chainLogo + ", tokenContractAddress=" + this.tokenContractAddress + ", tokenCreateTime=" + this.tokenCreateTime + ", tokenLogoUrl=" + this.tokenLogoUrl + ", tokenName=" + this.tokenName + ", tokenSymbol=" + this.tokenSymbol + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.scanner.surge.signal.data.GemItemWsData.TokenInfoWsData.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<TokenInfoWsData> serializer() {
                return GemItemWsData$TokenInfoWsData$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ TokenInfoWsData(int i, String str, String str2, String str3, Long l, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.chainId = null;
            } else {
                this.chainId = str;
            }
            if ((i & 2) == 0) {
                this.chainLogo = null;
            } else {
                this.chainLogo = str2;
            }
            if ((i & 4) == 0) {
                this.tokenContractAddress = null;
            } else {
                this.tokenContractAddress = str3;
            }
            if ((i & 8) == 0) {
                this.tokenCreateTime = null;
            } else {
                this.tokenCreateTime = l;
            }
            if ((i & 16) == 0) {
                this.tokenLogoUrl = null;
            } else {
                this.tokenLogoUrl = str4;
            }
            if ((i & 32) == 0) {
                this.tokenName = null;
            } else {
                this.tokenName = str5;
            }
            if ((i & 64) == 0) {
                this.tokenSymbol = null;
            } else {
                this.tokenSymbol = str6;
            }
        }

        public static final /* synthetic */ void KWHzl(TokenInfoWsData tokenInfoWsData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || tokenInfoWsData.chainId != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, tokenInfoWsData.chainId);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || tokenInfoWsData.chainLogo != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, tokenInfoWsData.chainLogo);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || tokenInfoWsData.tokenContractAddress != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, tokenInfoWsData.tokenContractAddress);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || tokenInfoWsData.tokenCreateTime != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, tokenInfoWsData.tokenCreateTime);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || tokenInfoWsData.tokenLogoUrl != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, tokenInfoWsData.tokenLogoUrl);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || tokenInfoWsData.tokenName != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, tokenInfoWsData.tokenName);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && tokenInfoWsData.tokenSymbol == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, tokenInfoWsData.tokenSymbol);
        }

        public TokenInfoWsData(String str, String str2, String str3, Long l, String str4, String str5, String str6) {
            this.chainId = str;
            this.chainLogo = str2;
            this.tokenContractAddress = str3;
            this.tokenCreateTime = l;
            this.tokenLogoUrl = str4;
            this.tokenName = str5;
            this.tokenSymbol = str6;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r10v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:81) call: com.okinc.business.market.features.scanner.surge.signal.data.GemItemWsData.TokenInfoWsData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ TokenInfoWsData(String str, String str2, String str3, Long l, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6);
        }
    }

    public final GemItem AEQbTJ() {
        String strOLrzqt;
        String strCopydefault;
        TokenInfoWsData tokenInfoWsData = this.tokenInfo;
        if (tokenInfoWsData == null || (strOLrzqt = tokenInfoWsData.OLrzqt()) == null || (strCopydefault = tokenInfoWsData.copydefault()) == null) {
            return null;
        }
        String strKWHzl = tokenInfoWsData.KWHzl();
        String str = strKWHzl == null ? "" : strKWHzl;
        String strAEQbTJ = tokenInfoWsData.AEQbTJ();
        String str2 = strAEQbTJ == null ? "" : strAEQbTJ;
        String str3 = this.gemsType;
        String str4 = str3 == null ? "" : str3;
        String str5 = this.firstSignalTime;
        String str6 = str5 == null ? "" : str5;
        String str7 = this.maxIncreasePercentage;
        if (str7 == null) {
            str7 = "0";
        }
        String str8 = this.maxIncreaseMultiplier;
        if (str8 == null) {
            str8 = "0";
        }
        return new GemItem(strOLrzqt, strCopydefault, str, str2, str4, str6, str7, str8, str5 == null ? "" : str5);
    }
}
