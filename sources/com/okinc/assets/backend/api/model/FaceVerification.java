package com.okinc.assets.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class FaceVerification implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<FaceVerification> CREATOR = new Creator();
    private final boolean nextAttempt;
    private final boolean required;
    private final String sessionId;

    public static final class Creator implements Parcelable.Creator<FaceVerification> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FaceVerification createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new FaceVerification(parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FaceVerification[] newArray(int i) {
            return new FaceVerification[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FaceVerification() {
        this(false, null, false, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FaceVerification copy$default(FaceVerification faceVerification, boolean z, String str, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = faceVerification.required;
        }
        if ((i & 2) != 0) {
            str = faceVerification.sessionId;
        }
        if ((i & 4) != 0) {
            z2 = faceVerification.nextAttempt;
        }
        return faceVerification.copy(z, str, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.sessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.nextAttempt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FaceVerification copy(boolean z, String str, boolean z2) {
        return new FaceVerification(z, str, z2);
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
        if (!(obj instanceof FaceVerification)) {
            return false;
        }
        FaceVerification faceVerification = (FaceVerification) obj;
        return this.required == faceVerification.required && Intrinsics.EZpvd((Object) this.sessionId, (Object) faceVerification.sessionId) && this.nextAttempt == faceVerification.nextAttempt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNextAttempt() {
        return this.nextAttempt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getRequired() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.required);
        String str = this.sessionId;
        return (((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.nextAttempt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FaceVerification(required=" + this.required + ", sessionId=" + this.sessionId + ", nextAttempt=" + this.nextAttempt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.required ? 1 : 0);
        parcel.writeString(this.sessionId);
        parcel.writeInt(this.nextAttempt ? 1 : 0);
    }

    public FaceVerification(boolean z, String str, boolean z2) {
        this.required = z;
        this.sessionId = str;
        this.nextAttempt = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(boolean, java.lang.String, boolean):void (m)] (LINE:137) call: com.okinc.assets.backend.api.model.FaceVerification.<init>(boolean, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ FaceVerification(boolean z, String str, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z2);
    }
}
