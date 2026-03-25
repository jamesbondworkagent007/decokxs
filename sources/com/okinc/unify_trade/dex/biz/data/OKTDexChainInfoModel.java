package com.okinc.unify_trade.dex.biz.data;

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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class OKTDexChainInfoModel implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final boolean bNBChain;
    private final String chainId;
    private final String chainIndex;
    private final String chainLogoUrl;
    private final String chainName;
    private final String defaultTokenAddress;
    private final String isDefault;
    private final String isSensitive;
    private final String mainCurrencyId;
    private final String mainCurrencyName;
    private final String maxGas;
    private final String mevSupport;
    private final String mevThreshold;
    private final String minValue;
    private final List<String> priorityFee;
    private final List<OKTDexQuoteCoinModel> quoteCoins;
    private final List<String> slippageDynamicRange;
    private final List<String> slippageList;
    private final List<String> slippageRange;
    private final List<String> supportRouteMode;
    private final List<OKTDexQuoteCoinModel> tradeWithCoins;
    private final Boolean waiveGasFee;
    private final String wrapperTokenAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<OKTDexChainInfoModel> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<OKTDexChainInfoModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OKTDexChainInfoModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(OKTDexQuoteCoinModel.CREATOR.createFromParcel(parcel));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(OKTDexQuoteCoinModel.CREATOR.createFromParcel(parcel));
            }
            return new OKTDexChainInfoModel(string, string2, z, string3, string4, string5, string6, string7, string8, arrayList, arrayList2, parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OKTDexChainInfoModel[] newArray(int i) {
            return new OKTDexChainInfoModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<OKTDexQuoteCoinModel> component10() {
        return this.quoteCoins;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<OKTDexQuoteCoinModel> component11() {
        return this.tradeWithCoins;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.minValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component13() {
        return this.slippageList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component14() {
        return this.slippageRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component15() {
        return this.slippageDynamicRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.mevSupport;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component17() {
        return this.supportRouteMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.maxGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component19() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.mevThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.mainCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.mainCurrencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component23() {
        return this.waiveGasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.bNBChain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.isSensitive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.isDefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.defaultTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.wrapperTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKTDexChainInfoModel copy(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull List<OKTDexQuoteCoinModel> list, @NotNull List<OKTDexQuoteCoinModel> list2, @NotNull String str9, @NotNull List<String> list3, @NotNull List<String> list4, @NotNull List<String> list5, @NotNull String str10, @NotNull List<String> list6, @NotNull String str11, @NotNull List<String> list7, @NotNull String str12, @NotNull String str13, @NotNull String str14, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(list6, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(list7, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        return new OKTDexChainInfoModel(str, str2, z, str3, str4, str5, str6, str7, str8, list, list2, str9, list3, list4, list5, str10, list6, str11, list7, str12, str13, str14, bool);
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
        if (!(obj instanceof OKTDexChainInfoModel)) {
            return false;
        }
        OKTDexChainInfoModel oKTDexChainInfoModel = (OKTDexChainInfoModel) obj;
        return Intrinsics.EZpvd((Object) this.chainIndex, (Object) oKTDexChainInfoModel.chainIndex) && Intrinsics.EZpvd((Object) this.chainName, (Object) oKTDexChainInfoModel.chainName) && this.bNBChain == oKTDexChainInfoModel.bNBChain && Intrinsics.EZpvd((Object) this.isSensitive, (Object) oKTDexChainInfoModel.isSensitive) && Intrinsics.EZpvd((Object) this.isDefault, (Object) oKTDexChainInfoModel.isDefault) && Intrinsics.EZpvd((Object) this.defaultTokenAddress, (Object) oKTDexChainInfoModel.defaultTokenAddress) && Intrinsics.EZpvd((Object) this.wrapperTokenAddress, (Object) oKTDexChainInfoModel.wrapperTokenAddress) && Intrinsics.EZpvd((Object) this.chainId, (Object) oKTDexChainInfoModel.chainId) && Intrinsics.EZpvd((Object) this.chainLogoUrl, (Object) oKTDexChainInfoModel.chainLogoUrl) && Intrinsics.EZpvd(this.quoteCoins, oKTDexChainInfoModel.quoteCoins) && Intrinsics.EZpvd(this.tradeWithCoins, oKTDexChainInfoModel.tradeWithCoins) && Intrinsics.EZpvd((Object) this.minValue, (Object) oKTDexChainInfoModel.minValue) && Intrinsics.EZpvd(this.slippageList, oKTDexChainInfoModel.slippageList) && Intrinsics.EZpvd(this.slippageRange, oKTDexChainInfoModel.slippageRange) && Intrinsics.EZpvd(this.slippageDynamicRange, oKTDexChainInfoModel.slippageDynamicRange) && Intrinsics.EZpvd((Object) this.mevSupport, (Object) oKTDexChainInfoModel.mevSupport) && Intrinsics.EZpvd(this.supportRouteMode, oKTDexChainInfoModel.supportRouteMode) && Intrinsics.EZpvd((Object) this.maxGas, (Object) oKTDexChainInfoModel.maxGas) && Intrinsics.EZpvd(this.priorityFee, oKTDexChainInfoModel.priorityFee) && Intrinsics.EZpvd((Object) this.mevThreshold, (Object) oKTDexChainInfoModel.mevThreshold) && Intrinsics.EZpvd((Object) this.mainCurrencyId, (Object) oKTDexChainInfoModel.mainCurrencyId) && Intrinsics.EZpvd((Object) this.mainCurrencyName, (Object) oKTDexChainInfoModel.mainCurrencyName) && Intrinsics.EZpvd(this.waiveGasFee, oKTDexChainInfoModel.waiveGasFee);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getBNBChain() {
        return this.bNBChain;
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
    public final String getMainCurrencyId() {
        return this.mainCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMainCurrencyName() {
        return this.mainCurrencyName;
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
    public final String getMevThreshold() {
        return this.mevThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinValue() {
        return this.minValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getPriorityFee() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<OKTDexQuoteCoinModel> getQuoteCoins() {
        return this.quoteCoins;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getSlippageDynamicRange() {
        return this.slippageDynamicRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getSlippageList() {
        return this.slippageList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getSlippageRange() {
        return this.slippageRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getSupportRouteMode() {
        return this.supportRouteMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<OKTDexQuoteCoinModel> getTradeWithCoins() {
        return this.tradeWithCoins;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getWaiveGasFee() {
        return this.waiveGasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWrapperTokenAddress() {
        return this.wrapperTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.chainIndex.hashCode();
        int iHashCode2 = this.chainName.hashCode();
        int iHashCode3 = Boolean.hashCode(this.bNBChain);
        int iHashCode4 = this.isSensitive.hashCode();
        int iHashCode5 = this.isDefault.hashCode();
        int iHashCode6 = this.defaultTokenAddress.hashCode();
        int iHashCode7 = this.wrapperTokenAddress.hashCode();
        int iHashCode8 = this.chainId.hashCode();
        int iHashCode9 = this.chainLogoUrl.hashCode();
        int iHashCode10 = this.quoteCoins.hashCode();
        int iHashCode11 = this.tradeWithCoins.hashCode();
        int iHashCode12 = this.minValue.hashCode();
        int iHashCode13 = this.slippageList.hashCode();
        int iHashCode14 = this.slippageRange.hashCode();
        int iHashCode15 = this.slippageDynamicRange.hashCode();
        int iHashCode16 = this.mevSupport.hashCode();
        int iHashCode17 = this.supportRouteMode.hashCode();
        int iHashCode18 = this.maxGas.hashCode();
        int iHashCode19 = this.priorityFee.hashCode();
        int iHashCode20 = this.mevThreshold.hashCode();
        int iHashCode21 = this.mainCurrencyId.hashCode();
        int iHashCode22 = this.mainCurrencyName.hashCode();
        Boolean bool = this.waiveGasFee;
        return (((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + (bool == null ? 0 : bool.hashCode());
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
        return "OKTDexChainInfoModel(chainIndex=" + this.chainIndex + ", chainName=" + this.chainName + ", bNBChain=" + this.bNBChain + ", isSensitive=" + this.isSensitive + ", isDefault=" + this.isDefault + ", defaultTokenAddress=" + this.defaultTokenAddress + ", wrapperTokenAddress=" + this.wrapperTokenAddress + ", chainId=" + this.chainId + ", chainLogoUrl=" + this.chainLogoUrl + ", quoteCoins=" + this.quoteCoins + ", tradeWithCoins=" + this.tradeWithCoins + ", minValue=" + this.minValue + ", slippageList=" + this.slippageList + ", slippageRange=" + this.slippageRange + ", slippageDynamicRange=" + this.slippageDynamicRange + ", mevSupport=" + this.mevSupport + ", supportRouteMode=" + this.supportRouteMode + ", maxGas=" + this.maxGas + ", priorityFee=" + this.priorityFee + ", mevThreshold=" + this.mevThreshold + ", mainCurrencyId=" + this.mainCurrencyId + ", mainCurrencyName=" + this.mainCurrencyName + ", waiveGasFee=" + this.waiveGasFee + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14, types: [int] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.chainIndex);
        parcel.writeString(this.chainName);
        parcel.writeInt(this.bNBChain ? 1 : 0);
        parcel.writeString(this.isSensitive);
        parcel.writeString(this.isDefault);
        parcel.writeString(this.defaultTokenAddress);
        parcel.writeString(this.wrapperTokenAddress);
        parcel.writeString(this.chainId);
        parcel.writeString(this.chainLogoUrl);
        List<OKTDexQuoteCoinModel> list = this.quoteCoins;
        parcel.writeInt(list.size());
        Iterator<OKTDexQuoteCoinModel> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        List<OKTDexQuoteCoinModel> list2 = this.tradeWithCoins;
        parcel.writeInt(list2.size());
        Iterator<OKTDexQuoteCoinModel> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.minValue);
        parcel.writeStringList(this.slippageList);
        parcel.writeStringList(this.slippageRange);
        parcel.writeStringList(this.slippageDynamicRange);
        parcel.writeString(this.mevSupport);
        parcel.writeStringList(this.supportRouteMode);
        parcel.writeString(this.maxGas);
        parcel.writeStringList(this.priorityFee);
        parcel.writeString(this.mevThreshold);
        parcel.writeString(this.mainCurrencyId);
        parcel.writeString(this.mainCurrencyName);
        Boolean bool = this.waiveGasFee;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.dex.biz.data.OKTDexChainInfoModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OKTDexChainInfoModel> serializer() {
            return OKTDexChainInfoModel$$serializer.INSTANCE;
        }
    }

    static {
        OKTDexQuoteCoinModel$$serializer oKTDexQuoteCoinModel$$serializer = OKTDexQuoteCoinModel$$serializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, null, null, null, new ArrayListSerializer(oKTDexQuoteCoinModel$$serializer), new ArrayListSerializer(oKTDexQuoteCoinModel$$serializer), null, new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer), null, new ArrayListSerializer(stringSerializer), null, new ArrayListSerializer(stringSerializer), null, null, null, null};
    }

    public /* synthetic */ OKTDexChainInfoModel(int i, String str, String str2, boolean z, String str3, String str4, String str5, String str6, String str7, String str8, List list, List list2, String str9, List list3, List list4, List list5, String str10, List list6, String str11, List list7, String str12, String str13, String str14, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (24 != (i & 24)) {
            PluginExceptionsKt.throwMissingFieldException(i, 24, OKTDexChainInfoModel$$serializer.INSTANCE.getDescriptor());
        }
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
        this.bNBChain = (i & 4) == 0 ? false : z;
        this.isSensitive = str3;
        this.isDefault = str4;
        if ((i & 32) == 0) {
            this.defaultTokenAddress = "";
        } else {
            this.defaultTokenAddress = str5;
        }
        if ((i & 64) == 0) {
            this.wrapperTokenAddress = "";
        } else {
            this.wrapperTokenAddress = str6;
        }
        if ((i & 128) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str7;
        }
        if ((i & 256) == 0) {
            this.chainLogoUrl = "";
        } else {
            this.chainLogoUrl = str8;
        }
        this.quoteCoins = (i & 512) == 0 ? yDY.AhwBna() : list;
        this.tradeWithCoins = (i & 1024) == 0 ? yDY.AhwBna() : list2;
        if ((i & 2048) == 0) {
            this.minValue = "";
        } else {
            this.minValue = str9;
        }
        this.slippageList = (i & 4096) == 0 ? yDY.AhwBna() : list3;
        this.slippageRange = (i & 8192) == 0 ? yDY.AhwBna() : list4;
        this.slippageDynamicRange = (i & 16384) == 0 ? yDY.AhwBna() : list5;
        if ((32768 & i) == 0) {
            this.mevSupport = "";
        } else {
            this.mevSupport = str10;
        }
        this.supportRouteMode = (65536 & i) == 0 ? yDY.AhwBna() : list6;
        if ((131072 & i) == 0) {
            this.maxGas = "";
        } else {
            this.maxGas = str11;
        }
        this.priorityFee = (262144 & i) == 0 ? yDY.AhwBna() : list7;
        if ((524288 & i) == 0) {
            this.mevThreshold = "";
        } else {
            this.mevThreshold = str12;
        }
        if ((1048576 & i) == 0) {
            this.mainCurrencyId = "";
        } else {
            this.mainCurrencyId = str13;
        }
        if ((2097152 & i) == 0) {
            this.mainCurrencyName = "";
        } else {
            this.mainCurrencyName = str14;
        }
        this.waiveGasFee = (i & 4194304) == 0 ? null : bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [8=8] */
    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(OKTDexChainInfoModel oKTDexChainInfoModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) oKTDexChainInfoModel.chainIndex, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, oKTDexChainInfoModel.chainIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) oKTDexChainInfoModel.chainName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, oKTDexChainInfoModel.chainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || oKTDexChainInfoModel.bNBChain) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, oKTDexChainInfoModel.bNBChain);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, oKTDexChainInfoModel.isSensitive);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, oKTDexChainInfoModel.isDefault);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) oKTDexChainInfoModel.defaultTokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, oKTDexChainInfoModel.defaultTokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) oKTDexChainInfoModel.wrapperTokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, oKTDexChainInfoModel.wrapperTokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) oKTDexChainInfoModel.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, oKTDexChainInfoModel.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) oKTDexChainInfoModel.chainLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, oKTDexChainInfoModel.chainLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd(oKTDexChainInfoModel.quoteCoins, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 9, kSerializerArr[9], oKTDexChainInfoModel.quoteCoins);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd(oKTDexChainInfoModel.tradeWithCoins, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], oKTDexChainInfoModel.tradeWithCoins);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) oKTDexChainInfoModel.minValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, oKTDexChainInfoModel.minValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd(oKTDexChainInfoModel.slippageList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 12, kSerializerArr[12], oKTDexChainInfoModel.slippageList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd(oKTDexChainInfoModel.slippageRange, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 13, kSerializerArr[13], oKTDexChainInfoModel.slippageRange);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd(oKTDexChainInfoModel.slippageDynamicRange, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 14, kSerializerArr[14], oKTDexChainInfoModel.slippageDynamicRange);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) oKTDexChainInfoModel.mevSupport, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, oKTDexChainInfoModel.mevSupport);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd(oKTDexChainInfoModel.supportRouteMode, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 16, kSerializerArr[16], oKTDexChainInfoModel.supportRouteMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) oKTDexChainInfoModel.maxGas, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, oKTDexChainInfoModel.maxGas);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd(oKTDexChainInfoModel.priorityFee, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 18, kSerializerArr[18], oKTDexChainInfoModel.priorityFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) oKTDexChainInfoModel.mevThreshold, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, oKTDexChainInfoModel.mevThreshold);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) oKTDexChainInfoModel.mainCurrencyId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, oKTDexChainInfoModel.mainCurrencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) oKTDexChainInfoModel.mainCurrencyName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, oKTDexChainInfoModel.mainCurrencyName);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) && oKTDexChainInfoModel.waiveGasFee == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, BooleanSerializer.INSTANCE, oKTDexChainInfoModel.waiveGasFee);
    }

    public OKTDexChainInfoModel(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull List<OKTDexQuoteCoinModel> list, @NotNull List<OKTDexQuoteCoinModel> list2, @NotNull String str9, @NotNull List<String> list3, @NotNull List<String> list4, @NotNull List<String> list5, @NotNull String str10, @NotNull List<String> list6, @NotNull String str11, @NotNull List<String> list7, @NotNull String str12, @NotNull String str13, @NotNull String str14, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(list6, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(list7, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        this.chainIndex = str;
        this.chainName = str2;
        this.bNBChain = z;
        this.isSensitive = str3;
        this.isDefault = str4;
        this.defaultTokenAddress = str5;
        this.wrapperTokenAddress = str6;
        this.chainId = str7;
        this.chainLogoUrl = str8;
        this.quoteCoins = list;
        this.tradeWithCoins = list2;
        this.minValue = str9;
        this.slippageList = list3;
        this.slippageRange = list4;
        this.slippageDynamicRange = list5;
        this.mevSupport = str10;
        this.supportRouteMode = list6;
        this.maxGas = str11;
        this.priorityFee = list7;
        this.mevThreshold = str12;
        this.mainCurrencyId = str13;
        this.mainCurrencyName = str14;
        this.waiveGasFee = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00e4: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r51v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r51v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0014: ARITH (r51v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r30v0 boolean))
  (r31v0 java.lang.String)
  (r32v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r51v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r51v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r51v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r51v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x003d: ARITH (r51v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0045: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:21)) : (r37v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0049: ARITH (r51v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0051: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:22)) : (r38v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r51v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x005d: ARITH (r51v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0065: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:24)) : (r40v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x006a: ARITH (r51v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0072: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:25)) : (r41v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0077: ARITH (r51v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x007f: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:26)) : (r42v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0087: ARITH (32768 int) & (r51v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0091: ARITH (65536 int) & (r51v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0098: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:28)) : (r44v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009f: ARITH (131072 int) & (r51v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00a9: ARITH (262144 int) & (r51v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00b0: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:30)) : (r46v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b7: ARITH (524288 int) & (r51v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c1: ARITH (1048576 int) & (r51v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00cb: ARITH (2097152 int) & (r51v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x00d5: ARITH (r51v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r50v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.unify_trade.dex.biz.data.OKTDexQuoteCoinModel>, java.util.List<com.okinc.unify_trade.dex.biz.data.OKTDexQuoteCoinModel>, java.lang.String, java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.lang.String, java.util.List<java.lang.String>, java.lang.String, java.util.List<java.lang.String>, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean):void (m)] (LINE:11) call: com.okinc.unify_trade.dex.biz.data.OKTDexChainInfoModel.<init>(java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.lang.String, java.util.List, java.util.List, java.util.List, java.lang.String, java.util.List, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ OKTDexChainInfoModel(String str, String str2, boolean z, String str3, String str4, String str5, String str6, String str7, String str8, List list, List list2, String str9, List list3, List list4, List list5, String str10, List list6, String str11, List list7, String str12, String str13, String str14, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, str3, str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? yDY.AhwBna() : list, (i & 1024) != 0 ? yDY.AhwBna() : list2, (i & 2048) != 0 ? "" : str9, (i & 4096) != 0 ? yDY.AhwBna() : list3, (i & 8192) != 0 ? yDY.AhwBna() : list4, (i & 16384) != 0 ? yDY.AhwBna() : list5, (32768 & i) != 0 ? "" : str10, (65536 & i) != 0 ? yDY.AhwBna() : list6, (131072 & i) != 0 ? "" : str11, (262144 & i) != 0 ? yDY.AhwBna() : list7, (524288 & i) != 0 ? "" : str12, (1048576 & i) != 0 ? "" : str13, (2097152 & i) != 0 ? "" : str14, (i & 4194304) != 0 ? null : bool);
    }
}
