package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uRm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48440uRm implements ViewBinding {
    public final C49858uwV AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final android.widget.ImageView KWHzl;
    public final LinearLayoutCompat copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.copydefault;
    }

    public C48440uRm(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull C49858uwV c49858uwV, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.copydefault = linearLayoutCompat;
        this.KWHzl = imageView;
        this.AEQbTJ = c49858uwV;
        this.EZpvd = textView;
    }

    public static C48440uRm KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.DGUQLIOvDItG, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C48440uRm OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.HJWChP;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C48033uCm.Application.HJWChPDXdlte;
            C49858uwV c49858uwV = (C49858uwV) ViewBindings.findChildViewById(view, i);
            if (c49858uwV != null) {
                i = C48033uCm.Application.MediaControllerCompatMediaControllerExtraData;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    return new C48440uRm((LinearLayoutCompat) view, imageView, c49858uwV, textView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
