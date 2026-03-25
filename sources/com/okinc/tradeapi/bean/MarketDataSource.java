package com.okinc.tradeapi.bean;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.tradeapi.bean.MarketDataSource;
import com.okinc.tradeapi.framework.constant.TradeKey;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.PairSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C43251rlk;
import o.C56392yDr;
import o.C56524yIo;
import o.InterfaceC49425uoM;
import o.InterfaceC49497upf;
import o.InterfaceC56387yDm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public abstract class MarketDataSource {
    private String alias;
    private String baseSymbol;
    private String coinUrl;
    private String contractVolume;
    private String cupTickerPrice;
    private String displayId;
    private String displayQuoteSymbol;
    private String instId;
    private String instType;
    private boolean isHot;
    private boolean isPreMarket;
    private boolean isRebase;
    private Boolean isWatching;
    private boolean isnewLabel;
    private String last24;
    private String leverage;
    private String listTime;
    private String mIndex;
    private String mSymbolName;
    private Pair<Double, String> priceLimit;
    private String quoteCcyPrice;
    private String quoteCupTickerPrice;
    private final String quoteSymbol;
    private Double sortCcyVolume;
    private Double sortTurnover;
    private Double sortVolume;
    private String tickerPrice;
    private String volume;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, new PairSerializer(DoubleSerializer.INSTANCE, StringSerializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.uoE
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return MarketDataSource._init_$_anonymous_();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MarketDataSource() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Pair) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (Double) null, (Double) null, (Double) null, false, false, (String) null, (String) null, false, false, (String) null, (String) null, 268435455, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlias() {
        return this.alias;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseSymbol() {
        return this.baseSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizInstId() {
        String str = this.instId;
        return str == null ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinUrl() {
        return this.coinUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContractVolume() {
        return this.contractVolume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCupTickerPrice() {
        return this.cupTickerPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayId() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayQuoteSymbol() {
        return this.displayQuoteSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIndex() {
        String str = this.mIndex;
        return str == null ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getIsnewLabel() {
        return this.isnewLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLast24() {
        return this.last24;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLeverage() {
        return this.leverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getListTime() {
        return this.listTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMIndex() {
        return this.mIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMSymbolName() {
        return this.mSymbolName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Pair<Double, String> getPriceLimit() {
        return this.priceLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteCcyPrice() {
        return this.quoteCcyPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteCcyUSDPrice() {
        return this.quoteCcyPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteCupTickerPrice() {
        return this.quoteCupTickerPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteSymbol() {
        return this.quoteSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double getSortCcyVolume() {
        return this.sortCcyVolume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double getSortTurnover() {
        return this.sortTurnover;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double getSortVolume() {
        return this.sortVolume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTickerPrice() {
        return this.tickerPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVolume() {
        return this.volume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isHot() {
        return this.isHot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isHotTag() {
        return this.isHot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isNewLabel() {
        return this.isnewLabel;
    }

    public Boolean isPositiveContract() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isPreMarket() {
        return this.isPreMarket;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isRebase() {
        return this.isRebase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isWatching() {
        return this.isWatching;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlias(String str) {
        this.alias = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseSymbol(String str) {
        this.baseSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinUrl(String str) {
        this.coinUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContractVolume(String str) {
        this.contractVolume = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCupTickerPrice(String str) {
        this.cupTickerPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDisplayId(String str) {
        this.displayId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDisplayQuoteSymbol(String str) {
        this.displayQuoteSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHot(boolean z) {
        this.isHot = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHotTag(boolean z) {
        this.isHot = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(String str) {
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIsnewLabel(boolean z) {
        this.isnewLabel = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLast24(String str) {
        this.last24 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLeverage(String str) {
        this.leverage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setListTime(String str) {
        this.listTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMIndex(String str) {
        this.mIndex = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMSymbolName(String str) {
        this.mSymbolName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNewLabel(boolean z) {
        this.isnewLabel = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPreMarket(boolean z) {
        this.isPreMarket = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceLimit(Pair<Double, String> pair) {
        this.priceLimit = pair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteCcyPrice(String str) {
        this.quoteCcyPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteCupTickerPrice(String str) {
        this.quoteCupTickerPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRebase(boolean z) {
        this.isRebase = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSortCcyVolume(Double d) {
        this.sortCcyVolume = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSortTurnover(Double d) {
        this.sortTurnover = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSortVolume(Double d) {
        this.sortVolume = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTickerPrice(String str) {
        this.tickerPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVolume(String str) {
        this.volume = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWatching(Boolean bool) {
        this.isWatching = bool;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradeapi.bean.MarketDataSource.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer OLrzqt() {
            return (KSerializer) MarketDataSource.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<MarketDataSource> serializer() {
            return OLrzqt();
        }
    }

    public /* synthetic */ MarketDataSource(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Pair pair, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Boolean bool, Double d, Double d2, Double d3, boolean z, boolean z2, String str16, String str17, boolean z3, boolean z4, String str18, String str19, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.instType = "";
        } else {
            this.instType = str;
        }
        if ((i & 2) == 0) {
            this.instId = "";
        } else {
            this.instId = str2;
        }
        if ((i & 4) == 0) {
            this.mIndex = "";
        } else {
            this.mIndex = str3;
        }
        if ((i & 8) == 0) {
            this.baseSymbol = "";
        } else {
            this.baseSymbol = str4;
        }
        if ((i & 16) == 0) {
            this.quoteSymbol = "";
        } else {
            this.quoteSymbol = str5;
        }
        if ((i & 32) == 0) {
            this.leverage = "";
        } else {
            this.leverage = str6;
        }
        if ((i & 64) == 0) {
            this.volume = "";
        } else {
            this.volume = str7;
        }
        if ((i & 128) == 0) {
            this.contractVolume = "";
        } else {
            this.contractVolume = str8;
        }
        if ((i & 256) == 0) {
            this.priceLimit = null;
        } else {
            this.priceLimit = pair;
        }
        if ((i & 512) == 0) {
            this.tickerPrice = "";
        } else {
            this.tickerPrice = str9;
        }
        if ((i & 1024) == 0) {
            this.cupTickerPrice = "";
        } else {
            this.cupTickerPrice = str10;
        }
        if ((i & 2048) == 0) {
            this.alias = "";
        } else {
            this.alias = str11;
        }
        if ((i & 4096) == 0) {
            this.last24 = "";
        } else {
            this.last24 = str12;
        }
        if ((i & 8192) == 0) {
            this.listTime = "";
        } else {
            this.listTime = str13;
        }
        if ((i & 16384) == 0) {
            this.coinUrl = "";
        } else {
            this.coinUrl = str14;
        }
        if ((32768 & i) == 0) {
            this.mSymbolName = "";
        } else {
            this.mSymbolName = str15;
        }
        this.isWatching = (65536 & i) == 0 ? Boolean.FALSE : bool;
        if ((131072 & i) == 0) {
            this.sortVolume = null;
        } else {
            this.sortVolume = d;
        }
        if ((262144 & i) == 0) {
            this.sortCcyVolume = null;
        } else {
            this.sortCcyVolume = d2;
        }
        if ((524288 & i) == 0) {
            this.sortTurnover = null;
        } else {
            this.sortTurnover = d3;
        }
        if ((1048576 & i) == 0) {
            this.isHot = false;
        } else {
            this.isHot = z;
        }
        if ((2097152 & i) == 0) {
            this.isnewLabel = false;
        } else {
            this.isnewLabel = z2;
        }
        if ((4194304 & i) == 0) {
            this.quoteCcyPrice = "";
        } else {
            this.quoteCcyPrice = str16;
        }
        if ((8388608 & i) == 0) {
            this.quoteCupTickerPrice = null;
        } else {
            this.quoteCupTickerPrice = str17;
        }
        if ((16777216 & i) == 0) {
            this.isPreMarket = false;
        } else {
            this.isPreMarket = z3;
        }
        if ((33554432 & i) == 0) {
            this.isRebase = false;
        } else {
            this.isRebase = z4;
        }
        if ((67108864 & i) == 0) {
            this.displayId = null;
        } else {
            this.displayId = str18;
        }
        if ((i & 134217728) == 0) {
            this.displayQuoteSymbol = null;
        } else {
            this.displayQuoteSymbol = str19;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new PolymorphicSerializer(C56524yIo.AEQbTJ(MarketDataSource.class), new Annotation[0]);
    }

    public static final /* synthetic */ void write$Self(MarketDataSource marketDataSource, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) marketDataSource.instType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, marketDataSource.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) marketDataSource.instId, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, marketDataSource.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) marketDataSource.mIndex, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, marketDataSource.mIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) marketDataSource.baseSymbol, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, marketDataSource.baseSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) marketDataSource.quoteSymbol, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, marketDataSource.quoteSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) marketDataSource.leverage, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, marketDataSource.leverage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) marketDataSource.volume, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, marketDataSource.volume);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) marketDataSource.contractVolume, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, marketDataSource.contractVolume);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || marketDataSource.priceLimit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], marketDataSource.priceLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) marketDataSource.tickerPrice, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, marketDataSource.tickerPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) marketDataSource.cupTickerPrice, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, marketDataSource.cupTickerPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) marketDataSource.alias, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, marketDataSource.alias);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) marketDataSource.last24, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, marketDataSource.last24);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) marketDataSource.listTime, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, marketDataSource.listTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) marketDataSource.coinUrl, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, marketDataSource.coinUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) marketDataSource.mSymbolName, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, marketDataSource.mSymbolName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd(marketDataSource.isWatching, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, BooleanSerializer.INSTANCE, marketDataSource.isWatching);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || marketDataSource.sortVolume != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, DoubleSerializer.INSTANCE, marketDataSource.sortVolume);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || marketDataSource.sortCcyVolume != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, DoubleSerializer.INSTANCE, marketDataSource.sortCcyVolume);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || marketDataSource.sortTurnover != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, DoubleSerializer.INSTANCE, marketDataSource.sortTurnover);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || marketDataSource.isHot) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 20, marketDataSource.isHot);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || marketDataSource.isnewLabel) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 21, marketDataSource.isnewLabel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) marketDataSource.quoteCcyPrice, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.INSTANCE, marketDataSource.quoteCcyPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || marketDataSource.quoteCupTickerPrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.INSTANCE, marketDataSource.quoteCupTickerPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || marketDataSource.isPreMarket) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 24, marketDataSource.isPreMarket);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || marketDataSource.isRebase) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 25, marketDataSource.isRebase);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || marketDataSource.displayId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, StringSerializer.INSTANCE, marketDataSource.displayId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) && marketDataSource.displayQuoteSymbol == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 27, StringSerializer.INSTANCE, marketDataSource.displayQuoteSymbol);
    }

    public MarketDataSource(@NotNull String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Pair<Double, String> pair, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Boolean bool, Double d, Double d2, Double d3, boolean z, boolean z2, String str16, String str17, boolean z3, boolean z4, String str18, String str19) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instType = str;
        this.instId = str2;
        this.mIndex = str3;
        this.baseSymbol = str4;
        this.quoteSymbol = str5;
        this.leverage = str6;
        this.volume = str7;
        this.contractVolume = str8;
        this.priceLimit = pair;
        this.tickerPrice = str9;
        this.cupTickerPrice = str10;
        this.alias = str11;
        this.last24 = str12;
        this.listTime = str13;
        this.coinUrl = str14;
        this.mSymbolName = str15;
        this.isWatching = bool;
        this.sortVolume = d;
        this.sortCcyVolume = d2;
        this.sortTurnover = d3;
        this.isHot = z;
        this.isnewLabel = z2;
        this.quoteCcyPrice = str16;
        this.quoteCupTickerPrice = str17;
        this.isPreMarket = z3;
        this.isRebase = z4;
        this.displayId = str18;
        this.displayQuoteSymbol = str19;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0148: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r58v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r58v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r58v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r58v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r58v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r58v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r58v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r58v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:kotlin.Pair:?: TERNARY null = ((wrap:int:0x0044: ARITH (r58v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null kotlin.Pair) : (r38v0 kotlin.Pair))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r58v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r58v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r58v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r58v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r58v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r58v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r58v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x008d: ARITH (r58v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0091: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r46v0 java.lang.Boolean))
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x0098: ARITH (r58v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r47v0 java.lang.Double))
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x00a3: ARITH (r58v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r48v0 java.lang.Double))
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x00ae: ARITH (r58v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r49v0 java.lang.Double))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00b9: ARITH (r58v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? false : (r50v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00c6: ARITH (r58v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? false : (r51v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d1: ARITH (r58v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00dc: ARITH (r58v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r53v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00e7: ARITH (r58v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? false : (r54v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00f2: ARITH (r58v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) == (0 int)) ? (r55v0 boolean) : false)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fb: ARITH (r58v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0106: ARITH (r58v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r57v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.Pair<java.lang.Double, java.lang.String>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Double, java.lang.Double, java.lang.Double, boolean, boolean, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String):void (m)] (LINE:12) call: com.okinc.tradeapi.bean.MarketDataSource.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.Pair, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Double, java.lang.Double, java.lang.Double, boolean, boolean, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ MarketDataSource(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Pair pair, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Boolean bool, Double d, Double d2, Double d3, boolean z, boolean z2, String str16, String str17, boolean z3, boolean z4, String str18, String str19, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? null : pair, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? "" : str10, (i & 2048) != 0 ? "" : str11, (i & 4096) != 0 ? "" : str12, (i & 8192) != 0 ? "" : str13, (i & 16384) != 0 ? "" : str14, (i & 32768) != 0 ? "" : str15, (i & 65536) != 0 ? Boolean.FALSE : bool, (i & 131072) != 0 ? null : d, (i & 262144) != 0 ? null : d2, (i & 524288) != 0 ? null : d3, (i & 1048576) != 0 ? false : z, (i & 2097152) != 0 ? false : z2, (i & 4194304) != 0 ? "" : str16, (i & 8388608) != 0 ? null : str17, (i & 16777216) != 0 ? false : z3, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) == 0 ? z4 : false, (i & 67108864) != 0 ? null : str18, (i & 134217728) != 0 ? null : str19);
    }

    public final String getBizInstTitle() {
        return ((InterfaceC49497upf) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI)).OLrzqt(this.instType, this.instId, this.mIndex, this.alias);
    }
}
