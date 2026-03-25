package o;

import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.item.OKRegularCell;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uRr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C48445uRr implements ViewBinding {
    public final CardView AEQbTJ;
    public final android.widget.ImageView KWHzl;
    public final OKRegularCell copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public CardView getRoot() {
        return this.AEQbTJ;
    }

    public C48445uRr(@androidx.annotation.NonNull CardView cardView, @androidx.annotation.NonNull OKRegularCell oKRegularCell, @androidx.annotation.NonNull android.widget.ImageView imageView) {
        this.AEQbTJ = cardView;
        this.copydefault = oKRegularCell;
        this.KWHzl = imageView;
    }

    public static C48445uRr OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.DrqXHJ, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C48445uRr AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.OzhFjl;
        OKRegularCell oKRegularCell = (OKRegularCell) ViewBindings.findChildViewById(view, i);
        if (oKRegularCell != null) {
            i = C48033uCm.Application.zeUYeG;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                return new C48445uRr((CardView) view, oKRegularCell, imageView);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
