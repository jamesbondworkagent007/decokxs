package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: loaded from: classes18.dex */
public final class iIY implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final C23781iJb OLrzqt;
    public final C23781iJb copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.AEQbTJ;
    }

    public iIY(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C23781iJb c23781iJb, @androidx.annotation.NonNull C23781iJb c23781iJb2) {
        this.AEQbTJ = linearLayout;
        this.OLrzqt = c23781iJb;
        this.copydefault = c23781iJb2;
    }

    public static iIY EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.QVsKAR, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static iIY AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.OijiEz;
        android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            C23781iJb c23781iJbKWHzl = C23781iJb.KWHzl(viewFindChildViewById);
            int i2 = C25493ixk.ActionBar.UfveVb;
            android.view.View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i2);
            if (viewFindChildViewById2 != null) {
                return new iIY((android.widget.LinearLayout) view, c23781iJbKWHzl, C23781iJb.KWHzl(viewFindChildViewById2));
            }
            i = i2;
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
