package com.okinc.dexkline.market.data.model.history;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.dexkline.market.data.model.CompactTagData;
import com.okinc.dexkline.market.data.model.CompactTagData$$serializer;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class HistoryChangeData {
    private final String amount;
    private final String baseTokenPrice;
    private final String chainId;
    private final List<HistoryTokenChangeData> changedTokenInfo;
    private final String dexName;
    private final String id;
    private final String isBuy;
    private final List<CompactTagData> newTagList;
    private final String poolLogoUrl;
    private final String price;
    private final String timestamp;
    private final String tokenSymbol;
    private final String txHashUrl;
    private final String userAddress;
    private final String volume;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(HistoryTokenChangeData$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(CompactTagData$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HistoryChangeData() {
        this((String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 32767, (DefaultConstructorMarker) null);
    }

    @SerialName(OtcExtraKeys.AMOUNT)
    public static /* synthetic */ void getAmount$annotations() {
    }

    @SerialName("baseTokenPrice")
    public static /* synthetic */ void getBaseTokenPrice$annotations() {
    }

    @SerialName("chainId")
    public static /* synthetic */ void getChainId$annotations() {
    }

    @SerialName("changedTokenInfo")
    public static /* synthetic */ void getChangedTokenInfo$annotations() {
    }

    @SerialName("dexName")
    public static /* synthetic */ void getDexName$annotations() {
    }

    @SerialName("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @SerialName("t")
    public static /* synthetic */ void getNewTagList$annotations() {
    }

    @SerialName("poolLogoUrl")
    public static /* synthetic */ void getPoolLogoUrl$annotations() {
    }

    @SerialName(FirebaseAnalytics.Param.PRICE)
    public static /* synthetic */ void getPrice$annotations() {
    }

    @SerialName("timestamp")
    public static /* synthetic */ void getTimestamp$annotations() {
    }

    @SerialName("tokenSymbol")
    public static /* synthetic */ void getTokenSymbol$annotations() {
    }

    @SerialName("txHashUrl")
    public static /* synthetic */ void getTxHashUrl$annotations() {
    }

    @SerialName("userAddress")
    public static /* synthetic */ void getUserAddress$annotations() {
    }

    @SerialName("volume")
    public static /* synthetic */ void getVolume$annotations() {
    }

    @SerialName("isBuy")
    public static /* synthetic */ void isBuy$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.isBuy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.volume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.baseTokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CompactTagData> component15() {
        return this.newTagList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HistoryTokenChangeData> component3() {
        return this.changedTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.dexName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.poolLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.txHashUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.userAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HistoryChangeData copy(@NotNull String str, @NotNull String str2, @NotNull List<HistoryTokenChangeData> list, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull List<CompactTagData> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
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
        Intrinsics.checkNotNullParameter(list2, "");
        return new HistoryChangeData(str, str2, list, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HistoryChangeData)) {
            return false;
        }
        HistoryChangeData historyChangeData = (HistoryChangeData) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) historyChangeData.id) && Intrinsics.EZpvd((Object) this.chainId, (Object) historyChangeData.chainId) && Intrinsics.EZpvd(this.changedTokenInfo, historyChangeData.changedTokenInfo) && Intrinsics.EZpvd((Object) this.dexName, (Object) historyChangeData.dexName) && Intrinsics.EZpvd((Object) this.poolLogoUrl, (Object) historyChangeData.poolLogoUrl) && Intrinsics.EZpvd((Object) this.price, (Object) historyChangeData.price) && Intrinsics.EZpvd((Object) this.timestamp, (Object) historyChangeData.timestamp) && Intrinsics.EZpvd((Object) this.txHashUrl, (Object) historyChangeData.txHashUrl) && Intrinsics.EZpvd((Object) this.userAddress, (Object) historyChangeData.userAddress) && Intrinsics.EZpvd((Object) this.isBuy, (Object) historyChangeData.isBuy) && Intrinsics.EZpvd((Object) this.volume, (Object) historyChangeData.volume) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) historyChangeData.tokenSymbol) && Intrinsics.EZpvd((Object) this.amount, (Object) historyChangeData.amount) && Intrinsics.EZpvd((Object) this.baseTokenPrice, (Object) historyChangeData.baseTokenPrice) && Intrinsics.EZpvd(this.newTagList, historyChangeData.newTagList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseTokenPrice() {
        return this.baseTokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HistoryTokenChangeData> getChangedTokenInfo() {
        return this.changedTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDexName() {
        return this.dexName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CompactTagData> getNewTagList() {
        return this.newTagList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPoolLogoUrl() {
        return this.poolLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTimestamp() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxHashUrl() {
        return this.txHashUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserAddress() {
        return this.userAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVolume() {
        return this.volume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((this.id.hashCode() * 31) + this.chainId.hashCode()) * 31) + this.changedTokenInfo.hashCode()) * 31) + this.dexName.hashCode()) * 31) + this.poolLogoUrl.hashCode()) * 31) + this.price.hashCode()) * 31) + this.timestamp.hashCode()) * 31) + this.txHashUrl.hashCode()) * 31) + this.userAddress.hashCode()) * 31) + this.isBuy.hashCode()) * 31) + this.volume.hashCode()) * 31) + this.tokenSymbol.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.baseTokenPrice.hashCode()) * 31) + this.newTagList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isBuy() {
        return this.isBuy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HistoryChangeData(id=" + this.id + ", chainId=" + this.chainId + ", changedTokenInfo=" + this.changedTokenInfo + ", dexName=" + this.dexName + ", poolLogoUrl=" + this.poolLogoUrl + ", price=" + this.price + ", timestamp=" + this.timestamp + ", txHashUrl=" + this.txHashUrl + ", userAddress=" + this.userAddress + ", isBuy=" + this.isBuy + ", volume=" + this.volume + ", tokenSymbol=" + this.tokenSymbol + ", amount=" + this.amount + ", baseTokenPrice=" + this.baseTokenPrice + ", newTagList=" + this.newTagList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dexkline.market.data.model.history.HistoryChangeData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HistoryChangeData> serializer() {
            return HistoryChangeData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HistoryChangeData(int i, String str, String str2, List list, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str2;
        }
        this.changedTokenInfo = (i & 4) == 0 ? yDY.AhwBna() : list;
        if ((i & 8) == 0) {
            this.dexName = "";
        } else {
            this.dexName = str3;
        }
        if ((i & 16) == 0) {
            this.poolLogoUrl = "";
        } else {
            this.poolLogoUrl = str4;
        }
        if ((i & 32) == 0) {
            this.price = "";
        } else {
            this.price = str5;
        }
        if ((i & 64) == 0) {
            this.timestamp = "";
        } else {
            this.timestamp = str6;
        }
        if ((i & 128) == 0) {
            this.txHashUrl = "";
        } else {
            this.txHashUrl = str7;
        }
        if ((i & 256) == 0) {
            this.userAddress = "";
        } else {
            this.userAddress = str8;
        }
        this.isBuy = (i & 512) == 0 ? "0" : str9;
        if ((i & 1024) == 0) {
            this.volume = "";
        } else {
            this.volume = str10;
        }
        if ((i & 2048) == 0) {
            this.tokenSymbol = "";
        } else {
            this.tokenSymbol = str11;
        }
        if ((i & 4096) == 0) {
            this.amount = "";
        } else {
            this.amount = str12;
        }
        if ((i & 8192) == 0) {
            this.baseTokenPrice = "";
        } else {
            this.baseTokenPrice = str13;
        }
        this.newTagList = (i & 16384) == 0 ? yDY.AhwBna() : list2;
    }

    public static final /* synthetic */ void write$Self$OKKLine_kline_impl(HistoryChangeData historyChangeData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) historyChangeData.id, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, historyChangeData.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) historyChangeData.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, historyChangeData.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(historyChangeData.changedTokenInfo, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], historyChangeData.changedTokenInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) historyChangeData.dexName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, historyChangeData.dexName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) historyChangeData.poolLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, historyChangeData.poolLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) historyChangeData.price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, historyChangeData.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) historyChangeData.timestamp, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, historyChangeData.timestamp);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) historyChangeData.txHashUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, historyChangeData.txHashUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) historyChangeData.userAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, historyChangeData.userAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) historyChangeData.isBuy, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, historyChangeData.isBuy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) historyChangeData.volume, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, historyChangeData.volume);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) historyChangeData.tokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, historyChangeData.tokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) historyChangeData.amount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, historyChangeData.amount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) historyChangeData.baseTokenPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, historyChangeData.baseTokenPrice);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) && Intrinsics.EZpvd(historyChangeData.newTagList, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 14, kSerializerArr[14], historyChangeData.newTagList);
    }

    public HistoryChangeData(@NotNull String str, @NotNull String str2, @NotNull List<HistoryTokenChangeData> list, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull List<CompactTagData> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
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
        Intrinsics.checkNotNullParameter(list2, "");
        this.id = str;
        this.chainId = str2;
        this.changedTokenInfo = list;
        this.dexName = str3;
        this.poolLogoUrl = str4;
        this.price = str5;
        this.timestamp = str6;
        this.txHashUrl = str7;
        this.userAddress = str8;
        this.isBuy = str9;
        this.volume = str10;
        this.tokenSymbol = str11;
        this.amount = str12;
        this.baseTokenPrice = str13;
        this.newTagList = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00a2: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r32v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r32v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0014: ARITH (r32v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0018: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:16)) : (r19v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r32v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r32v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r32v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r32v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r32v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0047: ARITH (r32v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004f: ARITH (r32v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("0") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0058: ARITH (r32v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0060: ARITH (r32v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0068: ARITH (r32v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0070: ARITH (r32v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r30v0 java.lang.String) : (""))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0077: ARITH (r32v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x007b: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:40)) : (r31v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.util.List<com.okinc.dexkline.market.data.model.history.HistoryTokenChangeData>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.dexkline.market.data.model.CompactTagData>):void (m)] (LINE:10) call: com.okinc.dexkline.market.data.model.history.HistoryChangeData.<init>(java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ HistoryChangeData(String str, String str2, List list, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? yDY.AhwBna() : list, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "0" : str9, (i & 1024) != 0 ? "" : str10, (i & 2048) != 0 ? "" : str11, (i & 4096) != 0 ? "" : str12, (i & 8192) == 0 ? str13 : "", (i & 16384) != 0 ? yDY.AhwBna() : list2);
    }
}
