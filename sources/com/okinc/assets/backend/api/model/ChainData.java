package com.okinc.assets.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class ChainData implements Parcelable {
    public static final int TYPE_EVM_ADDRESS = 1;
    public static final int TYPE_LAYER2 = 3;
    public static final int TYPE_LIGHTNING = 2;
    public static final int TYPE_NORMAL_CHAIN = 1;
    private int arrivalType;
    private final Integer chainId;
    private int confirmNum;
    private boolean congested;
    private String contractAddress;
    private final List<NetworkContract> contracts;
    private String dailyMax;
    private String dailyMaxValuation;
    private String desc;
    private int estimatedArrivalTime;
    private final Integer estimatedDepositCreditedTime;
    private long estimatedOpenTime;
    private final Boolean freeWithdrawFeeTagEnabled;
    private final Boolean gasAirdropTagEnabled;
    private String gasFee;
    private String gasFeeSymbol;
    private final String icon;
    private final String lstCurrencyName;
    private String minDeposit;
    private final Integer mintedCoinId;
    private final String mintedCoinName;
    private String name;
    private boolean needTag;
    private final String networkIcon;
    private final String networkName;
    private int networkType;
    private String remark;
    private String singleMax;
    private String singleMaxValuation;
    private String singleMin;
    private String singleMinValuation;
    private boolean status;
    private int subCurrencyId;
    private final Integer supportType;
    private final Integer switchAddressType;
    private int type;
    private boolean updateKyc;
    private String usdGasFee;
    private String usdGasFeeSymbol;
    private boolean validAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ChainData> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(NetworkContract$$serializer.INSTANCE), null, null, null};

    public static final class Creator implements Parcelable.Creator<ChainData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChainData createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            String str;
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            long j = parcel.readLong();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            boolean z2 = parcel.readInt() != 0;
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            boolean z3 = parcel.readInt() != 0;
            int i3 = parcel.readInt();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            boolean z4 = parcel.readInt() != 0;
            boolean z5 = parcel.readInt() != 0;
            int i4 = parcel.readInt();
            int i5 = parcel.readInt();
            int i6 = parcel.readInt();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string19 = parcel.readString();
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                str = string7;
                arrayList = null;
            } else {
                int i7 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i7);
                str = string7;
                int i8 = 0;
                while (i8 != i7) {
                    arrayList2.add(NetworkContract.CREATOR.createFromParcel(parcel));
                    i8++;
                    i7 = i7;
                }
                arrayList = arrayList2;
            }
            return new ChainData(string, string2, j, string3, string4, z, i, i2, z2, string5, string6, str, string8, string9, string10, z3, i3, string11, string12, string13, string14, z4, z5, i4, i5, i6, string15, string16, string17, string18, numValueOf, numValueOf2, string19, numValueOf3, boolValueOf, boolValueOf2, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChainData[] newArray(int i) {
            return new ChainData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ChainData() {
        this((String) null, (String) null, 0L, (String) null, (String) null, false, 0, 0, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, 0, (String) null, (String) null, (String) null, (String) null, false, false, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, (String) null, (Integer) null, (Boolean) null, (Boolean) null, (List) null, (String) null, (Integer) null, (Integer) null, -1, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.singleMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.singleMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.dailyMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.singleMaxValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.singleMinValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.dailyMaxValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component16() {
        return this.congested;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component17() {
        return this.estimatedArrivalTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.gasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.usdGasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.desc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.gasFeeSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.usdGasFeeSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component22() {
        return this.validAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component23() {
        return this.needTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component24() {
        return this.networkType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component25() {
        return this.arrivalType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component26() {
        return this.confirmNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.minDeposit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.networkIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.estimatedOpenTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.networkName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component31() {
        return this.estimatedDepositCreditedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component32() {
        return this.supportType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.mintedCoinName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component34() {
        return this.mintedCoinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component35() {
        return this.gasAirdropTagEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component36() {
        return this.freeWithdrawFeeTagEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<NetworkContract> component37() {
        return this.contracts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component38() {
        return this.lstCurrencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component39() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component40() {
        return this.switchAddressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.remark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component9() {
        return this.updateKyc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChainData copy(String str, String str2, long j, String str3, String str4, boolean z, int i, int i2, boolean z2, String str5, String str6, String str7, String str8, String str9, String str10, boolean z3, int i3, String str11, String str12, String str13, String str14, boolean z4, boolean z5, int i4, int i5, int i6, String str15, String str16, String str17, String str18, Integer num, Integer num2, String str19, Integer num3, Boolean bool, Boolean bool2, List<NetworkContract> list, String str20, Integer num4, Integer num5) {
        return new ChainData(str, str2, j, str3, str4, z, i, i2, z2, str5, str6, str7, str8, str9, str10, z3, i3, str11, str12, str13, str14, z4, z5, i4, i5, i6, str15, str16, str17, str18, num, num2, str19, num3, bool, bool2, list, str20, num4, num5);
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
        if (!(obj instanceof ChainData)) {
            return false;
        }
        ChainData chainData = (ChainData) obj;
        return Intrinsics.EZpvd((Object) this.contractAddress, (Object) chainData.contractAddress) && Intrinsics.EZpvd((Object) this.desc, (Object) chainData.desc) && this.estimatedOpenTime == chainData.estimatedOpenTime && Intrinsics.EZpvd((Object) this.name, (Object) chainData.name) && Intrinsics.EZpvd((Object) this.remark, (Object) chainData.remark) && this.status == chainData.status && this.subCurrencyId == chainData.subCurrencyId && this.type == chainData.type && this.updateKyc == chainData.updateKyc && Intrinsics.EZpvd((Object) this.singleMax, (Object) chainData.singleMax) && Intrinsics.EZpvd((Object) this.singleMin, (Object) chainData.singleMin) && Intrinsics.EZpvd((Object) this.dailyMax, (Object) chainData.dailyMax) && Intrinsics.EZpvd((Object) this.singleMaxValuation, (Object) chainData.singleMaxValuation) && Intrinsics.EZpvd((Object) this.singleMinValuation, (Object) chainData.singleMinValuation) && Intrinsics.EZpvd((Object) this.dailyMaxValuation, (Object) chainData.dailyMaxValuation) && this.congested == chainData.congested && this.estimatedArrivalTime == chainData.estimatedArrivalTime && Intrinsics.EZpvd((Object) this.gasFee, (Object) chainData.gasFee) && Intrinsics.EZpvd((Object) this.usdGasFee, (Object) chainData.usdGasFee) && Intrinsics.EZpvd((Object) this.gasFeeSymbol, (Object) chainData.gasFeeSymbol) && Intrinsics.EZpvd((Object) this.usdGasFeeSymbol, (Object) chainData.usdGasFeeSymbol) && this.validAddress == chainData.validAddress && this.needTag == chainData.needTag && this.networkType == chainData.networkType && this.arrivalType == chainData.arrivalType && this.confirmNum == chainData.confirmNum && Intrinsics.EZpvd((Object) this.minDeposit, (Object) chainData.minDeposit) && Intrinsics.EZpvd((Object) this.icon, (Object) chainData.icon) && Intrinsics.EZpvd((Object) this.networkIcon, (Object) chainData.networkIcon) && Intrinsics.EZpvd((Object) this.networkName, (Object) chainData.networkName) && Intrinsics.EZpvd(this.estimatedDepositCreditedTime, chainData.estimatedDepositCreditedTime) && Intrinsics.EZpvd(this.supportType, chainData.supportType) && Intrinsics.EZpvd((Object) this.mintedCoinName, (Object) chainData.mintedCoinName) && Intrinsics.EZpvd(this.mintedCoinId, chainData.mintedCoinId) && Intrinsics.EZpvd(this.gasAirdropTagEnabled, chainData.gasAirdropTagEnabled) && Intrinsics.EZpvd(this.freeWithdrawFeeTagEnabled, chainData.freeWithdrawFeeTagEnabled) && Intrinsics.EZpvd(this.contracts, chainData.contracts) && Intrinsics.EZpvd((Object) this.lstCurrencyName, (Object) chainData.lstCurrencyName) && Intrinsics.EZpvd(this.chainId, chainData.chainId) && Intrinsics.EZpvd(this.switchAddressType, chainData.switchAddressType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getArrivalType() {
        return this.arrivalType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getConfirmNum() {
        return this.confirmNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCongested() {
        return this.congested;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContractAddress() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<NetworkContract> getContracts() {
        return this.contracts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDailyMax() {
        return this.dailyMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDailyMaxValuation() {
        return this.dailyMaxValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDesc() {
        return this.desc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getEstimatedArrivalTime() {
        return this.estimatedArrivalTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getEstimatedDepositCreditedTime() {
        return this.estimatedDepositCreditedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getEstimatedOpenTime() {
        return this.estimatedOpenTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getFreeWithdrawFeeTagEnabled() {
        return this.freeWithdrawFeeTagEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getGasAirdropTagEnabled() {
        return this.gasAirdropTagEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasFee() {
        return this.gasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasFeeSymbol() {
        return this.gasFeeSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLstCurrencyName() {
        return this.lstCurrencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinDeposit() {
        return this.minDeposit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getMintedCoinId() {
        return this.mintedCoinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMintedCoinName() {
        return this.mintedCoinName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNeedTag() {
        return this.needTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetworkIcon() {
        return this.networkIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetworkName() {
        return this.networkName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getNetworkType() {
        return this.networkType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRemark() {
        return this.remark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSingleMax() {
        return this.singleMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSingleMaxValuation() {
        return this.singleMaxValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSingleMin() {
        return this.singleMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSingleMinValuation() {
        return this.singleMinValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSubCurrencyId() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getSupportType() {
        return this.supportType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getSwitchAddressType() {
        return this.switchAddressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getUpdateKyc() {
        return this.updateKyc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdGasFee() {
        return this.usdGasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdGasFeeSymbol() {
        return this.usdGasFeeSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getValidAddress() {
        return this.validAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.contractAddress;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.desc;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int iHashCode3 = Long.hashCode(this.estimatedOpenTime);
        String str3 = this.name;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.remark;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        int iHashCode6 = Boolean.hashCode(this.status);
        int iHashCode7 = Integer.hashCode(this.subCurrencyId);
        int iHashCode8 = Integer.hashCode(this.type);
        int iHashCode9 = Boolean.hashCode(this.updateKyc);
        String str5 = this.singleMax;
        int iHashCode10 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.singleMin;
        int iHashCode11 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.dailyMax;
        int iHashCode12 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.singleMaxValuation;
        int iHashCode13 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.singleMinValuation;
        int iHashCode14 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.dailyMaxValuation;
        int iHashCode15 = str10 == null ? 0 : str10.hashCode();
        int iHashCode16 = Boolean.hashCode(this.congested);
        int iHashCode17 = Integer.hashCode(this.estimatedArrivalTime);
        String str11 = this.gasFee;
        int iHashCode18 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.usdGasFee;
        int iHashCode19 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.gasFeeSymbol;
        int iHashCode20 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.usdGasFeeSymbol;
        int iHashCode21 = str14 == null ? 0 : str14.hashCode();
        int iHashCode22 = Boolean.hashCode(this.validAddress);
        int iHashCode23 = Boolean.hashCode(this.needTag);
        int iHashCode24 = Integer.hashCode(this.networkType);
        int iHashCode25 = Integer.hashCode(this.arrivalType);
        int iHashCode26 = Integer.hashCode(this.confirmNum);
        String str15 = this.minDeposit;
        int iHashCode27 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.icon;
        int iHashCode28 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.networkIcon;
        int iHashCode29 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.networkName;
        int iHashCode30 = str18 == null ? 0 : str18.hashCode();
        Integer num = this.estimatedDepositCreditedTime;
        int iHashCode31 = num == null ? 0 : num.hashCode();
        Integer num2 = this.supportType;
        int iHashCode32 = num2 == null ? 0 : num2.hashCode();
        String str19 = this.mintedCoinName;
        int iHashCode33 = str19 == null ? 0 : str19.hashCode();
        Integer num3 = this.mintedCoinId;
        int iHashCode34 = num3 == null ? 0 : num3.hashCode();
        Boolean bool = this.gasAirdropTagEnabled;
        int iHashCode35 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.freeWithdrawFeeTagEnabled;
        int iHashCode36 = bool2 == null ? 0 : bool2.hashCode();
        List<NetworkContract> list = this.contracts;
        int iHashCode37 = list == null ? 0 : list.hashCode();
        String str20 = this.lstCurrencyName;
        int iHashCode38 = str20 == null ? 0 : str20.hashCode();
        Integer num4 = this.chainId;
        int iHashCode39 = num4 == null ? 0 : num4.hashCode();
        Integer num5 = this.switchAddressType;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + (num5 == null ? 0 : num5.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isEVMAddress() {
        return this.networkType == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isInvoice() {
        return this.type == 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setArrivalType(int i) {
        this.arrivalType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConfirmNum(int i) {
        this.confirmNum = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCongested(boolean z) {
        this.congested = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContractAddress(String str) {
        this.contractAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDailyMax(String str) {
        this.dailyMax = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDailyMaxValuation(String str) {
        this.dailyMaxValuation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDesc(String str) {
        this.desc = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstimatedArrivalTime(int i) {
        this.estimatedArrivalTime = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstimatedOpenTime(long j) {
        this.estimatedOpenTime = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGasFee(String str) {
        this.gasFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGasFeeSymbol(String str) {
        this.gasFeeSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinDeposit(String str) {
        this.minDeposit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setName(String str) {
        this.name = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNeedTag(boolean z) {
        this.needTag = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNetworkType(int i) {
        this.networkType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRemark(String str) {
        this.remark = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSingleMax(String str) {
        this.singleMax = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSingleMaxValuation(String str) {
        this.singleMaxValuation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSingleMin(String str) {
        this.singleMin = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSingleMinValuation(String str) {
        this.singleMinValuation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(boolean z) {
        this.status = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubCurrencyId(int i) {
        this.subCurrencyId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(int i) {
        this.type = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUpdateKyc(boolean z) {
        this.updateKyc = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUsdGasFee(String str) {
        this.usdGasFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUsdGasFeeSymbol(String str) {
        this.usdGasFeeSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValidAddress(boolean z) {
        this.validAddress = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ChainData(contractAddress=" + this.contractAddress + ", desc=" + this.desc + ", estimatedOpenTime=" + this.estimatedOpenTime + ", name=" + this.name + ", remark=" + this.remark + ", status=" + this.status + ", subCurrencyId=" + this.subCurrencyId + ", type=" + this.type + ", updateKyc=" + this.updateKyc + ", singleMax=" + this.singleMax + ", singleMin=" + this.singleMin + ", dailyMax=" + this.dailyMax + ", singleMaxValuation=" + this.singleMaxValuation + ", singleMinValuation=" + this.singleMinValuation + ", dailyMaxValuation=" + this.dailyMaxValuation + ", congested=" + this.congested + ", estimatedArrivalTime=" + this.estimatedArrivalTime + ", gasFee=" + this.gasFee + ", usdGasFee=" + this.usdGasFee + ", gasFeeSymbol=" + this.gasFeeSymbol + ", usdGasFeeSymbol=" + this.usdGasFeeSymbol + ", validAddress=" + this.validAddress + ", needTag=" + this.needTag + ", networkType=" + this.networkType + ", arrivalType=" + this.arrivalType + ", confirmNum=" + this.confirmNum + ", minDeposit=" + this.minDeposit + ", icon=" + this.icon + ", networkIcon=" + this.networkIcon + ", networkName=" + this.networkName + ", estimatedDepositCreditedTime=" + this.estimatedDepositCreditedTime + ", supportType=" + this.supportType + ", mintedCoinName=" + this.mintedCoinName + ", mintedCoinId=" + this.mintedCoinId + ", gasAirdropTagEnabled=" + this.gasAirdropTagEnabled + ", freeWithdrawFeeTagEnabled=" + this.freeWithdrawFeeTagEnabled + ", contracts=" + this.contracts + ", lstCurrencyName=" + this.lstCurrencyName + ", chainId=" + this.chainId + ", switchAddressType=" + this.switchAddressType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.contractAddress);
        parcel.writeString(this.desc);
        parcel.writeLong(this.estimatedOpenTime);
        parcel.writeString(this.name);
        parcel.writeString(this.remark);
        parcel.writeInt(this.status ? 1 : 0);
        parcel.writeInt(this.subCurrencyId);
        parcel.writeInt(this.type);
        parcel.writeInt(this.updateKyc ? 1 : 0);
        parcel.writeString(this.singleMax);
        parcel.writeString(this.singleMin);
        parcel.writeString(this.dailyMax);
        parcel.writeString(this.singleMaxValuation);
        parcel.writeString(this.singleMinValuation);
        parcel.writeString(this.dailyMaxValuation);
        parcel.writeInt(this.congested ? 1 : 0);
        parcel.writeInt(this.estimatedArrivalTime);
        parcel.writeString(this.gasFee);
        parcel.writeString(this.usdGasFee);
        parcel.writeString(this.gasFeeSymbol);
        parcel.writeString(this.usdGasFeeSymbol);
        parcel.writeInt(this.validAddress ? 1 : 0);
        parcel.writeInt(this.needTag ? 1 : 0);
        parcel.writeInt(this.networkType);
        parcel.writeInt(this.arrivalType);
        parcel.writeInt(this.confirmNum);
        parcel.writeString(this.minDeposit);
        parcel.writeString(this.icon);
        parcel.writeString(this.networkIcon);
        parcel.writeString(this.networkName);
        Integer num = this.estimatedDepositCreditedTime;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.supportType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.mintedCoinName);
        Integer num3 = this.mintedCoinId;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Boolean bool = this.gasAirdropTagEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.freeWithdrawFeeTagEnabled;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        List<NetworkContract> list = this.contracts;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<NetworkContract> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.lstCurrencyName);
        Integer num4 = this.chainId;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        Integer num5 = this.switchAddressType;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
    }

    public /* synthetic */ ChainData(int i, int i2, String str, String str2, long j, String str3, String str4, boolean z, int i3, int i4, boolean z2, String str5, String str6, String str7, String str8, String str9, String str10, boolean z3, int i5, String str11, String str12, String str13, String str14, boolean z4, boolean z5, int i6, int i7, int i8, String str15, String str16, String str17, String str18, Integer num, Integer num2, String str19, Integer num3, Boolean bool, Boolean bool2, List list, String str20, Integer num4, Integer num5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.contractAddress = null;
        } else {
            this.contractAddress = str;
        }
        if ((i & 2) == 0) {
            this.desc = null;
        } else {
            this.desc = str2;
        }
        this.estimatedOpenTime = (i & 4) == 0 ? 0L : j;
        if ((i & 8) == 0) {
            this.name = null;
        } else {
            this.name = str3;
        }
        this.remark = (i & 16) == 0 ? "" : str4;
        if ((i & 32) == 0) {
            this.status = true;
        } else {
            this.status = z;
        }
        if ((i & 64) == 0) {
            this.subCurrencyId = 0;
        } else {
            this.subCurrencyId = i3;
        }
        if ((i & 128) == 0) {
            this.type = 0;
        } else {
            this.type = i4;
        }
        if ((i & 256) == 0) {
            this.updateKyc = false;
        } else {
            this.updateKyc = z2;
        }
        if ((i & 512) == 0) {
            this.singleMax = null;
        } else {
            this.singleMax = str5;
        }
        if ((i & 1024) == 0) {
            this.singleMin = null;
        } else {
            this.singleMin = str6;
        }
        if ((i & 2048) == 0) {
            this.dailyMax = null;
        } else {
            this.dailyMax = str7;
        }
        if ((i & 4096) == 0) {
            this.singleMaxValuation = null;
        } else {
            this.singleMaxValuation = str8;
        }
        if ((i & 8192) == 0) {
            this.singleMinValuation = null;
        } else {
            this.singleMinValuation = str9;
        }
        if ((i & 16384) == 0) {
            this.dailyMaxValuation = null;
        } else {
            this.dailyMaxValuation = str10;
        }
        if ((32768 & i) == 0) {
            this.congested = false;
        } else {
            this.congested = z3;
        }
        if ((65536 & i) == 0) {
            this.estimatedArrivalTime = 0;
        } else {
            this.estimatedArrivalTime = i5;
        }
        if ((131072 & i) == 0) {
            this.gasFee = null;
        } else {
            this.gasFee = str11;
        }
        if ((262144 & i) == 0) {
            this.usdGasFee = null;
        } else {
            this.usdGasFee = str12;
        }
        if ((524288 & i) == 0) {
            this.gasFeeSymbol = null;
        } else {
            this.gasFeeSymbol = str13;
        }
        if ((1048576 & i) == 0) {
            this.usdGasFeeSymbol = null;
        } else {
            this.usdGasFeeSymbol = str14;
        }
        if ((2097152 & i) == 0) {
            this.validAddress = true;
        } else {
            this.validAddress = z4;
        }
        if ((4194304 & i) == 0) {
            this.needTag = true;
        } else {
            this.needTag = z5;
        }
        if ((8388608 & i) == 0) {
            this.networkType = 0;
        } else {
            this.networkType = i6;
        }
        if ((16777216 & i) == 0) {
            this.arrivalType = 0;
        } else {
            this.arrivalType = i7;
        }
        if ((33554432 & i) == 0) {
            this.confirmNum = 0;
        } else {
            this.confirmNum = i8;
        }
        if ((67108864 & i) == 0) {
            this.minDeposit = null;
        } else {
            this.minDeposit = str15;
        }
        if ((134217728 & i) == 0) {
            this.icon = null;
        } else {
            this.icon = str16;
        }
        if ((268435456 & i) == 0) {
            this.networkIcon = null;
        } else {
            this.networkIcon = str17;
        }
        if ((536870912 & i) == 0) {
            this.networkName = null;
        } else {
            this.networkName = str18;
        }
        this.estimatedDepositCreditedTime = (1073741824 & i) == 0 ? 0 : num;
        this.supportType = (i & Integer.MIN_VALUE) == 0 ? 0 : num2;
        if ((i2 & 1) == 0) {
            this.mintedCoinName = null;
        } else {
            this.mintedCoinName = str19;
        }
        if ((i2 & 2) == 0) {
            this.mintedCoinId = null;
        } else {
            this.mintedCoinId = num3;
        }
        if ((i2 & 4) == 0) {
            this.gasAirdropTagEnabled = null;
        } else {
            this.gasAirdropTagEnabled = bool;
        }
        if ((i2 & 8) == 0) {
            this.freeWithdrawFeeTagEnabled = null;
        } else {
            this.freeWithdrawFeeTagEnabled = bool2;
        }
        if ((i2 & 16) == 0) {
            this.contracts = null;
        } else {
            this.contracts = list;
        }
        if ((i2 & 32) == 0) {
            this.lstCurrencyName = null;
        } else {
            this.lstCurrencyName = str20;
        }
        if ((i2 & 64) == 0) {
            this.chainId = null;
        } else {
            this.chainId = num4;
        }
        if ((i2 & 128) == 0) {
            this.switchAddressType = null;
        } else {
            this.switchAddressType = num5;
        }
    }

    public static final /* synthetic */ void write$Self$OKAssets_assets_pro_api(ChainData chainData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        Integer num2;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || chainData.contractAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, chainData.contractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || chainData.desc != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, chainData.desc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || chainData.estimatedOpenTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 2, chainData.estimatedOpenTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || chainData.name != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, chainData.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) chainData.remark, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, chainData.remark);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !chainData.status) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 5, chainData.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || chainData.subCurrencyId != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 6, chainData.subCurrencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || chainData.type != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 7, chainData.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || chainData.updateKyc) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 8, chainData.updateKyc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || chainData.singleMax != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, chainData.singleMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || chainData.singleMin != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, chainData.singleMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || chainData.dailyMax != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, chainData.dailyMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || chainData.singleMaxValuation != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, chainData.singleMaxValuation);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || chainData.singleMinValuation != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, chainData.singleMinValuation);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || chainData.dailyMaxValuation != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, chainData.dailyMaxValuation);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || chainData.congested) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 15, chainData.congested);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || chainData.estimatedArrivalTime != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 16, chainData.estimatedArrivalTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || chainData.gasFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, chainData.gasFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || chainData.usdGasFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, chainData.usdGasFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || chainData.gasFeeSymbol != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, chainData.gasFeeSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || chainData.usdGasFeeSymbol != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, StringSerializer.INSTANCE, chainData.usdGasFeeSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !chainData.validAddress) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 21, chainData.validAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !chainData.needTag) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 22, chainData.needTag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || chainData.networkType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 23, chainData.networkType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || chainData.arrivalType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 24, chainData.arrivalType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || chainData.confirmNum != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 25, chainData.confirmNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || chainData.minDeposit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, StringSerializer.INSTANCE, chainData.minDeposit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || chainData.icon != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 27, StringSerializer.INSTANCE, chainData.icon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || chainData.networkIcon != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, StringSerializer.INSTANCE, chainData.networkIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || chainData.networkName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, StringSerializer.INSTANCE, chainData.networkName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || (num2 = chainData.estimatedDepositCreditedTime) == null || num2.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 30, IntSerializer.INSTANCE, chainData.estimatedDepositCreditedTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || (num = chainData.supportType) == null || num.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 31, IntSerializer.INSTANCE, chainData.supportType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || chainData.mintedCoinName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 32, StringSerializer.INSTANCE, chainData.mintedCoinName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || chainData.mintedCoinId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 33, IntSerializer.INSTANCE, chainData.mintedCoinId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || chainData.gasAirdropTagEnabled != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 34, BooleanSerializer.INSTANCE, chainData.gasAirdropTagEnabled);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || chainData.freeWithdrawFeeTagEnabled != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 35, BooleanSerializer.INSTANCE, chainData.freeWithdrawFeeTagEnabled);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || chainData.contracts != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 36, kSerializerArr[36], chainData.contracts);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || chainData.lstCurrencyName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 37, StringSerializer.INSTANCE, chainData.lstCurrencyName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || chainData.chainId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 38, IntSerializer.INSTANCE, chainData.chainId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) && chainData.switchAddressType == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 39, IntSerializer.INSTANCE, chainData.switchAddressType);
    }

    public ChainData(String str, String str2, long j, String str3, String str4, boolean z, int i, int i2, boolean z2, String str5, String str6, String str7, String str8, String str9, String str10, boolean z3, int i3, String str11, String str12, String str13, String str14, boolean z4, boolean z5, int i4, int i5, int i6, String str15, String str16, String str17, String str18, Integer num, Integer num2, String str19, Integer num3, Boolean bool, Boolean bool2, List<NetworkContract> list, String str20, Integer num4, Integer num5) {
        this.contractAddress = str;
        this.desc = str2;
        this.estimatedOpenTime = j;
        this.name = str3;
        this.remark = str4;
        this.status = z;
        this.subCurrencyId = i;
        this.type = i2;
        this.updateKyc = z2;
        this.singleMax = str5;
        this.singleMin = str6;
        this.dailyMax = str7;
        this.singleMaxValuation = str8;
        this.singleMinValuation = str9;
        this.dailyMaxValuation = str10;
        this.congested = z3;
        this.estimatedArrivalTime = i3;
        this.gasFee = str11;
        this.usdGasFee = str12;
        this.gasFeeSymbol = str13;
        this.usdGasFeeSymbol = str14;
        this.validAddress = z4;
        this.needTag = z5;
        this.networkType = i4;
        this.arrivalType = i5;
        this.confirmNum = i6;
        this.minDeposit = str15;
        this.icon = str16;
        this.networkIcon = str17;
        this.networkName = str18;
        this.estimatedDepositCreditedTime = num;
        this.supportType = num2;
        this.mintedCoinName = str19;
        this.mintedCoinId = num3;
        this.gasAirdropTagEnabled = bool;
        this.freeWithdrawFeeTagEnabled = bool2;
        this.contracts = list;
        this.lstCurrencyName = str20;
        this.chainId = num4;
        this.switchAddressType = num5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ChainData(String str, String str2, long j, String str3, String str4, boolean z, int i, int i2, boolean z2, String str5, String str6, String str7, String str8, String str9, String str10, boolean z3, int i3, String str11, String str12, String str13, String str14, boolean z4, boolean z5, int i4, int i5, int i6, String str15, String str16, String str17, String str18, Integer num, Integer num2, String str19, Integer num3, Boolean bool, Boolean bool2, List list, String str20, Integer num4, Integer num5, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        int i9;
        Integer num6;
        String str21 = (i7 & 1) != 0 ? null : str;
        String str22 = (i7 & 2) != 0 ? null : str2;
        long j2 = (i7 & 4) != 0 ? 0L : j;
        String str23 = (i7 & 8) != 0 ? null : str3;
        String str24 = (i7 & 16) != 0 ? "" : str4;
        boolean z6 = (i7 & 32) != 0 ? true : z;
        int i10 = (i7 & 64) != 0 ? 0 : i;
        int i11 = (i7 & 128) != 0 ? 0 : i2;
        boolean z7 = (i7 & 256) != 0 ? false : z2;
        String str25 = (i7 & 512) != 0 ? null : str5;
        String str26 = (i7 & 1024) != 0 ? null : str6;
        String str27 = (i7 & 2048) != 0 ? null : str7;
        String str28 = (i7 & 4096) != 0 ? null : str8;
        String str29 = (i7 & 8192) != 0 ? null : str9;
        String str30 = (i7 & 16384) != 0 ? null : str10;
        boolean z8 = (i7 & 32768) != 0 ? false : z3;
        int i12 = (i7 & 65536) != 0 ? 0 : i3;
        String str31 = (i7 & 131072) != 0 ? null : str11;
        String str32 = (i7 & 262144) != 0 ? null : str12;
        String str33 = (i7 & 524288) != 0 ? null : str13;
        String str34 = (i7 & 1048576) != 0 ? null : str14;
        boolean z9 = (i7 & 2097152) != 0 ? true : z4;
        boolean z10 = (i7 & 4194304) != 0 ? true : z5;
        int i13 = (i7 & 8388608) != 0 ? 0 : i4;
        int i14 = (i7 & 16777216) != 0 ? 0 : i5;
        int i15 = (i7 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? 0 : i6;
        String str35 = (i7 & 67108864) != 0 ? null : str15;
        String str36 = (i7 & 134217728) != 0 ? null : str16;
        String str37 = (i7 & 268435456) != 0 ? null : str17;
        String str38 = (i7 & 536870912) != 0 ? null : str18;
        if ((i7 & 1073741824) != 0) {
            i9 = 0;
            num6 = 0;
        } else {
            i9 = 0;
            num6 = num;
        }
        this(str21, str22, j2, str23, str24, z6, i10, i11, z7, str25, str26, str27, str28, str29, str30, z8, i12, str31, str32, str33, str34, z9, z10, i13, i14, i15, str35, str36, str37, str38, num6, (i7 & Integer.MIN_VALUE) != 0 ? Integer.valueOf(i9) : num2, (i8 & 1) != 0 ? null : str19, (i8 & 2) != 0 ? null : num3, (i8 & 4) != 0 ? null : bool, (i8 & 8) != 0 ? null : bool2, (i8 & 16) != 0 ? null : list, (i8 & 32) != 0 ? null : str20, (i8 & 64) != 0 ? null : num4, (i8 & 128) != 0 ? null : num5);
    }

    public final WithdrawNetworkSupportType getSupportTypeEnum() {
        return WithdrawNetworkSupportType.Companion.copydefault(this.supportType);
    }

    public final MintedCoinType getMintedCoinTypeEnum() {
        return MintedCoinType.Companion.copydefault(this.mintedCoinId);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.ChainData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ChainData> serializer() {
            return ChainData$$serializer.INSTANCE;
        }
    }
}
