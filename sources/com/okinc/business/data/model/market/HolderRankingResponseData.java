package com.okinc.business.data.model.market;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.market.data.model.CompactTagData;
import com.okinc.business.market.data.model.CompactTagData$$serializer;
import java.util.ArrayList;
import java.util.Iterator;
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

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class HolderRankingResponseData implements Parcelable {
    private final String chainId;
    private final String explorerUrl;
    private final String extraOne;
    private final String fundingSourceAddress;
    private final String fundingSourceAddressShowName;
    private final String fundingSourceTime;
    private final String holdAmount;
    private final String holdAmount24HChange;
    private final String holdAmountPercentage;
    private final String holdCreateTime;
    private final String holdVolume;
    private final HolderTagResponseData holderTagVO;
    private final String holderWalletAddress;
    private final String holdingTime;
    private final String inFlowAmount;
    private final String inFlowValue;
    private final String lastTradeTime;
    private final String nativeTokenBalance;
    private final String nativeTokenPrice;
    private final List<CompactTagData> newTagList;
    private final String tokenContractAddress;
    private final String totalProfit;
    private final String totalProfitPercentage;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<HolderRankingResponseData> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(CompactTagData$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<HolderRankingResponseData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HolderRankingResponseData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            HolderTagResponseData holderTagResponseDataCreateFromParcel = parcel.readInt() == 0 ? null : HolderTagResponseData.CREATOR.createFromParcel(parcel);
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            String string19 = parcel.readString();
            String string20 = parcel.readString();
            String string21 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            while (i2 != i) {
                arrayList.add(CompactTagData.CREATOR.createFromParcel(parcel));
                i2++;
                i = i;
            }
            return new HolderRankingResponseData(string, string2, string3, string4, string5, string6, holderTagResponseDataCreateFromParcel, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18, string19, string20, string21, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HolderRankingResponseData[] newArray(int i) {
            return new HolderRankingResponseData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HolderRankingResponseData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (HolderTagResponseData) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 8388607, (DefaultConstructorMarker) null);
    }

    @SerialName("chainId")
    public static /* synthetic */ void getChainId$annotations() {
    }

    @SerialName("explorerUrl")
    public static /* synthetic */ void getExplorerUrl$annotations() {
    }

    @SerialName("extraOne")
    public static /* synthetic */ void getExtraOne$annotations() {
    }

    @SerialName("fundingSourceAddress")
    public static /* synthetic */ void getFundingSourceAddress$annotations() {
    }

    @SerialName("fundingSourceAddressShowName")
    public static /* synthetic */ void getFundingSourceAddressShowName$annotations() {
    }

    @SerialName("fundingSourceTime")
    public static /* synthetic */ void getFundingSourceTime$annotations() {
    }

    @SerialName("holdAmount")
    public static /* synthetic */ void getHoldAmount$annotations() {
    }

    @SerialName("holdAmount24HChange")
    public static /* synthetic */ void getHoldAmount24HChange$annotations() {
    }

    @SerialName("holdAmountPercentage")
    public static /* synthetic */ void getHoldAmountPercentage$annotations() {
    }

    @SerialName("holdCreateTime")
    public static /* synthetic */ void getHoldCreateTime$annotations() {
    }

    @SerialName("holdVolume")
    public static /* synthetic */ void getHoldVolume$annotations() {
    }

    @SerialName("holderTagVO")
    public static /* synthetic */ void getHolderTagVO$annotations() {
    }

    @SerialName("holderWalletAddress")
    public static /* synthetic */ void getHolderWalletAddress$annotations() {
    }

    @SerialName("holdingTime")
    public static /* synthetic */ void getHoldingTime$annotations() {
    }

    @SerialName("inFlowAmount")
    public static /* synthetic */ void getInFlowAmount$annotations() {
    }

    @SerialName("inFlowValue")
    public static /* synthetic */ void getInFlowValue$annotations() {
    }

    @SerialName("lastTradeTime")
    public static /* synthetic */ void getLastTradeTime$annotations() {
    }

    @SerialName("nativeTokenBalance")
    public static /* synthetic */ void getNativeTokenBalance$annotations() {
    }

    @SerialName("nativeTokenPrice")
    public static /* synthetic */ void getNativeTokenPrice$annotations() {
    }

    @SerialName("t")
    public static /* synthetic */ void getNewTagList$annotations() {
    }

    @SerialName("tokenContractAddress")
    public static /* synthetic */ void getTokenContractAddress$annotations() {
    }

    @SerialName("totalProfit")
    public static /* synthetic */ void getTotalProfit$annotations() {
    }

    @SerialName("totalProfitPercentage")
    public static /* synthetic */ void getTotalProfitPercentage$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.fundingSourceTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.lastTradeTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.explorerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.extraOne;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.fundingSourceAddressShowName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.nativeTokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.nativeTokenBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.totalProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.totalProfitPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.inFlowAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.inFlowValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.holdCreateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.holdingTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CompactTagData> component23() {
        return this.newTagList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.holdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.holdAmountPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.holderWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.holdVolume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HolderTagResponseData component7() {
        return this.holderTagVO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.holdAmount24HChange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.fundingSourceAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HolderRankingResponseData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, HolderTagResponseData holderTagResponseData, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull List<CompactTagData> list) {
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
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new HolderRankingResponseData(str, str2, str3, str4, str5, str6, holderTagResponseData, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, list);
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
        if (!(obj instanceof HolderRankingResponseData)) {
            return false;
        }
        HolderRankingResponseData holderRankingResponseData = (HolderRankingResponseData) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) holderRankingResponseData.chainId) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) holderRankingResponseData.tokenContractAddress) && Intrinsics.EZpvd((Object) this.holdAmount, (Object) holderRankingResponseData.holdAmount) && Intrinsics.EZpvd((Object) this.holdAmountPercentage, (Object) holderRankingResponseData.holdAmountPercentage) && Intrinsics.EZpvd((Object) this.holderWalletAddress, (Object) holderRankingResponseData.holderWalletAddress) && Intrinsics.EZpvd((Object) this.holdVolume, (Object) holderRankingResponseData.holdVolume) && Intrinsics.EZpvd(this.holderTagVO, holderRankingResponseData.holderTagVO) && Intrinsics.EZpvd((Object) this.holdAmount24HChange, (Object) holderRankingResponseData.holdAmount24HChange) && Intrinsics.EZpvd((Object) this.fundingSourceAddress, (Object) holderRankingResponseData.fundingSourceAddress) && Intrinsics.EZpvd((Object) this.fundingSourceTime, (Object) holderRankingResponseData.fundingSourceTime) && Intrinsics.EZpvd((Object) this.lastTradeTime, (Object) holderRankingResponseData.lastTradeTime) && Intrinsics.EZpvd((Object) this.explorerUrl, (Object) holderRankingResponseData.explorerUrl) && Intrinsics.EZpvd((Object) this.extraOne, (Object) holderRankingResponseData.extraOne) && Intrinsics.EZpvd((Object) this.fundingSourceAddressShowName, (Object) holderRankingResponseData.fundingSourceAddressShowName) && Intrinsics.EZpvd((Object) this.nativeTokenPrice, (Object) holderRankingResponseData.nativeTokenPrice) && Intrinsics.EZpvd((Object) this.nativeTokenBalance, (Object) holderRankingResponseData.nativeTokenBalance) && Intrinsics.EZpvd((Object) this.totalProfit, (Object) holderRankingResponseData.totalProfit) && Intrinsics.EZpvd((Object) this.totalProfitPercentage, (Object) holderRankingResponseData.totalProfitPercentage) && Intrinsics.EZpvd((Object) this.inFlowAmount, (Object) holderRankingResponseData.inFlowAmount) && Intrinsics.EZpvd((Object) this.inFlowValue, (Object) holderRankingResponseData.inFlowValue) && Intrinsics.EZpvd((Object) this.holdCreateTime, (Object) holderRankingResponseData.holdCreateTime) && Intrinsics.EZpvd((Object) this.holdingTime, (Object) holderRankingResponseData.holdingTime) && Intrinsics.EZpvd(this.newTagList, holderRankingResponseData.newTagList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExplorerUrl() {
        return this.explorerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExtraOne() {
        return this.extraOne;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFundingSourceAddress() {
        return this.fundingSourceAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFundingSourceAddressShowName() {
        return this.fundingSourceAddressShowName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFundingSourceTime() {
        return this.fundingSourceTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHoldAmount() {
        return this.holdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHoldAmount24HChange() {
        return this.holdAmount24HChange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHoldAmountPercentage() {
        return this.holdAmountPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHoldCreateTime() {
        return this.holdCreateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHoldVolume() {
        return this.holdVolume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HolderTagResponseData getHolderTagVO() {
        return this.holderTagVO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHolderWalletAddress() {
        return this.holderWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHoldingTime() {
        return this.holdingTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInFlowAmount() {
        return this.inFlowAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInFlowValue() {
        return this.inFlowValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLastTradeTime() {
        return this.lastTradeTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNativeTokenBalance() {
        return this.nativeTokenBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNativeTokenPrice() {
        return this.nativeTokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CompactTagData> getNewTagList() {
        return this.newTagList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenContractAddress() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalProfit() {
        return this.totalProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalProfitPercentage() {
        return this.totalProfitPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.chainId.hashCode();
        int iHashCode2 = this.tokenContractAddress.hashCode();
        int iHashCode3 = this.holdAmount.hashCode();
        int iHashCode4 = this.holdAmountPercentage.hashCode();
        int iHashCode5 = this.holderWalletAddress.hashCode();
        int iHashCode6 = this.holdVolume.hashCode();
        HolderTagResponseData holderTagResponseData = this.holderTagVO;
        return (((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (holderTagResponseData == null ? 0 : holderTagResponseData.hashCode())) * 31) + this.holdAmount24HChange.hashCode()) * 31) + this.fundingSourceAddress.hashCode()) * 31) + this.fundingSourceTime.hashCode()) * 31) + this.lastTradeTime.hashCode()) * 31) + this.explorerUrl.hashCode()) * 31) + this.extraOne.hashCode()) * 31) + this.fundingSourceAddressShowName.hashCode()) * 31) + this.nativeTokenPrice.hashCode()) * 31) + this.nativeTokenBalance.hashCode()) * 31) + this.totalProfit.hashCode()) * 31) + this.totalProfitPercentage.hashCode()) * 31) + this.inFlowAmount.hashCode()) * 31) + this.inFlowValue.hashCode()) * 31) + this.holdCreateTime.hashCode()) * 31) + this.holdingTime.hashCode()) * 31) + this.newTagList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HolderRankingResponseData(chainId=" + this.chainId + ", tokenContractAddress=" + this.tokenContractAddress + ", holdAmount=" + this.holdAmount + ", holdAmountPercentage=" + this.holdAmountPercentage + ", holderWalletAddress=" + this.holderWalletAddress + ", holdVolume=" + this.holdVolume + ", holderTagVO=" + this.holderTagVO + ", holdAmount24HChange=" + this.holdAmount24HChange + ", fundingSourceAddress=" + this.fundingSourceAddress + ", fundingSourceTime=" + this.fundingSourceTime + ", lastTradeTime=" + this.lastTradeTime + ", explorerUrl=" + this.explorerUrl + ", extraOne=" + this.extraOne + ", fundingSourceAddressShowName=" + this.fundingSourceAddressShowName + ", nativeTokenPrice=" + this.nativeTokenPrice + ", nativeTokenBalance=" + this.nativeTokenBalance + ", totalProfit=" + this.totalProfit + ", totalProfitPercentage=" + this.totalProfitPercentage + ", inFlowAmount=" + this.inFlowAmount + ", inFlowValue=" + this.inFlowValue + ", holdCreateTime=" + this.holdCreateTime + ", holdingTime=" + this.holdingTime + ", newTagList=" + this.newTagList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.chainId);
        parcel.writeString(this.tokenContractAddress);
        parcel.writeString(this.holdAmount);
        parcel.writeString(this.holdAmountPercentage);
        parcel.writeString(this.holderWalletAddress);
        parcel.writeString(this.holdVolume);
        HolderTagResponseData holderTagResponseData = this.holderTagVO;
        if (holderTagResponseData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            holderTagResponseData.writeToParcel(parcel, i);
        }
        parcel.writeString(this.holdAmount24HChange);
        parcel.writeString(this.fundingSourceAddress);
        parcel.writeString(this.fundingSourceTime);
        parcel.writeString(this.lastTradeTime);
        parcel.writeString(this.explorerUrl);
        parcel.writeString(this.extraOne);
        parcel.writeString(this.fundingSourceAddressShowName);
        parcel.writeString(this.nativeTokenPrice);
        parcel.writeString(this.nativeTokenBalance);
        parcel.writeString(this.totalProfit);
        parcel.writeString(this.totalProfitPercentage);
        parcel.writeString(this.inFlowAmount);
        parcel.writeString(this.inFlowValue);
        parcel.writeString(this.holdCreateTime);
        parcel.writeString(this.holdingTime);
        List<CompactTagData> list = this.newTagList;
        parcel.writeInt(list.size());
        Iterator<CompactTagData> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.data.model.market.HolderRankingResponseData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HolderRankingResponseData> serializer() {
            return HolderRankingResponseData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HolderRankingResponseData(int i, String str, String str2, String str3, String str4, String str5, String str6, HolderTagResponseData holderTagResponseData, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str;
        }
        if ((i & 2) == 0) {
            this.tokenContractAddress = "";
        } else {
            this.tokenContractAddress = str2;
        }
        if ((i & 4) == 0) {
            this.holdAmount = "";
        } else {
            this.holdAmount = str3;
        }
        if ((i & 8) == 0) {
            this.holdAmountPercentage = "";
        } else {
            this.holdAmountPercentage = str4;
        }
        if ((i & 16) == 0) {
            this.holderWalletAddress = "";
        } else {
            this.holderWalletAddress = str5;
        }
        if ((i & 32) == 0) {
            this.holdVolume = "";
        } else {
            this.holdVolume = str6;
        }
        this.holderTagVO = (i & 64) == 0 ? null : holderTagResponseData;
        if ((i & 128) == 0) {
            this.holdAmount24HChange = "";
        } else {
            this.holdAmount24HChange = str7;
        }
        if ((i & 256) == 0) {
            this.fundingSourceAddress = "";
        } else {
            this.fundingSourceAddress = str8;
        }
        if ((i & 512) == 0) {
            this.fundingSourceTime = "";
        } else {
            this.fundingSourceTime = str9;
        }
        if ((i & 1024) == 0) {
            this.lastTradeTime = "";
        } else {
            this.lastTradeTime = str10;
        }
        if ((i & 2048) == 0) {
            this.explorerUrl = "";
        } else {
            this.explorerUrl = str11;
        }
        this.extraOne = (i & 4096) == 0 ? "0" : str12;
        if ((i & 8192) == 0) {
            this.fundingSourceAddressShowName = "";
        } else {
            this.fundingSourceAddressShowName = str13;
        }
        if ((i & 16384) == 0) {
            this.nativeTokenPrice = "";
        } else {
            this.nativeTokenPrice = str14;
        }
        if ((32768 & i) == 0) {
            this.nativeTokenBalance = "";
        } else {
            this.nativeTokenBalance = str15;
        }
        if ((65536 & i) == 0) {
            this.totalProfit = "";
        } else {
            this.totalProfit = str16;
        }
        if ((131072 & i) == 0) {
            this.totalProfitPercentage = "";
        } else {
            this.totalProfitPercentage = str17;
        }
        if ((262144 & i) == 0) {
            this.inFlowAmount = "";
        } else {
            this.inFlowAmount = str18;
        }
        if ((524288 & i) == 0) {
            this.inFlowValue = "";
        } else {
            this.inFlowValue = str19;
        }
        if ((1048576 & i) == 0) {
            this.holdCreateTime = "";
        } else {
            this.holdCreateTime = str20;
        }
        if ((2097152 & i) == 0) {
            this.holdingTime = "";
        } else {
            this.holdingTime = str21;
        }
        this.newTagList = (i & 4194304) == 0 ? yDY.AhwBna() : list;
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(HolderRankingResponseData holderRankingResponseData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) holderRankingResponseData.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, holderRankingResponseData.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) holderRankingResponseData.tokenContractAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, holderRankingResponseData.tokenContractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) holderRankingResponseData.holdAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, holderRankingResponseData.holdAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) holderRankingResponseData.holdAmountPercentage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, holderRankingResponseData.holdAmountPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) holderRankingResponseData.holderWalletAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, holderRankingResponseData.holderWalletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) holderRankingResponseData.holdVolume, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, holderRankingResponseData.holdVolume);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || holderRankingResponseData.holderTagVO != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, HolderTagResponseData$$serializer.INSTANCE, holderRankingResponseData.holderTagVO);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) holderRankingResponseData.holdAmount24HChange, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, holderRankingResponseData.holdAmount24HChange);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) holderRankingResponseData.fundingSourceAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, holderRankingResponseData.fundingSourceAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) holderRankingResponseData.fundingSourceTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, holderRankingResponseData.fundingSourceTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) holderRankingResponseData.lastTradeTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, holderRankingResponseData.lastTradeTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) holderRankingResponseData.explorerUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, holderRankingResponseData.explorerUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) holderRankingResponseData.extraOne, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, holderRankingResponseData.extraOne);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) holderRankingResponseData.fundingSourceAddressShowName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, holderRankingResponseData.fundingSourceAddressShowName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) holderRankingResponseData.nativeTokenPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, holderRankingResponseData.nativeTokenPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) holderRankingResponseData.nativeTokenBalance, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, holderRankingResponseData.nativeTokenBalance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) holderRankingResponseData.totalProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, holderRankingResponseData.totalProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) holderRankingResponseData.totalProfitPercentage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, holderRankingResponseData.totalProfitPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) holderRankingResponseData.inFlowAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, holderRankingResponseData.inFlowAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) holderRankingResponseData.inFlowValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, holderRankingResponseData.inFlowValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) holderRankingResponseData.holdCreateTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, holderRankingResponseData.holdCreateTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) holderRankingResponseData.holdingTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, holderRankingResponseData.holdingTime);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) && Intrinsics.EZpvd(holderRankingResponseData.newTagList, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 22, kSerializerArr[22], holderRankingResponseData.newTagList);
    }

    public HolderRankingResponseData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, HolderTagResponseData holderTagResponseData, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull List<CompactTagData> list) {
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
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.chainId = str;
        this.tokenContractAddress = str2;
        this.holdAmount = str3;
        this.holdAmountPercentage = str4;
        this.holderWalletAddress = str5;
        this.holdVolume = str6;
        this.holderTagVO = holderTagResponseData;
        this.holdAmount24HChange = str7;
        this.fundingSourceAddress = str8;
        this.fundingSourceTime = str9;
        this.lastTradeTime = str10;
        this.explorerUrl = str11;
        this.extraOne = str12;
        this.fundingSourceAddressShowName = str13;
        this.nativeTokenPrice = str14;
        this.nativeTokenBalance = str15;
        this.totalProfit = str16;
        this.totalProfitPercentage = str17;
        this.inFlowAmount = str18;
        this.inFlowValue = str19;
        this.holdCreateTime = str20;
        this.holdingTime = str21;
        this.newTagList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x010b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r48v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r48v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r48v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r48v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r48v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r48v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:com.okinc.business.data.model.market.HolderTagResponseData:?: TERNARY null = ((wrap:int:0x0034: ARITH (r48v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.data.model.market.HolderTagResponseData) : (r31v0 com.okinc.business.data.model.market.HolderTagResponseData))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r48v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r48v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r48v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r48v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r48v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r48v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("0") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006d: ARITH (r48v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0077: ARITH (r48v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0083: ARITH (r48v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008e: ARITH (r48v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0099: ARITH (r48v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a4: ARITH (r48v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00af: ARITH (r48v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ba: ARITH (r48v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c5: ARITH (r48v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00d0: ARITH (r48v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00d4: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:154)) : (r47v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.data.model.market.HolderTagResponseData, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.market.data.model.CompactTagData>):void (m)] (LINE:108) call: com.okinc.business.data.model.market.HolderRankingResponseData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.data.model.market.HolderTagResponseData, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ HolderRankingResponseData(String str, String str2, String str3, String str4, String str5, String str6, HolderTagResponseData holderTagResponseData, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? null : holderTagResponseData, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? "" : str10, (i & 2048) != 0 ? "" : str11, (i & 4096) != 0 ? "0" : str12, (i & 8192) != 0 ? "" : str13, (i & 16384) != 0 ? "" : str14, (i & 32768) != 0 ? "" : str15, (i & 65536) != 0 ? "" : str16, (i & 131072) != 0 ? "" : str17, (i & 262144) != 0 ? "" : str18, (i & 524288) != 0 ? "" : str19, (i & 1048576) != 0 ? "" : str20, (i & 2097152) != 0 ? "" : str21, (i & 4194304) != 0 ? yDY.AhwBna() : list);
    }
}
