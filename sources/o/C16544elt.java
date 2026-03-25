package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.elt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16544elt implements ViewBinding {
    public final android.widget.LinearLayout EZpvd;
    public final android.widget.ScrollView KWHzl;
    public final android.widget.ScrollView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.ScrollView getRoot() {
        return this.KWHzl;
    }

    public C16544elt(@androidx.annotation.NonNull android.widget.ScrollView scrollView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.ScrollView scrollView2) {
        this.KWHzl = scrollView;
        this.EZpvd = linearLayout;
        this.copydefault = scrollView2;
    }

    public static C16544elt EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.zAEkPU, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C16544elt OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.UnZVfq;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            android.widget.ScrollView scrollView = (android.widget.ScrollView) view;
            return new C16544elt(scrollView, linearLayout, scrollView);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
