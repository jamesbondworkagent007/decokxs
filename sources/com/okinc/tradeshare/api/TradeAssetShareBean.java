package com.okinc.tradeshare.api;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class TradeAssetShareBean {
    private String calcTime;
    private String coinFullName;
    private String coinIcon;
    private String coinName;
    private String holdingPer;
    private String holdingQuantity;
    private String holdingValue;
    private String holdingValueUsd;
    private Boolean isLiab;
    private String netBuyCcy;
    private String netBuyValue;
    private String pnl;
    private String pnlPer;
    private String pnlValue;
    private Boolean showNetBuy;
    private String unitCost;
    private String unitPrice;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCalcTime() {
        return this.calcTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinFullName() {
        return this.coinFullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinIcon() {
        return this.coinIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinName() {
        return this.coinName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHoldingPer() {
        return this.holdingPer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHoldingQuantity() {
        return this.holdingQuantity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHoldingValue() {
        return this.holdingValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHoldingValueUsd() {
        return this.holdingValueUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetBuyCcy() {
        return this.netBuyCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetBuyValue() {
        return this.netBuyValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnl() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnlPer() {
        return this.pnlPer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnlValue() {
        return this.pnlValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getShowNetBuy() {
        return this.showNetBuy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnitCost() {
        return this.unitCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnitPrice() {
        return this.unitPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isLiab() {
        return this.isLiab;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCalcTime(String str) {
        this.calcTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinFullName(String str) {
        this.coinFullName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinIcon(String str) {
        this.coinIcon = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinName(String str) {
        this.coinName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHoldingPer(String str) {
        this.holdingPer = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHoldingQuantity(String str) {
        this.holdingQuantity = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHoldingValue(String str) {
        this.holdingValue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHoldingValueUsd(String str) {
        this.holdingValueUsd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLiab(Boolean bool) {
        this.isLiab = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNetBuyCcy(String str) {
        this.netBuyCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNetBuyValue(String str) {
        this.netBuyValue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPnl(String str) {
        this.pnl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPnlPer(String str) {
        this.pnlPer = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPnlValue(String str) {
        this.pnlValue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowNetBuy(Boolean bool) {
        this.showNetBuy = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUnitCost(String str) {
        this.unitCost = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUnitPrice(String str) {
        this.unitPrice = str;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradeshare.api.TradeAssetShareBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TradeAssetShareBean> serializer() {
            return TradeAssetShareBean$$serializer.INSTANCE;
        }
    }

    public TradeAssetShareBean() {
        this.showNetBuy = Boolean.FALSE;
    }

    public /* synthetic */ TradeAssetShareBean(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool, String str11, String str12, String str13, String str14, String str15, Boolean bool2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.coinIcon = null;
        } else {
            this.coinIcon = str;
        }
        if ((i & 2) == 0) {
            this.coinName = null;
        } else {
            this.coinName = str2;
        }
        if ((i & 4) == 0) {
            this.coinFullName = null;
        } else {
            this.coinFullName = str3;
        }
        if ((i & 8) == 0) {
            this.holdingQuantity = null;
        } else {
            this.holdingQuantity = str4;
        }
        if ((i & 16) == 0) {
            this.holdingValue = null;
        } else {
            this.holdingValue = str5;
        }
        if ((i & 32) == 0) {
            this.holdingValueUsd = null;
        } else {
            this.holdingValueUsd = str6;
        }
        if ((i & 64) == 0) {
            this.holdingPer = null;
        } else {
            this.holdingPer = str7;
        }
        if ((i & 128) == 0) {
            this.unitPrice = null;
        } else {
            this.unitPrice = str8;
        }
        if ((i & 256) == 0) {
            this.unitCost = null;
        } else {
            this.unitCost = str9;
        }
        if ((i & 512) == 0) {
            this.pnlValue = null;
        } else {
            this.pnlValue = str10;
        }
        if ((i & 1024) == 0) {
            this.isLiab = null;
        } else {
            this.isLiab = bool;
        }
        if ((i & 2048) == 0) {
            this.pnlPer = null;
        } else {
            this.pnlPer = str11;
        }
        if ((i & 4096) == 0) {
            this.calcTime = null;
        } else {
            this.calcTime = str12;
        }
        if ((i & 8192) == 0) {
            this.pnl = null;
        } else {
            this.pnl = str13;
        }
        if ((i & 16384) == 0) {
            this.netBuyValue = null;
        } else {
            this.netBuyValue = str14;
        }
        if ((32768 & i) == 0) {
            this.netBuyCcy = null;
        } else {
            this.netBuyCcy = str15;
        }
        this.showNetBuy = (i & 65536) == 0 ? Boolean.FALSE : bool2;
    }

    public static final /* synthetic */ void write$Self$OKTrade_trade_api(TradeAssetShareBean tradeAssetShareBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || tradeAssetShareBean.coinIcon != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, tradeAssetShareBean.coinIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || tradeAssetShareBean.coinName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, tradeAssetShareBean.coinName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || tradeAssetShareBean.coinFullName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, tradeAssetShareBean.coinFullName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || tradeAssetShareBean.holdingQuantity != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, tradeAssetShareBean.holdingQuantity);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || tradeAssetShareBean.holdingValue != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, tradeAssetShareBean.holdingValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || tradeAssetShareBean.holdingValueUsd != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, tradeAssetShareBean.holdingValueUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || tradeAssetShareBean.holdingPer != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, tradeAssetShareBean.holdingPer);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || tradeAssetShareBean.unitPrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, tradeAssetShareBean.unitPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || tradeAssetShareBean.unitCost != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, tradeAssetShareBean.unitCost);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || tradeAssetShareBean.pnlValue != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, tradeAssetShareBean.pnlValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || tradeAssetShareBean.isLiab != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.INSTANCE, tradeAssetShareBean.isLiab);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || tradeAssetShareBean.pnlPer != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, tradeAssetShareBean.pnlPer);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || tradeAssetShareBean.calcTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, tradeAssetShareBean.calcTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || tradeAssetShareBean.pnl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, tradeAssetShareBean.pnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || tradeAssetShareBean.netBuyValue != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, tradeAssetShareBean.netBuyValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || tradeAssetShareBean.netBuyCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, tradeAssetShareBean.netBuyCcy);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) && Intrinsics.EZpvd(tradeAssetShareBean.showNetBuy, Boolean.FALSE)) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, BooleanSerializer.INSTANCE, tradeAssetShareBean.showNetBuy);
    }
}
