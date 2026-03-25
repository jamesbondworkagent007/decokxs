package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.kMU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kyR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29690kyR implements kMU {
    public final Function0<Unit> AEQbTJ;
    public final boolean EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.Integer OLrzqt;
    public final android.text.SpannedString copydefault;
    public final java.lang.String djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.kyR */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C29690kyR copy$default(C29690kyR c29690kyR, java.lang.String str, java.lang.Integer num, boolean z, android.text.SpannedString spannedString, java.lang.String str2, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c29690kyR.KWHzl;
        }
        if ((i & 2) != 0) {
            num = c29690kyR.OLrzqt;
        }
        java.lang.Integer num2 = num;
        if ((i & 4) != 0) {
            z = c29690kyR.EZpvd;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            spannedString = c29690kyR.copydefault;
        }
        android.text.SpannedString spannedString2 = spannedString;
        if ((i & 16) != 0) {
            str2 = c29690kyR.djBIcL;
        }
        java.lang.String str3 = str2;
        if ((i & 32) != 0) {
            function0 = c29690kyR.AEQbTJ;
        }
        return c29690kyR.EZpvd(str, num2, z2, spannedString2, str3, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.text.SpannedString EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C29690kyR EZpvd(@NotNull java.lang.String str, java.lang.Integer num, boolean z, @NotNull android.text.SpannedString spannedString, @NotNull java.lang.String str2, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(spannedString, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C29690kyR(str, num, z, spannedString, str2, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> copydefault() {
        return this.AEQbTJ;
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
        if (!(obj instanceof C29690kyR)) {
            return false;
        }
        C29690kyR c29690kyR = (C29690kyR) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c29690kyR.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, c29690kyR.OLrzqt) && this.EZpvd == c29690kyR.EZpvd && Intrinsics.EZpvd(this.copydefault, c29690kyR.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c29690kyR.djBIcL) && Intrinsics.EZpvd(this.AEQbTJ, c29690kyR.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        java.lang.Integer num = this.OLrzqt;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        int iHashCode3 = java.lang.Boolean.hashCode(this.EZpvd);
        int iHashCode4 = this.copydefault.hashCode();
        int iHashCode5 = this.djBIcL.hashCode();
        Function0<Unit> function0 = this.AEQbTJ;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (function0 != null ? function0.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        java.lang.String str = this.KWHzl;
        java.lang.Integer num = this.OLrzqt;
        boolean z = this.EZpvd;
        android.text.SpannedString spannedString = this.copydefault;
        return "TagOtherItemUiModel(iconUrl=" + str + ", iconTint=" + num + ", roundIcon=" + z + ", tagLabelName=" + ((java.lang.Object) spannedString) + ", tagSubtitle=" + this.djBIcL + ", onTagClick=" + this.AEQbTJ + ")";
    }

    public C29690kyR(@NotNull java.lang.String str, java.lang.Integer num, boolean z, @NotNull android.text.SpannedString spannedString, @NotNull java.lang.String str2, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(spannedString, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.KWHzl = str;
        this.OLrzqt = num;
        this.EZpvd = z;
        this.copydefault = spannedString;
        this.djBIcL = str2;
        this.AEQbTJ = function0;
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
    public java.lang.Object getChangePayload(@NotNull kMU kmu) {
        return kMU.TaskDescription.EZpvd(this, kmu);
    }
}
