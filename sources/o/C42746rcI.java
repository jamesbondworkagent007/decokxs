package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rcI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42746rcI implements ViewBinding {
    public final qIE AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final RecyclerView KWHzl;
    public final AppCompatImageView OLrzqt;
    public final C40499qYc copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C40499qYc getRoot() {
        return this.copydefault;
    }

    public C42746rcI(@androidx.annotation.NonNull C40499qYc c40499qYc, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull qIE qie, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.copydefault = c40499qYc;
        this.OLrzqt = appCompatImageView;
        this.KWHzl = recyclerView;
        this.AEQbTJ = qie;
        this.EZpvd = textView;
    }

    public static C42746rcI KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.dbwnZN;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = qZH.StateListAnimator.onStatusChanged;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = qZH.StateListAnimator.fmdvVn;
                qIE qie = (qIE) ViewBindings.findChildViewById(view, i);
                if (qie != null) {
                    i = qZH.StateListAnimator.UnZVfq;
                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        return new C42746rcI((C40499qYc) view, appCompatImageView, recyclerView, qie, textView);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
