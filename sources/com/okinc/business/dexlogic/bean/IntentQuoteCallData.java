package com.okinc.business.dexlogic.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class IntentQuoteCallData {
    private final String quote;
    private final QuotePriceRes quoteResult;
    private final String tradingModeType;
    private final String unsignedTx;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ IntentQuoteCallData copy$default(IntentQuoteCallData intentQuoteCallData, String str, QuotePriceRes quotePriceRes, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = intentQuoteCallData.quote;
        }
        if ((i & 2) != 0) {
            quotePriceRes = intentQuoteCallData.quoteResult;
        }
        if ((i & 4) != 0) {
            str2 = intentQuoteCallData.unsignedTx;
        }
        if ((i & 8) != 0) {
            str3 = intentQuoteCallData.tradingModeType;
        }
        return intentQuoteCallData.copy(str, quotePriceRes, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.quote;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuotePriceRes component2() {
        return this.quoteResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.unsignedTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tradingModeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IntentQuoteCallData copy(@NotNull String str, QuotePriceRes quotePriceRes, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new IntentQuoteCallData(str, quotePriceRes, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntentQuoteCallData)) {
            return false;
        }
        IntentQuoteCallData intentQuoteCallData = (IntentQuoteCallData) obj;
        return Intrinsics.EZpvd((Object) this.quote, (Object) intentQuoteCallData.quote) && Intrinsics.EZpvd(this.quoteResult, intentQuoteCallData.quoteResult) && Intrinsics.EZpvd((Object) this.unsignedTx, (Object) intentQuoteCallData.unsignedTx) && Intrinsics.EZpvd((Object) this.tradingModeType, (Object) intentQuoteCallData.tradingModeType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuote() {
        return this.quote;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuotePriceRes getQuoteResult() {
        return this.quoteResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradingModeType() {
        return this.tradingModeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnsignedTx() {
        return this.unsignedTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.quote.hashCode();
        QuotePriceRes quotePriceRes = this.quoteResult;
        return (((((iHashCode * 31) + (quotePriceRes == null ? 0 : quotePriceRes.hashCode())) * 31) + this.unsignedTx.hashCode()) * 31) + this.tradingModeType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "IntentQuoteCallData(quote=" + this.quote + ", quoteResult=" + this.quoteResult + ", unsignedTx=" + this.unsignedTx + ", tradingModeType=" + this.tradingModeType + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.IntentQuoteCallData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<IntentQuoteCallData> serializer() {
            return IntentQuoteCallData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ IntentQuoteCallData(int i, String str, QuotePriceRes quotePriceRes, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (5 != (i & 5)) {
            PluginExceptionsKt.throwMissingFieldException(i, 5, IntentQuoteCallData$$serializer.INSTANCE.getDescriptor());
        }
        this.quote = str;
        if ((i & 2) == 0) {
            this.quoteResult = null;
        } else {
            this.quoteResult = quotePriceRes;
        }
        this.unsignedTx = str2;
        if ((i & 8) == 0) {
            this.tradingModeType = "";
        } else {
            this.tradingModeType = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(IntentQuoteCallData intentQuoteCallData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, intentQuoteCallData.quote);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || intentQuoteCallData.quoteResult != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, QuotePriceRes$$serializer.INSTANCE, intentQuoteCallData.quoteResult);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, intentQuoteCallData.unsignedTx);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) intentQuoteCallData.tradingModeType, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, intentQuoteCallData.tradingModeType);
    }

    public IntentQuoteCallData(@NotNull String str, QuotePriceRes quotePriceRes, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.quote = str;
        this.quoteResult = quotePriceRes;
        this.unsignedTx = str2;
        this.tradingModeType = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:com.okinc.business.dexlogic.bean.QuotePriceRes:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.QuotePriceRes) : (r2v0 com.okinc.business.dexlogic.bean.QuotePriceRes))
  (r3v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, com.okinc.business.dexlogic.bean.QuotePriceRes, java.lang.String, java.lang.String):void (m)] (LINE:2144) call: com.okinc.business.dexlogic.bean.IntentQuoteCallData.<init>(java.lang.String, com.okinc.business.dexlogic.bean.QuotePriceRes, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ IntentQuoteCallData(String str, QuotePriceRes quotePriceRes, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : quotePriceRes, str2, (i & 8) != 0 ? "" : str3);
    }
}
