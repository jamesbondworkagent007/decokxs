package com.okinc.crcore.coreapi.net.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class DexChainResponseBean implements Parcelable {
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
    private final List<DexQuoteCoinResponseBean> quoteCoins;
    private final List<Double> slippageDynamicRange;
    private final List<Double> slippageList;
    private final List<Double> slippageRange;
    private final String wrapperTokenAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DexChainResponseBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<DexChainResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexChainResponseBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(DexQuoteCoinResponseBean.CREATOR.createFromParcel(parcel));
            }
            String string9 = parcel.readString();
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(Double.valueOf(parcel.readDouble()));
            }
            int i5 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                arrayList3.add(Double.valueOf(parcel.readDouble()));
            }
            int i7 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i7);
            for (int i8 = 0; i8 != i7; i8++) {
                arrayList4.add(Double.valueOf(parcel.readDouble()));
            }
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            int i9 = parcel.readInt();
            ArrayList arrayList5 = new ArrayList(i9);
            int i10 = 0;
            while (i10 != i9) {
                arrayList5.add(Integer.valueOf(parcel.readInt()));
                i10++;
                i9 = i9;
            }
            return new DexChainResponseBean(string, string2, string3, string4, string5, string6, string7, string8, arrayList, string9, arrayList2, arrayList3, arrayList4, string10, string11, arrayList5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexChainResponseBean[] newArray(int i) {
            return new DexChainResponseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DexChainResponseBean() {
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
    public final List<DexQuoteCoinResponseBean> component9() {
        return this.quoteCoins;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexChainResponseBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull List<DexQuoteCoinResponseBean> list, @NotNull String str9, @NotNull List<Double> list2, @NotNull List<Double> list3, @NotNull List<Double> list4, @NotNull String str10, @NotNull String str11, @NotNull List<Integer> list5) {
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
        return new DexChainResponseBean(str, str2, str3, str4, str5, str6, str7, str8, list, str9, list2, list3, list4, str10, str11, list5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DexChainResponseBean)) {
            return false;
        }
        DexChainResponseBean dexChainResponseBean = (DexChainResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.chainIndex, (Object) dexChainResponseBean.chainIndex) && Intrinsics.EZpvd((Object) this.chainName, (Object) dexChainResponseBean.chainName) && Intrinsics.EZpvd((Object) this.isSensitive, (Object) dexChainResponseBean.isSensitive) && Intrinsics.EZpvd((Object) this.isDefault, (Object) dexChainResponseBean.isDefault) && Intrinsics.EZpvd((Object) this.defaultTokenAddress, (Object) dexChainResponseBean.defaultTokenAddress) && Intrinsics.EZpvd((Object) this.wrapperTokenAddress, (Object) dexChainResponseBean.wrapperTokenAddress) && Intrinsics.EZpvd((Object) this.chainId, (Object) dexChainResponseBean.chainId) && Intrinsics.EZpvd((Object) this.chainLogoUrl, (Object) dexChainResponseBean.chainLogoUrl) && Intrinsics.EZpvd(this.quoteCoins, dexChainResponseBean.quoteCoins) && Intrinsics.EZpvd((Object) this.minValue, (Object) dexChainResponseBean.minValue) && Intrinsics.EZpvd(this.slippageList, dexChainResponseBean.slippageList) && Intrinsics.EZpvd(this.slippageRange, dexChainResponseBean.slippageRange) && Intrinsics.EZpvd(this.slippageDynamicRange, dexChainResponseBean.slippageDynamicRange) && Intrinsics.EZpvd((Object) this.mevSupport, (Object) dexChainResponseBean.mevSupport) && Intrinsics.EZpvd((Object) this.maxGas, (Object) dexChainResponseBean.maxGas) && Intrinsics.EZpvd(this.priorityFee, dexChainResponseBean.priorityFee);
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
    public final List<DexQuoteCoinResponseBean> getQuoteCoins() {
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
        return "DexChainResponseBean(chainIndex=" + this.chainIndex + ", chainName=" + this.chainName + ", isSensitive=" + this.isSensitive + ", isDefault=" + this.isDefault + ", defaultTokenAddress=" + this.defaultTokenAddress + ", wrapperTokenAddress=" + this.wrapperTokenAddress + ", chainId=" + this.chainId + ", chainLogoUrl=" + this.chainLogoUrl + ", quoteCoins=" + this.quoteCoins + ", minValue=" + this.minValue + ", slippageList=" + this.slippageList + ", slippageRange=" + this.slippageRange + ", slippageDynamicRange=" + this.slippageDynamicRange + ", mevSupport=" + this.mevSupport + ", maxGas=" + this.maxGas + ", priorityFee=" + this.priorityFee + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.chainIndex);
        parcel.writeString(this.chainName);
        parcel.writeString(this.isSensitive);
        parcel.writeString(this.isDefault);
        parcel.writeString(this.defaultTokenAddress);
        parcel.writeString(this.wrapperTokenAddress);
        parcel.writeString(this.chainId);
        parcel.writeString(this.chainLogoUrl);
        List<DexQuoteCoinResponseBean> list = this.quoteCoins;
        parcel.writeInt(list.size());
        Iterator<DexQuoteCoinResponseBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.minValue);
        List<Double> list2 = this.slippageList;
        parcel.writeInt(list2.size());
        Iterator<Double> it2 = list2.iterator();
        while (it2.hasNext()) {
            parcel.writeDouble(it2.next().doubleValue());
        }
        List<Double> list3 = this.slippageRange;
        parcel.writeInt(list3.size());
        Iterator<Double> it3 = list3.iterator();
        while (it3.hasNext()) {
            parcel.writeDouble(it3.next().doubleValue());
        }
        List<Double> list4 = this.slippageDynamicRange;
        parcel.writeInt(list4.size());
        Iterator<Double> it4 = list4.iterator();
        while (it4.hasNext()) {
            parcel.writeDouble(it4.next().doubleValue());
        }
        parcel.writeString(this.mevSupport);
        parcel.writeString(this.maxGas);
        List<Integer> list5 = this.priorityFee;
        parcel.writeInt(list5.size());
        Iterator<Integer> it5 = list5.iterator();
        while (it5.hasNext()) {
            parcel.writeInt(it5.next().intValue());
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.DexChainResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DexChainResponseBean> serializer() {
            return DexChainResponseBean$$serializer.INSTANCE;
        }
    }

    static {
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, null, null, new ArrayListSerializer(DexQuoteCoinResponseBean$$serializer.INSTANCE), null, new ArrayListSerializer(doubleSerializer), new ArrayListSerializer(doubleSerializer), new ArrayListSerializer(doubleSerializer), null, null, new ArrayListSerializer(IntSerializer.INSTANCE)};
    }

    public /* synthetic */ DexChainResponseBean(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, String str9, List list2, List list3, List list4, String str10, String str11, List list5, SerializationConstructorMarker serializationConstructorMarker) {
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
    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(DexChainResponseBean dexChainResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) dexChainResponseBean.chainIndex, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, dexChainResponseBean.chainIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) dexChainResponseBean.chainName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, dexChainResponseBean.chainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) dexChainResponseBean.isSensitive, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, dexChainResponseBean.isSensitive);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) dexChainResponseBean.isDefault, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, dexChainResponseBean.isDefault);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) dexChainResponseBean.defaultTokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, dexChainResponseBean.defaultTokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) dexChainResponseBean.wrapperTokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, dexChainResponseBean.wrapperTokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) dexChainResponseBean.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, dexChainResponseBean.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) dexChainResponseBean.chainLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, dexChainResponseBean.chainLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(dexChainResponseBean.quoteCoins, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 8, kSerializerArr[8], dexChainResponseBean.quoteCoins);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) dexChainResponseBean.minValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, dexChainResponseBean.minValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd(dexChainResponseBean.slippageList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], dexChainResponseBean.slippageList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd(dexChainResponseBean.slippageRange, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 11, kSerializerArr[11], dexChainResponseBean.slippageRange);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd(dexChainResponseBean.slippageDynamicRange, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 12, kSerializerArr[12], dexChainResponseBean.slippageDynamicRange);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) dexChainResponseBean.mevSupport, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, dexChainResponseBean.mevSupport);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) dexChainResponseBean.maxGas, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, dexChainResponseBean.maxGas);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) && Intrinsics.EZpvd(dexChainResponseBean.priorityFee, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 15, kSerializerArr[15], dexChainResponseBean.priorityFee);
    }

    public DexChainResponseBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull List<DexQuoteCoinResponseBean> list, @NotNull String str9, @NotNull List<Double> list2, @NotNull List<Double> list3, @NotNull List<Double> list4, @NotNull String str10, @NotNull String str11, @NotNull List<Integer> list5) {
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
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0044: ARITH (r34v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0048: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:41)) : (r26v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004f: ARITH (r34v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0057: ARITH (r34v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x005b: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:47)) : (r28v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0062: ARITH (r34v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0066: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:50)) : (r29v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x006d: ARITH (r34v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0071: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:53)) : (r30v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0078: ARITH (r34v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r34v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x008e: ARITH (r34v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0092: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:62)) : (r33v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.crcore.coreapi.net.responsebean.DexQuoteCoinResponseBean>, java.lang.String, java.util.List<java.lang.Double>, java.util.List<java.lang.Double>, java.util.List<java.lang.Double>, java.lang.String, java.lang.String, java.util.List<java.lang.Integer>):void (m)] (LINE:15) call: com.okinc.crcore.coreapi.net.responsebean.DexChainResponseBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.util.List, java.util.List, java.util.List, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ DexChainResponseBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, String str9, List list2, List list3, List list4, String str10, String str11, List list5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? yDY.AhwBna() : list, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? yDY.AhwBna() : list2, (i & 2048) != 0 ? yDY.AhwBna() : list3, (i & 4096) != 0 ? yDY.AhwBna() : list4, (i & 8192) != 0 ? "" : str10, (i & 16384) != 0 ? "" : str11, (i & 32768) != 0 ? yDY.AhwBna() : list5);
    }
}
