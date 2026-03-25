package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hBw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21505hBw implements ViewBinding {
    public final C55390xiz EZpvd;
    public final android.widget.ImageView KWHzl;
    public final android.widget.LinearLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.copydefault;
    }

    public C21505hBw(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C55390xiz c55390xiz, @androidx.annotation.NonNull android.widget.ImageView imageView) {
        this.copydefault = linearLayout;
        this.EZpvd = c55390xiz;
        this.KWHzl = imageView;
    }

    public static C21505hBw AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.RAQtXZ, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C21505hBw copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.ActivityResultContractsOpenDocumentTree;
        C55390xiz c55390xiz = (C55390xiz) ViewBindings.findChildViewById(view, i);
        if (c55390xiz != null) {
            i = C23274hvD.Application.getGmsPickeractivity_release;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                return new C21505hBw((android.widget.LinearLayout) view, c55390xiz, imageView);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
