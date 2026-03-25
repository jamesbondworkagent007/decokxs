package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.euz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C17027euz implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final android.widget.FrameLayout EZpvd;
    public final android.widget.FrameLayout KWHzl;
    public final android.widget.LinearLayout OLrzqt;
    public final android.widget.ImageView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.AEQbTJ;
    }

    public C17027euz(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2) {
        this.AEQbTJ = linearLayout;
        this.copydefault = imageView;
        this.OLrzqt = linearLayout2;
        this.KWHzl = frameLayout;
        this.EZpvd = frameLayout2;
    }

    public static C17027euz OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.gdwsGQ, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C17027euz EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.sbu;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view;
            i = C13754dXa.ActionBar.gCNefq;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = C13754dXa.ActionBar.DzCpqu;
                android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout2 != null) {
                    return new C17027euz(linearLayout, imageView, linearLayout, frameLayout, frameLayout2);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
