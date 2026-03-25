package com.okinc.business.defi.api.bean.passkeywallet.cedefi;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public abstract class UpdateInfoResult implements Parcelable {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.bean.passkeywallet.cedefi.UpdateInfoResult.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ UpdateInfoResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private UpdateInfoResult() {
    }

    public static final class Success extends UpdateInfoResult {
        public static final Success AEQbTJ = new Success();
        public static final Parcelable.Creator<Success> CREATOR = new Creator();

        /* JADX INFO: loaded from: classes18.dex */
        public static final class Creator implements Parcelable.Creator<Success> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Success createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return Success.AEQbTJ;
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
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }

        private Success() {
            super(null);
        }
    }

    public static final class Cancelled extends UpdateInfoResult {
        public static final Cancelled KWHzl = new Cancelled();
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
            super(null);
        }
    }

    public static final class Failed extends UpdateInfoResult {
        public static final Parcelable.Creator<Failed> CREATOR = new Creator();
        public final String copydefault;

        /* JADX INFO: loaded from: classes18.dex */
        public static final class Creator implements Parcelable.Creator<Failed> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failed createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Failed(parcel.readString());
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
        public static /* synthetic */ Failed copy$default(Failed failed, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failed.copydefault;
            }
            return failed.AEQbTJ(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Failed AEQbTJ(String str) {
            return new Failed(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
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
            return (obj instanceof Failed) && Intrinsics.EZpvd((Object) this.copydefault, (Object) ((Failed) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.copydefault;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Failed(message=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.copydefault);
        }

        public Failed(String str) {
            super(null);
            this.copydefault = str;
        }
    }
}
