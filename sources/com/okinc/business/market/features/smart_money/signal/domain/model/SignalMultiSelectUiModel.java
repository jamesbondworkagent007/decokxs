package com.okinc.business.market.features.smart_money.signal.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.DrawableRes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.kMU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class SignalMultiSelectUiModel implements Parcelable, kMU {
    public static final Parcelable.Creator<SignalMultiSelectUiModel> CREATOR = new Creator();
    public final String AEQbTJ;
    public final boolean EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final Integer copydefault;
    public final String gEmmrt;

    public static final class Creator implements Parcelable.Creator<SignalMultiSelectUiModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalMultiSelectUiModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SignalMultiSelectUiModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalMultiSelectUiModel[] newArray(int i) {
            return new SignalMultiSelectUiModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SignalMultiSelectUiModel copy$default(SignalMultiSelectUiModel signalMultiSelectUiModel, String str, String str2, String str3, Integer num, boolean z, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = signalMultiSelectUiModel.OLrzqt;
        }
        if ((i & 2) != 0) {
            str2 = signalMultiSelectUiModel.KWHzl;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = signalMultiSelectUiModel.AEQbTJ;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            num = signalMultiSelectUiModel.copydefault;
        }
        Integer num2 = num;
        if ((i & 16) != 0) {
            z = signalMultiSelectUiModel.EZpvd;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            str4 = signalMultiSelectUiModel.gEmmrt;
        }
        return signalMultiSelectUiModel.AEQbTJ(str, str5, str6, num2, z2, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalMultiSelectUiModel AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, @DrawableRes Integer num, boolean z, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new SignalMultiSelectUiModel(str, str2, str3, num, z, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.KWHzl;
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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignalMultiSelectUiModel)) {
            return false;
        }
        SignalMultiSelectUiModel signalMultiSelectUiModel = (SignalMultiSelectUiModel) obj;
        return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) signalMultiSelectUiModel.OLrzqt) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) signalMultiSelectUiModel.KWHzl) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) signalMultiSelectUiModel.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, signalMultiSelectUiModel.copydefault) && this.EZpvd == signalMultiSelectUiModel.EZpvd && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) signalMultiSelectUiModel.gEmmrt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        int iHashCode2 = this.KWHzl.hashCode();
        int iHashCode3 = this.AEQbTJ.hashCode();
        Integer num = this.copydefault;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.EZpvd)) * 31) + this.gEmmrt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalMultiSelectUiModel(itemId=" + this.OLrzqt + ", itemName=" + this.KWHzl + ", itemIconUrl=" + this.AEQbTJ + ", drawableRes=" + this.copydefault + ", isSelected=" + this.EZpvd + ", key=" + this.gEmmrt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.AEQbTJ);
        Integer num = this.copydefault;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeInt(this.EZpvd ? 1 : 0);
        parcel.writeString(this.gEmmrt);
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

    public SignalMultiSelectUiModel(@NotNull String str, @NotNull String str2, @NotNull String str3, @DrawableRes Integer num, boolean z, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.OLrzqt = str;
        this.KWHzl = str2;
        this.AEQbTJ = str3;
        this.copydefault = num;
        this.EZpvd = z;
        this.gEmmrt = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (r10v0 java.lang.String)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r11v0 java.lang.Integer))
  (r12v0 boolean)
  (r13v0 java.lang.String)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, boolean, java.lang.String):void (m)] (LINE:9) call: com.okinc.business.market.features.smart_money.signal.domain.model.SignalMultiSelectUiModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ SignalMultiSelectUiModel(String str, String str2, String str3, Integer num, boolean z, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : num, z, str4);
    }
}
