package com.okinc.okex.uploadlog.view.displaymodels;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class FormElementDisplayModel implements Parcelable {
    public static final Parcelable.Creator<FormElementDisplayModel> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String AYXKKw;
    public final String EZpvd;
    public final ExtraFormData KWHzl;
    public final String OLrzqt;
    public final boolean copydefault;
    public final FormElementViewType gEmmrt;

    public static final class Creator implements Parcelable.Creator<FormElementDisplayModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FormElementDisplayModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new FormElementDisplayModel(parcel.readString(), FormElementViewType.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), (ExtraFormData) parcel.readParcelable(FormElementDisplayModel.class.getClassLoader()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FormElementDisplayModel[] newArray(int i) {
            return new FormElementDisplayModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FormElementDisplayModel copy$default(FormElementDisplayModel formElementDisplayModel, String str, FormElementViewType formElementViewType, boolean z, String str2, String str3, String str4, ExtraFormData extraFormData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = formElementDisplayModel.EZpvd;
        }
        if ((i & 2) != 0) {
            formElementViewType = formElementDisplayModel.gEmmrt;
        }
        FormElementViewType formElementViewType2 = formElementViewType;
        if ((i & 4) != 0) {
            z = formElementDisplayModel.copydefault;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            str2 = formElementDisplayModel.OLrzqt;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            str3 = formElementDisplayModel.AYXKKw;
        }
        String str6 = str3;
        if ((i & 32) != 0) {
            str4 = formElementDisplayModel.AEQbTJ;
        }
        String str7 = str4;
        if ((i & 64) != 0) {
            extraFormData = formElementDisplayModel.KWHzl;
        }
        return formElementDisplayModel.OLrzqt(str, formElementViewType2, z2, str5, str6, str7, extraFormData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExtraFormData AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FormElementDisplayModel OLrzqt(@NotNull String str, @NotNull FormElementViewType formElementViewType, boolean z, @NotNull String str2, @NotNull String str3, @NotNull String str4, ExtraFormData extraFormData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(formElementViewType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new FormElementDisplayModel(str, formElementViewType, z, str2, str3, str4, extraFormData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.OLrzqt;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FormElementViewType djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormElementDisplayModel)) {
            return false;
        }
        FormElementDisplayModel formElementDisplayModel = (FormElementDisplayModel) obj;
        return Intrinsics.EZpvd((Object) this.EZpvd, (Object) formElementDisplayModel.EZpvd) && this.gEmmrt == formElementDisplayModel.gEmmrt && this.copydefault == formElementDisplayModel.copydefault && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) formElementDisplayModel.OLrzqt) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) formElementDisplayModel.AYXKKw) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) formElementDisplayModel.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, formElementDisplayModel.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        int iHashCode2 = this.gEmmrt.hashCode();
        int iHashCode3 = Boolean.hashCode(this.copydefault);
        int iHashCode4 = this.OLrzqt.hashCode();
        int iHashCode5 = this.AYXKKw.hashCode();
        int iHashCode6 = this.AEQbTJ.hashCode();
        ExtraFormData extraFormData = this.KWHzl;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (extraFormData == null ? 0 : extraFormData.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FormElementDisplayModel(id=" + this.EZpvd + ", viewType=" + this.gEmmrt + ", isRequired=" + this.copydefault + ", displayName=" + this.OLrzqt + ", placeholder=" + this.AYXKKw + ", defaultValue=" + this.AEQbTJ + ", extra=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.gEmmrt.name());
        parcel.writeInt(this.copydefault ? 1 : 0);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.AYXKKw);
        parcel.writeString(this.AEQbTJ);
        parcel.writeParcelable(this.KWHzl, i);
    }

    public FormElementDisplayModel(@NotNull String str, @NotNull FormElementViewType formElementViewType, boolean z, @NotNull String str2, @NotNull String str3, @NotNull String str4, ExtraFormData extraFormData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(formElementViewType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.EZpvd = str;
        this.gEmmrt = formElementViewType;
        this.copydefault = z;
        this.OLrzqt = str2;
        this.AYXKKw = str3;
        this.AEQbTJ = str4;
        this.KWHzl = extraFormData;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002b: CONSTRUCTOR 
  (r10v0 java.lang.String)
  (r11v0 com.okinc.okex.uploadlog.view.displaymodels.FormElementViewType)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r12v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r17v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r17v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r17v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:com.okinc.okex.uploadlog.view.displaymodels.ExtraFormData:?: TERNARY null = ((wrap:int:0x001f: ARITH (r17v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.uploadlog.view.displaymodels.ExtraFormData) : (r16v0 com.okinc.okex.uploadlog.view.displaymodels.ExtraFormData))
 A[MD:(java.lang.String, com.okinc.okex.uploadlog.view.displaymodels.FormElementViewType, boolean, java.lang.String, java.lang.String, java.lang.String, com.okinc.okex.uploadlog.view.displaymodels.ExtraFormData):void (m)] (LINE:9) call: com.okinc.okex.uploadlog.view.displaymodels.FormElementDisplayModel.<init>(java.lang.String, com.okinc.okex.uploadlog.view.displaymodels.FormElementViewType, boolean, java.lang.String, java.lang.String, java.lang.String, com.okinc.okex.uploadlog.view.displaymodels.ExtraFormData):void type: THIS */
    public /* synthetic */ FormElementDisplayModel(String str, FormElementViewType formElementViewType, boolean z, String str2, String str3, String str4, ExtraFormData extraFormData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, formElementViewType, (i & 4) != 0 ? false : z, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? null : extraFormData);
    }
}
