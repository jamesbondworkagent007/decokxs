package com.okinc.business.dexlogic.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.dex.api.bean.ChainInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C33129mqd;
import o.C56390yDp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class DefiChainInfo implements Parcelable {
    private final String baseToken;
    private final List<ChainInfoVO> bridgeSupportChainInfoList;
    private final List<Integer> bridgeSupportChainList;
    private final String chainId;
    private final String chainName;
    private final String chainSymbol;
    private final String chainType;
    private final String chainUsed;
    private final String crossAbility;
    private final String crossChainType;
    private final DexDefaultFromToTokenShowVO dexDefaultFromToTokenShowVO;
    private String gasPriceScalar;
    private final String hotTokens;
    private final String id;
    private final String isChainDisplay;
    private final String isNeedDealFeeCallData;
    private final int isSensitive;
    private final int isSupportBlinksShareUrl;
    private final int isSupportDappTrade;
    private final int isSupportMarket;
    private final boolean isUpgradeRequired;
    private final String limitOrderTradeMinUSD;
    private String localUserWalletAddress;
    private final String logoUrl;
    private final String nativeTokenSymbol;
    private final boolean needTop;
    private final String network;
    private final String networkFeeDisplayDecimals;
    private final String networkFeeType;
    private final String networkFeeUnit;
    private final boolean popularChain;
    private final String popularWeight;
    private final String reserveGas;
    private final int resourceId;
    private final String searchKey;
    private final int sortCrossbridge;
    private final String sortMultipleSwap;
    private final int sortSingleswap;
    private String supportAAWallet;
    private final boolean supportBatchBroadcast;
    private final boolean supportCefiMode;
    private final boolean supportCopyTrade;
    private final boolean supportCopyTradeCreate;
    private final boolean supportEip1559;
    private final boolean supportLimitSwap;
    private final boolean supportLimitU;
    private final boolean supportMemeMode;
    private final String supportMev;
    private final boolean supportSmartAccount;
    private final String supportSwapType;
    private final boolean supportTpSl;
    private final String tokenAddress;
    private final String tradeHashUrl;
    private final String walletExplorePrefix;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DefiChainInfo> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(IntSerializer.INSTANCE), new ArrayListSerializer(ChainInfoVO$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<DefiChainInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DefiChainInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            int i = parcel.readInt();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            DexDefaultFromToTokenShowVO dexDefaultFromToTokenShowVOCreateFromParcel = parcel.readInt() == 0 ? null : DexDefaultFromToTokenShowVO.CREATOR.createFromParcel(parcel);
            String string14 = parcel.readString();
            int i4 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i4);
            int i5 = 0;
            while (i5 != i4) {
                arrayList.add(Integer.valueOf(parcel.readInt()));
                i5++;
                i4 = i4;
            }
            int i6 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i6);
            int i7 = 0;
            while (i7 != i6) {
                arrayList2.add(ChainInfoVO.CREATOR.createFromParcel(parcel));
                i7++;
                i6 = i6;
            }
            return new DefiChainInfo(string, string2, string3, string4, string5, string6, i, string7, string8, string9, string10, string11, string12, string13, i2, i3, dexDefaultFromToTokenShowVOCreateFromParcel, string14, arrayList, arrayList2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DefiChainInfo[] newArray(int i) {
            return new DefiChainInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DefiChainInfo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, (DexDefaultFromToTokenShowVO) null, (String) null, (List) null, (List) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, (String) null, false, (String) null, (String) null, (String) null, false, false, false, (String) null, (String) null, false, (String) null, (String) null, false, false, false, false, false, false, false, (String) null, false, -1, 4194303, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean bridgeMarketUnsupportedNetworkForDAppRedirect() {
        return this.isSupportMarket == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.baseToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.hotTokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.reserveGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component15() {
        return this.sortCrossbridge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component16() {
        return this.sortSingleswap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexDefaultFromToTokenShowVO component17() {
        return this.dexDefaultFromToTokenShowVO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.chainType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component19() {
        return this.bridgeSupportChainList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ChainInfoVO> component20() {
        return this.bridgeSupportChainInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.crossChainType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.walletExplorePrefix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.isChainDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component24() {
        return this.isSensitive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.isNeedDealFeeCallData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.supportSwapType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.supportAAWallet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.gasPriceScalar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.localUserWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component30() {
        return this.isSupportDappTrade;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component31() {
        return this.isSupportMarket;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component32() {
        return this.isSupportBlinksShareUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.supportMev;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component34() {
        return this.popularChain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component35() {
        return this.popularWeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component36() {
        return this.crossAbility;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component37() {
        return this.searchKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component38() {
        return this.supportMemeMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component39() {
        return this.supportCefiMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.chainSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component40() {
        return this.supportBatchBroadcast;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component41() {
        return this.networkFeeUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component42() {
        return this.networkFeeDisplayDecimals;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component43() {
        return this.supportEip1559;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component44() {
        return this.networkFeeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component45() {
        return this.nativeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component46() {
        return this.supportSmartAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component47() {
        return this.supportLimitSwap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component48() {
        return this.supportLimitU;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component49() {
        return this.supportTpSl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.chainUsed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component50() {
        return this.supportCopyTrade;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component51() {
        return this.supportCopyTradeCreate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component52() {
        return this.isUpgradeRequired;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component53() {
        return this.limitOrderTradeMinUSD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component54() {
        return this.needTop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.logoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.resourceId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.sortMultipleSwap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.tradeHashUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DefiChainInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, int i, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, int i2, int i3, DexDefaultFromToTokenShowVO dexDefaultFromToTokenShowVO, @NotNull String str14, @NotNull List<Integer> list, @NotNull List<ChainInfoVO> list2, @NotNull String str15, @NotNull String str16, @NotNull String str17, int i4, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, String str22, int i5, int i6, int i7, @NotNull String str23, boolean z, @NotNull String str24, String str25, String str26, boolean z2, boolean z3, boolean z4, @NotNull String str27, @NotNull String str28, boolean z5, @NotNull String str29, @NotNull String str30, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, String str31, boolean z13) {
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
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(str30, "");
        return new DefiChainInfo(str, str2, str3, str4, str5, str6, i, str7, str8, str9, str10, str11, str12, str13, i2, i3, dexDefaultFromToTokenShowVO, str14, list, list2, str15, str16, str17, i4, str18, str19, str20, str21, str22, i5, i6, i7, str23, z, str24, str25, str26, z2, z3, z4, str27, str28, z5, str29, str30, z6, z7, z8, z9, z10, z11, z12, str31, z13);
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
        if (!(obj instanceof DefiChainInfo)) {
            return false;
        }
        DefiChainInfo defiChainInfo = (DefiChainInfo) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) defiChainInfo.id) && Intrinsics.EZpvd((Object) this.chainName, (Object) defiChainInfo.chainName) && Intrinsics.EZpvd((Object) this.chainId, (Object) defiChainInfo.chainId) && Intrinsics.EZpvd((Object) this.chainSymbol, (Object) defiChainInfo.chainSymbol) && Intrinsics.EZpvd((Object) this.chainUsed, (Object) defiChainInfo.chainUsed) && Intrinsics.EZpvd((Object) this.logoUrl, (Object) defiChainInfo.logoUrl) && this.resourceId == defiChainInfo.resourceId && Intrinsics.EZpvd((Object) this.sortMultipleSwap, (Object) defiChainInfo.sortMultipleSwap) && Intrinsics.EZpvd((Object) this.tradeHashUrl, (Object) defiChainInfo.tradeHashUrl) && Intrinsics.EZpvd((Object) this.network, (Object) defiChainInfo.network) && Intrinsics.EZpvd((Object) this.baseToken, (Object) defiChainInfo.baseToken) && Intrinsics.EZpvd((Object) this.hotTokens, (Object) defiChainInfo.hotTokens) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) defiChainInfo.tokenAddress) && Intrinsics.EZpvd((Object) this.reserveGas, (Object) defiChainInfo.reserveGas) && this.sortCrossbridge == defiChainInfo.sortCrossbridge && this.sortSingleswap == defiChainInfo.sortSingleswap && Intrinsics.EZpvd(this.dexDefaultFromToTokenShowVO, defiChainInfo.dexDefaultFromToTokenShowVO) && Intrinsics.EZpvd((Object) this.chainType, (Object) defiChainInfo.chainType) && Intrinsics.EZpvd(this.bridgeSupportChainList, defiChainInfo.bridgeSupportChainList) && Intrinsics.EZpvd(this.bridgeSupportChainInfoList, defiChainInfo.bridgeSupportChainInfoList) && Intrinsics.EZpvd((Object) this.crossChainType, (Object) defiChainInfo.crossChainType) && Intrinsics.EZpvd((Object) this.walletExplorePrefix, (Object) defiChainInfo.walletExplorePrefix) && Intrinsics.EZpvd((Object) this.isChainDisplay, (Object) defiChainInfo.isChainDisplay) && this.isSensitive == defiChainInfo.isSensitive && Intrinsics.EZpvd((Object) this.isNeedDealFeeCallData, (Object) defiChainInfo.isNeedDealFeeCallData) && Intrinsics.EZpvd((Object) this.supportSwapType, (Object) defiChainInfo.supportSwapType) && Intrinsics.EZpvd((Object) this.supportAAWallet, (Object) defiChainInfo.supportAAWallet) && Intrinsics.EZpvd((Object) this.gasPriceScalar, (Object) defiChainInfo.gasPriceScalar) && Intrinsics.EZpvd((Object) this.localUserWalletAddress, (Object) defiChainInfo.localUserWalletAddress) && this.isSupportDappTrade == defiChainInfo.isSupportDappTrade && this.isSupportMarket == defiChainInfo.isSupportMarket && this.isSupportBlinksShareUrl == defiChainInfo.isSupportBlinksShareUrl && Intrinsics.EZpvd((Object) this.supportMev, (Object) defiChainInfo.supportMev) && this.popularChain == defiChainInfo.popularChain && Intrinsics.EZpvd((Object) this.popularWeight, (Object) defiChainInfo.popularWeight) && Intrinsics.EZpvd((Object) this.crossAbility, (Object) defiChainInfo.crossAbility) && Intrinsics.EZpvd((Object) this.searchKey, (Object) defiChainInfo.searchKey) && this.supportMemeMode == defiChainInfo.supportMemeMode && this.supportCefiMode == defiChainInfo.supportCefiMode && this.supportBatchBroadcast == defiChainInfo.supportBatchBroadcast && Intrinsics.EZpvd((Object) this.networkFeeUnit, (Object) defiChainInfo.networkFeeUnit) && Intrinsics.EZpvd((Object) this.networkFeeDisplayDecimals, (Object) defiChainInfo.networkFeeDisplayDecimals) && this.supportEip1559 == defiChainInfo.supportEip1559 && Intrinsics.EZpvd((Object) this.networkFeeType, (Object) defiChainInfo.networkFeeType) && Intrinsics.EZpvd((Object) this.nativeTokenSymbol, (Object) defiChainInfo.nativeTokenSymbol) && this.supportSmartAccount == defiChainInfo.supportSmartAccount && this.supportLimitSwap == defiChainInfo.supportLimitSwap && this.supportLimitU == defiChainInfo.supportLimitU && this.supportTpSl == defiChainInfo.supportTpSl && this.supportCopyTrade == defiChainInfo.supportCopyTrade && this.supportCopyTradeCreate == defiChainInfo.supportCopyTradeCreate && this.isUpgradeRequired == defiChainInfo.isUpgradeRequired && Intrinsics.EZpvd((Object) this.limitOrderTradeMinUSD, (Object) defiChainInfo.limitOrderTradeMinUSD) && this.needTop == defiChainInfo.needTop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseToken() {
        return this.baseToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ChainInfoVO> getBridgeSupportChainInfoList() {
        return this.bridgeSupportChainInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getBridgeSupportChainList() {
        return this.bridgeSupportChainList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainName() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainSymbol() {
        return this.chainSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainType() {
        return this.chainType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainUsed() {
        return this.chainUsed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCrossAbility() {
        return this.crossAbility;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCrossChainType() {
        return this.crossChainType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexDefaultFromToTokenShowVO getDexDefaultFromToTokenShowVO() {
        return this.dexDefaultFromToTokenShowVO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasPriceScalar() {
        return this.gasPriceScalar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHotTokens() {
        return this.hotTokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLimitOrderTradeMinUSD() {
        return this.limitOrderTradeMinUSD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLocalUserWalletAddress() {
        return this.localUserWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNativeTokenSymbol() {
        return this.nativeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNeedTop() {
        return this.needTop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetwork() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetworkFeeDisplayDecimals() {
        return this.networkFeeDisplayDecimals;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetworkFeeType() {
        return this.networkFeeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetworkFeeUnit() {
        return this.networkFeeUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getPopularChain() {
        return this.popularChain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPopularWeight() {
        return this.popularWeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReserveGas() {
        return this.reserveGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getResourceId() {
        return this.resourceId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSearchKey() {
        return this.searchKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSortCrossbridge() {
        return this.sortCrossbridge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSortMultipleSwap() {
        return this.sortMultipleSwap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSortSingleswap() {
        return this.sortSingleswap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSupportAAWallet() {
        return this.supportAAWallet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSupportBatchBroadcast() {
        return this.supportBatchBroadcast;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSupportCefiMode() {
        return this.supportCefiMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSupportCopyTrade() {
        return this.supportCopyTrade;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSupportCopyTradeCreate() {
        return this.supportCopyTradeCreate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSupportEip1559() {
        return this.supportEip1559;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSupportLimitSwap() {
        return this.supportLimitSwap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSupportLimitU() {
        return this.supportLimitU;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSupportMemeMode() {
        return this.supportMemeMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSupportMev() {
        return this.supportMev;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSupportSmartAccount() {
        return this.supportSmartAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSupportSwapType() {
        return this.supportSwapType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSupportTpSl() {
        return this.supportTpSl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeHashUrl() {
        return this.tradeHashUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletExplorePrefix() {
        return this.walletExplorePrefix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.id.hashCode();
        int iHashCode2 = this.chainName.hashCode();
        int iHashCode3 = this.chainId.hashCode();
        int iHashCode4 = this.chainSymbol.hashCode();
        int iHashCode5 = this.chainUsed.hashCode();
        int iHashCode6 = this.logoUrl.hashCode();
        int iHashCode7 = Integer.hashCode(this.resourceId);
        int iHashCode8 = this.sortMultipleSwap.hashCode();
        int iHashCode9 = this.tradeHashUrl.hashCode();
        int iHashCode10 = this.network.hashCode();
        int iHashCode11 = this.baseToken.hashCode();
        int iHashCode12 = this.hotTokens.hashCode();
        int iHashCode13 = this.tokenAddress.hashCode();
        int iHashCode14 = this.reserveGas.hashCode();
        int iHashCode15 = Integer.hashCode(this.sortCrossbridge);
        int iHashCode16 = Integer.hashCode(this.sortSingleswap);
        DexDefaultFromToTokenShowVO dexDefaultFromToTokenShowVO = this.dexDefaultFromToTokenShowVO;
        int iHashCode17 = dexDefaultFromToTokenShowVO == null ? 0 : dexDefaultFromToTokenShowVO.hashCode();
        int iHashCode18 = this.chainType.hashCode();
        int iHashCode19 = this.bridgeSupportChainList.hashCode();
        int iHashCode20 = this.bridgeSupportChainInfoList.hashCode();
        int iHashCode21 = this.crossChainType.hashCode();
        int iHashCode22 = this.walletExplorePrefix.hashCode();
        int iHashCode23 = this.isChainDisplay.hashCode();
        int iHashCode24 = Integer.hashCode(this.isSensitive);
        int iHashCode25 = this.isNeedDealFeeCallData.hashCode();
        int iHashCode26 = this.supportSwapType.hashCode();
        int iHashCode27 = this.supportAAWallet.hashCode();
        int iHashCode28 = this.gasPriceScalar.hashCode();
        String str = this.localUserWalletAddress;
        int iHashCode29 = str == null ? 0 : str.hashCode();
        int iHashCode30 = Integer.hashCode(this.isSupportDappTrade);
        int iHashCode31 = Integer.hashCode(this.isSupportMarket);
        int iHashCode32 = Integer.hashCode(this.isSupportBlinksShareUrl);
        int iHashCode33 = this.supportMev.hashCode();
        int iHashCode34 = Boolean.hashCode(this.popularChain);
        int iHashCode35 = this.popularWeight.hashCode();
        String str2 = this.crossAbility;
        int iHashCode36 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.searchKey;
        int iHashCode37 = str3 == null ? 0 : str3.hashCode();
        int iHashCode38 = Boolean.hashCode(this.supportMemeMode);
        int iHashCode39 = Boolean.hashCode(this.supportCefiMode);
        int iHashCode40 = Boolean.hashCode(this.supportBatchBroadcast);
        int iHashCode41 = this.networkFeeUnit.hashCode();
        int iHashCode42 = this.networkFeeDisplayDecimals.hashCode();
        int iHashCode43 = Boolean.hashCode(this.supportEip1559);
        int iHashCode44 = this.networkFeeType.hashCode();
        int iHashCode45 = this.nativeTokenSymbol.hashCode();
        int iHashCode46 = Boolean.hashCode(this.supportSmartAccount);
        int iHashCode47 = Boolean.hashCode(this.supportLimitSwap);
        int iHashCode48 = Boolean.hashCode(this.supportLimitU);
        int iHashCode49 = Boolean.hashCode(this.supportTpSl);
        int iHashCode50 = Boolean.hashCode(this.supportCopyTrade);
        int iHashCode51 = Boolean.hashCode(this.supportCopyTradeCreate);
        int iHashCode52 = Boolean.hashCode(this.isUpgradeRequired);
        String str4 = this.limitOrderTradeMinUSD;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + iHashCode44) * 31) + iHashCode45) * 31) + iHashCode46) * 31) + iHashCode47) * 31) + iHashCode48) * 31) + iHashCode49) * 31) + iHashCode50) * 31) + iHashCode51) * 31) + iHashCode52) * 31) + (str4 != null ? str4.hashCode() : 0)) * 31) + Boolean.hashCode(this.needTop);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isChainDisplay() {
        return this.isChainDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isNeedDealFeeCallData() {
        return this.isNeedDealFeeCallData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isSensitive() {
        return this.isSensitive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSensitiveChain() {
        return this.isSensitive == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isSupportBlinksShareUrl() {
        return this.isSupportBlinksShareUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: isSupportBlinksShareUrl, reason: collision with other method in class */
    public final boolean m6496isSupportBlinksShareUrl() {
        return this.isSupportBlinksShareUrl == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isSupportDappTrade() {
        return this.isSupportDappTrade;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isSupportMarket() {
        return this.isSupportMarket;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isUpgradeRequired() {
        return this.isUpgradeRequired;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGasPriceScalar(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gasPriceScalar = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLocalUserWalletAddress(String str) {
        this.localUserWalletAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSupportAAWallet(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.supportAAWallet = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean swapNotSupportedForDAppRedirect() {
        return this.isSupportDappTrade == 1 && this.isSupportMarket == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean swapUnsupportedNetworkForDAppRedirect() {
        return this.isSupportDappTrade == 1 && this.isSupportMarket == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DefiChainInfo(id=" + this.id + ", chainName=" + this.chainName + ", chainId=" + this.chainId + ", chainSymbol=" + this.chainSymbol + ", chainUsed=" + this.chainUsed + ", logoUrl=" + this.logoUrl + ", resourceId=" + this.resourceId + ", sortMultipleSwap=" + this.sortMultipleSwap + ", tradeHashUrl=" + this.tradeHashUrl + ", network=" + this.network + ", baseToken=" + this.baseToken + ", hotTokens=" + this.hotTokens + ", tokenAddress=" + this.tokenAddress + ", reserveGas=" + this.reserveGas + ", sortCrossbridge=" + this.sortCrossbridge + ", sortSingleswap=" + this.sortSingleswap + ", dexDefaultFromToTokenShowVO=" + this.dexDefaultFromToTokenShowVO + ", chainType=" + this.chainType + ", bridgeSupportChainList=" + this.bridgeSupportChainList + ", bridgeSupportChainInfoList=" + this.bridgeSupportChainInfoList + ", crossChainType=" + this.crossChainType + ", walletExplorePrefix=" + this.walletExplorePrefix + ", isChainDisplay=" + this.isChainDisplay + ", isSensitive=" + this.isSensitive + ", isNeedDealFeeCallData=" + this.isNeedDealFeeCallData + ", supportSwapType=" + this.supportSwapType + ", supportAAWallet=" + this.supportAAWallet + ", gasPriceScalar=" + this.gasPriceScalar + ", localUserWalletAddress=" + this.localUserWalletAddress + ", isSupportDappTrade=" + this.isSupportDappTrade + ", isSupportMarket=" + this.isSupportMarket + ", isSupportBlinksShareUrl=" + this.isSupportBlinksShareUrl + ", supportMev=" + this.supportMev + ", popularChain=" + this.popularChain + ", popularWeight=" + this.popularWeight + ", crossAbility=" + this.crossAbility + ", searchKey=" + this.searchKey + ", supportMemeMode=" + this.supportMemeMode + ", supportCefiMode=" + this.supportCefiMode + ", supportBatchBroadcast=" + this.supportBatchBroadcast + ", networkFeeUnit=" + this.networkFeeUnit + ", networkFeeDisplayDecimals=" + this.networkFeeDisplayDecimals + ", supportEip1559=" + this.supportEip1559 + ", networkFeeType=" + this.networkFeeType + ", nativeTokenSymbol=" + this.nativeTokenSymbol + ", supportSmartAccount=" + this.supportSmartAccount + ", supportLimitSwap=" + this.supportLimitSwap + ", supportLimitU=" + this.supportLimitU + ", supportTpSl=" + this.supportTpSl + ", supportCopyTrade=" + this.supportCopyTrade + ", supportCopyTradeCreate=" + this.supportCopyTradeCreate + ", isUpgradeRequired=" + this.isUpgradeRequired + ", limitOrderTradeMinUSD=" + this.limitOrderTradeMinUSD + ", needTop=" + this.needTop + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.id);
        parcel.writeString(this.chainName);
        parcel.writeString(this.chainId);
        parcel.writeString(this.chainSymbol);
        parcel.writeString(this.chainUsed);
        parcel.writeString(this.logoUrl);
        parcel.writeInt(this.resourceId);
        parcel.writeString(this.sortMultipleSwap);
        parcel.writeString(this.tradeHashUrl);
        parcel.writeString(this.network);
        parcel.writeString(this.baseToken);
        parcel.writeString(this.hotTokens);
        parcel.writeString(this.tokenAddress);
        parcel.writeString(this.reserveGas);
        parcel.writeInt(this.sortCrossbridge);
        parcel.writeInt(this.sortSingleswap);
        DexDefaultFromToTokenShowVO dexDefaultFromToTokenShowVO = this.dexDefaultFromToTokenShowVO;
        if (dexDefaultFromToTokenShowVO == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dexDefaultFromToTokenShowVO.writeToParcel(parcel, i);
        }
        parcel.writeString(this.chainType);
        List<Integer> list = this.bridgeSupportChainList;
        parcel.writeInt(list.size());
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeInt(it.next().intValue());
        }
        List<ChainInfoVO> list2 = this.bridgeSupportChainInfoList;
        parcel.writeInt(list2.size());
        Iterator<ChainInfoVO> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.crossChainType);
        parcel.writeString(this.walletExplorePrefix);
        parcel.writeString(this.isChainDisplay);
        parcel.writeInt(this.isSensitive);
        parcel.writeString(this.isNeedDealFeeCallData);
        parcel.writeString(this.supportSwapType);
        parcel.writeString(this.supportAAWallet);
        parcel.writeString(this.gasPriceScalar);
        parcel.writeString(this.localUserWalletAddress);
        parcel.writeInt(this.isSupportDappTrade);
        parcel.writeInt(this.isSupportMarket);
        parcel.writeInt(this.isSupportBlinksShareUrl);
        parcel.writeString(this.supportMev);
        parcel.writeInt(this.popularChain ? 1 : 0);
        parcel.writeString(this.popularWeight);
        parcel.writeString(this.crossAbility);
        parcel.writeString(this.searchKey);
        parcel.writeInt(this.supportMemeMode ? 1 : 0);
        parcel.writeInt(this.supportCefiMode ? 1 : 0);
        parcel.writeInt(this.supportBatchBroadcast ? 1 : 0);
        parcel.writeString(this.networkFeeUnit);
        parcel.writeString(this.networkFeeDisplayDecimals);
        parcel.writeInt(this.supportEip1559 ? 1 : 0);
        parcel.writeString(this.networkFeeType);
        parcel.writeString(this.nativeTokenSymbol);
        parcel.writeInt(this.supportSmartAccount ? 1 : 0);
        parcel.writeInt(this.supportLimitSwap ? 1 : 0);
        parcel.writeInt(this.supportLimitU ? 1 : 0);
        parcel.writeInt(this.supportTpSl ? 1 : 0);
        parcel.writeInt(this.supportCopyTrade ? 1 : 0);
        parcel.writeInt(this.supportCopyTradeCreate ? 1 : 0);
        parcel.writeInt(this.isUpgradeRequired ? 1 : 0);
        parcel.writeString(this.limitOrderTradeMinUSD);
        parcel.writeInt(this.needTop ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.DefiChainInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DefiChainInfo> serializer() {
            return DefiChainInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DefiChainInfo(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, int i3, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i4, int i5, DexDefaultFromToTokenShowVO dexDefaultFromToTokenShowVO, String str14, List list, List list2, String str15, String str16, String str17, int i6, String str18, String str19, String str20, String str21, String str22, int i7, int i8, int i9, String str23, boolean z, String str24, String str25, String str26, boolean z2, boolean z3, boolean z4, String str27, String str28, boolean z5, String str29, String str30, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, String str31, boolean z13, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.chainName = "";
        } else {
            this.chainName = str2;
        }
        if ((i & 4) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str3;
        }
        if ((i & 8) == 0) {
            this.chainSymbol = "";
        } else {
            this.chainSymbol = str4;
        }
        if ((i & 16) == 0) {
            this.chainUsed = "";
        } else {
            this.chainUsed = str5;
        }
        if ((i & 32) == 0) {
            this.logoUrl = "";
        } else {
            this.logoUrl = str6;
        }
        this.resourceId = (i & 64) == 0 ? -1 : i3;
        if ((i & 128) == 0) {
            this.sortMultipleSwap = "";
        } else {
            this.sortMultipleSwap = str7;
        }
        if ((i & 256) == 0) {
            this.tradeHashUrl = "";
        } else {
            this.tradeHashUrl = str8;
        }
        if ((i & 512) == 0) {
            this.network = "";
        } else {
            this.network = str9;
        }
        if ((i & 1024) == 0) {
            this.baseToken = "";
        } else {
            this.baseToken = str10;
        }
        if ((i & 2048) == 0) {
            this.hotTokens = "";
        } else {
            this.hotTokens = str11;
        }
        if ((i & 4096) == 0) {
            this.tokenAddress = "";
        } else {
            this.tokenAddress = str12;
        }
        if ((i & 8192) == 0) {
            this.reserveGas = "";
        } else {
            this.reserveGas = str13;
        }
        if ((i & 16384) == 0) {
            this.sortCrossbridge = 0;
        } else {
            this.sortCrossbridge = i4;
        }
        if ((i & 32768) == 0) {
            this.sortSingleswap = 0;
        } else {
            this.sortSingleswap = i5;
        }
        if ((i & 65536) == 0) {
            this.dexDefaultFromToTokenShowVO = null;
        } else {
            this.dexDefaultFromToTokenShowVO = dexDefaultFromToTokenShowVO;
        }
        if ((i & 131072) == 0) {
            this.chainType = "0";
        } else {
            this.chainType = str14;
        }
        this.bridgeSupportChainList = (262144 & i) == 0 ? new ArrayList() : list;
        this.bridgeSupportChainInfoList = (524288 & i) == 0 ? new ArrayList() : list2;
        if ((1048576 & i) == 0) {
            this.crossChainType = "";
        } else {
            this.crossChainType = str15;
        }
        if ((2097152 & i) == 0) {
            this.walletExplorePrefix = "";
        } else {
            this.walletExplorePrefix = str16;
        }
        if ((4194304 & i) == 0) {
            this.isChainDisplay = "";
        } else {
            this.isChainDisplay = str17;
        }
        if ((8388608 & i) == 0) {
            this.isSensitive = 0;
        } else {
            this.isSensitive = i6;
        }
        if ((16777216 & i) == 0) {
            this.isNeedDealFeeCallData = "0";
        } else {
            this.isNeedDealFeeCallData = str18;
        }
        this.supportSwapType = (33554432 & i) == 0 ? "3" : str19;
        if ((67108864 & i) == 0) {
            this.supportAAWallet = "0";
        } else {
            this.supportAAWallet = str20;
        }
        if ((134217728 & i) == 0) {
            this.gasPriceScalar = "";
        } else {
            this.gasPriceScalar = str21;
        }
        if ((268435456 & i) == 0) {
            this.localUserWalletAddress = null;
        } else {
            this.localUserWalletAddress = str22;
        }
        if ((536870912 & i) == 0) {
            this.isSupportDappTrade = 0;
        } else {
            this.isSupportDappTrade = i7;
        }
        this.isSupportMarket = (1073741824 & i) == 0 ? 1 : i8;
        if ((i & Integer.MIN_VALUE) == 0) {
            this.isSupportBlinksShareUrl = 0;
        } else {
            this.isSupportBlinksShareUrl = i9;
        }
        if ((i2 & 1) == 0) {
            this.supportMev = "0";
        } else {
            this.supportMev = str23;
        }
        if ((i2 & 2) == 0) {
            this.popularChain = false;
        } else {
            this.popularChain = z;
        }
        if ((i2 & 4) == 0) {
            this.popularWeight = "0";
        } else {
            this.popularWeight = str24;
        }
        if ((i2 & 8) == 0) {
            this.crossAbility = null;
        } else {
            this.crossAbility = str25;
        }
        if ((i2 & 16) == 0) {
            this.searchKey = null;
        } else {
            this.searchKey = str26;
        }
        if ((i2 & 32) == 0) {
            this.supportMemeMode = false;
        } else {
            this.supportMemeMode = z2;
        }
        if ((i2 & 64) == 0) {
            this.supportCefiMode = false;
        } else {
            this.supportCefiMode = z3;
        }
        if ((i2 & 128) == 0) {
            this.supportBatchBroadcast = false;
        } else {
            this.supportBatchBroadcast = z4;
        }
        if ((i2 & 256) == 0) {
            this.networkFeeUnit = "";
        } else {
            this.networkFeeUnit = str27;
        }
        if ((i2 & 512) == 0) {
            this.networkFeeDisplayDecimals = "";
        } else {
            this.networkFeeDisplayDecimals = str28;
        }
        if ((i2 & 1024) == 0) {
            this.supportEip1559 = false;
        } else {
            this.supportEip1559 = z5;
        }
        if ((i2 & 2048) == 0) {
            this.networkFeeType = "";
        } else {
            this.networkFeeType = str29;
        }
        if ((i2 & 4096) == 0) {
            this.nativeTokenSymbol = "";
        } else {
            this.nativeTokenSymbol = str30;
        }
        if ((i2 & 8192) == 0) {
            this.supportSmartAccount = false;
        } else {
            this.supportSmartAccount = z6;
        }
        if ((i2 & 16384) == 0) {
            this.supportLimitSwap = false;
        } else {
            this.supportLimitSwap = z7;
        }
        if ((i2 & 32768) == 0) {
            this.supportLimitU = false;
        } else {
            this.supportLimitU = z8;
        }
        if ((i2 & 65536) == 0) {
            this.supportTpSl = false;
        } else {
            this.supportTpSl = z9;
        }
        if ((i2 & 131072) == 0) {
            this.supportCopyTrade = false;
        } else {
            this.supportCopyTrade = z10;
        }
        if ((262144 & i2) == 0) {
            this.supportCopyTradeCreate = false;
        } else {
            this.supportCopyTradeCreate = z11;
        }
        if ((524288 & i2) == 0) {
            this.isUpgradeRequired = false;
        } else {
            this.isUpgradeRequired = z12;
        }
        if ((1048576 & i2) == 0) {
            this.limitOrderTradeMinUSD = null;
        } else {
            this.limitOrderTradeMinUSD = str31;
        }
        if ((2097152 & i2) == 0) {
            this.needTop = false;
        } else {
            this.needTop = z13;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(DefiChainInfo defiChainInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) defiChainInfo.id, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, defiChainInfo.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) defiChainInfo.chainName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, defiChainInfo.chainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) defiChainInfo.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, defiChainInfo.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) defiChainInfo.chainSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, defiChainInfo.chainSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) defiChainInfo.chainUsed, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, defiChainInfo.chainUsed);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) defiChainInfo.logoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, defiChainInfo.logoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || defiChainInfo.resourceId != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 6, defiChainInfo.resourceId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) defiChainInfo.sortMultipleSwap, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, defiChainInfo.sortMultipleSwap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) defiChainInfo.tradeHashUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, defiChainInfo.tradeHashUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) defiChainInfo.network, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, defiChainInfo.network);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) defiChainInfo.baseToken, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, defiChainInfo.baseToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) defiChainInfo.hotTokens, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, defiChainInfo.hotTokens);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) defiChainInfo.tokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, defiChainInfo.tokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) defiChainInfo.reserveGas, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, defiChainInfo.reserveGas);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || defiChainInfo.sortCrossbridge != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 14, defiChainInfo.sortCrossbridge);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || defiChainInfo.sortSingleswap != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 15, defiChainInfo.sortSingleswap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || defiChainInfo.dexDefaultFromToTokenShowVO != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, DexDefaultFromToTokenShowVO$$serializer.INSTANCE, defiChainInfo.dexDefaultFromToTokenShowVO);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) defiChainInfo.chainType, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, defiChainInfo.chainType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd(defiChainInfo.bridgeSupportChainList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 18, kSerializerArr[18], defiChainInfo.bridgeSupportChainList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd(defiChainInfo.bridgeSupportChainInfoList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 19, kSerializerArr[19], defiChainInfo.bridgeSupportChainInfoList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) defiChainInfo.crossChainType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, defiChainInfo.crossChainType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) defiChainInfo.walletExplorePrefix, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, defiChainInfo.walletExplorePrefix);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) defiChainInfo.isChainDisplay, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, defiChainInfo.isChainDisplay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || defiChainInfo.isSensitive != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 23, defiChainInfo.isSensitive);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) defiChainInfo.isNeedDealFeeCallData, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, defiChainInfo.isNeedDealFeeCallData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) defiChainInfo.supportSwapType, (Object) "3")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, defiChainInfo.supportSwapType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) defiChainInfo.supportAAWallet, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, defiChainInfo.supportAAWallet);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) defiChainInfo.gasPriceScalar, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, defiChainInfo.gasPriceScalar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || defiChainInfo.localUserWalletAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, StringSerializer.INSTANCE, defiChainInfo.localUserWalletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || defiChainInfo.isSupportDappTrade != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 29, defiChainInfo.isSupportDappTrade);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || defiChainInfo.isSupportMarket != 1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 30, defiChainInfo.isSupportMarket);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || defiChainInfo.isSupportBlinksShareUrl != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 31, defiChainInfo.isSupportBlinksShareUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd((Object) defiChainInfo.supportMev, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 32, defiChainInfo.supportMev);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || defiChainInfo.popularChain) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 33, defiChainInfo.popularChain);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || !Intrinsics.EZpvd((Object) defiChainInfo.popularWeight, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 34, defiChainInfo.popularWeight);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || defiChainInfo.crossAbility != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 35, StringSerializer.INSTANCE, defiChainInfo.crossAbility);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || defiChainInfo.searchKey != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 36, StringSerializer.INSTANCE, defiChainInfo.searchKey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || defiChainInfo.supportMemeMode) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 37, defiChainInfo.supportMemeMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || defiChainInfo.supportCefiMode) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 38, defiChainInfo.supportCefiMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || defiChainInfo.supportBatchBroadcast) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 39, defiChainInfo.supportBatchBroadcast);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || !Intrinsics.EZpvd((Object) defiChainInfo.networkFeeUnit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 40, defiChainInfo.networkFeeUnit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) || !Intrinsics.EZpvd((Object) defiChainInfo.networkFeeDisplayDecimals, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 41, defiChainInfo.networkFeeDisplayDecimals);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 42) || defiChainInfo.supportEip1559) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 42, defiChainInfo.supportEip1559);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 43) || !Intrinsics.EZpvd((Object) defiChainInfo.networkFeeType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 43, defiChainInfo.networkFeeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 44) || !Intrinsics.EZpvd((Object) defiChainInfo.nativeTokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 44, defiChainInfo.nativeTokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 45) || defiChainInfo.supportSmartAccount) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 45, defiChainInfo.supportSmartAccount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 46) || defiChainInfo.supportLimitSwap) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 46, defiChainInfo.supportLimitSwap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 47) || defiChainInfo.supportLimitU) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 47, defiChainInfo.supportLimitU);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 48) || defiChainInfo.supportTpSl) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 48, defiChainInfo.supportTpSl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 49) || defiChainInfo.supportCopyTrade) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 49, defiChainInfo.supportCopyTrade);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 50) || defiChainInfo.supportCopyTradeCreate) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 50, defiChainInfo.supportCopyTradeCreate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 51) || defiChainInfo.isUpgradeRequired) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 51, defiChainInfo.isUpgradeRequired);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 52) || defiChainInfo.limitOrderTradeMinUSD != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 52, StringSerializer.INSTANCE, defiChainInfo.limitOrderTradeMinUSD);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 53) || defiChainInfo.needTop) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 53, defiChainInfo.needTop);
        }
    }

    public DefiChainInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, int i, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, int i2, int i3, DexDefaultFromToTokenShowVO dexDefaultFromToTokenShowVO, @NotNull String str14, @NotNull List<Integer> list, @NotNull List<ChainInfoVO> list2, @NotNull String str15, @NotNull String str16, @NotNull String str17, int i4, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, String str22, int i5, int i6, int i7, @NotNull String str23, boolean z, @NotNull String str24, String str25, String str26, boolean z2, boolean z3, boolean z4, @NotNull String str27, @NotNull String str28, boolean z5, @NotNull String str29, @NotNull String str30, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, String str31, boolean z13) {
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
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(str30, "");
        this.id = str;
        this.chainName = str2;
        this.chainId = str3;
        this.chainSymbol = str4;
        this.chainUsed = str5;
        this.logoUrl = str6;
        this.resourceId = i;
        this.sortMultipleSwap = str7;
        this.tradeHashUrl = str8;
        this.network = str9;
        this.baseToken = str10;
        this.hotTokens = str11;
        this.tokenAddress = str12;
        this.reserveGas = str13;
        this.sortCrossbridge = i2;
        this.sortSingleswap = i3;
        this.dexDefaultFromToTokenShowVO = dexDefaultFromToTokenShowVO;
        this.chainType = str14;
        this.bridgeSupportChainList = list;
        this.bridgeSupportChainInfoList = list2;
        this.crossChainType = str15;
        this.walletExplorePrefix = str16;
        this.isChainDisplay = str17;
        this.isSensitive = i4;
        this.isNeedDealFeeCallData = str18;
        this.supportSwapType = str19;
        this.supportAAWallet = str20;
        this.gasPriceScalar = str21;
        this.localUserWalletAddress = str22;
        this.isSupportDappTrade = i5;
        this.isSupportMarket = i6;
        this.isSupportBlinksShareUrl = i7;
        this.supportMev = str23;
        this.popularChain = z;
        this.popularWeight = str24;
        this.crossAbility = str25;
        this.searchKey = str26;
        this.supportMemeMode = z2;
        this.supportCefiMode = z3;
        this.supportBatchBroadcast = z4;
        this.networkFeeUnit = str27;
        this.networkFeeDisplayDecimals = str28;
        this.supportEip1559 = z5;
        this.networkFeeType = str29;
        this.nativeTokenSymbol = str30;
        this.supportSmartAccount = z6;
        this.supportLimitSwap = z7;
        this.supportLimitU = z8;
        this.supportTpSl = z9;
        this.supportCopyTrade = z10;
        this.supportCopyTradeCreate = z11;
        this.isUpgradeRequired = z12;
        this.limitOrderTradeMinUSD = str31;
        this.needTop = z13;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0292: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0004: ARITH (r109v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r109v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r109v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r109v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r109v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r109v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r60v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0036: ARITH (r109v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r61v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r109v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r62v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0046: ARITH (r109v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r63v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004e: ARITH (r109v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r64v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0056: ARITH (r109v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r65v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005e: ARITH (r109v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r66v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0066: ARITH (r109v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r67v0 java.lang.String))
  (wrap:java.lang.String:0x0079: TERNARY null = ((wrap:int:0x0070: ARITH (r109v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r68v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x007b: ARITH (r109v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r69v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0089: ARITH (r109v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r70v0 int))
  (wrap:com.okinc.business.dexlogic.bean.DexDefaultFromToTokenShowVO:?: TERNARY null = ((wrap:int:0x0094: ARITH (r109v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.DexDefaultFromToTokenShowVO) : (r71v0 com.okinc.business.dexlogic.bean.DexDefaultFromToTokenShowVO))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a1: ARITH (r109v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("0") : (r72v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00ae: ARITH (r109v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00b4: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:117) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r73v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00bc: ARITH (r109v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00c2: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:118) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r74v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ca: ARITH (r109v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r75v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d5: ARITH (r109v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r76v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e0: ARITH (r109v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r77v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00eb: ARITH (r109v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r78v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f6: ARITH (r109v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("0") : (r79v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0101: ARITH (r109v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("3") : (r80v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x010c: ARITH (r109v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("0") : (r81v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0117: ARITH (r109v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r82v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0122: ARITH (r109v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r83v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x012d: ARITH (r109v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r84v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0138: ARITH (r109v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r85v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0143: ARITH (r109v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (0 int) : (r86v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x014c: ARITH (r110v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("0") : (r87v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0155: ARITH (r110v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r88v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x015e: ARITH (r110v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r89v0 java.lang.String) : ("0"))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0165: ARITH (r110v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r90v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x016e: ARITH (r110v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r91v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0177: ARITH (r110v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r92v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0180: ARITH (r110v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r93v0 boolean))
  (wrap:boolean:0x0194: TERNARY null = ((wrap:int:0x018b: ARITH (r110v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r94v0 boolean))
  (wrap:java.lang.String:0x019f: TERNARY null = ((wrap:int:0x0196: ARITH (r110v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r95v0 java.lang.String))
  (wrap:java.lang.String:0x01aa: TERNARY null = ((wrap:int:0x01a1: ARITH (r110v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r96v0 java.lang.String))
  (wrap:boolean:0x01b5: TERNARY null = ((wrap:int:0x01ac: ARITH (r110v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? false : (r97v0 boolean))
  (wrap:java.lang.String:0x01c0: TERNARY null = ((wrap:int:0x01b7: ARITH (r110v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r98v0 java.lang.String))
  (wrap:java.lang.String:0x01cb: TERNARY null = ((wrap:int:0x01c2: ARITH (r110v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r99v0 java.lang.String))
  (wrap:boolean:0x01d6: TERNARY null = ((wrap:int:0x01cd: ARITH (r110v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? false : (r100v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x01d8: ARITH (r110v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? false : (r101v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x01e1: ARITH (r110v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? false : (r102v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x01ea: ARITH (r110v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? false : (r103v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x01f3: ARITH (r110v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? false : (r104v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x01fe: ARITH (r110v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? false : (r105v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0209: ARITH (r110v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? false : (r106v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0214: ARITH (r110v0 int) & (1048576 int) A[WRAPPED]) == (0 int)) ? (r107v0 java.lang.String) : (null java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x021d: ARITH (r110v0 int) & (2097152 int) A[WRAPPED]) == (0 int)) ? (r108v0 boolean) : false)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, com.okinc.business.dexlogic.bean.DexDefaultFromToTokenShowVO, java.lang.String, java.util.List<java.lang.Integer>, java.util.List<com.okinc.business.dexlogic.bean.ChainInfoVO>, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean, boolean, boolean, java.lang.String, boolean):void (m)] (LINE:98) call: com.okinc.business.dexlogic.bean.DefiChainInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, com.okinc.business.dexlogic.bean.DexDefaultFromToTokenShowVO, java.lang.String, java.util.List, java.util.List, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean, boolean, boolean, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ DefiChainInfo(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i2, int i3, DexDefaultFromToTokenShowVO dexDefaultFromToTokenShowVO, String str14, List list, List list2, String str15, String str16, String str17, int i4, String str18, String str19, String str20, String str21, String str22, int i5, int i6, int i7, String str23, boolean z, String str24, String str25, String str26, boolean z2, boolean z3, boolean z4, String str27, String str28, boolean z5, String str29, String str30, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, String str31, boolean z13, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? "" : str2, (i8 & 4) != 0 ? "" : str3, (i8 & 8) != 0 ? "" : str4, (i8 & 16) != 0 ? "" : str5, (i8 & 32) != 0 ? "" : str6, (i8 & 64) != 0 ? -1 : i, (i8 & 128) != 0 ? "" : str7, (i8 & 256) != 0 ? "" : str8, (i8 & 512) != 0 ? "" : str9, (i8 & 1024) != 0 ? "" : str10, (i8 & 2048) != 0 ? "" : str11, (i8 & 4096) != 0 ? "" : str12, (i8 & 8192) != 0 ? "" : str13, (i8 & 16384) != 0 ? 0 : i2, (i8 & 32768) != 0 ? 0 : i3, (i8 & 65536) != 0 ? null : dexDefaultFromToTokenShowVO, (i8 & 131072) != 0 ? "0" : str14, (i8 & 262144) != 0 ? new ArrayList() : list, (i8 & 524288) != 0 ? new ArrayList() : list2, (i8 & 1048576) != 0 ? "" : str15, (i8 & 2097152) != 0 ? "" : str16, (i8 & 4194304) != 0 ? "" : str17, (i8 & 8388608) != 0 ? 0 : i4, (i8 & 16777216) != 0 ? "0" : str18, (i8 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "3" : str19, (i8 & 67108864) != 0 ? "0" : str20, (i8 & 134217728) != 0 ? "" : str21, (i8 & 268435456) != 0 ? null : str22, (i8 & 536870912) != 0 ? 0 : i5, (i8 & 1073741824) != 0 ? 1 : i6, (i8 & Integer.MIN_VALUE) != 0 ? 0 : i7, (i9 & 1) != 0 ? "0" : str23, (i9 & 2) != 0 ? false : z, (i9 & 4) == 0 ? str24 : "0", (i9 & 8) != 0 ? null : str25, (i9 & 16) != 0 ? null : str26, (i9 & 32) != 0 ? false : z2, (i9 & 64) != 0 ? false : z3, (i9 & 128) != 0 ? false : z4, (i9 & 256) != 0 ? "" : str27, (i9 & 512) != 0 ? "" : str28, (i9 & 1024) != 0 ? false : z5, (i9 & 2048) != 0 ? "" : str29, (i9 & 4096) != 0 ? "" : str30, (i9 & 8192) != 0 ? false : z6, (i9 & 16384) != 0 ? false : z7, (i9 & 32768) != 0 ? false : z8, (i9 & 65536) != 0 ? false : z9, (i9 & 131072) != 0 ? false : z10, (i9 & 262144) != 0 ? false : z11, (i9 & 524288) != 0 ? false : z12, (i9 & 1048576) == 0 ? str31 : null, (i9 & 2097152) == 0 ? z13 : false);
    }

    public final boolean isSupportAAWallet() {
        return Intrinsics.EZpvd((Object) this.supportAAWallet, (Object) "1");
    }

    public final boolean bridgeUnsupportedPairForDAppRedirect(@NotNull String str) {
        Object next;
        Intrinsics.checkNotNullParameter(str, "");
        Iterator<T> it = this.bridgeSupportChainInfoList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((Object) ((ChainInfoVO) next).getChainId(), (Object) str)) {
                break;
            }
        }
        ChainInfoVO chainInfoVO = (ChainInfoVO) next;
        return chainInfoVO != null && chainInfoVO.getSupportLinkDapp() == 1;
    }

    public final boolean isEvm() {
        return Intrinsics.EZpvd((Object) this.chainType, (Object) "0");
    }

    public final boolean existBridgeSupportChainId(@NotNull String str) {
        Object next;
        Intrinsics.checkNotNullParameter(str, "");
        Iterator<T> it = this.bridgeSupportChainList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Number) next).intValue() == C33129mqd.AhwBna(str)) {
                break;
            }
        }
        return next != null;
    }

    public final String getMainContractAddress() {
        DexMultiTokenInfoBean toDexMultiTokenInfoVO;
        DexMultiTokenInfoBean fromDexMultiTokenInfoVO;
        String originContractAddress;
        DexDefaultFromToTokenShowVO dexDefaultFromToTokenShowVO = this.dexDefaultFromToTokenShowVO;
        if (dexDefaultFromToTokenShowVO != null && (fromDexMultiTokenInfoVO = dexDefaultFromToTokenShowVO.getFromDexMultiTokenInfoVO()) != null) {
            if (!fromDexMultiTokenInfoVO.isMainChainCoin()) {
                fromDexMultiTokenInfoVO = null;
            }
            if (fromDexMultiTokenInfoVO != null && (originContractAddress = fromDexMultiTokenInfoVO.getOriginContractAddress()) != null) {
                return originContractAddress;
            }
        }
        DexDefaultFromToTokenShowVO dexDefaultFromToTokenShowVO2 = this.dexDefaultFromToTokenShowVO;
        if (dexDefaultFromToTokenShowVO2 != null && (toDexMultiTokenInfoVO = dexDefaultFromToTokenShowVO2.getToDexMultiTokenInfoVO()) != null) {
            DexMultiTokenInfoBean dexMultiTokenInfoBean = toDexMultiTokenInfoVO.isMainChainCoin() ? toDexMultiTokenInfoVO : null;
            if (dexMultiTokenInfoBean != null) {
                return dexMultiTokenInfoBean.getOriginContractAddress();
            }
        }
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [203=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final Pair<String, Boolean> judgeCurrentChainSupportTrade(DefiChainInfo defiChainInfo) {
        if (defiChainInfo == null) {
            return C56390yDp.OLrzqt("", Boolean.FALSE);
        }
        String str = this.supportSwapType;
        switch (str.hashCode()) {
            case 49:
                if (str.equals("1")) {
                    return Intrinsics.EZpvd((Object) this.chainId, (Object) defiChainInfo.chainId) ? C56390yDp.OLrzqt("", Boolean.TRUE) : C56390yDp.OLrzqt("2", Boolean.FALSE);
                }
                break;
            case 50:
                if (str.equals("2")) {
                    return (Intrinsics.EZpvd((Object) this.chainId, (Object) defiChainInfo.chainId) || !existBridgeSupportChainId(defiChainInfo.chainId)) ? Intrinsics.EZpvd((Object) this.chainId, (Object) defiChainInfo.chainId) ? C56390yDp.OLrzqt("1", Boolean.FALSE) : C56390yDp.OLrzqt("2", Boolean.FALSE) : C56390yDp.OLrzqt("", Boolean.TRUE);
                }
                break;
            case 51:
                if (str.equals("3")) {
                    return existBridgeSupportChainId(defiChainInfo.chainId) | Intrinsics.EZpvd((Object) this.chainId, (Object) defiChainInfo.chainId) ? C56390yDp.OLrzqt("", Boolean.TRUE) : C56390yDp.OLrzqt("2", Boolean.FALSE);
                }
                break;
        }
        return C56390yDp.OLrzqt("", Boolean.FALSE);
    }

    public final boolean supportMev() {
        return Intrinsics.EZpvd((Object) this.supportMev, (Object) "1");
    }

    public final ChainInfo toChainInfo() {
        return new ChainInfo(this.id, this.chainName, this.chainId, this.chainSymbol, this.chainUsed, this.logoUrl, this.tradeHashUrl, this.network, this.isSupportMarket == 1, this.walletExplorePrefix);
    }
}
