package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hGJ implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final android.widget.ImageView EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final android.widget.LinearLayout copydefault;
    public final android.widget.TextView gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.copydefault;
    }

    public hGJ(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout3, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.copydefault = linearLayout;
        this.EZpvd = imageView;
        this.AEQbTJ = linearLayout2;
        this.OLrzqt = imageView2;
        this.KWHzl = linearLayout3;
        this.gEmmrt = textView;
    }

    public static hGJ EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.hfeTOA, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static hGJ AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.ggKfIT;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C23274hvD.Application.MediaSessionCompatMediaSessionImplApi18;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = C23274hvD.Application.onViewDetachedFromWindow;
                android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = C23274hvD.Application.PipHintTrackerKttrackPipAnimationHintViewflow1attachStateChangeListener1;
                    android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout2 != null) {
                        i = C23274hvD.Application.set;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            return new hGJ((android.widget.LinearLayout) view, imageView, linearLayout, imageView2, linearLayout2, textView);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
