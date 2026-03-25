package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.enH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16612enH implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final AbstractC16836erT EZpvd;
    public final AbstractC16836erT OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.AEQbTJ;
    }

    public C16612enH(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull AbstractC16836erT abstractC16836erT, @androidx.annotation.NonNull AbstractC16836erT abstractC16836erT2) {
        this.AEQbTJ = linearLayout;
        this.OLrzqt = abstractC16836erT;
        this.EZpvd = abstractC16836erT2;
    }

    public static C16612enH EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.invokespecialaGOrKO, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C16612enH KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.GiPPlLQAswws;
        android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            AbstractC16836erT abstractC16836erTOLrzqt = AbstractC16836erT.OLrzqt(viewFindChildViewById);
            int i2 = C13754dXa.ActionBar.getOptionsList;
            android.view.View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i2);
            if (viewFindChildViewById2 != null) {
                return new C16612enH((android.widget.LinearLayout) view, abstractC16836erTOLrzqt, AbstractC16836erT.OLrzqt(viewFindChildViewById2));
            }
            i = i2;
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
