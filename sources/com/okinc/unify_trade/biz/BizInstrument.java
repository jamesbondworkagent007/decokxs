package com.okinc.unify_trade.biz;

import com.okinc.unify_trade.biz.BizInstrument;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C56392yDr;
import o.C56524yIo;
import o.InterfaceC55797xqi;
import o.InterfaceC56387yDm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public abstract class BizInstrument implements InterfaceC55797xqi {
    private final String instId;
    private String instType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.xqa
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return BizInstrument._init_$_anonymous_();
        }
    });

    public abstract boolean enableFilter();

    public abstract String fullCoinName();

    public abstract String getBizContinuousStatus();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getBizPreQuoteListStage() {
        return "";
    }

    public abstract String getBizPreQuoteStatus();

    public abstract String getBizStatus();

    public abstract String getCcyType();

    public abstract CountDownInfo getCountDownInfo();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getDisplayId() {
        return this.instId;
    }

    /* JADX INFO: renamed from: getExpiryDisplay */
    public boolean mo7129getExpiryDisplay() {
        return true;
    }

    public abstract String getFutureContractVal();

    public abstract String getFutureMult();

    public abstract String getInstFamily();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getListStage() {
        return "";
    }

    public abstract String getLotSize();

    public abstract String getMarginSymbol();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getMarketInfoSettleCcy() {
        return "";
    }

    public abstract String getMinSize();

    public abstract String getProfitSymbol();

    public abstract String getQuoteSymbol();

    public abstract String getTickerSize();

    public List<String> getTradeQuoteCcyList() {
        return null;
    }

    public abstract String getTradeSymbol();

    public abstract String getUnderlying();

    public boolean isDisplayTradeReceive() {
        return false;
    }

    public abstract Boolean isNegativeContract();

    public abstract boolean isNewLabel();

    public abstract boolean isNewTag();

    public abstract boolean isOnLine();

    public abstract boolean isPositiveContract();

    public abstract boolean isPreMarketPair();

    public abstract boolean isRebasePair();

    public boolean isSupportTradeReceive() {
        return false;
    }

    public boolean isUSDUMContract() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instType = str;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.BizInstrument.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer copydefault() {
            return (KSerializer) BizInstrument.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<BizInstrument> serializer() {
            return copydefault();
        }
    }

    public /* synthetic */ BizInstrument(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        this.instId = str;
        this.instType = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new PolymorphicSerializer(C56524yIo.AEQbTJ(BizInstrument.class), new Annotation[0]);
    }

    public static final /* synthetic */ void write$Self(BizInstrument bizInstrument, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, bizInstrument.instId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, bizInstrument.instType);
    }

    public BizInstrument(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.instId = str;
        this.instType = str2;
    }

    public String getDisplayQuoteSymbol() {
        return getQuoteSymbol();
    }

    public final String joinCcyRelevantToString() {
        String str = this.instId;
        String quoteSymbol = getQuoteSymbol();
        String displayQuoteSymbol = getDisplayQuoteSymbol();
        List<String> tradeQuoteCcyList = getTradeQuoteCcyList();
        List<String> tradeQuoteCcyList2 = getTradeQuoteCcyList();
        return "insId:" + str + ", quoteCcy:" + quoteSymbol + ", displayQuoteSymbol:" + displayQuoteSymbol + ", tradeQuoteCcyList: " + tradeQuoteCcyList + ", size=" + (tradeQuoteCcyList2 != null ? Integer.valueOf(tradeQuoteCcyList2.size()) : AbstractJsonLexerKt.NULL);
    }
}
