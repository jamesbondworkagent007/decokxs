package com.okinc.business.dexlogic.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class IntentBridgeQuoteCallData {
    private final String amountOut;
    private final long deadline;
    private final String minimumReceived;
    private final QuotePriceRes quoteResult;
    private final String unsignedTx;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public IntentBridgeQuoteCallData() {
        this((QuotePriceRes) null, 0L, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ IntentBridgeQuoteCallData copy$default(IntentBridgeQuoteCallData intentBridgeQuoteCallData, QuotePriceRes quotePriceRes, long j, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            quotePriceRes = intentBridgeQuoteCallData.quoteResult;
        }
        if ((i & 2) != 0) {
            j = intentBridgeQuoteCallData.deadline;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            str = intentBridgeQuoteCallData.unsignedTx;
        }
        String str4 = str;
        if ((i & 8) != 0) {
            str2 = intentBridgeQuoteCallData.amountOut;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            str3 = intentBridgeQuoteCallData.minimumReceived;
        }
        return intentBridgeQuoteCallData.copy(quotePriceRes, j2, str4, str5, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuotePriceRes component1() {
        return this.quoteResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.deadline;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.unsignedTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.amountOut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.minimumReceived;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IntentBridgeQuoteCallData copy(QuotePriceRes quotePriceRes, long j, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new IntentBridgeQuoteCallData(quotePriceRes, j, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntentBridgeQuoteCallData)) {
            return false;
        }
        IntentBridgeQuoteCallData intentBridgeQuoteCallData = (IntentBridgeQuoteCallData) obj;
        return Intrinsics.EZpvd(this.quoteResult, intentBridgeQuoteCallData.quoteResult) && this.deadline == intentBridgeQuoteCallData.deadline && Intrinsics.EZpvd((Object) this.unsignedTx, (Object) intentBridgeQuoteCallData.unsignedTx) && Intrinsics.EZpvd((Object) this.amountOut, (Object) intentBridgeQuoteCallData.amountOut) && Intrinsics.EZpvd((Object) this.minimumReceived, (Object) intentBridgeQuoteCallData.minimumReceived);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmountOut() {
        return this.amountOut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getDeadline() {
        return this.deadline;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinimumReceived() {
        return this.minimumReceived;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuotePriceRes getQuoteResult() {
        return this.quoteResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnsignedTx() {
        return this.unsignedTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        QuotePriceRes quotePriceRes = this.quoteResult;
        return ((((((((quotePriceRes == null ? 0 : quotePriceRes.hashCode()) * 31) + Long.hashCode(this.deadline)) * 31) + this.unsignedTx.hashCode()) * 31) + this.amountOut.hashCode()) * 31) + this.minimumReceived.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "IntentBridgeQuoteCallData(quoteResult=" + this.quoteResult + ", deadline=" + this.deadline + ", unsignedTx=" + this.unsignedTx + ", amountOut=" + this.amountOut + ", minimumReceived=" + this.minimumReceived + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.IntentBridgeQuoteCallData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<IntentBridgeQuoteCallData> serializer() {
            return IntentBridgeQuoteCallData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ IntentBridgeQuoteCallData(int i, QuotePriceRes quotePriceRes, long j, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        this.quoteResult = (i & 1) == 0 ? null : quotePriceRes;
        if ((i & 2) == 0) {
            this.deadline = 0L;
        } else {
            this.deadline = j;
        }
        if ((i & 4) == 0) {
            this.unsignedTx = "";
        } else {
            this.unsignedTx = str;
        }
        if ((i & 8) == 0) {
            this.amountOut = "";
        } else {
            this.amountOut = str2;
        }
        if ((i & 16) == 0) {
            this.minimumReceived = "";
        } else {
            this.minimumReceived = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(IntentBridgeQuoteCallData intentBridgeQuoteCallData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || intentBridgeQuoteCallData.quoteResult != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, QuotePriceRes$$serializer.INSTANCE, intentBridgeQuoteCallData.quoteResult);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || intentBridgeQuoteCallData.deadline != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 1, intentBridgeQuoteCallData.deadline);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) intentBridgeQuoteCallData.unsignedTx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, intentBridgeQuoteCallData.unsignedTx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) intentBridgeQuoteCallData.amountOut, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, intentBridgeQuoteCallData.amountOut);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) intentBridgeQuoteCallData.minimumReceived, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, intentBridgeQuoteCallData.minimumReceived);
    }

    public IntentBridgeQuoteCallData(QuotePriceRes quotePriceRes, long j, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.quoteResult = quotePriceRes;
        this.deadline = j;
        this.unsignedTx = str;
        this.amountOut = str2;
        this.minimumReceived = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:com.okinc.business.dexlogic.bean.QuotePriceRes:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.QuotePriceRes) : (r5v0 com.okinc.business.dexlogic.bean.QuotePriceRes))
  (wrap:long:0x000b: TERNARY null = ((wrap:int:0x0005: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r6v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
 A[MD:(com.okinc.business.dexlogic.bean.QuotePriceRes, long, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:2134) call: com.okinc.business.dexlogic.bean.IntentBridgeQuoteCallData.<init>(com.okinc.business.dexlogic.bean.QuotePriceRes, long, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ IntentBridgeQuoteCallData(QuotePriceRes quotePriceRes, long j, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : quotePriceRes, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3);
    }
}
