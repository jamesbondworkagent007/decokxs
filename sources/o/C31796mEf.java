package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mEf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31796mEf {
    public final boolean AEQbTJ;
    public final AbstractC31795mEe KWHzl;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C31796mEf copy$default(C31796mEf c31796mEf, java.lang.String str, AbstractC31795mEe abstractC31795mEe, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c31796mEf.OLrzqt;
        }
        if ((i & 2) != 0) {
            abstractC31795mEe = c31796mEf.KWHzl;
        }
        if ((i & 4) != 0) {
            z = c31796mEf.AEQbTJ;
        }
        return c31796mEf.OLrzqt(str, abstractC31795mEe, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C31796mEf OLrzqt(@NotNull java.lang.String str, @NotNull AbstractC31795mEe abstractC31795mEe, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC31795mEe, "");
        return new C31796mEf(str, abstractC31795mEe, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31796mEf)) {
            return false;
        }
        C31796mEf c31796mEf = (C31796mEf) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c31796mEf.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, c31796mEf.KWHzl) && this.AEQbTJ == c31796mEf.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.OLrzqt.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CryptoListItemAction(id=" + this.OLrzqt + ", item=" + this.KWHzl + ", shouldResetItemState=" + this.AEQbTJ + ")";
    }

    public C31796mEf(@NotNull java.lang.String str, @NotNull AbstractC31795mEe abstractC31795mEe, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC31795mEe, "");
        this.OLrzqt = str;
        this.KWHzl = abstractC31795mEe;
        this.AEQbTJ = z;
    }
}
