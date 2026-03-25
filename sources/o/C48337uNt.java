package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uNt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48337uNt implements ViewBinding {
    public final android.widget.FrameLayout EZpvd;
    public final wUK copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.EZpvd;
    }

    public C48337uNt(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull wUK wuk) {
        this.EZpvd = frameLayout;
        this.copydefault = wuk;
    }

    public static C48337uNt copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.ComponentActivityExternalSyntheticLambda1;
        wUK wuk = (wUK) ViewBindings.findChildViewById(view, i);
        if (wuk != null) {
            return new C48337uNt((android.widget.FrameLayout) view, wuk);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
