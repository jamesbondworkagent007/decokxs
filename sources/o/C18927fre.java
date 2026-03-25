package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fre, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18927fre {
    public final java.lang.String AEQbTJ;
    public final java.lang.String AhwBna;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C18927fre copy$default(C18927fre c18927fre, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c18927fre.AhwBna;
        }
        if ((i & 2) != 0) {
            str2 = c18927fre.OLrzqt;
        }
        java.lang.String str8 = str2;
        if ((i & 4) != 0) {
            str3 = c18927fre.AEQbTJ;
        }
        java.lang.String str9 = str3;
        if ((i & 8) != 0) {
            str4 = c18927fre.copydefault;
        }
        java.lang.String str10 = str4;
        if ((i & 16) != 0) {
            str5 = c18927fre.EZpvd;
        }
        java.lang.String str11 = str5;
        if ((i & 32) != 0) {
            str6 = c18927fre.KWHzl;
        }
        java.lang.String str12 = str6;
        if ((i & 64) != 0) {
            str7 = c18927fre.valueOf;
        }
        return c18927fre.copydefault(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C18927fre copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new C18927fre(str, str2, str3, str4, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18927fre)) {
            return false;
        }
        C18927fre c18927fre = (C18927fre) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c18927fre.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c18927fre.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c18927fre.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c18927fre.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c18927fre.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c18927fre.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c18927fre.valueOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.AhwBna.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.valueOf.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "WalletBannerEvent(title=" + this.AhwBna + ", reward=" + this.OLrzqt + ", endTime=" + this.AEQbTJ + ", deeplinkUrl=" + this.copydefault + ", iconUrl=" + this.EZpvd + ", iconUrlDark=" + this.KWHzl + ", token=" + this.valueOf + ")";
    }

    public C18927fre(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.AhwBna = str;
        this.OLrzqt = str2;
        this.AEQbTJ = str3;
        this.copydefault = str4;
        this.EZpvd = str5;
        this.KWHzl = str6;
        this.valueOf = str7;
    }
}
