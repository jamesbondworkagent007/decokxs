package com.okinc.unify_trade.biz.subscribe;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.dex.StopOrderQuoteVO;
import com.okinc.dex.StopOrderQuoteVO$$serializer;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class DexOrderDetail implements Parcelable {
    private String cancelReason;
    private String chainIndex;
    private String chainLogoUrl;
    private String chainName;
    private String convertFromCoinAmount;
    private String convertFromCoinSymbol;
    private String convertToCoinAmount;
    private String convertToCoinSymbol;
    private String createTime;
    private String depositId;
    private String depositWaitTime;
    private String discountedFeeRate;
    private String expireTimeDays;
    private final String expireTimestamp;
    private String fastDepositStatus;
    private String fastDepositTime;
    private DexOrderDetailFeatures features;
    private String fillTime;
    private String isReleased;
    private String netWorkFee;
    private String netWorkFeeSymbol;
    private String netWorkFeeUsd;
    private String orderId;
    private String orderLimitType;
    private String orderSubType;
    private String orderType;
    private String originFeeRate;
    private String payCoinAmount;
    private String payCoinSymbol;
    private String payValue;
    private String priceAtPay;
    private String priceAtReceive;
    private String prohibitedRechargeByAsset;
    private String receiveCoinAmount;
    private String receiveCoinSymbol;
    private String receiveValue;
    private String side;
    private String state;
    private List<StopOrderQuoteVO> stopOrderList;
    private String strategyFailureReason;
    private String strategyOrderType;
    private String subState;
    private String tax;
    private String taxRate;
    private String tokenAddress;
    private String tokenName;
    private String tradingFee;
    private String tradingFeeSymbol;
    private String tradingFeeUsd;
    private String triggerMarketCapUsd;
    private String triggerPriceUsd;
    private String triggerValidDays;
    private String uTime;
    private String walletAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DexOrderDetail> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(StopOrderQuoteVO$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<DexOrderDetail> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexOrderDetail createFromParcel(Parcel parcel) {
            String str;
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
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
            String string22 = parcel.readString();
            String string23 = parcel.readString();
            String string24 = parcel.readString();
            String string25 = parcel.readString();
            String string26 = parcel.readString();
            String string27 = parcel.readString();
            String string28 = parcel.readString();
            String string29 = parcel.readString();
            String string30 = parcel.readString();
            String string31 = parcel.readString();
            String string32 = parcel.readString();
            String string33 = parcel.readString();
            DexOrderDetailFeatures dexOrderDetailFeaturesCreateFromParcel = parcel.readInt() == 0 ? null : DexOrderDetailFeatures.CREATOR.createFromParcel(parcel);
            String string34 = parcel.readString();
            String string35 = parcel.readString();
            String string36 = parcel.readString();
            String string37 = parcel.readString();
            String string38 = parcel.readString();
            String string39 = parcel.readString();
            String string40 = parcel.readString();
            String string41 = parcel.readString();
            String string42 = parcel.readString();
            String string43 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
                str = string13;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                str = string13;
                int i2 = 0;
                while (i2 != i) {
                    arrayList2.add(StopOrderQuoteVO.CREATOR.createFromParcel(parcel));
                    i2++;
                    i = i;
                }
                arrayList = arrayList2;
            }
            return new DexOrderDetail(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, str, string14, string15, string16, string17, string18, string19, string20, string21, string22, string23, string24, string25, string26, string27, string28, string29, string30, string31, string32, string33, dexOrderDetailFeaturesCreateFromParcel, string34, string35, string36, string37, string38, string39, string40, string41, string42, string43, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexOrderDetail[] newArray(int i) {
            return new DexOrderDetail[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DexOrderDetail() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (DexOrderDetailFeatures) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1, 4194303, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.receiveCoinSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.priceAtReceive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.receiveValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.tradingFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.tradingFeeSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.netWorkFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.netWorkFeeSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.netWorkFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.tradingFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.uTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.fillTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.depositWaitTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.prohibitedRechargeByAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.depositId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.originFeeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.discountedFeeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.taxRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.tax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexOrderDetailFeatures component34() {
        return this.features;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component35() {
        return this.fastDepositStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component36() {
        return this.fastDepositTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component37() {
        return this.orderSubType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component38() {
        return this.convertToCoinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component39() {
        return this.convertToCoinSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component40() {
        return this.subState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component41() {
        return this.convertFromCoinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component42() {
        return this.convertFromCoinSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component43() {
        return this.isReleased;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component44() {
        return this.walletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<StopOrderQuoteVO> component45() {
        return this.stopOrderList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component46() {
        return this.strategyFailureReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component47() {
        return this.cancelReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component48() {
        return this.strategyOrderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component49() {
        return this.triggerMarketCapUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.priceAtPay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component50() {
        return this.triggerPriceUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component51() {
        return this.triggerValidDays;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component52() {
        return this.expireTimeDays;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component53() {
        return this.expireTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component54() {
        return this.orderLimitType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.payCoinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.payValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.payCoinSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.receiveCoinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexOrderDetail copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull String str33, DexOrderDetailFeatures dexOrderDetailFeatures, @NotNull String str34, @NotNull String str35, @NotNull String str36, @NotNull String str37, @NotNull String str38, @NotNull String str39, @NotNull String str40, @NotNull String str41, String str42, String str43, List<StopOrderQuoteVO> list, @NotNull String str44, @NotNull String str45, @NotNull String str46, @NotNull String str47, @NotNull String str48, @NotNull String str49, @NotNull String str50, String str51, @NotNull String str52) {
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
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(str30, "");
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(str32, "");
        Intrinsics.checkNotNullParameter(str33, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(str35, "");
        Intrinsics.checkNotNullParameter(str36, "");
        Intrinsics.checkNotNullParameter(str37, "");
        Intrinsics.checkNotNullParameter(str38, "");
        Intrinsics.checkNotNullParameter(str39, "");
        Intrinsics.checkNotNullParameter(str40, "");
        Intrinsics.checkNotNullParameter(str41, "");
        Intrinsics.checkNotNullParameter(str44, "");
        Intrinsics.checkNotNullParameter(str45, "");
        Intrinsics.checkNotNullParameter(str46, "");
        Intrinsics.checkNotNullParameter(str47, "");
        Intrinsics.checkNotNullParameter(str48, "");
        Intrinsics.checkNotNullParameter(str49, "");
        Intrinsics.checkNotNullParameter(str50, "");
        Intrinsics.checkNotNullParameter(str52, "");
        return new DexOrderDetail(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, dexOrderDetailFeatures, str34, str35, str36, str37, str38, str39, str40, str41, str42, str43, list, str44, str45, str46, str47, str48, str49, str50, str51, str52);
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
        if (!(obj instanceof DexOrderDetail)) {
            return false;
        }
        DexOrderDetail dexOrderDetail = (DexOrderDetail) obj;
        return Intrinsics.EZpvd((Object) this.orderId, (Object) dexOrderDetail.orderId) && Intrinsics.EZpvd((Object) this.state, (Object) dexOrderDetail.state) && Intrinsics.EZpvd((Object) this.orderType, (Object) dexOrderDetail.orderType) && Intrinsics.EZpvd((Object) this.side, (Object) dexOrderDetail.side) && Intrinsics.EZpvd((Object) this.priceAtPay, (Object) dexOrderDetail.priceAtPay) && Intrinsics.EZpvd((Object) this.payCoinAmount, (Object) dexOrderDetail.payCoinAmount) && Intrinsics.EZpvd((Object) this.payValue, (Object) dexOrderDetail.payValue) && Intrinsics.EZpvd((Object) this.payCoinSymbol, (Object) dexOrderDetail.payCoinSymbol) && Intrinsics.EZpvd((Object) this.receiveCoinAmount, (Object) dexOrderDetail.receiveCoinAmount) && Intrinsics.EZpvd((Object) this.receiveCoinSymbol, (Object) dexOrderDetail.receiveCoinSymbol) && Intrinsics.EZpvd((Object) this.priceAtReceive, (Object) dexOrderDetail.priceAtReceive) && Intrinsics.EZpvd((Object) this.receiveValue, (Object) dexOrderDetail.receiveValue) && Intrinsics.EZpvd((Object) this.chainIndex, (Object) dexOrderDetail.chainIndex) && Intrinsics.EZpvd((Object) this.chainName, (Object) dexOrderDetail.chainName) && Intrinsics.EZpvd((Object) this.chainLogoUrl, (Object) dexOrderDetail.chainLogoUrl) && Intrinsics.EZpvd((Object) this.tokenName, (Object) dexOrderDetail.tokenName) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) dexOrderDetail.tokenAddress) && Intrinsics.EZpvd((Object) this.tradingFee, (Object) dexOrderDetail.tradingFee) && Intrinsics.EZpvd((Object) this.tradingFeeSymbol, (Object) dexOrderDetail.tradingFeeSymbol) && Intrinsics.EZpvd((Object) this.netWorkFee, (Object) dexOrderDetail.netWorkFee) && Intrinsics.EZpvd((Object) this.netWorkFeeSymbol, (Object) dexOrderDetail.netWorkFeeSymbol) && Intrinsics.EZpvd((Object) this.netWorkFeeUsd, (Object) dexOrderDetail.netWorkFeeUsd) && Intrinsics.EZpvd((Object) this.tradingFeeUsd, (Object) dexOrderDetail.tradingFeeUsd) && Intrinsics.EZpvd((Object) this.createTime, (Object) dexOrderDetail.createTime) && Intrinsics.EZpvd((Object) this.uTime, (Object) dexOrderDetail.uTime) && Intrinsics.EZpvd((Object) this.fillTime, (Object) dexOrderDetail.fillTime) && Intrinsics.EZpvd((Object) this.depositWaitTime, (Object) dexOrderDetail.depositWaitTime) && Intrinsics.EZpvd((Object) this.prohibitedRechargeByAsset, (Object) dexOrderDetail.prohibitedRechargeByAsset) && Intrinsics.EZpvd((Object) this.depositId, (Object) dexOrderDetail.depositId) && Intrinsics.EZpvd((Object) this.originFeeRate, (Object) dexOrderDetail.originFeeRate) && Intrinsics.EZpvd((Object) this.discountedFeeRate, (Object) dexOrderDetail.discountedFeeRate) && Intrinsics.EZpvd((Object) this.taxRate, (Object) dexOrderDetail.taxRate) && Intrinsics.EZpvd((Object) this.tax, (Object) dexOrderDetail.tax) && Intrinsics.EZpvd(this.features, dexOrderDetail.features) && Intrinsics.EZpvd((Object) this.fastDepositStatus, (Object) dexOrderDetail.fastDepositStatus) && Intrinsics.EZpvd((Object) this.fastDepositTime, (Object) dexOrderDetail.fastDepositTime) && Intrinsics.EZpvd((Object) this.orderSubType, (Object) dexOrderDetail.orderSubType) && Intrinsics.EZpvd((Object) this.convertToCoinAmount, (Object) dexOrderDetail.convertToCoinAmount) && Intrinsics.EZpvd((Object) this.convertToCoinSymbol, (Object) dexOrderDetail.convertToCoinSymbol) && Intrinsics.EZpvd((Object) this.subState, (Object) dexOrderDetail.subState) && Intrinsics.EZpvd((Object) this.convertFromCoinAmount, (Object) dexOrderDetail.convertFromCoinAmount) && Intrinsics.EZpvd((Object) this.convertFromCoinSymbol, (Object) dexOrderDetail.convertFromCoinSymbol) && Intrinsics.EZpvd((Object) this.isReleased, (Object) dexOrderDetail.isReleased) && Intrinsics.EZpvd((Object) this.walletAddress, (Object) dexOrderDetail.walletAddress) && Intrinsics.EZpvd(this.stopOrderList, dexOrderDetail.stopOrderList) && Intrinsics.EZpvd((Object) this.strategyFailureReason, (Object) dexOrderDetail.strategyFailureReason) && Intrinsics.EZpvd((Object) this.cancelReason, (Object) dexOrderDetail.cancelReason) && Intrinsics.EZpvd((Object) this.strategyOrderType, (Object) dexOrderDetail.strategyOrderType) && Intrinsics.EZpvd((Object) this.triggerMarketCapUsd, (Object) dexOrderDetail.triggerMarketCapUsd) && Intrinsics.EZpvd((Object) this.triggerPriceUsd, (Object) dexOrderDetail.triggerPriceUsd) && Intrinsics.EZpvd((Object) this.triggerValidDays, (Object) dexOrderDetail.triggerValidDays) && Intrinsics.EZpvd((Object) this.expireTimeDays, (Object) dexOrderDetail.expireTimeDays) && Intrinsics.EZpvd((Object) this.expireTimestamp, (Object) dexOrderDetail.expireTimestamp) && Intrinsics.EZpvd((Object) this.orderLimitType, (Object) dexOrderDetail.orderLimitType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCancelReason() {
        return this.cancelReason;
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
    public final String getConvertFromCoinAmount() {
        return this.convertFromCoinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getConvertFromCoinSymbol() {
        return this.convertFromCoinSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getConvertToCoinAmount() {
        return this.convertToCoinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getConvertToCoinSymbol() {
        return this.convertToCoinSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCreateTime() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDepositId() {
        return this.depositId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDepositWaitTime() {
        return this.depositWaitTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDiscountedFeeRate() {
        return this.discountedFeeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpireTimeDays() {
        return this.expireTimeDays;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpireTimestamp() {
        return this.expireTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFastDepositStatus() {
        return this.fastDepositStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFastDepositTime() {
        return this.fastDepositTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexOrderDetailFeatures getFeatures() {
        return this.features;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFillTime() {
        return this.fillTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetWorkFee() {
        return this.netWorkFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetWorkFeeSymbol() {
        return this.netWorkFeeSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetWorkFeeUsd() {
        return this.netWorkFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderLimitType() {
        return this.orderLimitType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderSubType() {
        return this.orderSubType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderType() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOriginFeeRate() {
        return this.originFeeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPayCoinAmount() {
        return this.payCoinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPayCoinSymbol() {
        return this.payCoinSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPayValue() {
        return this.payValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriceAtPay() {
        return this.priceAtPay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriceAtReceive() {
        return this.priceAtReceive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProhibitedRechargeByAsset() {
        return this.prohibitedRechargeByAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReceiveCoinAmount() {
        return this.receiveCoinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReceiveCoinSymbol() {
        return this.receiveCoinSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReceiveValue() {
        return this.receiveValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSide() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getState() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<StopOrderQuoteVO> getStopOrderList() {
        return this.stopOrderList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrategyFailureReason() {
        return this.strategyFailureReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrategyOrderType() {
        return this.strategyOrderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubState() {
        return this.subState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTax() {
        return this.tax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTaxRate() {
        return this.taxRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenName() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradingFee() {
        return this.tradingFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradingFeeSymbol() {
        return this.tradingFeeSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradingFeeUsd() {
        return this.tradingFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerMarketCapUsd() {
        return this.triggerMarketCapUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerPriceUsd() {
        return this.triggerPriceUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerValidDays() {
        return this.triggerValidDays;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUTime() {
        return this.uTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletAddress() {
        return this.walletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.orderId.hashCode();
        int iHashCode2 = this.state.hashCode();
        int iHashCode3 = this.orderType.hashCode();
        int iHashCode4 = this.side.hashCode();
        int iHashCode5 = this.priceAtPay.hashCode();
        int iHashCode6 = this.payCoinAmount.hashCode();
        int iHashCode7 = this.payValue.hashCode();
        int iHashCode8 = this.payCoinSymbol.hashCode();
        int iHashCode9 = this.receiveCoinAmount.hashCode();
        int iHashCode10 = this.receiveCoinSymbol.hashCode();
        int iHashCode11 = this.priceAtReceive.hashCode();
        int iHashCode12 = this.receiveValue.hashCode();
        int iHashCode13 = this.chainIndex.hashCode();
        int iHashCode14 = this.chainName.hashCode();
        int iHashCode15 = this.chainLogoUrl.hashCode();
        int iHashCode16 = this.tokenName.hashCode();
        int iHashCode17 = this.tokenAddress.hashCode();
        int iHashCode18 = this.tradingFee.hashCode();
        int iHashCode19 = this.tradingFeeSymbol.hashCode();
        int iHashCode20 = this.netWorkFee.hashCode();
        int iHashCode21 = this.netWorkFeeSymbol.hashCode();
        int iHashCode22 = this.netWorkFeeUsd.hashCode();
        int iHashCode23 = this.tradingFeeUsd.hashCode();
        int iHashCode24 = this.createTime.hashCode();
        int iHashCode25 = this.uTime.hashCode();
        int iHashCode26 = this.fillTime.hashCode();
        int iHashCode27 = this.depositWaitTime.hashCode();
        int iHashCode28 = this.prohibitedRechargeByAsset.hashCode();
        int iHashCode29 = this.depositId.hashCode();
        int iHashCode30 = this.originFeeRate.hashCode();
        int iHashCode31 = this.discountedFeeRate.hashCode();
        int iHashCode32 = this.taxRate.hashCode();
        int iHashCode33 = this.tax.hashCode();
        DexOrderDetailFeatures dexOrderDetailFeatures = this.features;
        int iHashCode34 = dexOrderDetailFeatures == null ? 0 : dexOrderDetailFeatures.hashCode();
        int iHashCode35 = this.fastDepositStatus.hashCode();
        int iHashCode36 = this.fastDepositTime.hashCode();
        int iHashCode37 = this.orderSubType.hashCode();
        int iHashCode38 = this.convertToCoinAmount.hashCode();
        int iHashCode39 = this.convertToCoinSymbol.hashCode();
        int iHashCode40 = this.subState.hashCode();
        int iHashCode41 = this.convertFromCoinAmount.hashCode();
        int iHashCode42 = this.convertFromCoinSymbol.hashCode();
        String str = this.isReleased;
        int iHashCode43 = str == null ? 0 : str.hashCode();
        String str2 = this.walletAddress;
        int iHashCode44 = str2 == null ? 0 : str2.hashCode();
        List<StopOrderQuoteVO> list = this.stopOrderList;
        int iHashCode45 = list == null ? 0 : list.hashCode();
        int iHashCode46 = this.strategyFailureReason.hashCode();
        int iHashCode47 = this.cancelReason.hashCode();
        int iHashCode48 = this.strategyOrderType.hashCode();
        int iHashCode49 = this.triggerMarketCapUsd.hashCode();
        int iHashCode50 = this.triggerPriceUsd.hashCode();
        int iHashCode51 = this.triggerValidDays.hashCode();
        int iHashCode52 = this.expireTimeDays.hashCode();
        String str3 = this.expireTimestamp;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + iHashCode44) * 31) + iHashCode45) * 31) + iHashCode46) * 31) + iHashCode47) * 31) + iHashCode48) * 31) + iHashCode49) * 31) + iHashCode50) * 31) + iHashCode51) * 31) + iHashCode52) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + this.orderLimitType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isReleased() {
        return this.isReleased;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCancelReason(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cancelReason = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainIndex(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainIndex = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainLogoUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainLogoUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConvertFromCoinAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.convertFromCoinAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConvertFromCoinSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.convertFromCoinSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConvertToCoinAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.convertToCoinAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConvertToCoinSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.convertToCoinSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCreateTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.createTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDepositId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.depositId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDepositWaitTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.depositWaitTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDiscountedFeeRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.discountedFeeRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExpireTimeDays(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.expireTimeDays = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFastDepositStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fastDepositStatus = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFastDepositTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fastDepositTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFeatures(DexOrderDetailFeatures dexOrderDetailFeatures) {
        this.features = dexOrderDetailFeatures;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFillTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fillTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNetWorkFee(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.netWorkFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNetWorkFeeSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.netWorkFeeSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNetWorkFeeUsd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.netWorkFeeUsd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.orderId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderLimitType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.orderLimitType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderSubType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.orderSubType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.orderType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOriginFeeRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.originFeeRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPayCoinAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.payCoinAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPayCoinSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.payCoinSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPayValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.payValue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceAtPay(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.priceAtPay = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceAtReceive(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.priceAtReceive = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProhibitedRechargeByAsset(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.prohibitedRechargeByAsset = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReceiveCoinAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.receiveCoinAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReceiveCoinSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.receiveCoinSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReceiveValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.receiveValue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReleased(String str) {
        this.isReleased = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSide(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.side = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setState(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.state = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStopOrderList(List<StopOrderQuoteVO> list) {
        this.stopOrderList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStrategyFailureReason(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.strategyFailureReason = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStrategyOrderType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.strategyOrderType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubState(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.subState = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tax = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTaxRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.taxRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tokenAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tokenName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradingFee(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tradingFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradingFeeSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tradingFeeSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradingFeeUsd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tradingFeeUsd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerMarketCapUsd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.triggerMarketCapUsd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerPriceUsd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.triggerPriceUsd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerValidDays(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.triggerValidDays = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.uTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWalletAddress(String str) {
        this.walletAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexOrderDetail(orderId=" + this.orderId + ", state=" + this.state + ", orderType=" + this.orderType + ", side=" + this.side + ", priceAtPay=" + this.priceAtPay + ", payCoinAmount=" + this.payCoinAmount + ", payValue=" + this.payValue + ", payCoinSymbol=" + this.payCoinSymbol + ", receiveCoinAmount=" + this.receiveCoinAmount + ", receiveCoinSymbol=" + this.receiveCoinSymbol + ", priceAtReceive=" + this.priceAtReceive + ", receiveValue=" + this.receiveValue + ", chainIndex=" + this.chainIndex + ", chainName=" + this.chainName + ", chainLogoUrl=" + this.chainLogoUrl + ", tokenName=" + this.tokenName + ", tokenAddress=" + this.tokenAddress + ", tradingFee=" + this.tradingFee + ", tradingFeeSymbol=" + this.tradingFeeSymbol + ", netWorkFee=" + this.netWorkFee + ", netWorkFeeSymbol=" + this.netWorkFeeSymbol + ", netWorkFeeUsd=" + this.netWorkFeeUsd + ", tradingFeeUsd=" + this.tradingFeeUsd + ", createTime=" + this.createTime + ", uTime=" + this.uTime + ", fillTime=" + this.fillTime + ", depositWaitTime=" + this.depositWaitTime + ", prohibitedRechargeByAsset=" + this.prohibitedRechargeByAsset + ", depositId=" + this.depositId + ", originFeeRate=" + this.originFeeRate + ", discountedFeeRate=" + this.discountedFeeRate + ", taxRate=" + this.taxRate + ", tax=" + this.tax + ", features=" + this.features + ", fastDepositStatus=" + this.fastDepositStatus + ", fastDepositTime=" + this.fastDepositTime + ", orderSubType=" + this.orderSubType + ", convertToCoinAmount=" + this.convertToCoinAmount + ", convertToCoinSymbol=" + this.convertToCoinSymbol + ", subState=" + this.subState + ", convertFromCoinAmount=" + this.convertFromCoinAmount + ", convertFromCoinSymbol=" + this.convertFromCoinSymbol + ", isReleased=" + this.isReleased + ", walletAddress=" + this.walletAddress + ", stopOrderList=" + this.stopOrderList + ", strategyFailureReason=" + this.strategyFailureReason + ", cancelReason=" + this.cancelReason + ", strategyOrderType=" + this.strategyOrderType + ", triggerMarketCapUsd=" + this.triggerMarketCapUsd + ", triggerPriceUsd=" + this.triggerPriceUsd + ", triggerValidDays=" + this.triggerValidDays + ", expireTimeDays=" + this.expireTimeDays + ", expireTimestamp=" + this.expireTimestamp + ", orderLimitType=" + this.orderLimitType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.orderId);
        parcel.writeString(this.state);
        parcel.writeString(this.orderType);
        parcel.writeString(this.side);
        parcel.writeString(this.priceAtPay);
        parcel.writeString(this.payCoinAmount);
        parcel.writeString(this.payValue);
        parcel.writeString(this.payCoinSymbol);
        parcel.writeString(this.receiveCoinAmount);
        parcel.writeString(this.receiveCoinSymbol);
        parcel.writeString(this.priceAtReceive);
        parcel.writeString(this.receiveValue);
        parcel.writeString(this.chainIndex);
        parcel.writeString(this.chainName);
        parcel.writeString(this.chainLogoUrl);
        parcel.writeString(this.tokenName);
        parcel.writeString(this.tokenAddress);
        parcel.writeString(this.tradingFee);
        parcel.writeString(this.tradingFeeSymbol);
        parcel.writeString(this.netWorkFee);
        parcel.writeString(this.netWorkFeeSymbol);
        parcel.writeString(this.netWorkFeeUsd);
        parcel.writeString(this.tradingFeeUsd);
        parcel.writeString(this.createTime);
        parcel.writeString(this.uTime);
        parcel.writeString(this.fillTime);
        parcel.writeString(this.depositWaitTime);
        parcel.writeString(this.prohibitedRechargeByAsset);
        parcel.writeString(this.depositId);
        parcel.writeString(this.originFeeRate);
        parcel.writeString(this.discountedFeeRate);
        parcel.writeString(this.taxRate);
        parcel.writeString(this.tax);
        DexOrderDetailFeatures dexOrderDetailFeatures = this.features;
        if (dexOrderDetailFeatures == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dexOrderDetailFeatures.writeToParcel(parcel, i);
        }
        parcel.writeString(this.fastDepositStatus);
        parcel.writeString(this.fastDepositTime);
        parcel.writeString(this.orderSubType);
        parcel.writeString(this.convertToCoinAmount);
        parcel.writeString(this.convertToCoinSymbol);
        parcel.writeString(this.subState);
        parcel.writeString(this.convertFromCoinAmount);
        parcel.writeString(this.convertFromCoinSymbol);
        parcel.writeString(this.isReleased);
        parcel.writeString(this.walletAddress);
        List<StopOrderQuoteVO> list = this.stopOrderList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<StopOrderQuoteVO> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.strategyFailureReason);
        parcel.writeString(this.cancelReason);
        parcel.writeString(this.strategyOrderType);
        parcel.writeString(this.triggerMarketCapUsd);
        parcel.writeString(this.triggerPriceUsd);
        parcel.writeString(this.triggerValidDays);
        parcel.writeString(this.expireTimeDays);
        parcel.writeString(this.expireTimestamp);
        parcel.writeString(this.orderLimitType);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.DexOrderDetail.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DexOrderDetail> serializer() {
            return DexOrderDetail$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DexOrderDetail(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, DexOrderDetailFeatures dexOrderDetailFeatures, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, List list, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.orderId = "";
        } else {
            this.orderId = str;
        }
        if ((i & 2) == 0) {
            this.state = "";
        } else {
            this.state = str2;
        }
        if ((i & 4) == 0) {
            this.orderType = "";
        } else {
            this.orderType = str3;
        }
        if ((i & 8) == 0) {
            this.side = "";
        } else {
            this.side = str4;
        }
        if ((i & 16) == 0) {
            this.priceAtPay = "";
        } else {
            this.priceAtPay = str5;
        }
        if ((i & 32) == 0) {
            this.payCoinAmount = "";
        } else {
            this.payCoinAmount = str6;
        }
        if ((i & 64) == 0) {
            this.payValue = "";
        } else {
            this.payValue = str7;
        }
        if ((i & 128) == 0) {
            this.payCoinSymbol = "";
        } else {
            this.payCoinSymbol = str8;
        }
        if ((i & 256) == 0) {
            this.receiveCoinAmount = "";
        } else {
            this.receiveCoinAmount = str9;
        }
        if ((i & 512) == 0) {
            this.receiveCoinSymbol = "";
        } else {
            this.receiveCoinSymbol = str10;
        }
        if ((i & 1024) == 0) {
            this.priceAtReceive = "";
        } else {
            this.priceAtReceive = str11;
        }
        if ((i & 2048) == 0) {
            this.receiveValue = "";
        } else {
            this.receiveValue = str12;
        }
        if ((i & 4096) == 0) {
            this.chainIndex = "";
        } else {
            this.chainIndex = str13;
        }
        if ((i & 8192) == 0) {
            this.chainName = "";
        } else {
            this.chainName = str14;
        }
        if ((i & 16384) == 0) {
            this.chainLogoUrl = "";
        } else {
            this.chainLogoUrl = str15;
        }
        if ((i & 32768) == 0) {
            this.tokenName = "";
        } else {
            this.tokenName = str16;
        }
        if ((i & 65536) == 0) {
            this.tokenAddress = "";
        } else {
            this.tokenAddress = str17;
        }
        if ((i & 131072) == 0) {
            this.tradingFee = "";
        } else {
            this.tradingFee = str18;
        }
        if ((i & 262144) == 0) {
            this.tradingFeeSymbol = "";
        } else {
            this.tradingFeeSymbol = str19;
        }
        if ((i & 524288) == 0) {
            this.netWorkFee = "";
        } else {
            this.netWorkFee = str20;
        }
        if ((1048576 & i) == 0) {
            this.netWorkFeeSymbol = "";
        } else {
            this.netWorkFeeSymbol = str21;
        }
        if ((2097152 & i) == 0) {
            this.netWorkFeeUsd = "";
        } else {
            this.netWorkFeeUsd = str22;
        }
        if ((4194304 & i) == 0) {
            this.tradingFeeUsd = "";
        } else {
            this.tradingFeeUsd = str23;
        }
        if ((8388608 & i) == 0) {
            this.createTime = "";
        } else {
            this.createTime = str24;
        }
        if ((16777216 & i) == 0) {
            this.uTime = "";
        } else {
            this.uTime = str25;
        }
        if ((33554432 & i) == 0) {
            this.fillTime = "";
        } else {
            this.fillTime = str26;
        }
        if ((67108864 & i) == 0) {
            this.depositWaitTime = "";
        } else {
            this.depositWaitTime = str27;
        }
        if ((134217728 & i) == 0) {
            this.prohibitedRechargeByAsset = "";
        } else {
            this.prohibitedRechargeByAsset = str28;
        }
        if ((268435456 & i) == 0) {
            this.depositId = "";
        } else {
            this.depositId = str29;
        }
        if ((536870912 & i) == 0) {
            this.originFeeRate = "";
        } else {
            this.originFeeRate = str30;
        }
        if ((1073741824 & i) == 0) {
            this.discountedFeeRate = "";
        } else {
            this.discountedFeeRate = str31;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.taxRate = "";
        } else {
            this.taxRate = str32;
        }
        if ((i2 & 1) == 0) {
            this.tax = "";
        } else {
            this.tax = str33;
        }
        if ((i2 & 2) == 0) {
            this.features = null;
        } else {
            this.features = dexOrderDetailFeatures;
        }
        if ((i2 & 4) == 0) {
            this.fastDepositStatus = "";
        } else {
            this.fastDepositStatus = str34;
        }
        if ((i2 & 8) == 0) {
            this.fastDepositTime = "";
        } else {
            this.fastDepositTime = str35;
        }
        if ((i2 & 16) == 0) {
            this.orderSubType = "";
        } else {
            this.orderSubType = str36;
        }
        if ((i2 & 32) == 0) {
            this.convertToCoinAmount = "";
        } else {
            this.convertToCoinAmount = str37;
        }
        if ((i2 & 64) == 0) {
            this.convertToCoinSymbol = "";
        } else {
            this.convertToCoinSymbol = str38;
        }
        if ((i2 & 128) == 0) {
            this.subState = "";
        } else {
            this.subState = str39;
        }
        if ((i2 & 256) == 0) {
            this.convertFromCoinAmount = "";
        } else {
            this.convertFromCoinAmount = str40;
        }
        if ((i2 & 512) == 0) {
            this.convertFromCoinSymbol = "";
        } else {
            this.convertFromCoinSymbol = str41;
        }
        if ((i2 & 1024) == 0) {
            this.isReleased = null;
        } else {
            this.isReleased = str42;
        }
        if ((i2 & 2048) == 0) {
            this.walletAddress = null;
        } else {
            this.walletAddress = str43;
        }
        if ((i2 & 4096) == 0) {
            this.stopOrderList = null;
        } else {
            this.stopOrderList = list;
        }
        if ((i2 & 8192) == 0) {
            this.strategyFailureReason = "";
        } else {
            this.strategyFailureReason = str44;
        }
        if ((i2 & 16384) == 0) {
            this.cancelReason = "";
        } else {
            this.cancelReason = str45;
        }
        if ((i2 & 32768) == 0) {
            this.strategyOrderType = "";
        } else {
            this.strategyOrderType = str46;
        }
        if ((i2 & 65536) == 0) {
            this.triggerMarketCapUsd = "";
        } else {
            this.triggerMarketCapUsd = str47;
        }
        if ((i2 & 131072) == 0) {
            this.triggerPriceUsd = "";
        } else {
            this.triggerPriceUsd = str48;
        }
        if ((i2 & 262144) == 0) {
            this.triggerValidDays = "";
        } else {
            this.triggerValidDays = str49;
        }
        if ((i2 & 524288) == 0) {
            this.expireTimeDays = "";
        } else {
            this.expireTimeDays = str50;
        }
        if ((1048576 & i2) == 0) {
            this.expireTimestamp = null;
        } else {
            this.expireTimestamp = str51;
        }
        if ((2097152 & i2) == 0) {
            this.orderLimitType = "";
        } else {
            this.orderLimitType = str52;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(DexOrderDetail dexOrderDetail, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) dexOrderDetail.orderId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, dexOrderDetail.orderId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) dexOrderDetail.state, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, dexOrderDetail.state);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) dexOrderDetail.orderType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, dexOrderDetail.orderType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) dexOrderDetail.side, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, dexOrderDetail.side);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) dexOrderDetail.priceAtPay, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, dexOrderDetail.priceAtPay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) dexOrderDetail.payCoinAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, dexOrderDetail.payCoinAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) dexOrderDetail.payValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, dexOrderDetail.payValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) dexOrderDetail.payCoinSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, dexOrderDetail.payCoinSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) dexOrderDetail.receiveCoinAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, dexOrderDetail.receiveCoinAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) dexOrderDetail.receiveCoinSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, dexOrderDetail.receiveCoinSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) dexOrderDetail.priceAtReceive, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, dexOrderDetail.priceAtReceive);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) dexOrderDetail.receiveValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, dexOrderDetail.receiveValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) dexOrderDetail.chainIndex, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, dexOrderDetail.chainIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) dexOrderDetail.chainName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, dexOrderDetail.chainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) dexOrderDetail.chainLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, dexOrderDetail.chainLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) dexOrderDetail.tokenName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, dexOrderDetail.tokenName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) dexOrderDetail.tokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, dexOrderDetail.tokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) dexOrderDetail.tradingFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, dexOrderDetail.tradingFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) dexOrderDetail.tradingFeeSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, dexOrderDetail.tradingFeeSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) dexOrderDetail.netWorkFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, dexOrderDetail.netWorkFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) dexOrderDetail.netWorkFeeSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, dexOrderDetail.netWorkFeeSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) dexOrderDetail.netWorkFeeUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, dexOrderDetail.netWorkFeeUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) dexOrderDetail.tradingFeeUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, dexOrderDetail.tradingFeeUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) dexOrderDetail.createTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, dexOrderDetail.createTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) dexOrderDetail.uTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, dexOrderDetail.uTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) dexOrderDetail.fillTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, dexOrderDetail.fillTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) dexOrderDetail.depositWaitTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, dexOrderDetail.depositWaitTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) dexOrderDetail.prohibitedRechargeByAsset, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, dexOrderDetail.prohibitedRechargeByAsset);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) dexOrderDetail.depositId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, dexOrderDetail.depositId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd((Object) dexOrderDetail.originFeeRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 29, dexOrderDetail.originFeeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) dexOrderDetail.discountedFeeRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 30, dexOrderDetail.discountedFeeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || !Intrinsics.EZpvd((Object) dexOrderDetail.taxRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 31, dexOrderDetail.taxRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd((Object) dexOrderDetail.tax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 32, dexOrderDetail.tax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || dexOrderDetail.features != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 33, DexOrderDetailFeatures$$serializer.INSTANCE, dexOrderDetail.features);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || !Intrinsics.EZpvd((Object) dexOrderDetail.fastDepositStatus, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 34, dexOrderDetail.fastDepositStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || !Intrinsics.EZpvd((Object) dexOrderDetail.fastDepositTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 35, dexOrderDetail.fastDepositTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || !Intrinsics.EZpvd((Object) dexOrderDetail.orderSubType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 36, dexOrderDetail.orderSubType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || !Intrinsics.EZpvd((Object) dexOrderDetail.convertToCoinAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 37, dexOrderDetail.convertToCoinAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || !Intrinsics.EZpvd((Object) dexOrderDetail.convertToCoinSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 38, dexOrderDetail.convertToCoinSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || !Intrinsics.EZpvd((Object) dexOrderDetail.subState, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 39, dexOrderDetail.subState);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || !Intrinsics.EZpvd((Object) dexOrderDetail.convertFromCoinAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 40, dexOrderDetail.convertFromCoinAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) || !Intrinsics.EZpvd((Object) dexOrderDetail.convertFromCoinSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 41, dexOrderDetail.convertFromCoinSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 42) || dexOrderDetail.isReleased != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 42, StringSerializer.INSTANCE, dexOrderDetail.isReleased);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 43) || dexOrderDetail.walletAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 43, StringSerializer.INSTANCE, dexOrderDetail.walletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 44) || dexOrderDetail.stopOrderList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 44, kSerializerArr[44], dexOrderDetail.stopOrderList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 45) || !Intrinsics.EZpvd((Object) dexOrderDetail.strategyFailureReason, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 45, dexOrderDetail.strategyFailureReason);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 46) || !Intrinsics.EZpvd((Object) dexOrderDetail.cancelReason, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 46, dexOrderDetail.cancelReason);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 47) || !Intrinsics.EZpvd((Object) dexOrderDetail.strategyOrderType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 47, dexOrderDetail.strategyOrderType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 48) || !Intrinsics.EZpvd((Object) dexOrderDetail.triggerMarketCapUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 48, dexOrderDetail.triggerMarketCapUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 49) || !Intrinsics.EZpvd((Object) dexOrderDetail.triggerPriceUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 49, dexOrderDetail.triggerPriceUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 50) || !Intrinsics.EZpvd((Object) dexOrderDetail.triggerValidDays, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 50, dexOrderDetail.triggerValidDays);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 51) || !Intrinsics.EZpvd((Object) dexOrderDetail.expireTimeDays, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 51, dexOrderDetail.expireTimeDays);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 52) || dexOrderDetail.expireTimestamp != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 52, StringSerializer.INSTANCE, dexOrderDetail.expireTimestamp);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 53) && Intrinsics.EZpvd((Object) dexOrderDetail.orderLimitType, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 53, dexOrderDetail.orderLimitType);
    }

    public DexOrderDetail(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull String str33, DexOrderDetailFeatures dexOrderDetailFeatures, @NotNull String str34, @NotNull String str35, @NotNull String str36, @NotNull String str37, @NotNull String str38, @NotNull String str39, @NotNull String str40, @NotNull String str41, String str42, String str43, List<StopOrderQuoteVO> list, @NotNull String str44, @NotNull String str45, @NotNull String str46, @NotNull String str47, @NotNull String str48, @NotNull String str49, @NotNull String str50, String str51, @NotNull String str52) {
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
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(str30, "");
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(str32, "");
        Intrinsics.checkNotNullParameter(str33, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(str35, "");
        Intrinsics.checkNotNullParameter(str36, "");
        Intrinsics.checkNotNullParameter(str37, "");
        Intrinsics.checkNotNullParameter(str38, "");
        Intrinsics.checkNotNullParameter(str39, "");
        Intrinsics.checkNotNullParameter(str40, "");
        Intrinsics.checkNotNullParameter(str41, "");
        Intrinsics.checkNotNullParameter(str44, "");
        Intrinsics.checkNotNullParameter(str45, "");
        Intrinsics.checkNotNullParameter(str46, "");
        Intrinsics.checkNotNullParameter(str47, "");
        Intrinsics.checkNotNullParameter(str48, "");
        Intrinsics.checkNotNullParameter(str49, "");
        Intrinsics.checkNotNullParameter(str50, "");
        Intrinsics.checkNotNullParameter(str52, "");
        this.orderId = str;
        this.state = str2;
        this.orderType = str3;
        this.side = str4;
        this.priceAtPay = str5;
        this.payCoinAmount = str6;
        this.payValue = str7;
        this.payCoinSymbol = str8;
        this.receiveCoinAmount = str9;
        this.receiveCoinSymbol = str10;
        this.priceAtReceive = str11;
        this.receiveValue = str12;
        this.chainIndex = str13;
        this.chainName = str14;
        this.chainLogoUrl = str15;
        this.tokenName = str16;
        this.tokenAddress = str17;
        this.tradingFee = str18;
        this.tradingFeeSymbol = str19;
        this.netWorkFee = str20;
        this.netWorkFeeSymbol = str21;
        this.netWorkFeeUsd = str22;
        this.tradingFeeUsd = str23;
        this.createTime = str24;
        this.uTime = str25;
        this.fillTime = str26;
        this.depositWaitTime = str27;
        this.prohibitedRechargeByAsset = str28;
        this.depositId = str29;
        this.originFeeRate = str30;
        this.discountedFeeRate = str31;
        this.taxRate = str32;
        this.tax = str33;
        this.features = dexOrderDetailFeatures;
        this.fastDepositStatus = str34;
        this.fastDepositTime = str35;
        this.orderSubType = str36;
        this.convertToCoinAmount = str37;
        this.convertToCoinSymbol = str38;
        this.subState = str39;
        this.convertFromCoinAmount = str40;
        this.convertFromCoinSymbol = str41;
        this.isReleased = str42;
        this.walletAddress = str43;
        this.stopOrderList = list;
        this.strategyFailureReason = str44;
        this.cancelReason = str45;
        this.strategyOrderType = str46;
        this.triggerMarketCapUsd = str47;
        this.triggerPriceUsd = str48;
        this.triggerValidDays = str49;
        this.expireTimeDays = str50;
        this.expireTimestamp = str51;
        this.orderLimitType = str52;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0288: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0004: ARITH (r109v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r109v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r109v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r109v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r109v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r109v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r109v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r61v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r109v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r62v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0046: ARITH (r109v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r63v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004e: ARITH (r109v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r64v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0056: ARITH (r109v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r65v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005e: ARITH (r109v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r66v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0066: ARITH (r109v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r67v0 java.lang.String))
  (wrap:java.lang.String:0x0079: TERNARY null = ((wrap:int:0x0070: ARITH (r109v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r68v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007b: ARITH (r109v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r69v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0087: ARITH (r109v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r70v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0092: ARITH (r109v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r71v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009d: ARITH (r109v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r72v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a8: ARITH (r109v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r73v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b3: ARITH (r109v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r74v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00be: ARITH (r109v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r75v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c9: ARITH (r109v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r76v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d4: ARITH (r109v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r77v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00df: ARITH (r109v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r78v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ea: ARITH (r109v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r79v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f5: ARITH (r109v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r80v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0100: ARITH (r109v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r81v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x010b: ARITH (r109v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r82v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0116: ARITH (r109v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r83v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0121: ARITH (r109v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? ("") : (r84v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x012c: ARITH (r109v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? ("") : (r85v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0137: ARITH (r109v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? ("") : (r86v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0140: ARITH (r110v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r87v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.subscribe.DexOrderDetailFeatures:?: TERNARY null = ((wrap:int:0x0149: ARITH (r110v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.subscribe.DexOrderDetailFeatures) : (r88v0 com.okinc.unify_trade.biz.subscribe.DexOrderDetailFeatures))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0154: ARITH (r110v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r89v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x015d: ARITH (r110v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r90v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0166: ARITH (r110v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r91v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x016f: ARITH (r110v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r92v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0178: ARITH (r110v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r93v0 java.lang.String))
  (wrap:java.lang.String:0x018c: TERNARY null = ((wrap:int:0x0183: ARITH (r110v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r94v0 java.lang.String))
  (wrap:java.lang.String:0x0197: TERNARY null = ((wrap:int:0x018e: ARITH (r110v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r95v0 java.lang.String))
  (wrap:java.lang.String:0x01a2: TERNARY null = ((wrap:int:0x0199: ARITH (r110v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r96v0 java.lang.String))
  (wrap:java.lang.String:0x01ad: TERNARY null = ((wrap:int:0x01a4: ARITH (r110v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r97v0 java.lang.String))
  (wrap:java.lang.String:0x01b8: TERNARY null = ((wrap:int:0x01af: ARITH (r110v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r98v0 java.lang.String))
  (wrap:java.util.List:0x01c3: TERNARY null = ((wrap:int:0x01ba: ARITH (r110v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r99v0 java.util.List))
  (wrap:java.lang.String:0x01ce: TERNARY null = ((wrap:int:0x01c5: ARITH (r110v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r100v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01d0: ARITH (r110v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r101v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01d9: ARITH (r110v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r102v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01e2: ARITH (r110v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r103v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01eb: ARITH (r110v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r104v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01f4: ARITH (r110v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r105v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01fd: ARITH (r110v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r106v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0208: ARITH (r110v0 int) & (1048576 int) A[WRAPPED]) == (0 int)) ? (r107v0 java.lang.String) : (null java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0211: ARITH (r110v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r108v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.subscribe.DexOrderDetailFeatures, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.dex.StopOrderQuoteVO>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:14) call: com.okinc.unify_trade.biz.subscribe.DexOrderDetail.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.subscribe.DexOrderDetailFeatures, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DexOrderDetail(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, DexOrderDetailFeatures dexOrderDetailFeatures, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, List list, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17, (i & 131072) != 0 ? "" : str18, (i & 262144) != 0 ? "" : str19, (i & 524288) != 0 ? "" : str20, (i & 1048576) != 0 ? "" : str21, (i & 2097152) != 0 ? "" : str22, (i & 4194304) != 0 ? "" : str23, (i & 8388608) != 0 ? "" : str24, (i & 16777216) != 0 ? "" : str25, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str26, (i & 67108864) != 0 ? "" : str27, (i & 134217728) != 0 ? "" : str28, (i & 268435456) != 0 ? "" : str29, (i & 536870912) != 0 ? "" : str30, (i & 1073741824) != 0 ? "" : str31, (i & Integer.MIN_VALUE) != 0 ? "" : str32, (i2 & 1) != 0 ? "" : str33, (i2 & 2) != 0 ? null : dexOrderDetailFeatures, (i2 & 4) != 0 ? "" : str34, (i2 & 8) != 0 ? "" : str35, (i2 & 16) != 0 ? "" : str36, (i2 & 32) != 0 ? "" : str37, (i2 & 64) != 0 ? "" : str38, (i2 & 128) != 0 ? "" : str39, (i2 & 256) != 0 ? "" : str40, (i2 & 512) != 0 ? "" : str41, (i2 & 1024) != 0 ? null : str42, (i2 & 2048) != 0 ? null : str43, (i2 & 4096) != 0 ? null : list, (i2 & 8192) != 0 ? "" : str44, (i2 & 16384) != 0 ? "" : str45, (i2 & 32768) != 0 ? "" : str46, (i2 & 65536) != 0 ? "" : str47, (i2 & 131072) != 0 ? "" : str48, (i2 & 262144) != 0 ? "" : str49, (i2 & 524288) != 0 ? "" : str50, (i2 & 1048576) == 0 ? str51 : null, (i2 & 2097152) != 0 ? "" : str52);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        private final String stateName;
        public static final State PENDING = new State(CardSyncResponse.PENDING, 0, "pending");
        public static final State FILLED = new State("FILLED", 1, "filled");
        public static final State FAILED = new State(CardSyncResponse.FAILED, 2, EopTrackEvent.KEY_RESULT_FAILED);
        public static final State CANCELED = new State("CANCELED", 3, "canceled");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ State[] $values() {
            return new State[]{PENDING, FILLED, FAILED, CANCELED};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<State> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getStateName() {
            return this.stateName;
        }

        private State(String str, int i, String str2) {
            this.stateName = str2;
        }

        static {
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(stateArr$values);
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class SubState {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ SubState[] $VALUES;
        private final String stateName;
        public static final SubState CONVERT_SUCCESS = new SubState("CONVERT_SUCCESS", 0, "convertSuccess");
        public static final SubState CONVERT_FAILED = new SubState("CONVERT_FAILED", 1, "convertFail");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ SubState[] $values() {
            return new SubState[]{CONVERT_SUCCESS, CONVERT_FAILED};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<SubState> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getStateName() {
            return this.stateName;
        }

        private SubState(String str, int i, String str2) {
            this.stateName = str2;
        }

        static {
            SubState[] subStateArr$values = $values();
            $VALUES = subStateArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(subStateArr$values);
        }

        public static SubState valueOf(String str) {
            return (SubState) Enum.valueOf(SubState.class, str);
        }

        public static SubState[] values() {
            return (SubState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class SubType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ SubType[] $VALUES;
        public static final SubType CONVERT = new SubType("CONVERT", 0, "convert");
        private final String type;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ SubType[] $values() {
            return new SubType[]{CONVERT};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<SubType> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getType() {
            return this.type;
        }

        private SubType(String str, int i, String str2) {
            this.type = str2;
        }

        static {
            SubType[] subTypeArr$values = $values();
            $VALUES = subTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(subTypeArr$values);
        }

        public static SubType valueOf(String str) {
            return (SubType) Enum.valueOf(SubType.class, str);
        }

        public static SubType[] values() {
            return (SubType[]) $VALUES.clone();
        }
    }
}
