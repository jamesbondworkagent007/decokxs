package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.auth.impl.widget.SimpleToolBar;
import o.C8206ayP;

/* JADX INFO: renamed from: o.azF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C8249azF implements ViewBinding {
    public final C52794wYp AEQbTJ;
    public final android.widget.TextView AhwBna;
    public final ConstraintLayout EZpvd;
    public final android.widget.TextView KWHzl;
    public final RecyclerView OLrzqt;
    public final SimpleToolBar copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.EZpvd;
    }

    public C8249azF(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull SimpleToolBar simpleToolBar, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.EZpvd = constraintLayout;
        this.copydefault = simpleToolBar;
        this.AEQbTJ = c52794wYp;
        this.OLrzqt = recyclerView;
        this.KWHzl = textView;
        this.AhwBna = textView2;
    }

    public static C8249azF AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C8206ayP.Application.sSMYrx, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C8249azF EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C8206ayP.StateListAnimator.AEQbTJ;
        SimpleToolBar simpleToolBar = (SimpleToolBar) ViewBindings.findChildViewById(view, i);
        if (simpleToolBar != null) {
            i = C8206ayP.StateListAnimator.dNCPSb;
            C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
            if (c52794wYp != null) {
                i = C8206ayP.StateListAnimator.fsSxsn;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = C8206ayP.StateListAnimator.DKtBnz;
                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = C8206ayP.StateListAnimator.isReflectionWorking;
                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            return new C8249azF((ConstraintLayout) view, simpleToolBar, c52794wYp, recyclerView, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
