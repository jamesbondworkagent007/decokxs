package com.okinc.crcore.shared.net.responsebean;

import com.okinc.crcore.coreapi.net.responsebean.DexChainResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.DexQuoteCoinResponseBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C56403yEb;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class DexChainBean {
    private static final KSerializer<Object>[] $childSerializers;
    private final String chainId;
    private final String chainIndex;
    private final String chainLogoUrl;
    private final String chainName;
    private final String defaultTokenAddress;
    private final String isDefault;
    private final String isSensitive;
    private final String maxGas;
    private final String mevSupport;
    private final String minValue;
    private final List<Integer> priorityFee;
    private final List<DexQuoteCoinBean> quoteCoins;
    private final List<Double> slippageDynamicRange;
    private final List<Double> slippageList;
    private final List<Double> slippageRange;
    private final String wrapperTokenAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DexChainBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (List) null, (List) null, (List) null, (String) null, (String) null, (List) null, 65535, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.minValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Double> component11() {
        return this.slippageList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Double> component12() {
        return this.slippageRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Double> component13() {
        return this.slippageDynamicRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.mevSupport;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.maxGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component16() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.isSensitive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.isDefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.defaultTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.wrapperTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DexQuoteCoinBean> component9() {
        return this.quoteCoins;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexChainBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull List<DexQuoteCoinBean> list, @NotNull String str9, @NotNull List<Double> list2, @NotNull List<Double> list3, @NotNull List<Double> list4, @NotNull String str10, @NotNull String str11, @NotNull List<Integer> list5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(list5, "");
        return new DexChainBean(str, str2, str3, str4, str5, str6, str7, str8, list, str9, list2, list3, list4, str10, str11, list5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DexChainBean)) {
            return false;
        }
        DexChainBean dexChainBean = (DexChainBean) obj;
        return Intrinsics.EZpvd((Object) this.chainIndex, (Object) dexChainBean.chainIndex) && Intrinsics.EZpvd((Object) this.chainName, (Object) dexChainBean.chainName) && Intrinsics.EZpvd((Object) this.isSensitive, (Object) dexChainBean.isSensitive) && Intrinsics.EZpvd((Object) this.isDefault, (Object) dexChainBean.isDefault) && Intrinsics.EZpvd((Object) this.defaultTokenAddress, (Object) dexChainBean.defaultTokenAddress) && Intrinsics.EZpvd((Object) this.wrapperTokenAddress, (Object) dexChainBean.wrapperTokenAddress) && Intrinsics.EZpvd((Object) this.chainId, (Object) dexChainBean.chainId) && Intrinsics.EZpvd((Object) this.chainLogoUrl, (Object) dexChainBean.chainLogoUrl) && Intrinsics.EZpvd(this.quoteCoins, dexChainBean.quoteCoins) && Intrinsics.EZpvd((Object) this.minValue, (Object) dexChainBean.minValue) && Intrinsics.EZpvd(this.slippageList, dexChainBean.slippageList) && Intrinsics.EZpvd(this.slippageRange, dexChainBean.slippageRange) && Intrinsics.EZpvd(this.slippageDynamicRange, dexChainBean.slippageDynamicRange) && Intrinsics.EZpvd((Object) this.mevSupport, (Object) dexChainBean.mevSupport) && Intrinsics.EZpvd((Object) this.maxGas, (Object) dexChainBean.maxGas) && Intrinsics.EZpvd(this.priorityFee, dexChainBean.priorityFee);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainLogoUrl() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainName() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDefaultTokenAddress() {
        return this.defaultTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxGas() {
        return this.maxGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMevSupport() {
        return this.mevSupport;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinValue() {
        return this.minValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getPriorityFee() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DexQuoteCoinBean> getQuoteCoins() {
        return this.quoteCoins;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Double> getSlippageDynamicRange() {
        return this.slippageDynamicRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Double> getSlippageList() {
        return this.slippageList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Double> getSlippageRange() {
        return this.slippageRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWrapperTokenAddress() {
        return this.wrapperTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((this.chainIndex.hashCode() * 31) + this.chainName.hashCode()) * 31) + this.isSensitive.hashCode()) * 31) + this.isDefault.hashCode()) * 31) + this.defaultTokenAddress.hashCode()) * 31) + this.wrapperTokenAddress.hashCode()) * 31) + this.chainId.hashCode()) * 31) + this.chainLogoUrl.hashCode()) * 31) + this.quoteCoins.hashCode()) * 31) + this.minValue.hashCode()) * 31) + this.slippageList.hashCode()) * 31) + this.slippageRange.hashCode()) * 31) + this.slippageDynamicRange.hashCode()) * 31) + this.mevSupport.hashCode()) * 31) + this.maxGas.hashCode()) * 31) + this.priorityFee.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isDefault() {
        return this.isDefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isSensitive() {
        return this.isSensitive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexChainBean(chainIndex=" + this.chainIndex + ", chainName=" + this.chainName + ", isSensitive=" + this.isSensitive + ", isDefault=" + this.isDefault + ", defaultTokenAddress=" + this.defaultTokenAddress + ", wrapperTokenAddress=" + this.wrapperTokenAddress + ", chainId=" + this.chainId + ", chainLogoUrl=" + this.chainLogoUrl + ", quoteCoins=" + this.quoteCoins + ", minValue=" + this.minValue + ", slippageList=" + this.slippageList + ", slippageRange=" + this.slippageRange + ", slippageDynamicRange=" + this.slippageDynamicRange + ", mevSupport=" + this.mevSupport + ", maxGas=" + this.maxGas + ", priorityFee=" + this.priorityFee + ")";
    }

    public /* synthetic */ DexChainBean(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, String str9, List list2, List list3, List list4, String str10, String str11, List list5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chainIndex = "";
        } else {
            this.chainIndex = str;
        }
        if ((i & 2) == 0) {
            this.chainName = "";
        } else {
            this.chainName = str2;
        }
        if ((i & 4) == 0) {
            this.isSensitive = "";
        } else {
            this.isSensitive = str3;
        }
        if ((i & 8) == 0) {
            this.isDefault = "";
        } else {
            this.isDefault = str4;
        }
        if ((i & 16) == 0) {
            this.defaultTokenAddress = "";
        } else {
            this.defaultTokenAddress = str5;
        }
        if ((i & 32) == 0) {
            this.wrapperTokenAddress = "";
        } else {
            this.wrapperTokenAddress = str6;
        }
        if ((i & 64) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str7;
        }
        if ((i & 128) == 0) {
            this.chainLogoUrl = "";
        } else {
            this.chainLogoUrl = str8;
        }
        this.quoteCoins = (i & 256) == 0 ? yDY.AhwBna() : list;
        if ((i & 512) == 0) {
            this.minValue = "";
        } else {
            this.minValue = str9;
        }
        this.slippageList = (i & 1024) == 0 ? yDY.AhwBna() : list2;
        this.slippageRange = (i & 2048) == 0 ? yDY.AhwBna() : list3;
        this.slippageDynamicRange = (i & 4096) == 0 ? yDY.AhwBna() : list4;
        if ((i & 8192) == 0) {
            this.mevSupport = "";
        } else {
            this.mevSupport = str10;
        }
        if ((i & 16384) == 0) {
            this.maxGas = "";
        } else {
            this.maxGas = str11;
        }
        this.priorityFee = (i & 32768) == 0 ? yDY.AhwBna() : list5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [12=6] */
    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(DexChainBean dexChainBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) dexChainBean.chainIndex, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, dexChainBean.chainIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) dexChainBean.chainName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, dexChainBean.chainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) dexChainBean.isSensitive, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, dexChainBean.isSensitive);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) dexChainBean.isDefault, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, dexChainBean.isDefault);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) dexChainBean.defaultTokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, dexChainBean.defaultTokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) dexChainBean.wrapperTokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, dexChainBean.wrapperTokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) dexChainBean.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, dexChainBean.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) dexChainBean.chainLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, dexChainBean.chainLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(dexChainBean.quoteCoins, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 8, kSerializerArr[8], dexChainBean.quoteCoins);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) dexChainBean.minValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, dexChainBean.minValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd(dexChainBean.slippageList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], dexChainBean.slippageList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd(dexChainBean.slippageRange, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 11, kSerializerArr[11], dexChainBean.slippageRange);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd(dexChainBean.slippageDynamicRange, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 12, kSerializerArr[12], dexChainBean.slippageDynamicRange);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) dexChainBean.mevSupport, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, dexChainBean.mevSupport);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) dexChainBean.maxGas, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, dexChainBean.maxGas);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) && Intrinsics.EZpvd(dexChainBean.priorityFee, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 15, kSerializerArr[15], dexChainBean.priorityFee);
    }

    public DexChainBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull List<DexQuoteCoinBean> list, @NotNull String str9, @NotNull List<Double> list2, @NotNull List<Double> list3, @NotNull List<Double> list4, @NotNull String str10, @NotNull String str11, @NotNull List<Integer> list5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(list5, "");
        this.chainIndex = str;
        this.chainName = str2;
        this.isSensitive = str3;
        this.isDefault = str4;
        this.defaultTokenAddress = str5;
        this.wrapperTokenAddress = str6;
        this.chainId = str7;
        this.chainLogoUrl = str8;
        this.quoteCoins = list;
        this.minValue = str9;
        this.slippageList = list2;
        this.slippageRange = list3;
        this.slippageDynamicRange = list4;
        this.mevSupport = str10;
        this.maxGas = str11;
        this.priorityFee = list5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00bb: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r34v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r34v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r34v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r34v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r34v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r34v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r34v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r34v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0044: ARITH (r34v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0048: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:40)) : (r26v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004f: ARITH (r34v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0057: ARITH (r34v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x005b: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:46)) : (r28v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0062: ARITH (r34v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0066: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:49)) : (r29v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x006d: ARITH (r34v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0071: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:52)) : (r30v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0078: ARITH (r34v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r34v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x008e: ARITH (r34v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0092: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:61)) : (r33v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.crcore.shared.net.responsebean.DexQuoteCoinBean>, java.lang.String, java.util.List<java.lang.Double>, java.util.List<java.lang.Double>, java.util.List<java.lang.Double>, java.lang.String, java.lang.String, java.util.List<java.lang.Integer>):void (m)] (LINE:14) call: com.okinc.crcore.shared.net.responsebean.DexChainBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.util.List, java.util.List, java.util.List, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ DexChainBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, String str9, List list2, List list3, List list4, String str10, String str11, List list5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? yDY.AhwBna() : list, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? yDY.AhwBna() : list2, (i & 2048) != 0 ? yDY.AhwBna() : list3, (i & 4096) != 0 ? yDY.AhwBna() : list4, (i & 8192) != 0 ? "" : str10, (i & 16384) != 0 ? "" : str11, (i & 32768) != 0 ? yDY.AhwBna() : list5);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.DexChainBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DexChainBean> serializer() {
            return DexChainBean$$serializer.INSTANCE;
        }

        public final DexChainBean EZpvd(@NotNull DexChainResponseBean dexChainResponseBean) {
            Intrinsics.checkNotNullParameter(dexChainResponseBean, "");
            String chainIndex = dexChainResponseBean.getChainIndex();
            String chainName = dexChainResponseBean.getChainName();
            String strIsSensitive = dexChainResponseBean.isSensitive();
            String strIsDefault = dexChainResponseBean.isDefault();
            String defaultTokenAddress = dexChainResponseBean.getDefaultTokenAddress();
            String wrapperTokenAddress = dexChainResponseBean.getWrapperTokenAddress();
            String chainId = dexChainResponseBean.getChainId();
            String chainLogoUrl = dexChainResponseBean.getChainLogoUrl();
            List<DexQuoteCoinResponseBean> quoteCoins = dexChainResponseBean.getQuoteCoins();
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(quoteCoins, 10));
            Iterator<T> it = quoteCoins.iterator();
            while (it.hasNext()) {
                arrayList.add(DexQuoteCoinBean.Companion.AEQbTJ((DexQuoteCoinResponseBean) it.next()));
            }
            return new DexChainBean(chainIndex, chainName, strIsSensitive, strIsDefault, defaultTokenAddress, wrapperTokenAddress, chainId, chainLogoUrl, arrayList, dexChainResponseBean.getMinValue(), dexChainResponseBean.getSlippageList(), dexChainResponseBean.getSlippageRange(), dexChainResponseBean.getSlippageDynamicRange(), dexChainResponseBean.getMevSupport(), dexChainResponseBean.getMaxGas(), dexChainResponseBean.getPriorityFee());
        }
    }

    static {
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, null, null, new ArrayListSerializer(DexQuoteCoinBean$$serializer.INSTANCE), null, new ArrayListSerializer(doubleSerializer), new ArrayListSerializer(doubleSerializer), new ArrayListSerializer(doubleSerializer), null, null, new ArrayListSerializer(IntSerializer.INSTANCE)};
    }

    public final boolean isDefaultChain() {
        return Intrinsics.EZpvd((Object) this.isDefault, (Object) "1");
    }

    public final boolean isSensitiveChain() {
        return Intrinsics.EZpvd((Object) this.isSensitive, (Object) "1");
    }

    public final boolean isMevSupported() {
        return Intrinsics.EZpvd((Object) this.mevSupport, (Object) "1");
    }

    public final Double getMinSlippage() {
        return CollectionsKt___CollectionsKt.dvKsVJ(this.slippageRange);
    }

    public final Double getMaxSlippage() {
        return CollectionsKt___CollectionsKt.finit(this.slippageRange);
    }
}
