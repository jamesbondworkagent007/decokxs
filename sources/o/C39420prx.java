package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.prx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C39420prx {
    public final java.lang.String AEQbTJ;
    public final Function1<android.content.Context, Unit> EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.prx */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C39420prx copy$default(C39420prx c39420prx, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c39420prx.OLrzqt;
        }
        if ((i & 2) != 0) {
            str2 = c39420prx.copydefault;
        }
        java.lang.String str6 = str2;
        if ((i & 4) != 0) {
            str3 = c39420prx.djBIcL;
        }
        java.lang.String str7 = str3;
        if ((i & 8) != 0) {
            str4 = c39420prx.KWHzl;
        }
        java.lang.String str8 = str4;
        if ((i & 16) != 0) {
            str5 = c39420prx.AEQbTJ;
        }
        java.lang.String str9 = str5;
        if ((i & 32) != 0) {
            function1 = c39420prx.EZpvd;
        }
        return c39420prx.KWHzl(str, str6, str7, str8, str9, function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<android.content.Context, Unit> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C39420prx KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull Function1<? super android.content.Context, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return new C39420prx(str, str2, str3, str4, str5, function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39420prx)) {
            return false;
        }
        C39420prx c39420prx = (C39420prx) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c39420prx.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c39420prx.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c39420prx.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c39420prx.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c39420prx.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, c39420prx.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.OLrzqt.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "EarnInfoItem(title=" + this.OLrzqt + ", title2=" + this.copydefault + ", title3=" + this.djBIcL + ", subTitle=" + this.KWHzl + ", subtitle2=" + this.AEQbTJ + ", action=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: kotlin.jvm.functions.Function1<? super android.content.Context, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C39420prx(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull Function1<? super android.content.Context, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = str;
        this.copydefault = str2;
        this.djBIcL = str3;
        this.KWHzl = str4;
        this.AEQbTJ = str5;
        this.EZpvd = function1;
    }
}
