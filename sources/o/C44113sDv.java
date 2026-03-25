package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.flexbox.FlexboxLayout;
import o.C44105sDn;

/* JADX INFO: renamed from: o.sDv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C44113sDv implements ViewBinding {
    public final FlexboxLayout AEQbTJ;
    public final sDG EZpvd;
    public final C44106sDo KWHzl;
    public final C44106sDo OLrzqt;
    public final C44106sDo copydefault;
    public final FlexboxLayout gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public FlexboxLayout getRoot() {
        return this.gEmmrt;
    }

    public C44113sDv(@androidx.annotation.NonNull FlexboxLayout flexboxLayout, @androidx.annotation.NonNull C44106sDo c44106sDo, @androidx.annotation.NonNull C44106sDo c44106sDo2, @androidx.annotation.NonNull C44106sDo c44106sDo3, @androidx.annotation.NonNull sDG sdg, @androidx.annotation.NonNull FlexboxLayout flexboxLayout2) {
        this.gEmmrt = flexboxLayout;
        this.copydefault = c44106sDo;
        this.OLrzqt = c44106sDo2;
        this.KWHzl = c44106sDo3;
        this.EZpvd = sdg;
        this.AEQbTJ = flexboxLayout2;
    }

    public static C44113sDv copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C44105sDn.StateListAnimator.AEQbTJ, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C44113sDv OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C44105sDn.ActionBar.AhwBna;
        android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            C44106sDo c44106sDoOLrzqt = C44106sDo.OLrzqt(viewFindChildViewById);
            i = C44105sDn.ActionBar.gEmmrt;
            android.view.View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i);
            if (viewFindChildViewById2 != null) {
                C44106sDo c44106sDoOLrzqt2 = C44106sDo.OLrzqt(viewFindChildViewById2);
                i = C44105sDn.ActionBar.values;
                android.view.View viewFindChildViewById3 = ViewBindings.findChildViewById(view, i);
                if (viewFindChildViewById3 != null) {
                    C44106sDo c44106sDoOLrzqt3 = C44106sDo.OLrzqt(viewFindChildViewById3);
                    i = C44105sDn.ActionBar.isConnected;
                    android.view.View viewFindChildViewById4 = ViewBindings.findChildViewById(view, i);
                    if (viewFindChildViewById4 != null) {
                        FlexboxLayout flexboxLayout = (FlexboxLayout) view;
                        return new C44113sDv(flexboxLayout, c44106sDoOLrzqt, c44106sDoOLrzqt2, c44106sDoOLrzqt3, sDG.KWHzl(viewFindChildViewById4), flexboxLayout);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
