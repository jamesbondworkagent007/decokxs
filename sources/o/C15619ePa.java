package o;

import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ePa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15619ePa extends AbstractC32998moE {
    public C16596ems KWHzl;
    public final int copydefault = C13754dXa.TaskDescription.gtdfxv;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.copydefault;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
    }

    public static final void KWHzl(C15619ePa c15619ePa) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c15619ePa, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        view.post(new java.lang.Runnable() { // from class: o.ePb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C15619ePa.KWHzl(this.EZpvd);
            }
        });
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C16596ems c16596emsAEQbTJ = C16596ems.AEQbTJ(getLayoutInflater(), viewGroup, false);
        this.KWHzl = c16596emsAEQbTJ;
        if (c16596emsAEQbTJ == null) {
            Intrinsics.gEmmrt("");
            c16596emsAEQbTJ = null;
        }
        C55173xeu c55173xeuKWHzl = c16596emsAEQbTJ.getRoot();
        Intrinsics.checkNotNullExpressionValue(c55173xeuKWHzl, "");
        return c55173xeuKWHzl;
    }
}
