package com.okinc.business.defi.wallet.mine.search.data.model;

import com.google.gson.annotations.SerializedName;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class SearchTokenModel {
    private final Long chainId;
    private final String chainLogoUrl;
    private final String change24H;
    private final String holderCount;
    private final String liquidity;
    private final String marketCap;

    @SerializedName("t")
    private final List<CompactTagData> newTagList;
    private final String price;
    private final Integer riskLevel;
    private final Boolean supportQuickTrade;
    private final String tokenContractAddress;
    private final String tokenLogoUrl;
    private final String tokenName;
    private final String tokenSymbol;
    private final String turnOver24H;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(CompactTagData$$serializer.INSTANCE), null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SearchTokenModel() {
        this((Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (Boolean) null, (String) null, (Integer) null, 32767, (DefaultConstructorMarker) null);
    }

    @SerialName("t")
    public static /* synthetic */ void getNewTagList$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.turnOver24H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CompactTagData> component12() {
        return this.newTagList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component13() {
        return this.supportQuickTrade;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.holderCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component15() {
        return this.riskLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tokenLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.change24H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.liquidity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchTokenModel copy(Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, @NotNull List<CompactTagData> list, Boolean bool, String str11, Integer num) {
        Intrinsics.checkNotNullParameter(list, "");
        return new SearchTokenModel(l, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, list, bool, str11, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchTokenModel)) {
            return false;
        }
        SearchTokenModel searchTokenModel = (SearchTokenModel) obj;
        return Intrinsics.EZpvd(this.chainId, searchTokenModel.chainId) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) searchTokenModel.tokenContractAddress) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) searchTokenModel.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenLogoUrl, (Object) searchTokenModel.tokenLogoUrl) && Intrinsics.EZpvd((Object) this.tokenName, (Object) searchTokenModel.tokenName) && Intrinsics.EZpvd((Object) this.change24H, (Object) searchTokenModel.change24H) && Intrinsics.EZpvd((Object) this.price, (Object) searchTokenModel.price) && Intrinsics.EZpvd((Object) this.liquidity, (Object) searchTokenModel.liquidity) && Intrinsics.EZpvd((Object) this.chainLogoUrl, (Object) searchTokenModel.chainLogoUrl) && Intrinsics.EZpvd((Object) this.turnOver24H, (Object) searchTokenModel.turnOver24H) && Intrinsics.EZpvd((Object) this.marketCap, (Object) searchTokenModel.marketCap) && Intrinsics.EZpvd(this.newTagList, searchTokenModel.newTagList) && Intrinsics.EZpvd(this.supportQuickTrade, searchTokenModel.supportQuickTrade) && Intrinsics.EZpvd((Object) this.holderCount, (Object) searchTokenModel.holderCount) && Intrinsics.EZpvd(this.riskLevel, searchTokenModel.riskLevel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainLogoUrl() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChange24H() {
        return this.change24H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHolderCount() {
        return this.holderCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLiquidity() {
        return this.liquidity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketCap() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CompactTagData> getNewTagList() {
        return this.newTagList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getRiskLevel() {
        return this.riskLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getSupportQuickTrade() {
        return this.supportQuickTrade;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenContractAddress() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenLogoUrl() {
        return this.tokenLogoUrl;
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
    public final String getTurnOver24H() {
        return this.turnOver24H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.chainId;
        int iHashCode = l == null ? 0 : l.hashCode();
        String str = this.tokenContractAddress;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.tokenSymbol;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.tokenLogoUrl;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.tokenName;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.change24H;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.price;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.liquidity;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.chainLogoUrl;
        int iHashCode9 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.turnOver24H;
        int iHashCode10 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.marketCap;
        int iHashCode11 = str10 == null ? 0 : str10.hashCode();
        int iHashCode12 = this.newTagList.hashCode();
        Boolean bool = this.supportQuickTrade;
        int iHashCode13 = bool == null ? 0 : bool.hashCode();
        String str11 = this.holderCount;
        int iHashCode14 = str11 == null ? 0 : str11.hashCode();
        Integer num = this.riskLevel;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (num == null ? 0 : num.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SearchTokenModel(chainId=" + this.chainId + ", tokenContractAddress=" + this.tokenContractAddress + ", tokenSymbol=" + this.tokenSymbol + ", tokenLogoUrl=" + this.tokenLogoUrl + ", tokenName=" + this.tokenName + ", change24H=" + this.change24H + ", price=" + this.price + ", liquidity=" + this.liquidity + ", chainLogoUrl=" + this.chainLogoUrl + ", turnOver24H=" + this.turnOver24H + ", marketCap=" + this.marketCap + ", newTagList=" + this.newTagList + ", supportQuickTrade=" + this.supportQuickTrade + ", holderCount=" + this.holderCount + ", riskLevel=" + this.riskLevel + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.mine.search.data.model.SearchTokenModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SearchTokenModel> serializer() {
            return SearchTokenModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SearchTokenModel(int i, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list, Boolean bool, String str11, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chainId = null;
        } else {
            this.chainId = l;
        }
        if ((i & 2) == 0) {
            this.tokenContractAddress = "";
        } else {
            this.tokenContractAddress = str;
        }
        if ((i & 4) == 0) {
            this.tokenSymbol = "";
        } else {
            this.tokenSymbol = str2;
        }
        if ((i & 8) == 0) {
            this.tokenLogoUrl = "";
        } else {
            this.tokenLogoUrl = str3;
        }
        if ((i & 16) == 0) {
            this.tokenName = "";
        } else {
            this.tokenName = str4;
        }
        if ((i & 32) == 0) {
            this.change24H = "";
        } else {
            this.change24H = str5;
        }
        if ((i & 64) == 0) {
            this.price = "";
        } else {
            this.price = str6;
        }
        if ((i & 128) == 0) {
            this.liquidity = "";
        } else {
            this.liquidity = str7;
        }
        if ((i & 256) == 0) {
            this.chainLogoUrl = "";
        } else {
            this.chainLogoUrl = str8;
        }
        if ((i & 512) == 0) {
            this.turnOver24H = "";
        } else {
            this.turnOver24H = str9;
        }
        if ((i & 1024) == 0) {
            this.marketCap = "";
        } else {
            this.marketCap = str10;
        }
        this.newTagList = (i & 2048) == 0 ? yDY.AhwBna() : list;
        this.supportQuickTrade = (i & 4096) == 0 ? Boolean.FALSE : bool;
        if ((i & 8192) == 0) {
            this.holderCount = "";
        } else {
            this.holderCount = str11;
        }
        if ((i & 16384) == 0) {
            this.riskLevel = null;
        } else {
            this.riskLevel = num;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(SearchTokenModel searchTokenModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || searchTokenModel.chainId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, searchTokenModel.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) searchTokenModel.tokenContractAddress, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, searchTokenModel.tokenContractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) searchTokenModel.tokenSymbol, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, searchTokenModel.tokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) searchTokenModel.tokenLogoUrl, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, searchTokenModel.tokenLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) searchTokenModel.tokenName, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, searchTokenModel.tokenName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) searchTokenModel.change24H, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, searchTokenModel.change24H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) searchTokenModel.price, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, searchTokenModel.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) searchTokenModel.liquidity, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, searchTokenModel.liquidity);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) searchTokenModel.chainLogoUrl, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, searchTokenModel.chainLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) searchTokenModel.turnOver24H, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, searchTokenModel.turnOver24H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) searchTokenModel.marketCap, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, searchTokenModel.marketCap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd(searchTokenModel.newTagList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 11, kSerializerArr[11], searchTokenModel.newTagList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd(searchTokenModel.supportQuickTrade, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, BooleanSerializer.INSTANCE, searchTokenModel.supportQuickTrade);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) searchTokenModel.holderCount, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, searchTokenModel.holderCount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) && searchTokenModel.riskLevel == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, IntSerializer.INSTANCE, searchTokenModel.riskLevel);
    }

    public SearchTokenModel(Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, @NotNull List<CompactTagData> list, Boolean bool, String str11, Integer num) {
        Intrinsics.checkNotNullParameter(list, "");
        this.chainId = l;
        this.tokenContractAddress = str;
        this.tokenSymbol = str2;
        this.tokenLogoUrl = str3;
        this.tokenName = str4;
        this.change24H = str5;
        this.price = str6;
        this.liquidity = str7;
        this.chainLogoUrl = str8;
        this.turnOver24H = str9;
        this.marketCap = str10;
        this.newTagList = list;
        this.supportQuickTrade = bool;
        this.holderCount = str11;
        this.riskLevel = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x009f: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r32v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r17v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r32v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r32v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r32v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r32v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r32v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r32v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r32v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r32v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r32v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r32v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x005c: ARITH (r32v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0060: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:78)) : (r28v0 java.util.List))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0067: ARITH (r32v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x006b: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r29v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0070: ARITH (r32v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r30v0 java.lang.String) : (""))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0077: ARITH (r32v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r31v0 java.lang.Integer))
 A[MD:(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.defi.wallet.mine.search.data.model.CompactTagData>, java.lang.Boolean, java.lang.String, java.lang.Integer):void (m)] (LINE:64) call: com.okinc.business.defi.wallet.mine.search.data.model.SearchTokenModel.<init>(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.Boolean, java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ SearchTokenModel(Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list, Boolean bool, String str11, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? "" : str10, (i & 2048) != 0 ? yDY.AhwBna() : list, (i & 4096) != 0 ? Boolean.FALSE : bool, (i & 8192) == 0 ? str11 : "", (i & 16384) != 0 ? null : num);
    }
}
