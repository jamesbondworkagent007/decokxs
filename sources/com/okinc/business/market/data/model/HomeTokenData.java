package com.okinc.business.market.data.model;

import com.okinc.business.market.common.constants.StringBooleanType;
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
public final class HomeTokenData {
    public final String chainId;
    public final String change;
    public final String firstPriceTime;
    public final String holders;
    public final StringBooleanType isFavoriteToken;
    public final String liquidity;
    public final String marketCap;
    public final String price;
    public final String riskControlLevel;
    public final String riskLevel;
    public final String searchNum;
    public final List<CompactTagData> tagList;
    public final String tokenContractAddress;
    public final String tokenLogoUrl;
    public final String tokenScoreRank;
    public final String tokenSymbol;
    public final String txs;
    public final String txsBuy;
    public final String txsSell;
    public final String uniqueTraders;
    public final String volume;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, StringBooleanType.Companion.serializer(), null, null, null, null, null, null, new ArrayListSerializer(CompactTagData$$serializer.INSTANCE), null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HomeTokenData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (StringBooleanType) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, 2097151, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.change;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CompactTagData> AhwBna() {
        return this.tagList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AkhnZx() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AuCTel() {
        return this.volume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String DbNXlk() {
        return this.tokenScoreRank;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HomeTokenData EZpvd(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull StringBooleanType stringBooleanType, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull List<CompactTagData> list, @NotNull String str17, @NotNull String str18, @NotNull String str19) {
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
        Intrinsics.checkNotNullParameter(stringBooleanType, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        return new HomeTokenData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, stringBooleanType, str11, str12, str13, str14, str15, str16, list, str17, str18, str19);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.holders;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.firstPriceTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.liquidity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String ejfBZ() {
        return this.txsBuy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeTokenData)) {
            return false;
        }
        HomeTokenData homeTokenData = (HomeTokenData) obj;
        return Intrinsics.EZpvd((Object) this.price, (Object) homeTokenData.price) && Intrinsics.EZpvd((Object) this.change, (Object) homeTokenData.change) && Intrinsics.EZpvd((Object) this.txs, (Object) homeTokenData.txs) && Intrinsics.EZpvd((Object) this.txsBuy, (Object) homeTokenData.txsBuy) && Intrinsics.EZpvd((Object) this.txsSell, (Object) homeTokenData.txsSell) && Intrinsics.EZpvd((Object) this.uniqueTraders, (Object) homeTokenData.uniqueTraders) && Intrinsics.EZpvd((Object) this.volume, (Object) homeTokenData.volume) && Intrinsics.EZpvd((Object) this.marketCap, (Object) homeTokenData.marketCap) && Intrinsics.EZpvd((Object) this.liquidity, (Object) homeTokenData.liquidity) && Intrinsics.EZpvd((Object) this.firstPriceTime, (Object) homeTokenData.firstPriceTime) && this.isFavoriteToken == homeTokenData.isFavoriteToken && Intrinsics.EZpvd((Object) this.holders, (Object) homeTokenData.holders) && Intrinsics.EZpvd((Object) this.searchNum, (Object) homeTokenData.searchNum) && Intrinsics.EZpvd((Object) this.chainId, (Object) homeTokenData.chainId) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) homeTokenData.tokenContractAddress) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) homeTokenData.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenLogoUrl, (Object) homeTokenData.tokenLogoUrl) && Intrinsics.EZpvd(this.tagList, homeTokenData.tagList) && Intrinsics.EZpvd((Object) this.riskControlLevel, (Object) homeTokenData.riskControlLevel) && Intrinsics.EZpvd((Object) this.riskLevel, (Object) homeTokenData.riskLevel) && Intrinsics.EZpvd((Object) this.tokenScoreRank, (Object) homeTokenData.tokenScoreRank);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fARcdN() {
        return this.txsSell;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fJNWhG() {
        return this.uniqueTraders;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fetchVPNInfo() {
        return this.txs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((this.price.hashCode() * 31) + this.change.hashCode()) * 31) + this.txs.hashCode()) * 31) + this.txsBuy.hashCode()) * 31) + this.txsSell.hashCode()) * 31) + this.uniqueTraders.hashCode()) * 31) + this.volume.hashCode()) * 31) + this.marketCap.hashCode()) * 31) + this.liquidity.hashCode()) * 31) + this.firstPriceTime.hashCode()) * 31) + this.isFavoriteToken.hashCode()) * 31) + this.holders.hashCode()) * 31) + this.searchNum.hashCode()) * 31) + this.chainId.hashCode()) * 31) + this.tokenContractAddress.hashCode()) * 31) + this.tokenSymbol.hashCode()) * 31) + this.tokenLogoUrl.hashCode()) * 31) + this.tagList.hashCode()) * 31) + this.riskControlLevel.hashCode()) * 31) + this.riskLevel.hashCode()) * 31) + this.tokenScoreRank.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isConnected() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HomeTokenData(price=" + this.price + ", change=" + this.change + ", txs=" + this.txs + ", txsBuy=" + this.txsBuy + ", txsSell=" + this.txsSell + ", uniqueTraders=" + this.uniqueTraders + ", volume=" + this.volume + ", marketCap=" + this.marketCap + ", liquidity=" + this.liquidity + ", firstPriceTime=" + this.firstPriceTime + ", isFavoriteToken=" + this.isFavoriteToken + ", holders=" + this.holders + ", searchNum=" + this.searchNum + ", chainId=" + this.chainId + ", tokenContractAddress=" + this.tokenContractAddress + ", tokenSymbol=" + this.tokenSymbol + ", tokenLogoUrl=" + this.tokenLogoUrl + ", tagList=" + this.tagList + ", riskControlLevel=" + this.riskControlLevel + ", riskLevel=" + this.riskLevel + ", tokenScoreRank=" + this.tokenScoreRank + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.riskControlLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String values() {
        return this.tokenLogoUrl;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.HomeTokenData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HomeTokenData> serializer() {
            return HomeTokenData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HomeTokenData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, StringBooleanType stringBooleanType, String str11, String str12, String str13, String str14, String str15, String str16, List list, String str17, String str18, String str19, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.price = "";
        } else {
            this.price = str;
        }
        if ((i & 2) == 0) {
            this.change = "";
        } else {
            this.change = str2;
        }
        if ((i & 4) == 0) {
            this.txs = "";
        } else {
            this.txs = str3;
        }
        if ((i & 8) == 0) {
            this.txsBuy = "";
        } else {
            this.txsBuy = str4;
        }
        if ((i & 16) == 0) {
            this.txsSell = "";
        } else {
            this.txsSell = str5;
        }
        if ((i & 32) == 0) {
            this.uniqueTraders = "";
        } else {
            this.uniqueTraders = str6;
        }
        if ((i & 64) == 0) {
            this.volume = "";
        } else {
            this.volume = str7;
        }
        if ((i & 128) == 0) {
            this.marketCap = "";
        } else {
            this.marketCap = str8;
        }
        if ((i & 256) == 0) {
            this.liquidity = "";
        } else {
            this.liquidity = str9;
        }
        if ((i & 512) == 0) {
            this.firstPriceTime = "";
        } else {
            this.firstPriceTime = str10;
        }
        this.isFavoriteToken = (i & 1024) == 0 ? StringBooleanType.FALSE : stringBooleanType;
        if ((i & 2048) == 0) {
            this.holders = "";
        } else {
            this.holders = str11;
        }
        if ((i & 4096) == 0) {
            this.searchNum = "";
        } else {
            this.searchNum = str12;
        }
        if ((i & 8192) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str13;
        }
        if ((i & 16384) == 0) {
            this.tokenContractAddress = "";
        } else {
            this.tokenContractAddress = str14;
        }
        if ((32768 & i) == 0) {
            this.tokenSymbol = "";
        } else {
            this.tokenSymbol = str15;
        }
        if ((65536 & i) == 0) {
            this.tokenLogoUrl = "";
        } else {
            this.tokenLogoUrl = str16;
        }
        this.tagList = (131072 & i) == 0 ? yDY.AhwBna() : list;
        if ((262144 & i) == 0) {
            this.riskControlLevel = "";
        } else {
            this.riskControlLevel = str17;
        }
        if ((524288 & i) == 0) {
            this.riskLevel = "";
        } else {
            this.riskLevel = str18;
        }
        if ((i & 1048576) == 0) {
            this.tokenScoreRank = "";
        } else {
            this.tokenScoreRank = str19;
        }
    }

    public static final /* synthetic */ void AEQbTJ(HomeTokenData homeTokenData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) homeTokenData.price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, homeTokenData.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) homeTokenData.change, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, homeTokenData.change);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) homeTokenData.txs, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, homeTokenData.txs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) homeTokenData.txsBuy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, homeTokenData.txsBuy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) homeTokenData.txsSell, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, homeTokenData.txsSell);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) homeTokenData.uniqueTraders, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, homeTokenData.uniqueTraders);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) homeTokenData.volume, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, homeTokenData.volume);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) homeTokenData.marketCap, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, homeTokenData.marketCap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) homeTokenData.liquidity, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, homeTokenData.liquidity);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) homeTokenData.firstPriceTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, homeTokenData.firstPriceTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || homeTokenData.isFavoriteToken != StringBooleanType.FALSE) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], homeTokenData.isFavoriteToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) homeTokenData.holders, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, homeTokenData.holders);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) homeTokenData.searchNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, homeTokenData.searchNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) homeTokenData.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, homeTokenData.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) homeTokenData.tokenContractAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, homeTokenData.tokenContractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) homeTokenData.tokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, homeTokenData.tokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) homeTokenData.tokenLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, homeTokenData.tokenLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd(homeTokenData.tagList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 17, kSerializerArr[17], homeTokenData.tagList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) homeTokenData.riskControlLevel, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, homeTokenData.riskControlLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) homeTokenData.riskLevel, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, homeTokenData.riskLevel);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) && Intrinsics.EZpvd((Object) homeTokenData.tokenScoreRank, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 20, homeTokenData.tokenScoreRank);
    }

    public HomeTokenData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull StringBooleanType stringBooleanType, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull List<CompactTagData> list, @NotNull String str17, @NotNull String str18, @NotNull String str19) {
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
        Intrinsics.checkNotNullParameter(stringBooleanType, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        this.price = str;
        this.change = str2;
        this.txs = str3;
        this.txsBuy = str4;
        this.txsSell = str5;
        this.uniqueTraders = str6;
        this.volume = str7;
        this.marketCap = str8;
        this.liquidity = str9;
        this.firstPriceTime = str10;
        this.isFavoriteToken = stringBooleanType;
        this.holders = str11;
        this.searchNum = str12;
        this.chainId = str13;
        this.tokenContractAddress = str14;
        this.tokenSymbol = str15;
        this.tokenLogoUrl = str16;
        this.tagList = list;
        this.riskControlLevel = str17;
        this.riskLevel = str18;
        this.tokenScoreRank = str19;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00f1: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r44v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r44v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r44v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r44v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r44v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r44v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r44v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r44v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r44v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r44v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:com.okinc.business.market.common.constants.StringBooleanType:?: TERNARY null = ((wrap:int:0x0054: ARITH (r44v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0058: SGET  A[WRAPPED] (LINE:30) com.okinc.business.market.common.constants.StringBooleanType.FALSE com.okinc.business.market.common.constants.StringBooleanType) : (r33v0 com.okinc.business.market.common.constants.StringBooleanType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005d: ARITH (r44v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0065: ARITH (r44v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006d: ARITH (r44v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0077: ARITH (r44v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0083: ARITH (r44v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008e: ARITH (r44v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0099: ARITH (r44v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x009d: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:44)) : (r40v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a6: ARITH (r44v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b1: ARITH (r44v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bc: ARITH (r44v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.StringBooleanType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.market.data.model.CompactTagData>, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.business.market.data.model.HomeTokenData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.StringBooleanType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ HomeTokenData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, StringBooleanType stringBooleanType, String str11, String str12, String str13, String str14, String str15, String str16, List list, String str17, String str18, String str19, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? StringBooleanType.FALSE : stringBooleanType, (i & 2048) != 0 ? "" : str11, (i & 4096) != 0 ? "" : str12, (i & 8192) != 0 ? "" : str13, (i & 16384) != 0 ? "" : str14, (i & 32768) != 0 ? "" : str15, (i & 65536) != 0 ? "" : str16, (i & 131072) != 0 ? yDY.AhwBna() : list, (i & 262144) != 0 ? "" : str17, (i & 524288) != 0 ? "" : str18, (i & 1048576) != 0 ? "" : str19);
    }
}
