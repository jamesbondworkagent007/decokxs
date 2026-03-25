package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C8206ayP;

/* JADX INFO: renamed from: o.azP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C8259azP implements ViewBinding {
    public final android.widget.LinearLayout EZpvd;
    public final C55178xez copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.EZpvd;
    }

    public C8259azP(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C55178xez c55178xez) {
        this.EZpvd = linearLayout;
        this.copydefault = c55178xez;
    }

    public static C8259azP EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C8206ayP.Application.djSkpj, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C8259azP copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C8206ayP.StateListAnimator.DGUQLIDGUQLI;
        C55178xez c55178xez = (C55178xez) ViewBindings.findChildViewById(view, i);
        if (c55178xez != null) {
            return new C8259azP((android.widget.LinearLayout) view, c55178xez);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
