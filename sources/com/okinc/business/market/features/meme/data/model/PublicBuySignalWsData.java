package com.okinc.business.market.features.meme.data.model;

import androidx.camera.video.AudioStats;
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
public final class PublicBuySignalWsData {
    private final String addressAlias;
    private final long blockHeight;
    private final long blockTime;
    private final long logIndex;
    private final String price;
    private final List<CompactTagData> tagData;
    private final String tagType;
    private final List<Integer> tagTypeList;
    private final String tokenAddress;
    private final int tokenChainId;
    private final String tokenLogoUrl;
    private final String tokenSymbol;
    private final double turnover;
    private final String txHash;
    private final int userActionType;
    private final int userActionTypeForDisplay;
    private final String walletAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(IntSerializer.INSTANCE), null, null, null, null, null, new ArrayListSerializer(CompactTagData$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PublicBuySignalWsData() {
        this((List) null, (String) null, 0L, 0L, 0L, (String) null, (List) null, (String) null, (String) null, 0, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, (String) null, 0, 0, (String) null, 131071, (DefaultConstructorMarker) null);
    }

    @SerialName("addressAlias")
    public static /* synthetic */ void getAddressAlias$annotations() {
    }

    @SerialName("blockHeight")
    public static /* synthetic */ void getBlockHeight$annotations() {
    }

    @SerialName("blockTime")
    public static /* synthetic */ void getBlockTime$annotations() {
    }

    @SerialName("logIndex")
    public static /* synthetic */ void getLogIndex$annotations() {
    }

    @SerialName(FirebaseAnalytics.Param.PRICE)
    public static /* synthetic */ void getPrice$annotations() {
    }

    @SerialName("t")
    public static /* synthetic */ void getTagData$annotations() {
    }

    @SerialName("tagType")
    public static /* synthetic */ void getTagType$annotations() {
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
    public final int component10() {
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
    public final double component13() {
        return this.turnover;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component15() {
        return this.userActionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component16() {
        return this.userActionTypeForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
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
        return this.blockTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component5() {
        return this.logIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CompactTagData> component7() {
        return this.tagData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.tagType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PublicBuySignalWsData copy(@NotNull List<Integer> list, @NotNull String str, long j, long j2, long j3, @NotNull String str2, @NotNull List<CompactTagData> list2, @NotNull String str3, @NotNull String str4, int i, @NotNull String str5, @NotNull String str6, double d, @NotNull String str7, int i2, int i3, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new PublicBuySignalWsData(list, str, j, j2, j3, str2, list2, str3, str4, i, str5, str6, d, str7, i2, i3, str8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PublicBuySignalWsData)) {
            return false;
        }
        PublicBuySignalWsData publicBuySignalWsData = (PublicBuySignalWsData) obj;
        return Intrinsics.EZpvd(this.tagTypeList, publicBuySignalWsData.tagTypeList) && Intrinsics.EZpvd((Object) this.addressAlias, (Object) publicBuySignalWsData.addressAlias) && this.blockHeight == publicBuySignalWsData.blockHeight && this.blockTime == publicBuySignalWsData.blockTime && this.logIndex == publicBuySignalWsData.logIndex && Intrinsics.EZpvd((Object) this.price, (Object) publicBuySignalWsData.price) && Intrinsics.EZpvd(this.tagData, publicBuySignalWsData.tagData) && Intrinsics.EZpvd((Object) this.tagType, (Object) publicBuySignalWsData.tagType) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) publicBuySignalWsData.tokenAddress) && this.tokenChainId == publicBuySignalWsData.tokenChainId && Intrinsics.EZpvd((Object) this.tokenLogoUrl, (Object) publicBuySignalWsData.tokenLogoUrl) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) publicBuySignalWsData.tokenSymbol) && Double.compare(this.turnover, publicBuySignalWsData.turnover) == 0 && Intrinsics.EZpvd((Object) this.txHash, (Object) publicBuySignalWsData.txHash) && this.userActionType == publicBuySignalWsData.userActionType && this.userActionTypeForDisplay == publicBuySignalWsData.userActionTypeForDisplay && Intrinsics.EZpvd((Object) this.walletAddress, (Object) publicBuySignalWsData.walletAddress);
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
    public final long getBlockTime() {
        return this.blockTime;
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
    public final List<CompactTagData> getTagData() {
        return this.tagData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTagType() {
        return this.tagType;
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
    public final int getTokenChainId() {
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
    public final double getTurnover() {
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
        return (((((((((((((((((((((((((((((((this.tagTypeList.hashCode() * 31) + this.addressAlias.hashCode()) * 31) + Long.hashCode(this.blockHeight)) * 31) + Long.hashCode(this.blockTime)) * 31) + Long.hashCode(this.logIndex)) * 31) + this.price.hashCode()) * 31) + this.tagData.hashCode()) * 31) + this.tagType.hashCode()) * 31) + this.tokenAddress.hashCode()) * 31) + Integer.hashCode(this.tokenChainId)) * 31) + this.tokenLogoUrl.hashCode()) * 31) + this.tokenSymbol.hashCode()) * 31) + Double.hashCode(this.turnover)) * 31) + this.txHash.hashCode()) * 31) + Integer.hashCode(this.userActionType)) * 31) + Integer.hashCode(this.userActionTypeForDisplay)) * 31) + this.walletAddress.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isBuySignal() {
        int i = this.userActionType;
        return i == 1 || i == 2 || i == 5 || this.userActionTypeForDisplay == 5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PublicBuySignalWsData(tagTypeList=" + this.tagTypeList + ", addressAlias=" + this.addressAlias + ", blockHeight=" + this.blockHeight + ", blockTime=" + this.blockTime + ", logIndex=" + this.logIndex + ", price=" + this.price + ", tagData=" + this.tagData + ", tagType=" + this.tagType + ", tokenAddress=" + this.tokenAddress + ", tokenChainId=" + this.tokenChainId + ", tokenLogoUrl=" + this.tokenLogoUrl + ", tokenSymbol=" + this.tokenSymbol + ", turnover=" + this.turnover + ", txHash=" + this.txHash + ", userActionType=" + this.userActionType + ", userActionTypeForDisplay=" + this.userActionTypeForDisplay + ", walletAddress=" + this.walletAddress + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.meme.data.model.PublicBuySignalWsData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PublicBuySignalWsData> serializer() {
            return PublicBuySignalWsData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PublicBuySignalWsData(int i, List list, String str, long j, long j2, long j3, String str2, List list2, String str3, String str4, int i2, String str5, String str6, double d, String str7, int i3, int i4, String str8, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.blockTime = 0L;
        } else {
            this.blockTime = j2;
        }
        this.logIndex = (i & 16) != 0 ? j3 : 0L;
        if ((i & 32) == 0) {
            this.price = "";
        } else {
            this.price = str2;
        }
        this.tagData = (i & 64) == 0 ? yDY.AhwBna() : list2;
        if ((i & 128) == 0) {
            this.tagType = "";
        } else {
            this.tagType = str3;
        }
        if ((i & 256) == 0) {
            this.tokenAddress = "";
        } else {
            this.tokenAddress = str4;
        }
        if ((i & 512) == 0) {
            this.tokenChainId = 0;
        } else {
            this.tokenChainId = i2;
        }
        if ((i & 1024) == 0) {
            this.tokenLogoUrl = "";
        } else {
            this.tokenLogoUrl = str5;
        }
        if ((i & 2048) == 0) {
            this.tokenSymbol = "";
        } else {
            this.tokenSymbol = str6;
        }
        this.turnover = (i & 4096) == 0 ? AudioStats.AUDIO_AMPLITUDE_NONE : d;
        if ((i & 8192) == 0) {
            this.txHash = "";
        } else {
            this.txHash = str7;
        }
        if ((i & 16384) == 0) {
            this.userActionType = 0;
        } else {
            this.userActionType = i3;
        }
        if ((32768 & i) == 0) {
            this.userActionTypeForDisplay = 0;
        } else {
            this.userActionTypeForDisplay = i4;
        }
        if ((i & 65536) == 0) {
            this.walletAddress = "";
        } else {
            this.walletAddress = str8;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(PublicBuySignalWsData publicBuySignalWsData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(publicBuySignalWsData.tagTypeList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], publicBuySignalWsData.tagTypeList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) publicBuySignalWsData.addressAlias, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, publicBuySignalWsData.addressAlias);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || publicBuySignalWsData.blockHeight != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 2, publicBuySignalWsData.blockHeight);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || publicBuySignalWsData.blockTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 3, publicBuySignalWsData.blockTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || publicBuySignalWsData.logIndex != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 4, publicBuySignalWsData.logIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) publicBuySignalWsData.price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, publicBuySignalWsData.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd(publicBuySignalWsData.tagData, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], publicBuySignalWsData.tagData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) publicBuySignalWsData.tagType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, publicBuySignalWsData.tagType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) publicBuySignalWsData.tokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, publicBuySignalWsData.tokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || publicBuySignalWsData.tokenChainId != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 9, publicBuySignalWsData.tokenChainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) publicBuySignalWsData.tokenLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, publicBuySignalWsData.tokenLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) publicBuySignalWsData.tokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, publicBuySignalWsData.tokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || Double.compare(publicBuySignalWsData.turnover, AudioStats.AUDIO_AMPLITUDE_NONE) != 0) {
            compositeEncoder.encodeDoubleElement(serialDescriptor, 12, publicBuySignalWsData.turnover);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) publicBuySignalWsData.txHash, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, publicBuySignalWsData.txHash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || publicBuySignalWsData.userActionType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 14, publicBuySignalWsData.userActionType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || publicBuySignalWsData.userActionTypeForDisplay != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 15, publicBuySignalWsData.userActionTypeForDisplay);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) && Intrinsics.EZpvd((Object) publicBuySignalWsData.walletAddress, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 16, publicBuySignalWsData.walletAddress);
    }

    public PublicBuySignalWsData(@NotNull List<Integer> list, @NotNull String str, long j, long j2, long j3, @NotNull String str2, @NotNull List<CompactTagData> list2, @NotNull String str3, @NotNull String str4, int i, @NotNull String str5, @NotNull String str6, double d, @NotNull String str7, int i2, int i3, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.tagTypeList = list;
        this.addressAlias = str;
        this.blockHeight = j;
        this.blockTime = j2;
        this.logIndex = j3;
        this.price = str2;
        this.tagData = list2;
        this.tagType = str3;
        this.tokenAddress = str4;
        this.tokenChainId = i;
        this.tokenLogoUrl = str5;
        this.tokenSymbol = str6;
        this.turnover = d;
        this.txHash = str7;
        this.userActionType = i2;
        this.userActionTypeForDisplay = i3;
        this.walletAddress = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00c7: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0002: ARITH (r44v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0006: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:12)) : (r23v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000d: ARITH (r44v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0017: ARITH (r44v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r25v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0021: ARITH (r44v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r27v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0029: ARITH (r44v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r29v0 long) : (0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0030: ARITH (r44v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0038: ARITH (r44v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:24)) : (r32v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0043: ARITH (r44v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r44v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0053: ARITH (r44v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r35v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005b: ARITH (r44v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:0x006e: TERNARY null = ((wrap:int:0x0065: ARITH (r44v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:double:?: TERNARY null = ((wrap:int:0x0070: ARITH (r44v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0074: SGET  A[WRAPPED] androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE double) : (r38v0 double))
  (wrap:java.lang.String:0x0082: TERNARY null = ((wrap:int:0x0079: ARITH (r44v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0084: ARITH (r44v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r41v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x008f: ARITH (r44v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r42v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009a: ARITH (r44v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
 A[MD:(java.util.List<java.lang.Integer>, java.lang.String, long, long, long, java.lang.String, java.util.List<com.okinc.business.market.data.model.CompactTagData>, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, double, java.lang.String, int, int, java.lang.String):void (m)] (LINE:10) call: com.okinc.business.market.features.meme.data.model.PublicBuySignalWsData.<init>(java.util.List, java.lang.String, long, long, long, java.lang.String, java.util.List, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, double, java.lang.String, int, int, java.lang.String):void type: THIS */
    public /* synthetic */ PublicBuySignalWsData(List list, String str, long j, long j2, long j3, String str2, List list2, String str3, String str4, int i, String str5, String str6, double d, String str7, int i2, int i3, String str8, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? yDY.AhwBna() : list, (i4 & 2) != 0 ? "" : str, (i4 & 4) != 0 ? 0L : j, (i4 & 8) != 0 ? 0L : j2, (i4 & 16) == 0 ? j3 : 0L, (i4 & 32) != 0 ? "" : str2, (i4 & 64) != 0 ? yDY.AhwBna() : list2, (i4 & 128) != 0 ? "" : str3, (i4 & 256) != 0 ? "" : str4, (i4 & 512) != 0 ? 0 : i, (i4 & 1024) != 0 ? "" : str5, (i4 & 2048) != 0 ? "" : str6, (i4 & 4096) != 0 ? AudioStats.AUDIO_AMPLITUDE_NONE : d, (i4 & 8192) != 0 ? "" : str7, (i4 & 16384) != 0 ? 0 : i2, (i4 & 32768) != 0 ? 0 : i3, (i4 & 65536) != 0 ? "" : str8);
    }

    public final boolean hasValidTagType() {
        return this.tagTypeList.contains(1) || this.tagTypeList.contains(2);
    }

    public final boolean isKOL() {
        return this.tagTypeList.contains(2);
    }

    public final boolean isSmartMoney() {
        return this.tagTypeList.contains(1);
    }
}
