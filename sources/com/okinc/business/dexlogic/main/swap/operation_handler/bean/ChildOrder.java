package com.okinc.business.dexlogic.main.swap.operation_handler.bean;

import com.okinc.business.dexlogic.bean.DexBridgeShadowTokenPairInfoVo;
import com.okinc.business.dexlogic.bean.DexBridgeShadowTokenPairInfoVo$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class ChildOrder {
    private final String childOrderId;
    private DexBridgeShadowTokenPairInfoVo dexBridgeShadowTokenPairInfoVo;
    private String errorCode;
    private final String exploreUrl;
    private final String extendStatus;
    private final String fromAmount;
    private final String fromTokenSymbol;
    private final String fromTokenUsd;
    private final boolean isShowCancel;
    private final boolean isShowSpeedUp;
    private final boolean isShowSpeedUpCancel;
    private final String orderFailReason;
    private final String originalTokenSymbol;
    private final String refundAmount;
    private String refundChain;
    private String refundSymbol;
    private String speedUpTxHash;
    private final String status;
    private final String toAmount;
    private final String toTokenIcon;
    private final String toTokenSymbol;
    private final String toTokenUsd;
    private final String toastGuideUrl;
    private final String toastType;
    private final String transactionHash;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ChildOrder() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, false, (String) null, (DexBridgeShadowTokenPairInfoVo) null, (String) null, (String) null, (String) null, (String) null, 33554431, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.fromAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.toTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.toastType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.toastGuideUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.originalTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.toTokenIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.refundAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.extendStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component17() {
        return this.isShowSpeedUp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component18() {
        return this.isShowCancel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component19() {
        return this.isShowSpeedUpCancel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fromTokenUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.transactionHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexBridgeShadowTokenPairInfoVo component21() {
        return this.dexBridgeShadowTokenPairInfoVo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.errorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.refundSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.refundChain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.speedUpTxHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.toAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.toTokenUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.childOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.orderFailReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.exploreUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.fromTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChildOrder copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, boolean z, boolean z2, boolean z3, @NotNull String str17, DexBridgeShadowTokenPairInfoVo dexBridgeShadowTokenPairInfoVo, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21) {
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
        return new ChildOrder(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, z, z2, z3, str17, dexBridgeShadowTokenPairInfoVo, str18, str19, str20, str21);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChildOrder)) {
            return false;
        }
        ChildOrder childOrder = (ChildOrder) obj;
        return Intrinsics.EZpvd((Object) this.fromAmount, (Object) childOrder.fromAmount) && Intrinsics.EZpvd((Object) this.fromTokenUsd, (Object) childOrder.fromTokenUsd) && Intrinsics.EZpvd((Object) this.status, (Object) childOrder.status) && Intrinsics.EZpvd((Object) this.toAmount, (Object) childOrder.toAmount) && Intrinsics.EZpvd((Object) this.toTokenUsd, (Object) childOrder.toTokenUsd) && Intrinsics.EZpvd((Object) this.childOrderId, (Object) childOrder.childOrderId) && Intrinsics.EZpvd((Object) this.orderFailReason, (Object) childOrder.orderFailReason) && Intrinsics.EZpvd((Object) this.exploreUrl, (Object) childOrder.exploreUrl) && Intrinsics.EZpvd((Object) this.fromTokenSymbol, (Object) childOrder.fromTokenSymbol) && Intrinsics.EZpvd((Object) this.toTokenSymbol, (Object) childOrder.toTokenSymbol) && Intrinsics.EZpvd((Object) this.toastType, (Object) childOrder.toastType) && Intrinsics.EZpvd((Object) this.toastGuideUrl, (Object) childOrder.toastGuideUrl) && Intrinsics.EZpvd((Object) this.originalTokenSymbol, (Object) childOrder.originalTokenSymbol) && Intrinsics.EZpvd((Object) this.toTokenIcon, (Object) childOrder.toTokenIcon) && Intrinsics.EZpvd((Object) this.refundAmount, (Object) childOrder.refundAmount) && Intrinsics.EZpvd((Object) this.extendStatus, (Object) childOrder.extendStatus) && this.isShowSpeedUp == childOrder.isShowSpeedUp && this.isShowCancel == childOrder.isShowCancel && this.isShowSpeedUpCancel == childOrder.isShowSpeedUpCancel && Intrinsics.EZpvd((Object) this.transactionHash, (Object) childOrder.transactionHash) && Intrinsics.EZpvd(this.dexBridgeShadowTokenPairInfoVo, childOrder.dexBridgeShadowTokenPairInfoVo) && Intrinsics.EZpvd((Object) this.errorCode, (Object) childOrder.errorCode) && Intrinsics.EZpvd((Object) this.refundSymbol, (Object) childOrder.refundSymbol) && Intrinsics.EZpvd((Object) this.refundChain, (Object) childOrder.refundChain) && Intrinsics.EZpvd((Object) this.speedUpTxHash, (Object) childOrder.speedUpTxHash);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChildOrderId() {
        return this.childOrderId;
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
    public final String getFromAmount() {
        return this.fromAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenSymbol() {
        return this.fromTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenUsd() {
        return this.fromTokenUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderFailReason() {
        return this.orderFailReason;
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
    public final String getRefundChain() {
        return this.refundChain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRefundSymbol() {
        return this.refundSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpeedUpTxHash() {
        return this.speedUpTxHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToAmount() {
        return this.toAmount;
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
    public final String getToTokenUsd() {
        return this.toTokenUsd;
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
        int iHashCode = this.fromAmount.hashCode();
        int iHashCode2 = this.fromTokenUsd.hashCode();
        int iHashCode3 = this.status.hashCode();
        int iHashCode4 = this.toAmount.hashCode();
        int iHashCode5 = this.toTokenUsd.hashCode();
        int iHashCode6 = this.childOrderId.hashCode();
        int iHashCode7 = this.orderFailReason.hashCode();
        int iHashCode8 = this.exploreUrl.hashCode();
        int iHashCode9 = this.fromTokenSymbol.hashCode();
        int iHashCode10 = this.toTokenSymbol.hashCode();
        int iHashCode11 = this.toastType.hashCode();
        int iHashCode12 = this.toastGuideUrl.hashCode();
        int iHashCode13 = this.originalTokenSymbol.hashCode();
        int iHashCode14 = this.toTokenIcon.hashCode();
        int iHashCode15 = this.refundAmount.hashCode();
        int iHashCode16 = this.extendStatus.hashCode();
        int iHashCode17 = Boolean.hashCode(this.isShowSpeedUp);
        int iHashCode18 = Boolean.hashCode(this.isShowCancel);
        int iHashCode19 = Boolean.hashCode(this.isShowSpeedUpCancel);
        int iHashCode20 = this.transactionHash.hashCode();
        DexBridgeShadowTokenPairInfoVo dexBridgeShadowTokenPairInfoVo = this.dexBridgeShadowTokenPairInfoVo;
        return (((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + (dexBridgeShadowTokenPairInfoVo == null ? 0 : dexBridgeShadowTokenPairInfoVo.hashCode())) * 31) + this.errorCode.hashCode()) * 31) + this.refundSymbol.hashCode()) * 31) + this.refundChain.hashCode()) * 31) + this.speedUpTxHash.hashCode();
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
    public final void setDexBridgeShadowTokenPairInfoVo(DexBridgeShadowTokenPairInfoVo dexBridgeShadowTokenPairInfoVo) {
        this.dexBridgeShadowTokenPairInfoVo = dexBridgeShadowTokenPairInfoVo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setErrorCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.errorCode = str;
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
    public final void setSpeedUpTxHash(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.speedUpTxHash = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ChildOrder(fromAmount=" + this.fromAmount + ", fromTokenUsd=" + this.fromTokenUsd + ", status=" + this.status + ", toAmount=" + this.toAmount + ", toTokenUsd=" + this.toTokenUsd + ", childOrderId=" + this.childOrderId + ", orderFailReason=" + this.orderFailReason + ", exploreUrl=" + this.exploreUrl + ", fromTokenSymbol=" + this.fromTokenSymbol + ", toTokenSymbol=" + this.toTokenSymbol + ", toastType=" + this.toastType + ", toastGuideUrl=" + this.toastGuideUrl + ", originalTokenSymbol=" + this.originalTokenSymbol + ", toTokenIcon=" + this.toTokenIcon + ", refundAmount=" + this.refundAmount + ", extendStatus=" + this.extendStatus + ", isShowSpeedUp=" + this.isShowSpeedUp + ", isShowCancel=" + this.isShowCancel + ", isShowSpeedUpCancel=" + this.isShowSpeedUpCancel + ", transactionHash=" + this.transactionHash + ", dexBridgeShadowTokenPairInfoVo=" + this.dexBridgeShadowTokenPairInfoVo + ", errorCode=" + this.errorCode + ", refundSymbol=" + this.refundSymbol + ", refundChain=" + this.refundChain + ", speedUpTxHash=" + this.speedUpTxHash + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.main.swap.operation_handler.bean.ChildOrder.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ChildOrder> serializer() {
            return ChildOrder$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ChildOrder(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, boolean z, boolean z2, boolean z3, String str17, DexBridgeShadowTokenPairInfoVo dexBridgeShadowTokenPairInfoVo, String str18, String str19, String str20, String str21, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.fromAmount = "";
        } else {
            this.fromAmount = str;
        }
        if ((i & 2) == 0) {
            this.fromTokenUsd = "";
        } else {
            this.fromTokenUsd = str2;
        }
        if ((i & 4) == 0) {
            this.status = "";
        } else {
            this.status = str3;
        }
        if ((i & 8) == 0) {
            this.toAmount = "";
        } else {
            this.toAmount = str4;
        }
        if ((i & 16) == 0) {
            this.toTokenUsd = "";
        } else {
            this.toTokenUsd = str5;
        }
        if ((i & 32) == 0) {
            this.childOrderId = "";
        } else {
            this.childOrderId = str6;
        }
        if ((i & 64) == 0) {
            this.orderFailReason = "";
        } else {
            this.orderFailReason = str7;
        }
        if ((i & 128) == 0) {
            this.exploreUrl = "";
        } else {
            this.exploreUrl = str8;
        }
        if ((i & 256) == 0) {
            this.fromTokenSymbol = "";
        } else {
            this.fromTokenSymbol = str9;
        }
        if ((i & 512) == 0) {
            this.toTokenSymbol = "";
        } else {
            this.toTokenSymbol = str10;
        }
        if ((i & 1024) == 0) {
            this.toastType = "";
        } else {
            this.toastType = str11;
        }
        if ((i & 2048) == 0) {
            this.toastGuideUrl = "";
        } else {
            this.toastGuideUrl = str12;
        }
        if ((i & 4096) == 0) {
            this.originalTokenSymbol = "";
        } else {
            this.originalTokenSymbol = str13;
        }
        if ((i & 8192) == 0) {
            this.toTokenIcon = "";
        } else {
            this.toTokenIcon = str14;
        }
        if ((i & 16384) == 0) {
            this.refundAmount = "";
        } else {
            this.refundAmount = str15;
        }
        if ((32768 & i) == 0) {
            this.extendStatus = "";
        } else {
            this.extendStatus = str16;
        }
        if ((65536 & i) == 0) {
            this.isShowSpeedUp = false;
        } else {
            this.isShowSpeedUp = z;
        }
        if ((131072 & i) == 0) {
            this.isShowCancel = false;
        } else {
            this.isShowCancel = z2;
        }
        if ((262144 & i) == 0) {
            this.isShowSpeedUpCancel = false;
        } else {
            this.isShowSpeedUpCancel = z3;
        }
        if ((524288 & i) == 0) {
            this.transactionHash = "";
        } else {
            this.transactionHash = str17;
        }
        this.dexBridgeShadowTokenPairInfoVo = (1048576 & i) == 0 ? null : dexBridgeShadowTokenPairInfoVo;
        if ((2097152 & i) == 0) {
            this.errorCode = "";
        } else {
            this.errorCode = str18;
        }
        if ((4194304 & i) == 0) {
            this.refundSymbol = "";
        } else {
            this.refundSymbol = str19;
        }
        if ((8388608 & i) == 0) {
            this.refundChain = "";
        } else {
            this.refundChain = str20;
        }
        if ((i & 16777216) == 0) {
            this.speedUpTxHash = "";
        } else {
            this.speedUpTxHash = str21;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(ChildOrder childOrder, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) childOrder.fromAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, childOrder.fromAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) childOrder.fromTokenUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, childOrder.fromTokenUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) childOrder.status, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, childOrder.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) childOrder.toAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, childOrder.toAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) childOrder.toTokenUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, childOrder.toTokenUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) childOrder.childOrderId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, childOrder.childOrderId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) childOrder.orderFailReason, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, childOrder.orderFailReason);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) childOrder.exploreUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, childOrder.exploreUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) childOrder.fromTokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, childOrder.fromTokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) childOrder.toTokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, childOrder.toTokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) childOrder.toastType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, childOrder.toastType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) childOrder.toastGuideUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, childOrder.toastGuideUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) childOrder.originalTokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, childOrder.originalTokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) childOrder.toTokenIcon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, childOrder.toTokenIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) childOrder.refundAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, childOrder.refundAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) childOrder.extendStatus, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, childOrder.extendStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || childOrder.isShowSpeedUp) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 16, childOrder.isShowSpeedUp);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || childOrder.isShowCancel) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 17, childOrder.isShowCancel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || childOrder.isShowSpeedUpCancel) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 18, childOrder.isShowSpeedUpCancel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) childOrder.transactionHash, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, childOrder.transactionHash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || childOrder.dexBridgeShadowTokenPairInfoVo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, DexBridgeShadowTokenPairInfoVo$$serializer.INSTANCE, childOrder.dexBridgeShadowTokenPairInfoVo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) childOrder.errorCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, childOrder.errorCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) childOrder.refundSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, childOrder.refundSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) childOrder.refundChain, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, childOrder.refundChain);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) && Intrinsics.EZpvd((Object) childOrder.speedUpTxHash, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 24, childOrder.speedUpTxHash);
    }

    public ChildOrder(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, boolean z, boolean z2, boolean z3, @NotNull String str17, DexBridgeShadowTokenPairInfoVo dexBridgeShadowTokenPairInfoVo, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21) {
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
        this.fromAmount = str;
        this.fromTokenUsd = str2;
        this.status = str3;
        this.toAmount = str4;
        this.toTokenUsd = str5;
        this.childOrderId = str6;
        this.orderFailReason = str7;
        this.exploreUrl = str8;
        this.fromTokenSymbol = str9;
        this.toTokenSymbol = str10;
        this.toastType = str11;
        this.toastGuideUrl = str12;
        this.originalTokenSymbol = str13;
        this.toTokenIcon = str14;
        this.refundAmount = str15;
        this.extendStatus = str16;
        this.isShowSpeedUp = z;
        this.isShowCancel = z2;
        this.isShowSpeedUpCancel = z3;
        this.transactionHash = str17;
        this.dexBridgeShadowTokenPairInfoVo = dexBridgeShadowTokenPairInfoVo;
        this.errorCode = str18;
        this.refundSymbol = str19;
        this.refundChain = str20;
        this.speedUpTxHash = str21;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0122: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r52v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r52v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r52v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r52v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r52v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r52v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r52v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r52v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r52v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r52v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r52v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r52v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r52v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r52v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r52v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r52v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x008d: ARITH (r52v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? false : (r43v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x009a: ARITH (r52v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? false : (r44v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00a5: ARITH (r52v0 int) & (262144 int) A[WRAPPED]) == (0 int)) ? (r45v0 boolean) : false)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ae: ARITH (r52v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:com.okinc.business.dexlogic.bean.DexBridgeShadowTokenPairInfoVo:?: TERNARY null = ((wrap:int:0x00b9: ARITH (r52v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.DexBridgeShadowTokenPairInfoVo) : (r47v0 com.okinc.business.dexlogic.bean.DexBridgeShadowTokenPairInfoVo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c4: ARITH (r52v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00cf: ARITH (r52v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00da: ARITH (r52v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e5: ARITH (r52v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.String, com.okinc.business.dexlogic.bean.DexBridgeShadowTokenPairInfoVo, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:387) call: com.okinc.business.dexlogic.main.swap.operation_handler.bean.ChildOrder.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.String, com.okinc.business.dexlogic.bean.DexBridgeShadowTokenPairInfoVo, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ChildOrder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, boolean z, boolean z2, boolean z3, String str17, DexBridgeShadowTokenPairInfoVo dexBridgeShadowTokenPairInfoVo, String str18, String str19, String str20, String str21, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? false : z, (i & 131072) != 0 ? false : z2, (i & 262144) == 0 ? z3 : false, (i & 524288) != 0 ? "" : str17, (i & 1048576) != 0 ? null : dexBridgeShadowTokenPairInfoVo, (i & 2097152) != 0 ? "" : str18, (i & 4194304) != 0 ? "" : str19, (i & 8388608) != 0 ? "" : str20, (i & 16777216) != 0 ? "" : str21);
    }
}
