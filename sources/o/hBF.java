package o;

import androidx.compose.ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hBF implements ViewBinding {
    public final C33603mza AEQbTJ;
    public final ComposeView EZpvd;
    public final C33546myW KWHzl;
    public final C33546myW OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C33546myW getRoot() {
        return this.KWHzl;
    }

    public hBF(@androidx.annotation.NonNull C33546myW c33546myW, @androidx.annotation.NonNull ComposeView composeView, @androidx.annotation.NonNull C33603mza c33603mza, @androidx.annotation.NonNull C33546myW c33546myW2) {
        this.KWHzl = c33546myW;
        this.EZpvd = composeView;
        this.AEQbTJ = c33603mza;
        this.OLrzqt = c33546myW2;
    }

    public static hBF KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.DTeKQX, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static hBF EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.init;
        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
        if (composeView != null) {
            i = C23274hvD.Application.ComponentActivityReportFullyDrawnExecutor;
            C33603mza c33603mza = (C33603mza) ViewBindings.findChildViewById(view, i);
            if (c33603mza != null) {
                C33546myW c33546myW = (C33546myW) view;
                return new hBF(c33546myW, composeView, c33603mza, c33546myW);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
