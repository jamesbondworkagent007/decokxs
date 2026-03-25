package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.evC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C17031evC implements ViewBinding {
    public final ConstraintLayout EZpvd;
    public final C55178xez copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.EZpvd;
    }

    public C17031evC(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C55178xez c55178xez) {
        this.EZpvd = constraintLayout;
        this.copydefault = c55178xez;
    }

    public static C17031evC copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.zlzhuY, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C17031evC KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.rateWithExtras;
        C55178xez c55178xez = (C55178xez) ViewBindings.findChildViewById(view, i);
        if (c55178xez != null) {
            return new C17031evC((ConstraintLayout) view, c55178xez);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
