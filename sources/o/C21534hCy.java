package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hCy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21534hCy implements ViewBinding {
    public final C55258xgZ AEQbTJ;
    public final AppCompatTextView AhwBna;
    public final AppCompatTextView EZpvd;
    public final AppCompatTextView KWHzl;
    public final ConstraintLayout OLrzqt;
    public final Barrier copydefault;
    public final C31222lpu djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.OLrzqt;
    }

    public C21534hCy(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull Barrier barrier, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull C55258xgZ c55258xgZ, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull C31222lpu c31222lpu) {
        this.OLrzqt = constraintLayout;
        this.copydefault = barrier;
        this.KWHzl = appCompatTextView;
        this.EZpvd = appCompatTextView2;
        this.AEQbTJ = c55258xgZ;
        this.AhwBna = appCompatTextView3;
        this.djBIcL = c31222lpu;
    }

    public static C21534hCy OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.pauseLocationServices, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C21534hCy EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.dmfpNf;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
        if (barrier != null) {
            i = C23274hvD.Application.RestrictToScope;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView != null) {
                i = C23274hvD.Application.mapNightMode;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView2 != null) {
                    i = C23274hvD.Application.AppCompatDelegateImplApi21Impl;
                    C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                    if (c55258xgZ != null) {
                        i = C23274hvD.Application.dispatchKeyShortcutEvent;
                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView3 != null) {
                            i = C23274hvD.Application.resetGroup;
                            C31222lpu c31222lpu = (C31222lpu) ViewBindings.findChildViewById(view, i);
                            if (c31222lpu != null) {
                                return new C21534hCy((ConstraintLayout) view, barrier, appCompatTextView, appCompatTextView2, c55258xgZ, appCompatTextView3, c31222lpu);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
