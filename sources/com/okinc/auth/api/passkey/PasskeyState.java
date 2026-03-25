package com.okinc.auth.api.passkey;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public abstract class PasskeyState implements Parcelable {
    public static final int $stable = 0;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.api.passkey.PasskeyState.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ PasskeyState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PasskeyState() {
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class OkxPaySdkError extends PasskeyState {
        public static final Parcelable.Creator<OkxPaySdkError> CREATOR = new Creator();
        public final boolean EZpvd;
        public final String OLrzqt;

        public static final class Creator implements Parcelable.Creator<OkxPaySdkError> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OkxPaySdkError createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new OkxPaySdkError(parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OkxPaySdkError[] newArray(int i) {
                return new OkxPaySdkError[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ OkxPaySdkError copy$default(OkxPaySdkError okxPaySdkError, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = okxPaySdkError.OLrzqt;
            }
            if ((i & 2) != 0) {
                z = okxPaySdkError.EZpvd;
            }
            return okxPaySdkError.AEQbTJ(str, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OkxPaySdkError AEQbTJ(@NotNull String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            return new OkxPaySdkError(str, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean KWHzl() {
            return this.EZpvd;
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
            if (!(obj instanceof OkxPaySdkError)) {
                return false;
            }
            OkxPaySdkError okxPaySdkError = (OkxPaySdkError) obj;
            return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) okxPaySdkError.OLrzqt) && this.EZpvd == okxPaySdkError.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.OLrzqt.hashCode() * 31) + Boolean.hashCode(this.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "OkxPaySdkError(message=" + this.OLrzqt + ", isHandled=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.OLrzqt);
            parcel.writeInt(this.EZpvd ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OkxPaySdkError(@NotNull String str, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = str;
            this.EZpvd = z;
        }
    }

    public static final class RegisteredAlready extends PasskeyState {
        public static final int $stable = 0;
        public static final RegisteredAlready INSTANCE = new RegisteredAlready();
        public static final Parcelable.Creator<RegisteredAlready> CREATOR = new Creator();

        /* JADX INFO: loaded from: classes17.dex */
        public static final class Creator implements Parcelable.Creator<RegisteredAlready> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RegisteredAlready createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return RegisteredAlready.INSTANCE;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RegisteredAlready[] newArray(int i) {
                return new RegisteredAlready[i];
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

        private RegisteredAlready() {
            super(null);
        }
    }

    public static final class NoValidPasskey extends PasskeyState {
        public static final int $stable = 0;
        public static final NoValidPasskey INSTANCE = new NoValidPasskey();
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
                return NoValidPasskey.INSTANCE;
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

    public static final class AccountFrozen extends PasskeyState {
        public static final int $stable = 0;
        public static final AccountFrozen INSTANCE = new AccountFrozen();
        public static final Parcelable.Creator<AccountFrozen> CREATOR = new Creator();

        /* JADX INFO: loaded from: classes17.dex */
        public static final class Creator implements Parcelable.Creator<AccountFrozen> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AccountFrozen createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return AccountFrozen.INSTANCE;
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

    public static final class MaximumReached extends PasskeyState {
        public static final int $stable = 0;
        public static final MaximumReached INSTANCE = new MaximumReached();
        public static final Parcelable.Creator<MaximumReached> CREATOR = new Creator();

        /* JADX INFO: loaded from: classes17.dex */
        public static final class Creator implements Parcelable.Creator<MaximumReached> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MaximumReached createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return MaximumReached.INSTANCE;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MaximumReached[] newArray(int i) {
                return new MaximumReached[i];
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

        private MaximumReached() {
            super(null);
        }
    }

    public static final class NotInWhiteList extends PasskeyState {
        public static final int $stable = 0;
        public static final NotInWhiteList INSTANCE = new NotInWhiteList();
        public static final Parcelable.Creator<NotInWhiteList> CREATOR = new Creator();

        /* JADX INFO: loaded from: classes17.dex */
        public static final class Creator implements Parcelable.Creator<NotInWhiteList> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NotInWhiteList createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return NotInWhiteList.INSTANCE;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NotInWhiteList[] newArray(int i) {
                return new NotInWhiteList[i];
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

        private NotInWhiteList() {
            super(null);
        }
    }

    public static final class ScreenLockDisabled extends PasskeyState {
        public static final int $stable = 0;
        public static final ScreenLockDisabled INSTANCE = new ScreenLockDisabled();
        public static final Parcelable.Creator<ScreenLockDisabled> CREATOR = new Creator();

        /* JADX INFO: loaded from: classes17.dex */
        public static final class Creator implements Parcelable.Creator<ScreenLockDisabled> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ScreenLockDisabled createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return ScreenLockDisabled.INSTANCE;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ScreenLockDisabled[] newArray(int i) {
                return new ScreenLockDisabled[i];
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

        private ScreenLockDisabled() {
            super(null);
        }
    }

    public static final class DeviceNotCompatible extends PasskeyState {
        public static final int $stable = 0;
        public static final DeviceNotCompatible INSTANCE = new DeviceNotCompatible();
        public static final Parcelable.Creator<DeviceNotCompatible> CREATOR = new Creator();

        /* JADX INFO: loaded from: classes17.dex */
        public static final class Creator implements Parcelable.Creator<DeviceNotCompatible> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DeviceNotCompatible createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return DeviceNotCompatible.INSTANCE;
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

    public static final class IsChinaIp extends PasskeyState {
        public static final int $stable = 0;
        public static final IsChinaIp INSTANCE = new IsChinaIp();
        public static final Parcelable.Creator<IsChinaIp> CREATOR = new Creator();

        /* JADX INFO: loaded from: classes17.dex */
        public static final class Creator implements Parcelable.Creator<IsChinaIp> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IsChinaIp createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return IsChinaIp.INSTANCE;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IsChinaIp[] newArray(int i) {
                return new IsChinaIp[i];
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

        private IsChinaIp() {
            super(null);
        }
    }

    public static final class Cancel extends PasskeyState {
        public static final int $stable = 0;
        public static final Cancel INSTANCE = new Cancel();
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
                return Cancel.INSTANCE;
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

    public static final class Fallback extends PasskeyState {
        public static final int $stable = 0;
        public static final Fallback INSTANCE = new Fallback();
        public static final Parcelable.Creator<Fallback> CREATOR = new Creator();

        /* JADX INFO: loaded from: classes17.dex */
        public static final class Creator implements Parcelable.Creator<Fallback> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Fallback createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return Fallback.INSTANCE;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Fallback[] newArray(int i) {
                return new Fallback[i];
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

        private Fallback() {
            super(null);
        }
    }

    public static final class AccountHasNoPasskey extends PasskeyState {
        public static final int $stable = 0;
        public static final AccountHasNoPasskey INSTANCE = new AccountHasNoPasskey();
        public static final Parcelable.Creator<AccountHasNoPasskey> CREATOR = new Creator();

        /* JADX INFO: loaded from: classes17.dex */
        public static final class Creator implements Parcelable.Creator<AccountHasNoPasskey> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AccountHasNoPasskey createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return AccountHasNoPasskey.INSTANCE;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AccountHasNoPasskey[] newArray(int i) {
                return new AccountHasNoPasskey[i];
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

        private AccountHasNoPasskey() {
            super(null);
        }
    }

    public static final class CheckError extends PasskeyState {
        public static final int $stable = 0;
        public static final Parcelable.Creator<CheckError> CREATOR = new Creator();
        private final String message;

        /* JADX INFO: loaded from: classes17.dex */
        public static final class Creator implements Parcelable.Creator<CheckError> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CheckError createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new CheckError(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CheckError[] newArray(int i) {
                return new CheckError[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ CheckError copy$default(CheckError checkError, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = checkError.message;
            }
            return checkError.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.message;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CheckError copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new CheckError(str);
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
            return (obj instanceof CheckError) && Intrinsics.EZpvd((Object) this.message, (Object) ((CheckError) obj).message);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMessage() {
            return this.message;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.message.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "CheckError(message=" + this.message + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.message);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CheckError(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }
    }

    public static final class AuthenticateError extends PasskeyState {
        public static final int $stable = 0;
        public static final Parcelable.Creator<AuthenticateError> CREATOR = new Creator();
        private final String message;

        /* JADX INFO: loaded from: classes17.dex */
        public static final class Creator implements Parcelable.Creator<AuthenticateError> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AuthenticateError createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new AuthenticateError(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AuthenticateError[] newArray(int i) {
                return new AuthenticateError[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ AuthenticateError copy$default(AuthenticateError authenticateError, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = authenticateError.message;
            }
            return authenticateError.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.message;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AuthenticateError copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new AuthenticateError(str);
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
            return (obj instanceof AuthenticateError) && Intrinsics.EZpvd((Object) this.message, (Object) ((AuthenticateError) obj).message);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMessage() {
            return this.message;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.message.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "AuthenticateError(message=" + this.message + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.message);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AuthenticateError(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }
    }

    public static final class RegisterError extends PasskeyState {
        public static final int $stable = 0;
        public static final Parcelable.Creator<RegisterError> CREATOR = new Creator();
        private final String message;

        /* JADX INFO: loaded from: classes17.dex */
        public static final class Creator implements Parcelable.Creator<RegisterError> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RegisterError createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new RegisterError(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RegisterError[] newArray(int i) {
                return new RegisterError[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ RegisterError copy$default(RegisterError registerError, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = registerError.message;
            }
            return registerError.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.message;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RegisterError copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new RegisterError(str);
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
            return (obj instanceof RegisterError) && Intrinsics.EZpvd((Object) this.message, (Object) ((RegisterError) obj).message);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMessage() {
            return this.message;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.message.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "RegisterError(message=" + this.message + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.message);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RegisterError(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }
    }

    public static final class Success extends PasskeyState {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Success> CREATOR = new Creator();
        private final PasskeyAuthenticateResponse authenticatePasskeyData;

        /* JADX INFO: loaded from: classes17.dex */
        public static final class Creator implements Parcelable.Creator<Success> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Success createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Success(parcel.readInt() == 0 ? null : PasskeyAuthenticateResponse.CREATOR.createFromParcel(parcel));
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
        public Success() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Success copy$default(Success success, PasskeyAuthenticateResponse passkeyAuthenticateResponse, int i, Object obj) {
            if ((i & 1) != 0) {
                passkeyAuthenticateResponse = success.authenticatePasskeyData;
            }
            return success.copy(passkeyAuthenticateResponse);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PasskeyAuthenticateResponse component1() {
            return this.authenticatePasskeyData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Success copy(PasskeyAuthenticateResponse passkeyAuthenticateResponse) {
            return new Success(passkeyAuthenticateResponse);
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
            return (obj instanceof Success) && Intrinsics.EZpvd(this.authenticatePasskeyData, ((Success) obj).authenticatePasskeyData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PasskeyAuthenticateResponse getAuthenticatePasskeyData() {
            return this.authenticatePasskeyData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            PasskeyAuthenticateResponse passkeyAuthenticateResponse = this.authenticatePasskeyData;
            if (passkeyAuthenticateResponse == null) {
                return 0;
            }
            return passkeyAuthenticateResponse.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Success(authenticatePasskeyData=" + this.authenticatePasskeyData + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            PasskeyAuthenticateResponse passkeyAuthenticateResponse = this.authenticatePasskeyData;
            if (passkeyAuthenticateResponse == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                passkeyAuthenticateResponse.writeToParcel(parcel, i);
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:com.okinc.auth.api.passkey.PasskeyAuthenticateResponse:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.auth.api.passkey.PasskeyAuthenticateResponse) : (r1v0 com.okinc.auth.api.passkey.PasskeyAuthenticateResponse))
 A[MD:(com.okinc.auth.api.passkey.PasskeyAuthenticateResponse):void (m)] (LINE:146) call: com.okinc.auth.api.passkey.PasskeyState.Success.<init>(com.okinc.auth.api.passkey.PasskeyAuthenticateResponse):void type: THIS */
        public /* synthetic */ Success(PasskeyAuthenticateResponse passkeyAuthenticateResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : passkeyAuthenticateResponse);
        }

        /* JADX INFO: loaded from: classes22.dex */
        @Serializable
        public static final class AuthenticatePasskeyData implements Parcelable {
            public static final int $stable = 0;
            private final String authenticatorAttachment;
            private final ClientExtensionResultsData clientExtensionResults;
            private final String id;
            private final Response response;
            private final String type;
            public static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<AuthenticatePasskeyData> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<AuthenticatePasskeyData> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AuthenticatePasskeyData createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new AuthenticatePasskeyData(parcel.readString(), parcel.readString(), parcel.readString(), Response.CREATOR.createFromParcel(parcel), ClientExtensionResultsData.CREATOR.createFromParcel(parcel));
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AuthenticatePasskeyData[] newArray(int i) {
                    return new AuthenticatePasskeyData[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ AuthenticatePasskeyData copy$default(AuthenticatePasskeyData authenticatePasskeyData, String str, String str2, String str3, Response response, ClientExtensionResultsData clientExtensionResultsData, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = authenticatePasskeyData.id;
                }
                if ((i & 2) != 0) {
                    str2 = authenticatePasskeyData.type;
                }
                String str4 = str2;
                if ((i & 4) != 0) {
                    str3 = authenticatePasskeyData.authenticatorAttachment;
                }
                String str5 = str3;
                if ((i & 8) != 0) {
                    response = authenticatePasskeyData.response;
                }
                Response response2 = response;
                if ((i & 16) != 0) {
                    clientExtensionResultsData = authenticatePasskeyData.clientExtensionResults;
                }
                return authenticatePasskeyData.copy(str, str4, str5, response2, clientExtensionResultsData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.id;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component2() {
                return this.type;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component3() {
                return this.authenticatorAttachment;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Response component4() {
                return this.response;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ClientExtensionResultsData component5() {
                return this.clientExtensionResults;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AuthenticatePasskeyData copy(String str, String str2, String str3, @NotNull Response response, @NotNull ClientExtensionResultsData clientExtensionResultsData) {
                Intrinsics.checkNotNullParameter(response, "");
                Intrinsics.checkNotNullParameter(clientExtensionResultsData, "");
                return new AuthenticatePasskeyData(str, str2, str3, response, clientExtensionResultsData);
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
                if (!(obj instanceof AuthenticatePasskeyData)) {
                    return false;
                }
                AuthenticatePasskeyData authenticatePasskeyData = (AuthenticatePasskeyData) obj;
                return Intrinsics.EZpvd((Object) this.id, (Object) authenticatePasskeyData.id) && Intrinsics.EZpvd((Object) this.type, (Object) authenticatePasskeyData.type) && Intrinsics.EZpvd((Object) this.authenticatorAttachment, (Object) authenticatePasskeyData.authenticatorAttachment) && Intrinsics.EZpvd(this.response, authenticatePasskeyData.response) && Intrinsics.EZpvd(this.clientExtensionResults, authenticatePasskeyData.clientExtensionResults);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getAuthenticatorAttachment() {
                return this.authenticatorAttachment;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ClientExtensionResultsData getClientExtensionResults() {
                return this.clientExtensionResults;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getId() {
                return this.id;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Response getResponse() {
                return this.response;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getType() {
                return this.type;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                String str = this.id;
                int iHashCode = str == null ? 0 : str.hashCode();
                String str2 = this.type;
                int iHashCode2 = str2 == null ? 0 : str2.hashCode();
                String str3 = this.authenticatorAttachment;
                return (((((((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + this.response.hashCode()) * 31) + this.clientExtensionResults.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "AuthenticatePasskeyData(id=" + this.id + ", type=" + this.type + ", authenticatorAttachment=" + this.authenticatorAttachment + ", response=" + this.response + ", clientExtensionResults=" + this.clientExtensionResults + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.id);
                parcel.writeString(this.type);
                parcel.writeString(this.authenticatorAttachment);
                this.response.writeToParcel(parcel, i);
                this.clientExtensionResults.writeToParcel(parcel, i);
            }

            public static final class Companion {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                private Companion() {
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.api.passkey.PasskeyState.Success.AuthenticatePasskeyData.Companion.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<AuthenticatePasskeyData> serializer() {
                    return PasskeyState$Success$AuthenticatePasskeyData$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ AuthenticatePasskeyData(int i, String str, String str2, String str3, Response response, ClientExtensionResultsData clientExtensionResultsData, SerializationConstructorMarker serializationConstructorMarker) {
                if (8 != (i & 8)) {
                    PluginExceptionsKt.throwMissingFieldException(i, 8, PasskeyState$Success$AuthenticatePasskeyData$$serializer.INSTANCE.getDescriptor());
                }
                if ((i & 1) == 0) {
                    this.id = null;
                } else {
                    this.id = str;
                }
                if ((i & 2) == 0) {
                    this.type = null;
                } else {
                    this.type = str2;
                }
                if ((i & 4) == 0) {
                    this.authenticatorAttachment = null;
                } else {
                    this.authenticatorAttachment = str3;
                }
                this.response = response;
                if ((i & 16) == 0) {
                    this.clientExtensionResults = new ClientExtensionResultsData();
                } else {
                    this.clientExtensionResults = clientExtensionResultsData;
                }
            }

            public static final /* synthetic */ void write$Self$OKAuth_auth_api(AuthenticatePasskeyData authenticatePasskeyData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || authenticatePasskeyData.id != null) {
                    compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, authenticatePasskeyData.id);
                }
                if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || authenticatePasskeyData.type != null) {
                    compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, authenticatePasskeyData.type);
                }
                if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || authenticatePasskeyData.authenticatorAttachment != null) {
                    compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, authenticatePasskeyData.authenticatorAttachment);
                }
                compositeEncoder.encodeSerializableElement(serialDescriptor, 3, PasskeyState$Success$AuthenticatePasskeyData$Response$$serializer.INSTANCE, authenticatePasskeyData.response);
                if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd(authenticatePasskeyData.clientExtensionResults, new ClientExtensionResultsData())) {
                    return;
                }
                compositeEncoder.encodeSerializableElement(serialDescriptor, 4, PasskeyState$Success$AuthenticatePasskeyData$ClientExtensionResultsData$$serializer.INSTANCE, authenticatePasskeyData.clientExtensionResults);
            }

            public AuthenticatePasskeyData(String str, String str2, String str3, @NotNull Response response, @NotNull ClientExtensionResultsData clientExtensionResultsData) {
                Intrinsics.checkNotNullParameter(response, "");
                Intrinsics.checkNotNullParameter(clientExtensionResultsData, "");
                this.id = str;
                this.type = str2;
                this.authenticatorAttachment = str3;
                this.response = response;
                this.clientExtensionResults = clientExtensionResultsData;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0022: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (r11v0 com.okinc.auth.api.passkey.PasskeyState$Success$AuthenticatePasskeyData$Response)
  (wrap:com.okinc.auth.api.passkey.PasskeyState$Success$AuthenticatePasskeyData$ClientExtensionResultsData:?: TERNARY null = ((wrap:int:0x0016: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.auth.api.passkey.PasskeyState$Success$AuthenticatePasskeyData$ClientExtensionResultsData:0x001c: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:157) call: com.okinc.auth.api.passkey.PasskeyState.Success.AuthenticatePasskeyData.ClientExtensionResultsData.<init>():void type: CONSTRUCTOR) : (r12v0 com.okinc.auth.api.passkey.PasskeyState$Success$AuthenticatePasskeyData$ClientExtensionResultsData))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.auth.api.passkey.PasskeyState$Success$AuthenticatePasskeyData$Response, com.okinc.auth.api.passkey.PasskeyState$Success$AuthenticatePasskeyData$ClientExtensionResultsData):void (m)] (LINE:152) call: com.okinc.auth.api.passkey.PasskeyState.Success.AuthenticatePasskeyData.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.auth.api.passkey.PasskeyState$Success$AuthenticatePasskeyData$Response, com.okinc.auth.api.passkey.PasskeyState$Success$AuthenticatePasskeyData$ClientExtensionResultsData):void type: THIS */
            public /* synthetic */ AuthenticatePasskeyData(String str, String str2, String str3, Response response, ClientExtensionResultsData clientExtensionResultsData, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, response, (i & 16) != 0 ? new ClientExtensionResultsData() : clientExtensionResultsData);
            }

            @Serializable
            public static final class Response implements Parcelable {
                public static final int $stable = 0;
                private final String authenticatorData;
                private final String clientDataJSON;
                private final String signature;
                public static final Companion Companion = new Companion(null);
                public static final Parcelable.Creator<Response> CREATOR = new Creator();

                public static final class Creator implements Parcelable.Creator<Response> {
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Response createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "");
                        return new Response(parcel.readString(), parcel.readString(), parcel.readString());
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Response[] newArray(int i) {
                        return new Response[i];
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public Response() {
                    this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ Response copy$default(Response response, String str, String str2, String str3, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = response.clientDataJSON;
                    }
                    if ((i & 2) != 0) {
                        str2 = response.authenticatorData;
                    }
                    if ((i & 4) != 0) {
                        str3 = response.signature;
                    }
                    return response.copy(str, str2, str3);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component1() {
                    return this.clientDataJSON;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component2() {
                    return this.authenticatorData;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component3() {
                    return this.signature;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Response copy(String str, String str2, String str3) {
                    return new Response(str, str2, str3);
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
                    if (!(obj instanceof Response)) {
                        return false;
                    }
                    Response response = (Response) obj;
                    return Intrinsics.EZpvd((Object) this.clientDataJSON, (Object) response.clientDataJSON) && Intrinsics.EZpvd((Object) this.authenticatorData, (Object) response.authenticatorData) && Intrinsics.EZpvd((Object) this.signature, (Object) response.signature);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getAuthenticatorData() {
                    return this.authenticatorData;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getClientDataJSON() {
                    return this.clientDataJSON;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getSignature() {
                    return this.signature;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    String str = this.clientDataJSON;
                    int iHashCode = str == null ? 0 : str.hashCode();
                    String str2 = this.authenticatorData;
                    int iHashCode2 = str2 == null ? 0 : str2.hashCode();
                    String str3 = this.signature;
                    return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "Response(clientDataJSON=" + this.clientDataJSON + ", authenticatorData=" + this.authenticatorData + ", signature=" + this.signature + ")";
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel parcel, int i) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.writeString(this.clientDataJSON);
                    parcel.writeString(this.authenticatorData);
                    parcel.writeString(this.signature);
                }

                public static final class Companion {
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    private Companion() {
                    }

                    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.api.passkey.PasskeyState.Success.AuthenticatePasskeyData.Response.Companion.<init>():void type: THIS */
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Response> serializer() {
                        return PasskeyState$Success$AuthenticatePasskeyData$Response$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ Response(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
                    if ((i & 1) == 0) {
                        this.clientDataJSON = null;
                    } else {
                        this.clientDataJSON = str;
                    }
                    if ((i & 2) == 0) {
                        this.authenticatorData = null;
                    } else {
                        this.authenticatorData = str2;
                    }
                    if ((i & 4) == 0) {
                        this.signature = null;
                    } else {
                        this.signature = str3;
                    }
                }

                public static final /* synthetic */ void write$Self$OKAuth_auth_api(Response response, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                    if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || response.clientDataJSON != null) {
                        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, response.clientDataJSON);
                    }
                    if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || response.authenticatorData != null) {
                        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, response.authenticatorData);
                    }
                    if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && response.signature == null) {
                        return;
                    }
                    compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, response.signature);
                }

                public Response(String str, String str2, String str3) {
                    this.clientDataJSON = str;
                    this.authenticatorData = str2;
                    this.signature = str3;
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:163) call: com.okinc.auth.api.passkey.PasskeyState.Success.AuthenticatePasskeyData.Response.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
                public /* synthetic */ Response(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
                }
            }

            @Serializable
            public static final class ClientExtensionResultsData implements Parcelable {
                public static final int $stable = 0;
                public static final Companion Companion = new Companion(null);
                public static final Parcelable.Creator<ClientExtensionResultsData> CREATOR = new Creator();

                public static final class Creator implements Parcelable.Creator<ClientExtensionResultsData> {
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final ClientExtensionResultsData createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "");
                        parcel.readInt();
                        return new ClientExtensionResultsData();
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final ClientExtensionResultsData[] newArray(int i) {
                        return new ClientExtensionResultsData[i];
                    }
                }

                public static final /* synthetic */ void write$Self$OKAuth_auth_api(ClientExtensionResultsData clientExtensionResultsData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
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

                public static final class Companion {
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    private Companion() {
                    }

                    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.api.passkey.PasskeyState.Success.AuthenticatePasskeyData.ClientExtensionResultsData.Companion.<init>():void type: THIS */
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<ClientExtensionResultsData> serializer() {
                        return PasskeyState$Success$AuthenticatePasskeyData$ClientExtensionResultsData$$serializer.INSTANCE;
                    }
                }

                public ClientExtensionResultsData() {
                }

                public /* synthetic */ ClientExtensionResultsData(int i, SerializationConstructorMarker serializationConstructorMarker) {
                }
            }
        }

        public Success(PasskeyAuthenticateResponse passkeyAuthenticateResponse) {
            super(null);
            this.authenticatePasskeyData = passkeyAuthenticateResponse;
        }
    }

    public final String log() {
        if (this instanceof Success) {
            return "Success";
        }
        if (this instanceof RegisteredAlready) {
            return "RegisteredAlready";
        }
        if (this instanceof NoValidPasskey) {
            return "NoValidPasskey";
        }
        if (this instanceof AccountFrozen) {
            return "AccountFrozen";
        }
        if (this instanceof MaximumReached) {
            return "MaximumReached";
        }
        if (this instanceof NotInWhiteList) {
            return "NotInWhiteList";
        }
        if (this instanceof ScreenLockDisabled) {
            return "ScreenLockDisabled";
        }
        if (this instanceof DeviceNotCompatible) {
            return "DeviceNotCompatible";
        }
        if (this instanceof IsChinaIp) {
            return "IsChinaIp";
        }
        if (this instanceof Cancel) {
            return "Cancel";
        }
        if (this instanceof Fallback) {
            return "Fallback";
        }
        if (this instanceof AccountHasNoPasskey) {
            return "AccountHasNoPasskey";
        }
        if (this instanceof CheckError) {
            return "CheckError: " + ((CheckError) this).getMessage();
        }
        if (this instanceof AuthenticateError) {
            return "AuthenticateError: " + ((AuthenticateError) this).getMessage();
        }
        if (this instanceof RegisterError) {
            return "RegisterError: " + ((RegisterError) this).getMessage();
        }
        if (!(this instanceof OkxPaySdkError)) {
            throw new NoWhenBranchMatchedException();
        }
        return "OkxPaySdkError: " + ((OkxPaySdkError) this).EZpvd();
    }
}
