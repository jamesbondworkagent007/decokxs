package com.okinc.account.api.model.register;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public abstract class AfterSignupLanding implements Parcelable {
    public static final int $stable = 0;
    private final SignupResult signupResult;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 com.okinc.account.api.model.register.SignupResult) A[MD:(com.okinc.account.api.model.register.SignupResult):void (m)] call: com.okinc.account.api.model.register.AfterSignupLanding.<init>(com.okinc.account.api.model.register.SignupResult):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AfterSignupLanding(SignupResult signupResult, DefaultConstructorMarker defaultConstructorMarker) {
        this(signupResult);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignupResult getSignupResult() {
        return this.signupResult;
    }

    private AfterSignupLanding(SignupResult signupResult) {
        this.signupResult = signupResult;
    }

    public static final class FidoPromotion extends AfterSignupLanding {
        public static final int $stable = 0;
        public static final Parcelable.Creator<FidoPromotion> CREATOR = new Creator();
        private final SignupResult _signupResult;

        public static final class Creator implements Parcelable.Creator<FidoPromotion> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FidoPromotion createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new FidoPromotion(SignupResult.CREATOR.createFromParcel(parcel));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FidoPromotion[] newArray(int i) {
                return new FidoPromotion[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private final SignupResult component1() {
            return this._signupResult;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ FidoPromotion copy$default(FidoPromotion fidoPromotion, SignupResult signupResult, int i, Object obj) {
            if ((i & 1) != 0) {
                signupResult = fidoPromotion._signupResult;
            }
            return fidoPromotion.copy(signupResult);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FidoPromotion copy(@NotNull SignupResult signupResult) {
            Intrinsics.checkNotNullParameter(signupResult, "");
            return new FidoPromotion(signupResult);
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
            return (obj instanceof FidoPromotion) && Intrinsics.EZpvd(this._signupResult, ((FidoPromotion) obj)._signupResult);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this._signupResult.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "FidoPromotion(_signupResult=" + this._signupResult + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            this._signupResult.writeToParcel(parcel, i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FidoPromotion(@NotNull SignupResult signupResult) {
            super(signupResult, null);
            Intrinsics.checkNotNullParameter(signupResult, "");
            this._signupResult = signupResult;
        }
    }

    public static final class ShowOnboarding extends AfterSignupLanding {
        public static final int $stable = 0;
        public static final Parcelable.Creator<ShowOnboarding> CREATOR = new Creator();
        private final SignupResult _signupResult;

        public static final class Creator implements Parcelable.Creator<ShowOnboarding> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShowOnboarding createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new ShowOnboarding(SignupResult.CREATOR.createFromParcel(parcel));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShowOnboarding[] newArray(int i) {
                return new ShowOnboarding[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private final SignupResult component1() {
            return this._signupResult;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ShowOnboarding copy$default(ShowOnboarding showOnboarding, SignupResult signupResult, int i, Object obj) {
            if ((i & 1) != 0) {
                signupResult = showOnboarding._signupResult;
            }
            return showOnboarding.copy(signupResult);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ShowOnboarding copy(@NotNull SignupResult signupResult) {
            Intrinsics.checkNotNullParameter(signupResult, "");
            return new ShowOnboarding(signupResult);
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
            return (obj instanceof ShowOnboarding) && Intrinsics.EZpvd(this._signupResult, ((ShowOnboarding) obj)._signupResult);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this._signupResult.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ShowOnboarding(_signupResult=" + this._signupResult + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            this._signupResult.writeToParcel(parcel, i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowOnboarding(@NotNull SignupResult signupResult) {
            super(signupResult, null);
            Intrinsics.checkNotNullParameter(signupResult, "");
            this._signupResult = signupResult;
        }
    }

    public static final class None extends AfterSignupLanding {
        public static final int $stable = 0;
        public static final Parcelable.Creator<None> CREATOR = new Creator();
        private final SignupResult _signupResult;

        public static final class Creator implements Parcelable.Creator<None> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final None createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new None(SignupResult.CREATOR.createFromParcel(parcel));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final None[] newArray(int i) {
                return new None[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private final SignupResult component1() {
            return this._signupResult;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ None copy$default(None none, SignupResult signupResult, int i, Object obj) {
            if ((i & 1) != 0) {
                signupResult = none._signupResult;
            }
            return none.copy(signupResult);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final None copy(@NotNull SignupResult signupResult) {
            Intrinsics.checkNotNullParameter(signupResult, "");
            return new None(signupResult);
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
            return (obj instanceof None) && Intrinsics.EZpvd(this._signupResult, ((None) obj)._signupResult);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this._signupResult.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "None(_signupResult=" + this._signupResult + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            this._signupResult.writeToParcel(parcel, i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public None(@NotNull SignupResult signupResult) {
            super(signupResult, null);
            Intrinsics.checkNotNullParameter(signupResult, "");
            this._signupResult = signupResult;
        }
    }
}
