package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.sWj;

/* JADX INFO: loaded from: classes16.dex */
public final class sWs implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final android.view.SurfaceView AhwBna;
    public final android.widget.FrameLayout EZpvd;
    public final android.widget.ImageView KWHzl;
    public final android.widget.ProgressBar OLrzqt;
    public final android.widget.ImageView copydefault;
    public final android.widget.LinearLayout valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.EZpvd;
    }

    public sWs(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.ProgressBar progressBar, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.view.SurfaceView surfaceView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout) {
        this.EZpvd = frameLayout;
        this.copydefault = imageView;
        this.KWHzl = imageView2;
        this.OLrzqt = progressBar;
        this.AEQbTJ = view;
        this.AhwBna = surfaceView;
        this.valueOf = linearLayout;
    }

    public static sWs AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return OLrzqt(layoutInflater, null, false);
    }

    public static sWs OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(sWj.TaskDescription.gEmmrt, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static sWs KWHzl(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = sWj.Application.AEQbTJ;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = sWj.Application.OLrzqt;
            android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = sWj.Application.KWHzl;
                android.widget.ProgressBar progressBar = (android.widget.ProgressBar) ViewBindings.findChildViewById(view, i);
                if (progressBar != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = sWj.Application.fetchVPNInfo))) != null) {
                    i = sWj.Application.DbNXlk;
                    android.view.SurfaceView surfaceView = (android.view.SurfaceView) ViewBindings.findChildViewById(view, i);
                    if (surfaceView != null) {
                        i = sWj.Application.uzCIH;
                        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            return new sWs((android.widget.FrameLayout) view, imageView, imageView2, progressBar, viewFindChildViewById, surfaceView, linearLayout);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
