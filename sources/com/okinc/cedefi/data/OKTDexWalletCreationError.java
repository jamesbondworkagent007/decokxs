package com.okinc.cedefi.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.cedefi.data.OKTDexWalletCreationError;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C56392yDr;
import o.C56524yIo;
import o.InterfaceC56387yDm;
import o.InterfaceC56551yJo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public abstract class OKTDexWalletCreationError implements Parcelable {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.mcC
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return OKTDexWalletCreationError._init_$_anonymous_();
        }
    });

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.cedefi.data.OKTDexWalletCreationError.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ OKTDexWalletCreationError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final /* synthetic */ void write$Self(OKTDexWalletCreationError oKTDexWalletCreationError, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.cedefi.data.OKTDexWalletCreationError.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer copydefault() {
            return (KSerializer) OKTDexWalletCreationError.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<OKTDexWalletCreationError> serializer() {
            return copydefault();
        }
    }

    private OKTDexWalletCreationError() {
    }

    public /* synthetic */ OKTDexWalletCreationError(int i, SerializationConstructorMarker serializationConstructorMarker) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new SealedClassSerializer("com.okinc.cedefi.data.OKTDexWalletCreationError", C56524yIo.AEQbTJ(OKTDexWalletCreationError.class), new InterfaceC56551yJo[0], new KSerializer[0], new Annotation[0]);
    }

    public static final class ReachMaximum extends OKTDexWalletCreationError {
        public static final ReachMaximum AEQbTJ = new ReachMaximum();
        public static final Parcelable.Creator<ReachMaximum> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<ReachMaximum> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ReachMaximum createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return ReachMaximum.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ReachMaximum[] newArray(int i) {
                return new ReachMaximum[i];
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

        private ReachMaximum() {
            super(null);
        }
    }

    public static final class PasskeySdkError extends OKTDexWalletCreationError {
        public static final Parcelable.Creator<PasskeySdkError> CREATOR = new Creator();
        public final Throwable KWHzl;

        public static final class Creator implements Parcelable.Creator<PasskeySdkError> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PasskeySdkError createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new PasskeySdkError((Throwable) parcel.readSerializable());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PasskeySdkError[] newArray(int i) {
                return new PasskeySdkError[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PasskeySdkError copy$default(PasskeySdkError passkeySdkError, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = passkeySdkError.KWHzl;
            }
            return passkeySdkError.AEQbTJ(th);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PasskeySdkError AEQbTJ(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            return new PasskeySdkError(th);
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
            return (obj instanceof PasskeySdkError) && Intrinsics.EZpvd(this.KWHzl, ((PasskeySdkError) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "PasskeySdkError(error=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeSerializable(this.KWHzl);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PasskeySdkError(@NotNull Throwable th) {
            super(null);
            Intrinsics.checkNotNullParameter(th, "");
            this.KWHzl = th;
        }
    }

    public static final class AccountFrozen extends OKTDexWalletCreationError {
        public static final AccountFrozen EZpvd = new AccountFrozen();
        public static final Parcelable.Creator<AccountFrozen> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<AccountFrozen> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AccountFrozen createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return AccountFrozen.EZpvd;
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

    public static final class WalletNetworkFailure extends OKTDexWalletCreationError {
        public static final Parcelable.Creator<WalletNetworkFailure> CREATOR = new Creator();
        public final Throwable AEQbTJ;

        public static final class Creator implements Parcelable.Creator<WalletNetworkFailure> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WalletNetworkFailure createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new WalletNetworkFailure((Throwable) parcel.readSerializable());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WalletNetworkFailure[] newArray(int i) {
                return new WalletNetworkFailure[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ WalletNetworkFailure copy$default(WalletNetworkFailure walletNetworkFailure, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = walletNetworkFailure.AEQbTJ;
            }
            return walletNetworkFailure.copydefault(th);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WalletNetworkFailure copydefault(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            return new WalletNetworkFailure(th);
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
            return (obj instanceof WalletNetworkFailure) && Intrinsics.EZpvd(this.AEQbTJ, ((WalletNetworkFailure) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "WalletNetworkFailure(error=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeSerializable(this.AEQbTJ);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WalletNetworkFailure(@NotNull Throwable th) {
            super(null);
            Intrinsics.checkNotNullParameter(th, "");
            this.AEQbTJ = th;
        }
    }

    public static final class PasskeyNetworkFailure extends OKTDexWalletCreationError {
        public static final Parcelable.Creator<PasskeyNetworkFailure> CREATOR = new Creator();
        public final Throwable OLrzqt;

        public static final class Creator implements Parcelable.Creator<PasskeyNetworkFailure> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PasskeyNetworkFailure createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new PasskeyNetworkFailure((Throwable) parcel.readSerializable());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PasskeyNetworkFailure[] newArray(int i) {
                return new PasskeyNetworkFailure[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PasskeyNetworkFailure copy$default(PasskeyNetworkFailure passkeyNetworkFailure, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = passkeyNetworkFailure.OLrzqt;
            }
            return passkeyNetworkFailure.EZpvd(th);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PasskeyNetworkFailure EZpvd(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            return new PasskeyNetworkFailure(th);
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
            return (obj instanceof PasskeyNetworkFailure) && Intrinsics.EZpvd(this.OLrzqt, ((PasskeyNetworkFailure) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "PasskeyNetworkFailure(error=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeSerializable(this.OLrzqt);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PasskeyNetworkFailure(@NotNull Throwable th) {
            super(null);
            Intrinsics.checkNotNullParameter(th, "");
            this.OLrzqt = th;
        }
    }

    public static final class RiskControl extends OKTDexWalletCreationError {
        public static final RiskControl copydefault = new RiskControl();
        public static final Parcelable.Creator<RiskControl> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<RiskControl> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RiskControl createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return RiskControl.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RiskControl[] newArray(int i) {
                return new RiskControl[i];
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

        private RiskControl() {
            super(null);
        }
    }

    public static final class GeneralFailure extends OKTDexWalletCreationError {
        public static final GeneralFailure AEQbTJ = new GeneralFailure();
        public static final Parcelable.Creator<GeneralFailure> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<GeneralFailure> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GeneralFailure createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return GeneralFailure.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GeneralFailure[] newArray(int i) {
                return new GeneralFailure[i];
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

        private GeneralFailure() {
            super(null);
        }
    }
}
