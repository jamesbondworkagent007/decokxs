package o;

import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.item.OKRegularCell;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nJj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C33883nJj implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final OKRegularCell EZpvd;
    public final NestedScrollView KWHzl;
    public final OKRegularCell OLrzqt;
    public final NestedScrollView copydefault;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.copydefault;
    }

    public C33883nJj(@androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull NestedScrollView nestedScrollView2, @androidx.annotation.NonNull OKRegularCell oKRegularCell, @androidx.annotation.NonNull OKRegularCell oKRegularCell2, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.copydefault = nestedScrollView;
        this.AEQbTJ = linearLayout;
        this.KWHzl = nestedScrollView2;
        this.OLrzqt = oKRegularCell;
        this.EZpvd = oKRegularCell2;
        this.valueOf = textView;
    }

    public static C33883nJj AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.aKErDB, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C33883nJj AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C35399nuc.StateListAnimator.DGUQLI;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            i = C35399nuc.StateListAnimator.gqESXP;
            OKRegularCell oKRegularCell = (OKRegularCell) ViewBindings.findChildViewById(view, i);
            if (oKRegularCell != null) {
                i = C35399nuc.StateListAnimator.zEkrwr;
                OKRegularCell oKRegularCell2 = (OKRegularCell) ViewBindings.findChildViewById(view, i);
                if (oKRegularCell2 != null) {
                    i = C35399nuc.StateListAnimator.hTAtCx;
                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        return new C33883nJj(nestedScrollView, linearLayout, nestedScrollView, oKRegularCell, oKRegularCell2, textView);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
