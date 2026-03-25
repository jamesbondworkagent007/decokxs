package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hFs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C21609hFs implements ViewBinding {
    public final C25345iuv AEQbTJ;
    public final C25308iuK EZpvd;
    public final wYF KWHzl;
    public final C25299iuB OLrzqt;
    public final ConstraintLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.copydefault;
    }

    public C21609hFs(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C25299iuB c25299iuB, @androidx.annotation.NonNull C25345iuv c25345iuv, @androidx.annotation.NonNull wYF wyf, @androidx.annotation.NonNull C25308iuK c25308iuK) {
        this.copydefault = constraintLayout;
        this.OLrzqt = c25299iuB;
        this.AEQbTJ = c25345iuv;
        this.KWHzl = wyf;
        this.EZpvd = c25308iuK;
    }

    public static C21609hFs AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.GiPPlL, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C21609hFs EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.setSessionImpl;
        C25299iuB c25299iuB = (C25299iuB) ViewBindings.findChildViewById(view, i);
        if (c25299iuB != null) {
            i = C23274hvD.Application.onStop;
            C25345iuv c25345iuv = (C25345iuv) ViewBindings.findChildViewById(view, i);
            if (c25345iuv != null) {
                i = C23274hvD.Application.MediaSessionCompatMediaSessionImplBaseCommand;
                wYF wyf = (wYF) ViewBindings.findChildViewById(view, i);
                if (wyf != null) {
                    i = C23274hvD.Application.ViewTreeOnBackPressedDispatcherOwnerfindViewTreeOnBackPressedDispatcherOwner1;
                    C25308iuK c25308iuK = (C25308iuK) ViewBindings.findChildViewById(view, i);
                    if (c25308iuK != null) {
                        return new C21609hFs((ConstraintLayout) view, c25299iuB, c25345iuv, wyf, c25308iuK);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
