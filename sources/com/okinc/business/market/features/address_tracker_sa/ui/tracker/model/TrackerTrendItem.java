package com.okinc.business.market.features.address_tracker_sa.ui.tracker.model;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
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
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class TrackerTrendItem {
    public final String chainBWLogoUrl;
    public final int chainId;
    public final String chainLogo;
    public final long firstPriceTime;
    public final String marketCap;
    public final String name;
    public final String price;
    public final String priceChange;
    public final String riskControlLevel;
    public final String riskLevel;
    public final String symbol;
    public final List<CompactTagData> t;
    public final String tokenContractAddress;
    public final String tokenLogoUrl;
    public final List<List<String>> tokenTagList;
    public final String totalInflow;
    public final long totalLastTxTime;
    public final int totalTxsBuy;
    public final int totalTxsSell;
    public final int totalUniqueTraderNum;
    public final String totalVolumeBuy;
    public final List<TrendTrader> traderList;
    public final int traderListSize;
    public final boolean viewMoreType;
    public final String volume;
    public final String walletAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(CompactTagData$$serializer.INSTANCE), null, null, new ArrayListSerializer(new ArrayListSerializer(StringSerializer.INSTANCE)), null, null, null, null, null, null, new ArrayListSerializer(TrendTrader$$serializer.INSTANCE), null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TrackerTrendItem() {
        this((String) null, 0, (String) null, 0L, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (List) null, (String) null, 0L, 0, 0, 0, (String) null, (List) null, 0, false, (String) null, (String) null, 67108863, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CompactTagData> AYXKKw() {
        return this.t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AkhnZx() {
        return this.totalVolumeBuy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.firstPriceTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrackerTrendItem copydefault(@NotNull String str, int i, @NotNull String str2, long j, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull List<CompactTagData> list, @NotNull String str10, @NotNull String str11, @NotNull List<? extends List<String>> list2, @NotNull String str12, long j2, int i2, int i3, int i4, @NotNull String str13, @NotNull List<TrendTrader> list3, int i5, boolean z, @NotNull String str14, @NotNull String str15) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        return new TrackerTrendItem(str, i, str2, j, str3, str4, str5, str6, str7, str8, str9, list, str10, str11, list2, str12, j2, i2, i3, i4, str13, list3, i5, z, str14, str15);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackerTrendItem)) {
            return false;
        }
        TrackerTrendItem trackerTrendItem = (TrackerTrendItem) obj;
        return Intrinsics.EZpvd((Object) this.chainBWLogoUrl, (Object) trackerTrendItem.chainBWLogoUrl) && this.chainId == trackerTrendItem.chainId && Intrinsics.EZpvd((Object) this.chainLogo, (Object) trackerTrendItem.chainLogo) && this.firstPriceTime == trackerTrendItem.firstPriceTime && Intrinsics.EZpvd((Object) this.marketCap, (Object) trackerTrendItem.marketCap) && Intrinsics.EZpvd((Object) this.name, (Object) trackerTrendItem.name) && Intrinsics.EZpvd((Object) this.price, (Object) trackerTrendItem.price) && Intrinsics.EZpvd((Object) this.priceChange, (Object) trackerTrendItem.priceChange) && Intrinsics.EZpvd((Object) this.riskControlLevel, (Object) trackerTrendItem.riskControlLevel) && Intrinsics.EZpvd((Object) this.riskLevel, (Object) trackerTrendItem.riskLevel) && Intrinsics.EZpvd((Object) this.symbol, (Object) trackerTrendItem.symbol) && Intrinsics.EZpvd(this.t, trackerTrendItem.t) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) trackerTrendItem.tokenContractAddress) && Intrinsics.EZpvd((Object) this.tokenLogoUrl, (Object) trackerTrendItem.tokenLogoUrl) && Intrinsics.EZpvd(this.tokenTagList, trackerTrendItem.tokenTagList) && Intrinsics.EZpvd((Object) this.totalInflow, (Object) trackerTrendItem.totalInflow) && this.totalLastTxTime == trackerTrendItem.totalLastTxTime && this.totalTxsBuy == trackerTrendItem.totalTxsBuy && this.totalTxsSell == trackerTrendItem.totalTxsSell && this.totalUniqueTraderNum == trackerTrendItem.totalUniqueTraderNum && Intrinsics.EZpvd((Object) this.totalVolumeBuy, (Object) trackerTrendItem.totalVolumeBuy) && Intrinsics.EZpvd(this.traderList, trackerTrendItem.traderList) && this.traderListSize == trackerTrendItem.traderListSize && this.viewMoreType == trackerTrendItem.viewMoreType && Intrinsics.EZpvd((Object) this.volume, (Object) trackerTrendItem.volume) && Intrinsics.EZpvd((Object) this.walletAddress, (Object) trackerTrendItem.walletAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fetchVPNInfo() {
        return this.viewMoreType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.tokenLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((this.chainBWLogoUrl.hashCode() * 31) + Integer.hashCode(this.chainId)) * 31) + this.chainLogo.hashCode()) * 31) + Long.hashCode(this.firstPriceTime)) * 31) + this.marketCap.hashCode()) * 31) + this.name.hashCode()) * 31) + this.price.hashCode()) * 31) + this.priceChange.hashCode()) * 31) + this.riskControlLevel.hashCode()) * 31) + this.riskLevel.hashCode()) * 31) + this.symbol.hashCode()) * 31) + this.t.hashCode()) * 31) + this.tokenContractAddress.hashCode()) * 31) + this.tokenLogoUrl.hashCode()) * 31) + this.tokenTagList.hashCode()) * 31) + this.totalInflow.hashCode()) * 31) + Long.hashCode(this.totalLastTxTime)) * 31) + Integer.hashCode(this.totalTxsBuy)) * 31) + Integer.hashCode(this.totalTxsSell)) * 31) + Integer.hashCode(this.totalUniqueTraderNum)) * 31) + this.totalVolumeBuy.hashCode()) * 31) + this.traderList.hashCode()) * 31) + Integer.hashCode(this.traderListSize)) * 31) + Boolean.hashCode(this.viewMoreType)) * 31) + this.volume.hashCode()) * 31) + this.walletAddress.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TrendTrader> isConnected() {
        return this.traderList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TrackerTrendItem(chainBWLogoUrl=" + this.chainBWLogoUrl + ", chainId=" + this.chainId + ", chainLogo=" + this.chainLogo + ", firstPriceTime=" + this.firstPriceTime + ", marketCap=" + this.marketCap + ", name=" + this.name + ", price=" + this.price + ", priceChange=" + this.priceChange + ", riskControlLevel=" + this.riskControlLevel + ", riskLevel=" + this.riskLevel + ", symbol=" + this.symbol + ", t=" + this.t + ", tokenContractAddress=" + this.tokenContractAddress + ", tokenLogoUrl=" + this.tokenLogoUrl + ", tokenTagList=" + this.tokenTagList + ", totalInflow=" + this.totalInflow + ", totalLastTxTime=" + this.totalLastTxTime + ", totalTxsBuy=" + this.totalTxsBuy + ", totalTxsSell=" + this.totalTxsSell + ", totalUniqueTraderNum=" + this.totalUniqueTraderNum + ", totalVolumeBuy=" + this.totalVolumeBuy + ", traderList=" + this.traderList + ", traderListSize=" + this.traderListSize + ", viewMoreType=" + this.viewMoreType + ", volume=" + this.volume + ", walletAddress=" + this.walletAddress + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int valueOf() {
        return this.totalUniqueTraderNum;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TrackerTrendItem> serializer() {
            return TrackerTrendItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TrackerTrendItem(int i, String str, int i2, String str2, long j, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, String str10, String str11, List list2, String str12, long j2, int i3, int i4, int i5, String str13, List list3, int i6, boolean z, String str14, String str15, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chainBWLogoUrl = "";
        } else {
            this.chainBWLogoUrl = str;
        }
        if ((i & 2) == 0) {
            this.chainId = 0;
        } else {
            this.chainId = i2;
        }
        if ((i & 4) == 0) {
            this.chainLogo = "";
        } else {
            this.chainLogo = str2;
        }
        if ((i & 8) == 0) {
            this.firstPriceTime = 0L;
        } else {
            this.firstPriceTime = j;
        }
        if ((i & 16) == 0) {
            this.marketCap = "";
        } else {
            this.marketCap = str3;
        }
        if ((i & 32) == 0) {
            this.name = "";
        } else {
            this.name = str4;
        }
        if ((i & 64) == 0) {
            this.price = "";
        } else {
            this.price = str5;
        }
        if ((i & 128) == 0) {
            this.priceChange = "";
        } else {
            this.priceChange = str6;
        }
        if ((i & 256) == 0) {
            this.riskControlLevel = "";
        } else {
            this.riskControlLevel = str7;
        }
        if ((i & 512) == 0) {
            this.riskLevel = "";
        } else {
            this.riskLevel = str8;
        }
        if ((i & 1024) == 0) {
            this.symbol = "";
        } else {
            this.symbol = str9;
        }
        this.t = (i & 2048) == 0 ? yDY.AhwBna() : list;
        if ((i & 4096) == 0) {
            this.tokenContractAddress = "";
        } else {
            this.tokenContractAddress = str10;
        }
        if ((i & 8192) == 0) {
            this.tokenLogoUrl = "";
        } else {
            this.tokenLogoUrl = str11;
        }
        this.tokenTagList = (i & 16384) == 0 ? yDY.AhwBna() : list2;
        if ((32768 & i) == 0) {
            this.totalInflow = "";
        } else {
            this.totalInflow = str12;
        }
        this.totalLastTxTime = (65536 & i) != 0 ? j2 : 0L;
        if ((131072 & i) == 0) {
            this.totalTxsBuy = 0;
        } else {
            this.totalTxsBuy = i3;
        }
        if ((262144 & i) == 0) {
            this.totalTxsSell = 0;
        } else {
            this.totalTxsSell = i4;
        }
        if ((524288 & i) == 0) {
            this.totalUniqueTraderNum = 0;
        } else {
            this.totalUniqueTraderNum = i5;
        }
        if ((1048576 & i) == 0) {
            this.totalVolumeBuy = "";
        } else {
            this.totalVolumeBuy = str13;
        }
        this.traderList = (2097152 & i) == 0 ? yDY.AhwBna() : list3;
        if ((4194304 & i) == 0) {
            this.traderListSize = 0;
        } else {
            this.traderListSize = i6;
        }
        if ((8388608 & i) == 0) {
            this.viewMoreType = false;
        } else {
            this.viewMoreType = z;
        }
        if ((16777216 & i) == 0) {
            this.volume = "";
        } else {
            this.volume = str14;
        }
        if ((i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) == 0) {
            this.walletAddress = "";
        } else {
            this.walletAddress = str15;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [20=4] */
    public static final /* synthetic */ void OLrzqt(TrackerTrendItem trackerTrendItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) trackerTrendItem.chainBWLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, trackerTrendItem.chainBWLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || trackerTrendItem.chainId != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, trackerTrendItem.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) trackerTrendItem.chainLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, trackerTrendItem.chainLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || trackerTrendItem.firstPriceTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 3, trackerTrendItem.firstPriceTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) trackerTrendItem.marketCap, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, trackerTrendItem.marketCap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) trackerTrendItem.name, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, trackerTrendItem.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) trackerTrendItem.price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, trackerTrendItem.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) trackerTrendItem.priceChange, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, trackerTrendItem.priceChange);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) trackerTrendItem.riskControlLevel, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, trackerTrendItem.riskControlLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) trackerTrendItem.riskLevel, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, trackerTrendItem.riskLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) trackerTrendItem.symbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, trackerTrendItem.symbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd(trackerTrendItem.t, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 11, kSerializerArr[11], trackerTrendItem.t);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) trackerTrendItem.tokenContractAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, trackerTrendItem.tokenContractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) trackerTrendItem.tokenLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, trackerTrendItem.tokenLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd(trackerTrendItem.tokenTagList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 14, kSerializerArr[14], trackerTrendItem.tokenTagList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) trackerTrendItem.totalInflow, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, trackerTrendItem.totalInflow);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || trackerTrendItem.totalLastTxTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 16, trackerTrendItem.totalLastTxTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || trackerTrendItem.totalTxsBuy != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 17, trackerTrendItem.totalTxsBuy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || trackerTrendItem.totalTxsSell != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 18, trackerTrendItem.totalTxsSell);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || trackerTrendItem.totalUniqueTraderNum != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 19, trackerTrendItem.totalUniqueTraderNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) trackerTrendItem.totalVolumeBuy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, trackerTrendItem.totalVolumeBuy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd(trackerTrendItem.traderList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 21, kSerializerArr[21], trackerTrendItem.traderList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || trackerTrendItem.traderListSize != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 22, trackerTrendItem.traderListSize);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || trackerTrendItem.viewMoreType) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 23, trackerTrendItem.viewMoreType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) trackerTrendItem.volume, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, trackerTrendItem.volume);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) && Intrinsics.EZpvd((Object) trackerTrendItem.walletAddress, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 25, trackerTrendItem.walletAddress);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r32v0, resolved type: java.util.List<? extends java.util.List<java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    public TrackerTrendItem(@NotNull String str, int i, @NotNull String str2, long j, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull List<CompactTagData> list, @NotNull String str10, @NotNull String str11, @NotNull List<? extends List<String>> list2, @NotNull String str12, long j2, int i2, int i3, int i4, @NotNull String str13, @NotNull List<TrendTrader> list3, int i5, boolean z, @NotNull String str14, @NotNull String str15) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        this.chainBWLogoUrl = str;
        this.chainId = i;
        this.chainLogo = str2;
        this.firstPriceTime = j;
        this.marketCap = str3;
        this.name = str4;
        this.price = str5;
        this.priceChange = str6;
        this.riskControlLevel = str7;
        this.riskLevel = str8;
        this.symbol = str9;
        this.t = list;
        this.tokenContractAddress = str10;
        this.tokenLogoUrl = str11;
        this.tokenTagList = list2;
        this.totalInflow = str12;
        this.totalLastTxTime = j2;
        this.totalTxsBuy = i2;
        this.totalTxsSell = i3;
        this.totalUniqueTraderNum = i4;
        this.totalVolumeBuy = str13;
        this.traderList = list3;
        this.traderListSize = i5;
        this.viewMoreType = z;
        this.volume = str14;
        this.walletAddress = str15;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x013a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r58v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000c: ARITH (r58v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r31v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r58v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x001c: ARITH (r58v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r33v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r58v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r58v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r58v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r58v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r58v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004d: ARITH (r58v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r58v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x005d: ARITH (r58v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0061: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:33)) : (r42v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0068: ARITH (r58v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:0x007b: TERNARY null = ((wrap:int:0x0072: ARITH (r58v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x007d: ARITH (r58v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0081: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:36)) : (r45v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008b: ARITH (r58v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0096: ARITH (r58v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r47v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00a1: ARITH (r58v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r49v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00ac: ARITH (r58v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r50v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00b7: ARITH (r58v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r51v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c2: ARITH (r58v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00cd: ARITH (r58v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00d1: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:43)) : (r53v0 java.util.List))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00da: ARITH (r58v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r54v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00e5: ARITH (r58v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? false : (r55v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f0: ARITH (r58v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fb: ARITH (r58v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r57v0 java.lang.String))
 A[MD:(java.lang.String, int, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.market.data.model.CompactTagData>, java.lang.String, java.lang.String, java.util.List<? extends java.util.List<java.lang.String>>, java.lang.String, long, int, int, int, java.lang.String, java.util.List<com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrendTrader>, int, boolean, java.lang.String, java.lang.String):void (m)] (LINE:21) call: com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendItem.<init>(java.lang.String, int, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.util.List, java.lang.String, long, int, int, int, java.lang.String, java.util.List, int, boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TrackerTrendItem(String str, int i, String str2, long j, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, String str10, String str11, List list2, String str12, long j2, int i2, int i3, int i4, String str13, List list3, int i5, boolean z, String str14, String str15, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? 0 : i, (i6 & 4) != 0 ? "" : str2, (i6 & 8) != 0 ? 0L : j, (i6 & 16) != 0 ? "" : str3, (i6 & 32) != 0 ? "" : str4, (i6 & 64) != 0 ? "" : str5, (i6 & 128) != 0 ? "" : str6, (i6 & 256) != 0 ? "" : str7, (i6 & 512) != 0 ? "" : str8, (i6 & 1024) != 0 ? "" : str9, (i6 & 2048) != 0 ? yDY.AhwBna() : list, (i6 & 4096) != 0 ? "" : str10, (i6 & 8192) != 0 ? "" : str11, (i6 & 16384) != 0 ? yDY.AhwBna() : list2, (i6 & 32768) != 0 ? "" : str12, (i6 & 65536) != 0 ? 0L : j2, (i6 & 131072) != 0 ? 0 : i2, (i6 & 262144) != 0 ? 0 : i3, (i6 & 524288) != 0 ? 0 : i4, (i6 & 1048576) != 0 ? "" : str13, (i6 & 2097152) != 0 ? yDY.AhwBna() : list3, (i6 & 4194304) != 0 ? 0 : i5, (i6 & 8388608) != 0 ? false : z, (i6 & 16777216) != 0 ? "" : str14, (i6 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str15);
    }
}
