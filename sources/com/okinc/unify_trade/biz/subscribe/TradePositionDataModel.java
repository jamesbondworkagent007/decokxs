package com.okinc.unify_trade.biz.subscribe;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class TradePositionDataModel {
    private String avrPrice;
    private String cryptoPair;
    private String instrument;
    private boolean isUprising;
    private String leverage;
    private String liqPrice;
    private String margin;
    private String marginMode;
    private String marketPrice;
    private String pnl;
    private String pnlRate;
    private String side;
    private String totalConst;
    private String totalCrypto;
    private String totalPositionAssets;
    private String totalValue;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvrPrice() {
        return this.avrPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCryptoPair() {
        return this.cryptoPair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstrument() {
        return this.instrument;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLeverage() {
        return this.leverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLiqPrice() {
        return this.liqPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMargin() {
        return this.margin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarginMode() {
        return this.marginMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketPrice() {
        return this.marketPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnl() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnlRate() {
        return this.pnlRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSide() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalConst() {
        return this.totalConst;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalCrypto() {
        return this.totalCrypto;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalPositionAssets() {
        return this.totalPositionAssets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalValue() {
        return this.totalValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isUprising() {
        return this.isUprising;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvrPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.avrPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCryptoPair(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cryptoPair = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstrument(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instrument = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLeverage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.leverage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLiqPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.liqPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMargin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.margin = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMarginMode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.marginMode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMarketPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.marketPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPnl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pnl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPnlRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pnlRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSide(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.side = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalConst(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.totalConst = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalCrypto(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.totalCrypto = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalPositionAssets(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.totalPositionAssets = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.totalValue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUprising(boolean z) {
        this.isUprising = z;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.TradePositionDataModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TradePositionDataModel> serializer() {
            return TradePositionDataModel$$serializer.INSTANCE;
        }
    }

    public TradePositionDataModel() {
        this.cryptoPair = "";
        this.instrument = "";
        this.side = "";
        this.marginMode = "";
        this.avrPrice = "";
        this.leverage = "";
        this.totalCrypto = "";
        this.totalConst = "";
        this.margin = "";
        this.liqPrice = "";
        this.pnl = "";
        this.pnlRate = "";
        this.marketPrice = "";
        this.totalValue = "";
        this.totalPositionAssets = "";
    }

    public /* synthetic */ TradePositionDataModel(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, String str13, String str14, String str15, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.cryptoPair = "";
        } else {
            this.cryptoPair = str;
        }
        if ((i & 2) == 0) {
            this.instrument = "";
        } else {
            this.instrument = str2;
        }
        if ((i & 4) == 0) {
            this.side = "";
        } else {
            this.side = str3;
        }
        if ((i & 8) == 0) {
            this.marginMode = "";
        } else {
            this.marginMode = str4;
        }
        if ((i & 16) == 0) {
            this.avrPrice = "";
        } else {
            this.avrPrice = str5;
        }
        if ((i & 32) == 0) {
            this.leverage = "";
        } else {
            this.leverage = str6;
        }
        if ((i & 64) == 0) {
            this.totalCrypto = "";
        } else {
            this.totalCrypto = str7;
        }
        if ((i & 128) == 0) {
            this.totalConst = "";
        } else {
            this.totalConst = str8;
        }
        if ((i & 256) == 0) {
            this.margin = "";
        } else {
            this.margin = str9;
        }
        if ((i & 512) == 0) {
            this.liqPrice = "";
        } else {
            this.liqPrice = str10;
        }
        if ((i & 1024) == 0) {
            this.pnl = "";
        } else {
            this.pnl = str11;
        }
        if ((i & 2048) == 0) {
            this.pnlRate = "";
        } else {
            this.pnlRate = str12;
        }
        this.isUprising = (i & 4096) == 0 ? false : z;
        if ((i & 8192) == 0) {
            this.marketPrice = "";
        } else {
            this.marketPrice = str13;
        }
        if ((i & 16384) == 0) {
            this.totalValue = "";
        } else {
            this.totalValue = str14;
        }
        if ((i & 32768) == 0) {
            this.totalPositionAssets = "";
        } else {
            this.totalPositionAssets = str15;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(TradePositionDataModel tradePositionDataModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) tradePositionDataModel.cryptoPair, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, tradePositionDataModel.cryptoPair);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) tradePositionDataModel.instrument, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, tradePositionDataModel.instrument);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) tradePositionDataModel.side, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, tradePositionDataModel.side);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) tradePositionDataModel.marginMode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, tradePositionDataModel.marginMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) tradePositionDataModel.avrPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, tradePositionDataModel.avrPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) tradePositionDataModel.leverage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, tradePositionDataModel.leverage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) tradePositionDataModel.totalCrypto, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, tradePositionDataModel.totalCrypto);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) tradePositionDataModel.totalConst, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, tradePositionDataModel.totalConst);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) tradePositionDataModel.margin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, tradePositionDataModel.margin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) tradePositionDataModel.liqPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, tradePositionDataModel.liqPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) tradePositionDataModel.pnl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, tradePositionDataModel.pnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) tradePositionDataModel.pnlRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, tradePositionDataModel.pnlRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || tradePositionDataModel.isUprising) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 12, tradePositionDataModel.isUprising);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) tradePositionDataModel.marketPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, tradePositionDataModel.marketPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) tradePositionDataModel.totalValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, tradePositionDataModel.totalValue);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) && Intrinsics.EZpvd((Object) tradePositionDataModel.totalPositionAssets, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 15, tradePositionDataModel.totalPositionAssets);
    }
}
