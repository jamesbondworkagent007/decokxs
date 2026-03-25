package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.item.OKRegularCell;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hDF implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final OKRegularCell EZpvd;
    public final OKRegularCell KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public OKRegularCell getRoot() {
        return this.EZpvd;
    }

    public hDF(@androidx.annotation.NonNull OKRegularCell oKRegularCell, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull OKRegularCell oKRegularCell2) {
        this.EZpvd = oKRegularCell;
        this.AEQbTJ = imageView;
        this.KWHzl = oKRegularCell2;
    }

    public static hDF AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.DDjfYY, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static hDF copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.OnBackPressedDispatcherLifecycleOnBackPressedCancellable;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            OKRegularCell oKRegularCell = (OKRegularCell) view;
            return new hDF(oKRegularCell, imageView, oKRegularCell);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
