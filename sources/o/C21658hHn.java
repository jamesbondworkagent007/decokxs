package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hHn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21658hHn implements ViewBinding {
    public final C28055kNf AEQbTJ;
    public final LinearLayoutCompat KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.KWHzl;
    }

    public C21658hHn(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C28055kNf c28055kNf) {
        this.KWHzl = linearLayoutCompat;
        this.AEQbTJ = c28055kNf;
    }

    public static C21658hHn EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.aWuQzD, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C21658hHn KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.OeZisf;
        C28055kNf c28055kNf = (C28055kNf) ViewBindings.findChildViewById(view, i);
        if (c28055kNf != null) {
            return new C21658hHn((LinearLayoutCompat) view, c28055kNf);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
