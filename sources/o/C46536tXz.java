package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.item.OKRegularCell;
import o.C46526tXp;

/* JADX INFO: renamed from: o.tXz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46536tXz implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final OKRegularCell KWHzl;
    public final OKRegularCell OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public OKRegularCell getRoot() {
        return this.OLrzqt;
    }

    public C46536tXz(@androidx.annotation.NonNull OKRegularCell oKRegularCell, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull OKRegularCell oKRegularCell2) {
        this.OLrzqt = oKRegularCell;
        this.AEQbTJ = imageView;
        this.KWHzl = oKRegularCell2;
    }

    public static C46536tXz copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C46526tXp.ActionBar.gEmmrt, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C46536tXz KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C46526tXp.Application.KWHzl;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            OKRegularCell oKRegularCell = (OKRegularCell) view;
            return new C46536tXz(oKRegularCell, imageView, oKRegularCell);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
