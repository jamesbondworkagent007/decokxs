package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eub, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C17003eub implements ViewBinding {
    public final C16797eqh AEQbTJ;
    public final C16797eqh EZpvd;
    public final android.widget.LinearLayout OLrzqt;
    public final C16797eqh copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.OLrzqt;
    }

    public C17003eub(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C16797eqh c16797eqh, @androidx.annotation.NonNull C16797eqh c16797eqh2, @androidx.annotation.NonNull C16797eqh c16797eqh3) {
        this.OLrzqt = linearLayout;
        this.EZpvd = c16797eqh;
        this.copydefault = c16797eqh2;
        this.AEQbTJ = c16797eqh3;
    }

    public static C17003eub AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.iqeXgQ, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C17003eub copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.fERRXa;
        android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            C16797eqh c16797eqhAEQbTJ = C16797eqh.AEQbTJ(viewFindChildViewById);
            int i2 = C13754dXa.ActionBar.ixgjPv;
            android.view.View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i2);
            if (viewFindChildViewById2 != null) {
                C16797eqh c16797eqhAEQbTJ2 = C16797eqh.AEQbTJ(viewFindChildViewById2);
                int i3 = C13754dXa.ActionBar.DCUTEIdCUTEI;
                android.view.View viewFindChildViewById3 = ViewBindings.findChildViewById(view, i3);
                if (viewFindChildViewById3 != null) {
                    return new C17003eub((android.widget.LinearLayout) view, c16797eqhAEQbTJ, c16797eqhAEQbTJ2, C16797eqh.AEQbTJ(viewFindChildViewById3));
                }
                i = i3;
            } else {
                i = i2;
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
