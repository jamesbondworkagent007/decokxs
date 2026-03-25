package com.okinc.business.market.data.model.common;

import com.okinc.business.market.data.model.CompactTagData;
import com.okinc.business.market.data.model.CompactTagData$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class TokenInfo {
    public final String buyTransactions;
    public final String chainBWLogoUrl;
    public final String chainId;
    public final String chainLogo;
    public final String currentHolders;
    public final String currentMcap;
    public final String currentPrice;
    public final String nativeTokenSymbol;
    public final List<CompactTagData> newTagList;
    public final String protocolId;
    public final String sellTransactions;
    public final String tokenContractAddress;
    public final long tokenCreateTime;
    public final String tokenLogoUrl;
    public final String tokenName;
    public final String tokenSymbol;
    public final String top10HoldAmountPercentage;
    public final String transactions;
    public final String volume;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(CompactTagData$$serializer.INSTANCE), null, null, null, null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TokenInfo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, 0L, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 524287, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.buyTransactions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.sellTransactions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.currentMcap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AkhnZx() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AuCTel() {
        return this.top10HoldAmountPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String DbNXlk() {
        return this.tokenLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenInfo EZpvd(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull List<CompactTagData> list, @NotNull String str11, long j, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17) {
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
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        return new TokenInfo(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, list, str11, j, str12, str13, str14, str15, str16, str17);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.chainBWLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.currentPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenInfo)) {
            return false;
        }
        TokenInfo tokenInfo = (TokenInfo) obj;
        return Intrinsics.EZpvd((Object) this.buyTransactions, (Object) tokenInfo.buyTransactions) && Intrinsics.EZpvd((Object) this.chainBWLogoUrl, (Object) tokenInfo.chainBWLogoUrl) && Intrinsics.EZpvd((Object) this.chainId, (Object) tokenInfo.chainId) && Intrinsics.EZpvd((Object) this.chainLogo, (Object) tokenInfo.chainLogo) && Intrinsics.EZpvd((Object) this.currentHolders, (Object) tokenInfo.currentHolders) && Intrinsics.EZpvd((Object) this.currentMcap, (Object) tokenInfo.currentMcap) && Intrinsics.EZpvd((Object) this.currentPrice, (Object) tokenInfo.currentPrice) && Intrinsics.EZpvd((Object) this.nativeTokenSymbol, (Object) tokenInfo.nativeTokenSymbol) && Intrinsics.EZpvd((Object) this.protocolId, (Object) tokenInfo.protocolId) && Intrinsics.EZpvd((Object) this.sellTransactions, (Object) tokenInfo.sellTransactions) && Intrinsics.EZpvd(this.newTagList, tokenInfo.newTagList) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) tokenInfo.tokenContractAddress) && this.tokenCreateTime == tokenInfo.tokenCreateTime && Intrinsics.EZpvd((Object) this.tokenLogoUrl, (Object) tokenInfo.tokenLogoUrl) && Intrinsics.EZpvd((Object) this.tokenName, (Object) tokenInfo.tokenName) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) tokenInfo.tokenSymbol) && Intrinsics.EZpvd((Object) this.top10HoldAmountPercentage, (Object) tokenInfo.top10HoldAmountPercentage) && Intrinsics.EZpvd((Object) this.transactions, (Object) tokenInfo.transactions) && Intrinsics.EZpvd((Object) this.volume, (Object) tokenInfo.volume);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fIwbmz() {
        return this.volume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fJNWhG() {
        return this.transactions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fetchVPNInfo() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.protocolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((this.buyTransactions.hashCode() * 31) + this.chainBWLogoUrl.hashCode()) * 31) + this.chainId.hashCode()) * 31) + this.chainLogo.hashCode()) * 31) + this.currentHolders.hashCode()) * 31) + this.currentMcap.hashCode()) * 31) + this.currentPrice.hashCode()) * 31) + this.nativeTokenSymbol.hashCode()) * 31) + this.protocolId.hashCode()) * 31) + this.sellTransactions.hashCode()) * 31) + this.newTagList.hashCode()) * 31) + this.tokenContractAddress.hashCode()) * 31) + Long.hashCode(this.tokenCreateTime)) * 31) + this.tokenLogoUrl.hashCode()) * 31) + this.tokenName.hashCode()) * 31) + this.tokenSymbol.hashCode()) * 31) + this.top10HoldAmountPercentage.hashCode()) * 31) + this.transactions.hashCode()) * 31) + this.volume.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isConnected() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenInfo(buyTransactions=" + this.buyTransactions + ", chainBWLogoUrl=" + this.chainBWLogoUrl + ", chainId=" + this.chainId + ", chainLogo=" + this.chainLogo + ", currentHolders=" + this.currentHolders + ", currentMcap=" + this.currentMcap + ", currentPrice=" + this.currentPrice + ", nativeTokenSymbol=" + this.nativeTokenSymbol + ", protocolId=" + this.protocolId + ", sellTransactions=" + this.sellTransactions + ", newTagList=" + this.newTagList + ", tokenContractAddress=" + this.tokenContractAddress + ", tokenCreateTime=" + this.tokenCreateTime + ", tokenLogoUrl=" + this.tokenLogoUrl + ", tokenName=" + this.tokenName + ", tokenSymbol=" + this.tokenSymbol + ", top10HoldAmountPercentage=" + this.top10HoldAmountPercentage + ", transactions=" + this.transactions + ", volume=" + this.volume + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.currentHolders;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long values() {
        return this.tokenCreateTime;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.common.TokenInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TokenInfo> serializer() {
            return TokenInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TokenInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list, String str11, long j, String str12, String str13, String str14, String str15, String str16, String str17, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.buyTransactions = "";
        } else {
            this.buyTransactions = str;
        }
        if ((i & 2) == 0) {
            this.chainBWLogoUrl = "";
        } else {
            this.chainBWLogoUrl = str2;
        }
        if ((i & 4) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str3;
        }
        if ((i & 8) == 0) {
            this.chainLogo = "";
        } else {
            this.chainLogo = str4;
        }
        if ((i & 16) == 0) {
            this.currentHolders = "";
        } else {
            this.currentHolders = str5;
        }
        if ((i & 32) == 0) {
            this.currentMcap = "";
        } else {
            this.currentMcap = str6;
        }
        if ((i & 64) == 0) {
            this.currentPrice = "";
        } else {
            this.currentPrice = str7;
        }
        if ((i & 128) == 0) {
            this.nativeTokenSymbol = "";
        } else {
            this.nativeTokenSymbol = str8;
        }
        if ((i & 256) == 0) {
            this.protocolId = "";
        } else {
            this.protocolId = str9;
        }
        if ((i & 512) == 0) {
            this.sellTransactions = "";
        } else {
            this.sellTransactions = str10;
        }
        this.newTagList = (i & 1024) == 0 ? yDY.AhwBna() : list;
        if ((i & 2048) == 0) {
            this.tokenContractAddress = "";
        } else {
            this.tokenContractAddress = str11;
        }
        this.tokenCreateTime = (i & 4096) == 0 ? 0L : j;
        if ((i & 8192) == 0) {
            this.tokenLogoUrl = "";
        } else {
            this.tokenLogoUrl = str12;
        }
        if ((i & 16384) == 0) {
            this.tokenName = "";
        } else {
            this.tokenName = str13;
        }
        if ((32768 & i) == 0) {
            this.tokenSymbol = "";
        } else {
            this.tokenSymbol = str14;
        }
        if ((65536 & i) == 0) {
            this.top10HoldAmountPercentage = "";
        } else {
            this.top10HoldAmountPercentage = str15;
        }
        if ((131072 & i) == 0) {
            this.transactions = "";
        } else {
            this.transactions = str16;
        }
        if ((i & 262144) == 0) {
            this.volume = "";
        } else {
            this.volume = str17;
        }
    }

    public static final /* synthetic */ void EZpvd(TokenInfo tokenInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) tokenInfo.buyTransactions, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, tokenInfo.buyTransactions);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) tokenInfo.chainBWLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, tokenInfo.chainBWLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) tokenInfo.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, tokenInfo.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) tokenInfo.chainLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, tokenInfo.chainLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) tokenInfo.currentHolders, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, tokenInfo.currentHolders);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) tokenInfo.currentMcap, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, tokenInfo.currentMcap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) tokenInfo.currentPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, tokenInfo.currentPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) tokenInfo.nativeTokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, tokenInfo.nativeTokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) tokenInfo.protocolId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, tokenInfo.protocolId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) tokenInfo.sellTransactions, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, tokenInfo.sellTransactions);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd(tokenInfo.newTagList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], tokenInfo.newTagList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) tokenInfo.tokenContractAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, tokenInfo.tokenContractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || tokenInfo.tokenCreateTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 12, tokenInfo.tokenCreateTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) tokenInfo.tokenLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, tokenInfo.tokenLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) tokenInfo.tokenName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, tokenInfo.tokenName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) tokenInfo.tokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, tokenInfo.tokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) tokenInfo.top10HoldAmountPercentage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, tokenInfo.top10HoldAmountPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) tokenInfo.transactions, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, tokenInfo.transactions);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) && Intrinsics.EZpvd((Object) tokenInfo.volume, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 18, tokenInfo.volume);
    }

    public TokenInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull List<CompactTagData> list, @NotNull String str11, long j, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17) {
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
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        this.buyTransactions = str;
        this.chainBWLogoUrl = str2;
        this.chainId = str3;
        this.chainLogo = str4;
        this.currentHolders = str5;
        this.currentMcap = str6;
        this.currentPrice = str7;
        this.nativeTokenSymbol = str8;
        this.protocolId = str9;
        this.sellTransactions = str10;
        this.newTagList = list;
        this.tokenContractAddress = str11;
        this.tokenCreateTime = j;
        this.tokenLogoUrl = str12;
        this.tokenName = str13;
        this.tokenSymbol = str14;
        this.top10HoldAmountPercentage = str15;
        this.transactions = str16;
        this.volume = str17;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00db: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r42v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r42v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r42v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r42v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r42v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r42v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r42v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r42v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r42v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r42v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0054: ARITH (r42v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0058: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:70)) : (r32v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005f: ARITH (r42v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0067: ARITH (r42v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r34v0 long))
  (wrap:java.lang.String:0x007b: TERNARY null = ((wrap:int:0x0072: ARITH (r42v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007d: ARITH (r42v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0089: ARITH (r42v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0094: ARITH (r42v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009f: ARITH (r42v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00aa: ARITH (r42v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.market.data.model.CompactTagData>, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:48) call: com.okinc.business.market.data.model.common.TokenInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TokenInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list, String str11, long j, String str12, String str13, String str14, String str15, String str16, String str17, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? yDY.AhwBna() : list, (i & 2048) != 0 ? "" : str11, (i & 4096) != 0 ? 0L : j, (i & 8192) != 0 ? "" : str12, (i & 16384) != 0 ? "" : str13, (i & 32768) != 0 ? "" : str14, (i & 65536) != 0 ? "" : str15, (i & 131072) != 0 ? "" : str16, (i & 262144) != 0 ? "" : str17);
    }
}
