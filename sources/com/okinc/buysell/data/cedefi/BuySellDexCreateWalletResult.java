package com.okinc.buysell.data.cedefi;

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

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public interface BuySellDexCreateWalletResult extends Parcelable {
    public static final Companion Companion = Companion.OLrzqt;

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion OLrzqt = new Companion();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        public final KSerializer<BuySellDexCreateWalletResult> serializer() {
            return new SealedClassSerializer("com.okinc.buysell.data.cedefi.BuySellDexCreateWalletResult", C56524yIo.AEQbTJ(BuySellDexCreateWalletResult.class), new InterfaceC56551yJo[0], new KSerializer[0], new Annotation[0]);
        }
    }

    public static final class Success implements BuySellDexCreateWalletResult {
        public static final Parcelable.Creator<Success> CREATOR = new Creator();
        public final boolean EZpvd;

        /* JADX INFO: loaded from: classes18.dex */
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
                z = success.EZpvd;
            }
            return success.OLrzqt(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Success OLrzqt(boolean z) {
            return new Success(z);
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
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && this.EZpvd == ((Success) obj).EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return Boolean.hashCode(this.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Success(isExternalLink=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.EZpvd ? 1 : 0);
        }

        public Success(boolean z) {
            this.EZpvd = z;
        }
    }

    public static final class Cancelled implements BuySellDexCreateWalletResult {
        public static final Cancelled OLrzqt = new Cancelled();
        public static final Parcelable.Creator<Cancelled> CREATOR = new Creator();

        /* JADX INFO: loaded from: classes18.dex */
        public static final class Creator implements Parcelable.Creator<Cancelled> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Cancelled createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return Cancelled.OLrzqt;
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

    public static final class Failed implements BuySellDexCreateWalletResult {
        public static final Parcelable.Creator<Failed> CREATOR = new Creator();
        public final BuySellDexWalletCreationError AEQbTJ;

        /* JADX INFO: loaded from: classes18.dex */
        public static final class Creator implements Parcelable.Creator<Failed> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failed createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Failed((BuySellDexWalletCreationError) parcel.readParcelable(Failed.class.getClassLoader()));
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
        public static /* synthetic */ Failed copy$default(Failed failed, BuySellDexWalletCreationError buySellDexWalletCreationError, int i, Object obj) {
            if ((i & 1) != 0) {
                buySellDexWalletCreationError = failed.AEQbTJ;
            }
            return failed.EZpvd(buySellDexWalletCreationError);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Failed EZpvd(@NotNull BuySellDexWalletCreationError buySellDexWalletCreationError) {
            Intrinsics.checkNotNullParameter(buySellDexWalletCreationError, "");
            return new Failed(buySellDexWalletCreationError);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final BuySellDexWalletCreationError KWHzl() {
            return this.AEQbTJ;
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
            return (obj instanceof Failed) && Intrinsics.EZpvd(this.AEQbTJ, ((Failed) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Failed(error=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeParcelable(this.AEQbTJ, i);
        }

        public Failed(@NotNull BuySellDexWalletCreationError buySellDexWalletCreationError) {
            Intrinsics.checkNotNullParameter(buySellDexWalletCreationError, "");
            this.AEQbTJ = buySellDexWalletCreationError;
        }
    }

    public static final class Ignored implements BuySellDexCreateWalletResult {
        public static final Ignored EZpvd = new Ignored();
        public static final Parcelable.Creator<Ignored> CREATOR = new Creator();

        /* JADX INFO: loaded from: classes18.dex */
        public static final class Creator implements Parcelable.Creator<Ignored> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Ignored createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return Ignored.EZpvd;
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
