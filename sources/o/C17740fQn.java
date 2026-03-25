package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fQn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17740fQn implements fDL<java.lang.Object> {
    public final AbstractC12784ctX AEQbTJ;
    public final java.util.List<java.lang.Object> EZpvd;
    public final java.lang.String KWHzl;
    public boolean OLrzqt;
    public final boolean copydefault;

    @Override // o.fDL
    public boolean AEQbTJ() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC12784ctX KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.OLrzqt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.Object> copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.KWHzl;
    }

    public C17740fQn(@NotNull java.util.List<? extends java.lang.Object> list, @NotNull AbstractC12784ctX abstractC12784ctX, boolean z, java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
        this.EZpvd = list;
        this.AEQbTJ = abstractC12784ctX;
        this.copydefault = z;
        this.KWHzl = str;
        this.OLrzqt = true;
    }

    @Override // o.fDL
    public int OLrzqt() {
        return this.EZpvd.size();
    }

    @Override // o.fDL
    public java.lang.Object copydefault(int i) {
        if (i < this.EZpvd.size()) {
            return this.EZpvd.get(i);
        }
        return this.EZpvd.get(0);
    }
}
