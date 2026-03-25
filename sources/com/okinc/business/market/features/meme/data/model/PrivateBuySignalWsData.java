package com.okinc.business.market.features.meme.data.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.business.market.data.model.CompactTagData;
import com.okinc.business.market.data.model.CompactTagData$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class PrivateBuySignalWsData {
    private final String addressAlias;
    private final long blockHeight;
    private final long logIndex;
    private final String price;
    private final String riskControlLevel;
    private final String riskLevel;
    private final List<CompactTagData> tagData;
    private final List<Integer> tagTypeList;
    private final String tokenAddress;
    private final String tokenChainId;
    private final String tokenLogoUrl;
    private final String tokenSymbol;
    private final long tradeTime;
    private final String turnover;
    private final String txHash;
    private final int userActionType;
    private final int userActionTypeForDisplay;
    private final String walletAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(IntSerializer.INSTANCE), null, null, null, null, null, null, new ArrayListSerializer(CompactTagData$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PrivateBuySignalWsData() {
        this((List) null, (String) null, 0L, 0L, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, 0L, (String) null, (String) null, 0, 0, (String) null, 262143, (DefaultConstructorMarker) null);
    }

    @SerialName("addressAlias")
    public static /* synthetic */ void getAddressAlias$annotations() {
    }

    @SerialName("blockHeight")
    public static /* synthetic */ void getBlockHeight$annotations() {
    }

    @SerialName("logIndex")
    public static /* synthetic */ void getLogIndex$annotations() {
    }

    @SerialName(FirebaseAnalytics.Param.PRICE)
    public static /* synthetic */ void getPrice$annotations() {
    }

    @SerialName("riskControlLevel")
    public static /* synthetic */ void getRiskControlLevel$annotations() {
    }

    @SerialName("riskLevel")
    public static /* synthetic */ void getRiskLevel$annotations() {
    }

    @SerialName("t")
    public static /* synthetic */ void getTagData$annotations() {
    }

    @SerialName("tagTypeList")
    public static /* synthetic */ void getTagTypeList$annotations() {
    }

    @SerialName("tokenAddress")
    public static /* synthetic */ void getTokenAddress$annotations() {
    }

    @SerialName("tokenChainId")
    public static /* synthetic */ void getTokenChainId$annotations() {
    }

    @SerialName("tokenLogoUrl")
    public static /* synthetic */ void getTokenLogoUrl$annotations() {
    }

    @SerialName("tokenSymbol")
    public static /* synthetic */ void getTokenSymbol$annotations() {
    }

    @SerialName("tradeTime")
    public static /* synthetic */ void getTradeTime$annotations() {
    }

    @SerialName("turnover")
    public static /* synthetic */ void getTurnover$annotations() {
    }

    @SerialName("txHash")
    public static /* synthetic */ void getTxHash$annotations() {
    }

    @SerialName("userActionType")
    public static /* synthetic */ void getUserActionType$annotations() {
    }

    @SerialName("userActionTypeForDisplay")
    public static /* synthetic */ void getUserActionTypeForDisplay$annotations() {
    }

    @SerialName("walletAddress")
    public static /* synthetic */ void getWalletAddress$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component1() {
        return this.tagTypeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.tokenChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.tokenLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component13() {
        return this.tradeTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.turnover;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component16() {
        return this.userActionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component17() {
        return this.userActionTypeForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.walletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.addressAlias;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.blockHeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.logIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.riskControlLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.riskLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CompactTagData> component8() {
        return this.tagData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PrivateBuySignalWsData copy(@NotNull List<Integer> list, @NotNull String str, long j, long j2, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<CompactTagData> list2, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, long j3, @NotNull String str9, @NotNull String str10, int i, int i2, @NotNull String str11) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        return new PrivateBuySignalWsData(list, str, j, j2, str2, str3, str4, list2, str5, str6, str7, str8, j3, str9, str10, i, i2, str11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivateBuySignalWsData)) {
            return false;
        }
        PrivateBuySignalWsData privateBuySignalWsData = (PrivateBuySignalWsData) obj;
        return Intrinsics.EZpvd(this.tagTypeList, privateBuySignalWsData.tagTypeList) && Intrinsics.EZpvd((Object) this.addressAlias, (Object) privateBuySignalWsData.addressAlias) && this.blockHeight == privateBuySignalWsData.blockHeight && this.logIndex == privateBuySignalWsData.logIndex && Intrinsics.EZpvd((Object) this.price, (Object) privateBuySignalWsData.price) && Intrinsics.EZpvd((Object) this.riskControlLevel, (Object) privateBuySignalWsData.riskControlLevel) && Intrinsics.EZpvd((Object) this.riskLevel, (Object) privateBuySignalWsData.riskLevel) && Intrinsics.EZpvd(this.tagData, privateBuySignalWsData.tagData) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) privateBuySignalWsData.tokenAddress) && Intrinsics.EZpvd((Object) this.tokenChainId, (Object) privateBuySignalWsData.tokenChainId) && Intrinsics.EZpvd((Object) this.tokenLogoUrl, (Object) privateBuySignalWsData.tokenLogoUrl) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) privateBuySignalWsData.tokenSymbol) && this.tradeTime == privateBuySignalWsData.tradeTime && Intrinsics.EZpvd((Object) this.turnover, (Object) privateBuySignalWsData.turnover) && Intrinsics.EZpvd((Object) this.txHash, (Object) privateBuySignalWsData.txHash) && this.userActionType == privateBuySignalWsData.userActionType && this.userActionTypeForDisplay == privateBuySignalWsData.userActionTypeForDisplay && Intrinsics.EZpvd((Object) this.walletAddress, (Object) privateBuySignalWsData.walletAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddressAlias() {
        return this.addressAlias;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getBlockHeight() {
        return this.blockHeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getLogIndex() {
        return this.logIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRiskControlLevel() {
        return this.riskControlLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRiskLevel() {
        return this.riskLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CompactTagData> getTagData() {
        return this.tagData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getTagTypeList() {
        return this.tagTypeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenChainId() {
        return this.tokenChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenLogoUrl() {
        return this.tokenLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getTradeTime() {
        return this.tradeTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTurnover() {
        return this.turnover;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxHash() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getUserActionType() {
        return this.userActionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getUserActionTypeForDisplay() {
        return this.userActionTypeForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletAddress() {
        return this.walletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((this.tagTypeList.hashCode() * 31) + this.addressAlias.hashCode()) * 31) + Long.hashCode(this.blockHeight)) * 31) + Long.hashCode(this.logIndex)) * 31) + this.price.hashCode()) * 31) + this.riskControlLevel.hashCode()) * 31) + this.riskLevel.hashCode()) * 31) + this.tagData.hashCode()) * 31) + this.tokenAddress.hashCode()) * 31) + this.tokenChainId.hashCode()) * 31) + this.tokenLogoUrl.hashCode()) * 31) + this.tokenSymbol.hashCode()) * 31) + Long.hashCode(this.tradeTime)) * 31) + this.turnover.hashCode()) * 31) + this.txHash.hashCode()) * 31) + Integer.hashCode(this.userActionType)) * 31) + Integer.hashCode(this.userActionTypeForDisplay)) * 31) + this.walletAddress.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isBuySignal() {
        int i = this.userActionType;
        return i == 1 || i == 2 || i == 5 || this.userActionTypeForDisplay == 5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PrivateBuySignalWsData(tagTypeList=" + this.tagTypeList + ", addressAlias=" + this.addressAlias + ", blockHeight=" + this.blockHeight + ", logIndex=" + this.logIndex + ", price=" + this.price + ", riskControlLevel=" + this.riskControlLevel + ", riskLevel=" + this.riskLevel + ", tagData=" + this.tagData + ", tokenAddress=" + this.tokenAddress + ", tokenChainId=" + this.tokenChainId + ", tokenLogoUrl=" + this.tokenLogoUrl + ", tokenSymbol=" + this.tokenSymbol + ", tradeTime=" + this.tradeTime + ", turnover=" + this.turnover + ", txHash=" + this.txHash + ", userActionType=" + this.userActionType + ", userActionTypeForDisplay=" + this.userActionTypeForDisplay + ", walletAddress=" + this.walletAddress + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.meme.data.model.PrivateBuySignalWsData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PrivateBuySignalWsData> serializer() {
            return PrivateBuySignalWsData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PrivateBuySignalWsData(int i, List list, String str, long j, long j2, String str2, String str3, String str4, List list2, String str5, String str6, String str7, String str8, long j3, String str9, String str10, int i2, int i3, String str11, SerializationConstructorMarker serializationConstructorMarker) {
        this.tagTypeList = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.addressAlias = "";
        } else {
            this.addressAlias = str;
        }
        if ((i & 4) == 0) {
            this.blockHeight = 0L;
        } else {
            this.blockHeight = j;
        }
        if ((i & 8) == 0) {
            this.logIndex = 0L;
        } else {
            this.logIndex = j2;
        }
        if ((i & 16) == 0) {
            this.price = "";
        } else {
            this.price = str2;
        }
        if ((i & 32) == 0) {
            this.riskControlLevel = "";
        } else {
            this.riskControlLevel = str3;
        }
        if ((i & 64) == 0) {
            this.riskLevel = "";
        } else {
            this.riskLevel = str4;
        }
        this.tagData = (i & 128) == 0 ? yDY.AhwBna() : list2;
        if ((i & 256) == 0) {
            this.tokenAddress = "";
        } else {
            this.tokenAddress = str5;
        }
        if ((i & 512) == 0) {
            this.tokenChainId = "";
        } else {
            this.tokenChainId = str6;
        }
        if ((i & 1024) == 0) {
            this.tokenLogoUrl = "";
        } else {
            this.tokenLogoUrl = str7;
        }
        if ((i & 2048) == 0) {
            this.tokenSymbol = "";
        } else {
            this.tokenSymbol = str8;
        }
        this.tradeTime = (i & 4096) != 0 ? j3 : 0L;
        if ((i & 8192) == 0) {
            this.turnover = "";
        } else {
            this.turnover = str9;
        }
        if ((i & 16384) == 0) {
            this.txHash = "";
        } else {
            this.txHash = str10;
        }
        if ((32768 & i) == 0) {
            this.userActionType = 0;
        } else {
            this.userActionType = i2;
        }
        if ((65536 & i) == 0) {
            this.userActionTypeForDisplay = 0;
        } else {
            this.userActionTypeForDisplay = i3;
        }
        if ((i & 131072) == 0) {
            this.walletAddress = "";
        } else {
            this.walletAddress = str11;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(PrivateBuySignalWsData privateBuySignalWsData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(privateBuySignalWsData.tagTypeList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], privateBuySignalWsData.tagTypeList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) privateBuySignalWsData.addressAlias, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, privateBuySignalWsData.addressAlias);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || privateBuySignalWsData.blockHeight != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 2, privateBuySignalWsData.blockHeight);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || privateBuySignalWsData.logIndex != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 3, privateBuySignalWsData.logIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) privateBuySignalWsData.price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, privateBuySignalWsData.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) privateBuySignalWsData.riskControlLevel, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, privateBuySignalWsData.riskControlLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) privateBuySignalWsData.riskLevel, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, privateBuySignalWsData.riskLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd(privateBuySignalWsData.tagData, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], privateBuySignalWsData.tagData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) privateBuySignalWsData.tokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, privateBuySignalWsData.tokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) privateBuySignalWsData.tokenChainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, privateBuySignalWsData.tokenChainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) privateBuySignalWsData.tokenLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, privateBuySignalWsData.tokenLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) privateBuySignalWsData.tokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, privateBuySignalWsData.tokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || privateBuySignalWsData.tradeTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 12, privateBuySignalWsData.tradeTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) privateBuySignalWsData.turnover, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, privateBuySignalWsData.turnover);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) privateBuySignalWsData.txHash, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, privateBuySignalWsData.txHash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || privateBuySignalWsData.userActionType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 15, privateBuySignalWsData.userActionType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || privateBuySignalWsData.userActionTypeForDisplay != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 16, privateBuySignalWsData.userActionTypeForDisplay);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) && Intrinsics.EZpvd((Object) privateBuySignalWsData.walletAddress, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 17, privateBuySignalWsData.walletAddress);
    }

    public PrivateBuySignalWsData(@NotNull List<Integer> list, @NotNull String str, long j, long j2, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<CompactTagData> list2, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, long j3, @NotNull String str9, @NotNull String str10, int i, int i2, @NotNull String str11) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        this.tagTypeList = list;
        this.addressAlias = str;
        this.blockHeight = j;
        this.logIndex = j2;
        this.price = str2;
        this.riskControlLevel = str3;
        this.riskLevel = str4;
        this.tagData = list2;
        this.tokenAddress = str5;
        this.tokenChainId = str6;
        this.tokenLogoUrl = str7;
        this.tokenSymbol = str8;
        this.tradeTime = j3;
        this.turnover = str9;
        this.txHash = str10;
        this.userActionType = i;
        this.userActionTypeForDisplay = i2;
        this.walletAddress = str11;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00d3: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0002: ARITH (r44v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0006: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:12)) : (r23v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000d: ARITH (r44v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0017: ARITH (r44v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r25v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0020: ARITH (r44v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r27v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r44v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r44v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r44v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0041: ARITH (r44v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0045: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:26)) : (r32v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r44v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r44v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r44v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r44v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x006e: ARITH (r44v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r37v0 long))
  (wrap:java.lang.String:0x0080: TERNARY null = ((wrap:int:0x0077: ARITH (r44v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r44v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x008e: ARITH (r44v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r41v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x009b: ARITH (r44v0 int) & (65536 int) A[WRAPPED]) == (0 int)) ? (r42v0 int) : (0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a4: ARITH (r44v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
 A[MD:(java.util.List<java.lang.Integer>, java.lang.String, long, long, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.market.data.model.CompactTagData>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, int, int, java.lang.String):void (m)] (LINE:10) call: com.okinc.business.market.features.meme.data.model.PrivateBuySignalWsData.<init>(java.util.List, java.lang.String, long, long, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, int, int, java.lang.String):void type: THIS */
    public /* synthetic */ PrivateBuySignalWsData(List list, String str, long j, long j2, String str2, String str3, String str4, List list2, String str5, String str6, String str7, String str8, long j3, String str9, String str10, int i, int i2, String str11, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? yDY.AhwBna() : list, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? 0L : j, (i3 & 8) != 0 ? 0L : j2, (i3 & 16) != 0 ? "" : str2, (i3 & 32) != 0 ? "" : str3, (i3 & 64) != 0 ? "" : str4, (i3 & 128) != 0 ? yDY.AhwBna() : list2, (i3 & 256) != 0 ? "" : str5, (i3 & 512) != 0 ? "" : str6, (i3 & 1024) != 0 ? "" : str7, (i3 & 2048) != 0 ? "" : str8, (i3 & 4096) != 0 ? 0L : j3, (i3 & 8192) != 0 ? "" : str9, (i3 & 16384) != 0 ? "" : str10, (i3 & 32768) != 0 ? 0 : i, (i3 & 65536) == 0 ? i2 : 0, (i3 & 131072) != 0 ? "" : str11);
    }

    public final boolean isKOL() {
        return this.tagTypeList.contains(2);
    }

    public final boolean isSmartMoney() {
        return this.tagTypeList.contains(1);
    }
}
