package com.okinc.okx.paymentapi.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okpaymentapi.data.remote.model.management.Account;
import com.okinc.okpaymentapi.data.remote.model.management.Channel;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelPlatformCode;
import com.okinc.okx.paymentapi.presentation.CardConfirmationMethod;
import com.okinc.okx.paymentapi.presentation.PaymentAddAccountResult;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class AddPaymentMethodResult implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<AddPaymentMethodResult> CREATOR = new Creator();
    private final Account account;
    private final PaymentAddAccountResult accountResultType;
    private final String channel;
    private final Channel channelInfo;
    private final CardConfirmationMethod confirmationMethod;
    private final int errorCode;
    private final String errorMessage;
    private final boolean isEditFlow;
    private final boolean isSuccess;
    private final String paymentMethod;
    private final boolean shouldShowToast;

    public static final class Creator implements Parcelable.Creator<AddPaymentMethodResult> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddPaymentMethodResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AddPaymentMethodResult(parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, (CardConfirmationMethod) parcel.readParcelable(AddPaymentMethodResult.class.getClassLoader()), parcel.readInt() == 0 ? null : Account.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? Channel.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readString(), parcel.readInt() != 0, (PaymentAddAccountResult) parcel.readParcelable(AddPaymentMethodResult.class.getClassLoader()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddPaymentMethodResult[] newArray(int i) {
            return new AddPaymentMethodResult[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.isEditFlow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component10() {
        return this.shouldShowToast;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaymentAddAccountResult component11() {
        return this.accountResultType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.channel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.isSuccess;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CardConfirmationMethod component4() {
        return this.confirmationMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Account component5() {
        return this.account;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.paymentMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Channel component7() {
        return this.channelInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.errorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.errorMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddPaymentMethodResult copy(boolean z, @NotNull String str, boolean z2, @NotNull CardConfirmationMethod cardConfirmationMethod, Account account, @NotNull String str2, Channel channel, int i, @NotNull String str3, boolean z3, @NotNull PaymentAddAccountResult paymentAddAccountResult) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(cardConfirmationMethod, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(paymentAddAccountResult, "");
        return new AddPaymentMethodResult(z, str, z2, cardConfirmationMethod, account, str2, channel, i, str3, z3, paymentAddAccountResult);
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
        if (!(obj instanceof AddPaymentMethodResult)) {
            return false;
        }
        AddPaymentMethodResult addPaymentMethodResult = (AddPaymentMethodResult) obj;
        return this.isEditFlow == addPaymentMethodResult.isEditFlow && Intrinsics.EZpvd((Object) this.channel, (Object) addPaymentMethodResult.channel) && this.isSuccess == addPaymentMethodResult.isSuccess && Intrinsics.EZpvd(this.confirmationMethod, addPaymentMethodResult.confirmationMethod) && Intrinsics.EZpvd(this.account, addPaymentMethodResult.account) && Intrinsics.EZpvd((Object) this.paymentMethod, (Object) addPaymentMethodResult.paymentMethod) && Intrinsics.EZpvd(this.channelInfo, addPaymentMethodResult.channelInfo) && this.errorCode == addPaymentMethodResult.errorCode && Intrinsics.EZpvd((Object) this.errorMessage, (Object) addPaymentMethodResult.errorMessage) && this.shouldShowToast == addPaymentMethodResult.shouldShowToast && Intrinsics.EZpvd(this.accountResultType, addPaymentMethodResult.accountResultType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Account getAccount() {
        return this.account;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaymentAddAccountResult getAccountResultType() {
        return this.accountResultType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannel() {
        return this.channel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Channel getChannelInfo() {
        return this.channelInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CardConfirmationMethod getConfirmationMethod() {
        return this.confirmationMethod;
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
    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShouldShowToast() {
        return this.shouldShowToast;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isEditFlow);
        int iHashCode2 = this.channel.hashCode();
        int iHashCode3 = Boolean.hashCode(this.isSuccess);
        int iHashCode4 = this.confirmationMethod.hashCode();
        Account account = this.account;
        int iHashCode5 = account == null ? 0 : account.hashCode();
        int iHashCode6 = this.paymentMethod.hashCode();
        Channel channel = this.channelInfo;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (channel != null ? channel.hashCode() : 0)) * 31) + Integer.hashCode(this.errorCode)) * 31) + this.errorMessage.hashCode()) * 31) + Boolean.hashCode(this.shouldShowToast)) * 31) + this.accountResultType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isEditFlow() {
        return this.isEditFlow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSuccess() {
        return this.isSuccess;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddPaymentMethodResult(isEditFlow=" + this.isEditFlow + ", channel=" + this.channel + ", isSuccess=" + this.isSuccess + ", confirmationMethod=" + this.confirmationMethod + ", account=" + this.account + ", paymentMethod=" + this.paymentMethod + ", channelInfo=" + this.channelInfo + ", errorCode=" + this.errorCode + ", errorMessage=" + this.errorMessage + ", shouldShowToast=" + this.shouldShowToast + ", accountResultType=" + this.accountResultType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.isEditFlow ? 1 : 0);
        parcel.writeString(this.channel);
        parcel.writeInt(this.isSuccess ? 1 : 0);
        parcel.writeParcelable(this.confirmationMethod, i);
        Account account = this.account;
        if (account == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            account.writeToParcel(parcel, i);
        }
        parcel.writeString(this.paymentMethod);
        Channel channel = this.channelInfo;
        if (channel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            channel.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.errorCode);
        parcel.writeString(this.errorMessage);
        parcel.writeInt(this.shouldShowToast ? 1 : 0);
        parcel.writeParcelable(this.accountResultType, i);
    }

    public AddPaymentMethodResult(boolean z, @NotNull String str, boolean z2, @NotNull CardConfirmationMethod cardConfirmationMethod, Account account, @NotNull String str2, Channel channel, int i, @NotNull String str3, boolean z3, @NotNull PaymentAddAccountResult paymentAddAccountResult) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(cardConfirmationMethod, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(paymentAddAccountResult, "");
        this.isEditFlow = z;
        this.channel = str;
        this.isSuccess = z2;
        this.confirmationMethod = cardConfirmationMethod;
        this.account = account;
        this.paymentMethod = str2;
        this.channelInfo = channel;
        this.errorCode = i;
        this.errorMessage = str3;
        this.shouldShowToast = z3;
        this.accountResultType = paymentAddAccountResult;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0064: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r15v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0014: INVOKE 
  (wrap:com.okinc.okpaymentapi.data.remote.model.management.ChannelPlatformCode:0x000e: SGET  A[WRAPPED] (LINE:15) com.okinc.okpaymentapi.data.remote.model.management.ChannelPlatformCode.CARD com.okinc.okpaymentapi.data.remote.model.management.ChannelPlatformCode)
 VIRTUAL call: com.okinc.okpaymentapi.data.remote.model.management.ChannelPlatformCode.getCode():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:15)) : (r16v0 java.lang.String))
  (r17v0 boolean)
  (wrap:com.okinc.okx.paymentapi.presentation.CardConfirmationMethod:?: TERNARY null = ((wrap:int:0x0018: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001e: SGET  A[WRAPPED] (LINE:17) com.okinc.okx.paymentapi.presentation.CardConfirmationMethod.None.OLrzqt com.okinc.okx.paymentapi.presentation.CardConfirmationMethod$None) : (r18v0 com.okinc.okx.paymentapi.presentation.CardConfirmationMethod))
  (wrap:com.okinc.okpaymentapi.data.remote.model.management.Account:?: TERNARY null = ((wrap:int:0x0022: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okpaymentapi.data.remote.model.management.Account) : (r19v0 com.okinc.okpaymentapi.data.remote.model.management.Account))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:com.okinc.okpaymentapi.data.remote.model.management.Channel:?: TERNARY null = ((wrap:int:0x0035: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okpaymentapi.data.remote.model.management.Channel) : (r21v0 com.okinc.okpaymentapi.data.remote.model.management.Channel))
  (wrap:int:?: TERNARY null = ((wrap:int:0x003d: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r22v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0046: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x004e: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? true : (r24v0 boolean))
  (wrap:com.okinc.okx.paymentapi.presentation.PaymentAddAccountResult:?: TERNARY null = ((wrap:int:0x0057: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x005d: SGET  A[WRAPPED] (LINE:24) com.okinc.okx.paymentapi.presentation.PaymentAddAccountResult.None.EZpvd com.okinc.okx.paymentapi.presentation.PaymentAddAccountResult$None) : (r25v0 com.okinc.okx.paymentapi.presentation.PaymentAddAccountResult))
 A[MD:(boolean, java.lang.String, boolean, com.okinc.okx.paymentapi.presentation.CardConfirmationMethod, com.okinc.okpaymentapi.data.remote.model.management.Account, java.lang.String, com.okinc.okpaymentapi.data.remote.model.management.Channel, int, java.lang.String, boolean, com.okinc.okx.paymentapi.presentation.PaymentAddAccountResult):void (m)] (LINE:13) call: com.okinc.okx.paymentapi.presentation.AddPaymentMethodResult.<init>(boolean, java.lang.String, boolean, com.okinc.okx.paymentapi.presentation.CardConfirmationMethod, com.okinc.okpaymentapi.data.remote.model.management.Account, java.lang.String, com.okinc.okpaymentapi.data.remote.model.management.Channel, int, java.lang.String, boolean, com.okinc.okx.paymentapi.presentation.PaymentAddAccountResult):void type: THIS */
    public /* synthetic */ AddPaymentMethodResult(boolean z, String str, boolean z2, CardConfirmationMethod cardConfirmationMethod, Account account, String str2, Channel channel, int i, String str3, boolean z3, PaymentAddAccountResult paymentAddAccountResult, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? ChannelPlatformCode.CARD.getCode() : str, z2, (i2 & 8) != 0 ? CardConfirmationMethod.None.OLrzqt : cardConfirmationMethod, (i2 & 16) != 0 ? null : account, (i2 & 32) != 0 ? "" : str2, (i2 & 64) != 0 ? null : channel, (i2 & 128) != 0 ? -1 : i, (i2 & 256) != 0 ? "" : str3, (i2 & 512) != 0 ? true : z3, (i2 & 1024) != 0 ? PaymentAddAccountResult.None.EZpvd : paymentAddAccountResult);
    }
}
