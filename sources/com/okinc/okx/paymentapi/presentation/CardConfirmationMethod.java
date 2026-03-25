package com.okinc.okx.paymentapi.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public abstract class CardConfirmationMethod implements Parcelable {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okx.paymentapi.presentation.CardConfirmationMethod.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ CardConfirmationMethod(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CardConfirmationMethod() {
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static abstract class ThreeDSecure extends CardConfirmationMethod {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okx.paymentapi.presentation.CardConfirmationMethod.ThreeDSecure.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ThreeDSecure(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ThreeDSecure() {
            super(null);
        }

        public static final class Challenge extends ThreeDSecure {
            public static final Parcelable.Creator<Challenge> CREATOR = new Creator();
            public final String OLrzqt;
            public final String copydefault;

            public static final class Creator implements Parcelable.Creator<Challenge> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Challenge createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new Challenge(parcel.readString(), parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Challenge[] newArray(int i) {
                    return new Challenge[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Challenge copy$default(Challenge challenge, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = challenge.OLrzqt;
                }
                if ((i & 2) != 0) {
                    str2 = challenge.copydefault;
                }
                return challenge.KWHzl(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Challenge KWHzl(@NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return new Challenge(str, str2);
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
                if (!(obj instanceof Challenge)) {
                    return false;
                }
                Challenge challenge = (Challenge) obj;
                return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) challenge.OLrzqt) && Intrinsics.EZpvd((Object) this.copydefault, (Object) challenge.copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.OLrzqt.hashCode() * 31) + this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Challenge(url=" + this.OLrzqt + ", paymentAccountId=" + this.copydefault + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.OLrzqt);
                parcel.writeString(this.copydefault);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Challenge(@NotNull String str, @NotNull String str2) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.OLrzqt = str;
                this.copydefault = str2;
            }
        }

        public static final class AwaitResult extends ThreeDSecure {
            public static final Parcelable.Creator<AwaitResult> CREATOR = new Creator();
            public final String AEQbTJ;

            public static final class Creator implements Parcelable.Creator<AwaitResult> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AwaitResult createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new AwaitResult(parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AwaitResult[] newArray(int i) {
                    return new AwaitResult[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ AwaitResult copy$default(AwaitResult awaitResult, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = awaitResult.AEQbTJ;
                }
                return awaitResult.AEQbTJ(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AwaitResult AEQbTJ(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new AwaitResult(str);
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
                return (obj instanceof AwaitResult) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) ((AwaitResult) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "AwaitResult(paymentAccountId=" + this.AEQbTJ + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.AEQbTJ);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AwaitResult(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.AEQbTJ = str;
            }
        }
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class MicroCharge extends CardConfirmationMethod {
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

    /* JADX INFO: loaded from: classes24.dex */
    public static final class None extends CardConfirmationMethod {
        public static final None OLrzqt = new None();
        public static final Parcelable.Creator<None> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<None> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final None createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return None.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final None[] newArray(int i) {
                return new None[i];
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

        private None() {
            super(null);
        }
    }
}
