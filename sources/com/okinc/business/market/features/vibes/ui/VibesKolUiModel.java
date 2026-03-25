package com.okinc.business.market.features.vibes.ui;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.kMU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class VibesKolUiModel implements Parcelable, kMU {
    public static final Parcelable.Creator<VibesKolUiModel> CREATOR = new Creator();
    public final String AEQbTJ;
    public final boolean AYXKKw;
    public final String AhwBna;
    public final String AkhnZx;
    public final String EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final String copydefault;
    public final String djBIcL;
    public final String gEmmrt;
    public final String valueOf;

    public static final class Creator implements Parcelable.Creator<VibesKolUiModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VibesKolUiModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new VibesKolUiModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VibesKolUiModel[] newArray(int i) {
            return new VibesKolUiModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VibesKolUiModel AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        return new VibesKolUiModel(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.EZpvd;
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
        if (!(obj instanceof VibesKolUiModel)) {
            return false;
        }
        VibesKolUiModel vibesKolUiModel = (VibesKolUiModel) obj;
        return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) vibesKolUiModel.AEQbTJ) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) vibesKolUiModel.AhwBna) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) vibesKolUiModel.djBIcL) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) vibesKolUiModel.gEmmrt) && Intrinsics.EZpvd((Object) this.valueOf, (Object) vibesKolUiModel.valueOf) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) vibesKolUiModel.KWHzl) && Intrinsics.EZpvd((Object) this.copydefault, (Object) vibesKolUiModel.copydefault) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) vibesKolUiModel.OLrzqt) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) vibesKolUiModel.EZpvd) && Intrinsics.EZpvd((Object) this.AkhnZx, (Object) vibesKolUiModel.AkhnZx) && this.AYXKKw == vibesKolUiModel.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((this.AEQbTJ.hashCode() * 31) + this.AhwBna.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.AkhnZx.hashCode()) * 31) + Boolean.hashCode(this.AYXKKw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "VibesKolUiModel(authorId=" + this.AEQbTJ + ", kolName=" + this.AhwBna + ", kolHandleId=" + this.djBIcL + ", kolImageUrl=" + this.gEmmrt + ", kolFollowCount=" + this.valueOf + ", dataCount=" + this.KWHzl + ", dataChangeRate=" + this.copydefault + ", firstMention=" + this.OLrzqt + ", firstMentionContentId=" + this.EZpvd + ", mentionPrice=" + this.AkhnZx + ", isShowTime=" + this.AYXKKw + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.AhwBna);
        parcel.writeString(this.djBIcL);
        parcel.writeString(this.gEmmrt);
        parcel.writeString(this.valueOf);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.AkhnZx);
        parcel.writeInt(this.AYXKKw ? 1 : 0);
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

    public VibesKolUiModel(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        this.AEQbTJ = str;
        this.AhwBna = str2;
        this.djBIcL = str3;
        this.gEmmrt = str4;
        this.valueOf = str5;
        this.KWHzl = str6;
        this.copydefault = str7;
        this.OLrzqt = str8;
        this.EZpvd = str9;
        this.AkhnZx = str10;
        this.AYXKKw = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CONSTRUCTOR 
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r25v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? true : (r24v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:11) call: com.okinc.business.market.features.vibes.ui.VibesKolUiModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ VibesKolUiModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, (i & 1024) != 0 ? true : z);
    }
}
