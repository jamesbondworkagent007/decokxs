package o;

import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: o.rwd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C43827rwd implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.AEQbTJ;
    }

    public C43827rwd(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout) {
        this.AEQbTJ = linearLayout;
    }

    public static C43827rwd EZpvd(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        return new C43827rwd((android.widget.LinearLayout) view);
    }
}
