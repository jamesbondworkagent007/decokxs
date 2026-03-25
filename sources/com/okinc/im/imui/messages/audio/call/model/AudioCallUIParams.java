package com.okinc.im.imui.messages.audio.call.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class AudioCallUIParams implements Parcelable {
    public static final Parcelable.Creator<AudioCallUIParams> CREATOR = new Creator();
    public final boolean AEQbTJ;
    public final String EZpvd;
    public final String KWHzl;
    public final boolean OLrzqt;
    public final boolean copydefault;
    public final boolean djBIcL;
    public final boolean gEmmrt;
    public final boolean valueOf;

    public static final class Creator implements Parcelable.Creator<AudioCallUIParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AudioCallUIParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AudioCallUIParams(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AudioCallUIParams[] newArray(int i) {
            return new AudioCallUIParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AudioCallUIParams() {
        this(false, false, false, null, null, false, false, false, 255, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AudioCallUIParams AEQbTJ(boolean z, boolean z2, boolean z3, String str, String str2, boolean z4, boolean z5, boolean z6) {
        return new AudioCallUIParams(z, z2, z3, str, str2, z4, z5, z6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.copydefault;
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
        if (!(obj instanceof AudioCallUIParams)) {
            return false;
        }
        AudioCallUIParams audioCallUIParams = (AudioCallUIParams) obj;
        return this.djBIcL == audioCallUIParams.djBIcL && this.gEmmrt == audioCallUIParams.gEmmrt && this.OLrzqt == audioCallUIParams.OLrzqt && Intrinsics.EZpvd((Object) this.EZpvd, (Object) audioCallUIParams.EZpvd) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) audioCallUIParams.KWHzl) && this.valueOf == audioCallUIParams.valueOf && this.AEQbTJ == audioCallUIParams.AEQbTJ && this.copydefault == audioCallUIParams.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.djBIcL);
        int iHashCode2 = Boolean.hashCode(this.gEmmrt);
        int iHashCode3 = Boolean.hashCode(this.OLrzqt);
        String str = this.EZpvd;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.KWHzl;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.valueOf)) * 31) + Boolean.hashCode(this.AEQbTJ)) * 31) + Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AudioCallUIParams(isMicOn=" + this.djBIcL + ", isSpeakerOn=" + this.gEmmrt + ", isFromAgent=" + this.OLrzqt + ", avatarUrl=" + this.EZpvd + ", callerName=" + this.KWHzl + ", isFromNoticeView=" + this.valueOf + ", isCheckPermissions=" + this.AEQbTJ + ", isFromBackgroundPush=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.djBIcL ? 1 : 0);
        parcel.writeInt(this.gEmmrt ? 1 : 0);
        parcel.writeInt(this.OLrzqt ? 1 : 0);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.KWHzl);
        parcel.writeInt(this.valueOf ? 1 : 0);
        parcel.writeInt(this.AEQbTJ ? 1 : 0);
        parcel.writeInt(this.copydefault ? 1 : 0);
    }

    public AudioCallUIParams(boolean z, boolean z2, boolean z3, String str, String str2, boolean z4, boolean z5, boolean z6) {
        this.djBIcL = z;
        this.gEmmrt = z2;
        this.OLrzqt = z3;
        this.EZpvd = str;
        this.KWHzl = str2;
        this.valueOf = z4;
        this.AEQbTJ = z5;
        this.copydefault = z6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0048: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : (r10v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0009: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0011: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r12v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r18v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r14v0 java.lang.String) : (null java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0026: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r15v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002d: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r16v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0035: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 boolean) : false)
 A[MD:(boolean, boolean, boolean, java.lang.String, java.lang.String, boolean, boolean, boolean):void (m)] (LINE:10) call: com.okinc.im.imui.messages.audio.call.model.AudioCallUIParams.<init>(boolean, boolean, boolean, java.lang.String, java.lang.String, boolean, boolean, boolean):void type: THIS */
    public /* synthetic */ AudioCallUIParams(boolean z, boolean z2, boolean z3, String str, String str2, boolean z4, boolean z5, boolean z6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? null : str, (i & 16) == 0 ? str2 : null, (i & 32) != 0 ? false : z4, (i & 64) != 0 ? false : z5, (i & 128) == 0 ? z6 : false);
    }
}
