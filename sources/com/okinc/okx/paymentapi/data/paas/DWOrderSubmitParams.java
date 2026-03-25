package com.okinc.okx.paymentapi.data.paas;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC47240tmM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class DWOrderSubmitParams implements InterfaceC47240tmM, Parcelable {
    public final Function1<PaymentOrderSubmitResult, Unit> AEQbTJ;
    public final CardProperties KWHzl;
    public final DWProperties OLrzqt;
    public final PaymentMethodProperties copydefault;
    public final PaymentOrderSubmitTarget gEmmrt;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public static final Parcelable.Creator<DWOrderSubmitParams> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DWOrderSubmitParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DWOrderSubmitParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DWOrderSubmitParams(PaymentOrderSubmitTarget.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : PaymentMethodProperties.CREATOR.createFromParcel(parcel), DWProperties.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CardProperties.CREATOR.createFromParcel(parcel) : null, null, 16, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DWOrderSubmitParams[] newArray(int i) {
            return new DWOrderSubmitParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.okx.paymentapi.data.paas.DWOrderSubmitParams */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DWOrderSubmitParams copy$default(DWOrderSubmitParams dWOrderSubmitParams, PaymentOrderSubmitTarget paymentOrderSubmitTarget, PaymentMethodProperties paymentMethodProperties, DWProperties dWProperties, CardProperties cardProperties, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentOrderSubmitTarget = dWOrderSubmitParams.gEmmrt;
        }
        if ((i & 2) != 0) {
            paymentMethodProperties = dWOrderSubmitParams.copydefault;
        }
        PaymentMethodProperties paymentMethodProperties2 = paymentMethodProperties;
        if ((i & 4) != 0) {
            dWProperties = dWOrderSubmitParams.OLrzqt;
        }
        DWProperties dWProperties2 = dWProperties;
        if ((i & 8) != 0) {
            cardProperties = dWOrderSubmitParams.KWHzl;
        }
        CardProperties cardProperties2 = cardProperties;
        if ((i & 16) != 0) {
            function1 = dWOrderSubmitParams.AEQbTJ;
        }
        return dWOrderSubmitParams.OLrzqt(paymentOrderSubmitTarget, paymentMethodProperties2, dWProperties2, cardProperties2, function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DWOrderSubmitParams OLrzqt(@NotNull PaymentOrderSubmitTarget paymentOrderSubmitTarget, PaymentMethodProperties paymentMethodProperties, @NotNull DWProperties dWProperties, CardProperties cardProperties, Function1<? super PaymentOrderSubmitResult, Unit> function1) {
        Intrinsics.checkNotNullParameter(paymentOrderSubmitTarget, "");
        Intrinsics.checkNotNullParameter(dWProperties, "");
        return new DWOrderSubmitParams(paymentOrderSubmitTarget, paymentMethodProperties, dWProperties, cardProperties, function1);
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
        if (!(obj instanceof DWOrderSubmitParams)) {
            return false;
        }
        DWOrderSubmitParams dWOrderSubmitParams = (DWOrderSubmitParams) obj;
        return this.gEmmrt == dWOrderSubmitParams.gEmmrt && Intrinsics.EZpvd(this.copydefault, dWOrderSubmitParams.copydefault) && Intrinsics.EZpvd(this.OLrzqt, dWOrderSubmitParams.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, dWOrderSubmitParams.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, dWOrderSubmitParams.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.gEmmrt.hashCode();
        PaymentMethodProperties paymentMethodProperties = this.copydefault;
        int iHashCode2 = paymentMethodProperties == null ? 0 : paymentMethodProperties.hashCode();
        int iHashCode3 = this.OLrzqt.hashCode();
        CardProperties cardProperties = this.KWHzl;
        int iHashCode4 = cardProperties == null ? 0 : cardProperties.hashCode();
        Function1<PaymentOrderSubmitResult, Unit> function1 = this.AEQbTJ;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (function1 != null ? function1.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DWOrderSubmitParams(target=" + this.gEmmrt + ", paymentMethodProperties=" + this.copydefault + ", dwProperties=" + this.OLrzqt + ", cardProperties=" + this.KWHzl + ", statusCallback=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.gEmmrt.name());
        PaymentMethodProperties paymentMethodProperties = this.copydefault;
        if (paymentMethodProperties == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paymentMethodProperties.writeToParcel(parcel, i);
        }
        this.OLrzqt.writeToParcel(parcel, i);
        CardProperties cardProperties = this.KWHzl;
        if (cardProperties == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cardProperties.writeToParcel(parcel, i);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.okx.paymentapi.data.paas.PaymentOrderSubmitResult, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public DWOrderSubmitParams(@NotNull PaymentOrderSubmitTarget paymentOrderSubmitTarget, PaymentMethodProperties paymentMethodProperties, @NotNull DWProperties dWProperties, CardProperties cardProperties, Function1<? super PaymentOrderSubmitResult, Unit> function1) {
        Intrinsics.checkNotNullParameter(paymentOrderSubmitTarget, "");
        Intrinsics.checkNotNullParameter(dWProperties, "");
        this.gEmmrt = paymentOrderSubmitTarget;
        this.copydefault = paymentMethodProperties;
        this.OLrzqt = dWProperties;
        this.KWHzl = cardProperties;
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (r8v0 com.okinc.okx.paymentapi.data.paas.PaymentOrderSubmitTarget)
  (wrap:com.okinc.okx.paymentapi.data.paas.PaymentMethodProperties:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okx.paymentapi.data.paas.PaymentMethodProperties) : (r9v0 com.okinc.okx.paymentapi.data.paas.PaymentMethodProperties))
  (r10v0 com.okinc.okx.paymentapi.data.paas.DWProperties)
  (wrap:com.okinc.okx.paymentapi.data.paas.CardProperties:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okx.paymentapi.data.paas.CardProperties) : (r11v0 com.okinc.okx.paymentapi.data.paas.CardProperties))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r12v0 kotlin.jvm.functions.Function1))
 A[MD:(com.okinc.okx.paymentapi.data.paas.PaymentOrderSubmitTarget, com.okinc.okx.paymentapi.data.paas.PaymentMethodProperties, com.okinc.okx.paymentapi.data.paas.DWProperties, com.okinc.okx.paymentapi.data.paas.CardProperties, kotlin.jvm.functions.Function1<? super com.okinc.okx.paymentapi.data.paas.PaymentOrderSubmitResult, kotlin.Unit>):void (m)] (LINE:55) call: com.okinc.okx.paymentapi.data.paas.DWOrderSubmitParams.<init>(com.okinc.okx.paymentapi.data.paas.PaymentOrderSubmitTarget, com.okinc.okx.paymentapi.data.paas.PaymentMethodProperties, com.okinc.okx.paymentapi.data.paas.DWProperties, com.okinc.okx.paymentapi.data.paas.CardProperties, kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ DWOrderSubmitParams(PaymentOrderSubmitTarget paymentOrderSubmitTarget, PaymentMethodProperties paymentMethodProperties, DWProperties dWProperties, CardProperties cardProperties, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(paymentOrderSubmitTarget, (i & 2) != 0 ? null : paymentMethodProperties, dWProperties, (i & 8) != 0 ? null : cardProperties, (i & 16) != 0 ? null : function1);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okx.paymentapi.data.paas.DWOrderSubmitParams.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
