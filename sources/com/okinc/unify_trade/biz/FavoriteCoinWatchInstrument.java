package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class FavoriteCoinWatchInstrument extends BizInstrument {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String fullName;
    private final String mInstType;
    private final String symbol;

    @Override // com.okinc.unify_trade.biz.BizInstrument
    public boolean enableFilter() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String fullCoinName() {
        return this.fullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String getBizContinuousStatus() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String getBizPreQuoteStatus() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String getBizStatus() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String getCcyType() {
        return "";
    }

    @Override // com.okinc.unify_trade.biz.BizInstrument
    public CountDownInfo getCountDownInfo() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String getFutureContractVal() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String getFutureMult() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String getInstFamily() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String getLotSize() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMInstType() {
        return this.mInstType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String getMarginSymbol() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String getMinSize() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String getProfitSymbol() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String getQuoteSymbol() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String getTickerSize() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String getTradeSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String getUnderlying() {
        return this.symbol;
    }

    @Override // com.okinc.unify_trade.biz.BizInstrument
    public Boolean isNegativeContract() {
        return null;
    }

    @Override // com.okinc.unify_trade.biz.BizInstrument
    public boolean isNewLabel() {
        return false;
    }

    @Override // com.okinc.unify_trade.biz.BizInstrument
    public boolean isNewTag() {
        return false;
    }

    @Override // com.okinc.unify_trade.biz.BizInstrument
    public boolean isOnLine() {
        return true;
    }

    @Override // com.okinc.unify_trade.biz.BizInstrument
    public boolean isPositiveContract() {
        return false;
    }

    @Override // com.okinc.unify_trade.biz.BizInstrument
    public boolean isPreMarketPair() {
        return false;
    }

    @Override // com.okinc.unify_trade.biz.BizInstrument
    public boolean isRebasePair() {
        return false;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.FavoriteCoinWatchInstrument.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FavoriteCoinWatchInstrument> serializer() {
            return FavoriteCoinWatchInstrument$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FavoriteCoinWatchInstrument(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, str, str2, serializationConstructorMarker);
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, FavoriteCoinWatchInstrument$$serializer.INSTANCE.getDescriptor());
        }
        this.fullName = str3;
        this.symbol = str4;
        this.mInstType = str5;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(FavoriteCoinWatchInstrument favoriteCoinWatchInstrument, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        BizInstrument.write$Self(favoriteCoinWatchInstrument, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, favoriteCoinWatchInstrument.fullName);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, favoriteCoinWatchInstrument.symbol);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, favoriteCoinWatchInstrument.mInstType);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavoriteCoinWatchInstrument(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        super(str2, str3);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.fullName = str;
        this.symbol = str2;
        this.mInstType = str3;
    }
}
