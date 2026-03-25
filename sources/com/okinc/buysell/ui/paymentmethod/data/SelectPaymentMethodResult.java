package com.okinc.buysell.ui.paymentmethod.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okpaymentapi.data.remote.model.management.Channel;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class SelectPaymentMethodResult implements Parcelable {
    public static final int $stable = PaymentMethod.$stable | Channel.$stable;
    public static final Parcelable.Creator<SelectPaymentMethodResult> CREATOR = new Creator();
    private final Channel channel;
    private final int errorCode;
    private final String errorMessage;
    private final boolean isSuccess;
    private final PaymentMethod paymentMethod;
    private final SelectionType selectionType;
    private final TradeType tradeType;

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<SelectPaymentMethodResult> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelectPaymentMethodResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SelectPaymentMethodResult((Channel) parcel.readParcelable(SelectPaymentMethodResult.class.getClassLoader()), (PaymentMethod) parcel.readParcelable(SelectPaymentMethodResult.class.getClassLoader()), parcel.readInt() != 0, SelectionType.valueOf(parcel.readString()), (TradeType) parcel.readParcelable(SelectPaymentMethodResult.class.getClassLoader()), parcel.readInt(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelectPaymentMethodResult[] newArray(int i) {
            return new SelectPaymentMethodResult[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SelectPaymentMethodResult copy$default(SelectPaymentMethodResult selectPaymentMethodResult, Channel channel, PaymentMethod paymentMethod, boolean z, SelectionType selectionType, TradeType tradeType, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            channel = selectPaymentMethodResult.channel;
        }
        if ((i2 & 2) != 0) {
            paymentMethod = selectPaymentMethodResult.paymentMethod;
        }
        PaymentMethod paymentMethod2 = paymentMethod;
        if ((i2 & 4) != 0) {
            z = selectPaymentMethodResult.isSuccess;
        }
        boolean z2 = z;
        if ((i2 & 8) != 0) {
            selectionType = selectPaymentMethodResult.selectionType;
        }
        SelectionType selectionType2 = selectionType;
        if ((i2 & 16) != 0) {
            tradeType = selectPaymentMethodResult.tradeType;
        }
        TradeType tradeType2 = tradeType;
        if ((i2 & 32) != 0) {
            i = selectPaymentMethodResult.errorCode;
        }
        int i3 = i;
        if ((i2 & 64) != 0) {
            str = selectPaymentMethodResult.errorMessage;
        }
        return selectPaymentMethodResult.copy(channel, paymentMethod2, z2, selectionType2, tradeType2, i3, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Channel component1() {
        return this.channel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaymentMethod component2() {
        return this.paymentMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.isSuccess;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SelectionType component4() {
        return this.selectionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeType component5() {
        return this.tradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.errorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.errorMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SelectPaymentMethodResult copy(@NotNull Channel channel, @NotNull PaymentMethod paymentMethod, boolean z, @NotNull SelectionType selectionType, @NotNull TradeType tradeType, int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(channel, "");
        Intrinsics.checkNotNullParameter(paymentMethod, "");
        Intrinsics.checkNotNullParameter(selectionType, "");
        Intrinsics.checkNotNullParameter(tradeType, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new SelectPaymentMethodResult(channel, paymentMethod, z, selectionType, tradeType, i, str);
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
        if (!(obj instanceof SelectPaymentMethodResult)) {
            return false;
        }
        SelectPaymentMethodResult selectPaymentMethodResult = (SelectPaymentMethodResult) obj;
        return Intrinsics.EZpvd(this.channel, selectPaymentMethodResult.channel) && Intrinsics.EZpvd(this.paymentMethod, selectPaymentMethodResult.paymentMethod) && this.isSuccess == selectPaymentMethodResult.isSuccess && this.selectionType == selectPaymentMethodResult.selectionType && this.tradeType == selectPaymentMethodResult.tradeType && this.errorCode == selectPaymentMethodResult.errorCode && Intrinsics.EZpvd((Object) this.errorMessage, (Object) selectPaymentMethodResult.errorMessage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Channel getChannel() {
        return this.channel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getErrorCode() {
        return this.errorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SelectionType getSelectionType() {
        return this.selectionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeType getTradeType() {
        return this.tradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.channel.hashCode() * 31) + this.paymentMethod.hashCode()) * 31) + Boolean.hashCode(this.isSuccess)) * 31) + this.selectionType.hashCode()) * 31) + this.tradeType.hashCode()) * 31) + Integer.hashCode(this.errorCode)) * 31) + this.errorMessage.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSuccess() {
        return this.isSuccess;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SelectPaymentMethodResult(channel=" + this.channel + ", paymentMethod=" + this.paymentMethod + ", isSuccess=" + this.isSuccess + ", selectionType=" + this.selectionType + ", tradeType=" + this.tradeType + ", errorCode=" + this.errorCode + ", errorMessage=" + this.errorMessage + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelable(this.channel, i);
        parcel.writeParcelable(this.paymentMethod, i);
        parcel.writeInt(this.isSuccess ? 1 : 0);
        parcel.writeString(this.selectionType.name());
        parcel.writeParcelable(this.tradeType, i);
        parcel.writeInt(this.errorCode);
        parcel.writeString(this.errorMessage);
    }

    public SelectPaymentMethodResult(@NotNull Channel channel, @NotNull PaymentMethod paymentMethod, boolean z, @NotNull SelectionType selectionType, @NotNull TradeType tradeType, int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(channel, "");
        Intrinsics.checkNotNullParameter(paymentMethod, "");
        Intrinsics.checkNotNullParameter(selectionType, "");
        Intrinsics.checkNotNullParameter(tradeType, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.channel = channel;
        this.paymentMethod = paymentMethod;
        this.isSuccess = z;
        this.selectionType = selectionType;
        this.tradeType = tradeType;
        this.errorCode = i;
        this.errorMessage = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0020: CONSTRUCTOR 
  (r10v0 com.okinc.okpaymentapi.data.remote.model.management.Channel)
  (r11v0 com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod)
  (r12v0 boolean)
  (wrap:com.okinc.buysell.ui.paymentmethod.data.SelectionType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0006: SGET  A[WRAPPED] (LINE:17) com.okinc.buysell.ui.paymentmethod.data.SelectionType.EXISTING com.okinc.buysell.ui.paymentmethod.data.SelectionType) : (r13v0 com.okinc.buysell.ui.paymentmethod.data.SelectionType))
  (r14v0 com.okinc.okpaymentapi.data.remote.model.management.TradeType)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0009: ARITH (r17v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r15v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r17v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
 A[MD:(com.okinc.okpaymentapi.data.remote.model.management.Channel, com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod, boolean, com.okinc.buysell.ui.paymentmethod.data.SelectionType, com.okinc.okpaymentapi.data.remote.model.management.TradeType, int, java.lang.String):void (m)] (LINE:13) call: com.okinc.buysell.ui.paymentmethod.data.SelectPaymentMethodResult.<init>(com.okinc.okpaymentapi.data.remote.model.management.Channel, com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod, boolean, com.okinc.buysell.ui.paymentmethod.data.SelectionType, com.okinc.okpaymentapi.data.remote.model.management.TradeType, int, java.lang.String):void type: THIS */
    public /* synthetic */ SelectPaymentMethodResult(Channel channel, PaymentMethod paymentMethod, boolean z, SelectionType selectionType, TradeType tradeType, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(channel, paymentMethod, z, (i2 & 8) != 0 ? SelectionType.EXISTING : selectionType, tradeType, (i2 & 32) != 0 ? -1 : i, (i2 & 64) != 0 ? "" : str);
    }
}
