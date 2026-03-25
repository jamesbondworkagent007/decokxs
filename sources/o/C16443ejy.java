package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ejy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C16443ejy implements ViewBinding {
    public final C33537myN AEQbTJ;
    public final android.widget.LinearLayout EZpvd;
    public final AbstractC17185exy KWHzl;
    public final AbstractC17185exy copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.EZpvd;
    }

    public C16443ejy(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C33537myN c33537myN, @androidx.annotation.NonNull AbstractC17185exy abstractC17185exy, @androidx.annotation.NonNull AbstractC17185exy abstractC17185exy2) {
        this.EZpvd = linearLayout;
        this.AEQbTJ = c33537myN;
        this.copydefault = abstractC17185exy;
        this.KWHzl = abstractC17185exy2;
    }

    public static C16443ejy EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return AEQbTJ(layoutInflater, null, false);
    }

    public static C16443ejy AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.QCjLjM, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C16443ejy EZpvd(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C13754dXa.ActionBar.accept;
        C33537myN c33537myN = (C33537myN) ViewBindings.findChildViewById(view, i);
        if (c33537myN != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C13754dXa.ActionBar.UccSpe))) != null) {
            AbstractC17185exy abstractC17185exyOLrzqt = AbstractC17185exy.OLrzqt(viewFindChildViewById);
            int i2 = C13754dXa.ActionBar.ggKfIT;
            android.view.View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i2);
            if (viewFindChildViewById2 != null) {
                return new C16443ejy((android.widget.LinearLayout) view, c33537myN, abstractC17185exyOLrzqt, AbstractC17185exy.OLrzqt(viewFindChildViewById2));
            }
            i = i2;
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
