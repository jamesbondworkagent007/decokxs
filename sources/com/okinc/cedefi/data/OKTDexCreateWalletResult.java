package com.okinc.cedefi.data;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.Serializable;
import o.C56524yIo;
import o.InterfaceC56551yJo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public interface OKTDexCreateWalletResult extends Parcelable {
    public static final Companion Companion = Companion.AEQbTJ;

    public static final class Companion {
        public static final /* synthetic */ Companion AEQbTJ = new Companion();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        public final KSerializer<OKTDexCreateWalletResult> serializer() {
            return new SealedClassSerializer("com.okinc.cedefi.data.OKTDexCreateWalletResult", C56524yIo.AEQbTJ(OKTDexCreateWalletResult.class), new InterfaceC56551yJo[0], new KSerializer[0], new Annotation[0]);
        }
    }

    public static final class Success implements OKTDexCreateWalletResult {
        public static final Parcelable.Creator<Success> CREATOR = new Creator();
        public final boolean OLrzqt;

        public static final class Creator implements Parcelable.Creator<Success> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Success createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Success(parcel.readInt() != 0);
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
        public static /* synthetic */ Success copy$default(Success success, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = success.OLrzqt;
            }
            return success.EZpvd(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Success EZpvd(boolean z) {
            return new Success(z);
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
            return (obj instanceof Success) && this.OLrzqt == ((Success) obj).OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return Boolean.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Success(isExternalLink=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.OLrzqt ? 1 : 0);
        }

        public Success(boolean z) {
            this.OLrzqt = z;
        }
    }

    public static final class Cancelled implements OKTDexCreateWalletResult {
        public static final Cancelled KWHzl = new Cancelled();
        public static final Parcelable.Creator<Cancelled> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<Cancelled> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Cancelled createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return Cancelled.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Cancelled[] newArray(int i) {
                return new Cancelled[i];
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

        private Cancelled() {
        }
    }

    public static final class Failed implements OKTDexCreateWalletResult {
        public static final Parcelable.Creator<Failed> CREATOR = new Creator();
        public final OKTDexWalletCreationError EZpvd;

        public static final class Creator implements Parcelable.Creator<Failed> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failed createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Failed((OKTDexWalletCreationError) parcel.readParcelable(Failed.class.getClassLoader()));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failed[] newArray(int i) {
                return new Failed[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Failed copy$default(Failed failed, OKTDexWalletCreationError oKTDexWalletCreationError, int i, Object obj) {
            if ((i & 1) != 0) {
                oKTDexWalletCreationError = failed.EZpvd;
            }
            return failed.AEQbTJ(oKTDexWalletCreationError);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Failed AEQbTJ(@NotNull OKTDexWalletCreationError oKTDexWalletCreationError) {
            Intrinsics.checkNotNullParameter(oKTDexWalletCreationError, "");
            return new Failed(oKTDexWalletCreationError);
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
            return (obj instanceof Failed) && Intrinsics.EZpvd(this.EZpvd, ((Failed) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Failed(error=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeParcelable(this.EZpvd, i);
        }

        public Failed(@NotNull OKTDexWalletCreationError oKTDexWalletCreationError) {
            Intrinsics.checkNotNullParameter(oKTDexWalletCreationError, "");
            this.EZpvd = oKTDexWalletCreationError;
        }
    }

    public static final class Ignored implements OKTDexCreateWalletResult {
        public static final Ignored copydefault = new Ignored();
        public static final Parcelable.Creator<Ignored> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<Ignored> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Ignored createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return Ignored.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Ignored[] newArray(int i) {
                return new Ignored[i];
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

        private Ignored() {
        }
    }
}
