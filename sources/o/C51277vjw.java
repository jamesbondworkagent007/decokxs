package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.vjw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51277vjw {
    public final int OLrzqt;
    public java.lang.Boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C51277vjw copy$default(C51277vjw c51277vjw, java.lang.Boolean bool, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            bool = c51277vjw.copydefault;
        }
        if ((i2 & 2) != 0) {
            i = c51277vjw.OLrzqt;
        }
        return c51277vjw.OLrzqt(bool, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C51277vjw OLrzqt(java.lang.Boolean bool, int i) {
        return new C51277vjw(bool, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(java.lang.Boolean bool) {
        this.copydefault = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C51277vjw)) {
            return false;
        }
        C51277vjw c51277vjw = (C51277vjw) obj;
        return Intrinsics.EZpvd(this.copydefault, c51277vjw.copydefault) && this.OLrzqt == c51277vjw.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.Boolean bool = this.copydefault;
        return ((bool == null ? 0 : bool.hashCode()) * 31) + java.lang.Integer.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "FoldRule(isFold=" + this.copydefault + ", items=" + this.OLrzqt + ")";
    }

    public C51277vjw(java.lang.Boolean bool, int i) {
        this.copydefault = bool;
        this.OLrzqt = i;
    }
}
