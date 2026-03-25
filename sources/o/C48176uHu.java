package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uHu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C48176uHu implements InterfaceC48173uHr {
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final InterfaceC48173uHr copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C48176uHu copy$default(C48176uHu c48176uHu, InterfaceC48173uHr interfaceC48173uHr, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC48173uHr = c48176uHu.copydefault;
        }
        if ((i & 2) != 0) {
            str = c48176uHu.EZpvd;
        }
        if ((i & 4) != 0) {
            str2 = c48176uHu.KWHzl;
        }
        if ((i & 8) != 0) {
            str3 = c48176uHu.AEQbTJ;
        }
        return c48176uHu.copydefault(interfaceC48173uHr, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48173uHr
    public java.lang.String AhwBna() {
        return this.copydefault.AhwBna();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48173uHr
    public java.lang.String AkhnZx() {
        return this.copydefault.AkhnZx();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48173uHr
    public boolean AuCTel() {
        return this.copydefault.AuCTel();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48173uHr
    public java.lang.String EZpvd() {
        return this.copydefault.EZpvd();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48173uHr
    public java.lang.String KWHzl() {
        return this.copydefault.KWHzl();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48173uHr
    public java.lang.String OLrzqt() {
        return this.copydefault.OLrzqt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C48176uHu copydefault(@NotNull InterfaceC48173uHr interfaceC48173uHr, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(interfaceC48173uHr, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C48176uHu(interfaceC48173uHr, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48173uHr
    public java.lang.String djBIcL() {
        return this.copydefault.djBIcL();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48176uHu)) {
            return false;
        }
        C48176uHu c48176uHu = (C48176uHu) obj;
        return Intrinsics.EZpvd(this.copydefault, c48176uHu.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c48176uHu.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c48176uHu.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c48176uHu.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48173uHr
    public boolean fARcdN() {
        return this.copydefault.fARcdN();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48173uHr
    public boolean fIwbmz() {
        return this.copydefault.fIwbmz();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48173uHr
    public java.lang.String gEmmrt() {
        return this.copydefault.gEmmrt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        int iHashCode2 = this.EZpvd.hashCode();
        int iHashCode3 = this.KWHzl.hashCode();
        java.lang.String str = this.AEQbTJ;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48173uHr
    public java.lang.String iwGUEr() {
        return this.copydefault.iwGUEr();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CopyBotDetailParamUiModel(common=" + this.copydefault + ", shareProfitCalc=" + this.EZpvd + ", profitSharingRatio=" + this.KWHzl + ", trackingMode=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48173uHr
    public java.lang.String uzCIH() {
        return this.copydefault.uzCIH();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48173uHr
    public java.lang.String valueOf() {
        return this.copydefault.valueOf();
    }

    public C48176uHu(@NotNull InterfaceC48173uHr interfaceC48173uHr, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(interfaceC48173uHr, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.copydefault = interfaceC48173uHr;
        this.EZpvd = str;
        this.KWHzl = str2;
        this.AEQbTJ = str3;
    }
}
