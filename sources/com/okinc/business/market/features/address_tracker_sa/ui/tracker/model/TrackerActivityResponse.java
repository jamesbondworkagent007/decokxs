package com.okinc.business.market.features.address_tracker_sa.ui.tracker.model;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.market.data.model.CompactTagData;
import com.okinc.business.market.data.model.CompactTagData$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class TrackerActivityResponse {
    public static final KSerializer<Object>[] $childSerializers;
    public final String addressAlias;
    public final long blockHeight;
    public final String chainBWLogoUrl;
    public final String chainLogo;
    public final String chainName;
    public final String firstPriceTime;
    public final String holderCount;
    public final String liquidity;
    public final int logIndex;
    public final String marketCap;
    public final String price;
    public final String realizedProfit;
    public final String realizedProfitPercentage;
    public final String riskControlLevel;
    public final String riskLevel;
    public final List<CompactTagData> t;
    public final List<Integer> tagTypeList;
    public final String tokenAddress;
    public final String tokenChainId;
    public final String tokenLogoUrl;
    public final String tokenNum;
    public final String tokenSymbol;
    public final List<CompactTagData> tokenT;
    public final long tradeTime;
    public final String turnover;
    public final String txHash;
    public final String unrealizedProfit;
    public final String unrealizedProfitPercentage;
    public final int userActionTypeForDisplay;
    public final String walletAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TrackerActivityResponse() {
        this((String) null, (String) null, (String) null, (String) null, 0L, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (String) null, 0L, (String) null, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, LockFreeTaskQueueCore.MAX_CAPACITY_MASK, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.firstPriceTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.realizedProfitPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.realizedProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AkhnZx() {
        return this.tokenLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CompactTagData> AuCTel() {
        return this.tokenT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> DbNXlk() {
        return this.tagTypeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrackerActivityResponse EZpvd(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, int i, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull List<CompactTagData> list, @NotNull List<Integer> list2, @NotNull List<CompactTagData> list3, @NotNull String str16, long j2, @NotNull String str17, @NotNull String str18, int i2, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23) {
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
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        return new TrackerActivityResponse(str, str2, str3, str4, j, str5, str6, str7, str8, str9, str10, str11, i, str12, str13, str14, str15, list, list2, list3, str16, j2, str17, str18, i2, str19, str20, str21, str22, str23);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.addressAlias;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.holderCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String ejfBZ() {
        return this.tokenNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackerActivityResponse)) {
            return false;
        }
        TrackerActivityResponse trackerActivityResponse = (TrackerActivityResponse) obj;
        return Intrinsics.EZpvd((Object) this.tokenAddress, (Object) trackerActivityResponse.tokenAddress) && Intrinsics.EZpvd((Object) this.tokenChainId, (Object) trackerActivityResponse.tokenChainId) && Intrinsics.EZpvd((Object) this.walletAddress, (Object) trackerActivityResponse.walletAddress) && Intrinsics.EZpvd((Object) this.addressAlias, (Object) trackerActivityResponse.addressAlias) && this.blockHeight == trackerActivityResponse.blockHeight && Intrinsics.EZpvd((Object) this.chainBWLogoUrl, (Object) trackerActivityResponse.chainBWLogoUrl) && Intrinsics.EZpvd((Object) this.chainLogo, (Object) trackerActivityResponse.chainLogo) && Intrinsics.EZpvd((Object) this.chainName, (Object) trackerActivityResponse.chainName) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) trackerActivityResponse.tokenSymbol) && Intrinsics.EZpvd((Object) this.firstPriceTime, (Object) trackerActivityResponse.firstPriceTime) && Intrinsics.EZpvd((Object) this.liquidity, (Object) trackerActivityResponse.liquidity) && Intrinsics.EZpvd((Object) this.holderCount, (Object) trackerActivityResponse.holderCount) && this.logIndex == trackerActivityResponse.logIndex && Intrinsics.EZpvd((Object) this.marketCap, (Object) trackerActivityResponse.marketCap) && Intrinsics.EZpvd((Object) this.price, (Object) trackerActivityResponse.price) && Intrinsics.EZpvd((Object) this.riskControlLevel, (Object) trackerActivityResponse.riskControlLevel) && Intrinsics.EZpvd((Object) this.riskLevel, (Object) trackerActivityResponse.riskLevel) && Intrinsics.EZpvd(this.t, trackerActivityResponse.t) && Intrinsics.EZpvd(this.tagTypeList, trackerActivityResponse.tagTypeList) && Intrinsics.EZpvd(this.tokenT, trackerActivityResponse.tokenT) && Intrinsics.EZpvd((Object) this.tokenLogoUrl, (Object) trackerActivityResponse.tokenLogoUrl) && this.tradeTime == trackerActivityResponse.tradeTime && Intrinsics.EZpvd((Object) this.turnover, (Object) trackerActivityResponse.turnover) && Intrinsics.EZpvd((Object) this.txHash, (Object) trackerActivityResponse.txHash) && this.userActionTypeForDisplay == trackerActivityResponse.userActionTypeForDisplay && Intrinsics.EZpvd((Object) this.tokenNum, (Object) trackerActivityResponse.tokenNum) && Intrinsics.EZpvd((Object) this.realizedProfit, (Object) trackerActivityResponse.realizedProfit) && Intrinsics.EZpvd((Object) this.realizedProfitPercentage, (Object) trackerActivityResponse.realizedProfitPercentage) && Intrinsics.EZpvd((Object) this.unrealizedProfit, (Object) trackerActivityResponse.unrealizedProfit) && Intrinsics.EZpvd((Object) this.unrealizedProfitPercentage, (Object) trackerActivityResponse.unrealizedProfitPercentage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fARcdN() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fIwbmz() {
        return this.turnover;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long fJNWhG() {
        return this.tradeTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fetchVPNInfo() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFieldNames() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNewProxyInstance() {
        return this.unrealizedProfitPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String hDKMBd() {
        return this.unrealizedProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.tokenAddress.hashCode() * 31) + this.tokenChainId.hashCode()) * 31) + this.walletAddress.hashCode()) * 31) + this.addressAlias.hashCode()) * 31) + Long.hashCode(this.blockHeight)) * 31) + this.chainBWLogoUrl.hashCode()) * 31) + this.chainLogo.hashCode()) * 31) + this.chainName.hashCode()) * 31) + this.tokenSymbol.hashCode()) * 31) + this.firstPriceTime.hashCode()) * 31) + this.liquidity.hashCode()) * 31) + this.holderCount.hashCode()) * 31) + Integer.hashCode(this.logIndex)) * 31) + this.marketCap.hashCode()) * 31) + this.price.hashCode()) * 31) + this.riskControlLevel.hashCode()) * 31) + this.riskLevel.hashCode()) * 31) + this.t.hashCode()) * 31) + this.tagTypeList.hashCode()) * 31) + this.tokenT.hashCode()) * 31) + this.tokenLogoUrl.hashCode()) * 31) + Long.hashCode(this.tradeTime)) * 31) + this.turnover.hashCode()) * 31) + this.txHash.hashCode()) * 31) + Integer.hashCode(this.userActionTypeForDisplay)) * 31) + this.tokenNum.hashCode()) * 31) + this.realizedProfit.hashCode()) * 31) + this.realizedProfitPercentage.hashCode()) * 31) + this.unrealizedProfit.hashCode()) * 31) + this.unrealizedProfitPercentage.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isConnected() {
        return this.tokenChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String iwGUEr() {
        return this.walletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TrackerActivityResponse(tokenAddress=" + this.tokenAddress + ", tokenChainId=" + this.tokenChainId + ", walletAddress=" + this.walletAddress + ", addressAlias=" + this.addressAlias + ", blockHeight=" + this.blockHeight + ", chainBWLogoUrl=" + this.chainBWLogoUrl + ", chainLogo=" + this.chainLogo + ", chainName=" + this.chainName + ", tokenSymbol=" + this.tokenSymbol + ", firstPriceTime=" + this.firstPriceTime + ", liquidity=" + this.liquidity + ", holderCount=" + this.holderCount + ", logIndex=" + this.logIndex + ", marketCap=" + this.marketCap + ", price=" + this.price + ", riskControlLevel=" + this.riskControlLevel + ", riskLevel=" + this.riskLevel + ", t=" + this.t + ", tagTypeList=" + this.tagTypeList + ", tokenT=" + this.tokenT + ", tokenLogoUrl=" + this.tokenLogoUrl + ", tradeTime=" + this.tradeTime + ", turnover=" + this.turnover + ", txHash=" + this.txHash + ", userActionTypeForDisplay=" + this.userActionTypeForDisplay + ", tokenNum=" + this.tokenNum + ", realizedProfit=" + this.realizedProfit + ", realizedProfitPercentage=" + this.realizedProfitPercentage + ", unrealizedProfit=" + this.unrealizedProfit + ", unrealizedProfitPercentage=" + this.unrealizedProfitPercentage + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int uzCIH() {
        return this.userActionTypeForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.liquidity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CompactTagData> values() {
        return this.t;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerActivityResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TrackerActivityResponse> serializer() {
            return TrackerActivityResponse$$serializer.INSTANCE;
        }
    }

    static {
        CompactTagData$$serializer compactTagData$$serializer = CompactTagData$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(compactTagData$$serializer), new ArrayListSerializer(IntSerializer.INSTANCE), new ArrayListSerializer(compactTagData$$serializer), null, null, null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ TrackerActivityResponse(int i, String str, String str2, String str3, String str4, long j, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i2, String str12, String str13, String str14, String str15, List list, List list2, List list3, String str16, long j2, String str17, String str18, int i3, String str19, String str20, String str21, String str22, String str23, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.tokenAddress = "";
        } else {
            this.tokenAddress = str;
        }
        if ((i & 2) == 0) {
            this.tokenChainId = "";
        } else {
            this.tokenChainId = str2;
        }
        if ((i & 4) == 0) {
            this.walletAddress = "";
        } else {
            this.walletAddress = str3;
        }
        if ((i & 8) == 0) {
            this.addressAlias = "";
        } else {
            this.addressAlias = str4;
        }
        if ((i & 16) == 0) {
            this.blockHeight = 0L;
        } else {
            this.blockHeight = j;
        }
        if ((i & 32) == 0) {
            this.chainBWLogoUrl = "";
        } else {
            this.chainBWLogoUrl = str5;
        }
        if ((i & 64) == 0) {
            this.chainLogo = "";
        } else {
            this.chainLogo = str6;
        }
        if ((i & 128) == 0) {
            this.chainName = "";
        } else {
            this.chainName = str7;
        }
        if ((i & 256) == 0) {
            this.tokenSymbol = "";
        } else {
            this.tokenSymbol = str8;
        }
        if ((i & 512) == 0) {
            this.firstPriceTime = "";
        } else {
            this.firstPriceTime = str9;
        }
        if ((i & 1024) == 0) {
            this.liquidity = "";
        } else {
            this.liquidity = str10;
        }
        if ((i & 2048) == 0) {
            this.holderCount = "";
        } else {
            this.holderCount = str11;
        }
        if ((i & 4096) == 0) {
            this.logIndex = 0;
        } else {
            this.logIndex = i2;
        }
        if ((i & 8192) == 0) {
            this.marketCap = "";
        } else {
            this.marketCap = str12;
        }
        if ((i & 16384) == 0) {
            this.price = "";
        } else {
            this.price = str13;
        }
        if ((32768 & i) == 0) {
            this.riskControlLevel = "";
        } else {
            this.riskControlLevel = str14;
        }
        if ((65536 & i) == 0) {
            this.riskLevel = "";
        } else {
            this.riskLevel = str15;
        }
        this.t = (131072 & i) == 0 ? yDY.AhwBna() : list;
        this.tagTypeList = (262144 & i) == 0 ? yDY.AhwBna() : list2;
        this.tokenT = (524288 & i) == 0 ? yDY.AhwBna() : list3;
        if ((1048576 & i) == 0) {
            this.tokenLogoUrl = "";
        } else {
            this.tokenLogoUrl = str16;
        }
        this.tradeTime = (2097152 & i) != 0 ? j2 : 0L;
        if ((4194304 & i) == 0) {
            this.turnover = "";
        } else {
            this.turnover = str17;
        }
        if ((8388608 & i) == 0) {
            this.txHash = "";
        } else {
            this.txHash = str18;
        }
        if ((16777216 & i) == 0) {
            this.userActionTypeForDisplay = 0;
        } else {
            this.userActionTypeForDisplay = i3;
        }
        if ((33554432 & i) == 0) {
            this.tokenNum = "";
        } else {
            this.tokenNum = str19;
        }
        if ((67108864 & i) == 0) {
            this.realizedProfit = "";
        } else {
            this.realizedProfit = str20;
        }
        if ((134217728 & i) == 0) {
            this.realizedProfitPercentage = "";
        } else {
            this.realizedProfitPercentage = str21;
        }
        if ((268435456 & i) == 0) {
            this.unrealizedProfit = "";
        } else {
            this.unrealizedProfit = str22;
        }
        if ((i & 536870912) == 0) {
            this.unrealizedProfitPercentage = "";
        } else {
            this.unrealizedProfitPercentage = str23;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [10=4] */
    public static final /* synthetic */ void OLrzqt(TrackerActivityResponse trackerActivityResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) trackerActivityResponse.tokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, trackerActivityResponse.tokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) trackerActivityResponse.tokenChainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, trackerActivityResponse.tokenChainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) trackerActivityResponse.walletAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, trackerActivityResponse.walletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) trackerActivityResponse.addressAlias, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, trackerActivityResponse.addressAlias);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || trackerActivityResponse.blockHeight != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 4, trackerActivityResponse.blockHeight);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) trackerActivityResponse.chainBWLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, trackerActivityResponse.chainBWLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) trackerActivityResponse.chainLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, trackerActivityResponse.chainLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) trackerActivityResponse.chainName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, trackerActivityResponse.chainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) trackerActivityResponse.tokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, trackerActivityResponse.tokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) trackerActivityResponse.firstPriceTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, trackerActivityResponse.firstPriceTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) trackerActivityResponse.liquidity, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, trackerActivityResponse.liquidity);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) trackerActivityResponse.holderCount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, trackerActivityResponse.holderCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || trackerActivityResponse.logIndex != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 12, trackerActivityResponse.logIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) trackerActivityResponse.marketCap, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, trackerActivityResponse.marketCap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) trackerActivityResponse.price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, trackerActivityResponse.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) trackerActivityResponse.riskControlLevel, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, trackerActivityResponse.riskControlLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) trackerActivityResponse.riskLevel, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, trackerActivityResponse.riskLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd(trackerActivityResponse.t, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 17, kSerializerArr[17], trackerActivityResponse.t);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd(trackerActivityResponse.tagTypeList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 18, kSerializerArr[18], trackerActivityResponse.tagTypeList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd(trackerActivityResponse.tokenT, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 19, kSerializerArr[19], trackerActivityResponse.tokenT);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) trackerActivityResponse.tokenLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, trackerActivityResponse.tokenLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || trackerActivityResponse.tradeTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 21, trackerActivityResponse.tradeTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) trackerActivityResponse.turnover, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, trackerActivityResponse.turnover);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) trackerActivityResponse.txHash, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, trackerActivityResponse.txHash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || trackerActivityResponse.userActionTypeForDisplay != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 24, trackerActivityResponse.userActionTypeForDisplay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) trackerActivityResponse.tokenNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, trackerActivityResponse.tokenNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) trackerActivityResponse.realizedProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, trackerActivityResponse.realizedProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) trackerActivityResponse.realizedProfitPercentage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, trackerActivityResponse.realizedProfitPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) trackerActivityResponse.unrealizedProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, trackerActivityResponse.unrealizedProfit);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) && Intrinsics.EZpvd((Object) trackerActivityResponse.unrealizedProfitPercentage, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 29, trackerActivityResponse.unrealizedProfitPercentage);
    }

    public TrackerActivityResponse(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, int i, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull List<CompactTagData> list, @NotNull List<Integer> list2, @NotNull List<CompactTagData> list3, @NotNull String str16, long j2, @NotNull String str17, @NotNull String str18, int i2, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23) {
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
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        this.tokenAddress = str;
        this.tokenChainId = str2;
        this.walletAddress = str3;
        this.addressAlias = str4;
        this.blockHeight = j;
        this.chainBWLogoUrl = str5;
        this.chainLogo = str6;
        this.chainName = str7;
        this.tokenSymbol = str8;
        this.firstPriceTime = str9;
        this.liquidity = str10;
        this.holderCount = str11;
        this.logIndex = i;
        this.marketCap = str12;
        this.price = str13;
        this.riskControlLevel = str14;
        this.riskLevel = str15;
        this.t = list;
        this.tagTypeList = list2;
        this.tokenT = list3;
        this.tokenLogoUrl = str16;
        this.tradeTime = j2;
        this.turnover = str17;
        this.txHash = str18;
        this.userActionTypeForDisplay = i2;
        this.tokenNum = str19;
        this.realizedProfit = str20;
        this.realizedProfitPercentage = str21;
        this.unrealizedProfit = str22;
        this.unrealizedProfitPercentage = str23;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x016e: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r66v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r66v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r66v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r66v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0024: ARITH (r66v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r38v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r66v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r66v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r66v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r66v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004d: ARITH (r66v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r66v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005d: ARITH (r66v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0065: ARITH (r66v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r47v0 int))
  (wrap:java.lang.String:0x007b: TERNARY null = ((wrap:int:0x0072: ARITH (r66v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007d: ARITH (r66v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0089: ARITH (r66v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0094: ARITH (r66v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x009f: ARITH (r66v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00a3: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:29)) : (r52v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00ac: ARITH (r66v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00b0: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:30)) : (r53v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00b9: ARITH (r66v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00bd: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:31)) : (r54v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c6: ARITH (r66v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x00d1: ARITH (r66v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r56v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00dc: ARITH (r66v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e7: ARITH (r66v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r59v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00f2: ARITH (r66v0 int) & (16777216 int) A[WRAPPED]) == (0 int)) ? (r60v0 int) : (0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fb: ARITH (r66v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r61v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0106: ARITH (r66v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r62v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0111: ARITH (r66v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r63v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x011c: ARITH (r66v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r64v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0127: ARITH (r66v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? ("") : (r65v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.market.data.model.CompactTagData>, java.util.List<java.lang.Integer>, java.util.List<com.okinc.business.market.data.model.CompactTagData>, java.lang.String, long, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:11) call: com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerActivityResponse.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List, java.lang.String, long, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TrackerActivityResponse(String str, String str2, String str3, String str4, long j, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, String str12, String str13, String str14, String str15, List list, List list2, List list3, String str16, long j2, String str17, String str18, int i2, String str19, String str20, String str21, String str22, String str23, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? "" : str4, (i3 & 16) != 0 ? 0L : j, (i3 & 32) != 0 ? "" : str5, (i3 & 64) != 0 ? "" : str6, (i3 & 128) != 0 ? "" : str7, (i3 & 256) != 0 ? "" : str8, (i3 & 512) != 0 ? "" : str9, (i3 & 1024) != 0 ? "" : str10, (i3 & 2048) != 0 ? "" : str11, (i3 & 4096) != 0 ? 0 : i, (i3 & 8192) != 0 ? "" : str12, (i3 & 16384) != 0 ? "" : str13, (i3 & 32768) != 0 ? "" : str14, (i3 & 65536) != 0 ? "" : str15, (i3 & 131072) != 0 ? yDY.AhwBna() : list, (i3 & 262144) != 0 ? yDY.AhwBna() : list2, (i3 & 524288) != 0 ? yDY.AhwBna() : list3, (i3 & 1048576) != 0 ? "" : str16, (i3 & 2097152) != 0 ? 0L : j2, (i3 & 4194304) != 0 ? "" : str17, (i3 & 8388608) != 0 ? "" : str18, (i3 & 16777216) == 0 ? i2 : 0, (i3 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str19, (i3 & 67108864) != 0 ? "" : str20, (i3 & 134217728) != 0 ? "" : str21, (i3 & 268435456) != 0 ? "" : str22, (i3 & 536870912) != 0 ? "" : str23);
    }
}
