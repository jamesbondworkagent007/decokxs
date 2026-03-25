package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hFi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21599hFi implements ViewBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final android.widget.FrameLayout EZpvd;
    public final android.widget.ImageView KWHzl;
    public final android.view.View OLrzqt;
    public final android.widget.ImageView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.OLrzqt;
    }

    public C21599hFi(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2) {
        this.OLrzqt = view;
        this.AEQbTJ = frameLayout;
        this.copydefault = imageView;
        this.KWHzl = imageView2;
        this.EZpvd = frameLayout2;
    }

    public static C21599hFi AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C23274hvD.Activity.sRzUNh, viewGroup);
        return copydefault(viewGroup);
    }

    public static C21599hFi copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.DPHsZd;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = C23274hvD.Application.openFileOutput;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C23274hvD.Application.MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection1;
                android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = C23274hvD.Application.ActivityResultContractsOpenMultipleDocuments;
                    android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                    if (frameLayout2 != null) {
                        return new C21599hFi(view, frameLayout, imageView, imageView2, frameLayout2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
