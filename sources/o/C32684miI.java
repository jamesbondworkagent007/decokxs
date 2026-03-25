package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C32726miy;

/* JADX INFO: renamed from: o.miI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C32684miI implements ViewBinding {
    public final C33537myN AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final android.widget.TextView KWHzl;
    public final ConstraintLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.copydefault;
    }

    public C32684miI(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C33537myN c33537myN, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.copydefault = constraintLayout;
        this.AEQbTJ = c33537myN;
        this.EZpvd = textView;
        this.KWHzl = textView2;
    }

    public static C32684miI OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C32726miy.ActionBar.AYXKKw, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C32684miI copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C32726miy.Activity.AEQbTJ;
        C33537myN c33537myN = (C33537myN) ViewBindings.findChildViewById(view, i);
        if (c33537myN != null) {
            i = C32726miy.Activity.zuBGHE;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = C32726miy.Activity.QVAiDq;
                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    return new C32684miI((ConstraintLayout) view, c33537myN, textView, textView2);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
