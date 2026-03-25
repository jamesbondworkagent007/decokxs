package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class eFJ {
    public final int AEQbTJ;
    public final java.util.List<eFI> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.eFJ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ eFJ copy$default(eFJ efj, int i, java.util.List list, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = efj.AEQbTJ;
        }
        if ((i2 & 2) != 0) {
            list = efj.copydefault;
        }
        return efj.EZpvd(i, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final eFJ EZpvd(int i, @NotNull java.util.List<eFI> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new eFJ(i, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<eFI> copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eFJ)) {
            return false;
        }
        eFJ efj = (eFJ) obj;
        return this.AEQbTJ == efj.AEQbTJ && Intrinsics.EZpvd(this.copydefault, efj.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Integer.hashCode(this.AEQbTJ) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "AddressAndAssetInfoGroup(index=" + this.AEQbTJ + ", addressAndAssetInfoList=" + this.copydefault + ")";
    }

    public eFJ(int i, @NotNull java.util.List<eFI> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = i;
        this.copydefault = list;
    }
}
