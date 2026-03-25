package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iNt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C23907iNt implements ViewBinding {
    public final C23854iLu AEQbTJ;
    public final C23790iJk AhwBna;
    public final C23897iNj EZpvd;
    public final iLM KWHzl;
    public final C23855iLv OLrzqt;
    public final C23785iJf copydefault;
    public final android.widget.FrameLayout gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.gEmmrt;
    }

    public C23907iNt(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C23855iLv c23855iLv, @androidx.annotation.NonNull C23854iLu c23854iLu, @androidx.annotation.NonNull iLM ilm, @androidx.annotation.NonNull C23897iNj c23897iNj, @androidx.annotation.NonNull C23785iJf c23785iJf, @androidx.annotation.NonNull C23790iJk c23790iJk) {
        this.gEmmrt = frameLayout;
        this.OLrzqt = c23855iLv;
        this.AEQbTJ = c23854iLu;
        this.KWHzl = ilm;
        this.EZpvd = c23897iNj;
        this.copydefault = c23785iJf;
        this.AhwBna = c23790iJk;
    }

    public static C23907iNt KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.hlXVux, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C23907iNt OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.dvKsVJ;
        android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            C23855iLv c23855iLvEZpvd = C23855iLv.EZpvd(viewFindChildViewById);
            i = C25493ixk.ActionBar.KDccX;
            android.view.View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i);
            if (viewFindChildViewById2 != null) {
                C23854iLu c23854iLuOLrzqt = C23854iLu.OLrzqt(viewFindChildViewById2);
                i = C25493ixk.ActionBar.iPSTqm;
                android.view.View viewFindChildViewById3 = ViewBindings.findChildViewById(view, i);
                if (viewFindChildViewById3 != null) {
                    iLM ilmAEQbTJ = iLM.AEQbTJ(viewFindChildViewById3);
                    i = C25493ixk.ActionBar.aWuQzD;
                    android.view.View viewFindChildViewById4 = ViewBindings.findChildViewById(view, i);
                    if (viewFindChildViewById4 != null) {
                        C23897iNj c23897iNjOLrzqt = C23897iNj.OLrzqt(viewFindChildViewById4);
                        i = C25493ixk.ActionBar.getConnectivityMgr;
                        android.view.View viewFindChildViewById5 = ViewBindings.findChildViewById(view, i);
                        if (viewFindChildViewById5 != null) {
                            C23785iJf c23785iJfAEQbTJ = C23785iJf.AEQbTJ(viewFindChildViewById5);
                            i = C25493ixk.ActionBar.OeawrH;
                            android.view.View viewFindChildViewById6 = ViewBindings.findChildViewById(view, i);
                            if (viewFindChildViewById6 != null) {
                                return new C23907iNt((android.widget.FrameLayout) view, c23855iLvEZpvd, c23854iLuOLrzqt, ilmAEQbTJ, c23897iNjOLrzqt, c23785iJfAEQbTJ, C23790iJk.AEQbTJ(viewFindChildViewById6));
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
