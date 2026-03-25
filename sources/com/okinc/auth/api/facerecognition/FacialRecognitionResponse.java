package com.okinc.auth.api.facerecognition;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public abstract class FacialRecognitionResponse implements Parcelable {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.api.facerecognition.FacialRecognitionResponse.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ FacialRecognitionResponse(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private FacialRecognitionResponse() {
    }

    public static final class TicketSubmitted extends FacialRecognitionResponse {
        public static final TicketSubmitted EZpvd = new TicketSubmitted();
        public static final Parcelable.Creator<TicketSubmitted> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<TicketSubmitted> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TicketSubmitted createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return TicketSubmitted.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TicketSubmitted[] newArray(int i) {
                return new TicketSubmitted[i];
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

        private TicketSubmitted() {
            super(null);
        }
    }

    public static final class TicketAlreadyProcessing extends FacialRecognitionResponse {
        public static final TicketAlreadyProcessing OLrzqt = new TicketAlreadyProcessing();
        public static final Parcelable.Creator<TicketAlreadyProcessing> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<TicketAlreadyProcessing> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TicketAlreadyProcessing createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return TicketAlreadyProcessing.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TicketAlreadyProcessing[] newArray(int i) {
                return new TicketAlreadyProcessing[i];
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

        private TicketAlreadyProcessing() {
            super(null);
        }
    }

    public static final class Success extends FacialRecognitionResponse {
        public static final Parcelable.Creator<Success> CREATOR = new Creator();
        public final String copydefault;

        public static final class Creator implements Parcelable.Creator<Success> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Success createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Success(parcel.readString());
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
        public static /* synthetic */ Success copy$default(Success success, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = success.copydefault;
            }
            return success.EZpvd(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Success EZpvd(String str) {
            return new Success(str);
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
            return (obj instanceof Success) && Intrinsics.EZpvd((Object) this.copydefault, (Object) ((Success) obj).copydefault);
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
            return "Success(nextStep=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.copydefault);
        }

        public Success(String str) {
            super(null);
            this.copydefault = str;
        }
    }

    public static final class Failure extends FacialRecognitionResponse {
        public static final Parcelable.Creator<Failure> CREATOR = new Creator();
        public final int EZpvd;
        public final int OLrzqt;

        public static final class Creator implements Parcelable.Creator<Failure> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failure createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Failure(parcel.readInt(), parcel.readInt());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failure[] newArray(int i) {
                return new Failure[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Failure copy$default(Failure failure, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = failure.OLrzqt;
            }
            if ((i3 & 2) != 0) {
                i2 = failure.EZpvd;
            }
            return failure.AEQbTJ(i, i2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Failure AEQbTJ(int i, int i2) {
            return new Failure(i, i2);
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
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return this.OLrzqt == failure.OLrzqt && this.EZpvd == failure.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (Integer.hashCode(this.OLrzqt) * 31) + Integer.hashCode(this.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Failure(retryCount=" + this.OLrzqt + ", limitedTime=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.OLrzqt);
            parcel.writeInt(this.EZpvd);
        }

        public Failure(int i, int i2) {
            super(null);
            this.OLrzqt = i;
            this.EZpvd = i2;
        }
    }

    public static final class MaxTry extends FacialRecognitionResponse {
        public static final Parcelable.Creator<MaxTry> CREATOR = new Creator();
        public final int OLrzqt;

        public static final class Creator implements Parcelable.Creator<MaxTry> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MaxTry createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new MaxTry(parcel.readInt());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MaxTry[] newArray(int i) {
                return new MaxTry[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ MaxTry copy$default(MaxTry maxTry, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = maxTry.OLrzqt;
            }
            return maxTry.KWHzl(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final MaxTry KWHzl(int i) {
            return new MaxTry(i);
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
            return (obj instanceof MaxTry) && this.OLrzqt == ((MaxTry) obj).OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return Integer.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "MaxTry(limitedTime=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.OLrzqt);
        }

        public MaxTry(int i) {
            super(null);
            this.OLrzqt = i;
        }
    }

    public static final class Cancel extends FacialRecognitionResponse {
        public static final Cancel OLrzqt = new Cancel();
        public static final Parcelable.Creator<Cancel> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<Cancel> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Cancel createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return Cancel.OLrzqt;
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

    public static final class PermissionDenied extends FacialRecognitionResponse {
        public static final PermissionDenied AEQbTJ = new PermissionDenied();
        public static final Parcelable.Creator<PermissionDenied> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<PermissionDenied> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PermissionDenied createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return PermissionDenied.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PermissionDenied[] newArray(int i) {
                return new PermissionDenied[i];
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

        private PermissionDenied() {
            super(null);
        }
    }
}
