package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.kMU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kyQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29689kyQ implements kMU {
    public final Function0<Unit> AEQbTJ;
    public final boolean EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kyQ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C29689kyQ copy$default(C29689kyQ c29689kyQ, java.lang.String str, boolean z, java.lang.String str2, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c29689kyQ.copydefault;
        }
        if ((i & 2) != 0) {
            z = c29689kyQ.EZpvd;
        }
        if ((i & 4) != 0) {
            str2 = c29689kyQ.KWHzl;
        }
        if ((i & 8) != 0) {
            function0 = c29689kyQ.AEQbTJ;
        }
        return c29689kyQ.AEQbTJ(str, z, str2, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C29689kyQ AEQbTJ(@NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C29689kyQ(str, z, str2, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29689kyQ)) {
            return false;
        }
        C29689kyQ c29689kyQ = (C29689kyQ) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c29689kyQ.copydefault) && this.EZpvd == c29689kyQ.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c29689kyQ.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, c29689kyQ.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        int iHashCode2 = java.lang.Boolean.hashCode(this.EZpvd);
        int iHashCode3 = this.KWHzl.hashCode();
        Function0<Unit> function0 = this.AEQbTJ;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (function0 == null ? 0 : function0.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TagInfoItemUiModel(iconUrl=" + this.copydefault + ", roundIcon=" + this.EZpvd + ", tagLabelName=" + this.KWHzl + ", onTagClick=" + this.AEQbTJ + ")";
    }

    public C29689kyQ(@NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.copydefault = str;
        this.EZpvd = z;
        this.KWHzl = str2;
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
