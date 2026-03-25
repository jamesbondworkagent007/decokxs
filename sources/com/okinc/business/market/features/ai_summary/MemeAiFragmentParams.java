package com.okinc.business.market.features.ai_summary;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class MemeAiFragmentParams implements Parcelable {
    public static final Parcelable.Creator<MemeAiFragmentParams> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String AYXKKw;
    public final String EZpvd;
    public final String KWHzl;
    public final boolean OLrzqt;
    public final String copydefault;

    public static final class Creator implements Parcelable.Creator<MemeAiFragmentParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MemeAiFragmentParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MemeAiFragmentParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MemeAiFragmentParams[] newArray(int i) {
            return new MemeAiFragmentParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MemeAiFragmentParams() {
        this(null, null, null, false, null, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MemeAiFragmentParams copy$default(MemeAiFragmentParams memeAiFragmentParams, String str, String str2, String str3, boolean z, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = memeAiFragmentParams.EZpvd;
        }
        if ((i & 2) != 0) {
            str2 = memeAiFragmentParams.AYXKKw;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = memeAiFragmentParams.copydefault;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            z = memeAiFragmentParams.OLrzqt;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            str4 = memeAiFragmentParams.AEQbTJ;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            str5 = memeAiFragmentParams.KWHzl;
        }
        return memeAiFragmentParams.AEQbTJ(str, str6, str7, z2, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeAiFragmentParams AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, @NotNull String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new MemeAiFragmentParams(str, str2, str3, z, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
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
        if (!(obj instanceof MemeAiFragmentParams)) {
            return false;
        }
        MemeAiFragmentParams memeAiFragmentParams = (MemeAiFragmentParams) obj;
        return Intrinsics.EZpvd((Object) this.EZpvd, (Object) memeAiFragmentParams.EZpvd) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) memeAiFragmentParams.AYXKKw) && Intrinsics.EZpvd((Object) this.copydefault, (Object) memeAiFragmentParams.copydefault) && this.OLrzqt == memeAiFragmentParams.OLrzqt && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) memeAiFragmentParams.AEQbTJ) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) memeAiFragmentParams.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        int iHashCode2 = this.AYXKKw.hashCode();
        int iHashCode3 = this.copydefault.hashCode();
        int iHashCode4 = Boolean.hashCode(this.OLrzqt);
        int iHashCode5 = this.AEQbTJ.hashCode();
        String str = this.KWHzl;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MemeAiFragmentParams(chainId=" + this.EZpvd + ", tokenSymbol=" + this.AYXKKw + ", tokenContractAddress=" + this.copydefault + ", isFromTokenDetailOverview=" + this.OLrzqt + ", tokenCreateTime=" + this.AEQbTJ + ", tokenDescription=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.AYXKKw);
        parcel.writeString(this.copydefault);
        parcel.writeInt(this.OLrzqt ? 1 : 0);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.KWHzl);
    }

    public MemeAiFragmentParams(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, @NotNull String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.EZpvd = str;
        this.AYXKKw = str2;
        this.copydefault = str3;
        this.OLrzqt = z;
        this.AEQbTJ = str4;
        this.KWHzl = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002f: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:boolean:0x001c: TERNARY null = ((wrap:int:0x0017: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r8v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r11v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r9v0 java.lang.String) : (""))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String):void (m)] (LINE:42) call: com.okinc.business.market.features.ai_summary.MemeAiFragmentParams.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ MemeAiFragmentParams(String str, String str2, String str3, boolean z, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? false : z, (i & 16) == 0 ? str4 : "", (i & 32) != 0 ? null : str5);
    }
}
