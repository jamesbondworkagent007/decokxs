package com.okinc.okx.paymentapi.data.paas;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.network.okg.response.OKServerException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public abstract class PaymentOrderSubmitResult implements Parcelable {
    public static final Activity Companion = new Activity(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okx.paymentapi.data.paas.PaymentOrderSubmitResult.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ PaymentOrderSubmitResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okx.paymentapi.data.paas.PaymentOrderSubmitResult.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    private PaymentOrderSubmitResult() {
    }

    public static final class Success extends PaymentOrderSubmitResult {
        public static final Parcelable.Creator<Success> CREATOR = new Creator();
        public final String AEQbTJ;
        public final String KWHzl;
        public final String copydefault;

        public static final class Creator implements Parcelable.Creator<Success> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Success createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Success(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Success[] newArray(int i) {
                return new Success[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Success copy$default(Success success, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = success.AEQbTJ;
            }
            if ((i & 2) != 0) {
                str2 = success.copydefault;
            }
            if ((i & 4) != 0) {
                str3 = success.KWHzl;
            }
            return success.EZpvd(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Success EZpvd(@NotNull String str, String str2, String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Success(str, str2, str3);
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
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) success.AEQbTJ) && Intrinsics.EZpvd((Object) this.copydefault, (Object) success.copydefault) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) success.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.AEQbTJ.hashCode();
            String str = this.copydefault;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.KWHzl;
            return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Success(status=" + this.AEQbTJ + ", orderNo=" + this.copydefault + ", url=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.AEQbTJ);
            parcel.writeString(this.copydefault);
            parcel.writeString(this.KWHzl);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(@NotNull String str, String str2, String str3) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = str;
            this.copydefault = str2;
            this.KWHzl = str3;
        }
    }

    public static final class Failure extends PaymentOrderSubmitResult {
        public final OrderStatusError AEQbTJ;
        public final OKServerException EZpvd;
        public static final int copydefault = OKServerException.$stable;
        public static final Parcelable.Creator<Failure> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<Failure> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failure createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Failure(parcel.readInt() == 0 ? null : OrderStatusError.CREATOR.createFromParcel(parcel), (OKServerException) parcel.readSerializable());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failure[] newArray(int i) {
                return new Failure[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Failure() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Failure copy$default(Failure failure, OrderStatusError orderStatusError, OKServerException oKServerException, int i, Object obj) {
            if ((i & 1) != 0) {
                orderStatusError = failure.AEQbTJ;
            }
            if ((i & 2) != 0) {
                oKServerException = failure.EZpvd;
            }
            return failure.OLrzqt(orderStatusError, oKServerException);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Failure OLrzqt(OrderStatusError orderStatusError, OKServerException oKServerException) {
            return new Failure(orderStatusError, oKServerException);
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
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return Intrinsics.EZpvd(this.AEQbTJ, failure.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, failure.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            OrderStatusError orderStatusError = this.AEQbTJ;
            int iHashCode = orderStatusError == null ? 0 : orderStatusError.hashCode();
            OKServerException oKServerException = this.EZpvd;
            return (iHashCode * 31) + (oKServerException != null ? oKServerException.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Failure(error=" + this.AEQbTJ + ", exception=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            OrderStatusError orderStatusError = this.AEQbTJ;
            if (orderStatusError == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                orderStatusError.writeToParcel(parcel, i);
            }
            parcel.writeSerializable(this.EZpvd);
        }

        public Failure(OrderStatusError orderStatusError, OKServerException oKServerException) {
            super(null);
            this.AEQbTJ = orderStatusError;
            this.EZpvd = oKServerException;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.okx.paymentapi.data.paas.OrderStatusError:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okx.paymentapi.data.paas.OrderStatusError) : (r2v0 com.okinc.okx.paymentapi.data.paas.OrderStatusError))
  (wrap:com.okinc.network.okg.response.OKServerException:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.network.okg.response.OKServerException) : (r3v0 com.okinc.network.okg.response.OKServerException))
 A[MD:(com.okinc.okx.paymentapi.data.paas.OrderStatusError, com.okinc.network.okg.response.OKServerException):void (m)] (LINE:186) call: com.okinc.okx.paymentapi.data.paas.PaymentOrderSubmitResult.Failure.<init>(com.okinc.okx.paymentapi.data.paas.OrderStatusError, com.okinc.network.okg.response.OKServerException):void type: THIS */
        public /* synthetic */ Failure(OrderStatusError orderStatusError, OKServerException oKServerException, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : orderStatusError, (i & 2) != 0 ? null : oKServerException);
        }
    }
}
