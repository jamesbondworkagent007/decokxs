package com.okinc.business.web3pay.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public abstract class CardAuthResult implements Parcelable {
    public static final int $stable = 0;
    public static final Activity Companion = new Activity(null);
    public static final int ERROR_CODE_ACCOUNT_ERROR = 103;
    public static final int ERROR_CODE_AUTH_CHECKING_FAIL = 201;
    public static final int ERROR_CODE_CREATE_UOP_FAIL = 301;
    public static final int ERROR_CODE_EAGLE_EYE_CHECKING_FAIL = 401;
    public static final int ERROR_CODE_EAGLE_EYE_USER_CANCEL = 402;
    public static final int ERROR_CODE_EMAIL_ERROR = 104;
    public static final int ERROR_CODE_ERROR_ON_CHECKING_PROCESSING = 202;
    public static final int ERROR_CODE_ERROR_ON_WAITING_PROCESSING = 602;
    public static final int ERROR_CODE_FAIL_BY_INVALID_EMAIL = 302;
    public static final int ERROR_CODE_INTERNAL_ERROR = 100;
    public static final int ERROR_CODE_NO_SA_ACCOUNT = 101;
    public static final int ERROR_CODE_PASSKEY_NOT_SET = 102;
    public static final int ERROR_CODE_PASSKEY_SEND_UOP_FAIL = 601;
    public static final int ERROR_CODE_PASSKEY_SIGN_FAIL = 501;
    public static final int ERROR_CODE_PASSKEY_USER_CANCEL = 502;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.api.model.CardAuthResult.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ CardAuthResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CardAuthResult() {
    }

    public static final class Success extends CardAuthResult {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Success> CREATOR = new Creator();
        private final CardAuthUserExitSource exitSource;

        public static final class Creator implements Parcelable.Creator<Success> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Success createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Success((CardAuthUserExitSource) parcel.readParcelable(Success.class.getClassLoader()));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Success[] newArray(int i) {
                return new Success[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CardAuthUserExitSource getExitSource() {
            return this.exitSource;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeParcelable(this.exitSource, i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(@NotNull CardAuthUserExitSource cardAuthUserExitSource) {
            super(null);
            Intrinsics.checkNotNullParameter(cardAuthUserExitSource, "");
            this.exitSource = cardAuthUserExitSource;
        }
    }

    public static final class Fail extends CardAuthResult {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Fail> CREATOR = new Creator();
        private final int errorCode;
        private final Exception exception;
        private final CardAuthUserExitSource exitSource;
        private final Parcelable extra;

        public static final class Creator implements Parcelable.Creator<Fail> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Fail createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Fail(parcel.readInt(), (Exception) parcel.readSerializable(), parcel.readParcelable(Fail.class.getClassLoader()), (CardAuthUserExitSource) parcel.readParcelable(Fail.class.getClassLoader()));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Fail[] newArray(int i) {
                return new Fail[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getErrorCode() {
            return this.errorCode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Exception getException() {
            return this.exception;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CardAuthUserExitSource getExitSource() {
            return this.exitSource;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Parcelable getExtra() {
            return this.extra;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.errorCode);
            parcel.writeSerializable(this.exception);
            parcel.writeParcelable(this.extra, i);
            parcel.writeParcelable(this.exitSource, i);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r2v0 int)
  (wrap:java.lang.Exception:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Exception) : (r3v0 java.lang.Exception))
  (wrap:android.os.Parcelable:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null android.os.Parcelable) : (r4v0 android.os.Parcelable))
  (wrap:com.okinc.business.web3pay.api.model.CardAuthUserExitSource:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.web3pay.api.model.CardAuthUserExitSource) : (r5v0 com.okinc.business.web3pay.api.model.CardAuthUserExitSource))
 A[MD:(int, java.lang.Exception, android.os.Parcelable, com.okinc.business.web3pay.api.model.CardAuthUserExitSource):void (m)] (LINE:73) call: com.okinc.business.web3pay.api.model.CardAuthResult.Fail.<init>(int, java.lang.Exception, android.os.Parcelable, com.okinc.business.web3pay.api.model.CardAuthUserExitSource):void type: THIS */
        public /* synthetic */ Fail(int i, Exception exc, Parcelable parcelable, CardAuthUserExitSource cardAuthUserExitSource, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : exc, (i2 & 4) != 0 ? null : parcelable, (i2 & 8) != 0 ? null : cardAuthUserExitSource);
        }

        public Fail(int i, Exception exc, Parcelable parcelable, CardAuthUserExitSource cardAuthUserExitSource) {
            super(null);
            this.errorCode = i;
            this.exception = exc;
            this.extra = parcelable;
            this.exitSource = cardAuthUserExitSource;
        }
    }

    public static final class Processing extends CardAuthResult {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Processing> CREATOR = new Creator();
        private final CardAuthUserExitSource exitSource;

        public static final class Creator implements Parcelable.Creator<Processing> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Processing createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Processing((CardAuthUserExitSource) parcel.readParcelable(Processing.class.getClassLoader()));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Processing[] newArray(int i) {
                return new Processing[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CardAuthUserExitSource getExitSource() {
            return this.exitSource;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeParcelable(this.exitSource, i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Processing(@NotNull CardAuthUserExitSource cardAuthUserExitSource) {
            super(null);
            Intrinsics.checkNotNullParameter(cardAuthUserExitSource, "");
            this.exitSource = cardAuthUserExitSource;
        }
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.api.model.CardAuthResult.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
