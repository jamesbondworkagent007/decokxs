package com.okinc.business.dexlogic.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class QuoteCallData {
    private final UnsignedSwapData callDataResult;
    private final QuotePriceRes quoteResult;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public QuoteCallData() {
        this((UnsignedSwapData) null, (QuotePriceRes) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ QuoteCallData copy$default(QuoteCallData quoteCallData, UnsignedSwapData unsignedSwapData, QuotePriceRes quotePriceRes, int i, Object obj) {
        if ((i & 1) != 0) {
            unsignedSwapData = quoteCallData.callDataResult;
        }
        if ((i & 2) != 0) {
            quotePriceRes = quoteCallData.quoteResult;
        }
        return quoteCallData.copy(unsignedSwapData, quotePriceRes);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UnsignedSwapData component1() {
        return this.callDataResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuotePriceRes component2() {
        return this.quoteResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuoteCallData copy(UnsignedSwapData unsignedSwapData, QuotePriceRes quotePriceRes) {
        return new QuoteCallData(unsignedSwapData, quotePriceRes);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuoteCallData)) {
            return false;
        }
        QuoteCallData quoteCallData = (QuoteCallData) obj;
        return Intrinsics.EZpvd(this.callDataResult, quoteCallData.callDataResult) && Intrinsics.EZpvd(this.quoteResult, quoteCallData.quoteResult);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UnsignedSwapData getCallDataResult() {
        return this.callDataResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuotePriceRes getQuoteResult() {
        return this.quoteResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        UnsignedSwapData unsignedSwapData = this.callDataResult;
        int iHashCode = unsignedSwapData == null ? 0 : unsignedSwapData.hashCode();
        QuotePriceRes quotePriceRes = this.quoteResult;
        return (iHashCode * 31) + (quotePriceRes != null ? quotePriceRes.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "QuoteCallData(callDataResult=" + this.callDataResult + ", quoteResult=" + this.quoteResult + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.QuoteCallData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<QuoteCallData> serializer() {
            return QuoteCallData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ QuoteCallData(int i, UnsignedSwapData unsignedSwapData, QuotePriceRes quotePriceRes, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.callDataResult = null;
        } else {
            this.callDataResult = unsignedSwapData;
        }
        if ((i & 2) == 0) {
            this.quoteResult = null;
        } else {
            this.quoteResult = quotePriceRes;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(QuoteCallData quoteCallData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || quoteCallData.callDataResult != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, UnsignedSwapData$$serializer.INSTANCE, quoteCallData.callDataResult);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && quoteCallData.quoteResult == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, QuotePriceRes$$serializer.INSTANCE, quoteCallData.quoteResult);
    }

    public QuoteCallData(UnsignedSwapData unsignedSwapData, QuotePriceRes quotePriceRes) {
        this.callDataResult = unsignedSwapData;
        this.quoteResult = quotePriceRes;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.business.dexlogic.bean.UnsignedSwapData:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.UnsignedSwapData) : (r2v0 com.okinc.business.dexlogic.bean.UnsignedSwapData))
  (wrap:com.okinc.business.dexlogic.bean.QuotePriceRes:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.QuotePriceRes) : (r3v0 com.okinc.business.dexlogic.bean.QuotePriceRes))
 A[MD:(com.okinc.business.dexlogic.bean.UnsignedSwapData, com.okinc.business.dexlogic.bean.QuotePriceRes):void (m)] (LINE:2127) call: com.okinc.business.dexlogic.bean.QuoteCallData.<init>(com.okinc.business.dexlogic.bean.UnsignedSwapData, com.okinc.business.dexlogic.bean.QuotePriceRes):void type: THIS */
    public /* synthetic */ QuoteCallData(UnsignedSwapData unsignedSwapData, QuotePriceRes quotePriceRes, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : unsignedSwapData, (i & 2) != 0 ? null : quotePriceRes);
    }
}
