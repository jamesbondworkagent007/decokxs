package o;

import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes8.dex */
public final class oPK implements ViewBinding {
    public final android.widget.FrameLayout EZpvd;
    public final android.widget.FrameLayout KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.KWHzl;
    }

    public oPK(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2) {
        this.KWHzl = frameLayout;
        this.EZpvd = frameLayout2;
    }

    public static oPK AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view;
        return new oPK(frameLayout, frameLayout);
    }
}
