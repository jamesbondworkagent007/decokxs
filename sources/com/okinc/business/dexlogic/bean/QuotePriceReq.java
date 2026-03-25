package com.okinc.business.dexlogic.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dex.trade.core.domain.model.common.AccountInfo;
import com.okinc.business.dex.trade.core.domain.model.common.AccountInfo$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class QuotePriceReq implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    public static final String QUOTE_BIZ_TYPE_AA = "3";
    private final AccountInfo accountInfo;
    private final String amount;
    private final String chainId;
    private final List<String> defiPlatformIds;
    private List<String> dexIds;
    private List<String> forbiddenBridgeTypes;
    private final String fromTokenAddress;
    private final String fromTokenDecimal;
    private final String gasLevel;
    private final String maxSlippage;
    private final String pmm;
    private String quoteBizType;
    private final String receiveWalletAddress;
    private String refCode;
    private final String referralCommissionJsVersion;
    private String slippage;
    private String slippageType;
    private final String toChainId;
    private final String toTokenAddress;
    private final String toTokenDecimal;
    private final String userWalletAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<QuotePriceReq> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<QuotePriceReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuotePriceReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new QuotePriceReq(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : AccountInfo.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuotePriceReq[] newArray(int i) {
            return new QuotePriceReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.pmm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.slippageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.maxSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.quoteBizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component14() {
        return this.dexIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component15() {
        return this.forbiddenBridgeTypes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.receiveWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component18() {
        return this.defiPlatformIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.refCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.referralCommissionJsVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountInfo component21() {
        return this.accountInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.fromTokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.toTokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.gasLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.toChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuotePriceReq copy(String str, @NotNull String str2, String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, String str9, @NotNull String str10, @NotNull String str11, String str12, String str13, List<String> list, List<String> list2, String str14, String str15, List<String> list3, String str16, String str17, AccountInfo accountInfo) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        return new QuotePriceReq(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, list, list2, str14, str15, list3, str16, str17, accountInfo);
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
        if (!(obj instanceof QuotePriceReq)) {
            return false;
        }
        QuotePriceReq quotePriceReq = (QuotePriceReq) obj;
        return Intrinsics.EZpvd((Object) this.fromTokenAddress, (Object) quotePriceReq.fromTokenAddress) && Intrinsics.EZpvd((Object) this.amount, (Object) quotePriceReq.amount) && Intrinsics.EZpvd((Object) this.toTokenAddress, (Object) quotePriceReq.toTokenAddress) && Intrinsics.EZpvd((Object) this.fromTokenDecimal, (Object) quotePriceReq.fromTokenDecimal) && Intrinsics.EZpvd((Object) this.toTokenDecimal, (Object) quotePriceReq.toTokenDecimal) && Intrinsics.EZpvd((Object) this.chainId, (Object) quotePriceReq.chainId) && Intrinsics.EZpvd((Object) this.gasLevel, (Object) quotePriceReq.gasLevel) && Intrinsics.EZpvd((Object) this.toChainId, (Object) quotePriceReq.toChainId) && Intrinsics.EZpvd((Object) this.slippage, (Object) quotePriceReq.slippage) && Intrinsics.EZpvd((Object) this.pmm, (Object) quotePriceReq.pmm) && Intrinsics.EZpvd((Object) this.slippageType, (Object) quotePriceReq.slippageType) && Intrinsics.EZpvd((Object) this.maxSlippage, (Object) quotePriceReq.maxSlippage) && Intrinsics.EZpvd((Object) this.quoteBizType, (Object) quotePriceReq.quoteBizType) && Intrinsics.EZpvd(this.dexIds, quotePriceReq.dexIds) && Intrinsics.EZpvd(this.forbiddenBridgeTypes, quotePriceReq.forbiddenBridgeTypes) && Intrinsics.EZpvd((Object) this.userWalletAddress, (Object) quotePriceReq.userWalletAddress) && Intrinsics.EZpvd((Object) this.receiveWalletAddress, (Object) quotePriceReq.receiveWalletAddress) && Intrinsics.EZpvd(this.defiPlatformIds, quotePriceReq.defiPlatformIds) && Intrinsics.EZpvd((Object) this.refCode, (Object) quotePriceReq.refCode) && Intrinsics.EZpvd((Object) this.referralCommissionJsVersion, (Object) quotePriceReq.referralCommissionJsVersion) && Intrinsics.EZpvd(this.accountInfo, quotePriceReq.accountInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountInfo getAccountInfo() {
        return this.accountInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getDefiPlatformIds() {
        return this.defiPlatformIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getDexIds() {
        return this.dexIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getForbiddenBridgeTypes() {
        return this.forbiddenBridgeTypes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenAddress() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenDecimal() {
        return this.fromTokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasLevel() {
        return this.gasLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxSlippage() {
        return this.maxSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPmm() {
        return this.pmm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteBizType() {
        return this.quoteBizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReceiveWalletAddress() {
        return this.receiveWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRefCode() {
        return this.refCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReferralCommissionJsVersion() {
        return this.referralCommissionJsVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlippage() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlippageType() {
        return this.slippageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToChainId() {
        return this.toChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenAddress() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenDecimal() {
        return this.toTokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserWalletAddress() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.fromTokenAddress;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = this.amount.hashCode();
        String str2 = this.toTokenAddress;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        int iHashCode4 = this.fromTokenDecimal.hashCode();
        int iHashCode5 = this.toTokenDecimal.hashCode();
        int iHashCode6 = this.chainId.hashCode();
        int iHashCode7 = this.gasLevel.hashCode();
        int iHashCode8 = this.toChainId.hashCode();
        String str3 = this.slippage;
        int iHashCode9 = str3 == null ? 0 : str3.hashCode();
        int iHashCode10 = this.pmm.hashCode();
        int iHashCode11 = this.slippageType.hashCode();
        String str4 = this.maxSlippage;
        int iHashCode12 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.quoteBizType;
        int iHashCode13 = str5 == null ? 0 : str5.hashCode();
        List<String> list = this.dexIds;
        int iHashCode14 = list == null ? 0 : list.hashCode();
        List<String> list2 = this.forbiddenBridgeTypes;
        int iHashCode15 = list2 == null ? 0 : list2.hashCode();
        String str6 = this.userWalletAddress;
        int iHashCode16 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.receiveWalletAddress;
        int iHashCode17 = str7 == null ? 0 : str7.hashCode();
        List<String> list3 = this.defiPlatformIds;
        int iHashCode18 = list3 == null ? 0 : list3.hashCode();
        String str8 = this.refCode;
        int iHashCode19 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.referralCommissionJsVersion;
        int iHashCode20 = str9 == null ? 0 : str9.hashCode();
        AccountInfo accountInfo = this.accountInfo;
        return (((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + (accountInfo == null ? 0 : accountInfo.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDexIds(List<String> list) {
        this.dexIds = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setForbiddenBridgeTypes(List<String> list) {
        this.forbiddenBridgeTypes = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteBizType(String str) {
        this.quoteBizType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRefCode(String str) {
        this.refCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlippage(String str) {
        this.slippage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlippageType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.slippageType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "QuotePriceReq(fromTokenAddress=" + this.fromTokenAddress + ", amount=" + this.amount + ", toTokenAddress=" + this.toTokenAddress + ", fromTokenDecimal=" + this.fromTokenDecimal + ", toTokenDecimal=" + this.toTokenDecimal + ", chainId=" + this.chainId + ", gasLevel=" + this.gasLevel + ", toChainId=" + this.toChainId + ", slippage=" + this.slippage + ", pmm=" + this.pmm + ", slippageType=" + this.slippageType + ", maxSlippage=" + this.maxSlippage + ", quoteBizType=" + this.quoteBizType + ", dexIds=" + this.dexIds + ", forbiddenBridgeTypes=" + this.forbiddenBridgeTypes + ", userWalletAddress=" + this.userWalletAddress + ", receiveWalletAddress=" + this.receiveWalletAddress + ", defiPlatformIds=" + this.defiPlatformIds + ", refCode=" + this.refCode + ", referralCommissionJsVersion=" + this.referralCommissionJsVersion + ", accountInfo=" + this.accountInfo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.fromTokenAddress);
        parcel.writeString(this.amount);
        parcel.writeString(this.toTokenAddress);
        parcel.writeString(this.fromTokenDecimal);
        parcel.writeString(this.toTokenDecimal);
        parcel.writeString(this.chainId);
        parcel.writeString(this.gasLevel);
        parcel.writeString(this.toChainId);
        parcel.writeString(this.slippage);
        parcel.writeString(this.pmm);
        parcel.writeString(this.slippageType);
        parcel.writeString(this.maxSlippage);
        parcel.writeString(this.quoteBizType);
        parcel.writeStringList(this.dexIds);
        parcel.writeStringList(this.forbiddenBridgeTypes);
        parcel.writeString(this.userWalletAddress);
        parcel.writeString(this.receiveWalletAddress);
        parcel.writeStringList(this.defiPlatformIds);
        parcel.writeString(this.refCode);
        parcel.writeString(this.referralCommissionJsVersion);
        AccountInfo accountInfo = this.accountInfo;
        if (accountInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountInfo.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ QuotePriceReq(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List list, List list2, String str14, String str15, List list3, String str16, String str17, AccountInfo accountInfo, SerializationConstructorMarker serializationConstructorMarker) {
        if (3328 != (i & 3328)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3328, QuotePriceReq$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.fromTokenAddress = null;
        } else {
            this.fromTokenAddress = str;
        }
        if ((i & 2) == 0) {
            this.amount = "";
        } else {
            this.amount = str2;
        }
        if ((i & 4) == 0) {
            this.toTokenAddress = null;
        } else {
            this.toTokenAddress = str3;
        }
        if ((i & 8) == 0) {
            this.fromTokenDecimal = "";
        } else {
            this.fromTokenDecimal = str4;
        }
        if ((i & 16) == 0) {
            this.toTokenDecimal = "";
        } else {
            this.toTokenDecimal = str5;
        }
        if ((i & 32) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str6;
        }
        if ((i & 64) == 0) {
            this.gasLevel = "";
        } else {
            this.gasLevel = str7;
        }
        if ((i & 128) == 0) {
            this.toChainId = "";
        } else {
            this.toChainId = str8;
        }
        this.slippage = str9;
        if ((i & 512) == 0) {
            this.pmm = "";
        } else {
            this.pmm = str10;
        }
        this.slippageType = str11;
        this.maxSlippage = str12;
        if ((i & 4096) == 0) {
            this.quoteBizType = null;
        } else {
            this.quoteBizType = str13;
        }
        if ((i & 8192) == 0) {
            this.dexIds = null;
        } else {
            this.dexIds = list;
        }
        if ((i & 16384) == 0) {
            this.forbiddenBridgeTypes = null;
        } else {
            this.forbiddenBridgeTypes = list2;
        }
        if ((32768 & i) == 0) {
            this.userWalletAddress = null;
        } else {
            this.userWalletAddress = str14;
        }
        if ((65536 & i) == 0) {
            this.receiveWalletAddress = null;
        } else {
            this.receiveWalletAddress = str15;
        }
        if ((131072 & i) == 0) {
            this.defiPlatformIds = null;
        } else {
            this.defiPlatformIds = list3;
        }
        if ((262144 & i) == 0) {
            this.refCode = null;
        } else {
            this.refCode = str16;
        }
        if ((524288 & i) == 0) {
            this.referralCommissionJsVersion = null;
        } else {
            this.referralCommissionJsVersion = str17;
        }
        if ((i & 1048576) == 0) {
            this.accountInfo = null;
        } else {
            this.accountInfo = accountInfo;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(QuotePriceReq quotePriceReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || quotePriceReq.fromTokenAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, quotePriceReq.fromTokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) quotePriceReq.amount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, quotePriceReq.amount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || quotePriceReq.toTokenAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, quotePriceReq.toTokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) quotePriceReq.fromTokenDecimal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, quotePriceReq.fromTokenDecimal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) quotePriceReq.toTokenDecimal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, quotePriceReq.toTokenDecimal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) quotePriceReq.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, quotePriceReq.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) quotePriceReq.gasLevel, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, quotePriceReq.gasLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) quotePriceReq.toChainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, quotePriceReq.toChainId);
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, quotePriceReq.slippage);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) quotePriceReq.pmm, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, quotePriceReq.pmm);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 10, quotePriceReq.slippageType);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, quotePriceReq.maxSlippage);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || quotePriceReq.quoteBizType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, quotePriceReq.quoteBizType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || quotePriceReq.dexIds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, kSerializerArr[13], quotePriceReq.dexIds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || quotePriceReq.forbiddenBridgeTypes != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, kSerializerArr[14], quotePriceReq.forbiddenBridgeTypes);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || quotePriceReq.userWalletAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, quotePriceReq.userWalletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || quotePriceReq.receiveWalletAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, quotePriceReq.receiveWalletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || quotePriceReq.defiPlatformIds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, kSerializerArr[17], quotePriceReq.defiPlatformIds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || quotePriceReq.refCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, stringSerializer, quotePriceReq.refCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || quotePriceReq.referralCommissionJsVersion != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, stringSerializer, quotePriceReq.referralCommissionJsVersion);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) && quotePriceReq.accountInfo == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, AccountInfo$$serializer.INSTANCE, quotePriceReq.accountInfo);
    }

    public QuotePriceReq(String str, @NotNull String str2, String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, String str9, @NotNull String str10, @NotNull String str11, String str12, String str13, List<String> list, List<String> list2, String str14, String str15, List<String> list3, String str16, String str17, AccountInfo accountInfo) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        this.fromTokenAddress = str;
        this.amount = str2;
        this.toTokenAddress = str3;
        this.fromTokenDecimal = str4;
        this.toTokenDecimal = str5;
        this.chainId = str6;
        this.gasLevel = str7;
        this.toChainId = str8;
        this.slippage = str9;
        this.pmm = str10;
        this.slippageType = str11;
        this.maxSlippage = str12;
        this.quoteBizType = str13;
        this.dexIds = list;
        this.forbiddenBridgeTypes = list2;
        this.userWalletAddress = str14;
        this.receiveWalletAddress = str15;
        this.defiPlatformIds = list3;
        this.refCode = str16;
        this.referralCommissionJsVersion = str17;
        this.accountInfo = accountInfo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00ad: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r47v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r47v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r47v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r47v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r47v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r47v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r47v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r47v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (r34v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r47v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (r36v0 java.lang.String)
  (r37v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004d: ARITH (r47v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r38v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0056: ARITH (r47v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r39v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x005f: ARITH (r47v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r40v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006b: ARITH (32768 int) & (r47v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0075: ARITH (65536 int) & (r47v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r42v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x007f: ARITH (131072 int) & (r47v0 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r43v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0089: ARITH (262144 int) & (r47v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0093: ARITH (524288 int) & (r47v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r45v0 java.lang.String))
  (wrap:com.okinc.business.dex.trade.core.domain.model.common.AccountInfo:?: TERNARY null = ((wrap:int:0x009d: ARITH (r47v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.trade.core.domain.model.common.AccountInfo) : (r46v0 com.okinc.business.dex.trade.core.domain.model.common.AccountInfo))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.lang.String, java.lang.String, com.okinc.business.dex.trade.core.domain.model.common.AccountInfo):void (m)] (LINE:284) call: com.okinc.business.dexlogic.bean.QuotePriceReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, com.okinc.business.dex.trade.core.domain.model.common.AccountInfo):void type: THIS */
    public /* synthetic */ QuotePriceReq(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List list, List list2, String str14, String str15, List list3, String str16, String str17, AccountInfo accountInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, str9, (i & 512) != 0 ? "" : str10, str11, str12, (i & 4096) != 0 ? null : str13, (i & 8192) != 0 ? null : list, (i & 16384) != 0 ? null : list2, (32768 & i) != 0 ? null : str14, (65536 & i) != 0 ? null : str15, (131072 & i) != 0 ? null : list3, (262144 & i) != 0 ? null : str16, (524288 & i) != 0 ? null : str17, (i & 1048576) != 0 ? null : accountInfo);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.QuotePriceReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt(boolean z) {
            if (z) {
                return "3";
            }
            return null;
        }

        private Companion() {
        }

        public final KSerializer<QuotePriceReq> serializer() {
            return QuotePriceReq$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer), null, null, new ArrayListSerializer(stringSerializer), null, null, null};
    }
}
