package com.okinc.assets.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class WithdrawTarget implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<WithdrawTarget> CREATOR = new Creator();
    private String img;
    private String name;
    private boolean needTag;
    private SpecialField specialField;
    private int targetType;

    public static final class Creator implements Parcelable.Creator<WithdrawTarget> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawTarget createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new WithdrawTarget(parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : SpecialField.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawTarget[] newArray(int i) {
            return new WithdrawTarget[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WithdrawTarget() {
        this(null, 0, false, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WithdrawTarget copy$default(WithdrawTarget withdrawTarget, String str, int i, boolean z, String str2, SpecialField specialField, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = withdrawTarget.name;
        }
        if ((i2 & 2) != 0) {
            i = withdrawTarget.targetType;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            z = withdrawTarget.needTag;
        }
        boolean z2 = z;
        if ((i2 & 8) != 0) {
            str2 = withdrawTarget.img;
        }
        String str3 = str2;
        if ((i2 & 16) != 0) {
            specialField = withdrawTarget.specialField;
        }
        return withdrawTarget.copy(str, i3, z2, str3, specialField);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.targetType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.needTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.img;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpecialField component5() {
        return this.specialField;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WithdrawTarget copy(String str, int i, boolean z, String str2, SpecialField specialField) {
        return new WithdrawTarget(str, i, z, str2, specialField);
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
        if (!(obj instanceof WithdrawTarget)) {
            return false;
        }
        WithdrawTarget withdrawTarget = (WithdrawTarget) obj;
        return Intrinsics.EZpvd((Object) this.name, (Object) withdrawTarget.name) && this.targetType == withdrawTarget.targetType && this.needTag == withdrawTarget.needTag && Intrinsics.EZpvd((Object) this.img, (Object) withdrawTarget.img) && Intrinsics.EZpvd(this.specialField, withdrawTarget.specialField);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImg() {
        return this.img;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNeedTag() {
        return this.needTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpecialField getSpecialField() {
        return this.specialField;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTargetType() {
        return this.targetType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.name;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = Integer.hashCode(this.targetType);
        int iHashCode3 = Boolean.hashCode(this.needTag);
        String str2 = this.img;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        SpecialField specialField = this.specialField;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (specialField != null ? specialField.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImg(String str) {
        this.img = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setName(String str) {
        this.name = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNeedTag(boolean z) {
        this.needTag = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSpecialField(SpecialField specialField) {
        this.specialField = specialField;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTargetType(int i) {
        this.targetType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WithdrawTarget(name=" + this.name + ", targetType=" + this.targetType + ", needTag=" + this.needTag + ", img=" + this.img + ", specialField=" + this.specialField + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.name);
        parcel.writeInt(this.targetType);
        parcel.writeInt(this.needTag ? 1 : 0);
        parcel.writeString(this.img);
        SpecialField specialField = this.specialField;
        if (specialField == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            specialField.writeToParcel(parcel, i);
        }
    }

    public WithdrawTarget(String str, int i, boolean z, String str2, SpecialField specialField) {
        this.name = str;
        this.targetType = i;
        this.needTag = z;
        this.img = str2;
        this.specialField = specialField;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r6v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0010: ARITH (r10v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r7v0 boolean) : false)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:com.okinc.assets.backend.api.model.SpecialField:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.assets.backend.api.model.SpecialField) : (r9v0 com.okinc.assets.backend.api.model.SpecialField))
 A[MD:(java.lang.String, int, boolean, java.lang.String, com.okinc.assets.backend.api.model.SpecialField):void (m)] (LINE:17) call: com.okinc.assets.backend.api.model.WithdrawTarget.<init>(java.lang.String, int, boolean, java.lang.String, com.okinc.assets.backend.api.model.SpecialField):void type: THIS */
    public /* synthetic */ WithdrawTarget(String str, int i, boolean z, String str2, SpecialField specialField, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) == 0 ? z : false, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : specialField);
    }
}
