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
public final class MergeQuoteCallData {
    private final IntentBridgeQuoteCallData intentBridgeCallData;
    private final QuoteCallData quoteCallData;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MergeQuoteCallData() {
        this((QuoteCallData) null, (IntentBridgeQuoteCallData) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MergeQuoteCallData copy$default(MergeQuoteCallData mergeQuoteCallData, QuoteCallData quoteCallData, IntentBridgeQuoteCallData intentBridgeQuoteCallData, int i, Object obj) {
        if ((i & 1) != 0) {
            quoteCallData = mergeQuoteCallData.quoteCallData;
        }
        if ((i & 2) != 0) {
            intentBridgeQuoteCallData = mergeQuoteCallData.intentBridgeCallData;
        }
        return mergeQuoteCallData.copy(quoteCallData, intentBridgeQuoteCallData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuoteCallData component1() {
        return this.quoteCallData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IntentBridgeQuoteCallData component2() {
        return this.intentBridgeCallData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MergeQuoteCallData copy(QuoteCallData quoteCallData, IntentBridgeQuoteCallData intentBridgeQuoteCallData) {
        return new MergeQuoteCallData(quoteCallData, intentBridgeQuoteCallData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MergeQuoteCallData)) {
            return false;
        }
        MergeQuoteCallData mergeQuoteCallData = (MergeQuoteCallData) obj;
        return Intrinsics.EZpvd(this.quoteCallData, mergeQuoteCallData.quoteCallData) && Intrinsics.EZpvd(this.intentBridgeCallData, mergeQuoteCallData.intentBridgeCallData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IntentBridgeQuoteCallData getIntentBridgeCallData() {
        return this.intentBridgeCallData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuoteCallData getQuoteCallData() {
        return this.quoteCallData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        QuoteCallData quoteCallData = this.quoteCallData;
        int iHashCode = quoteCallData == null ? 0 : quoteCallData.hashCode();
        IntentBridgeQuoteCallData intentBridgeQuoteCallData = this.intentBridgeCallData;
        return (iHashCode * 31) + (intentBridgeQuoteCallData != null ? intentBridgeQuoteCallData.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MergeQuoteCallData(quoteCallData=" + this.quoteCallData + ", intentBridgeCallData=" + this.intentBridgeCallData + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.MergeQuoteCallData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MergeQuoteCallData> serializer() {
            return MergeQuoteCallData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MergeQuoteCallData(int i, QuoteCallData quoteCallData, IntentBridgeQuoteCallData intentBridgeQuoteCallData, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.quoteCallData = null;
        } else {
            this.quoteCallData = quoteCallData;
        }
        if ((i & 2) == 0) {
            this.intentBridgeCallData = null;
        } else {
            this.intentBridgeCallData = intentBridgeQuoteCallData;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(MergeQuoteCallData mergeQuoteCallData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || mergeQuoteCallData.quoteCallData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, QuoteCallData$$serializer.INSTANCE, mergeQuoteCallData.quoteCallData);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && mergeQuoteCallData.intentBridgeCallData == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntentBridgeQuoteCallData$$serializer.INSTANCE, mergeQuoteCallData.intentBridgeCallData);
    }

    public MergeQuoteCallData(QuoteCallData quoteCallData, IntentBridgeQuoteCallData intentBridgeQuoteCallData) {
        this.quoteCallData = quoteCallData;
        this.intentBridgeCallData = intentBridgeQuoteCallData;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.business.dexlogic.bean.QuoteCallData:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.QuoteCallData) : (r2v0 com.okinc.business.dexlogic.bean.QuoteCallData))
  (wrap:com.okinc.business.dexlogic.bean.IntentBridgeQuoteCallData:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.IntentBridgeQuoteCallData) : (r3v0 com.okinc.business.dexlogic.bean.IntentBridgeQuoteCallData))
 A[MD:(com.okinc.business.dexlogic.bean.QuoteCallData, com.okinc.business.dexlogic.bean.IntentBridgeQuoteCallData):void (m)] (LINE:2490) call: com.okinc.business.dexlogic.bean.MergeQuoteCallData.<init>(com.okinc.business.dexlogic.bean.QuoteCallData, com.okinc.business.dexlogic.bean.IntentBridgeQuoteCallData):void type: THIS */
    public /* synthetic */ MergeQuoteCallData(QuoteCallData quoteCallData, IntentBridgeQuoteCallData intentBridgeQuoteCallData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : quoteCallData, (i & 2) != 0 ? null : intentBridgeQuoteCallData);
    }

    public final QuotePriceRes getQuoteResult(boolean z, boolean z2) {
        if (z2) {
            IntentBridgeQuoteCallData intentBridgeQuoteCallData = this.intentBridgeCallData;
            if (intentBridgeQuoteCallData != null) {
                return intentBridgeQuoteCallData.getQuoteResult();
            }
        } else {
            QuoteCallData quoteCallData = this.quoteCallData;
            if (quoteCallData != null) {
                return quoteCallData.getQuoteResult();
            }
        }
        return null;
    }
}
