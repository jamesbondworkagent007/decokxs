package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: renamed from: o.oOc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C36069oOc implements ViewBinding {
    public final android.widget.TextView EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.LinearLayout OLrzqt;
    public final android.widget.TextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.OLrzqt;
    }

    public C36069oOc(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3) {
        this.OLrzqt = linearLayout;
        this.copydefault = textView;
        this.KWHzl = textView2;
        this.EZpvd = textView3;
    }

    public static C36069oOc EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.dLBcXg, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C36069oOc KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.getMediaDescription;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C35964oKf.StateListAnimator.fromParcel;
            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = C35964oKf.StateListAnimator.MediaControllerCompat;
                android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView3 != null) {
                    return new C36069oOc((android.widget.LinearLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
