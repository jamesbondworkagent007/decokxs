package com.okinc.okx.paymentapi.service;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class BscDepositBottomSheetParameters implements Parcelable {
    public static final Parcelable.Creator<BscDepositBottomSheetParameters> CREATOR = new Creator();
    public final Function0<Unit> AEQbTJ;
    public final int AhwBna;
    public final boolean EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final boolean copydefault;

    public static final class Creator implements Parcelable.Creator<BscDepositBottomSheetParameters> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BscDepositBottomSheetParameters createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BscDepositBottomSheetParameters(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, (Function0) parcel.readSerializable());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BscDepositBottomSheetParameters[] newArray(int i) {
            return new BscDepositBottomSheetParameters[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.okx.paymentapi.service.BscDepositBottomSheetParameters */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BscDepositBottomSheetParameters copy$default(BscDepositBottomSheetParameters bscDepositBottomSheetParameters, String str, String str2, int i, boolean z, boolean z2, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = bscDepositBottomSheetParameters.KWHzl;
        }
        if ((i2 & 2) != 0) {
            str2 = bscDepositBottomSheetParameters.OLrzqt;
        }
        String str3 = str2;
        if ((i2 & 4) != 0) {
            i = bscDepositBottomSheetParameters.AhwBna;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            z = bscDepositBottomSheetParameters.copydefault;
        }
        boolean z3 = z;
        if ((i2 & 16) != 0) {
            z2 = bscDepositBottomSheetParameters.EZpvd;
        }
        boolean z4 = z2;
        if ((i2 & 32) != 0) {
            function0 = bscDepositBottomSheetParameters.AEQbTJ;
        }
        return bscDepositBottomSheetParameters.AEQbTJ(str, str3, i3, z3, z4, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BscDepositBottomSheetParameters AEQbTJ(@NotNull String str, @NotNull String str2, int i, boolean z, boolean z2, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new BscDepositBottomSheetParameters(str, str2, i, z, z2, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> copydefault() {
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
        if (!(obj instanceof BscDepositBottomSheetParameters)) {
            return false;
        }
        BscDepositBottomSheetParameters bscDepositBottomSheetParameters = (BscDepositBottomSheetParameters) obj;
        return Intrinsics.EZpvd((Object) this.KWHzl, (Object) bscDepositBottomSheetParameters.KWHzl) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) bscDepositBottomSheetParameters.OLrzqt) && this.AhwBna == bscDepositBottomSheetParameters.AhwBna && this.copydefault == bscDepositBottomSheetParameters.copydefault && this.EZpvd == bscDepositBottomSheetParameters.EZpvd && Intrinsics.EZpvd(this.AEQbTJ, bscDepositBottomSheetParameters.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        int iHashCode2 = this.OLrzqt.hashCode();
        int iHashCode3 = Integer.hashCode(this.AhwBna);
        int iHashCode4 = Boolean.hashCode(this.copydefault);
        int iHashCode5 = Boolean.hashCode(this.EZpvd);
        Function0<Unit> function0 = this.AEQbTJ;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (function0 == null ? 0 : function0.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BscDepositBottomSheetParameters(currency=" + this.KWHzl + ", token=" + this.OLrzqt + ", tokenId=" + this.AhwBna + ", isSegregatedAccount=" + this.copydefault + ", isMarginBalanceReminderEnabled=" + this.EZpvd + ", handleMarginBalanceReminder=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.OLrzqt);
        parcel.writeInt(this.AhwBna);
        parcel.writeInt(this.copydefault ? 1 : 0);
        parcel.writeInt(this.EZpvd ? 1 : 0);
        parcel.writeSerializable((Serializable) this.AEQbTJ);
    }

    public BscDepositBottomSheetParameters(@NotNull String str, @NotNull String str2, int i, boolean z, boolean z2, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.KWHzl = str;
        this.OLrzqt = str2;
        this.AhwBna = i;
        this.copydefault = z;
        this.EZpvd = z2;
        this.AEQbTJ = function0;
    }
}
