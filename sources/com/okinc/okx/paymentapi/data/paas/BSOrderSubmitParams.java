package com.okinc.okx.paymentapi.data.paas;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC47240tmM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class BSOrderSubmitParams implements InterfaceC47240tmM, Parcelable {
    public final QuoteProperties AEQbTJ;
    public final PaymentOrderSubmitTarget AYXKKw;
    public final EarnProperties EZpvd;
    public final BlikProperties KWHzl;
    public final PaymentMethodProperties copydefault;
    public final RecurringProperties gEmmrt;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public static final Parcelable.Creator<BSOrderSubmitParams> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<BSOrderSubmitParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BSOrderSubmitParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BSOrderSubmitParams(PaymentOrderSubmitTarget.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : PaymentMethodProperties.CREATOR.createFromParcel(parcel), QuoteProperties.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : EarnProperties.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RecurringProperties.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? BlikProperties.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BSOrderSubmitParams[] newArray(int i) {
            return new BSOrderSubmitParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BSOrderSubmitParams copy$default(BSOrderSubmitParams bSOrderSubmitParams, PaymentOrderSubmitTarget paymentOrderSubmitTarget, PaymentMethodProperties paymentMethodProperties, QuoteProperties quoteProperties, EarnProperties earnProperties, RecurringProperties recurringProperties, BlikProperties blikProperties, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentOrderSubmitTarget = bSOrderSubmitParams.AYXKKw;
        }
        if ((i & 2) != 0) {
            paymentMethodProperties = bSOrderSubmitParams.copydefault;
        }
        PaymentMethodProperties paymentMethodProperties2 = paymentMethodProperties;
        if ((i & 4) != 0) {
            quoteProperties = bSOrderSubmitParams.AEQbTJ;
        }
        QuoteProperties quoteProperties2 = quoteProperties;
        if ((i & 8) != 0) {
            earnProperties = bSOrderSubmitParams.EZpvd;
        }
        EarnProperties earnProperties2 = earnProperties;
        if ((i & 16) != 0) {
            recurringProperties = bSOrderSubmitParams.gEmmrt;
        }
        RecurringProperties recurringProperties2 = recurringProperties;
        if ((i & 32) != 0) {
            blikProperties = bSOrderSubmitParams.KWHzl;
        }
        return bSOrderSubmitParams.KWHzl(paymentOrderSubmitTarget, paymentMethodProperties2, quoteProperties2, earnProperties2, recurringProperties2, blikProperties);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BSOrderSubmitParams KWHzl(@NotNull PaymentOrderSubmitTarget paymentOrderSubmitTarget, PaymentMethodProperties paymentMethodProperties, @NotNull QuoteProperties quoteProperties, EarnProperties earnProperties, RecurringProperties recurringProperties, BlikProperties blikProperties) {
        Intrinsics.checkNotNullParameter(paymentOrderSubmitTarget, "");
        Intrinsics.checkNotNullParameter(quoteProperties, "");
        return new BSOrderSubmitParams(paymentOrderSubmitTarget, paymentMethodProperties, quoteProperties, earnProperties, recurringProperties, blikProperties);
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
        if (!(obj instanceof BSOrderSubmitParams)) {
            return false;
        }
        BSOrderSubmitParams bSOrderSubmitParams = (BSOrderSubmitParams) obj;
        return this.AYXKKw == bSOrderSubmitParams.AYXKKw && Intrinsics.EZpvd(this.copydefault, bSOrderSubmitParams.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, bSOrderSubmitParams.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, bSOrderSubmitParams.EZpvd) && Intrinsics.EZpvd(this.gEmmrt, bSOrderSubmitParams.gEmmrt) && Intrinsics.EZpvd(this.KWHzl, bSOrderSubmitParams.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AYXKKw.hashCode();
        PaymentMethodProperties paymentMethodProperties = this.copydefault;
        int iHashCode2 = paymentMethodProperties == null ? 0 : paymentMethodProperties.hashCode();
        int iHashCode3 = this.AEQbTJ.hashCode();
        EarnProperties earnProperties = this.EZpvd;
        int iHashCode4 = earnProperties == null ? 0 : earnProperties.hashCode();
        RecurringProperties recurringProperties = this.gEmmrt;
        int iHashCode5 = recurringProperties == null ? 0 : recurringProperties.hashCode();
        BlikProperties blikProperties = this.KWHzl;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (blikProperties != null ? blikProperties.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BSOrderSubmitParams(target=" + this.AYXKKw + ", paymentMethodProperties=" + this.copydefault + ", quoteProperties=" + this.AEQbTJ + ", earnProperties=" + this.EZpvd + ", recurringProperties=" + this.gEmmrt + ", blikProperties=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AYXKKw.name());
        PaymentMethodProperties paymentMethodProperties = this.copydefault;
        if (paymentMethodProperties == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paymentMethodProperties.writeToParcel(parcel, i);
        }
        this.AEQbTJ.writeToParcel(parcel, i);
        EarnProperties earnProperties = this.EZpvd;
        if (earnProperties == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            earnProperties.writeToParcel(parcel, i);
        }
        RecurringProperties recurringProperties = this.gEmmrt;
        if (recurringProperties == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            recurringProperties.writeToParcel(parcel, i);
        }
        BlikProperties blikProperties = this.KWHzl;
        if (blikProperties == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            blikProperties.writeToParcel(parcel, i);
        }
    }

    public BSOrderSubmitParams(@NotNull PaymentOrderSubmitTarget paymentOrderSubmitTarget, PaymentMethodProperties paymentMethodProperties, @NotNull QuoteProperties quoteProperties, EarnProperties earnProperties, RecurringProperties recurringProperties, BlikProperties blikProperties) {
        Intrinsics.checkNotNullParameter(paymentOrderSubmitTarget, "");
        Intrinsics.checkNotNullParameter(quoteProperties, "");
        this.AYXKKw = paymentOrderSubmitTarget;
        this.copydefault = paymentMethodProperties;
        this.AEQbTJ = quoteProperties;
        this.EZpvd = earnProperties;
        this.gEmmrt = recurringProperties;
        this.KWHzl = blikProperties;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0020: CONSTRUCTOR 
  (r10v0 com.okinc.okx.paymentapi.data.paas.PaymentOrderSubmitTarget)
  (wrap:com.okinc.okx.paymentapi.data.paas.PaymentMethodProperties:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okx.paymentapi.data.paas.PaymentMethodProperties) : (r11v0 com.okinc.okx.paymentapi.data.paas.PaymentMethodProperties))
  (r12v0 com.okinc.okx.paymentapi.data.paas.QuoteProperties)
  (wrap:com.okinc.okx.paymentapi.data.paas.EarnProperties:?: TERNARY null = ((wrap:int:0x0008: ARITH (r16v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okx.paymentapi.data.paas.EarnProperties) : (r13v0 com.okinc.okx.paymentapi.data.paas.EarnProperties))
  (wrap:com.okinc.okx.paymentapi.data.paas.RecurringProperties:?: TERNARY null = ((wrap:int:0x000f: ARITH (r16v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okx.paymentapi.data.paas.RecurringProperties) : (r14v0 com.okinc.okx.paymentapi.data.paas.RecurringProperties))
  (wrap:com.okinc.okx.paymentapi.data.paas.BlikProperties:?: TERNARY null = ((wrap:int:0x0016: ARITH (r16v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okx.paymentapi.data.paas.BlikProperties) : (r15v0 com.okinc.okx.paymentapi.data.paas.BlikProperties))
 A[MD:(com.okinc.okx.paymentapi.data.paas.PaymentOrderSubmitTarget, com.okinc.okx.paymentapi.data.paas.PaymentMethodProperties, com.okinc.okx.paymentapi.data.paas.QuoteProperties, com.okinc.okx.paymentapi.data.paas.EarnProperties, com.okinc.okx.paymentapi.data.paas.RecurringProperties, com.okinc.okx.paymentapi.data.paas.BlikProperties):void (m)] (LINE:15) call: com.okinc.okx.paymentapi.data.paas.BSOrderSubmitParams.<init>(com.okinc.okx.paymentapi.data.paas.PaymentOrderSubmitTarget, com.okinc.okx.paymentapi.data.paas.PaymentMethodProperties, com.okinc.okx.paymentapi.data.paas.QuoteProperties, com.okinc.okx.paymentapi.data.paas.EarnProperties, com.okinc.okx.paymentapi.data.paas.RecurringProperties, com.okinc.okx.paymentapi.data.paas.BlikProperties):void type: THIS */
    public /* synthetic */ BSOrderSubmitParams(PaymentOrderSubmitTarget paymentOrderSubmitTarget, PaymentMethodProperties paymentMethodProperties, QuoteProperties quoteProperties, EarnProperties earnProperties, RecurringProperties recurringProperties, BlikProperties blikProperties, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(paymentOrderSubmitTarget, (i & 2) != 0 ? null : paymentMethodProperties, quoteProperties, (i & 8) != 0 ? null : earnProperties, (i & 16) != 0 ? null : recurringProperties, (i & 32) != 0 ? null : blikProperties);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okx.paymentapi.data.paas.BSOrderSubmitParams.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ BSOrderSubmitParams buildBlikParams$default(StateListAnimator stateListAnimator, BlikProperties blikProperties, QuoteProperties quoteProperties, EarnProperties earnProperties, int i, Object obj) {
            if ((i & 4) != 0) {
                earnProperties = null;
            }
            return stateListAnimator.AEQbTJ(blikProperties, quoteProperties, earnProperties);
        }

        public final BSOrderSubmitParams AEQbTJ(@NotNull BlikProperties blikProperties, @NotNull QuoteProperties quoteProperties, EarnProperties earnProperties) {
            Intrinsics.checkNotNullParameter(blikProperties, "");
            Intrinsics.checkNotNullParameter(quoteProperties, "");
            return new BSOrderSubmitParams(PaymentOrderSubmitTarget.BLIK_BUY, new PaymentMethodProperties("", "0", "card"), quoteProperties, earnProperties, null, blikProperties, 16, null);
        }
    }
}
