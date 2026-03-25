package o;

import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: o.ewc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17110ewc implements ViewBinding {
    public final android.widget.LinearLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.copydefault;
    }

    public C17110ewc(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout) {
        this.copydefault = linearLayout;
    }

    public static C17110ewc OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        return new C17110ewc((android.widget.LinearLayout) view);
    }
}
