package com.okinc.business.market.features.group.domain;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.kMU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class CommonGroupUiModel implements kMU, Parcelable {
    public static final Parcelable.Creator<CommonGroupUiModel> CREATOR = new Creator();
    public final boolean AEQbTJ;
    public final int AYXKKw;
    public final int AhwBna;
    public final int EZpvd;
    public final boolean KWHzl;
    public final int OLrzqt;
    public final String copydefault;

    public static final class Creator implements Parcelable.Creator<CommonGroupUiModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CommonGroupUiModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CommonGroupUiModel(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CommonGroupUiModel[] newArray(int i) {
            return new CommonGroupUiModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CommonGroupUiModel() {
        this(0, null, 0, 0, 0, false, false, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CommonGroupUiModel copy$default(CommonGroupUiModel commonGroupUiModel, int i, String str, int i2, int i3, int i4, boolean z, boolean z2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = commonGroupUiModel.OLrzqt;
        }
        if ((i5 & 2) != 0) {
            str = commonGroupUiModel.copydefault;
        }
        String str2 = str;
        if ((i5 & 4) != 0) {
            i2 = commonGroupUiModel.AYXKKw;
        }
        int i6 = i2;
        if ((i5 & 8) != 0) {
            i3 = commonGroupUiModel.AhwBna;
        }
        int i7 = i3;
        if ((i5 & 16) != 0) {
            i4 = commonGroupUiModel.EZpvd;
        }
        int i8 = i4;
        if ((i5 & 32) != 0) {
            z = commonGroupUiModel.AEQbTJ;
        }
        boolean z3 = z;
        if ((i5 & 64) != 0) {
            z2 = commonGroupUiModel.KWHzl;
        }
        return commonGroupUiModel.copydefault(i, str2, i6, i7, i8, z3, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommonGroupUiModel copydefault(int i, @NotNull String str, int i2, int i3, int i4, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new CommonGroupUiModel(i, str, i2, i3, i4, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
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
        if (!(obj instanceof CommonGroupUiModel)) {
            return false;
        }
        CommonGroupUiModel commonGroupUiModel = (CommonGroupUiModel) obj;
        return this.OLrzqt == commonGroupUiModel.OLrzqt && Intrinsics.EZpvd((Object) this.copydefault, (Object) commonGroupUiModel.copydefault) && this.AYXKKw == commonGroupUiModel.AYXKKw && this.AhwBna == commonGroupUiModel.AhwBna && this.EZpvd == commonGroupUiModel.EZpvd && this.AEQbTJ == commonGroupUiModel.AEQbTJ && this.KWHzl == commonGroupUiModel.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((Integer.hashCode(this.OLrzqt) * 31) + this.copydefault.hashCode()) * 31) + Integer.hashCode(this.AYXKKw)) * 31) + Integer.hashCode(this.AhwBna)) * 31) + Integer.hashCode(this.EZpvd)) * 31) + Boolean.hashCode(this.AEQbTJ)) * 31) + Boolean.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CommonGroupUiModel(id=" + this.OLrzqt + ", name=" + this.copydefault + ", size=" + this.AYXKKw + ", order=" + this.AhwBna + ", icon=" + this.EZpvd + ", isSelected=" + this.AEQbTJ + ", isSortable=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.OLrzqt);
        parcel.writeString(this.copydefault);
        parcel.writeInt(this.AYXKKw);
        parcel.writeInt(this.AhwBna);
        parcel.writeInt(this.EZpvd);
        parcel.writeInt(this.AEQbTJ ? 1 : 0);
        parcel.writeInt(this.KWHzl ? 1 : 0);
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

    public CommonGroupUiModel(int i, @NotNull String str, int i2, int i3, int i4, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = i;
        this.copydefault = str;
        this.AYXKKw = i2;
        this.AhwBna = i3;
        this.EZpvd = i4;
        this.AEQbTJ = z;
        this.KWHzl = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0036: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r6v0 int))
  (wrap:java.lang.String:0x000b: TERNARY null = ((wrap:int:0x0005: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000c: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r8v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0014: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r9v0 int))
  (wrap:int:0x0021: TERNARY null = ((wrap:int:0x001b: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x001f: SGET  A[WRAPPED] o.wXj.TaskDescription.zMXLsR int) : (r10v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0022: ARITH (r13v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r11v0 boolean) : false)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0028: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? true : (r12v0 boolean))
 A[MD:(int, java.lang.String, int, int, int, boolean, boolean):void (m)] (LINE:27) call: com.okinc.business.market.features.group.domain.CommonGroupUiModel.<init>(int, java.lang.String, int, int, int, boolean, boolean):void type: THIS */
    public /* synthetic */ CommonGroupUiModel(int i, String str, int i2, int i3, int i4, boolean z, boolean z2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? -1 : i, (i5 & 2) != 0 ? "" : str, (i5 & 4) != 0 ? 0 : i2, (i5 & 8) != 0 ? 0 : i3, (i5 & 16) != 0 ? C52761wXj.TaskDescription.zMXLsR : i4, (i5 & 32) == 0 ? z : false, (i5 & 64) != 0 ? true : z2);
    }
}
