package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.account.Step2Type;

/* JADX INFO: loaded from: classes25.dex */
public final class zUR {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public java.util.List<? extends AbstractC58950zVm> EZpvd;
    public Step2Type KWHzl;
    public AbstractC58950zVm OLrzqt;
    public int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.zUR */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ zUR copy$default(zUR zur, AbstractC58950zVm abstractC58950zVm, java.util.List list, Step2Type step2Type, int i, java.lang.String str, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            abstractC58950zVm = zur.OLrzqt;
        }
        if ((i2 & 2) != 0) {
            list = zur.EZpvd;
        }
        java.util.List list2 = list;
        if ((i2 & 4) != 0) {
            step2Type = zur.KWHzl;
        }
        Step2Type step2Type2 = step2Type;
        if ((i2 & 8) != 0) {
            i = zur.copydefault;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str = zur.AEQbTJ;
        }
        return zur.copydefault(abstractC58950zVm, list2, step2Type2, i3, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.zVm>, java.util.List<o.zVm> */
    public final java.util.List<AbstractC58950zVm> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Step2Type EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC58950zVm OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final zUR copydefault(@NotNull AbstractC58950zVm abstractC58950zVm, @NotNull java.util.List<? extends AbstractC58950zVm> list, @NotNull Step2Type step2Type, int i, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(abstractC58950zVm, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(step2Type, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new zUR(abstractC58950zVm, list, step2Type, i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zUR)) {
            return false;
        }
        zUR zur = (zUR) obj;
        return Intrinsics.EZpvd(this.OLrzqt, zur.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, zur.EZpvd) && this.KWHzl == zur.KWHzl && this.copydefault == zur.copydefault && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) zur.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.OLrzqt.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + java.lang.Integer.hashCode(this.copydefault)) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "OtpInteractorInput(otpType=" + this.OLrzqt + ", allOtpTypes=" + this.EZpvd + ", step2Type=" + this.KWHzl + ", behavior=" + this.copydefault + ", maskedUsername=" + this.AEQbTJ + ")";
    }

    public zUR(@NotNull AbstractC58950zVm abstractC58950zVm, @NotNull java.util.List<? extends AbstractC58950zVm> list, @NotNull Step2Type step2Type, int i, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(abstractC58950zVm, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(step2Type, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = abstractC58950zVm;
        this.EZpvd = list;
        this.KWHzl = step2Type;
        this.copydefault = i;
        this.AEQbTJ = str;
    }
}
