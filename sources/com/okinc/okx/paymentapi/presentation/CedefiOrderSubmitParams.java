package com.okinc.okx.paymentapi.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class CedefiOrderSubmitParams implements Parcelable {
    public final CedefiQuoteProperties AEQbTJ;
    public final CedefiOrderType AhwBna;
    public final GooglePayProperties EZpvd;
    public final CedefiOrderProperties KWHzl;
    public final String OLrzqt;
    public final CedefiPaymentMethodProperties copydefault;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final Parcelable.Creator<CedefiOrderSubmitParams> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<CedefiOrderSubmitParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CedefiOrderSubmitParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CedefiOrderSubmitParams((CedefiOrderType) parcel.readParcelable(CedefiOrderSubmitParams.class.getClassLoader()), CedefiQuoteProperties.CREATOR.createFromParcel(parcel), CedefiOrderProperties.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CedefiPaymentMethodProperties.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? GooglePayProperties.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CedefiOrderSubmitParams[] newArray(int i) {
            return new CedefiOrderSubmitParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CedefiOrderSubmitParams copy$default(CedefiOrderSubmitParams cedefiOrderSubmitParams, CedefiOrderType cedefiOrderType, CedefiQuoteProperties cedefiQuoteProperties, CedefiOrderProperties cedefiOrderProperties, CedefiPaymentMethodProperties cedefiPaymentMethodProperties, GooglePayProperties googlePayProperties, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            cedefiOrderType = cedefiOrderSubmitParams.AhwBna;
        }
        if ((i & 2) != 0) {
            cedefiQuoteProperties = cedefiOrderSubmitParams.AEQbTJ;
        }
        CedefiQuoteProperties cedefiQuoteProperties2 = cedefiQuoteProperties;
        if ((i & 4) != 0) {
            cedefiOrderProperties = cedefiOrderSubmitParams.KWHzl;
        }
        CedefiOrderProperties cedefiOrderProperties2 = cedefiOrderProperties;
        if ((i & 8) != 0) {
            cedefiPaymentMethodProperties = cedefiOrderSubmitParams.copydefault;
        }
        CedefiPaymentMethodProperties cedefiPaymentMethodProperties2 = cedefiPaymentMethodProperties;
        if ((i & 16) != 0) {
            googlePayProperties = cedefiOrderSubmitParams.EZpvd;
        }
        GooglePayProperties googlePayProperties2 = googlePayProperties;
        if ((i & 32) != 0) {
            str = cedefiOrderSubmitParams.OLrzqt;
        }
        return cedefiOrderSubmitParams.KWHzl(cedefiOrderType, cedefiQuoteProperties2, cedefiOrderProperties2, cedefiPaymentMethodProperties2, googlePayProperties2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CedefiOrderSubmitParams KWHzl(@NotNull CedefiOrderType cedefiOrderType, @NotNull CedefiQuoteProperties cedefiQuoteProperties, @NotNull CedefiOrderProperties cedefiOrderProperties, CedefiPaymentMethodProperties cedefiPaymentMethodProperties, GooglePayProperties googlePayProperties, String str) {
        Intrinsics.checkNotNullParameter(cedefiOrderType, "");
        Intrinsics.checkNotNullParameter(cedefiQuoteProperties, "");
        Intrinsics.checkNotNullParameter(cedefiOrderProperties, "");
        return new CedefiOrderSubmitParams(cedefiOrderType, cedefiQuoteProperties, cedefiOrderProperties, cedefiPaymentMethodProperties, googlePayProperties, str);
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
        if (!(obj instanceof CedefiOrderSubmitParams)) {
            return false;
        }
        CedefiOrderSubmitParams cedefiOrderSubmitParams = (CedefiOrderSubmitParams) obj;
        return Intrinsics.EZpvd(this.AhwBna, cedefiOrderSubmitParams.AhwBna) && Intrinsics.EZpvd(this.AEQbTJ, cedefiOrderSubmitParams.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, cedefiOrderSubmitParams.KWHzl) && Intrinsics.EZpvd(this.copydefault, cedefiOrderSubmitParams.copydefault) && Intrinsics.EZpvd(this.EZpvd, cedefiOrderSubmitParams.EZpvd) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) cedefiOrderSubmitParams.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AhwBna.hashCode();
        int iHashCode2 = this.AEQbTJ.hashCode();
        int iHashCode3 = this.KWHzl.hashCode();
        CedefiPaymentMethodProperties cedefiPaymentMethodProperties = this.copydefault;
        int iHashCode4 = cedefiPaymentMethodProperties == null ? 0 : cedefiPaymentMethodProperties.hashCode();
        GooglePayProperties googlePayProperties = this.EZpvd;
        int iHashCode5 = googlePayProperties == null ? 0 : googlePayProperties.hashCode();
        String str = this.OLrzqt;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CedefiOrderSubmitParams(type=" + this.AhwBna + ", quoteProperties=" + this.AEQbTJ + ", orderProperties=" + this.KWHzl + ", paymentMethodProperties=" + this.copydefault + ", googlePayProperties=" + this.EZpvd + ", mainOrderId=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelable(this.AhwBna, i);
        this.AEQbTJ.writeToParcel(parcel, i);
        this.KWHzl.writeToParcel(parcel, i);
        CedefiPaymentMethodProperties cedefiPaymentMethodProperties = this.copydefault;
        if (cedefiPaymentMethodProperties == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cedefiPaymentMethodProperties.writeToParcel(parcel, i);
        }
        GooglePayProperties googlePayProperties = this.EZpvd;
        if (googlePayProperties == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            googlePayProperties.writeToParcel(parcel, i);
        }
        parcel.writeString(this.OLrzqt);
    }

    public CedefiOrderSubmitParams(@NotNull CedefiOrderType cedefiOrderType, @NotNull CedefiQuoteProperties cedefiQuoteProperties, @NotNull CedefiOrderProperties cedefiOrderProperties, CedefiPaymentMethodProperties cedefiPaymentMethodProperties, GooglePayProperties googlePayProperties, String str) {
        Intrinsics.checkNotNullParameter(cedefiOrderType, "");
        Intrinsics.checkNotNullParameter(cedefiQuoteProperties, "");
        Intrinsics.checkNotNullParameter(cedefiOrderProperties, "");
        this.AhwBna = cedefiOrderType;
        this.AEQbTJ = cedefiQuoteProperties;
        this.KWHzl = cedefiOrderProperties;
        this.copydefault = cedefiPaymentMethodProperties;
        this.EZpvd = googlePayProperties;
        this.OLrzqt = str;
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okx.paymentapi.presentation.CedefiOrderSubmitParams.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
