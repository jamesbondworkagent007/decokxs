package com.okinc.okx.paymentapi.data.paas;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okx.paymentapi.data.paas.PaymentAddAccountTarget;
import com.okinc.okx.paymentapi.educationinfo.InfoDecisionMaker;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class PaymentAddAccountParams implements Parcelable {
    public final PaymentAddAccountTarget AEQbTJ;
    public final PaymentMethodProperties KWHzl;
    public final ChannelProperties OLrzqt;
    public final InfoDecisionMaker copydefault;
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public static final Parcelable.Creator<PaymentAddAccountParams> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<PaymentAddAccountParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentAddAccountParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PaymentAddAccountParams((PaymentAddAccountTarget) parcel.readParcelable(PaymentAddAccountParams.class.getClassLoader()), parcel.readInt() == 0 ? null : PaymentMethodProperties.CREATOR.createFromParcel(parcel), (ChannelProperties) parcel.readParcelable(PaymentAddAccountParams.class.getClassLoader()), (InfoDecisionMaker) parcel.readParcelable(PaymentAddAccountParams.class.getClassLoader()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentAddAccountParams[] newArray(int i) {
            return new PaymentAddAccountParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PaymentAddAccountParams copy$default(PaymentAddAccountParams paymentAddAccountParams, PaymentAddAccountTarget paymentAddAccountTarget, PaymentMethodProperties paymentMethodProperties, ChannelProperties channelProperties, InfoDecisionMaker infoDecisionMaker, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentAddAccountTarget = paymentAddAccountParams.AEQbTJ;
        }
        if ((i & 2) != 0) {
            paymentMethodProperties = paymentAddAccountParams.KWHzl;
        }
        if ((i & 4) != 0) {
            channelProperties = paymentAddAccountParams.OLrzqt;
        }
        if ((i & 8) != 0) {
            infoDecisionMaker = paymentAddAccountParams.copydefault;
        }
        return paymentAddAccountParams.OLrzqt(paymentAddAccountTarget, paymentMethodProperties, channelProperties, infoDecisionMaker);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaymentAddAccountParams OLrzqt(@NotNull PaymentAddAccountTarget paymentAddAccountTarget, PaymentMethodProperties paymentMethodProperties, ChannelProperties channelProperties, @NotNull InfoDecisionMaker infoDecisionMaker) {
        Intrinsics.checkNotNullParameter(paymentAddAccountTarget, "");
        Intrinsics.checkNotNullParameter(infoDecisionMaker, "");
        return new PaymentAddAccountParams(paymentAddAccountTarget, paymentMethodProperties, channelProperties, infoDecisionMaker);
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
        if (!(obj instanceof PaymentAddAccountParams)) {
            return false;
        }
        PaymentAddAccountParams paymentAddAccountParams = (PaymentAddAccountParams) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, paymentAddAccountParams.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, paymentAddAccountParams.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, paymentAddAccountParams.OLrzqt) && Intrinsics.EZpvd(this.copydefault, paymentAddAccountParams.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        PaymentMethodProperties paymentMethodProperties = this.KWHzl;
        int iHashCode2 = paymentMethodProperties == null ? 0 : paymentMethodProperties.hashCode();
        ChannelProperties channelProperties = this.OLrzqt;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (channelProperties != null ? channelProperties.hashCode() : 0)) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PaymentAddAccountParams(target=" + this.AEQbTJ + ", paymentMethodProperties=" + this.KWHzl + ", channelProperties=" + this.OLrzqt + ", decisionMaker=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelable(this.AEQbTJ, i);
        PaymentMethodProperties paymentMethodProperties = this.KWHzl;
        if (paymentMethodProperties == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paymentMethodProperties.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.OLrzqt, i);
        parcel.writeParcelable(this.copydefault, i);
    }

    public PaymentAddAccountParams(@NotNull PaymentAddAccountTarget paymentAddAccountTarget, PaymentMethodProperties paymentMethodProperties, ChannelProperties channelProperties, @NotNull InfoDecisionMaker infoDecisionMaker) {
        Intrinsics.checkNotNullParameter(paymentAddAccountTarget, "");
        Intrinsics.checkNotNullParameter(infoDecisionMaker, "");
        this.AEQbTJ = paymentAddAccountTarget;
        this.KWHzl = paymentMethodProperties;
        this.OLrzqt = channelProperties;
        this.copydefault = infoDecisionMaker;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (r2v0 com.okinc.okx.paymentapi.data.paas.PaymentAddAccountTarget)
  (wrap:com.okinc.okx.paymentapi.data.paas.PaymentMethodProperties:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okx.paymentapi.data.paas.PaymentMethodProperties) : (r3v0 com.okinc.okx.paymentapi.data.paas.PaymentMethodProperties))
  (wrap:com.okinc.okx.paymentapi.data.paas.ChannelProperties:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okx.paymentapi.data.paas.ChannelProperties) : (r4v0 com.okinc.okx.paymentapi.data.paas.ChannelProperties))
  (wrap:com.okinc.okx.paymentapi.educationinfo.InfoDecisionMaker:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.okx.paymentapi.educationinfo.InfoDecisionMaker:0x000f: SGET  A[WRAPPED] (LINE:25) com.okinc.okx.paymentapi.educationinfo.InfoDecisionMaker.ShowAlways.copydefault com.okinc.okx.paymentapi.educationinfo.InfoDecisionMaker$ShowAlways) : (r5v0 com.okinc.okx.paymentapi.educationinfo.InfoDecisionMaker))
 A[MD:(com.okinc.okx.paymentapi.data.paas.PaymentAddAccountTarget, com.okinc.okx.paymentapi.data.paas.PaymentMethodProperties, com.okinc.okx.paymentapi.data.paas.ChannelProperties, com.okinc.okx.paymentapi.educationinfo.InfoDecisionMaker):void (m)] (LINE:21) call: com.okinc.okx.paymentapi.data.paas.PaymentAddAccountParams.<init>(com.okinc.okx.paymentapi.data.paas.PaymentAddAccountTarget, com.okinc.okx.paymentapi.data.paas.PaymentMethodProperties, com.okinc.okx.paymentapi.data.paas.ChannelProperties, com.okinc.okx.paymentapi.educationinfo.InfoDecisionMaker):void type: THIS */
    public /* synthetic */ PaymentAddAccountParams(PaymentAddAccountTarget paymentAddAccountTarget, PaymentMethodProperties paymentMethodProperties, ChannelProperties channelProperties, InfoDecisionMaker infoDecisionMaker, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(paymentAddAccountTarget, (i & 2) != 0 ? null : paymentMethodProperties, (i & 4) != 0 ? null : channelProperties, (i & 8) != 0 ? InfoDecisionMaker.ShowAlways.copydefault : infoDecisionMaker);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okx.paymentapi.data.paas.PaymentAddAccountParams.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static /* synthetic */ PaymentAddAccountParams buildCardParams$default(Activity activity, PaymentAddAccountTarget.CARD card, CardProperties cardProperties, PaymentMethodProperties paymentMethodProperties, int i, Object obj) {
            if ((i & 4) != 0) {
                paymentMethodProperties = null;
            }
            return activity.AEQbTJ(card, cardProperties, paymentMethodProperties);
        }

        public final PaymentAddAccountParams AEQbTJ(@NotNull PaymentAddAccountTarget.CARD card, @NotNull CardProperties cardProperties, PaymentMethodProperties paymentMethodProperties) {
            Intrinsics.checkNotNullParameter(card, "");
            Intrinsics.checkNotNullParameter(cardProperties, "");
            return new PaymentAddAccountParams(card, paymentMethodProperties, cardProperties, null, 8, null);
        }

        public final PaymentAddAccountParams copydefault(@NotNull PaymentAddAccountTarget.ACH.NewAccount newAccount, @NotNull ACHProperties aCHProperties) {
            Intrinsics.checkNotNullParameter(newAccount, "");
            Intrinsics.checkNotNullParameter(aCHProperties, "");
            return new PaymentAddAccountParams(newAccount, null, aCHProperties, null, 10, null);
        }
    }
}
