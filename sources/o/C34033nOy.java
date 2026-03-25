package o;

import androidx.camera.view.PreviewView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nOy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34033nOy implements ViewBinding {
    public final PreviewView AEQbTJ;
    public final android.view.TextureView EZpvd;
    public final android.widget.ImageView KWHzl;
    public final android.widget.LinearLayout OLrzqt;
    public final C34031nOw copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.OLrzqt;
    }

    public C34033nOy(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C34031nOw c34031nOw, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull PreviewView previewView, @androidx.annotation.NonNull android.view.TextureView textureView) {
        this.OLrzqt = linearLayout;
        this.copydefault = c34031nOw;
        this.KWHzl = imageView;
        this.AEQbTJ = previewView;
        this.EZpvd = textureView;
    }

    public static C34033nOy copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.RqmePg, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C34033nOy AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C35399nuc.StateListAnimator.QkdxfA;
        android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            C34031nOw c34031nOwKWHzl = C34031nOw.KWHzl(viewFindChildViewById);
            i = C35399nuc.StateListAnimator.GGlJim;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C35399nuc.StateListAnimator.gAnGwV;
                PreviewView previewView = (PreviewView) ViewBindings.findChildViewById(view, i);
                if (previewView != null) {
                    i = C35399nuc.StateListAnimator.fObYrO;
                    android.view.TextureView textureView = (android.view.TextureView) ViewBindings.findChildViewById(view, i);
                    if (textureView != null) {
                        return new C34033nOy((android.widget.LinearLayout) view, c34031nOwKWHzl, imageView, previewView, textureView);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
