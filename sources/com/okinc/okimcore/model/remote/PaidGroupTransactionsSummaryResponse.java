package com.okinc.okimcore.model.remote;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class PaidGroupTransactionsSummaryResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Integer amountPayoutDays;
    private final String currencySymbol;
    private final String totalAmountReceived;
    private final String totalAmountReleased;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PaidGroupTransactionsSummaryResponse() {
        this((String) null, (String) null, (String) null, (Integer) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PaidGroupTransactionsSummaryResponse copy$default(PaidGroupTransactionsSummaryResponse paidGroupTransactionsSummaryResponse, String str, String str2, String str3, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paidGroupTransactionsSummaryResponse.totalAmountReceived;
        }
        if ((i & 2) != 0) {
            str2 = paidGroupTransactionsSummaryResponse.currencySymbol;
        }
        if ((i & 4) != 0) {
            str3 = paidGroupTransactionsSummaryResponse.totalAmountReleased;
        }
        if ((i & 8) != 0) {
            num = paidGroupTransactionsSummaryResponse.amountPayoutDays;
        }
        return paidGroupTransactionsSummaryResponse.copy(str, str2, str3, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.totalAmountReceived;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.currencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.totalAmountReleased;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.amountPayoutDays;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaidGroupTransactionsSummaryResponse copy(String str, String str2, String str3, Integer num) {
        return new PaidGroupTransactionsSummaryResponse(str, str2, str3, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaidGroupTransactionsSummaryResponse)) {
            return false;
        }
        PaidGroupTransactionsSummaryResponse paidGroupTransactionsSummaryResponse = (PaidGroupTransactionsSummaryResponse) obj;
        return Intrinsics.EZpvd((Object) this.totalAmountReceived, (Object) paidGroupTransactionsSummaryResponse.totalAmountReceived) && Intrinsics.EZpvd((Object) this.currencySymbol, (Object) paidGroupTransactionsSummaryResponse.currencySymbol) && Intrinsics.EZpvd((Object) this.totalAmountReleased, (Object) paidGroupTransactionsSummaryResponse.totalAmountReleased) && Intrinsics.EZpvd(this.amountPayoutDays, paidGroupTransactionsSummaryResponse.amountPayoutDays);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAmountPayoutDays() {
        return this.amountPayoutDays;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencySymbol() {
        return this.currencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalAmountReceived() {
        return this.totalAmountReceived;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalAmountReleased() {
        return this.totalAmountReleased;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.totalAmountReceived;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.currencySymbol;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.totalAmountReleased;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        Integer num = this.amountPayoutDays;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PaidGroupTransactionsSummaryResponse(totalAmountReceived=" + this.totalAmountReceived + ", currencySymbol=" + this.currencySymbol + ", totalAmountReleased=" + this.totalAmountReleased + ", amountPayoutDays=" + this.amountPayoutDays + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.PaidGroupTransactionsSummaryResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PaidGroupTransactionsSummaryResponse> serializer() {
            return PaidGroupTransactionsSummaryResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PaidGroupTransactionsSummaryResponse(int i, String str, String str2, String str3, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.totalAmountReceived = null;
        } else {
            this.totalAmountReceived = str;
        }
        if ((i & 2) == 0) {
            this.currencySymbol = null;
        } else {
            this.currencySymbol = str2;
        }
        if ((i & 4) == 0) {
            this.totalAmountReleased = null;
        } else {
            this.totalAmountReleased = str3;
        }
        if ((i & 8) == 0) {
            this.amountPayoutDays = null;
        } else {
            this.amountPayoutDays = num;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(PaidGroupTransactionsSummaryResponse paidGroupTransactionsSummaryResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || paidGroupTransactionsSummaryResponse.totalAmountReceived != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, paidGroupTransactionsSummaryResponse.totalAmountReceived);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || paidGroupTransactionsSummaryResponse.currencySymbol != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, paidGroupTransactionsSummaryResponse.currencySymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || paidGroupTransactionsSummaryResponse.totalAmountReleased != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, paidGroupTransactionsSummaryResponse.totalAmountReleased);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && paidGroupTransactionsSummaryResponse.amountPayoutDays == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, paidGroupTransactionsSummaryResponse.amountPayoutDays);
    }

    public PaidGroupTransactionsSummaryResponse(String str, String str2, String str3, Integer num) {
        this.totalAmountReceived = str;
        this.currencySymbol = str2;
        this.totalAmountReleased = str3;
        this.amountPayoutDays = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r5v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer):void (m)] (LINE:8) call: com.okinc.okimcore.model.remote.PaidGroupTransactionsSummaryResponse.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ PaidGroupTransactionsSummaryResponse(String str, String str2, String str3, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num);
    }
}
