package com.okinc.auth.api.passkey;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public abstract class PasskeyAuthenticateState implements Parcelable {
    public static final int $stable = 0;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.api.passkey.PasskeyAuthenticateState.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ PasskeyAuthenticateState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PasskeyAuthenticateState() {
    }

    public static final class Success extends PasskeyAuthenticateState {
        public static final Parcelable.Creator<Success> CREATOR = new Creator();
        public final PasskeyAuthenticateResponse OLrzqt;
        public final boolean copydefault;

        /* JADX INFO: loaded from: classes17.dex */
        public static final class Creator implements Parcelable.Creator<Success> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Success createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Success(parcel.readInt() == 0 ? null : PasskeyAuthenticateResponse.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
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
        public static /* synthetic */ Success copy$default(Success success, PasskeyAuthenticateResponse passkeyAuthenticateResponse, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                passkeyAuthenticateResponse = success.OLrzqt;
            }
            if ((i & 2) != 0) {
                z = success.copydefault;
            }
            return success.copydefault(passkeyAuthenticateResponse, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PasskeyAuthenticateResponse OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Success copydefault(PasskeyAuthenticateResponse passkeyAuthenticateResponse, boolean z) {
            return new Success(passkeyAuthenticateResponse, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.copydefault;
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
            return Intrinsics.EZpvd(this.OLrzqt, success.OLrzqt) && this.copydefault == success.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            PasskeyAuthenticateResponse passkeyAuthenticateResponse = this.OLrzqt;
            return ((passkeyAuthenticateResponse == null ? 0 : passkeyAuthenticateResponse.hashCode()) * 31) + Boolean.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Success(data=" + this.OLrzqt + ", isExternalPasskey=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            PasskeyAuthenticateResponse passkeyAuthenticateResponse = this.OLrzqt;
            if (passkeyAuthenticateResponse == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                passkeyAuthenticateResponse.writeToParcel(parcel, i);
            }
            parcel.writeInt(this.copydefault ? 1 : 0);
        }

        public Success(PasskeyAuthenticateResponse passkeyAuthenticateResponse, boolean z) {
            super(null);
            this.OLrzqt = passkeyAuthenticateResponse;
            this.copydefault = z;
        }
    }

    public static final class Cancel extends PasskeyAuthenticateState {
        public static final Cancel copydefault = new Cancel();
        public static final Parcelable.Creator<Cancel> CREATOR = new Creator();

        /* JADX INFO: loaded from: classes17.dex */
        public static final class Creator implements Parcelable.Creator<Cancel> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Cancel createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return Cancel.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Cancel[] newArray(int i) {
                return new Cancel[i];
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

        private Cancel() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class SdkError extends PasskeyAuthenticateState {
        public static final Parcelable.Creator<SdkError> CREATOR = new Creator();
        public final boolean EZpvd;
        public final String OLrzqt;

        public static final class Creator implements Parcelable.Creator<SdkError> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SdkError createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new SdkError(parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SdkError[] newArray(int i) {
                return new SdkError[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.EZpvd;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.OLrzqt);
            parcel.writeInt(this.EZpvd ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SdkError(@NotNull String str, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = str;
            this.EZpvd = z;
        }
    }

    public static final class Failure extends PasskeyAuthenticateState {
        public static final Failure OLrzqt = new Failure();
        public static final Parcelable.Creator<Failure> CREATOR = new Creator();

        /* JADX INFO: loaded from: classes17.dex */
        public static final class Creator implements Parcelable.Creator<Failure> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failure createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return Failure.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failure[] newArray(int i) {
                return new Failure[i];
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

        private Failure() {
            super(null);
        }
    }

    public static final class NoValidPasskey extends PasskeyAuthenticateState {
        public static final NoValidPasskey OLrzqt = new NoValidPasskey();
        public static final Parcelable.Creator<NoValidPasskey> CREATOR = new Creator();

        /* JADX INFO: loaded from: classes17.dex */
        public static final class Creator implements Parcelable.Creator<NoValidPasskey> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NoValidPasskey createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return NoValidPasskey.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NoValidPasskey[] newArray(int i) {
                return new NoValidPasskey[i];
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

        private NoValidPasskey() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class AccountFrozen extends PasskeyAuthenticateState {
        public static final AccountFrozen KWHzl = new AccountFrozen();
        public static final Parcelable.Creator<AccountFrozen> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<AccountFrozen> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AccountFrozen createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return AccountFrozen.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AccountFrozen[] newArray(int i) {
                return new AccountFrozen[i];
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

        private AccountFrozen() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class DeviceNotCompatible extends PasskeyAuthenticateState {
        public static final DeviceNotCompatible OLrzqt = new DeviceNotCompatible();
        public static final Parcelable.Creator<DeviceNotCompatible> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<DeviceNotCompatible> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DeviceNotCompatible createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return DeviceNotCompatible.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DeviceNotCompatible[] newArray(int i) {
                return new DeviceNotCompatible[i];
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

        private DeviceNotCompatible() {
            super(null);
        }
    }
}
