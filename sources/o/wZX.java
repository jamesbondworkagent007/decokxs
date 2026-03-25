package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.item.OKRegularCell;
import o.C52761wXj;

/* JADX INFO: loaded from: classes11.dex */
public final class wZX implements ViewBinding {
    public final OKRegularCell KWHzl;
    public final android.widget.ImageView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public OKRegularCell getRoot() {
        return this.KWHzl;
    }

    public wZX(@androidx.annotation.NonNull OKRegularCell oKRegularCell, @androidx.annotation.NonNull android.widget.ImageView imageView) {
        this.KWHzl = oKRegularCell;
        this.copydefault = imageView;
    }

    public static wZX AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return copydefault(layoutInflater, null, false);
    }

    public static wZX copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C52761wXj.Fragment.DbNXlk, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static wZX copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C52761wXj.FragmentManager.zYHWMc;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            return new wZX((OKRegularCell) view, imageView);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
