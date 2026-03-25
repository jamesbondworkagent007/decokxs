package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uTc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48484uTc implements ViewBinding {
    public final C51601vqB AEQbTJ;
    public final LinearLayoutCompat KWHzl;
    public final LinearLayoutCompat OLrzqt;
    public final android.widget.ImageView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.KWHzl;
    }

    public C48484uTc(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C51601vqB c51601vqB, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull android.widget.ImageView imageView) {
        this.KWHzl = linearLayoutCompat;
        this.AEQbTJ = c51601vqB;
        this.OLrzqt = linearLayoutCompat2;
        this.copydefault = imageView;
    }

    public static C48484uTc OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.aCSzUz, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C48484uTc AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.fdt;
        C51601vqB c51601vqB = (C51601vqB) ViewBindings.findChildViewById(view, i);
        if (c51601vqB != null) {
            i = C48033uCm.Application.peekAvailableContext;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat != null) {
                i = C48033uCm.Application.R;
                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    return new C48484uTc((LinearLayoutCompat) view, c51601vqB, linearLayoutCompat, imageView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
