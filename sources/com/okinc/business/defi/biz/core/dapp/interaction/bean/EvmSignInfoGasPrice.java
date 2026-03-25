package com.okinc.business.defi.biz.core.dapp.interaction.bean;

import com.okinc.business.defi.biz.core.tx.transaction.EstimateTime;
import com.okinc.business.defi.biz.core.tx.transaction.EstimateTime$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class EvmSignInfoGasPrice {
    private String baseFee;
    private List<EstimateTime> estimateTimeList;
    private String fastPriorityFee;
    private String max;
    private String maxCost;
    private String min;
    private String minCost;
    private String minGasPrice;
    private String normal;
    private String normalCost;
    private String oriMax;
    private String oriMin;
    private String oriNormal;
    private String proposePriorityFee;
    private String safePriorityFee;
    private String suggestBaseFee;
    private Boolean supportEip1559;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(EstimateTime$$serializer.INSTANCE), null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EvmSignInfoGasPrice() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, 131071, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.min;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component10() {
        return this.supportEip1559;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.suggestBaseFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.baseFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.minGasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EstimateTime> component14() {
        return this.estimateTimeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.oriMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.oriNormal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.oriMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.normal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.max;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.minCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.normalCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.maxCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.safePriorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.proposePriorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.fastPriorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EvmSignInfoGasPrice copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, String str10, String str11, String str12, List<EstimateTime> list, String str13, String str14, String str15) {
        return new EvmSignInfoGasPrice(str, str2, str3, str4, str5, str6, str7, str8, str9, bool, str10, str11, str12, list, str13, str14, str15);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EvmSignInfoGasPrice)) {
            return false;
        }
        EvmSignInfoGasPrice evmSignInfoGasPrice = (EvmSignInfoGasPrice) obj;
        return Intrinsics.EZpvd((Object) this.min, (Object) evmSignInfoGasPrice.min) && Intrinsics.EZpvd((Object) this.normal, (Object) evmSignInfoGasPrice.normal) && Intrinsics.EZpvd((Object) this.max, (Object) evmSignInfoGasPrice.max) && Intrinsics.EZpvd((Object) this.minCost, (Object) evmSignInfoGasPrice.minCost) && Intrinsics.EZpvd((Object) this.normalCost, (Object) evmSignInfoGasPrice.normalCost) && Intrinsics.EZpvd((Object) this.maxCost, (Object) evmSignInfoGasPrice.maxCost) && Intrinsics.EZpvd((Object) this.safePriorityFee, (Object) evmSignInfoGasPrice.safePriorityFee) && Intrinsics.EZpvd((Object) this.proposePriorityFee, (Object) evmSignInfoGasPrice.proposePriorityFee) && Intrinsics.EZpvd((Object) this.fastPriorityFee, (Object) evmSignInfoGasPrice.fastPriorityFee) && Intrinsics.EZpvd(this.supportEip1559, evmSignInfoGasPrice.supportEip1559) && Intrinsics.EZpvd((Object) this.suggestBaseFee, (Object) evmSignInfoGasPrice.suggestBaseFee) && Intrinsics.EZpvd((Object) this.baseFee, (Object) evmSignInfoGasPrice.baseFee) && Intrinsics.EZpvd((Object) this.minGasPrice, (Object) evmSignInfoGasPrice.minGasPrice) && Intrinsics.EZpvd(this.estimateTimeList, evmSignInfoGasPrice.estimateTimeList) && Intrinsics.EZpvd((Object) this.oriMin, (Object) evmSignInfoGasPrice.oriMin) && Intrinsics.EZpvd((Object) this.oriNormal, (Object) evmSignInfoGasPrice.oriNormal) && Intrinsics.EZpvd((Object) this.oriMax, (Object) evmSignInfoGasPrice.oriMax);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseFee() {
        return this.baseFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EstimateTime> getEstimateTimeList() {
        return this.estimateTimeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFastPriorityFee() {
        return this.fastPriorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMax() {
        return this.max;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxCost() {
        return this.maxCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMin() {
        return this.min;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinCost() {
        return this.minCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinGasPrice() {
        return this.minGasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNormal() {
        return this.normal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNormalCost() {
        return this.normalCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOriMax() {
        return this.oriMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOriMin() {
        return this.oriMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOriNormal() {
        return this.oriNormal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProposePriorityFee() {
        return this.proposePriorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSafePriorityFee() {
        return this.safePriorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSuggestBaseFee() {
        return this.suggestBaseFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getSupportEip1559() {
        return this.supportEip1559;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.min;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.normal;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.max;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.minCost;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.normalCost;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.maxCost;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.safePriorityFee;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.proposePriorityFee;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.fastPriorityFee;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        Boolean bool = this.supportEip1559;
        int iHashCode10 = bool == null ? 0 : bool.hashCode();
        String str10 = this.suggestBaseFee;
        int iHashCode11 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.baseFee;
        int iHashCode12 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.minGasPrice;
        int iHashCode13 = str12 == null ? 0 : str12.hashCode();
        List<EstimateTime> list = this.estimateTimeList;
        int iHashCode14 = list == null ? 0 : list.hashCode();
        String str13 = this.oriMin;
        int iHashCode15 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.oriNormal;
        int iHashCode16 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.oriMax;
        return (((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + (str15 == null ? 0 : str15.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseFee(String str) {
        this.baseFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstimateTimeList(List<EstimateTime> list) {
        this.estimateTimeList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFastPriorityFee(String str) {
        this.fastPriorityFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMax(String str) {
        this.max = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxCost(String str) {
        this.maxCost = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMin(String str) {
        this.min = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinCost(String str) {
        this.minCost = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinGasPrice(String str) {
        this.minGasPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNormal(String str) {
        this.normal = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNormalCost(String str) {
        this.normalCost = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOriMax(String str) {
        this.oriMax = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOriMin(String str) {
        this.oriMin = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOriNormal(String str) {
        this.oriNormal = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProposePriorityFee(String str) {
        this.proposePriorityFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSafePriorityFee(String str) {
        this.safePriorityFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSuggestBaseFee(String str) {
        this.suggestBaseFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSupportEip1559(Boolean bool) {
        this.supportEip1559 = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EvmSignInfoGasPrice(min=" + this.min + ", normal=" + this.normal + ", max=" + this.max + ", minCost=" + this.minCost + ", normalCost=" + this.normalCost + ", maxCost=" + this.maxCost + ", safePriorityFee=" + this.safePriorityFee + ", proposePriorityFee=" + this.proposePriorityFee + ", fastPriorityFee=" + this.fastPriorityFee + ", supportEip1559=" + this.supportEip1559 + ", suggestBaseFee=" + this.suggestBaseFee + ", baseFee=" + this.baseFee + ", minGasPrice=" + this.minGasPrice + ", estimateTimeList=" + this.estimateTimeList + ", oriMin=" + this.oriMin + ", oriNormal=" + this.oriNormal + ", oriMax=" + this.oriMax + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.dapp.interaction.bean.EvmSignInfoGasPrice.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EvmSignInfoGasPrice> serializer() {
            return EvmSignInfoGasPrice$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EvmSignInfoGasPrice(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, String str10, String str11, String str12, List list, String str13, String str14, String str15, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.min = null;
        } else {
            this.min = str;
        }
        if ((i & 2) == 0) {
            this.normal = null;
        } else {
            this.normal = str2;
        }
        if ((i & 4) == 0) {
            this.max = null;
        } else {
            this.max = str3;
        }
        if ((i & 8) == 0) {
            this.minCost = null;
        } else {
            this.minCost = str4;
        }
        if ((i & 16) == 0) {
            this.normalCost = null;
        } else {
            this.normalCost = str5;
        }
        if ((i & 32) == 0) {
            this.maxCost = null;
        } else {
            this.maxCost = str6;
        }
        if ((i & 64) == 0) {
            this.safePriorityFee = null;
        } else {
            this.safePriorityFee = str7;
        }
        if ((i & 128) == 0) {
            this.proposePriorityFee = null;
        } else {
            this.proposePriorityFee = str8;
        }
        if ((i & 256) == 0) {
            this.fastPriorityFee = null;
        } else {
            this.fastPriorityFee = str9;
        }
        this.supportEip1559 = (i & 512) == 0 ? Boolean.FALSE : bool;
        if ((i & 1024) == 0) {
            this.suggestBaseFee = null;
        } else {
            this.suggestBaseFee = str10;
        }
        if ((i & 2048) == 0) {
            this.baseFee = null;
        } else {
            this.baseFee = str11;
        }
        if ((i & 4096) == 0) {
            this.minGasPrice = null;
        } else {
            this.minGasPrice = str12;
        }
        if ((i & 8192) == 0) {
            this.estimateTimeList = null;
        } else {
            this.estimateTimeList = list;
        }
        if ((i & 16384) == 0) {
            this.oriMin = null;
        } else {
            this.oriMin = str13;
        }
        if ((32768 & i) == 0) {
            this.oriNormal = null;
        } else {
            this.oriNormal = str14;
        }
        if ((i & 65536) == 0) {
            this.oriMax = null;
        } else {
            this.oriMax = str15;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(EvmSignInfoGasPrice evmSignInfoGasPrice, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || evmSignInfoGasPrice.min != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, evmSignInfoGasPrice.min);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || evmSignInfoGasPrice.normal != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, evmSignInfoGasPrice.normal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || evmSignInfoGasPrice.max != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, evmSignInfoGasPrice.max);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || evmSignInfoGasPrice.minCost != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, evmSignInfoGasPrice.minCost);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || evmSignInfoGasPrice.normalCost != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, evmSignInfoGasPrice.normalCost);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || evmSignInfoGasPrice.maxCost != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, evmSignInfoGasPrice.maxCost);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || evmSignInfoGasPrice.safePriorityFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, evmSignInfoGasPrice.safePriorityFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || evmSignInfoGasPrice.proposePriorityFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, evmSignInfoGasPrice.proposePriorityFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || evmSignInfoGasPrice.fastPriorityFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, evmSignInfoGasPrice.fastPriorityFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd(evmSignInfoGasPrice.supportEip1559, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, BooleanSerializer.INSTANCE, evmSignInfoGasPrice.supportEip1559);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || evmSignInfoGasPrice.suggestBaseFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, evmSignInfoGasPrice.suggestBaseFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || evmSignInfoGasPrice.baseFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, evmSignInfoGasPrice.baseFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || evmSignInfoGasPrice.minGasPrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, evmSignInfoGasPrice.minGasPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || evmSignInfoGasPrice.estimateTimeList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, kSerializerArr[13], evmSignInfoGasPrice.estimateTimeList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || evmSignInfoGasPrice.oriMin != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, evmSignInfoGasPrice.oriMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || evmSignInfoGasPrice.oriNormal != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, evmSignInfoGasPrice.oriNormal);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) && evmSignInfoGasPrice.oriMax == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, evmSignInfoGasPrice.oriMax);
    }

    public EvmSignInfoGasPrice(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, String str10, String str11, String str12, List<EstimateTime> list, String str13, String str14, String str15) {
        this.min = str;
        this.normal = str2;
        this.max = str3;
        this.minCost = str4;
        this.normalCost = str5;
        this.maxCost = str6;
        this.safePriorityFee = str7;
        this.proposePriorityFee = str8;
        this.fastPriorityFee = str9;
        this.supportEip1559 = bool;
        this.suggestBaseFee = str10;
        this.baseFee = str11;
        this.minGasPrice = str12;
        this.estimateTimeList = list;
        this.oriMin = str13;
        this.oriNormal = str14;
        this.oriMax = str15;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00b5: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r36v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r36v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r36v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r36v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r36v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r36v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r36v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r36v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r36v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x004a: ARITH (r36v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004e: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r28v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (r36v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005b: ARITH (r36v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0063: ARITH (r36v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x006b: ARITH (r36v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r32v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0073: ARITH (r36v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007e: ARITH (r36v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0089: ARITH (r36v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.defi.biz.core.tx.transaction.EstimateTime>, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:26) call: com.okinc.business.defi.biz.core.dapp.interaction.bean.EvmSignInfoGasPrice.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ EvmSignInfoGasPrice(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, String str10, String str11, String str12, List list, String str13, String str14, String str15, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? Boolean.FALSE : bool, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : str12, (i & 8192) != 0 ? null : list, (i & 16384) != 0 ? null : str13, (i & 32768) != 0 ? null : str14, (i & 65536) != 0 ? null : str15);
    }
}
