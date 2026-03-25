package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.fQi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17735fQi extends fDJ {
    public boolean AEQbTJ = true;
    public java.util.List<? extends fDL<? extends java.lang.Object>> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(java.util.List<? extends fDL<? extends java.lang.Object>> list) {
        this.copydefault = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.fDJ
    public void AEQbTJ(boolean z) {
        this.AEQbTJ = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.fDJ
    public boolean OLrzqt() {
        return this.AEQbTJ;
    }

    @Override // o.fDJ
    public int AEQbTJ() {
        java.util.List<? extends fDL<? extends java.lang.Object>> list = this.copydefault;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // o.fDJ
    public fDL<java.lang.Object> AEQbTJ(int i) {
        java.util.List<? extends fDL<? extends java.lang.Object>> list = this.copydefault;
        fDL<? extends java.lang.Object> fdl = list != null ? list.get(i) : null;
        Intrinsics.copydefault(fdl);
        return fdl;
    }
}
