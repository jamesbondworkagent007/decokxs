package com.okinc.business.market.features.address_tracker_sa.ui.user_management.manage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.StringRes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.kMU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class TrackerAddressGroupUIModel implements kMU, Parcelable {
    public static final Parcelable.Creator<TrackerAddressGroupUIModel> CREATOR = new Creator();
    public boolean AEQbTJ;
    public final int AYXKKw;
    public final int AhwBna;
    public final int EZpvd;
    public final String KWHzl;
    public final boolean OLrzqt;
    public final int copydefault;
    public final int gEmmrt;

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<TrackerAddressGroupUIModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TrackerAddressGroupUIModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TrackerAddressGroupUIModel(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TrackerAddressGroupUIModel[] newArray(int i) {
            return new TrackerAddressGroupUIModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TrackerAddressGroupUIModel() {
        this(0, null, 0, 0, 0, 0, false, false, 255, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrackerAddressGroupUIModel KWHzl(int i, @NotNull String str, @StringRes int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new TrackerAddressGroupUIModel(i, str, i2, i3, i4, i5, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.AEQbTJ = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.gEmmrt;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackerAddressGroupUIModel)) {
            return false;
        }
        TrackerAddressGroupUIModel trackerAddressGroupUIModel = (TrackerAddressGroupUIModel) obj;
        return this.EZpvd == trackerAddressGroupUIModel.EZpvd && Intrinsics.EZpvd((Object) this.KWHzl, (Object) trackerAddressGroupUIModel.KWHzl) && this.gEmmrt == trackerAddressGroupUIModel.gEmmrt && this.AYXKKw == trackerAddressGroupUIModel.AYXKKw && this.AhwBna == trackerAddressGroupUIModel.AhwBna && this.copydefault == trackerAddressGroupUIModel.copydefault && this.AEQbTJ == trackerAddressGroupUIModel.AEQbTJ && this.OLrzqt == trackerAddressGroupUIModel.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.EZpvd) * 31) + this.KWHzl.hashCode()) * 31) + Integer.hashCode(this.gEmmrt)) * 31) + Integer.hashCode(this.AYXKKw)) * 31) + Integer.hashCode(this.AhwBna)) * 31) + Integer.hashCode(this.copydefault)) * 31) + Boolean.hashCode(this.AEQbTJ)) * 31) + Boolean.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TrackerAddressGroupUIModel(id=" + this.EZpvd + ", name=" + this.KWHzl + ", nameResId=" + this.gEmmrt + ", size=" + this.AYXKKw + ", order=" + this.AhwBna + ", icon=" + this.copydefault + ", isSelected=" + this.AEQbTJ + ", isSortable=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int valueOf() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.EZpvd);
        parcel.writeString(this.KWHzl);
        parcel.writeInt(this.gEmmrt);
        parcel.writeInt(this.AYXKKw);
        parcel.writeInt(this.AhwBna);
        parcel.writeInt(this.copydefault);
        parcel.writeInt(this.AEQbTJ ? 1 : 0);
        parcel.writeInt(this.OLrzqt ? 1 : 0);
    }

    @Override // o.kMU
    public boolean compareContent(@NotNull kMU kmu) {
        return kMU.TaskDescription.AEQbTJ(this, kmu);
    }

    @Override // o.kMU
    public boolean compareId(@NotNull kMU kmu) {
        return kMU.TaskDescription.KWHzl(this, kmu);
    }

    @Override // o.kMU
    public Object getChangePayload(@NotNull kMU kmu) {
        return kMU.TaskDescription.EZpvd(this, kmu);
    }

    public TrackerAddressGroupUIModel(int i, @NotNull String str, @StringRes int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = i;
        this.KWHzl = str;
        this.gEmmrt = i2;
        this.AYXKKw = i3;
        this.AhwBna = i4;
        this.copydefault = i5;
        this.AEQbTJ = z;
        this.OLrzqt = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004a: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r10v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0011: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r12v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0019: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r13v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0020: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r14v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0027: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002b: SGET  A[WRAPPED] o.wXj.TaskDescription.openFileOutput int) : (r15v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002f: ARITH (r18v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r16v0 boolean) : false)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0036: ARITH (r18v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? true : (r17v0 boolean))
 A[MD:(int, java.lang.String, int, int, int, int, boolean, boolean):void (m)] (LINE:11) call: com.okinc.business.market.features.address_tracker_sa.ui.user_management.manage.TrackerAddressGroupUIModel.<init>(int, java.lang.String, int, int, int, int, boolean, boolean):void type: THIS */
    public /* synthetic */ TrackerAddressGroupUIModel(int i, String str, int i2, int i3, int i4, int i5, boolean z, boolean z2, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? -1 : i, (i6 & 2) != 0 ? "" : str, (i6 & 4) != 0 ? 0 : i2, (i6 & 8) != 0 ? 0 : i3, (i6 & 16) != 0 ? 0 : i4, (i6 & 32) != 0 ? C52761wXj.TaskDescription.openFileOutput : i5, (i6 & 64) == 0 ? z : false, (i6 & 128) != 0 ? true : z2);
    }
}
