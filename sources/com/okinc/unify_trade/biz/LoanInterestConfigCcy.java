package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class LoanInterestConfigCcy implements Parcelable {
    public static final int $stable = 0;
    private final String ccy;
    private final String dnaFlexLoanQuotaMode;
    private final String generalFlexLoanQuotaMode;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<LoanInterestConfigCcy> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<LoanInterestConfigCcy> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LoanInterestConfigCcy createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new LoanInterestConfigCcy(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LoanInterestConfigCcy[] newArray(int i) {
            return new LoanInterestConfigCcy[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LoanInterestConfigCcy() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LoanInterestConfigCcy copy$default(LoanInterestConfigCcy loanInterestConfigCcy, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loanInterestConfigCcy.ccy;
        }
        if ((i & 2) != 0) {
            str2 = loanInterestConfigCcy.dnaFlexLoanQuotaMode;
        }
        if ((i & 4) != 0) {
            str3 = loanInterestConfigCcy.generalFlexLoanQuotaMode;
        }
        return loanInterestConfigCcy.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.dnaFlexLoanQuotaMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.generalFlexLoanQuotaMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LoanInterestConfigCcy copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new LoanInterestConfigCcy(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoanInterestConfigCcy)) {
            return false;
        }
        LoanInterestConfigCcy loanInterestConfigCcy = (LoanInterestConfigCcy) obj;
        return Intrinsics.EZpvd((Object) this.ccy, (Object) loanInterestConfigCcy.ccy) && Intrinsics.EZpvd((Object) this.dnaFlexLoanQuotaMode, (Object) loanInterestConfigCcy.dnaFlexLoanQuotaMode) && Intrinsics.EZpvd((Object) this.generalFlexLoanQuotaMode, (Object) loanInterestConfigCcy.generalFlexLoanQuotaMode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDnaFlexLoanQuotaMode() {
        return this.dnaFlexLoanQuotaMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGeneralFlexLoanQuotaMode() {
        return this.generalFlexLoanQuotaMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.ccy.hashCode() * 31) + this.dnaFlexLoanQuotaMode.hashCode()) * 31) + this.generalFlexLoanQuotaMode.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LoanInterestConfigCcy(ccy=" + this.ccy + ", dnaFlexLoanQuotaMode=" + this.dnaFlexLoanQuotaMode + ", generalFlexLoanQuotaMode=" + this.generalFlexLoanQuotaMode + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.ccy);
        parcel.writeString(this.dnaFlexLoanQuotaMode);
        parcel.writeString(this.generalFlexLoanQuotaMode);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.LoanInterestConfigCcy.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LoanInterestConfigCcy> serializer() {
            return LoanInterestConfigCcy$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LoanInterestConfigCcy(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.ccy = "";
        } else {
            this.ccy = str;
        }
        if ((i & 2) == 0) {
            this.dnaFlexLoanQuotaMode = "";
        } else {
            this.dnaFlexLoanQuotaMode = str2;
        }
        if ((i & 4) == 0) {
            this.generalFlexLoanQuotaMode = "";
        } else {
            this.generalFlexLoanQuotaMode = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(LoanInterestConfigCcy loanInterestConfigCcy, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) loanInterestConfigCcy.ccy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, loanInterestConfigCcy.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) loanInterestConfigCcy.dnaFlexLoanQuotaMode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, loanInterestConfigCcy.dnaFlexLoanQuotaMode);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) loanInterestConfigCcy.generalFlexLoanQuotaMode, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, loanInterestConfigCcy.generalFlexLoanQuotaMode);
    }

    public LoanInterestConfigCcy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.ccy = str;
        this.dnaFlexLoanQuotaMode = str2;
        this.generalFlexLoanQuotaMode = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:3550) call: com.okinc.unify_trade.biz.LoanInterestConfigCcy.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ LoanInterestConfigCcy(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
