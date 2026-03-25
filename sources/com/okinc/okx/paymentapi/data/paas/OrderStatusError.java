package com.okinc.okx.paymentapi.data.paas;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class OrderStatusError implements Parcelable {
    public static final Parcelable.Creator<OrderStatusError> CREATOR = new Creator();
    public final String AEQbTJ;
    public final Integer EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final Integer copydefault;
    public final String gEmmrt;

    public static final class Creator implements Parcelable.Creator<OrderStatusError> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderStatusError createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OrderStatusError(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderStatusError[] newArray(int i) {
            return new OrderStatusError[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OrderStatusError() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OrderStatusError copy$default(OrderStatusError orderStatusError, String str, Integer num, String str2, String str3, Integer num2, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orderStatusError.OLrzqt;
        }
        if ((i & 2) != 0) {
            num = orderStatusError.EZpvd;
        }
        Integer num3 = num;
        if ((i & 4) != 0) {
            str2 = orderStatusError.KWHzl;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = orderStatusError.gEmmrt;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            num2 = orderStatusError.copydefault;
        }
        Integer num4 = num2;
        if ((i & 32) != 0) {
            str4 = orderStatusError.AEQbTJ;
        }
        return orderStatusError.copydefault(str, num3, str5, str6, num4, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderStatusError copydefault(String str, Integer num, String str2, @NotNull String str3, Integer num2, String str4) {
        Intrinsics.checkNotNullParameter(str3, "");
        return new OrderStatusError(str, num, str2, str3, num2, str4);
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
        if (!(obj instanceof OrderStatusError)) {
            return false;
        }
        OrderStatusError orderStatusError = (OrderStatusError) obj;
        return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) orderStatusError.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, orderStatusError.EZpvd) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) orderStatusError.KWHzl) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) orderStatusError.gEmmrt) && Intrinsics.EZpvd(this.copydefault, orderStatusError.copydefault) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) orderStatusError.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.OLrzqt;
        int iHashCode = str == null ? 0 : str.hashCode();
        Integer num = this.EZpvd;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        String str2 = this.KWHzl;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        int iHashCode4 = this.gEmmrt.hashCode();
        Integer num2 = this.copydefault;
        int iHashCode5 = num2 == null ? 0 : num2.hashCode();
        String str3 = this.AEQbTJ;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OrderStatusError(errorMessage=" + this.OLrzqt + ", errorType=" + this.EZpvd + ", errorTitle=" + this.KWHzl + ", sourceErrorCode=" + this.gEmmrt + ", code=" + this.copydefault + ", message=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.OLrzqt);
        Integer num = this.EZpvd;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.gEmmrt);
        Integer num2 = this.copydefault;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.AEQbTJ);
    }

    public OrderStatusError(String str, Integer num, String str2, @NotNull String str3, Integer num2, String str4) {
        Intrinsics.checkNotNullParameter(str3, "");
        this.OLrzqt = str;
        this.EZpvd = num;
        this.KWHzl = str2;
        this.gEmmrt = str3;
        this.copydefault = num2;
        this.AEQbTJ = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r7v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:0x001c: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r10v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String):void (m)] (LINE:190) call: com.okinc.okx.paymentapi.data.paas.OrderStatusError.<init>(java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String):void type: THIS */
    public /* synthetic */ OrderStatusError(String str, Integer num, String str2, String str3, Integer num2, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : str4);
    }
}
