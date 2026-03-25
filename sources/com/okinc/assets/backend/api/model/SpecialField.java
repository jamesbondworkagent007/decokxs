package com.okinc.assets.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class SpecialField implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SpecialField> CREATOR = new Creator();
    private String field;
    private String fieldStr;
    private boolean required;

    public static final class Creator implements Parcelable.Creator<SpecialField> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpecialField createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SpecialField(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpecialField[] newArray(int i) {
            return new SpecialField[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SpecialField() {
        this(null, null, false, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SpecialField copy$default(SpecialField specialField, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = specialField.field;
        }
        if ((i & 2) != 0) {
            str2 = specialField.fieldStr;
        }
        if ((i & 4) != 0) {
            z = specialField.required;
        }
        return specialField.copy(str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.field;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fieldStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpecialField copy(String str, String str2, boolean z) {
        return new SpecialField(str, str2, z);
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
        if (!(obj instanceof SpecialField)) {
            return false;
        }
        SpecialField specialField = (SpecialField) obj;
        return Intrinsics.EZpvd((Object) this.field, (Object) specialField.field) && Intrinsics.EZpvd((Object) this.fieldStr, (Object) specialField.fieldStr) && this.required == specialField.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getField() {
        return this.field;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFieldStr() {
        return this.fieldStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getRequired() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.field;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.fieldStr;
        return (((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.required);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setField(String str) {
        this.field = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFieldStr(String str) {
        this.fieldStr = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRequired(boolean z) {
        this.required = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SpecialField(field=" + this.field + ", fieldStr=" + this.fieldStr + ", required=" + this.required + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.field);
        parcel.writeString(this.fieldStr);
        parcel.writeInt(this.required ? 1 : 0);
    }

    public SpecialField(String str, String str2, boolean z) {
        this.field = str;
        this.fieldStr = str2;
        this.required = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(java.lang.String, java.lang.String, boolean):void (m)] (LINE:9) call: com.okinc.assets.backend.api.model.SpecialField.<init>(java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ SpecialField(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z);
    }
}
