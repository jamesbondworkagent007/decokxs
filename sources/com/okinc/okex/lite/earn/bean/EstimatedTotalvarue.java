package com.okinc.okex.lite.earn.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class EstimatedTotalvarue {
    private String amount;
    private Currency currency;
    private String tag;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EstimatedTotalvarue() {
        this((String) null, (Currency) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EstimatedTotalvarue copy$default(EstimatedTotalvarue estimatedTotalvarue, String str, Currency currency, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = estimatedTotalvarue.amount;
        }
        if ((i & 2) != 0) {
            currency = estimatedTotalvarue.currency;
        }
        if ((i & 4) != 0) {
            str2 = estimatedTotalvarue.tag;
        }
        return estimatedTotalvarue.copy(str, currency, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Currency component2() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EstimatedTotalvarue copy(@NotNull String str, Currency currency, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new EstimatedTotalvarue(str, currency, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EstimatedTotalvarue)) {
            return false;
        }
        EstimatedTotalvarue estimatedTotalvarue = (EstimatedTotalvarue) obj;
        return Intrinsics.EZpvd((Object) this.amount, (Object) estimatedTotalvarue.amount) && Intrinsics.EZpvd(this.currency, estimatedTotalvarue.currency) && Intrinsics.EZpvd((Object) this.tag, (Object) estimatedTotalvarue.tag);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Currency getCurrency() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTag() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.amount.hashCode();
        Currency currency = this.currency;
        return (((iHashCode * 31) + (currency == null ? 0 : currency.hashCode())) * 31) + this.tag.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.amount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrency(Currency currency) {
        this.currency = currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tag = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EstimatedTotalvarue(amount=" + this.amount + ", currency=" + this.currency + ", tag=" + this.tag + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.earn.bean.EstimatedTotalvarue.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EstimatedTotalvarue> serializer() {
            return EstimatedTotalvarue$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EstimatedTotalvarue(int i, String str, Currency currency, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        this.amount = (i & 1) == 0 ? "0" : str;
        if ((i & 2) == 0) {
            this.currency = null;
        } else {
            this.currency = currency;
        }
        if ((i & 4) == 0) {
            this.tag = "";
        } else {
            this.tag = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKFinance_finance_api(EstimatedTotalvarue estimatedTotalvarue, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) estimatedTotalvarue.amount, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, estimatedTotalvarue.amount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || estimatedTotalvarue.currency != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, Currency$$serializer.INSTANCE, estimatedTotalvarue.currency);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) estimatedTotalvarue.tag, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, estimatedTotalvarue.tag);
    }

    public EstimatedTotalvarue(@NotNull String str, Currency currency, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.amount = str;
        this.currency = currency;
        this.tag = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("0") : (r1v0 java.lang.String))
  (wrap:com.okinc.okex.lite.earn.bean.Currency:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.lite.earn.bean.Currency) : (r2v0 com.okinc.okex.lite.earn.bean.Currency))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, com.okinc.okex.lite.earn.bean.Currency, java.lang.String):void (m)] (LINE:79) call: com.okinc.okex.lite.earn.bean.EstimatedTotalvarue.<init>(java.lang.String, com.okinc.okex.lite.earn.bean.Currency, java.lang.String):void type: THIS */
    public /* synthetic */ EstimatedTotalvarue(String str, Currency currency, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "0" : str, (i & 2) != 0 ? null : currency, (i & 4) != 0 ? "" : str2);
    }
}
