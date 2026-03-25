package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cbd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11838cbd {
    public static final Application Companion = new Application(null);
    public final java.lang.String AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C11838cbd copy$default(C11838cbd c11838cbd, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c11838cbd.copydefault;
        }
        if ((i & 2) != 0) {
            str2 = c11838cbd.AEQbTJ;
        }
        java.lang.String str8 = str2;
        if ((i & 4) != 0) {
            str3 = c11838cbd.EZpvd;
        }
        java.lang.String str9 = str3;
        if ((i & 8) != 0) {
            str4 = c11838cbd.OLrzqt;
        }
        java.lang.String str10 = str4;
        if ((i & 16) != 0) {
            str5 = c11838cbd.AYXKKw;
        }
        java.lang.String str11 = str5;
        if ((i & 32) != 0) {
            str6 = c11838cbd.KWHzl;
        }
        java.lang.String str12 = str6;
        if ((i & 64) != 0) {
            str7 = c11838cbd.djBIcL;
        }
        return c11838cbd.AEQbTJ(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C11838cbd AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new C11838cbd(str, str2, str3, str4, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11838cbd)) {
            return false;
        }
        C11838cbd c11838cbd = (C11838cbd) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c11838cbd.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c11838cbd.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c11838cbd.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c11838cbd.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c11838cbd.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c11838cbd.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c11838cbd.djBIcL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.copydefault.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.djBIcL.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "StarkNetGasInfo(l1GasPrice=" + this.copydefault + ", l1GasConsumed=" + this.AEQbTJ + ", l1DataGasPrice=" + this.EZpvd + ", l1DataGasConsumed=" + this.OLrzqt + ", l2GasPrice=" + this.AYXKKw + ", l2GasConsumed=" + this.KWHzl + ", overallFee=" + this.djBIcL + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.AYXKKw;
    }

    public C11838cbd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.copydefault = str;
        this.AEQbTJ = str2;
        this.EZpvd = str3;
        this.OLrzqt = str4;
        this.AYXKKw = str5;
        this.KWHzl = str6;
        this.djBIcL = str7;
    }

    /* JADX INFO: renamed from: o.cbd$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.cbd.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C11838cbd EZpvd() {
            return new C11838cbd("0x0", "0x0", "0x0", "0x0", "0x0", "0x0", "0");
        }
    }
}
