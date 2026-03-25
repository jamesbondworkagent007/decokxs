package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class DcaOrderAmt implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<DcaOrderAmt> CREATOR = new Creator();
    private final String initOrderAmt;
    private final String safetyOrderAmt;

    public static final class Creator implements Parcelable.Creator<DcaOrderAmt> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DcaOrderAmt createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DcaOrderAmt(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DcaOrderAmt[] newArray(int i) {
            return new DcaOrderAmt[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DcaOrderAmt copy$default(DcaOrderAmt dcaOrderAmt, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dcaOrderAmt.initOrderAmt;
        }
        if ((i & 2) != 0) {
            str2 = dcaOrderAmt.safetyOrderAmt;
        }
        return dcaOrderAmt.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.initOrderAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.safetyOrderAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DcaOrderAmt copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new DcaOrderAmt(str, str2);
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
        if (!(obj instanceof DcaOrderAmt)) {
            return false;
        }
        DcaOrderAmt dcaOrderAmt = (DcaOrderAmt) obj;
        return Intrinsics.EZpvd((Object) this.initOrderAmt, (Object) dcaOrderAmt.initOrderAmt) && Intrinsics.EZpvd((Object) this.safetyOrderAmt, (Object) dcaOrderAmt.safetyOrderAmt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInitOrderAmt() {
        return this.initOrderAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSafetyOrderAmt() {
        return this.safetyOrderAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.initOrderAmt.hashCode() * 31) + this.safetyOrderAmt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DcaOrderAmt(initOrderAmt=" + this.initOrderAmt + ", safetyOrderAmt=" + this.safetyOrderAmt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.initOrderAmt);
        parcel.writeString(this.safetyOrderAmt);
    }

    public DcaOrderAmt(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.initOrderAmt = str;
        this.safetyOrderAmt = str2;
    }
}
