package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iNa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C23888iNa implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final C55251xgS EZpvd;
    public final ConstraintLayout KWHzl;
    public final ConstraintLayout OLrzqt;
    public final C55251xgS copydefault;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.OLrzqt;
    }

    public C23888iNa(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C55251xgS c55251xgS, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull C55251xgS c55251xgS2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.OLrzqt = constraintLayout;
        this.copydefault = c55251xgS;
        this.KWHzl = constraintLayout2;
        this.EZpvd = c55251xgS2;
        this.AEQbTJ = textView;
        this.valueOf = textView2;
    }

    public static C23888iNa copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.RuDPQV, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C23888iNa AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.ScLVFT;
        C55251xgS c55251xgS = (C55251xgS) ViewBindings.findChildViewById(view, i);
        if (c55251xgS != null) {
            i = C25493ixk.ActionBar.aLnfMH;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = C25493ixk.ActionBar.UUsvzU;
                C55251xgS c55251xgS2 = (C55251xgS) ViewBindings.findChildViewById(view, i);
                if (c55251xgS2 != null) {
                    i = C25493ixk.ActionBar.MediaBrowserCompatConnectionCallback;
                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = C25493ixk.ActionBar.MediaBrowserCompatMediaBrowserImplApi215;
                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            return new C23888iNa((ConstraintLayout) view, c55251xgS, constraintLayout, c55251xgS2, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
