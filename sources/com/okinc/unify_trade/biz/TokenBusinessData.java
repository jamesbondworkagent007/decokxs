package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class TokenBusinessData {
    private boolean available;
    private String baseSymbol;
    private BizInstrument biz;
    private String changePercent;
    private String coinUrl;
    private String displayQuoteSymbol;
    private String index;
    private String instType;
    private String instrumentName;
    private boolean isPositive;
    private boolean isPreMarket;
    private boolean isSelect;
    private boolean isWatching;
    private String leverage;
    private int pos;
    private String price;
    private String quoteSymbol;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, BizInstrument.Companion.serializer(), null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TokenBusinessData() {
        this(false, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, false, (String) null, (String) null, (String) null, (BizInstrument) null, false, 0, false, (String) null, 131071, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAvailable() {
        return this.available;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseSymbol() {
        return this.baseSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BizInstrument getBiz() {
        return this.biz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangePercent() {
        return this.changePercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinUrl() {
        return this.coinUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIndex() {
        return this.index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstrumentName() {
        return this.instrumentName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLeverage() {
        return this.leverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderType() {
        return this.isPreMarket ? "PREMARKET" : this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPos() {
        return this.pos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteSymbol() {
        return this.quoteSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isPositive() {
        return this.isPositive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isPreMarket() {
        return this.isPreMarket;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSelect() {
        return this.isSelect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isWatching() {
        return this.isWatching;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvailable(boolean z) {
        this.available = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBiz(BizInstrument bizInstrument) {
        this.biz = bizInstrument;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChangePercent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.changePercent = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinUrl(String str) {
        this.coinUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIndex(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.index = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstrumentName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instrumentName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLeverage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.leverage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPos(int i) {
        this.pos = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPositive(boolean z) {
        this.isPositive = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPreMarket(boolean z) {
        this.isPreMarket = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.price = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelect(boolean z) {
        this.isSelect = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWatching(boolean z) {
        this.isWatching = z;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.TokenBusinessData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TokenBusinessData> serializer() {
            return TokenBusinessData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TokenBusinessData(int i, boolean z, String str, String str2, String str3, String str4, String str5, boolean z2, String str6, boolean z3, String str7, String str8, String str9, BizInstrument bizInstrument, boolean z4, int i2, boolean z5, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.available = false;
        } else {
            this.available = z;
        }
        if ((i & 2) == 0) {
            this.instrumentName = "";
        } else {
            this.instrumentName = str;
        }
        if ((i & 4) == 0) {
            this.instType = "";
        } else {
            this.instType = str2;
        }
        if ((i & 8) == 0) {
            this.baseSymbol = "";
        } else {
            this.baseSymbol = str3;
        }
        if ((i & 16) == 0) {
            this.quoteSymbol = "";
        } else {
            this.quoteSymbol = str4;
        }
        if ((i & 32) == 0) {
            this.index = "";
        } else {
            this.index = str5;
        }
        this.isPositive = (i & 64) == 0 ? true : z2;
        if ((i & 128) == 0) {
            this.leverage = "";
        } else {
            this.leverage = str6;
        }
        if ((i & 256) == 0) {
            this.isWatching = false;
        } else {
            this.isWatching = z3;
        }
        if ((i & 512) == 0) {
            this.price = "- -";
        } else {
            this.price = str7;
        }
        if ((i & 1024) == 0) {
            this.changePercent = "- -";
        } else {
            this.changePercent = str8;
        }
        if ((i & 2048) == 0) {
            this.coinUrl = "";
        } else {
            this.coinUrl = str9;
        }
        this.biz = (i & 4096) == 0 ? null : bizInstrument;
        if ((i & 8192) == 0) {
            this.isSelect = false;
        } else {
            this.isSelect = z4;
        }
        if ((i & 16384) == 0) {
            this.pos = 0;
        } else {
            this.pos = i2;
        }
        if ((32768 & i) == 0) {
            this.isPreMarket = false;
        } else {
            this.isPreMarket = z5;
        }
        if ((i & 65536) == 0) {
            this.displayQuoteSymbol = "";
        } else {
            this.displayQuoteSymbol = str10;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(TokenBusinessData tokenBusinessData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || tokenBusinessData.available) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, tokenBusinessData.available);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) tokenBusinessData.instrumentName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, tokenBusinessData.instrumentName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) tokenBusinessData.instType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, tokenBusinessData.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) tokenBusinessData.baseSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, tokenBusinessData.baseSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) tokenBusinessData.quoteSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, tokenBusinessData.quoteSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) tokenBusinessData.index, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, tokenBusinessData.index);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !tokenBusinessData.isPositive) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 6, tokenBusinessData.isPositive);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) tokenBusinessData.leverage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, tokenBusinessData.leverage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || tokenBusinessData.isWatching) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 8, tokenBusinessData.isWatching);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) tokenBusinessData.price, (Object) "- -")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, tokenBusinessData.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) tokenBusinessData.changePercent, (Object) "- -")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, tokenBusinessData.changePercent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) tokenBusinessData.coinUrl, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, tokenBusinessData.coinUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || tokenBusinessData.biz != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, kSerializerArr[12], tokenBusinessData.biz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || tokenBusinessData.isSelect) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 13, tokenBusinessData.isSelect);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || tokenBusinessData.pos != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 14, tokenBusinessData.pos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || tokenBusinessData.isPreMarket) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 15, tokenBusinessData.isPreMarket);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) && Intrinsics.EZpvd((Object) tokenBusinessData.displayQuoteSymbol, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 16, tokenBusinessData.displayQuoteSymbol);
    }

    public TokenBusinessData(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z2, @NotNull String str6, boolean z3, @NotNull String str7, @NotNull String str8, String str9, BizInstrument bizInstrument, boolean z4, int i, boolean z5, @NotNull String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str10, "");
        this.available = z;
        this.instrumentName = str;
        this.instType = str2;
        this.baseSymbol = str3;
        this.quoteSymbol = str4;
        this.index = str5;
        this.isPositive = z2;
        this.leverage = str6;
        this.isWatching = z3;
        this.price = str7;
        this.changePercent = str8;
        this.coinUrl = str9;
        this.biz = bizInstrument;
        this.isSelect = z4;
        this.pos = i;
        this.isPreMarket = z5;
        this.displayQuoteSymbol = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00ba: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r36v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r19v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r36v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r36v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r36v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r36v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r36v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0034: ARITH (r36v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? true : (r25v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r36v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0044: ARITH (r36v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r27v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r36v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("- -") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0056: ARITH (r36v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r29v0 java.lang.String) : ("- -"))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005d: ARITH (r36v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.BizInstrument:?: TERNARY null = ((wrap:int:0x0065: ARITH (r36v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.BizInstrument) : (r31v0 com.okinc.unify_trade.biz.BizInstrument))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x006d: ARITH (r36v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? false : (r32v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0077: ARITH (r36v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r33v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0082: ARITH (r36v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? false : (r34v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r36v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
 A[MD:(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.BizInstrument, boolean, int, boolean, java.lang.String):void (m)] (LINE:14) call: com.okinc.unify_trade.biz.TokenBusinessData.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.BizInstrument, boolean, int, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ TokenBusinessData(boolean z, String str, String str2, String str3, String str4, String str5, boolean z2, String str6, boolean z3, String str7, String str8, String str9, BizInstrument bizInstrument, boolean z4, int i, boolean z5, String str10, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? true : z2, (i2 & 128) != 0 ? "" : str6, (i2 & 256) != 0 ? false : z3, (i2 & 512) != 0 ? "- -" : str7, (i2 & 1024) == 0 ? str8 : "- -", (i2 & 2048) != 0 ? "" : str9, (i2 & 4096) != 0 ? null : bizInstrument, (i2 & 8192) != 0 ? false : z4, (i2 & 16384) != 0 ? 0 : i, (i2 & 32768) != 0 ? false : z5, (i2 & 65536) != 0 ? "" : str10);
    }

    public String toString() {
        return "instrumentName: " + this.instrumentName + " instType:" + this.instType + " baseSymbol:" + this.baseSymbol + " quoteSymbol:" + this.quoteSymbol + " index:" + this.index;
    }

    public final String getDisplayQuoteSymbol() {
        return this.displayQuoteSymbol.length() == 0 ? this.quoteSymbol : this.displayQuoteSymbol;
    }
}
