package com.okinc.business.market.features.meme.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.ColorInt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeProtocolUiData implements Parcelable {
    public static final Parcelable.Creator<MemeProtocolUiData> CREATOR = new Creator();
    public final String AEQbTJ;
    public final Integer EZpvd;
    public final Integer KWHzl;
    public final Integer OLrzqt;
    public final Integer copydefault;
    public final String valueOf;

    public static final class Creator implements Parcelable.Creator<MemeProtocolUiData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MemeProtocolUiData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MemeProtocolUiData(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MemeProtocolUiData[] newArray(int i) {
            return new MemeProtocolUiData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MemeProtocolUiData() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MemeProtocolUiData copy$default(MemeProtocolUiData memeProtocolUiData, String str, Integer num, Integer num2, String str2, Integer num3, Integer num4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = memeProtocolUiData.AEQbTJ;
        }
        if ((i & 2) != 0) {
            num = memeProtocolUiData.copydefault;
        }
        Integer num5 = num;
        if ((i & 4) != 0) {
            num2 = memeProtocolUiData.OLrzqt;
        }
        Integer num6 = num2;
        if ((i & 8) != 0) {
            str2 = memeProtocolUiData.valueOf;
        }
        String str3 = str2;
        if ((i & 16) != 0) {
            num3 = memeProtocolUiData.EZpvd;
        }
        Integer num7 = num3;
        if ((i & 32) != 0) {
            num4 = memeProtocolUiData.KWHzl;
        }
        return memeProtocolUiData.KWHzl(str, num5, num6, str3, num7, num4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeProtocolUiData KWHzl(@NotNull String str, @ColorInt Integer num, @ColorInt Integer num2, @NotNull String str2, @ColorInt Integer num3, @ColorInt Integer num4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new MemeProtocolUiData(str, num, num2, str2, num3, num4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
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
        if (!(obj instanceof MemeProtocolUiData)) {
            return false;
        }
        MemeProtocolUiData memeProtocolUiData = (MemeProtocolUiData) obj;
        return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) memeProtocolUiData.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, memeProtocolUiData.copydefault) && Intrinsics.EZpvd(this.OLrzqt, memeProtocolUiData.OLrzqt) && Intrinsics.EZpvd((Object) this.valueOf, (Object) memeProtocolUiData.valueOf) && Intrinsics.EZpvd(this.EZpvd, memeProtocolUiData.EZpvd) && Intrinsics.EZpvd(this.KWHzl, memeProtocolUiData.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        Integer num = this.copydefault;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        Integer num2 = this.OLrzqt;
        int iHashCode3 = num2 == null ? 0 : num2.hashCode();
        int iHashCode4 = this.valueOf.hashCode();
        Integer num3 = this.EZpvd;
        int iHashCode5 = num3 == null ? 0 : num3.hashCode();
        Integer num4 = this.KWHzl;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (num4 != null ? num4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MemeProtocolUiData(tokenProtocolIconUrl=" + this.AEQbTJ + ", protocolGradientStart=" + this.copydefault + ", protocolGradientEnd=" + this.OLrzqt + ", tokenProtocolMigratingIconUrl=" + this.valueOf + ", protocolMigratingGradientStart=" + this.EZpvd + ", protocolMigratingGradientEnd=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AEQbTJ);
        Integer num = this.copydefault;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.OLrzqt;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.valueOf);
        Integer num3 = this.EZpvd;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Integer num4 = this.KWHzl;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
    }

    public MemeProtocolUiData(@NotNull String str, @ColorInt Integer num, @ColorInt Integer num2, @NotNull String str2, @ColorInt Integer num3, @ColorInt Integer num4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AEQbTJ = str;
        this.copydefault = num;
        this.OLrzqt = num2;
        this.valueOf = str2;
        this.EZpvd = num3;
        this.KWHzl = num4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r7v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0011: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r8v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r12v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r9v0 java.lang.String) : (""))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001e: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r10v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0025: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r11v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer):void (m)] (LINE:80) call: com.okinc.business.market.features.meme.domain.model.MemeProtocolUiData.<init>(java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer):void type: THIS */
    public /* synthetic */ MemeProtocolUiData(String str, Integer num, Integer num2, String str2, Integer num3, Integer num4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) == 0 ? str2 : "", (i & 16) != 0 ? null : num3, (i & 32) != 0 ? null : num4);
    }
}
