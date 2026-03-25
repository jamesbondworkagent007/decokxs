package com.okinc.okx.paymentapi.data.paas;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelPlatformCode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public abstract class PaymentAddAccountTarget implements Parcelable {
    public final ChannelPlatformCode copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 com.okinc.okpaymentapi.data.remote.model.management.ChannelPlatformCode) A[MD:(com.okinc.okpaymentapi.data.remote.model.management.ChannelPlatformCode):void (m)] call: com.okinc.okx.paymentapi.data.paas.PaymentAddAccountTarget.<init>(com.okinc.okpaymentapi.data.remote.model.management.ChannelPlatformCode):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ PaymentAddAccountTarget(ChannelPlatformCode channelPlatformCode, DefaultConstructorMarker defaultConstructorMarker) {
        this(channelPlatformCode);
    }

    public PaymentAddAccountTarget(ChannelPlatformCode channelPlatformCode) {
        this.copydefault = channelPlatformCode;
    }

    public static abstract class CARD extends PaymentAddAccountTarget {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okx.paymentapi.data.paas.PaymentAddAccountTarget.CARD.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CARD(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class NewCard extends CARD {
            public static final NewCard EZpvd = new NewCard();
            public static final Parcelable.Creator<NewCard> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<NewCard> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final NewCard createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return NewCard.EZpvd;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final NewCard[] newArray(int i) {
                    return new NewCard[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }

            private NewCard() {
                super(null);
            }
        }

        private CARD() {
            super(ChannelPlatformCode.CARD, null);
        }

        public static final class MicroCharge extends CARD {
            public static final MicroCharge AEQbTJ = new MicroCharge();
            public static final Parcelable.Creator<MicroCharge> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<MicroCharge> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final MicroCharge createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return MicroCharge.AEQbTJ;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final MicroCharge[] newArray(int i) {
                    return new MicroCharge[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }

            private MicroCharge() {
                super(null);
            }
        }
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static abstract class PayPal extends PaymentAddAccountTarget {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okx.paymentapi.data.paas.PaymentAddAccountTarget.PayPal.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ PayPal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class NewAccount extends PayPal {
            public static final NewAccount OLrzqt = new NewAccount();
            public static final Parcelable.Creator<NewAccount> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<NewAccount> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final NewAccount createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return NewAccount.OLrzqt;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final NewAccount[] newArray(int i) {
                    return new NewAccount[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }

            private NewAccount() {
                super(null);
            }
        }

        private PayPal() {
            super(ChannelPlatformCode.BUY_PAYPAL, null);
        }
    }

    public static abstract class ACH extends PaymentAddAccountTarget {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okx.paymentapi.data.paas.PaymentAddAccountTarget.ACH.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ACH(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class NewAccount extends ACH {
            public static final NewAccount KWHzl = new NewAccount();
            public static final Parcelable.Creator<NewAccount> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<NewAccount> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final NewAccount createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return NewAccount.KWHzl;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final NewAccount[] newArray(int i) {
                    return new NewAccount[i];
                }
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
                if (!(obj instanceof NewAccount)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 825130230;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "NewAccount";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }

            private NewAccount() {
                super(null);
            }
        }

        private ACH() {
            super(ChannelPlatformCode.ACH, null);
        }
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static abstract class GooglePay extends PaymentAddAccountTarget {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okx.paymentapi.data.paas.PaymentAddAccountTarget.GooglePay.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ GooglePay(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class DirectRoute extends GooglePay {
            public static final DirectRoute AEQbTJ = new DirectRoute();
            public static final Parcelable.Creator<DirectRoute> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<DirectRoute> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DirectRoute createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return DirectRoute.AEQbTJ;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DirectRoute[] newArray(int i) {
                    return new DirectRoute[i];
                }
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
                if (!(obj instanceof DirectRoute)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1016271136;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "DirectRoute";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }

            private DirectRoute() {
                super(null);
            }
        }

        private GooglePay() {
            super(ChannelPlatformCode.GOOGLE_PAY, null);
        }
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static abstract class Deposit extends PaymentAddAccountTarget {
        public final ChannelPlatformCode EZpvd;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 com.okinc.okpaymentapi.data.remote.model.management.ChannelPlatformCode) A[MD:(com.okinc.okpaymentapi.data.remote.model.management.ChannelPlatformCode):void (m)] call: com.okinc.okx.paymentapi.data.paas.PaymentAddAccountTarget.Deposit.<init>(com.okinc.okpaymentapi.data.remote.model.management.ChannelPlatformCode):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Deposit(ChannelPlatformCode channelPlatformCode, DefaultConstructorMarker defaultConstructorMarker) {
            this(channelPlatformCode);
        }

        public static final class UsWire extends Deposit {
            public static final UsWire OLrzqt = new UsWire();
            public static final Parcelable.Creator<UsWire> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<UsWire> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UsWire createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return UsWire.OLrzqt;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UsWire[] newArray(int i) {
                    return new UsWire[i];
                }
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
                if (!(obj instanceof UsWire)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -370564172;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "UsWire";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }

            private UsWire() {
                super(ChannelPlatformCode.US_WIRE, null);
            }
        }

        public Deposit(ChannelPlatformCode channelPlatformCode) {
            super(channelPlatformCode, null);
            this.EZpvd = channelPlatformCode;
        }
    }
}
