package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.defi.api.bean.FromToken;
import com.okinc.business.defi.api.bean.FromToken$$serializer;
import com.okinc.business.invest_biz.data.contants.BTCMode;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount$$serializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C25493ixk;
import o.C33070mpX;
import o.C52761wXj;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestTxModel implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private String address;
    private Long analysisPlatformId;
    private Integer approveType;
    private List<InvestTokenWithAmount> assetsList;
    private final BTCMode btcMode;
    private final String callDataExtJson;
    private final List<String> callDataExtJsonList;
    private String callDataExtraFromBE;
    private long chainId;
    private List<String> claimIndex;
    private Integer claimOverdue;
    private Long coinId;
    private String contextJson;
    private int drawableRes;
    private List<InvestTokenWithAmount> expectOutputList;
    private List<InvestTokenWithAmount> expectTokenList;
    private List<InvestTokenWithAmount> feeEarning;
    private List<FromToken> fromToken;
    private String gasLimit;
    private String gasPrice;
    private String gasRate;
    private List<Long> investmentId;
    private boolean isAvailableClaim;
    private boolean isOpenMEV;
    private final boolean isSingle;
    private String needApproveAmount;
    private final boolean openZap;
    private int orderType;
    private String platform;
    private final String platformLogo;
    private final String platformName;
    private String priorityFee;
    private final String providerPubkey;
    private final String pubkey;
    private int redeemAll;
    private final Map<String, String> redeemExtra;
    private final String redeemPercent;
    private final String rewardingAddress;
    private String slipPoint;
    private Long stakeId;
    private final String subscribeCallDataExtInfo;
    private final String swapSlipPoint;
    private Integer tickLower;
    private Integer tickUpper;
    private final String tokenId;
    private String totalValue;
    private List<InvestTokenWithAmount> userInputList;
    private String walletId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestTxModel> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestTxModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestTxModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            LinkedHashMap linkedHashMap;
            ArrayList arrayList2;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList3.add(Long.valueOf(parcel.readLong()));
            }
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            long j = parcel.readLong();
            String string3 = parcel.readString();
            int i4 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i4);
            for (int i5 = 0; i5 != i4; i5++) {
                arrayList4.add(InvestTokenWithAmount.CREATOR.createFromParcel(parcel));
            }
            int i6 = parcel.readInt();
            ArrayList arrayList5 = new ArrayList(i6);
            for (int i7 = 0; i7 != i6; i7++) {
                arrayList5.add(InvestTokenWithAmount.CREATOR.createFromParcel(parcel));
            }
            int i8 = parcel.readInt();
            ArrayList arrayList6 = new ArrayList(i8);
            for (int i9 = 0; i9 != i8; i9++) {
                arrayList6.add(InvestTokenWithAmount.CREATOR.createFromParcel(parcel));
            }
            int i10 = parcel.readInt();
            ArrayList arrayList7 = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList7.add(InvestTokenWithAmount.CREATOR.createFromParcel(parcel));
            }
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            int i12 = parcel.readInt();
            boolean z = parcel.readInt() != 0;
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string10 = parcel.readString();
            int i13 = parcel.readInt();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList = arrayList7;
                linkedHashMap = null;
            } else {
                int i14 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i14);
                int i15 = 0;
                while (i15 != i14) {
                    linkedHashMap2.put(parcel.readString(), parcel.readString());
                    i15++;
                    i14 = i14;
                    arrayList7 = arrayList7;
                }
                arrayList = arrayList7;
                linkedHashMap = linkedHashMap2;
            }
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i16 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(i16);
                for (int i17 = 0; i17 != i16; i17++) {
                    arrayList8.add(parcel.readParcelable(InvestTxModel.class.getClassLoader()));
                }
                arrayList2 = arrayList8;
            }
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            String string19 = parcel.readString();
            BTCMode bTCModeValueOf = BTCMode.valueOf(parcel.readString());
            String string20 = parcel.readString();
            String string21 = parcel.readString();
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            String string22 = parcel.readString();
            int i18 = parcel.readInt();
            ArrayList arrayList9 = new ArrayList(i18);
            for (int i19 = 0; i19 != i18; i19++) {
                arrayList9.add(InvestTokenWithAmount.CREATOR.createFromParcel(parcel));
            }
            return new InvestTxModel(i, string, string2, arrayList3, lValueOf, j, string3, arrayList4, arrayList5, arrayList6, arrayList, string4, string5, string6, string7, string8, string9, i12, z, lValueOf2, string10, i13, arrayListCreateStringArrayList, numValueOf, arrayListCreateStringArrayList2, linkedHashMap, string11, string12, string13, numValueOf2, numValueOf3, arrayList2, numValueOf4, string14, string15, string16, string17, string18, string19, bTCModeValueOf, string20, string21, z2, z3, string22, arrayList9, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestTxModel[] newArray(int i) {
            return new InvestTxModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestTxModel() {
        this(0, (String) null, (String) null, (List) null, (Long) null, 0L, (String) null, (List) null, (List) null, (List) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, (Long) null, (String) null, 0, (List) null, (Integer) null, (List) null, (Map) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, (List) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (BTCMode) null, (String) null, (String) null, false, false, (String) null, (List) null, false, (Long) null, -1, 65535, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> component10() {
        return this.assetsList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> component11() {
        return this.userInputList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.gasRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.gasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.slipPoint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.contextJson;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component18() {
        return this.redeemAll;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component19() {
        return this.isAvailableClaim;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component20() {
        return this.analysisPlatformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.platform;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component22() {
        return this.drawableRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component23() {
        return this.claimIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component24() {
        return this.claimOverdue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component25() {
        return this.callDataExtJsonList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> component26() {
        return this.redeemExtra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.rewardingAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.tokenId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.callDataExtJson;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component30() {
        return this.tickLower;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component31() {
        return this.tickUpper;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FromToken> component32() {
        return this.fromToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component33() {
        return this.approveType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component34() {
        return this.needApproveAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component35() {
        return this.callDataExtraFromBE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component36() {
        return this.redeemPercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component37() {
        return this.pubkey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component38() {
        return this.platformName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component39() {
        return this.platformLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> component4() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BTCMode component40() {
        return this.btcMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component41() {
        return this.providerPubkey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component42() {
        return this.subscribeCallDataExtInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component43() {
        return this.openZap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component44() {
        return this.isSingle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component45() {
        return this.swapSlipPoint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> component46() {
        return this.feeEarning;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component47() {
        return this.isOpenMEV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component48() {
        return this.stakeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component5() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component6() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.totalValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> component8() {
        return this.expectOutputList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> component9() {
        return this.expectTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTxModel copy(int i, @NotNull String str, @NotNull String str2, @NotNull List<Long> list, Long l, long j, @NotNull String str3, @NotNull List<InvestTokenWithAmount> list2, @NotNull List<InvestTokenWithAmount> list3, @NotNull List<InvestTokenWithAmount> list4, @NotNull List<InvestTokenWithAmount> list5, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, int i2, boolean z, Long l2, @NotNull String str10, int i3, List<String> list6, Integer num, List<String> list7, Map<String, String> map, String str11, String str12, String str13, Integer num2, Integer num3, List<FromToken> list8, Integer num4, String str14, String str15, String str16, String str17, @NotNull String str18, @NotNull String str19, @NotNull BTCMode bTCMode, String str20, String str21, boolean z2, boolean z3, String str22, @NotNull List<InvestTokenWithAmount> list9, boolean z4, Long l3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(bTCMode, "");
        Intrinsics.checkNotNullParameter(list9, "");
        return new InvestTxModel(i, str, str2, list, l, j, str3, list2, list3, list4, list5, str4, str5, str6, str7, str8, str9, i2, z, l2, str10, i3, list6, num, list7, map, str11, str12, str13, num2, num3, list8, num4, str14, str15, str16, str17, str18, str19, bTCMode, str20, str21, z2, z3, str22, list9, z4, l3);
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
        if (!(obj instanceof InvestTxModel)) {
            return false;
        }
        InvestTxModel investTxModel = (InvestTxModel) obj;
        return this.orderType == investTxModel.orderType && Intrinsics.EZpvd((Object) this.walletId, (Object) investTxModel.walletId) && Intrinsics.EZpvd((Object) this.address, (Object) investTxModel.address) && Intrinsics.EZpvd(this.investmentId, investTxModel.investmentId) && Intrinsics.EZpvd(this.coinId, investTxModel.coinId) && this.chainId == investTxModel.chainId && Intrinsics.EZpvd((Object) this.totalValue, (Object) investTxModel.totalValue) && Intrinsics.EZpvd(this.expectOutputList, investTxModel.expectOutputList) && Intrinsics.EZpvd(this.expectTokenList, investTxModel.expectTokenList) && Intrinsics.EZpvd(this.assetsList, investTxModel.assetsList) && Intrinsics.EZpvd(this.userInputList, investTxModel.userInputList) && Intrinsics.EZpvd((Object) this.gasRate, (Object) investTxModel.gasRate) && Intrinsics.EZpvd((Object) this.gasPrice, (Object) investTxModel.gasPrice) && Intrinsics.EZpvd((Object) this.gasLimit, (Object) investTxModel.gasLimit) && Intrinsics.EZpvd((Object) this.priorityFee, (Object) investTxModel.priorityFee) && Intrinsics.EZpvd((Object) this.slipPoint, (Object) investTxModel.slipPoint) && Intrinsics.EZpvd((Object) this.contextJson, (Object) investTxModel.contextJson) && this.redeemAll == investTxModel.redeemAll && this.isAvailableClaim == investTxModel.isAvailableClaim && Intrinsics.EZpvd(this.analysisPlatformId, investTxModel.analysisPlatformId) && Intrinsics.EZpvd((Object) this.platform, (Object) investTxModel.platform) && this.drawableRes == investTxModel.drawableRes && Intrinsics.EZpvd(this.claimIndex, investTxModel.claimIndex) && Intrinsics.EZpvd(this.claimOverdue, investTxModel.claimOverdue) && Intrinsics.EZpvd(this.callDataExtJsonList, investTxModel.callDataExtJsonList) && Intrinsics.EZpvd(this.redeemExtra, investTxModel.redeemExtra) && Intrinsics.EZpvd((Object) this.rewardingAddress, (Object) investTxModel.rewardingAddress) && Intrinsics.EZpvd((Object) this.tokenId, (Object) investTxModel.tokenId) && Intrinsics.EZpvd((Object) this.callDataExtJson, (Object) investTxModel.callDataExtJson) && Intrinsics.EZpvd(this.tickLower, investTxModel.tickLower) && Intrinsics.EZpvd(this.tickUpper, investTxModel.tickUpper) && Intrinsics.EZpvd(this.fromToken, investTxModel.fromToken) && Intrinsics.EZpvd(this.approveType, investTxModel.approveType) && Intrinsics.EZpvd((Object) this.needApproveAmount, (Object) investTxModel.needApproveAmount) && Intrinsics.EZpvd((Object) this.callDataExtraFromBE, (Object) investTxModel.callDataExtraFromBE) && Intrinsics.EZpvd((Object) this.redeemPercent, (Object) investTxModel.redeemPercent) && Intrinsics.EZpvd((Object) this.pubkey, (Object) investTxModel.pubkey) && Intrinsics.EZpvd((Object) this.platformName, (Object) investTxModel.platformName) && Intrinsics.EZpvd((Object) this.platformLogo, (Object) investTxModel.platformLogo) && this.btcMode == investTxModel.btcMode && Intrinsics.EZpvd((Object) this.providerPubkey, (Object) investTxModel.providerPubkey) && Intrinsics.EZpvd((Object) this.subscribeCallDataExtInfo, (Object) investTxModel.subscribeCallDataExtInfo) && this.openZap == investTxModel.openZap && this.isSingle == investTxModel.isSingle && Intrinsics.EZpvd((Object) this.swapSlipPoint, (Object) investTxModel.swapSlipPoint) && Intrinsics.EZpvd(this.feeEarning, investTxModel.feeEarning) && this.isOpenMEV == investTxModel.isOpenMEV && Intrinsics.EZpvd(this.stakeId, investTxModel.stakeId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getAnalysisPlatformId() {
        return this.analysisPlatformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getApproveType() {
        return this.approveType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> getAssetsList() {
        return this.assetsList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BTCMode getBtcMode() {
        return this.btcMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCallDataExtJson() {
        return this.callDataExtJson;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getCallDataExtJsonList() {
        return this.callDataExtJsonList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCallDataExtraFromBE() {
        return this.callDataExtraFromBE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getClaimIndex() {
        return this.claimIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getClaimOverdue() {
        return this.claimOverdue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContextJson() {
        return this.contextJson;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDrawableRes() {
        return this.drawableRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> getExpectOutputList() {
        return this.expectOutputList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> getExpectTokenList() {
        return this.expectTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> getFeeEarning() {
        return this.feeEarning;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FromToken> getFromToken() {
        return this.fromToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasLimit() {
        return this.gasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasPrice() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasRate() {
        return this.gasRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> getInvestmentId() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNeedApproveAmount() {
        return this.needApproveAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getOpenZap() {
        return this.openZap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOrderType() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlatform() {
        return this.platform;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlatformLogo() {
        return this.platformLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlatformName() {
        return this.platformName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriorityFee() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProviderPubkey() {
        return this.providerPubkey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPubkey() {
        return this.pubkey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRedeemAll() {
        return this.redeemAll;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> getRedeemExtra() {
        return this.redeemExtra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRedeemPercent() {
        return this.redeemPercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRewardingAddress() {
        return this.rewardingAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlipPoint() {
        return this.slipPoint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getStakeId() {
        return this.stakeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubscribeCallDataExtInfo() {
        return this.subscribeCallDataExtInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSwapSlipPoint() {
        return this.swapSlipPoint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTickLower() {
        return this.tickLower;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTickUpper() {
        return this.tickUpper;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenId() {
        return this.tokenId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalValue() {
        return this.totalValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> getUserInputList() {
        return this.userInputList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletId() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.orderType);
        int iHashCode2 = this.walletId.hashCode();
        int iHashCode3 = this.address.hashCode();
        int iHashCode4 = this.investmentId.hashCode();
        Long l = this.coinId;
        int iHashCode5 = l == null ? 0 : l.hashCode();
        int iHashCode6 = Long.hashCode(this.chainId);
        int iHashCode7 = this.totalValue.hashCode();
        int iHashCode8 = this.expectOutputList.hashCode();
        int iHashCode9 = this.expectTokenList.hashCode();
        int iHashCode10 = this.assetsList.hashCode();
        int iHashCode11 = this.userInputList.hashCode();
        int iHashCode12 = this.gasRate.hashCode();
        int iHashCode13 = this.gasPrice.hashCode();
        int iHashCode14 = this.gasLimit.hashCode();
        int iHashCode15 = this.priorityFee.hashCode();
        int iHashCode16 = this.slipPoint.hashCode();
        int iHashCode17 = this.contextJson.hashCode();
        int iHashCode18 = Integer.hashCode(this.redeemAll);
        int iHashCode19 = Boolean.hashCode(this.isAvailableClaim);
        Long l2 = this.analysisPlatformId;
        int iHashCode20 = l2 == null ? 0 : l2.hashCode();
        int iHashCode21 = this.platform.hashCode();
        int iHashCode22 = Integer.hashCode(this.drawableRes);
        List<String> list = this.claimIndex;
        int iHashCode23 = list == null ? 0 : list.hashCode();
        Integer num = this.claimOverdue;
        int iHashCode24 = num == null ? 0 : num.hashCode();
        List<String> list2 = this.callDataExtJsonList;
        int iHashCode25 = list2 == null ? 0 : list2.hashCode();
        Map<String, String> map = this.redeemExtra;
        int iHashCode26 = map == null ? 0 : map.hashCode();
        String str = this.rewardingAddress;
        int iHashCode27 = str == null ? 0 : str.hashCode();
        String str2 = this.tokenId;
        int iHashCode28 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.callDataExtJson;
        int iHashCode29 = str3 == null ? 0 : str3.hashCode();
        Integer num2 = this.tickLower;
        int iHashCode30 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.tickUpper;
        int iHashCode31 = num3 == null ? 0 : num3.hashCode();
        List<FromToken> list3 = this.fromToken;
        int iHashCode32 = list3 == null ? 0 : list3.hashCode();
        Integer num4 = this.approveType;
        int iHashCode33 = num4 == null ? 0 : num4.hashCode();
        String str4 = this.needApproveAmount;
        int iHashCode34 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.callDataExtraFromBE;
        int iHashCode35 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.redeemPercent;
        int iHashCode36 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.pubkey;
        int iHashCode37 = str7 == null ? 0 : str7.hashCode();
        int iHashCode38 = this.platformName.hashCode();
        int iHashCode39 = this.platformLogo.hashCode();
        int iHashCode40 = this.btcMode.hashCode();
        String str8 = this.providerPubkey;
        int iHashCode41 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.subscribeCallDataExtInfo;
        int iHashCode42 = str9 == null ? 0 : str9.hashCode();
        int iHashCode43 = Boolean.hashCode(this.openZap);
        int iHashCode44 = Boolean.hashCode(this.isSingle);
        String str10 = this.swapSlipPoint;
        int iHashCode45 = str10 == null ? 0 : str10.hashCode();
        int iHashCode46 = this.feeEarning.hashCode();
        int iHashCode47 = Boolean.hashCode(this.isOpenMEV);
        Long l3 = this.stakeId;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + iHashCode44) * 31) + iHashCode45) * 31) + iHashCode46) * 31) + iHashCode47) * 31) + (l3 == null ? 0 : l3.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isAvailableClaim() {
        return this.isAvailableClaim;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isBoostTrade() {
        return this.stakeId != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isOpenMEV() {
        return this.isOpenMEV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSingle() {
        return this.isSingle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAnalysisPlatformId(Long l) {
        this.analysisPlatformId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setApproveType(Integer num) {
        this.approveType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAssetsList(@NotNull List<InvestTokenWithAmount> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.assetsList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvailableClaim(boolean z) {
        this.isAvailableClaim = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallDataExtraFromBE(String str) {
        this.callDataExtraFromBE = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(long j) {
        this.chainId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClaimIndex(List<String> list) {
        this.claimIndex = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClaimOverdue(Integer num) {
        this.claimOverdue = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinId(Long l) {
        this.coinId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContextJson(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.contextJson = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDrawableRes(int i) {
        this.drawableRes = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExpectOutputList(@NotNull List<InvestTokenWithAmount> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.expectOutputList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExpectTokenList(@NotNull List<InvestTokenWithAmount> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.expectTokenList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFeeEarning(@NotNull List<InvestTokenWithAmount> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.feeEarning = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFromToken(List<FromToken> list) {
        this.fromToken = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGasLimit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gasLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGasPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gasPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGasRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gasRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvestmentId(@NotNull List<Long> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.investmentId = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNeedApproveAmount(String str) {
        this.needApproveAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOpenMEV(boolean z) {
        this.isOpenMEV = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderType(int i) {
        this.orderType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPlatform(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.platform = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriorityFee(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.priorityFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRedeemAll(int i) {
        this.redeemAll = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlipPoint(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.slipPoint = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStakeId(Long l) {
        this.stakeId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTickLower(Integer num) {
        this.tickLower = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTickUpper(Integer num) {
        this.tickUpper = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.totalValue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserInputList(@NotNull List<InvestTokenWithAmount> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.userInputList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWalletId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.walletId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestTxModel(orderType=" + this.orderType + ", walletId=" + this.walletId + ", address=" + this.address + ", investmentId=" + this.investmentId + ", coinId=" + this.coinId + ", chainId=" + this.chainId + ", totalValue=" + this.totalValue + ", expectOutputList=" + this.expectOutputList + ", expectTokenList=" + this.expectTokenList + ", assetsList=" + this.assetsList + ", userInputList=" + this.userInputList + ", gasRate=" + this.gasRate + ", gasPrice=" + this.gasPrice + ", gasLimit=" + this.gasLimit + ", priorityFee=" + this.priorityFee + ", slipPoint=" + this.slipPoint + ", contextJson=" + this.contextJson + ", redeemAll=" + this.redeemAll + ", isAvailableClaim=" + this.isAvailableClaim + ", analysisPlatformId=" + this.analysisPlatformId + ", platform=" + this.platform + ", drawableRes=" + this.drawableRes + ", claimIndex=" + this.claimIndex + ", claimOverdue=" + this.claimOverdue + ", callDataExtJsonList=" + this.callDataExtJsonList + ", redeemExtra=" + this.redeemExtra + ", rewardingAddress=" + this.rewardingAddress + ", tokenId=" + this.tokenId + ", callDataExtJson=" + this.callDataExtJson + ", tickLower=" + this.tickLower + ", tickUpper=" + this.tickUpper + ", fromToken=" + this.fromToken + ", approveType=" + this.approveType + ", needApproveAmount=" + this.needApproveAmount + ", callDataExtraFromBE=" + this.callDataExtraFromBE + ", redeemPercent=" + this.redeemPercent + ", pubkey=" + this.pubkey + ", platformName=" + this.platformName + ", platformLogo=" + this.platformLogo + ", btcMode=" + this.btcMode + ", providerPubkey=" + this.providerPubkey + ", subscribeCallDataExtInfo=" + this.subscribeCallDataExtInfo + ", openZap=" + this.openZap + ", isSingle=" + this.isSingle + ", swapSlipPoint=" + this.swapSlipPoint + ", feeEarning=" + this.feeEarning + ", isOpenMEV=" + this.isOpenMEV + ", stakeId=" + this.stakeId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.orderType);
        parcel.writeString(this.walletId);
        parcel.writeString(this.address);
        List<Long> list = this.investmentId;
        parcel.writeInt(list.size());
        Iterator<Long> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeLong(it.next().longValue());
        }
        Long l = this.coinId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeLong(this.chainId);
        parcel.writeString(this.totalValue);
        List<InvestTokenWithAmount> list2 = this.expectOutputList;
        parcel.writeInt(list2.size());
        Iterator<InvestTokenWithAmount> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        List<InvestTokenWithAmount> list3 = this.expectTokenList;
        parcel.writeInt(list3.size());
        Iterator<InvestTokenWithAmount> it3 = list3.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
        List<InvestTokenWithAmount> list4 = this.assetsList;
        parcel.writeInt(list4.size());
        Iterator<InvestTokenWithAmount> it4 = list4.iterator();
        while (it4.hasNext()) {
            it4.next().writeToParcel(parcel, i);
        }
        List<InvestTokenWithAmount> list5 = this.userInputList;
        parcel.writeInt(list5.size());
        Iterator<InvestTokenWithAmount> it5 = list5.iterator();
        while (it5.hasNext()) {
            it5.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.gasRate);
        parcel.writeString(this.gasPrice);
        parcel.writeString(this.gasLimit);
        parcel.writeString(this.priorityFee);
        parcel.writeString(this.slipPoint);
        parcel.writeString(this.contextJson);
        parcel.writeInt(this.redeemAll);
        parcel.writeInt(this.isAvailableClaim ? 1 : 0);
        Long l2 = this.analysisPlatformId;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.platform);
        parcel.writeInt(this.drawableRes);
        parcel.writeStringList(this.claimIndex);
        Integer num = this.claimOverdue;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeStringList(this.callDataExtJsonList);
        Map<String, String> map = this.redeemExtra;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
        parcel.writeString(this.rewardingAddress);
        parcel.writeString(this.tokenId);
        parcel.writeString(this.callDataExtJson);
        Integer num2 = this.tickLower;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.tickUpper;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        List<FromToken> list6 = this.fromToken;
        if (list6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list6.size());
            Iterator<FromToken> it6 = list6.iterator();
            while (it6.hasNext()) {
                parcel.writeParcelable(it6.next(), i);
            }
        }
        Integer num4 = this.approveType;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        parcel.writeString(this.needApproveAmount);
        parcel.writeString(this.callDataExtraFromBE);
        parcel.writeString(this.redeemPercent);
        parcel.writeString(this.pubkey);
        parcel.writeString(this.platformName);
        parcel.writeString(this.platformLogo);
        parcel.writeString(this.btcMode.name());
        parcel.writeString(this.providerPubkey);
        parcel.writeString(this.subscribeCallDataExtInfo);
        parcel.writeInt(this.openZap ? 1 : 0);
        parcel.writeInt(this.isSingle ? 1 : 0);
        parcel.writeString(this.swapSlipPoint);
        List<InvestTokenWithAmount> list7 = this.feeEarning;
        parcel.writeInt(list7.size());
        Iterator<InvestTokenWithAmount> it7 = list7.iterator();
        while (it7.hasNext()) {
            it7.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.isOpenMEV ? 1 : 0);
        Long l3 = this.stakeId;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestTxModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestTxModel> serializer() {
            return InvestTxModel$$serializer.INSTANCE;
        }
    }

    static {
        InvestTokenWithAmount$$serializer investTokenWithAmount$$serializer = InvestTokenWithAmount$$serializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, new ArrayListSerializer(LongSerializer.INSTANCE), null, null, null, new ArrayListSerializer(investTokenWithAmount$$serializer), new ArrayListSerializer(investTokenWithAmount$$serializer), new ArrayListSerializer(investTokenWithAmount$$serializer), new ArrayListSerializer(investTokenWithAmount$$serializer), null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(stringSerializer), null, new ArrayListSerializer(stringSerializer), new LinkedHashMapSerializer(stringSerializer, stringSerializer), null, null, null, null, null, new ArrayListSerializer(FromToken$$serializer.INSTANCE), null, null, null, null, null, null, null, BTCMode.Companion.serializer(), null, null, null, null, null, new ArrayListSerializer(investTokenWithAmount$$serializer), null, null};
    }

    public /* synthetic */ InvestTxModel(int i, int i2, int i3, String str, String str2, List list, Long l, long j, String str3, List list2, List list3, List list4, List list5, String str4, String str5, String str6, String str7, String str8, String str9, int i4, boolean z, Long l2, String str10, int i5, List list6, Integer num, List list7, Map map, String str11, String str12, String str13, Integer num2, Integer num3, List list8, Integer num4, String str14, String str15, String str16, String str17, String str18, String str19, BTCMode bTCMode, String str20, String str21, boolean z2, boolean z3, String str22, List list9, boolean z4, Long l3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.orderType = 0;
        } else {
            this.orderType = i3;
        }
        if ((i & 2) == 0) {
            this.walletId = "";
        } else {
            this.walletId = str;
        }
        if ((i & 4) == 0) {
            this.address = "";
        } else {
            this.address = str2;
        }
        this.investmentId = (i & 8) == 0 ? yDY.AhwBna() : list;
        if ((i & 16) == 0) {
            this.coinId = null;
        } else {
            this.coinId = l;
        }
        this.chainId = (i & 32) == 0 ? -1L : j;
        if ((i & 64) == 0) {
            this.totalValue = "";
        } else {
            this.totalValue = str3;
        }
        this.expectOutputList = (i & 128) == 0 ? yDY.AhwBna() : list2;
        this.expectTokenList = (i & 256) == 0 ? yDY.AhwBna() : list3;
        this.assetsList = (i & 512) == 0 ? yDY.AhwBna() : list4;
        this.userInputList = (i & 1024) == 0 ? yDY.AhwBna() : list5;
        this.gasRate = (i & 2048) == 0 ? "2" : str4;
        if ((i & 4096) == 0) {
            this.gasPrice = "";
        } else {
            this.gasPrice = str5;
        }
        if ((i & 8192) == 0) {
            this.gasLimit = "";
        } else {
            this.gasLimit = str6;
        }
        if ((i & 16384) == 0) {
            this.priorityFee = "";
        } else {
            this.priorityFee = str7;
        }
        if ((i & 32768) == 0) {
            this.slipPoint = "";
        } else {
            this.slipPoint = str8;
        }
        if ((65536 & i) == 0) {
            this.contextJson = "";
        } else {
            this.contextJson = str9;
        }
        if ((131072 & i) == 0) {
            this.redeemAll = 0;
        } else {
            this.redeemAll = i4;
        }
        if ((262144 & i) == 0) {
            this.isAvailableClaim = false;
        } else {
            this.isAvailableClaim = z;
        }
        if ((524288 & i) == 0) {
            this.analysisPlatformId = null;
        } else {
            this.analysisPlatformId = l2;
        }
        this.platform = (1048576 & i) == 0 ? C33070mpX.AYXKKw(C25493ixk.FragmentManager.sZqaRl) : str10;
        this.drawableRes = (2097152 & i) == 0 ? C52761wXj.TaskDescription.iqeXgQ : i5;
        if ((4194304 & i) == 0) {
            this.claimIndex = null;
        } else {
            this.claimIndex = list6;
        }
        if ((8388608 & i) == 0) {
            this.claimOverdue = null;
        } else {
            this.claimOverdue = num;
        }
        if ((16777216 & i) == 0) {
            this.callDataExtJsonList = null;
        } else {
            this.callDataExtJsonList = list7;
        }
        if ((33554432 & i) == 0) {
            this.redeemExtra = null;
        } else {
            this.redeemExtra = map;
        }
        if ((67108864 & i) == 0) {
            this.rewardingAddress = null;
        } else {
            this.rewardingAddress = str11;
        }
        if ((134217728 & i) == 0) {
            this.tokenId = null;
        } else {
            this.tokenId = str12;
        }
        if ((268435456 & i) == 0) {
            this.callDataExtJson = null;
        } else {
            this.callDataExtJson = str13;
        }
        if ((536870912 & i) == 0) {
            this.tickLower = null;
        } else {
            this.tickLower = num2;
        }
        if ((1073741824 & i) == 0) {
            this.tickUpper = null;
        } else {
            this.tickUpper = num3;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.fromToken = null;
        } else {
            this.fromToken = list8;
        }
        if ((i2 & 1) == 0) {
            this.approveType = null;
        } else {
            this.approveType = num4;
        }
        if ((i2 & 2) == 0) {
            this.needApproveAmount = null;
        } else {
            this.needApproveAmount = str14;
        }
        if ((i2 & 4) == 0) {
            this.callDataExtraFromBE = null;
        } else {
            this.callDataExtraFromBE = str15;
        }
        if ((i2 & 8) == 0) {
            this.redeemPercent = null;
        } else {
            this.redeemPercent = str16;
        }
        if ((i2 & 16) == 0) {
            this.pubkey = null;
        } else {
            this.pubkey = str17;
        }
        if ((i2 & 32) == 0) {
            this.platformName = "";
        } else {
            this.platformName = str18;
        }
        if ((i2 & 64) == 0) {
            this.platformLogo = "";
        } else {
            this.platformLogo = str19;
        }
        this.btcMode = (i2 & 128) == 0 ? BTCMode.DEFAULT : bTCMode;
        if ((i2 & 256) == 0) {
            this.providerPubkey = null;
        } else {
            this.providerPubkey = str20;
        }
        if ((i2 & 512) == 0) {
            this.subscribeCallDataExtInfo = null;
        } else {
            this.subscribeCallDataExtInfo = str21;
        }
        if ((i2 & 1024) == 0) {
            this.openZap = false;
        } else {
            this.openZap = z2;
        }
        if ((i2 & 2048) == 0) {
            this.isSingle = false;
        } else {
            this.isSingle = z3;
        }
        if ((i2 & 4096) == 0) {
            this.swapSlipPoint = null;
        } else {
            this.swapSlipPoint = str22;
        }
        this.feeEarning = (i2 & 8192) == 0 ? yDY.AhwBna() : list9;
        if ((i2 & 16384) == 0) {
            this.isOpenMEV = false;
        } else {
            this.isOpenMEV = z4;
        }
        if ((i2 & 32768) == 0) {
            this.stakeId = null;
        } else {
            this.stakeId = l3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [699=9] */
    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestTxModel investTxModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investTxModel.orderType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, investTxModel.orderType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) investTxModel.walletId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, investTxModel.walletId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) investTxModel.address, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, investTxModel.address);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(investTxModel.investmentId, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], investTxModel.investmentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || investTxModel.coinId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.INSTANCE, investTxModel.coinId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || investTxModel.chainId != -1) {
            compositeEncoder.encodeLongElement(serialDescriptor, 5, investTxModel.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) investTxModel.totalValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, investTxModel.totalValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd(investTxModel.expectOutputList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], investTxModel.expectOutputList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(investTxModel.expectTokenList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 8, kSerializerArr[8], investTxModel.expectTokenList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd(investTxModel.assetsList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 9, kSerializerArr[9], investTxModel.assetsList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd(investTxModel.userInputList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], investTxModel.userInputList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) investTxModel.gasRate, (Object) "2")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, investTxModel.gasRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) investTxModel.gasPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, investTxModel.gasPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) investTxModel.gasLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, investTxModel.gasLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) investTxModel.priorityFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, investTxModel.priorityFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) investTxModel.slipPoint, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, investTxModel.slipPoint);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) investTxModel.contextJson, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, investTxModel.contextJson);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || investTxModel.redeemAll != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 17, investTxModel.redeemAll);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || investTxModel.isAvailableClaim) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 18, investTxModel.isAvailableClaim);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || investTxModel.analysisPlatformId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, LongSerializer.INSTANCE, investTxModel.analysisPlatformId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) investTxModel.platform, (Object) C33070mpX.AYXKKw(C25493ixk.FragmentManager.sZqaRl))) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, investTxModel.platform);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || investTxModel.drawableRes != C52761wXj.TaskDescription.iqeXgQ) {
            compositeEncoder.encodeIntElement(serialDescriptor, 21, investTxModel.drawableRes);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || investTxModel.claimIndex != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, kSerializerArr[22], investTxModel.claimIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || investTxModel.claimOverdue != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, IntSerializer.INSTANCE, investTxModel.claimOverdue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || investTxModel.callDataExtJsonList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, kSerializerArr[24], investTxModel.callDataExtJsonList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || investTxModel.redeemExtra != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, kSerializerArr[25], investTxModel.redeemExtra);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || investTxModel.rewardingAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, StringSerializer.INSTANCE, investTxModel.rewardingAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || investTxModel.tokenId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 27, StringSerializer.INSTANCE, investTxModel.tokenId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || investTxModel.callDataExtJson != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, StringSerializer.INSTANCE, investTxModel.callDataExtJson);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || investTxModel.tickLower != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, IntSerializer.INSTANCE, investTxModel.tickLower);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || investTxModel.tickUpper != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 30, IntSerializer.INSTANCE, investTxModel.tickUpper);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || investTxModel.fromToken != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 31, kSerializerArr[31], investTxModel.fromToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || investTxModel.approveType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 32, IntSerializer.INSTANCE, investTxModel.approveType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || investTxModel.needApproveAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 33, StringSerializer.INSTANCE, investTxModel.needApproveAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || investTxModel.callDataExtraFromBE != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 34, StringSerializer.INSTANCE, investTxModel.callDataExtraFromBE);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || investTxModel.redeemPercent != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 35, StringSerializer.INSTANCE, investTxModel.redeemPercent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || investTxModel.pubkey != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 36, StringSerializer.INSTANCE, investTxModel.pubkey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || !Intrinsics.EZpvd((Object) investTxModel.platformName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 37, investTxModel.platformName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || !Intrinsics.EZpvd((Object) investTxModel.platformLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 38, investTxModel.platformLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || investTxModel.btcMode != BTCMode.DEFAULT) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 39, kSerializerArr[39], investTxModel.btcMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || investTxModel.providerPubkey != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 40, StringSerializer.INSTANCE, investTxModel.providerPubkey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) || investTxModel.subscribeCallDataExtInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 41, StringSerializer.INSTANCE, investTxModel.subscribeCallDataExtInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 42) || investTxModel.openZap) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 42, investTxModel.openZap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 43) || investTxModel.isSingle) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 43, investTxModel.isSingle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 44) || investTxModel.swapSlipPoint != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 44, StringSerializer.INSTANCE, investTxModel.swapSlipPoint);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 45) || !Intrinsics.EZpvd(investTxModel.feeEarning, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 45, kSerializerArr[45], investTxModel.feeEarning);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 46) || investTxModel.isOpenMEV) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 46, investTxModel.isOpenMEV);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 47) && investTxModel.stakeId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 47, LongSerializer.INSTANCE, investTxModel.stakeId);
    }

    public InvestTxModel(int i, @NotNull String str, @NotNull String str2, @NotNull List<Long> list, Long l, long j, @NotNull String str3, @NotNull List<InvestTokenWithAmount> list2, @NotNull List<InvestTokenWithAmount> list3, @NotNull List<InvestTokenWithAmount> list4, @NotNull List<InvestTokenWithAmount> list5, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, int i2, boolean z, Long l2, @NotNull String str10, int i3, List<String> list6, Integer num, List<String> list7, Map<String, String> map, String str11, String str12, String str13, Integer num2, Integer num3, List<FromToken> list8, Integer num4, String str14, String str15, String str16, String str17, @NotNull String str18, @NotNull String str19, @NotNull BTCMode bTCMode, String str20, String str21, boolean z2, boolean z3, String str22, @NotNull List<InvestTokenWithAmount> list9, boolean z4, Long l3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(bTCMode, "");
        Intrinsics.checkNotNullParameter(list9, "");
        this.orderType = i;
        this.walletId = str;
        this.address = str2;
        this.investmentId = list;
        this.coinId = l;
        this.chainId = j;
        this.totalValue = str3;
        this.expectOutputList = list2;
        this.expectTokenList = list3;
        this.assetsList = list4;
        this.userInputList = list5;
        this.gasRate = str4;
        this.gasPrice = str5;
        this.gasLimit = str6;
        this.priorityFee = str7;
        this.slipPoint = str8;
        this.contextJson = str9;
        this.redeemAll = i2;
        this.isAvailableClaim = z;
        this.analysisPlatformId = l2;
        this.platform = str10;
        this.drawableRes = i3;
        this.claimIndex = list6;
        this.claimOverdue = num;
        this.callDataExtJsonList = list7;
        this.redeemExtra = map;
        this.rewardingAddress = str11;
        this.tokenId = str12;
        this.callDataExtJson = str13;
        this.tickLower = num2;
        this.tickUpper = num3;
        this.fromToken = list8;
        this.approveType = num4;
        this.needApproveAmount = str14;
        this.callDataExtraFromBE = str15;
        this.redeemPercent = str16;
        this.pubkey = str17;
        this.platformName = str18;
        this.platformLogo = str19;
        this.btcMode = bTCMode;
        this.providerPubkey = str20;
        this.subscribeCallDataExtInfo = str21;
        this.openZap = z2;
        this.isSingle = z3;
        this.swapSlipPoint = str22;
        this.feeEarning = list9;
        this.isOpenMEV = z4;
        this.stakeId = l3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ InvestTxModel(int i, String str, String str2, List list, Long l, long j, String str3, List list2, List list3, List list4, List list5, String str4, String str5, String str6, String str7, String str8, String str9, int i2, boolean z, Long l2, String str10, int i3, List list6, Integer num, List list7, Map map, String str11, String str12, String str13, Integer num2, Integer num3, List list8, Integer num4, String str14, String str15, String str16, String str17, String str18, String str19, BTCMode bTCMode, String str20, String str21, boolean z2, boolean z3, String str22, List list9, boolean z4, Long l3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        String str23;
        str23 = "";
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? "" : str, (i4 & 4) != 0 ? "" : str2, (i4 & 8) != 0 ? yDY.AhwBna() : list, (i4 & 16) != 0 ? null : l, (i4 & 32) != 0 ? -1L : j, (i4 & 64) != 0 ? "" : str3, (i4 & 128) != 0 ? yDY.AhwBna() : list2, (i4 & 256) != 0 ? yDY.AhwBna() : list3, (i4 & 512) != 0 ? yDY.AhwBna() : list4, (i4 & 1024) != 0 ? yDY.AhwBna() : list5, (i4 & 2048) != 0 ? "2" : str4, (i4 & 4096) != 0 ? str23 : str5, (i4 & 8192) != 0 ? str23 : str6, (i4 & 16384) != 0 ? str23 : str7, (i4 & 32768) != 0 ? str23 : str8, (i4 & 65536) != 0 ? str23 : str9, (i4 & 131072) != 0 ? 0 : i2, (i4 & 262144) != 0 ? false : z, (i4 & 524288) != 0 ? null : l2, (i4 & 1048576) != 0 ? C33070mpX.AYXKKw(C25493ixk.FragmentManager.sZqaRl) : str10, (i4 & 2097152) != 0 ? C52761wXj.TaskDescription.iqeXgQ : i3, (i4 & 4194304) != 0 ? null : list6, (i4 & 8388608) != 0 ? null : num, (i4 & 16777216) != 0 ? null : list7, (i4 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : map, (i4 & 67108864) != 0 ? null : str11, (i4 & 134217728) != 0 ? null : str12, (i4 & 268435456) != 0 ? null : str13, (i4 & 536870912) != 0 ? null : num2, (i4 & 1073741824) != 0 ? null : num3, (i4 & Integer.MIN_VALUE) != 0 ? null : list8, (i5 & 1) != 0 ? null : num4, (i5 & 2) != 0 ? null : str14, (i5 & 4) != 0 ? null : str15, (i5 & 8) != 0 ? null : str16, (i5 & 16) != 0 ? null : str17, (i5 & 32) != 0 ? str23 : str18, (i5 & 64) == 0 ? str19 : "", (i5 & 128) != 0 ? BTCMode.DEFAULT : bTCMode, (i5 & 256) != 0 ? null : str20, (i5 & 512) != 0 ? null : str21, (i5 & 1024) != 0 ? false : z2, (i5 & 2048) != 0 ? false : z3, (i5 & 4096) != 0 ? null : str22, (i5 & 8192) != 0 ? yDY.AhwBna() : list9, (i5 & 16384) != 0 ? false : z4, (i5 & 32768) != 0 ? null : l3);
    }
}
