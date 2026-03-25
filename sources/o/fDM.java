package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fDM extends fDJ {
    public boolean AEQbTJ = true;
    public java.util.List<? extends fDL<java.lang.Object>> copydefault;

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

    @yCM
    public fDM() {
    }

    public final void copydefault(@NotNull java.util.List<? extends fDL<java.lang.Object>> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = list;
        notifyDataSetChanged();
    }

    @Override // o.fDJ
    public int AEQbTJ() {
        java.util.List<? extends fDL<java.lang.Object>> list = this.copydefault;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x000f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // o.fDJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fDL<java.lang.Object> AEQbTJ(int i) {
        if (i >= 0) {
            java.util.List<? extends fDL<java.lang.Object>> list = this.copydefault;
            if (i >= (list != null ? list.size() : 0)) {
            }
        } else {
            try {
                throw new java.lang.RuntimeException("getGroupItem with error index " + i);
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        }
        java.util.List<? extends fDL<java.lang.Object>> list2 = this.copydefault;
        fDL<java.lang.Object> fdl = list2 != null ? list2.get(i) : null;
        Intrinsics.copydefault(fdl);
        return fdl;
    }
}
