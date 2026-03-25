package com.okinc.auth.impl.passkey.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class DexAccountStatusResponse implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<DexAccountStatusResponse> CREATOR = new Creator();

    @SerializedName("hasDexAccount")
    private final Boolean hasDexAccount;

    @SerializedName("hasEscaped")
    private final Boolean hasEscaped;

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<DexAccountStatusResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexAccountStatusResponse createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            Boolean boolValueOf2 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new DexAccountStatusResponse(boolValueOf, boolValueOf2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexAccountStatusResponse[] newArray(int i) {
            return new DexAccountStatusResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DexAccountStatusResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DexAccountStatusResponse copy$default(DexAccountStatusResponse dexAccountStatusResponse, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = dexAccountStatusResponse.hasDexAccount;
        }
        if ((i & 2) != 0) {
            bool2 = dexAccountStatusResponse.hasEscaped;
        }
        return dexAccountStatusResponse.copy(bool, bool2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component1() {
        return this.hasDexAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component2() {
        return this.hasEscaped;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexAccountStatusResponse copy(Boolean bool, Boolean bool2) {
        return new DexAccountStatusResponse(bool, bool2);
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
        if (!(obj instanceof DexAccountStatusResponse)) {
            return false;
        }
        DexAccountStatusResponse dexAccountStatusResponse = (DexAccountStatusResponse) obj;
        return Intrinsics.EZpvd(this.hasDexAccount, dexAccountStatusResponse.hasDexAccount) && Intrinsics.EZpvd(this.hasEscaped, dexAccountStatusResponse.hasEscaped);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getHasDexAccount() {
        return this.hasDexAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getHasEscaped() {
        return this.hasEscaped;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Boolean bool = this.hasDexAccount;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.hasEscaped;
        return (iHashCode * 31) + (bool2 != null ? bool2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexAccountStatusResponse(hasDexAccount=" + this.hasDexAccount + ", hasEscaped=" + this.hasEscaped + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Boolean bool = this.hasDexAccount;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.hasEscaped;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    public DexAccountStatusResponse(Boolean bool, Boolean bool2) {
        this.hasDexAccount = bool;
        this.hasEscaped = bool2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r2v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r3v0 java.lang.Boolean))
 A[MD:(java.lang.Boolean, java.lang.Boolean):void (m)] (LINE:22) call: com.okinc.auth.impl.passkey.model.DexAccountStatusResponse.<init>(java.lang.Boolean, java.lang.Boolean):void type: THIS */
    public /* synthetic */ DexAccountStatusResponse(Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2);
    }
}
