package com.okinc.business.dexlogic.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C22034hVl;
import o.C22420hey;
import o.C22689hkB;
import o.C22822hmc;
import o.C23313hvq;
import o.C33129mqd;
import o.hVR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class DexMultiChildOrderInfoVo implements Parcelable {
    private String bridgeEstimatedTime;
    private final DexBridgeOrderInfoVo bridgeOrderInfoVo;
    private final String childOrderId;
    private String dataType;
    private DexBridgeShadowTokenPairInfoVo dexBridgeShadowTokenPairInfoVo;
    private String errorCode;
    private String exploreUrl;
    private String extendStatus;
    private boolean finalOrder;
    private boolean firstOrder;
    private String fromAmountIn;
    private final String fromChainId;
    private final String fromChainLogoUrl;
    private final String fromChainName;
    private String fromEstimatedTime;
    private final String fromTokenIcon;
    private String fromTokenSymbol;
    private DexGasStationActivity gasStationActivityReward;
    private final String guideUrl;
    private String hiddenFromOrder;
    private boolean isDiscountGasStation;
    private boolean isPayOrder;
    private boolean isShowCancel;
    private boolean isShowSpeedUp;
    private boolean isShowSpeedUpCancel;
    private String lastChildOrderChainName;
    private String lastChildOrderToTokenSymbol;
    private boolean localBridgeTag;
    private boolean localBridgeToTag;
    private boolean localFromChildTag;
    private String mainEstimatedTime;
    private String mainFromAddress;
    private RelativeTransactionVO mainRelativeTransaction;
    private String mainSpecialOrderType;
    private String mainStatus;
    private String mark;
    private final String officialBridgeTime;
    private String orderFailReason;
    private final String orderIndex;
    private String originBridgeEstimatedTime;
    private String originFromEstimatedTime;
    private String originalTokenSymbol;
    private String refundAmount;
    private String refundAmountShow;
    private String refundChain;
    private String refundSymbol;
    private boolean showArrow;
    private String status;
    private String swapTradeType;
    private String toAmountOut;
    private final String toChainId;
    private final String toChainLogoUrl;
    private final String toChainName;
    private String toTokenIcon;
    private String toTokenSymbol;
    private String toastGuideUrl;
    private String toastType;
    private String transactionHash;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DexMultiChildOrderInfoVo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DexMultiChildOrderInfoVo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexMultiChildOrderInfoVo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DexMultiChildOrderInfoVo(parcel.readInt() == 0 ? null : DexBridgeOrderInfoVo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DexBridgeShadowTokenPairInfoVo.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, DexGasStationActivity.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : RelativeTransactionVO.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexMultiChildOrderInfoVo[] newArray(int i) {
            return new DexMultiChildOrderInfoVo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DexMultiChildOrderInfoVo() {
        this((DexBridgeOrderInfoVo) null, (DexBridgeShadowTokenPairInfoVo) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, false, false, false, false, false, false, (DexGasStationActivity) null, (String) null, false, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (RelativeTransactionVO) null, (String) null, -1, 67108863, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final String getCoinMark() {
        return (this.firstOrder || this.finalOrder) ? this.mark : "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexBridgeOrderInfoVo component1() {
        return this.bridgeOrderInfoVo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.toastGuideUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.orderIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.toAmountOut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.toTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.toastType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.transactionHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.mark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.fromTokenIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.toTokenIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexBridgeShadowTokenPairInfoVo component2() {
        return this.dexBridgeShadowTokenPairInfoVo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.toChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.toChainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.toChainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component23() {
        return this.showArrow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.swapTradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.mainStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.orderFailReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.originalTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.lastChildOrderToTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.lastChildOrderChainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.childOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.hiddenFromOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.refundAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.refundAmountShow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component33() {
        return this.isPayOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component34() {
        return this.extendStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component35() {
        return this.isShowSpeedUp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component36() {
        return this.isShowCancel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component37() {
        return this.isShowSpeedUpCancel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component38() {
        return this.isDiscountGasStation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component39() {
        return this.firstOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.exploreUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component40() {
        return this.finalOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexGasStationActivity component41() {
        return this.gasStationActivityReward;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component42() {
        return this.officialBridgeTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component43() {
        return this.localFromChildTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component44() {
        return this.localBridgeTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component45() {
        return this.localBridgeToTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component46() {
        return this.mainEstimatedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component47() {
        return this.fromEstimatedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component48() {
        return this.bridgeEstimatedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component49() {
        return this.originFromEstimatedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.fromAmountIn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component50() {
        return this.originBridgeEstimatedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component51() {
        return this.errorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component52() {
        return this.refundSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component53() {
        return this.refundChain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component54() {
        return this.dataType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component55() {
        return this.mainFromAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component56() {
        return this.mainSpecialOrderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RelativeTransactionVO component57() {
        return this.mainRelativeTransaction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component58() {
        return this.guideUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.fromChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.fromChainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.fromChainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.fromTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiChildOrderInfoVo copy(DexBridgeOrderInfoVo dexBridgeOrderInfoVo, DexBridgeShadowTokenPairInfoVo dexBridgeShadowTokenPairInfoVo, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, boolean z, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, boolean z2, @NotNull String str30, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, @NotNull DexGasStationActivity dexGasStationActivity, @NotNull String str31, boolean z9, boolean z10, boolean z11, @NotNull String str32, @NotNull String str33, @NotNull String str34, @NotNull String str35, @NotNull String str36, @NotNull String str37, @NotNull String str38, @NotNull String str39, @NotNull String str40, @NotNull String str41, @NotNull String str42, RelativeTransactionVO relativeTransactionVO, @NotNull String str43) {
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
        Intrinsics.checkNotNullParameter(dexGasStationActivity, "");
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
        Intrinsics.checkNotNullParameter(str42, "");
        Intrinsics.checkNotNullParameter(str43, "");
        return new DexMultiChildOrderInfoVo(dexBridgeOrderInfoVo, dexBridgeShadowTokenPairInfoVo, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, z, str21, str22, str23, str24, str25, str26, str27, str28, str29, z2, str30, z3, z4, z5, z6, z7, z8, dexGasStationActivity, str31, z9, z10, z11, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, relativeTransactionVO, str43);
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
        if (!(obj instanceof DexMultiChildOrderInfoVo)) {
            return false;
        }
        DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo = (DexMultiChildOrderInfoVo) obj;
        return Intrinsics.EZpvd(this.bridgeOrderInfoVo, dexMultiChildOrderInfoVo.bridgeOrderInfoVo) && Intrinsics.EZpvd(this.dexBridgeShadowTokenPairInfoVo, dexMultiChildOrderInfoVo.dexBridgeShadowTokenPairInfoVo) && Intrinsics.EZpvd((Object) this.childOrderId, (Object) dexMultiChildOrderInfoVo.childOrderId) && Intrinsics.EZpvd((Object) this.exploreUrl, (Object) dexMultiChildOrderInfoVo.exploreUrl) && Intrinsics.EZpvd((Object) this.fromAmountIn, (Object) dexMultiChildOrderInfoVo.fromAmountIn) && Intrinsics.EZpvd((Object) this.fromChainId, (Object) dexMultiChildOrderInfoVo.fromChainId) && Intrinsics.EZpvd((Object) this.fromChainLogoUrl, (Object) dexMultiChildOrderInfoVo.fromChainLogoUrl) && Intrinsics.EZpvd((Object) this.fromChainName, (Object) dexMultiChildOrderInfoVo.fromChainName) && Intrinsics.EZpvd((Object) this.fromTokenSymbol, (Object) dexMultiChildOrderInfoVo.fromTokenSymbol) && Intrinsics.EZpvd((Object) this.toastGuideUrl, (Object) dexMultiChildOrderInfoVo.toastGuideUrl) && Intrinsics.EZpvd((Object) this.orderIndex, (Object) dexMultiChildOrderInfoVo.orderIndex) && Intrinsics.EZpvd((Object) this.status, (Object) dexMultiChildOrderInfoVo.status) && Intrinsics.EZpvd((Object) this.toAmountOut, (Object) dexMultiChildOrderInfoVo.toAmountOut) && Intrinsics.EZpvd((Object) this.toTokenSymbol, (Object) dexMultiChildOrderInfoVo.toTokenSymbol) && Intrinsics.EZpvd((Object) this.toastType, (Object) dexMultiChildOrderInfoVo.toastType) && Intrinsics.EZpvd((Object) this.transactionHash, (Object) dexMultiChildOrderInfoVo.transactionHash) && Intrinsics.EZpvd((Object) this.mark, (Object) dexMultiChildOrderInfoVo.mark) && Intrinsics.EZpvd((Object) this.fromTokenIcon, (Object) dexMultiChildOrderInfoVo.fromTokenIcon) && Intrinsics.EZpvd((Object) this.toTokenIcon, (Object) dexMultiChildOrderInfoVo.toTokenIcon) && Intrinsics.EZpvd((Object) this.toChainId, (Object) dexMultiChildOrderInfoVo.toChainId) && Intrinsics.EZpvd((Object) this.toChainName, (Object) dexMultiChildOrderInfoVo.toChainName) && Intrinsics.EZpvd((Object) this.toChainLogoUrl, (Object) dexMultiChildOrderInfoVo.toChainLogoUrl) && this.showArrow == dexMultiChildOrderInfoVo.showArrow && Intrinsics.EZpvd((Object) this.swapTradeType, (Object) dexMultiChildOrderInfoVo.swapTradeType) && Intrinsics.EZpvd((Object) this.mainStatus, (Object) dexMultiChildOrderInfoVo.mainStatus) && Intrinsics.EZpvd((Object) this.orderFailReason, (Object) dexMultiChildOrderInfoVo.orderFailReason) && Intrinsics.EZpvd((Object) this.originalTokenSymbol, (Object) dexMultiChildOrderInfoVo.originalTokenSymbol) && Intrinsics.EZpvd((Object) this.lastChildOrderToTokenSymbol, (Object) dexMultiChildOrderInfoVo.lastChildOrderToTokenSymbol) && Intrinsics.EZpvd((Object) this.lastChildOrderChainName, (Object) dexMultiChildOrderInfoVo.lastChildOrderChainName) && Intrinsics.EZpvd((Object) this.hiddenFromOrder, (Object) dexMultiChildOrderInfoVo.hiddenFromOrder) && Intrinsics.EZpvd((Object) this.refundAmount, (Object) dexMultiChildOrderInfoVo.refundAmount) && Intrinsics.EZpvd((Object) this.refundAmountShow, (Object) dexMultiChildOrderInfoVo.refundAmountShow) && this.isPayOrder == dexMultiChildOrderInfoVo.isPayOrder && Intrinsics.EZpvd((Object) this.extendStatus, (Object) dexMultiChildOrderInfoVo.extendStatus) && this.isShowSpeedUp == dexMultiChildOrderInfoVo.isShowSpeedUp && this.isShowCancel == dexMultiChildOrderInfoVo.isShowCancel && this.isShowSpeedUpCancel == dexMultiChildOrderInfoVo.isShowSpeedUpCancel && this.isDiscountGasStation == dexMultiChildOrderInfoVo.isDiscountGasStation && this.firstOrder == dexMultiChildOrderInfoVo.firstOrder && this.finalOrder == dexMultiChildOrderInfoVo.finalOrder && Intrinsics.EZpvd(this.gasStationActivityReward, dexMultiChildOrderInfoVo.gasStationActivityReward) && Intrinsics.EZpvd((Object) this.officialBridgeTime, (Object) dexMultiChildOrderInfoVo.officialBridgeTime) && this.localFromChildTag == dexMultiChildOrderInfoVo.localFromChildTag && this.localBridgeTag == dexMultiChildOrderInfoVo.localBridgeTag && this.localBridgeToTag == dexMultiChildOrderInfoVo.localBridgeToTag && Intrinsics.EZpvd((Object) this.mainEstimatedTime, (Object) dexMultiChildOrderInfoVo.mainEstimatedTime) && Intrinsics.EZpvd((Object) this.fromEstimatedTime, (Object) dexMultiChildOrderInfoVo.fromEstimatedTime) && Intrinsics.EZpvd((Object) this.bridgeEstimatedTime, (Object) dexMultiChildOrderInfoVo.bridgeEstimatedTime) && Intrinsics.EZpvd((Object) this.originFromEstimatedTime, (Object) dexMultiChildOrderInfoVo.originFromEstimatedTime) && Intrinsics.EZpvd((Object) this.originBridgeEstimatedTime, (Object) dexMultiChildOrderInfoVo.originBridgeEstimatedTime) && Intrinsics.EZpvd((Object) this.errorCode, (Object) dexMultiChildOrderInfoVo.errorCode) && Intrinsics.EZpvd((Object) this.refundSymbol, (Object) dexMultiChildOrderInfoVo.refundSymbol) && Intrinsics.EZpvd((Object) this.refundChain, (Object) dexMultiChildOrderInfoVo.refundChain) && Intrinsics.EZpvd((Object) this.dataType, (Object) dexMultiChildOrderInfoVo.dataType) && Intrinsics.EZpvd((Object) this.mainFromAddress, (Object) dexMultiChildOrderInfoVo.mainFromAddress) && Intrinsics.EZpvd((Object) this.mainSpecialOrderType, (Object) dexMultiChildOrderInfoVo.mainSpecialOrderType) && Intrinsics.EZpvd(this.mainRelativeTransaction, dexMultiChildOrderInfoVo.mainRelativeTransaction) && Intrinsics.EZpvd((Object) this.guideUrl, (Object) dexMultiChildOrderInfoVo.guideUrl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBridgeEstimatedTime() {
        return this.bridgeEstimatedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexBridgeOrderInfoVo getBridgeOrderInfoVo() {
        return this.bridgeOrderInfoVo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChildOrderId() {
        return this.childOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDataType() {
        return this.dataType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexBridgeShadowTokenPairInfoVo getDexBridgeShadowTokenPairInfoVo() {
        return this.dexBridgeShadowTokenPairInfoVo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getErrorCode() {
        return this.errorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExploreUrl() {
        return this.exploreUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExtendStatus() {
        return this.extendStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getFinalOrder() {
        return this.finalOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getFirstOrder() {
        return this.firstOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromAmountIn() {
        return this.fromAmountIn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromChainId() {
        return this.fromChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromChainLogoUrl() {
        return this.fromChainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromChainName() {
        return this.fromChainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromEstimatedTime() {
        return this.fromEstimatedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenIcon() {
        return this.fromTokenIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenSymbol() {
        return this.fromTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexGasStationActivity getGasStationActivityReward() {
        return this.gasStationActivityReward;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGuideUrl() {
        return this.guideUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHiddenFromOrder() {
        return this.hiddenFromOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLastChildOrderChainName() {
        return this.lastChildOrderChainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLastChildOrderToTokenSymbol() {
        return this.lastChildOrderToTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getLocalBridgeTag() {
        return this.localBridgeTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getLocalBridgeToTag() {
        return this.localBridgeToTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getLocalFromChildTag() {
        return this.localFromChildTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMainEstimatedTime() {
        return this.mainEstimatedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMainFromAddress() {
        return this.mainFromAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RelativeTransactionVO getMainRelativeTransaction() {
        return this.mainRelativeTransaction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMainSpecialOrderType() {
        return this.mainSpecialOrderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMainStatus() {
        return this.mainStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMark() {
        return this.mark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOfficialBridgeTime() {
        return this.officialBridgeTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderFailReason() {
        return this.orderFailReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderIndex() {
        return this.orderIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOriginBridgeEstimatedTime() {
        return this.originBridgeEstimatedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOriginFromEstimatedTime() {
        return this.originFromEstimatedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOriginalTokenSymbol() {
        return this.originalTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRefundAmount() {
        return this.refundAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRefundAmountShow() {
        return this.refundAmountShow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRefundChain() {
        return this.refundChain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRefundSymbol() {
        return this.refundSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowArrow() {
        return this.showArrow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSwapTradeType() {
        return this.swapTradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToAmountOut() {
        return this.toAmountOut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToChainId() {
        return this.toChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToChainLogoUrl() {
        return this.toChainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToChainName() {
        return this.toChainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenIcon() {
        return this.toTokenIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenSymbol() {
        return this.toTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToastGuideUrl() {
        return this.toastGuideUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToastType() {
        return this.toastType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTransactionHash() {
        return this.transactionHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        DexBridgeOrderInfoVo dexBridgeOrderInfoVo = this.bridgeOrderInfoVo;
        int iHashCode = dexBridgeOrderInfoVo == null ? 0 : dexBridgeOrderInfoVo.hashCode();
        DexBridgeShadowTokenPairInfoVo dexBridgeShadowTokenPairInfoVo = this.dexBridgeShadowTokenPairInfoVo;
        int iHashCode2 = dexBridgeShadowTokenPairInfoVo == null ? 0 : dexBridgeShadowTokenPairInfoVo.hashCode();
        int iHashCode3 = this.childOrderId.hashCode();
        int iHashCode4 = this.exploreUrl.hashCode();
        int iHashCode5 = this.fromAmountIn.hashCode();
        int iHashCode6 = this.fromChainId.hashCode();
        int iHashCode7 = this.fromChainLogoUrl.hashCode();
        int iHashCode8 = this.fromChainName.hashCode();
        int iHashCode9 = this.fromTokenSymbol.hashCode();
        int iHashCode10 = this.toastGuideUrl.hashCode();
        int iHashCode11 = this.orderIndex.hashCode();
        int iHashCode12 = this.status.hashCode();
        int iHashCode13 = this.toAmountOut.hashCode();
        int iHashCode14 = this.toTokenSymbol.hashCode();
        int iHashCode15 = this.toastType.hashCode();
        int iHashCode16 = this.transactionHash.hashCode();
        int iHashCode17 = this.mark.hashCode();
        int iHashCode18 = this.fromTokenIcon.hashCode();
        int iHashCode19 = this.toTokenIcon.hashCode();
        int iHashCode20 = this.toChainId.hashCode();
        int iHashCode21 = this.toChainName.hashCode();
        int iHashCode22 = this.toChainLogoUrl.hashCode();
        int iHashCode23 = Boolean.hashCode(this.showArrow);
        int iHashCode24 = this.swapTradeType.hashCode();
        int iHashCode25 = this.mainStatus.hashCode();
        int iHashCode26 = this.orderFailReason.hashCode();
        int iHashCode27 = this.originalTokenSymbol.hashCode();
        int iHashCode28 = this.lastChildOrderToTokenSymbol.hashCode();
        int iHashCode29 = this.lastChildOrderChainName.hashCode();
        int iHashCode30 = this.hiddenFromOrder.hashCode();
        int iHashCode31 = this.refundAmount.hashCode();
        int iHashCode32 = this.refundAmountShow.hashCode();
        int iHashCode33 = Boolean.hashCode(this.isPayOrder);
        int iHashCode34 = this.extendStatus.hashCode();
        int iHashCode35 = Boolean.hashCode(this.isShowSpeedUp);
        int iHashCode36 = Boolean.hashCode(this.isShowCancel);
        int iHashCode37 = Boolean.hashCode(this.isShowSpeedUpCancel);
        int iHashCode38 = Boolean.hashCode(this.isDiscountGasStation);
        int iHashCode39 = Boolean.hashCode(this.firstOrder);
        int iHashCode40 = Boolean.hashCode(this.finalOrder);
        int iHashCode41 = this.gasStationActivityReward.hashCode();
        int iHashCode42 = this.officialBridgeTime.hashCode();
        int iHashCode43 = Boolean.hashCode(this.localFromChildTag);
        int iHashCode44 = Boolean.hashCode(this.localBridgeTag);
        int iHashCode45 = Boolean.hashCode(this.localBridgeToTag);
        int iHashCode46 = this.mainEstimatedTime.hashCode();
        int iHashCode47 = this.fromEstimatedTime.hashCode();
        int iHashCode48 = this.bridgeEstimatedTime.hashCode();
        int iHashCode49 = this.originFromEstimatedTime.hashCode();
        int iHashCode50 = this.originBridgeEstimatedTime.hashCode();
        int iHashCode51 = this.errorCode.hashCode();
        int iHashCode52 = this.refundSymbol.hashCode();
        int iHashCode53 = this.refundChain.hashCode();
        int iHashCode54 = this.dataType.hashCode();
        int iHashCode55 = this.mainFromAddress.hashCode();
        int iHashCode56 = this.mainSpecialOrderType.hashCode();
        RelativeTransactionVO relativeTransactionVO = this.mainRelativeTransaction;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + iHashCode44) * 31) + iHashCode45) * 31) + iHashCode46) * 31) + iHashCode47) * 31) + iHashCode48) * 31) + iHashCode49) * 31) + iHashCode50) * 31) + iHashCode51) * 31) + iHashCode52) * 31) + iHashCode53) * 31) + iHashCode54) * 31) + iHashCode55) * 31) + iHashCode56) * 31) + (relativeTransactionVO == null ? 0 : relativeTransactionVO.hashCode())) * 31) + this.guideUrl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isDiscountGasStation() {
        return this.isDiscountGasStation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isPayOrder() {
        return this.isPayOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowCancel() {
        return this.isShowCancel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowSpeedUp() {
        return this.isShowSpeedUp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowSpeedUpCancel() {
        return this.isShowSpeedUpCancel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBridgeEstimatedTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bridgeEstimatedTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDataType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.dataType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDexBridgeShadowTokenPairInfoVo(DexBridgeShadowTokenPairInfoVo dexBridgeShadowTokenPairInfoVo) {
        this.dexBridgeShadowTokenPairInfoVo = dexBridgeShadowTokenPairInfoVo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDiscountGasStation(boolean z) {
        this.isDiscountGasStation = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setErrorCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.errorCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExploreUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.exploreUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExtendStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.extendStatus = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFinalOrder(boolean z) {
        this.finalOrder = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFirstOrder(boolean z) {
        this.firstOrder = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFromAmountIn(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fromAmountIn = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFromEstimatedTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fromEstimatedTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFromTokenSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fromTokenSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGasStationActivityReward(@NotNull DexGasStationActivity dexGasStationActivity) {
        Intrinsics.checkNotNullParameter(dexGasStationActivity, "");
        this.gasStationActivityReward = dexGasStationActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHiddenFromOrder(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.hiddenFromOrder = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLastChildOrderChainName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.lastChildOrderChainName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLastChildOrderToTokenSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.lastChildOrderToTokenSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLocalBridgeTag(boolean z) {
        this.localBridgeTag = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLocalBridgeToTag(boolean z) {
        this.localBridgeToTag = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLocalFromChildTag(boolean z) {
        this.localFromChildTag = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMainEstimatedTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mainEstimatedTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMainFromAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mainFromAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMainRelativeTransaction(RelativeTransactionVO relativeTransactionVO) {
        this.mainRelativeTransaction = relativeTransactionVO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMainSpecialOrderType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mainSpecialOrderType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMainStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mainStatus = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMark(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mark = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderFailReason(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.orderFailReason = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOriginBridgeEstimatedTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.originBridgeEstimatedTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOriginFromEstimatedTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.originFromEstimatedTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOriginalTokenSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.originalTokenSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPayOrder(boolean z) {
        this.isPayOrder = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRefundAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.refundAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRefundAmountShow(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.refundAmountShow = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRefundChain(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.refundChain = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRefundSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.refundSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowArrow(boolean z) {
        this.showArrow = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowCancel(boolean z) {
        this.isShowCancel = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowSpeedUp(boolean z) {
        this.isShowSpeedUp = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowSpeedUpCancel(boolean z) {
        this.isShowSpeedUpCancel = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.status = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSwapTradeType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.swapTradeType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToAmountOut(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.toAmountOut = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToTokenIcon(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.toTokenIcon = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToTokenSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.toTokenSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToastGuideUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.toastGuideUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToastType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.toastType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTransactionHash(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.transactionHash = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexMultiChildOrderInfoVo(bridgeOrderInfoVo=" + this.bridgeOrderInfoVo + ", dexBridgeShadowTokenPairInfoVo=" + this.dexBridgeShadowTokenPairInfoVo + ", childOrderId=" + this.childOrderId + ", exploreUrl=" + this.exploreUrl + ", fromAmountIn=" + this.fromAmountIn + ", fromChainId=" + this.fromChainId + ", fromChainLogoUrl=" + this.fromChainLogoUrl + ", fromChainName=" + this.fromChainName + ", fromTokenSymbol=" + this.fromTokenSymbol + ", toastGuideUrl=" + this.toastGuideUrl + ", orderIndex=" + this.orderIndex + ", status=" + this.status + ", toAmountOut=" + this.toAmountOut + ", toTokenSymbol=" + this.toTokenSymbol + ", toastType=" + this.toastType + ", transactionHash=" + this.transactionHash + ", mark=" + this.mark + ", fromTokenIcon=" + this.fromTokenIcon + ", toTokenIcon=" + this.toTokenIcon + ", toChainId=" + this.toChainId + ", toChainName=" + this.toChainName + ", toChainLogoUrl=" + this.toChainLogoUrl + ", showArrow=" + this.showArrow + ", swapTradeType=" + this.swapTradeType + ", mainStatus=" + this.mainStatus + ", orderFailReason=" + this.orderFailReason + ", originalTokenSymbol=" + this.originalTokenSymbol + ", lastChildOrderToTokenSymbol=" + this.lastChildOrderToTokenSymbol + ", lastChildOrderChainName=" + this.lastChildOrderChainName + ", hiddenFromOrder=" + this.hiddenFromOrder + ", refundAmount=" + this.refundAmount + ", refundAmountShow=" + this.refundAmountShow + ", isPayOrder=" + this.isPayOrder + ", extendStatus=" + this.extendStatus + ", isShowSpeedUp=" + this.isShowSpeedUp + ", isShowCancel=" + this.isShowCancel + ", isShowSpeedUpCancel=" + this.isShowSpeedUpCancel + ", isDiscountGasStation=" + this.isDiscountGasStation + ", firstOrder=" + this.firstOrder + ", finalOrder=" + this.finalOrder + ", gasStationActivityReward=" + this.gasStationActivityReward + ", officialBridgeTime=" + this.officialBridgeTime + ", localFromChildTag=" + this.localFromChildTag + ", localBridgeTag=" + this.localBridgeTag + ", localBridgeToTag=" + this.localBridgeToTag + ", mainEstimatedTime=" + this.mainEstimatedTime + ", fromEstimatedTime=" + this.fromEstimatedTime + ", bridgeEstimatedTime=" + this.bridgeEstimatedTime + ", originFromEstimatedTime=" + this.originFromEstimatedTime + ", originBridgeEstimatedTime=" + this.originBridgeEstimatedTime + ", errorCode=" + this.errorCode + ", refundSymbol=" + this.refundSymbol + ", refundChain=" + this.refundChain + ", dataType=" + this.dataType + ", mainFromAddress=" + this.mainFromAddress + ", mainSpecialOrderType=" + this.mainSpecialOrderType + ", mainRelativeTransaction=" + this.mainRelativeTransaction + ", guideUrl=" + this.guideUrl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        DexBridgeOrderInfoVo dexBridgeOrderInfoVo = this.bridgeOrderInfoVo;
        if (dexBridgeOrderInfoVo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dexBridgeOrderInfoVo.writeToParcel(parcel, i);
        }
        DexBridgeShadowTokenPairInfoVo dexBridgeShadowTokenPairInfoVo = this.dexBridgeShadowTokenPairInfoVo;
        if (dexBridgeShadowTokenPairInfoVo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dexBridgeShadowTokenPairInfoVo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.childOrderId);
        parcel.writeString(this.exploreUrl);
        parcel.writeString(this.fromAmountIn);
        parcel.writeString(this.fromChainId);
        parcel.writeString(this.fromChainLogoUrl);
        parcel.writeString(this.fromChainName);
        parcel.writeString(this.fromTokenSymbol);
        parcel.writeString(this.toastGuideUrl);
        parcel.writeString(this.orderIndex);
        parcel.writeString(this.status);
        parcel.writeString(this.toAmountOut);
        parcel.writeString(this.toTokenSymbol);
        parcel.writeString(this.toastType);
        parcel.writeString(this.transactionHash);
        parcel.writeString(this.mark);
        parcel.writeString(this.fromTokenIcon);
        parcel.writeString(this.toTokenIcon);
        parcel.writeString(this.toChainId);
        parcel.writeString(this.toChainName);
        parcel.writeString(this.toChainLogoUrl);
        parcel.writeInt(this.showArrow ? 1 : 0);
        parcel.writeString(this.swapTradeType);
        parcel.writeString(this.mainStatus);
        parcel.writeString(this.orderFailReason);
        parcel.writeString(this.originalTokenSymbol);
        parcel.writeString(this.lastChildOrderToTokenSymbol);
        parcel.writeString(this.lastChildOrderChainName);
        parcel.writeString(this.hiddenFromOrder);
        parcel.writeString(this.refundAmount);
        parcel.writeString(this.refundAmountShow);
        parcel.writeInt(this.isPayOrder ? 1 : 0);
        parcel.writeString(this.extendStatus);
        parcel.writeInt(this.isShowSpeedUp ? 1 : 0);
        parcel.writeInt(this.isShowCancel ? 1 : 0);
        parcel.writeInt(this.isShowSpeedUpCancel ? 1 : 0);
        parcel.writeInt(this.isDiscountGasStation ? 1 : 0);
        parcel.writeInt(this.firstOrder ? 1 : 0);
        parcel.writeInt(this.finalOrder ? 1 : 0);
        this.gasStationActivityReward.writeToParcel(parcel, i);
        parcel.writeString(this.officialBridgeTime);
        parcel.writeInt(this.localFromChildTag ? 1 : 0);
        parcel.writeInt(this.localBridgeTag ? 1 : 0);
        parcel.writeInt(this.localBridgeToTag ? 1 : 0);
        parcel.writeString(this.mainEstimatedTime);
        parcel.writeString(this.fromEstimatedTime);
        parcel.writeString(this.bridgeEstimatedTime);
        parcel.writeString(this.originFromEstimatedTime);
        parcel.writeString(this.originBridgeEstimatedTime);
        parcel.writeString(this.errorCode);
        parcel.writeString(this.refundSymbol);
        parcel.writeString(this.refundChain);
        parcel.writeString(this.dataType);
        parcel.writeString(this.mainFromAddress);
        parcel.writeString(this.mainSpecialOrderType);
        RelativeTransactionVO relativeTransactionVO = this.mainRelativeTransaction;
        if (relativeTransactionVO == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            relativeTransactionVO.writeToParcel(parcel, i);
        }
        parcel.writeString(this.guideUrl);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.DexMultiChildOrderInfoVo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DexMultiChildOrderInfoVo> serializer() {
            return DexMultiChildOrderInfoVo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DexMultiChildOrderInfoVo(int i, int i2, DexBridgeOrderInfoVo dexBridgeOrderInfoVo, DexBridgeShadowTokenPairInfoVo dexBridgeShadowTokenPairInfoVo, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, boolean z, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, boolean z2, String str30, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, DexGasStationActivity dexGasStationActivity, String str31, boolean z9, boolean z10, boolean z11, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, RelativeTransactionVO relativeTransactionVO, String str43, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.bridgeOrderInfoVo = null;
        } else {
            this.bridgeOrderInfoVo = dexBridgeOrderInfoVo;
        }
        if ((i & 2) == 0) {
            this.dexBridgeShadowTokenPairInfoVo = null;
        } else {
            this.dexBridgeShadowTokenPairInfoVo = dexBridgeShadowTokenPairInfoVo;
        }
        if ((i & 4) == 0) {
            this.childOrderId = "";
        } else {
            this.childOrderId = str;
        }
        if ((i & 8) == 0) {
            this.exploreUrl = "";
        } else {
            this.exploreUrl = str2;
        }
        if ((i & 16) == 0) {
            this.fromAmountIn = "";
        } else {
            this.fromAmountIn = str3;
        }
        if ((i & 32) == 0) {
            this.fromChainId = "";
        } else {
            this.fromChainId = str4;
        }
        if ((i & 64) == 0) {
            this.fromChainLogoUrl = "";
        } else {
            this.fromChainLogoUrl = str5;
        }
        if ((i & 128) == 0) {
            this.fromChainName = "";
        } else {
            this.fromChainName = str6;
        }
        if ((i & 256) == 0) {
            this.fromTokenSymbol = "";
        } else {
            this.fromTokenSymbol = str7;
        }
        if ((i & 512) == 0) {
            this.toastGuideUrl = "";
        } else {
            this.toastGuideUrl = str8;
        }
        if ((i & 1024) == 0) {
            this.orderIndex = "";
        } else {
            this.orderIndex = str9;
        }
        if ((i & 2048) == 0) {
            this.status = "";
        } else {
            this.status = str10;
        }
        if ((i & 4096) == 0) {
            this.toAmountOut = "";
        } else {
            this.toAmountOut = str11;
        }
        if ((i & 8192) == 0) {
            this.toTokenSymbol = "";
        } else {
            this.toTokenSymbol = str12;
        }
        if ((i & 16384) == 0) {
            this.toastType = MultiTransferSignData.DEFAULT_INTERVAL;
        } else {
            this.toastType = str13;
        }
        if ((i & 32768) == 0) {
            this.transactionHash = "";
        } else {
            this.transactionHash = str14;
        }
        if ((i & 65536) == 0) {
            this.mark = "";
        } else {
            this.mark = str15;
        }
        if ((i & 131072) == 0) {
            this.fromTokenIcon = "";
        } else {
            this.fromTokenIcon = str16;
        }
        if ((262144 & i) == 0) {
            this.toTokenIcon = "";
        } else {
            this.toTokenIcon = str17;
        }
        if ((524288 & i) == 0) {
            this.toChainId = "";
        } else {
            this.toChainId = str18;
        }
        if ((1048576 & i) == 0) {
            this.toChainName = "";
        } else {
            this.toChainName = str19;
        }
        if ((2097152 & i) == 0) {
            this.toChainLogoUrl = "";
        } else {
            this.toChainLogoUrl = str20;
        }
        this.showArrow = (4194304 & i) == 0 ? true : z;
        if ((8388608 & i) == 0) {
            this.swapTradeType = "";
        } else {
            this.swapTradeType = str21;
        }
        this.mainStatus = (16777216 & i) == 0 ? "0" : str22;
        if ((33554432 & i) == 0) {
            this.orderFailReason = "";
        } else {
            this.orderFailReason = str23;
        }
        if ((67108864 & i) == 0) {
            this.originalTokenSymbol = "";
        } else {
            this.originalTokenSymbol = str24;
        }
        if ((134217728 & i) == 0) {
            this.lastChildOrderToTokenSymbol = "";
        } else {
            this.lastChildOrderToTokenSymbol = str25;
        }
        if ((268435456 & i) == 0) {
            this.lastChildOrderChainName = "";
        } else {
            this.lastChildOrderChainName = str26;
        }
        if ((536870912 & i) == 0) {
            this.hiddenFromOrder = MultiTransferSignData.DEFAULT_INTERVAL;
        } else {
            this.hiddenFromOrder = str27;
        }
        if ((1073741824 & i) == 0) {
            this.refundAmount = "";
        } else {
            this.refundAmount = str28;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.refundAmountShow = "";
        } else {
            this.refundAmountShow = str29;
        }
        if ((i2 & 1) == 0) {
            this.isPayOrder = false;
        } else {
            this.isPayOrder = z2;
        }
        if ((i2 & 2) == 0) {
            this.extendStatus = "";
        } else {
            this.extendStatus = str30;
        }
        if ((i2 & 4) == 0) {
            this.isShowSpeedUp = false;
        } else {
            this.isShowSpeedUp = z3;
        }
        if ((i2 & 8) == 0) {
            this.isShowCancel = false;
        } else {
            this.isShowCancel = z4;
        }
        if ((i2 & 16) == 0) {
            this.isShowSpeedUpCancel = false;
        } else {
            this.isShowSpeedUpCancel = z5;
        }
        if ((i2 & 32) == 0) {
            this.isDiscountGasStation = false;
        } else {
            this.isDiscountGasStation = z6;
        }
        if ((i2 & 64) == 0) {
            this.firstOrder = false;
        } else {
            this.firstOrder = z7;
        }
        if ((i2 & 128) == 0) {
            this.finalOrder = false;
        } else {
            this.finalOrder = z8;
        }
        this.gasStationActivityReward = (i2 & 256) == 0 ? new DexGasStationActivity(0, "") : dexGasStationActivity;
        if ((i2 & 512) == 0) {
            this.officialBridgeTime = "";
        } else {
            this.officialBridgeTime = str31;
        }
        if ((i2 & 1024) == 0) {
            this.localFromChildTag = false;
        } else {
            this.localFromChildTag = z9;
        }
        if ((i2 & 2048) == 0) {
            this.localBridgeTag = false;
        } else {
            this.localBridgeTag = z10;
        }
        if ((i2 & 4096) == 0) {
            this.localBridgeToTag = false;
        } else {
            this.localBridgeToTag = z11;
        }
        if ((i2 & 8192) == 0) {
            this.mainEstimatedTime = "";
        } else {
            this.mainEstimatedTime = str32;
        }
        if ((i2 & 16384) == 0) {
            this.fromEstimatedTime = "";
        } else {
            this.fromEstimatedTime = str33;
        }
        if ((i2 & 32768) == 0) {
            this.bridgeEstimatedTime = "";
        } else {
            this.bridgeEstimatedTime = str34;
        }
        if ((i2 & 65536) == 0) {
            this.originFromEstimatedTime = "";
        } else {
            this.originFromEstimatedTime = str35;
        }
        if ((i2 & 131072) == 0) {
            this.originBridgeEstimatedTime = "";
        } else {
            this.originBridgeEstimatedTime = str36;
        }
        if ((262144 & i2) == 0) {
            this.errorCode = "";
        } else {
            this.errorCode = str37;
        }
        if ((524288 & i2) == 0) {
            this.refundSymbol = "";
        } else {
            this.refundSymbol = str38;
        }
        if ((1048576 & i2) == 0) {
            this.refundChain = "";
        } else {
            this.refundChain = str39;
        }
        if ((2097152 & i2) == 0) {
            this.dataType = MultiTransferSignData.DEFAULT_INTERVAL;
        } else {
            this.dataType = str40;
        }
        if ((4194304 & i2) == 0) {
            this.mainFromAddress = "";
        } else {
            this.mainFromAddress = str41;
        }
        if ((8388608 & i2) == 0) {
            this.mainSpecialOrderType = "";
        } else {
            this.mainSpecialOrderType = str42;
        }
        if ((16777216 & i2) == 0) {
            this.mainRelativeTransaction = null;
        } else {
            this.mainRelativeTransaction = relativeTransactionVO;
        }
        if ((33554432 & i2) == 0) {
            this.guideUrl = "";
        } else {
            this.guideUrl = str43;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || dexMultiChildOrderInfoVo.bridgeOrderInfoVo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, DexBridgeOrderInfoVo$$serializer.INSTANCE, dexMultiChildOrderInfoVo.bridgeOrderInfoVo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || dexMultiChildOrderInfoVo.dexBridgeShadowTokenPairInfoVo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, DexBridgeShadowTokenPairInfoVo$$serializer.INSTANCE, dexMultiChildOrderInfoVo.dexBridgeShadowTokenPairInfoVo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) dexMultiChildOrderInfoVo.childOrderId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, dexMultiChildOrderInfoVo.childOrderId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) dexMultiChildOrderInfoVo.exploreUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, dexMultiChildOrderInfoVo.exploreUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) dexMultiChildOrderInfoVo.fromAmountIn, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, dexMultiChildOrderInfoVo.fromAmountIn);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) dexMultiChildOrderInfoVo.fromChainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, dexMultiChildOrderInfoVo.fromChainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) dexMultiChildOrderInfoVo.fromChainLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, dexMultiChildOrderInfoVo.fromChainLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) dexMultiChildOrderInfoVo.fromChainName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, dexMultiChildOrderInfoVo.fromChainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) dexMultiChildOrderInfoVo.fromTokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, dexMultiChildOrderInfoVo.fromTokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) dexMultiChildOrderInfoVo.toastGuideUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, dexMultiChildOrderInfoVo.toastGuideUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) dexMultiChildOrderInfoVo.orderIndex, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, dexMultiChildOrderInfoVo.orderIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) dexMultiChildOrderInfoVo.status, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, dexMultiChildOrderInfoVo.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) dexMultiChildOrderInfoVo.toAmountOut, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, dexMultiChildOrderInfoVo.toAmountOut);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) dexMultiChildOrderInfoVo.toTokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, dexMultiChildOrderInfoVo.toTokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) dexMultiChildOrderInfoVo.toastType, (Object) MultiTransferSignData.DEFAULT_INTERVAL)) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, dexMultiChildOrderInfoVo.toastType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) dexMultiChildOrderInfoVo.transactionHash, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, dexMultiChildOrderInfoVo.transactionHash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) dexMultiChildOrderInfoVo.mark, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, dexMultiChildOrderInfoVo.mark);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) dexMultiChildOrderInfoVo.fromTokenIcon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, dexMultiChildOrderInfoVo.fromTokenIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) dexMultiChildOrderInfoVo.toTokenIcon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, dexMultiChildOrderInfoVo.toTokenIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) dexMultiChildOrderInfoVo.toChainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, dexMultiChildOrderInfoVo.toChainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) dexMultiChildOrderInfoVo.toChainName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, dexMultiChildOrderInfoVo.toChainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) dexMultiChildOrderInfoVo.toChainLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, dexMultiChildOrderInfoVo.toChainLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !dexMultiChildOrderInfoVo.showArrow) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 22, dexMultiChildOrderInfoVo.showArrow);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) dexMultiChildOrderInfoVo.swapTradeType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, dexMultiChildOrderInfoVo.swapTradeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) dexMultiChildOrderInfoVo.mainStatus, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, dexMultiChildOrderInfoVo.mainStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) dexMultiChildOrderInfoVo.orderFailReason, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, dexMultiChildOrderInfoVo.orderFailReason);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) dexMultiChildOrderInfoVo.originalTokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, dexMultiChildOrderInfoVo.originalTokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) dexMultiChildOrderInfoVo.lastChildOrderToTokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, dexMultiChildOrderInfoVo.lastChildOrderToTokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) dexMultiChildOrderInfoVo.lastChildOrderChainName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, dexMultiChildOrderInfoVo.lastChildOrderChainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd((Object) dexMultiChildOrderInfoVo.hiddenFromOrder, (Object) MultiTransferSignData.DEFAULT_INTERVAL)) {
            compositeEncoder.encodeStringElement(serialDescriptor, 29, dexMultiChildOrderInfoVo.hiddenFromOrder);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) dexMultiChildOrderInfoVo.refundAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 30, dexMultiChildOrderInfoVo.refundAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || !Intrinsics.EZpvd((Object) dexMultiChildOrderInfoVo.refundAmountShow, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 31, dexMultiChildOrderInfoVo.refundAmountShow);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || dexMultiChildOrderInfoVo.isPayOrder) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 32, dexMultiChildOrderInfoVo.isPayOrder);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || !Intrinsics.EZpvd((Object) dexMultiChildOrderInfoVo.extendStatus, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 33, dexMultiChildOrderInfoVo.extendStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || dexMultiChildOrderInfoVo.isShowSpeedUp) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 34, dexMultiChildOrderInfoVo.isShowSpeedUp);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || dexMultiChildOrderInfoVo.isShowCancel) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 35, dexMultiChildOrderInfoVo.isShowCancel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || dexMultiChildOrderInfoVo.isShowSpeedUpCancel) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 36, dexMultiChildOrderInfoVo.isShowSpeedUpCancel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || dexMultiChildOrderInfoVo.isDiscountGasStation) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 37, dexMultiChildOrderInfoVo.isDiscountGasStation);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || dexMultiChildOrderInfoVo.firstOrder) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 38, dexMultiChildOrderInfoVo.firstOrder);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || dexMultiChildOrderInfoVo.finalOrder) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 39, dexMultiChildOrderInfoVo.finalOrder);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || !Intrinsics.EZpvd(dexMultiChildOrderInfoVo.gasStationActivityReward, new DexGasStationActivity(0, ""))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 40, DexGasStationActivity$$serializer.INSTANCE, dexMultiChildOrderInfoVo.gasStationActivityReward);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) || !Intrinsics.EZpvd((Object) dexMultiChildOrderInfoVo.officialBridgeTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 41, dexMultiChildOrderInfoVo.officialBridgeTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 42) || dexMultiChildOrderInfoVo.localFromChildTag) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 42, dexMultiChildOrderInfoVo.localFromChildTag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 43) || dexMultiChildOrderInfoVo.localBridgeTag) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 43, dexMultiChildOrderInfoVo.localBridgeTag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 44) || dexMultiChildOrderInfoVo.localBridgeToTag) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 44, dexMultiChildOrderInfoVo.localBridgeToTag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 45) || !Intrinsics.EZpvd((Object) dexMultiChildOrderInfoVo.mainEstimatedTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 45, dexMultiChildOrderInfoVo.mainEstimatedTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 46) || !Intrinsics.EZpvd((Object) dexMultiChildOrderInfoVo.fromEstimatedTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 46, dexMultiChildOrderInfoVo.fromEstimatedTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 47) || !Intrinsics.EZpvd((Object) dexMultiChildOrderInfoVo.bridgeEstimatedTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 47, dexMultiChildOrderInfoVo.bridgeEstimatedTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 48) || !Intrinsics.EZpvd((Object) dexMultiChildOrderInfoVo.originFromEstimatedTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 48, dexMultiChildOrderInfoVo.originFromEstimatedTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 49) || !Intrinsics.EZpvd((Object) dexMultiChildOrderInfoVo.originBridgeEstimatedTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 49, dexMultiChildOrderInfoVo.originBridgeEstimatedTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 50) || !Intrinsics.EZpvd((Object) dexMultiChildOrderInfoVo.errorCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 50, dexMultiChildOrderInfoVo.errorCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 51) || !Intrinsics.EZpvd((Object) dexMultiChildOrderInfoVo.refundSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 51, dexMultiChildOrderInfoVo.refundSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 52) || !Intrinsics.EZpvd((Object) dexMultiChildOrderInfoVo.refundChain, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 52, dexMultiChildOrderInfoVo.refundChain);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 53) || !Intrinsics.EZpvd((Object) dexMultiChildOrderInfoVo.dataType, (Object) MultiTransferSignData.DEFAULT_INTERVAL)) {
            compositeEncoder.encodeStringElement(serialDescriptor, 53, dexMultiChildOrderInfoVo.dataType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 54) || !Intrinsics.EZpvd((Object) dexMultiChildOrderInfoVo.mainFromAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 54, dexMultiChildOrderInfoVo.mainFromAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 55) || !Intrinsics.EZpvd((Object) dexMultiChildOrderInfoVo.mainSpecialOrderType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 55, dexMultiChildOrderInfoVo.mainSpecialOrderType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 56) || dexMultiChildOrderInfoVo.mainRelativeTransaction != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 56, RelativeTransactionVO$$serializer.INSTANCE, dexMultiChildOrderInfoVo.mainRelativeTransaction);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 57) && Intrinsics.EZpvd((Object) dexMultiChildOrderInfoVo.guideUrl, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 57, dexMultiChildOrderInfoVo.guideUrl);
    }

    public DexMultiChildOrderInfoVo(DexBridgeOrderInfoVo dexBridgeOrderInfoVo, DexBridgeShadowTokenPairInfoVo dexBridgeShadowTokenPairInfoVo, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, boolean z, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, boolean z2, @NotNull String str30, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, @NotNull DexGasStationActivity dexGasStationActivity, @NotNull String str31, boolean z9, boolean z10, boolean z11, @NotNull String str32, @NotNull String str33, @NotNull String str34, @NotNull String str35, @NotNull String str36, @NotNull String str37, @NotNull String str38, @NotNull String str39, @NotNull String str40, @NotNull String str41, @NotNull String str42, RelativeTransactionVO relativeTransactionVO, @NotNull String str43) {
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
        Intrinsics.checkNotNullParameter(dexGasStationActivity, "");
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
        Intrinsics.checkNotNullParameter(str42, "");
        Intrinsics.checkNotNullParameter(str43, "");
        this.bridgeOrderInfoVo = dexBridgeOrderInfoVo;
        this.dexBridgeShadowTokenPairInfoVo = dexBridgeShadowTokenPairInfoVo;
        this.childOrderId = str;
        this.exploreUrl = str2;
        this.fromAmountIn = str3;
        this.fromChainId = str4;
        this.fromChainLogoUrl = str5;
        this.fromChainName = str6;
        this.fromTokenSymbol = str7;
        this.toastGuideUrl = str8;
        this.orderIndex = str9;
        this.status = str10;
        this.toAmountOut = str11;
        this.toTokenSymbol = str12;
        this.toastType = str13;
        this.transactionHash = str14;
        this.mark = str15;
        this.fromTokenIcon = str16;
        this.toTokenIcon = str17;
        this.toChainId = str18;
        this.toChainName = str19;
        this.toChainLogoUrl = str20;
        this.showArrow = z;
        this.swapTradeType = str21;
        this.mainStatus = str22;
        this.orderFailReason = str23;
        this.originalTokenSymbol = str24;
        this.lastChildOrderToTokenSymbol = str25;
        this.lastChildOrderChainName = str26;
        this.hiddenFromOrder = str27;
        this.refundAmount = str28;
        this.refundAmountShow = str29;
        this.isPayOrder = z2;
        this.extendStatus = str30;
        this.isShowSpeedUp = z3;
        this.isShowCancel = z4;
        this.isShowSpeedUpCancel = z5;
        this.isDiscountGasStation = z6;
        this.firstOrder = z7;
        this.finalOrder = z8;
        this.gasStationActivityReward = dexGasStationActivity;
        this.officialBridgeTime = str31;
        this.localFromChildTag = z9;
        this.localBridgeTag = z10;
        this.localBridgeToTag = z11;
        this.mainEstimatedTime = str32;
        this.fromEstimatedTime = str33;
        this.bridgeEstimatedTime = str34;
        this.originFromEstimatedTime = str35;
        this.originBridgeEstimatedTime = str36;
        this.errorCode = str37;
        this.refundSymbol = str38;
        this.refundChain = str39;
        this.dataType = str40;
        this.mainFromAddress = str41;
        this.mainSpecialOrderType = str42;
        this.mainRelativeTransaction = relativeTransactionVO;
        this.guideUrl = str43;
    }

    public /* synthetic */ DexMultiChildOrderInfoVo(DexBridgeOrderInfoVo dexBridgeOrderInfoVo, DexBridgeShadowTokenPairInfoVo dexBridgeShadowTokenPairInfoVo, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, boolean z, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, boolean z2, String str30, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, DexGasStationActivity dexGasStationActivity, String str31, boolean z9, boolean z10, boolean z11, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, RelativeTransactionVO relativeTransactionVO, String str43, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String str44;
        DexGasStationActivity dexGasStationActivity2;
        DexBridgeOrderInfoVo dexBridgeOrderInfoVo2 = (i & 1) != 0 ? null : dexBridgeOrderInfoVo;
        DexBridgeShadowTokenPairInfoVo dexBridgeShadowTokenPairInfoVo2 = (i & 2) != 0 ? null : dexBridgeShadowTokenPairInfoVo;
        String str45 = (i & 4) != 0 ? "" : str;
        String str46 = (i & 8) != 0 ? "" : str2;
        String str47 = (i & 16) != 0 ? "" : str3;
        String str48 = (i & 32) != 0 ? "" : str4;
        String str49 = (i & 64) != 0 ? "" : str5;
        String str50 = (i & 128) != 0 ? "" : str6;
        String str51 = (i & 256) != 0 ? "" : str7;
        String str52 = (i & 512) != 0 ? "" : str8;
        String str53 = (i & 1024) != 0 ? "" : str9;
        String str54 = (i & 2048) != 0 ? "" : str10;
        String str55 = (i & 4096) != 0 ? "" : str11;
        String str56 = (i & 8192) != 0 ? "" : str12;
        int i3 = i & 16384;
        String str57 = MultiTransferSignData.DEFAULT_INTERVAL;
        String str58 = i3 != 0 ? MultiTransferSignData.DEFAULT_INTERVAL : str13;
        String str59 = (i & 32768) != 0 ? "" : str14;
        String str60 = (i & 65536) != 0 ? "" : str15;
        String str61 = (i & 131072) != 0 ? "" : str16;
        String str62 = (i & 262144) != 0 ? "" : str17;
        String str63 = (i & 524288) != 0 ? "" : str18;
        String str64 = (i & 1048576) != 0 ? "" : str19;
        String str65 = (i & 2097152) != 0 ? "" : str20;
        boolean z12 = (i & 4194304) != 0 ? true : z;
        String str66 = (i & 8388608) != 0 ? "" : str21;
        String str67 = (i & 16777216) != 0 ? "0" : str22;
        String str68 = (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str23;
        String str69 = (i & 67108864) != 0 ? "" : str24;
        String str70 = (i & 134217728) != 0 ? "" : str25;
        String str71 = (i & 268435456) != 0 ? "" : str26;
        String str72 = (i & 536870912) != 0 ? MultiTransferSignData.DEFAULT_INTERVAL : str27;
        String str73 = (i & 1073741824) != 0 ? "" : str28;
        String str74 = (i & Integer.MIN_VALUE) != 0 ? "" : str29;
        boolean z13 = (i2 & 1) != 0 ? false : z2;
        String str75 = (i2 & 2) != 0 ? "" : str30;
        boolean z14 = (i2 & 4) != 0 ? false : z3;
        boolean z15 = (i2 & 8) != 0 ? false : z4;
        boolean z16 = (i2 & 16) != 0 ? false : z5;
        boolean z17 = (i2 & 32) != 0 ? false : z6;
        boolean z18 = (i2 & 64) != 0 ? false : z7;
        boolean z19 = (i2 & 128) != 0 ? false : z8;
        if ((i2 & 256) != 0) {
            str44 = str58;
            dexGasStationActivity2 = new DexGasStationActivity(0, "");
        } else {
            str44 = str58;
            dexGasStationActivity2 = dexGasStationActivity;
        }
        this(dexBridgeOrderInfoVo2, dexBridgeShadowTokenPairInfoVo2, str45, str46, str47, str48, str49, str50, str51, str52, str53, str54, str55, str56, str44, str59, str60, str61, str62, str63, str64, str65, z12, str66, str67, str68, str69, str70, str71, str72, str73, str74, z13, str75, z14, z15, z16, z17, z18, z19, dexGasStationActivity2, (i2 & 512) != 0 ? "" : str31, (i2 & 1024) != 0 ? false : z9, (i2 & 2048) != 0 ? false : z10, (i2 & 4096) != 0 ? false : z11, (i2 & 8192) != 0 ? "" : str32, (i2 & 16384) != 0 ? "" : str33, (i2 & 32768) != 0 ? "" : str34, (i2 & 65536) != 0 ? "" : str35, (i2 & 131072) != 0 ? "" : str36, (i2 & 262144) != 0 ? "" : str37, (i2 & 524288) != 0 ? "" : str38, (i2 & 1048576) != 0 ? "" : str39, (i2 & 2097152) == 0 ? str40 : str57, (i2 & 4194304) != 0 ? "" : str41, (i2 & 8388608) != 0 ? "" : str42, (i2 & 16777216) != 0 ? null : relativeTransactionVO, (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str43);
    }

    public final C22034hVl getErrorCodeMsg() {
        return hVR.KWHzl.copydefault(this.errorCode, this);
    }

    public final boolean showTimeOutView() {
        return isPending() && !isOpenErrorView() && isErrorCodeNormal();
    }

    public final boolean isErrorCodeNormal() {
        return Intrinsics.EZpvd((Object) this.errorCode, (Object) "0") || this.errorCode.length() == 0;
    }

    public final String getCrossChainName() {
        return isMainStatusSuccess() ? this.toChainName : this.fromChainName;
    }

    public final boolean isOpenPackUpViewStatus() {
        return isPending() || isAccelerate() || isCanceling();
    }

    public final boolean isOpenErrorView() {
        return (isFail() && getErrorCodeMsg().gEmmrt()) || (isFail() && Intrinsics.EZpvd((Object) this.extendStatus, (Object) "1"));
    }

    public final boolean isPending() {
        return Intrinsics.EZpvd((Object) this.status, (Object) "0");
    }

    public final boolean isSuccess() {
        return Intrinsics.EZpvd((Object) this.status, (Object) "1");
    }

    public final boolean isProgressDoneStatus() {
        return isSuccess() || isFail() || isCanceled();
    }

    public final boolean isMainProgressDoneStatus() {
        return isFail() || isCanceled();
    }

    public final boolean isFail() {
        return Intrinsics.EZpvd((Object) this.status, (Object) MultiTransferSignData.DEFAULT_INTERVAL);
    }

    public final boolean isCanceled() {
        return Intrinsics.EZpvd((Object) this.status, (Object) "-2");
    }

    public final boolean isCanceling() {
        return Intrinsics.EZpvd((Object) this.status, (Object) "-3");
    }

    public final boolean isAccelerate() {
        return Intrinsics.EZpvd((Object) this.status, (Object) "-4");
    }

    public final boolean isBridge() {
        return Intrinsics.EZpvd((Object) this.swapTradeType, (Object) "2");
    }

    public final boolean showDiscount() {
        return this.finalOrder && this.isDiscountGasStation && C33129mqd.OLrzqt(this.status, "1");
    }

    public final boolean isShowChildOrderLink() {
        return C33129mqd.OLrzqt((CharSequence) this.exploreUrl) && !C22420hey.OLrzqt(this.swapTradeType);
    }

    public final boolean isMainStatusSuccess() {
        return Intrinsics.EZpvd((Object) this.mainStatus, (Object) "1");
    }

    public static /* synthetic */ boolean isSupportAccelerate$default(DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return dexMultiChildOrderInfoVo.isSupportAccelerate(z);
    }

    public final boolean isSupportAccelerate(boolean z) {
        return (this.isShowSpeedUp || this.isShowCancel || this.isShowSpeedUpCancel) && !C22822hmc.EZpvd(this.status) && z;
    }

    public final boolean isShowInstructionView() {
        return !(Intrinsics.EZpvd((Object) this.toastType, (Object) MultiTransferSignData.DEFAULT_INTERVAL) || this.toastType.length() <= 0 || Intrinsics.EZpvd((Object) this.toastType, (Object) OrderDetailListItem.SLIP_OUT)) || (C23313hvq.copydefault(this.extendStatus, "1") && !Intrinsics.EZpvd((Object) this.toastType, (Object) OrderDetailListItem.SLIP_OUT));
    }

    public final boolean isShowMultiPendingLastView() {
        return Intrinsics.EZpvd((Object) this.toastType, (Object) OrderDetailListItem.SLIP_OUT);
    }

    public final String getCoinValueShow(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (mainOrderIsFacetWithdrawOrder()) {
            C22689hkB c22689hkB = C22689hkB.EZpvd;
            if (!c22689hkB.EZpvd(this.toAmountOut) && !showProcessingData()) {
                return getCoinMark() + c22689hkB.AEQbTJ(this.toAmountOut, this.status, str, this.toTokenSymbol, false);
            }
        } else {
            C22689hkB c22689hkB2 = C22689hkB.EZpvd;
            if (!c22689hkB2.EZpvd(this.toAmountOut)) {
                return getCoinMark() + c22689hkB2.AEQbTJ(this.toAmountOut, this.status, str, this.toTokenSymbol, false);
            }
        }
        return "--";
    }

    public final String getCoinFromValueShow(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C22689hkB c22689hkB = C22689hkB.EZpvd;
        if (c22689hkB.EZpvd(this.toAmountOut)) {
            return "--";
        }
        return getCoinMark() + c22689hkB.copydefault(this.toAmountOut, this.status, str, this.toTokenSymbol, false);
    }

    public final boolean mainOrderIsFacetWithdrawOrder() {
        return Intrinsics.EZpvd((Object) this.mainSpecialOrderType, (Object) "3");
    }

    public final boolean showProcessingData() {
        return Intrinsics.EZpvd((Object) this.status, (Object) "11") || Intrinsics.EZpvd((Object) this.status, (Object) "12") || Intrinsics.EZpvd((Object) this.status, (Object) "10");
    }
}
