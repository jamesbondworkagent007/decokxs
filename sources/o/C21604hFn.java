package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hFn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21604hFn implements ViewBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final C21600hFj KWHzl;
    public final C55173xeu OLrzqt;
    public final C55113xdn copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.AEQbTJ;
    }

    public C21604hFn(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull C21600hFj c21600hFj) {
        this.AEQbTJ = frameLayout;
        this.OLrzqt = c55173xeu;
        this.copydefault = c55113xdn;
        this.KWHzl = c21600hFj;
    }

    public static C21604hFn KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.GcnicV, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C21604hFn EZpvd(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C23274hvD.Application.QOjuYg;
        C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
        if (c55173xeu != null) {
            i = C23274hvD.Application.MediaControllerCompatApi24TransportControls;
            C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
            if (c55113xdn != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.onLayoutChange))) != null) {
                return new C21604hFn((android.widget.FrameLayout) view, c55173xeu, c55113xdn, C21600hFj.OLrzqt(viewFindChildViewById));
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
