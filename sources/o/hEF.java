package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hEF implements ViewBinding {
    public final android.widget.FrameLayout EZpvd;
    public final android.view.View KWHzl;
    public final android.widget.ImageView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.EZpvd;
    }

    public hEF(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.ImageView imageView) {
        this.EZpvd = frameLayout;
        this.KWHzl = view;
        this.copydefault = imageView;
    }

    public static hEF EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.fTEjYi, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static hEF AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.PlaybackStateCompatState;
        android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C23274hvD.Application.PlaybackStateCompatShuffleMode;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                return new hEF((android.widget.FrameLayout) view, viewFindChildViewById, imageView);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
