package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vjI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C51237vjI {
    public final java.util.ArrayList<java.lang.Object> AEQbTJ;
    public C51277vjw EZpvd;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.vjI */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C51237vjI copy$default(C51237vjI c51237vjI, C51277vjw c51277vjw, boolean z, java.util.ArrayList arrayList, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c51277vjw = c51237vjI.EZpvd;
        }
        if ((i & 2) != 0) {
            z = c51237vjI.copydefault;
        }
        if ((i & 4) != 0) {
            arrayList = c51237vjI.AEQbTJ;
        }
        return c51237vjI.AEQbTJ(c51277vjw, z, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<java.lang.Object> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C51237vjI AEQbTJ(C51277vjw c51277vjw, boolean z, @NotNull java.util.ArrayList<java.lang.Object> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        return new C51237vjI(c51277vjw, z, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C51277vjw copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C51237vjI)) {
            return false;
        }
        C51237vjI c51237vjI = (C51237vjI) obj;
        return Intrinsics.EZpvd(this.EZpvd, c51237vjI.EZpvd) && this.copydefault == c51237vjI.copydefault && Intrinsics.EZpvd(this.AEQbTJ, c51237vjI.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        C51277vjw c51277vjw = this.EZpvd;
        return ((((c51277vjw == null ? 0 : c51277vjw.hashCode()) * 31) + java.lang.Boolean.hashCode(this.copydefault)) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MpStgyCopyParamData(foldRule=" + this.EZpvd + ", isShareProfit=" + this.copydefault + ", lists=" + this.AEQbTJ + ")";
    }

    public C51237vjI(C51277vjw c51277vjw, boolean z, @NotNull java.util.ArrayList<java.lang.Object> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.EZpvd = c51277vjw;
        this.copydefault = z;
        this.AEQbTJ = arrayList;
    }
}
