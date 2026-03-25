package com.okinc.ok_kyc_core_api.amani;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class AmaniUiModel implements Parcelable {
    public static final Parcelable.Creator<AmaniUiModel> CREATOR = new Creator();
    public Throwable EZpvd;
    public String KWHzl;
    public Integer OLrzqt;

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<AmaniUiModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AmaniUiModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AmaniUiModel(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (Throwable) parcel.readSerializable(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AmaniUiModel[] newArray(int i) {
            return new AmaniUiModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AmaniUiModel() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AmaniUiModel copy$default(AmaniUiModel amaniUiModel, Integer num, Throwable th, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = amaniUiModel.OLrzqt;
        }
        if ((i & 2) != 0) {
            th = amaniUiModel.EZpvd;
        }
        if ((i & 4) != 0) {
            str = amaniUiModel.KWHzl;
        }
        return amaniUiModel.AEQbTJ(num, th, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AmaniUiModel AEQbTJ(Integer num, Throwable th, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new AmaniUiModel(num, th, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Throwable KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer copydefault() {
        return this.OLrzqt;
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
        if (!(obj instanceof AmaniUiModel)) {
            return false;
        }
        AmaniUiModel amaniUiModel = (AmaniUiModel) obj;
        return Intrinsics.EZpvd(this.OLrzqt, amaniUiModel.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, amaniUiModel.EZpvd) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) amaniUiModel.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.OLrzqt;
        int iHashCode = num == null ? 0 : num.hashCode();
        Throwable th = this.EZpvd;
        return (((iHashCode * 31) + (th != null ? th.hashCode() : 0)) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AmaniUiModel(httpErrorCode=" + this.OLrzqt + ", generalException=" + this.EZpvd + ", profileStatus=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.OLrzqt;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeSerializable(this.EZpvd);
        parcel.writeString(this.KWHzl);
    }

    public AmaniUiModel(Integer num, Throwable th, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = num;
        this.EZpvd = th;
        this.KWHzl = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r2v0 java.lang.Integer))
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r3v0 java.lang.Throwable))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("INCOMPLETE") : (r4v0 java.lang.String))
 A[MD:(java.lang.Integer, java.lang.Throwable, java.lang.String):void (m)] (LINE:7) call: com.okinc.ok_kyc_core_api.amani.AmaniUiModel.<init>(java.lang.Integer, java.lang.Throwable, java.lang.String):void type: THIS */
    public /* synthetic */ AmaniUiModel(Integer num, Throwable th, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : th, (i & 4) != 0 ? "INCOMPLETE" : str);
    }
}
