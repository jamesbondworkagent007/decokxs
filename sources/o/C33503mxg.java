package o;

import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mxg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33503mxg {
    public static final android.util.SparseArray<C33510mxn> OLrzqt() {
        android.util.SparseArray<C33510mxn> sparseArray = new android.util.SparseArray<>();
        sparseArray.put(0, new C33510mxn(C52761wXj.LoaderManager.fvQaOB, C52761wXj.LoaderManager.flVtFt));
        sparseArray.put(1, new C33510mxn(C52761wXj.LoaderManager.DXXBbs, C52761wXj.LoaderManager.ODWQjV));
        return sparseArray;
    }

    public static final android.util.SparseArray<C33510mxn> AEQbTJ() {
        android.util.SparseArray<C33510mxn> sparseArray = new android.util.SparseArray<>();
        sparseArray.put(0, new C33510mxn(C52761wXj.LoaderManager.AxsJAYaxsJAY, C52761wXj.LoaderManager.hUfVAv));
        sparseArray.put(1, new C33510mxn(C52761wXj.LoaderManager.AxsJAYaxsJAY, C52761wXj.LoaderManager.hUfVAv));
        return sparseArray;
    }

    public static final android.util.SparseArray<C33510mxn> EZpvd() {
        android.util.SparseArray<C33510mxn> sparseArray = new android.util.SparseArray<>();
        sparseArray.put(0, new C33510mxn(C52761wXj.LoaderManager.iZzfmt, C52761wXj.LoaderManager.AxsJAYsNCnLh));
        sparseArray.put(1, new C33510mxn(C52761wXj.LoaderManager.iZzfmt, C52761wXj.LoaderManager.AxsJAYsNCnLh));
        return sparseArray;
    }

    public static final java.lang.Integer KWHzl(@NotNull android.util.SparseArray<C33510mxn> sparseArray) {
        int iCopydefault;
        Intrinsics.checkNotNullParameter(sparseArray, "");
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        C33510mxn c33510mxn = sparseArray.get(c33512mxp.AYXKKw());
        if (c33510mxn == null) {
            return null;
        }
        if (c33512mxp.isConnected() == 1) {
            iCopydefault = c33510mxn.AEQbTJ();
        } else {
            iCopydefault = c33510mxn.copydefault();
        }
        return java.lang.Integer.valueOf(iCopydefault);
    }
}
