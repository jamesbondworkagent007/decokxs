package o;

import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rav, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42679rav implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.LinearLayout AhwBna;
    public final android.widget.TextView DbNXlk;
    public final android.view.View EZpvd;
    public final Flow KWHzl;
    public final android.view.View OLrzqt;
    public final android.widget.LinearLayout copydefault;
    public final ConstraintLayout djBIcL;
    public final android.widget.LinearLayout gEmmrt;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.djBIcL;
    }

    public C42679rav(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.view.View view2, @androidx.annotation.NonNull android.view.View view3, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull Flow flow, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout3, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3) {
        this.djBIcL = constraintLayout;
        this.AEQbTJ = view;
        this.OLrzqt = view2;
        this.EZpvd = view3;
        this.copydefault = linearLayout;
        this.KWHzl = flow;
        this.AhwBna = linearLayout2;
        this.gEmmrt = linearLayout3;
        this.valueOf = textView;
        this.AYXKKw = textView2;
        this.DbNXlk = textView3;
    }

    public static C42679rav OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.DAIeex, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C42679rav KWHzl(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        android.view.View viewFindChildViewById2;
        int i = qZH.StateListAnimator.QfsBiF;
        android.view.View viewFindChildViewById3 = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = qZH.StateListAnimator.RcXXUw))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = qZH.StateListAnimator.dNCPSb))) != null) {
            i = qZH.StateListAnimator.Th;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = qZH.StateListAnimator.RZNAhV;
                Flow flow = (Flow) ViewBindings.findChildViewById(view, i);
                if (flow != null) {
                    i = qZH.StateListAnimator.hpmliR;
                    android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout2 != null) {
                        i = qZH.StateListAnimator.registerKeyboardTarget;
                        android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout3 != null) {
                            i = qZH.StateListAnimator.RsCxkX;
                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = qZH.StateListAnimator.onLost;
                                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    i = qZH.StateListAnimator.SaJVGb;
                                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView3 != null) {
                                        return new C42679rav((ConstraintLayout) view, viewFindChildViewById3, viewFindChildViewById, viewFindChildViewById2, linearLayout, flow, linearLayout2, linearLayout3, textView, textView2, textView3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
