package o;

import com.okinc.okex.uploadlog.view.displaymodels.FormElementDisplayModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class sCT {
    public final java.lang.String AEQbTJ;
    public final java.lang.String KWHzl;
    public final int OLrzqt;
    public final java.util.List<FormElementDisplayModel> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.sCT */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ sCT copy$default(sCT sct, int i, java.lang.String str, java.lang.String str2, java.util.List list, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = sct.OLrzqt;
        }
        if ((i2 & 2) != 0) {
            str = sct.AEQbTJ;
        }
        if ((i2 & 4) != 0) {
            str2 = sct.KWHzl;
        }
        if ((i2 & 8) != 0) {
            list = sct.copydefault;
        }
        return sct.OLrzqt(i, str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<FormElementDisplayModel> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final sCT OLrzqt(int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<FormElementDisplayModel> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new sCT(i, str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sCT)) {
            return false;
        }
        sCT sct = (sCT) obj;
        return this.OLrzqt == sct.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) sct.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) sct.KWHzl) && Intrinsics.EZpvd(this.copydefault, sct.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.OLrzqt) * 31) + this.AEQbTJ.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UploadLogFormDisplayModel(id=" + this.OLrzqt + ", name=" + this.AEQbTJ + ", description=" + this.KWHzl + ", formElements=" + this.copydefault + ")";
    }

    public sCT(int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<FormElementDisplayModel> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = i;
        this.AEQbTJ = str;
        this.KWHzl = str2;
        this.copydefault = list;
    }
}
