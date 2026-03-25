package com.okinc.business.dexlogic.main.swap.trade.bean;

import com.okinc.business.dexlogic.bean.ConsumeData;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.main.limmitorder.bean.LimitCalResult;
import java.math.RoundingMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C22332hdP;
import o.C23271hvA;
import o.C23272hvB;
import o.C23274hvD;
import o.C23311hvo;
import o.C23313hvq;
import o.C25352ivB;
import o.C33070mpX;
import o.C33129mqd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class TradeInputGroup {
    public static final int $stable = 8;
    private ConsumeData<ExchangeRateData> exchangeRateData;
    private ConsumeData<TradeInputData> fromData;
    private ConsumeData<TradeInputData> toData;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputGroup */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TradeInputGroup copy$default(TradeInputGroup tradeInputGroup, ConsumeData consumeData, ConsumeData consumeData2, ConsumeData consumeData3, int i, Object obj) {
        if ((i & 1) != 0) {
            consumeData = tradeInputGroup.fromData;
        }
        if ((i & 2) != 0) {
            consumeData2 = tradeInputGroup.toData;
        }
        if ((i & 4) != 0) {
            consumeData3 = tradeInputGroup.exchangeRateData;
        }
        return tradeInputGroup.copy(consumeData, consumeData2, consumeData3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<TradeInputData> component1() {
        return this.fromData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<TradeInputData> component2() {
        return this.toData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<ExchangeRateData> component3() {
        return this.exchangeRateData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeInputGroup copy(@NotNull ConsumeData<TradeInputData> consumeData, @NotNull ConsumeData<TradeInputData> consumeData2, @NotNull ConsumeData<ExchangeRateData> consumeData3) {
        Intrinsics.checkNotNullParameter(consumeData, "");
        Intrinsics.checkNotNullParameter(consumeData2, "");
        Intrinsics.checkNotNullParameter(consumeData3, "");
        return new TradeInputGroup(consumeData, consumeData2, consumeData3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradeInputGroup)) {
            return false;
        }
        TradeInputGroup tradeInputGroup = (TradeInputGroup) obj;
        return Intrinsics.EZpvd(this.fromData, tradeInputGroup.fromData) && Intrinsics.EZpvd(this.toData, tradeInputGroup.toData) && Intrinsics.EZpvd(this.exchangeRateData, tradeInputGroup.exchangeRateData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<ExchangeRateData> getExchangeRateData() {
        return this.exchangeRateData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<TradeInputData> getFromData() {
        return this.fromData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<TradeInputData> getToData() {
        return this.toData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.fromData.hashCode() * 31) + this.toData.hashCode()) * 31) + this.exchangeRateData.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExchangeRateData(@NotNull ConsumeData<ExchangeRateData> consumeData) {
        Intrinsics.checkNotNullParameter(consumeData, "");
        this.exchangeRateData = consumeData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFromData(@NotNull ConsumeData<TradeInputData> consumeData) {
        Intrinsics.checkNotNullParameter(consumeData, "");
        this.fromData = consumeData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToData(@NotNull ConsumeData<TradeInputData> consumeData) {
        Intrinsics.checkNotNullParameter(consumeData, "");
        this.toData = consumeData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TradeInputGroup(fromData=" + this.fromData + ", toData=" + this.toData + ", exchangeRateData=" + this.exchangeRateData + ")";
    }

    public TradeInputGroup(@NotNull ConsumeData<TradeInputData> consumeData, @NotNull ConsumeData<TradeInputData> consumeData2, @NotNull ConsumeData<ExchangeRateData> consumeData3) {
        Intrinsics.checkNotNullParameter(consumeData, "");
        Intrinsics.checkNotNullParameter(consumeData2, "");
        Intrinsics.checkNotNullParameter(consumeData3, "");
        this.fromData = consumeData;
        this.toData = consumeData2;
        this.exchangeRateData = consumeData3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000f: CONSTRUCTOR 
  (r1v0 com.okinc.business.dexlogic.bean.ConsumeData)
  (r2v0 com.okinc.business.dexlogic.bean.ConsumeData)
  (wrap:com.okinc.business.dexlogic.bean.ConsumeData:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.dexlogic.bean.ConsumeData:0x000b: INVOKE 
  (wrap:com.okinc.business.dexlogic.main.swap.trade.bean.ExchangeRateData:0x0008: CONSTRUCTOR (""), ("") A[MD:(java.lang.String, java.lang.String):void (m), WRAPPED] (LINE:106) call: com.okinc.business.dexlogic.main.swap.trade.bean.ExchangeRateData.<init>(java.lang.String, java.lang.String):void type: CONSTRUCTOR)
 STATIC call: o.hdP.EZpvd(java.lang.Object):com.okinc.business.dexlogic.bean.ConsumeData A[MD:<T>:(T):com.okinc.business.dexlogic.bean.ConsumeData<T> (m), WRAPPED] (LINE:109)) : (r3v0 com.okinc.business.dexlogic.bean.ConsumeData))
 A[MD:(com.okinc.business.dexlogic.bean.ConsumeData<com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputData>, com.okinc.business.dexlogic.bean.ConsumeData<com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputData>, com.okinc.business.dexlogic.bean.ConsumeData<com.okinc.business.dexlogic.main.swap.trade.bean.ExchangeRateData>):void (m)] (LINE:103) call: com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputGroup.<init>(com.okinc.business.dexlogic.bean.ConsumeData, com.okinc.business.dexlogic.bean.ConsumeData, com.okinc.business.dexlogic.bean.ConsumeData):void type: THIS */
    public /* synthetic */ TradeInputGroup(ConsumeData consumeData, ConsumeData consumeData2, ConsumeData consumeData3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(consumeData, consumeData2, (i & 4) != 0 ? C22332hdP.EZpvd(new ExchangeRateData("", "")) : consumeData3);
    }

    public final TradeInputGroup setFromBalance(@NotNull String str, @NotNull String str2, boolean z, boolean z2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        FromToBalance balance = this.fromData.getData().getBalance();
        return copy$default(this, C22332hdP.EZpvd(TradeInputData.copy$default(this.fromData.getData(), balance.copy((2037 & 1) != 0 ? balance.title : null, (2037 & 2) != 0 ? balance.content : C22332hdP.EZpvd(str), (2037 & 4) != 0 ? balance.action : null, (2037 & 8) != 0 ? balance.data : str2, (2037 & 16) != 0 ? balance.error : C22332hdP.EZpvd(Boolean.valueOf(z)), (2037 & 32) != 0 ? balance.errorContent : null, (2037 & 64) != 0 ? balance.needShowAction : false, (2037 & 128) != 0 ? balance.finish : z2, (2037 & 256) != 0 ? balance.availableCurrencyAmount : str3, (2037 & 512) != 0 ? balance.availableAmountNum : str4, (2037 & 1024) != 0 ? balance.balanceBracket : null), null, null, false, 14, null)), null, null, 6, null);
    }

    public static /* synthetic */ TradeInputGroup setToBalance$default(TradeInputGroup tradeInputGroup, String str, String str2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return tradeInputGroup.setToBalance(str, str2, z, z2);
    }

    public final TradeInputGroup setToBalance(@NotNull String str, @NotNull String str2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        FromToBalance balance = this.toData.getData().getBalance();
        return copy$default(this, null, C22332hdP.EZpvd(TradeInputData.copy$default(this.toData.getData(), balance.copy((2037 & 1) != 0 ? balance.title : null, (2037 & 2) != 0 ? balance.content : C22332hdP.EZpvd(str), (2037 & 4) != 0 ? balance.action : null, (2037 & 8) != 0 ? balance.data : str2, (2037 & 16) != 0 ? balance.error : C22332hdP.EZpvd(Boolean.valueOf(z)), (2037 & 32) != 0 ? balance.errorContent : null, (2037 & 64) != 0 ? balance.needShowAction : false, (2037 & 128) != 0 ? balance.finish : z2, (2037 & 256) != 0 ? balance.availableCurrencyAmount : null, (2037 & 512) != 0 ? balance.availableAmountNum : null, (2037 & 1024) != 0 ? balance.balanceBracket : null), null, null, false, 14, null)), null, 5, null);
    }

    public final TradeInputGroup setFromCoinData(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        ImageTextData imageTextData;
        if (dexMultiTokenInfoBean == null) {
            imageTextData = new ImageTextData(C22332hdP.EZpvd(C33070mpX.AYXKKw(C23274hvD.Fragment.ULRxlR)), 0, null, null, null, 30, null);
        } else {
            imageTextData = new ImageTextData(C22332hdP.EZpvd(dexMultiTokenInfoBean.getTokenSymbol()), 0, C22332hdP.EZpvd(dexMultiTokenInfoBean.getTokenLogoUrl()), C22332hdP.EZpvd(dexMultiTokenInfoBean.getChainLogoUrl()), dexMultiTokenInfoBean);
        }
        return copy$default(this, C22332hdP.EZpvd(TradeInputData.copy$default(this.fromData.getData(), null, imageTextData, new EditTextData("", C22332hdP.EZpvd(""), "", "", 0, true, false, null, null, false, null, null, null, false, false, 32704, null), false, 9, null)), null, C22332hdP.EZpvd(this.exchangeRateData.getData().copy("", "")), 2, null);
    }

    public final TradeInputGroup setToCoinData(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        ImageTextData imageTextData;
        if (dexMultiTokenInfoBean == null) {
            imageTextData = new ImageTextData(C22332hdP.EZpvd(C33070mpX.AYXKKw(C23274hvD.Fragment.ULRxlR)), 0, null, null, null, 30, null);
        } else {
            imageTextData = new ImageTextData(C22332hdP.EZpvd(dexMultiTokenInfoBean.getTokenSymbol()), 0, C22332hdP.EZpvd(dexMultiTokenInfoBean.getTokenLogoUrl()), C22332hdP.EZpvd(dexMultiTokenInfoBean.getChainLogoUrl()), dexMultiTokenInfoBean);
        }
        return copy$default(this, null, C22332hdP.EZpvd(TradeInputData.copy$default(this.toData.getData(), null, imageTextData, new EditTextData("", C22332hdP.EZpvd(""), "", "", 0, true, false, null, null, false, null, null, null, false, false, 32704, null), false, 9, null)), C22332hdP.EZpvd(this.exchangeRateData.getData().copy("", "")), 1, null);
    }

    public TradeInputGroup forwardChangeFromTo(@NotNull String str, boolean z) {
        String strEZpvd;
        EditTextData editTextDataCopy;
        String decimals;
        Intrinsics.checkNotNullParameter(str, "");
        ImageTextData coinData = this.fromData.getData().getCoinData();
        EditTextData editData = this.fromData.getData().getEditData();
        FromToBalance balance = this.fromData.getData().getBalance();
        ImageTextData coinData2 = this.toData.getData().getCoinData();
        EditTextData editData2 = this.toData.getData().getEditData();
        FromToBalance balance2 = this.toData.getData().getBalance();
        ImageTextData imageTextDataCopy = coinData.copy(C22332hdP.EZpvd(coinData2.getText().getData()), coinData2.getType(), C22332hdP.EZpvd(coinData2.getImageUrl().getData()), coinData2.getChainLogoUrl(), coinData2.getData());
        FromToBalance fromToBalanceCopy = balance.copy((2037 & 1) != 0 ? balance.title : null, (2037 & 2) != 0 ? balance.content : C22332hdP.EZpvd(balance2.getContent().getData()), (2037 & 4) != 0 ? balance.action : null, (2037 & 8) != 0 ? balance.data : balance2.getData(), (2037 & 16) != 0 ? balance.error : null, (2037 & 32) != 0 ? balance.errorContent : null, (2037 & 64) != 0 ? balance.needShowAction : false, (2037 & 128) != 0 ? balance.finish : false, (2037 & 256) != 0 ? balance.availableCurrencyAmount : null, (2037 & 512) != 0 ? balance.availableAmountNum : null, (2037 & 1024) != 0 ? balance.balanceBracket : null);
        if (editData2.getData().length() == 0) {
            editTextDataCopy = editData.copy((32749 & 1) != 0 ? editData.content : "", (32749 & 2) != 0 ? editData.label : C22332hdP.EZpvd(""), (32749 & 4) != 0 ? editData.data : "", (32749 & 8) != 0 ? editData.checkData : null, (32749 & 16) != 0 ? editData.status : 0, (32749 & 32) != 0 ? editData.setInput : true, (32749 & 64) != 0 ? editData.resetFoucs : true, (32749 & 128) != 0 ? editData.secondLabel : null, (32749 & 256) != 0 ? editData.secondDataLabel : null, (32749 & 512) != 0 ? editData.isWarning : false, (32749 & 1024) != 0 ? editData.maxData : null, (32749 & 2048) != 0 ? editData.originPrice : null, (32749 & 4096) != 0 ? editData.reverseInputData : null, (32749 & 8192) != 0 ? editData.needForbidden : true, (32749 & 16384) != 0 ? editData.isLimit : false);
        } else {
            String fromDataOrigin = editData2.getFromDataOrigin();
            if (C23313hvq.copydefault(fromDataOrigin, 0) || editData.getData().length() == 0) {
                strEZpvd = "";
            } else {
                C23271hvA c23271hvA = C23271hvA.copydefault;
                DexMultiTokenInfoBean data = imageTextDataCopy.getData();
                if (data == null || (decimals = data.getDecimals()) == null) {
                    decimals = "12";
                }
                strEZpvd = c23271hvA.EZpvd(fromDataOrigin, decimals);
            }
            String fromDataOrigin2 = editData2.getFromDataOrigin();
            editTextDataCopy = editData.copy((32749 & 1) != 0 ? editData.content : z ? "" : strEZpvd, (32749 & 2) != 0 ? editData.label : editData2.getLabel(), (32749 & 4) != 0 ? editData.data : z ? "" : fromDataOrigin2, (32749 & 8) != 0 ? editData.checkData : null, (32749 & 16) != 0 ? editData.status : 0, (32749 & 32) != 0 ? editData.setInput : true, (32749 & 64) != 0 ? editData.resetFoucs : true, (32749 & 128) != 0 ? editData.secondLabel : null, (32749 & 256) != 0 ? editData.secondDataLabel : null, (32749 & 512) != 0 ? editData.isWarning : false, (32749 & 1024) != 0 ? editData.maxData : null, (32749 & 2048) != 0 ? editData.originPrice : C22332hdP.EZpvd(""), (32749 & 4096) != 0 ? editData.reverseInputData : null, (32749 & 8192) != 0 ? editData.needForbidden : true, (32749 & 16384) != 0 ? editData.isLimit : false);
        }
        return copy$default(this, C22332hdP.EZpvd(TradeInputData.copy$default(this.fromData.getData(), fromToBalanceCopy, imageTextDataCopy, editTextDataCopy, false, 8, null)), C22332hdP.EZpvd(TradeInputData.copy$default(this.toData.getData(), balance2.copy((2037 & 1) != 0 ? balance2.title : null, (2037 & 2) != 0 ? balance2.content : C22332hdP.EZpvd(balance.getContent().getData()), (2037 & 4) != 0 ? balance2.action : null, (2037 & 8) != 0 ? balance2.data : balance.getData(), (2037 & 16) != 0 ? balance2.error : null, (2037 & 32) != 0 ? balance2.errorContent : null, (2037 & 64) != 0 ? balance2.needShowAction : false, (2037 & 128) != 0 ? balance2.finish : false, (2037 & 256) != 0 ? balance2.availableCurrencyAmount : null, (2037 & 512) != 0 ? balance2.availableAmountNum : null, (2037 & 1024) != 0 ? balance2.balanceBracket : null), coinData2.copy(C22332hdP.EZpvd(coinData.getText().getData()), coinData.getType(), C22332hdP.EZpvd(coinData.getImageUrl().getData()), coinData.getChainLogoUrl(), coinData.getData()), editData2.copy((32749 & 1) != 0 ? editData2.content : "", (32749 & 2) != 0 ? editData2.label : C22332hdP.EZpvd(""), (32749 & 4) != 0 ? editData2.data : "", (32749 & 8) != 0 ? editData2.checkData : null, (32749 & 16) != 0 ? editData2.status : 0, (32749 & 32) != 0 ? editData2.setInput : true, (32749 & 64) != 0 ? editData2.resetFoucs : false, (32749 & 128) != 0 ? editData2.secondLabel : C22332hdP.EZpvd(""), (32749 & 256) != 0 ? editData2.secondDataLabel : null, (32749 & 512) != 0 ? editData2.isWarning : false, (32749 & 1024) != 0 ? editData2.maxData : null, (32749 & 2048) != 0 ? editData2.originPrice : C22332hdP.EZpvd(""), (32749 & 4096) != 0 ? editData2.reverseInputData : null, (32749 & 8192) != 0 ? editData2.needForbidden : true, (32749 & 16384) != 0 ? editData2.isLimit : false), false, 8, null)), null, 4, null);
    }

    public TradeInputGroup setForwardFromToAmount(@NotNull QuotePriceRes quotePriceRes, @NotNull String str) {
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (quotePriceRes.getSuccess()) {
            EditTextData editData = this.fromData.getData().getEditData();
            EditTextData editData2 = this.toData.getData().getEditData();
            return copy$default(this, C22332hdP.EZpvd(TradeInputData.copy$default(this.fromData.getData(), null, null, editData.copy((32749 & 1) != 0 ? editData.content : null, (32749 & 2) != 0 ? editData.label : C22332hdP.EZpvd(C33129mqd.OLrzqt((CharSequence) quotePriceRes.getCommonDexInfo().getFromTokenPrice()) ? C23272hvB.getShowDataWithPrefix$default(C23272hvB.KWHzl, quotePriceRes.getCommonDexInfo().getFromTokenPrice(), false, false, RoundingMode.DOWN, false, 22, null) : ""), (32749 & 4) != 0 ? editData.data : null, (32749 & 8) != 0 ? editData.checkData : null, (32749 & 16) != 0 ? editData.status : 1, (32749 & 32) != 0 ? editData.setInput : false, (32749 & 64) != 0 ? editData.resetFoucs : false, (32749 & 128) != 0 ? editData.secondLabel : null, (32749 & 256) != 0 ? editData.secondDataLabel : null, (32749 & 512) != 0 ? editData.isWarning : false, (32749 & 1024) != 0 ? editData.maxData : null, (32749 & 2048) != 0 ? editData.originPrice : new ConsumeData((Object) quotePriceRes.getCommonDexInfo().getFromTokenPrice(), false, 2, (DefaultConstructorMarker) null), (32749 & 4096) != 0 ? editData.reverseInputData : null, (32749 & 8192) != 0 ? editData.needForbidden : false, (32749 & 16384) != 0 ? editData.isLimit : false), false, 11, null)), C22332hdP.EZpvd(TradeInputData.copy$default(this.toData.getData(), null, null, editData2.copy((32749 & 1) != 0 ? editData2.content : quotePriceRes.isRiskToken() ? "" : C23271hvA.copydefault.EZpvd(quotePriceRes.receiveAmount(), quotePriceRes.toToken().getDecimals()), (32749 & 2) != 0 ? editData2.label : C22332hdP.EZpvd((!C33129mqd.OLrzqt((CharSequence) quotePriceRes.toTokenPrice()) || quotePriceRes.isRiskToken()) ? "" : C23272hvB.getShowDataWithPrefix$default(C23272hvB.KWHzl, quotePriceRes.toTokenPrice(), false, false, RoundingMode.DOWN, false, 22, null)), (32749 & 4) != 0 ? editData2.data : quotePriceRes.receiveAmount(), (32749 & 8) != 0 ? editData2.checkData : null, (32749 & 16) != 0 ? editData2.status : 1, (32749 & 32) != 0 ? editData2.setInput : true, (32749 & 64) != 0 ? editData2.resetFoucs : false, (32749 & 128) != 0 ? editData2.secondLabel : C22332hdP.EZpvd(quotePriceRes.getPriceDiffAmountShow()), (32749 & 256) != 0 ? editData2.secondDataLabel : quotePriceRes.getPriceDiffAmount(), (32749 & 512) != 0 ? editData2.isWarning : quotePriceRes.isWarning(), (32749 & 1024) != 0 ? editData2.maxData : null, (32749 & 2048) != 0 ? editData2.originPrice : new ConsumeData((Object) quotePriceRes.toTokenPrice(), false, 2, (DefaultConstructorMarker) null), (32749 & 4096) != 0 ? editData2.reverseInputData : "", (32749 & 8192) != 0 ? editData2.needForbidden : true, (32749 & 16384) != 0 ? editData2.isLimit : false), false, 11, null)), null, 4, null);
        }
        if (quotePriceRes.isReset()) {
            return resetForwardPrice();
        }
        return quoteForwardPrice(quotePriceRes);
    }

    private final TradeInputGroup quoteForwardPrice(QuotePriceRes quotePriceRes) {
        EditTextData editData = this.fromData.getData().getEditData();
        this.toData.getData().getEditData();
        ConsumeData<String> label = editData.getLabel();
        String showDataWithPrefix$default = C33129mqd.OLrzqt((CharSequence) quotePriceRes.getCommonDexInfo().getFromTokenPrice()) ? C23272hvB.getShowDataWithPrefix$default(C23272hvB.KWHzl, quotePriceRes.getCommonDexInfo().getFromTokenPrice(), false, false, RoundingMode.DOWN, false, 22, null) : "";
        if (C33129mqd.OLrzqt((CharSequence) showDataWithPrefix$default)) {
            label = C22332hdP.EZpvd(showDataWithPrefix$default);
        }
        return copy$default(this, C22332hdP.EZpvd(TradeInputData.copy$default(this.fromData.getData(), null, null, editData.copy((32749 & 1) != 0 ? editData.content : null, (32749 & 2) != 0 ? editData.label : label, (32749 & 4) != 0 ? editData.data : null, (32749 & 8) != 0 ? editData.checkData : null, (32749 & 16) != 0 ? editData.status : 1, (32749 & 32) != 0 ? editData.setInput : false, (32749 & 64) != 0 ? editData.resetFoucs : false, (32749 & 128) != 0 ? editData.secondLabel : null, (32749 & 256) != 0 ? editData.secondDataLabel : null, (32749 & 512) != 0 ? editData.isWarning : false, (32749 & 1024) != 0 ? editData.maxData : null, (32749 & 2048) != 0 ? editData.originPrice : null, (32749 & 4096) != 0 ? editData.reverseInputData : null, (32749 & 8192) != 0 ? editData.needForbidden : false, (32749 & 16384) != 0 ? editData.isLimit : false), false, 11, null)), C22332hdP.EZpvd(TradeInputData.copy$default(this.toData.getData(), null, null, new EditTextData("", C22332hdP.EZpvd(""), "", null, 1, true, false, null, null, false, null, C22332hdP.EZpvd(""), "", true, false, 18376, null), false, 11, null)), null, 4, null);
    }

    public final TradeInputGroup setClearFromInput(boolean z) {
        return copy$default(this, C22332hdP.EZpvd(TradeInputData.copy$default(this.fromData.getData(), null, null, new EditTextData(null, null, null, null, 1, true, false, null, null, false, null, null, null, z, false, 24527, null), false, 11, null)), C22332hdP.EZpvd(TradeInputData.copy$default(this.toData.getData(), null, null, new EditTextData(null, null, null, null, 1, true, false, null, null, false, null, null, null, z, false, 24527, null), false, 11, null)), null, 4, null);
    }

    public final TradeInputGroup setClearInputForLimit() {
        return copy$default(this, C22332hdP.EZpvd(TradeInputData.copy$default(this.fromData.getData(), null, null, new EditTextData(null, null, null, null, 1, true, false, null, null, false, null, null, null, true, false, 24527, null), false, 11, null)), C22332hdP.EZpvd(TradeInputData.copy$default(this.toData.getData(), null, null, new EditTextData(null, null, null, null, 1, true, false, null, null, false, null, null, null, true, false, 24527, null), false, 11, null)), null, 4, null);
    }

    public TradeInputGroup noQuoteForwardFetched() {
        EditTextData editData = this.fromData.getData().getEditData();
        return copy$default(this, C22332hdP.EZpvd(TradeInputData.copy$default(this.fromData.getData(), null, null, editData.copy((32749 & 1) != 0 ? editData.content : null, (32749 & 2) != 0 ? editData.label : null, (32749 & 4) != 0 ? editData.data : null, (32749 & 8) != 0 ? editData.checkData : null, (32749 & 16) != 0 ? editData.status : 0, (32749 & 32) != 0 ? editData.setInput : false, (32749 & 64) != 0 ? editData.resetFoucs : false, (32749 & 128) != 0 ? editData.secondLabel : null, (32749 & 256) != 0 ? editData.secondDataLabel : null, (32749 & 512) != 0 ? editData.isWarning : false, (32749 & 1024) != 0 ? editData.maxData : null, (32749 & 2048) != 0 ? editData.originPrice : null, (32749 & 4096) != 0 ? editData.reverseInputData : null, (32749 & 8192) != 0 ? editData.needForbidden : false, (32749 & 16384) != 0 ? editData.isLimit : false), false, 11, null)), C22332hdP.EZpvd(TradeInputData.copy$default(this.toData.getData(), null, null, new EditTextData("", C22332hdP.EZpvd(""), "", null, 1, true, false, null, null, false, null, C22332hdP.EZpvd(""), null, true, false, 22472, null), false, 11, null)), null, 4, null);
    }

    private final TradeInputGroup resetForwardPrice() {
        EditTextData editData = this.fromData.getData().getEditData();
        return copy$default(this, C22332hdP.EZpvd(TradeInputData.copy$default(this.fromData.getData(), null, null, editData.copy((32749 & 1) != 0 ? editData.content : null, (32749 & 2) != 0 ? editData.label : C22332hdP.EZpvd(""), (32749 & 4) != 0 ? editData.data : null, (32749 & 8) != 0 ? editData.checkData : null, (32749 & 16) != 0 ? editData.status : 0, (32749 & 32) != 0 ? editData.setInput : false, (32749 & 64) != 0 ? editData.resetFoucs : false, (32749 & 128) != 0 ? editData.secondLabel : null, (32749 & 256) != 0 ? editData.secondDataLabel : null, (32749 & 512) != 0 ? editData.isWarning : false, (32749 & 1024) != 0 ? editData.maxData : null, (32749 & 2048) != 0 ? editData.originPrice : null, (32749 & 4096) != 0 ? editData.reverseInputData : null, (32749 & 8192) != 0 ? editData.needForbidden : false, (32749 & 16384) != 0 ? editData.isLimit : false), false, 11, null)), C22332hdP.EZpvd(TradeInputData.copy$default(this.toData.getData(), null, null, new EditTextData("", C22332hdP.EZpvd(""), "", null, 1, true, false, null, null, false, null, C22332hdP.EZpvd(""), "", true, false, 18376, null), false, 11, null)), null, 4, null);
    }

    public final TradeInputGroup setLimitInputSellAmount(@NotNull LimitCalResult limitCalResult) {
        String decimals;
        Intrinsics.checkNotNullParameter(limitCalResult, "");
        EditTextData editData = this.fromData.getData().getEditData();
        EditTextData editData2 = this.toData.getData().getEditData();
        TradeInputData tradeInputDataCopy$default = TradeInputData.copy$default(this.fromData.getData(), null, null, editData.copy((32749 & 1) != 0 ? editData.content : null, (32749 & 2) != 0 ? editData.label : C22332hdP.EZpvd(C33129mqd.OLrzqt((CharSequence) limitCalResult.getFromTokenUsd()) ? C23272hvB.getShowDataWithPrefix$default(C23272hvB.KWHzl, limitCalResult.getFromTokenUsd(), false, false, RoundingMode.DOWN, false, 22, null) : ""), (32749 & 4) != 0 ? editData.data : null, (32749 & 8) != 0 ? editData.checkData : null, (32749 & 16) != 0 ? editData.status : 1, (32749 & 32) != 0 ? editData.setInput : false, (32749 & 64) != 0 ? editData.resetFoucs : false, (32749 & 128) != 0 ? editData.secondLabel : null, (32749 & 256) != 0 ? editData.secondDataLabel : null, (32749 & 512) != 0 ? editData.isWarning : false, (32749 & 1024) != 0 ? editData.maxData : null, (32749 & 2048) != 0 ? editData.originPrice : new ConsumeData((Object) limitCalResult.getFromTokenUsd(), false, 2, (DefaultConstructorMarker) null), (32749 & 4096) != 0 ? editData.reverseInputData : null, (32749 & 8192) != 0 ? editData.needForbidden : false, (32749 & 16384) != 0 ? editData.isLimit : false), false, 11, null);
        String showDataWithPrefix$default = C33129mqd.OLrzqt((CharSequence) limitCalResult.getToTokenUsd()) ? C23272hvB.getShowDataWithPrefix$default(C23272hvB.KWHzl, limitCalResult.getToTokenUsd(), false, false, RoundingMode.DOWN, false, 22, null) : "";
        C23271hvA c23271hvA = C23271hvA.copydefault;
        String toAmount = limitCalResult.getToAmount();
        DexMultiTokenInfoBean data = this.toData.getData().getCoinData().getData();
        if (data == null || (decimals = data.getDecimals()) == null) {
            decimals = "12";
        }
        return copy(C22332hdP.EZpvd(tradeInputDataCopy$default), C22332hdP.EZpvd(TradeInputData.copy$default(this.toData.getData(), null, null, editData2.copy((32749 & 1) != 0 ? editData2.content : c23271hvA.EZpvd(toAmount, decimals), (32749 & 2) != 0 ? editData2.label : C22332hdP.EZpvd(showDataWithPrefix$default), (32749 & 4) != 0 ? editData2.data : limitCalResult.getToAmount(), (32749 & 8) != 0 ? editData2.checkData : null, (32749 & 16) != 0 ? editData2.status : 1, (32749 & 32) != 0 ? editData2.setInput : true, (32749 & 64) != 0 ? editData2.resetFoucs : false, (32749 & 128) != 0 ? editData2.secondLabel : C22332hdP.EZpvd(limitCalResult.getPriceDiffAmountShow()), (32749 & 256) != 0 ? editData2.secondDataLabel : limitCalResult.getPriceDiffAmount(), (32749 & 512) != 0 ? editData2.isWarning : false, (32749 & 1024) != 0 ? editData2.maxData : null, (32749 & 2048) != 0 ? editData2.originPrice : new ConsumeData((Object) limitCalResult.getToTokenUsd(), false, 2, (DefaultConstructorMarker) null), (32749 & 4096) != 0 ? editData2.reverseInputData : "", (32749 & 8192) != 0 ? editData2.needForbidden : true, (32749 & 16384) != 0 ? editData2.isLimit : true), false, 11, null)), C22332hdP.EZpvd(ExchangeRateData.copy$default(this.exchangeRateData.getData(), null, limitCalResult.getExchangeRate(), 1, null)));
    }

    public final TradeInputGroup setLimitInputToAmount(@NotNull LimitCalResult limitCalResult) {
        String decimals;
        Intrinsics.checkNotNullParameter(limitCalResult, "");
        EditTextData editData = this.fromData.getData().getEditData();
        EditTextData editData2 = this.toData.getData().getEditData();
        String showDataWithPrefix$default = C33129mqd.OLrzqt((CharSequence) limitCalResult.getFromTokenUsd()) ? C23272hvB.getShowDataWithPrefix$default(C23272hvB.KWHzl, limitCalResult.getFromTokenUsd(), false, false, RoundingMode.DOWN, false, 22, null) : "";
        C23271hvA c23271hvA = C23271hvA.copydefault;
        String fromAmount = limitCalResult.getFromAmount();
        DexMultiTokenInfoBean data = this.fromData.getData().getCoinData().getData();
        if (data == null || (decimals = data.getDecimals()) == null) {
            decimals = "12";
        }
        String strEZpvd = c23271hvA.EZpvd(fromAmount, decimals);
        if (C33129mqd.OLrzqt((CharSequence) editData2.getData())) {
            editData = editData.copy((32749 & 1) != 0 ? editData.content : strEZpvd, (32749 & 2) != 0 ? editData.label : C22332hdP.EZpvd(showDataWithPrefix$default), (32749 & 4) != 0 ? editData.data : limitCalResult.getFromAmount(), (32749 & 8) != 0 ? editData.checkData : null, (32749 & 16) != 0 ? editData.status : 1, (32749 & 32) != 0 ? editData.setInput : true, (32749 & 64) != 0 ? editData.resetFoucs : false, (32749 & 128) != 0 ? editData.secondLabel : null, (32749 & 256) != 0 ? editData.secondDataLabel : null, (32749 & 512) != 0 ? editData.isWarning : false, (32749 & 1024) != 0 ? editData.maxData : null, (32749 & 2048) != 0 ? editData.originPrice : new ConsumeData((Object) limitCalResult.getFromTokenUsd(), false, 2, (DefaultConstructorMarker) null), (32749 & 4096) != 0 ? editData.reverseInputData : null, (32749 & 8192) != 0 ? editData.needForbidden : true, (32749 & 16384) != 0 ? editData.isLimit : false);
        }
        return copy(C22332hdP.EZpvd(TradeInputData.copy$default(this.fromData.getData(), null, null, editData, false, 11, null)), C22332hdP.EZpvd(TradeInputData.copy$default(this.toData.getData(), null, null, editData2.copy((32749 & 1) != 0 ? editData2.content : null, (32749 & 2) != 0 ? editData2.label : C22332hdP.EZpvd(C33129mqd.OLrzqt((CharSequence) limitCalResult.getToTokenUsd()) ? C23272hvB.getShowDataWithPrefix$default(C23272hvB.KWHzl, limitCalResult.getToTokenUsd(), false, false, RoundingMode.DOWN, false, 22, null) : ""), (32749 & 4) != 0 ? editData2.data : C23311hvo.OLrzqt(limitCalResult.getToAmount()), (32749 & 8) != 0 ? editData2.checkData : null, (32749 & 16) != 0 ? editData2.status : 1, (32749 & 32) != 0 ? editData2.setInput : false, (32749 & 64) != 0 ? editData2.resetFoucs : false, (32749 & 128) != 0 ? editData2.secondLabel : C22332hdP.EZpvd(limitCalResult.getPriceDiffAmountShow()), (32749 & 256) != 0 ? editData2.secondDataLabel : limitCalResult.getPriceDiffAmount(), (32749 & 512) != 0 ? editData2.isWarning : false, (32749 & 1024) != 0 ? editData2.maxData : null, (32749 & 2048) != 0 ? editData2.originPrice : new ConsumeData((Object) limitCalResult.getToTokenUsd(), false, 2, (DefaultConstructorMarker) null), (32749 & 4096) != 0 ? editData2.reverseInputData : null, (32749 & 8192) != 0 ? editData2.needForbidden : false, (32749 & 16384) != 0 ? editData2.isLimit : true), false, 11, null)), C22332hdP.EZpvd(ExchangeRateData.copy$default(this.exchangeRateData.getData(), null, limitCalResult.getExchangeRate(), 1, null)));
    }

    public final TradeInputGroup setLimitFromToChange() {
        EditTextData editTextDataCopy;
        EditTextData editTextDataCopy2;
        String decimals;
        String decimals2;
        ImageTextData coinData = this.fromData.getData().getCoinData();
        EditTextData editData = this.fromData.getData().getEditData();
        FromToBalance balance = this.fromData.getData().getBalance();
        ImageTextData coinData2 = this.toData.getData().getCoinData();
        EditTextData editData2 = this.toData.getData().getEditData();
        FromToBalance balance2 = this.toData.getData().getBalance();
        ImageTextData imageTextDataCopy = coinData.copy(C22332hdP.EZpvd(coinData2.getText().getData()), coinData2.getType(), C22332hdP.EZpvd(coinData2.getImageUrl().getData()), coinData2.getChainLogoUrl(), coinData2.getData());
        FromToBalance fromToBalanceCopy = balance.copy((2037 & 1) != 0 ? balance.title : null, (2037 & 2) != 0 ? balance.content : C22332hdP.EZpvd(balance2.getContent().getData()), (2037 & 4) != 0 ? balance.action : null, (2037 & 8) != 0 ? balance.data : balance2.getData(), (2037 & 16) != 0 ? balance.error : null, (2037 & 32) != 0 ? balance.errorContent : null, (2037 & 64) != 0 ? balance.needShowAction : false, (2037 & 128) != 0 ? balance.finish : false, (2037 & 256) != 0 ? balance.availableCurrencyAmount : null, (2037 & 512) != 0 ? balance.availableAmountNum : null, (2037 & 1024) != 0 ? balance.balanceBracket : null);
        String str = "12";
        if (editData2.getData().length() == 0 || editData.getData().length() == 0 || Intrinsics.EZpvd((Object) editData2.getContent(), (Object) "0")) {
            editTextDataCopy = editData2.copy((32749 & 1) != 0 ? editData2.content : "", (32749 & 2) != 0 ? editData2.label : C22332hdP.EZpvd(""), (32749 & 4) != 0 ? editData2.data : "", (32749 & 8) != 0 ? editData2.checkData : null, (32749 & 16) != 0 ? editData2.status : 0, (32749 & 32) != 0 ? editData2.setInput : true, (32749 & 64) != 0 ? editData2.resetFoucs : true, (32749 & 128) != 0 ? editData2.secondLabel : null, (32749 & 256) != 0 ? editData2.secondDataLabel : null, (32749 & 512) != 0 ? editData2.isWarning : false, (32749 & 1024) != 0 ? editData2.maxData : null, (32749 & 2048) != 0 ? editData2.originPrice : null, (32749 & 4096) != 0 ? editData2.reverseInputData : null, (32749 & 8192) != 0 ? editData2.needForbidden : true, (32749 & 16384) != 0 ? editData2.isLimit : true);
        } else {
            C23271hvA c23271hvA = C23271hvA.copydefault;
            String data = editData2.getData();
            DexMultiTokenInfoBean data2 = this.toData.getData().getCoinData().getData();
            if (data2 == null || (decimals2 = data2.getDecimals()) == null) {
                decimals2 = "12";
            }
            editTextDataCopy = editData2.copy((32749 & 1) != 0 ? editData2.content : c23271hvA.EZpvd(data, decimals2), (32749 & 2) != 0 ? editData2.label : editData2.getLabel(), (32749 & 4) != 0 ? editData2.data : editData2.getData(), (32749 & 8) != 0 ? editData2.checkData : null, (32749 & 16) != 0 ? editData2.status : 0, (32749 & 32) != 0 ? editData2.setInput : true, (32749 & 64) != 0 ? editData2.resetFoucs : true, (32749 & 128) != 0 ? editData2.secondLabel : null, (32749 & 256) != 0 ? editData2.secondDataLabel : null, (32749 & 512) != 0 ? editData2.isWarning : false, (32749 & 1024) != 0 ? editData2.maxData : null, (32749 & 2048) != 0 ? editData2.originPrice : editData2.getOriginPrice(), (32749 & 4096) != 0 ? editData2.reverseInputData : null, (32749 & 8192) != 0 ? editData2.needForbidden : true, (32749 & 16384) != 0 ? editData2.isLimit : false);
        }
        TradeInputData tradeInputDataCopy$default = TradeInputData.copy$default(this.fromData.getData(), fromToBalanceCopy, imageTextDataCopy, editTextDataCopy, false, 8, null);
        ImageTextData imageTextDataCopy2 = coinData2.copy(C22332hdP.EZpvd(coinData.getText().getData()), coinData.getType(), C22332hdP.EZpvd(coinData.getImageUrl().getData()), coinData.getChainLogoUrl(), coinData.getData());
        FromToBalance fromToBalanceCopy2 = balance2.copy((2037 & 1) != 0 ? balance2.title : null, (2037 & 2) != 0 ? balance2.content : C22332hdP.EZpvd(balance.getContent().getData()), (2037 & 4) != 0 ? balance2.action : null, (2037 & 8) != 0 ? balance2.data : balance.getData(), (2037 & 16) != 0 ? balance2.error : null, (2037 & 32) != 0 ? balance2.errorContent : null, (2037 & 64) != 0 ? balance2.needShowAction : false, (2037 & 128) != 0 ? balance2.finish : false, (2037 & 256) != 0 ? balance2.availableCurrencyAmount : null, (2037 & 512) != 0 ? balance2.availableAmountNum : null, (2037 & 1024) != 0 ? balance2.balanceBracket : null);
        if (editData2.getData().length() == 0 || editData.getData().length() == 0 || Intrinsics.EZpvd((Object) editData2.getContent(), (Object) "0")) {
            editTextDataCopy2 = editData2.copy((32749 & 1) != 0 ? editData2.content : "", (32749 & 2) != 0 ? editData2.label : C22332hdP.EZpvd(""), (32749 & 4) != 0 ? editData2.data : "", (32749 & 8) != 0 ? editData2.checkData : null, (32749 & 16) != 0 ? editData2.status : 0, (32749 & 32) != 0 ? editData2.setInput : true, (32749 & 64) != 0 ? editData2.resetFoucs : true, (32749 & 128) != 0 ? editData2.secondLabel : null, (32749 & 256) != 0 ? editData2.secondDataLabel : null, (32749 & 512) != 0 ? editData2.isWarning : false, (32749 & 1024) != 0 ? editData2.maxData : null, (32749 & 2048) != 0 ? editData2.originPrice : null, (32749 & 4096) != 0 ? editData2.reverseInputData : null, (32749 & 8192) != 0 ? editData2.needForbidden : true, (32749 & 16384) != 0 ? editData2.isLimit : true);
        } else {
            C23271hvA c23271hvA2 = C23271hvA.copydefault;
            String data3 = editData.getData();
            DexMultiTokenInfoBean data4 = imageTextDataCopy2.getData();
            if (data4 != null && (decimals = data4.getDecimals()) != null) {
                str = decimals;
            }
            editTextDataCopy2 = editData2.copy((32749 & 1) != 0 ? editData2.content : c23271hvA2.EZpvd(data3, str), (32749 & 2) != 0 ? editData2.label : editData.getLabel(), (32749 & 4) != 0 ? editData2.data : editData.getData(), (32749 & 8) != 0 ? editData2.checkData : null, (32749 & 16) != 0 ? editData2.status : 0, (32749 & 32) != 0 ? editData2.setInput : true, (32749 & 64) != 0 ? editData2.resetFoucs : true, (32749 & 128) != 0 ? editData2.secondLabel : null, (32749 & 256) != 0 ? editData2.secondDataLabel : null, (32749 & 512) != 0 ? editData2.isWarning : false, (32749 & 1024) != 0 ? editData2.maxData : null, (32749 & 2048) != 0 ? editData2.originPrice : editData.getOriginPrice(), (32749 & 4096) != 0 ? editData2.reverseInputData : null, (32749 & 8192) != 0 ? editData2.needForbidden : true, (32749 & 16384) != 0 ? editData2.isLimit : true);
        }
        return copy(C22332hdP.EZpvd(tradeInputDataCopy$default), C22332hdP.EZpvd(TradeInputData.copy$default(this.toData.getData(), fromToBalanceCopy2, imageTextDataCopy2, editTextDataCopy2, false, 8, null)), C22332hdP.EZpvd(this.exchangeRateData.getData().copy(C25352ivB.AhwBna(this.exchangeRateData.getData().getChangeRate()) ? C23313hvq.divCheckS$default("1", this.exchangeRateData.getData().getChangeRate(), null, null, null, 14, null) : "", C25352ivB.AhwBna(this.exchangeRateData.getData().getCustomRate()) ? C23313hvq.divCheckS$default("1", this.exchangeRateData.getData().getCustomRate(), null, null, null, 14, null) : "")));
    }

    public final TradeInputGroup replaceFromToToken(DexMultiTokenInfoBean dexMultiTokenInfoBean, @NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean2) {
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean2, "");
        ImageTextData coinData = this.fromData.getData().getCoinData();
        ImageTextData coinData2 = this.toData.getData().getCoinData();
        FromToBalance balance = this.fromData.getData().getBalance();
        TradeInputData data = this.fromData.getData();
        FromToBalance balance2 = this.toData.getData().getBalance();
        if (dexMultiTokenInfoBean != null) {
            ImageTextData imageTextData = new ImageTextData(C22332hdP.EZpvd(dexMultiTokenInfoBean.getTokenSymbol()), coinData.getType(), C22332hdP.EZpvd(dexMultiTokenInfoBean.getTokenLogoUrl()), C22332hdP.EZpvd(dexMultiTokenInfoBean.getChainLogoUrl()), dexMultiTokenInfoBean);
            data = TradeInputData.copy$default(this.fromData.getData(), balance.copy((2037 & 1) != 0 ? balance.title : null, (2037 & 2) != 0 ? balance.content : C22332hdP.EZpvd(balance.getContent().getData()), (2037 & 4) != 0 ? balance.action : null, (2037 & 8) != 0 ? balance.data : balance.getData(), (2037 & 16) != 0 ? balance.error : null, (2037 & 32) != 0 ? balance.errorContent : null, (2037 & 64) != 0 ? balance.needShowAction : false, (2037 & 128) != 0 ? balance.finish : false, (2037 & 256) != 0 ? balance.availableCurrencyAmount : null, (2037 & 512) != 0 ? balance.availableAmountNum : null, (2037 & 1024) != 0 ? balance.balanceBracket : null), imageTextData, new EditTextData("", C22332hdP.EZpvd(""), "", null, 0, true, true, null, null, false, null, null, null, true, false, 24456, null), false, 8, null);
        }
        ImageTextData imageTextData2 = new ImageTextData(C22332hdP.EZpvd(dexMultiTokenInfoBean2.getTokenSymbol()), coinData2.getType(), C22332hdP.EZpvd(dexMultiTokenInfoBean2.getTokenLogoUrl()), C22332hdP.EZpvd(dexMultiTokenInfoBean2.getChainLogoUrl()), dexMultiTokenInfoBean2);
        return copy$default(this, C22332hdP.EZpvd(data), C22332hdP.EZpvd(TradeInputData.copy$default(this.toData.getData(), balance2.copy((2037 & 1) != 0 ? balance2.title : null, (2037 & 2) != 0 ? balance2.content : C22332hdP.EZpvd(balance.getContent().getData()), (2037 & 4) != 0 ? balance2.action : null, (2037 & 8) != 0 ? balance2.data : balance.getData(), (2037 & 16) != 0 ? balance2.error : null, (2037 & 32) != 0 ? balance2.errorContent : null, (2037 & 64) != 0 ? balance2.needShowAction : false, (2037 & 128) != 0 ? balance2.finish : false, (2037 & 256) != 0 ? balance2.availableCurrencyAmount : null, (2037 & 512) != 0 ? balance2.availableAmountNum : null, (2037 & 1024) != 0 ? balance2.balanceBracket : null), imageTextData2, new EditTextData("", C22332hdP.EZpvd(""), "", null, 0, true, false, C22332hdP.EZpvd(""), null, false, null, C22332hdP.EZpvd(""), null, true, false, 22344, null), false, 8, null)), null, 4, null);
    }
}
