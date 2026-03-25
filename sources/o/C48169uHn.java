package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uHn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C48169uHn implements InterfaceC48173uHr {
    public final java.lang.String AEQbTJ;
    public final java.lang.String AYXKKw;
    public final boolean AhwBna;
    public final java.lang.String AkhnZx;
    public final boolean DbNXlk;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String djBIcL;
    public final boolean gEmmrt;
    public final java.lang.String valueOf;
    public final java.lang.String values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48173uHr
    public java.lang.String AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48173uHr
    public java.lang.String AkhnZx() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48173uHr
    public boolean AuCTel() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48173uHr
    public java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48173uHr
    public java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C48169uHn KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, java.lang.String str6, java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.lang.String str9, @NotNull java.lang.String str10, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        return new C48169uHn(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, z, z2, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48173uHr
    public java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48173uHr
    public java.lang.String djBIcL() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48169uHn)) {
            return false;
        }
        C48169uHn c48169uHn = (C48169uHn) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c48169uHn.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c48169uHn.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c48169uHn.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c48169uHn.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c48169uHn.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c48169uHn.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c48169uHn.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) c48169uHn.values) && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) c48169uHn.AkhnZx) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c48169uHn.djBIcL) && this.gEmmrt == c48169uHn.gEmmrt && this.DbNXlk == c48169uHn.DbNXlk && this.AhwBna == c48169uHn.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48173uHr
    public boolean fARcdN() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48173uHr
    public boolean fIwbmz() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48173uHr
    public java.lang.String gEmmrt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        int iHashCode2 = this.copydefault.hashCode();
        int iHashCode3 = this.EZpvd.hashCode();
        int iHashCode4 = this.AEQbTJ.hashCode();
        int iHashCode5 = this.AYXKKw.hashCode();
        java.lang.String str = this.OLrzqt;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.valueOf;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.values.hashCode()) * 31) + this.AkhnZx.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + java.lang.Boolean.hashCode(this.gEmmrt)) * 31) + java.lang.Boolean.hashCode(this.DbNXlk)) * 31) + java.lang.Boolean.hashCode(this.AhwBna);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48173uHr
    public java.lang.String iwGUEr() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "BaseBotDetailParamUiModel(botName=" + this.KWHzl + ", instId=" + this.copydefault + ", instType=" + this.EZpvd + ", botType=" + this.AEQbTJ + ", lastPrice=" + this.AYXKKw + ", direction=" + this.OLrzqt + ", leverage=" + this.valueOf + ", traderAvatar=" + this.values + ", traderName=" + this.AkhnZx + ", investmentUnit=" + this.djBIcL + ", shouldShowCopyFromLayout=" + this.gEmmrt + ", shouldShowModifyButton=" + this.DbNXlk + ", shouldShowCurrentPrice=" + this.AhwBna + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48173uHr
    public java.lang.String uzCIH() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48173uHr
    public java.lang.String valueOf() {
        return this.AYXKKw;
    }

    public C48169uHn(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, java.lang.String str6, java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.lang.String str9, @NotNull java.lang.String str10, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        this.KWHzl = str;
        this.copydefault = str2;
        this.EZpvd = str3;
        this.AEQbTJ = str4;
        this.AYXKKw = str5;
        this.OLrzqt = str6;
        this.valueOf = str7;
        this.values = str8;
        this.AkhnZx = str9;
        this.djBIcL = str10;
        this.gEmmrt = z;
        this.DbNXlk = z2;
        this.AhwBna = z3;
    }
}
