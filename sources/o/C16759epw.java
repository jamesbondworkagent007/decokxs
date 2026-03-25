package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.item.OKRegularCell;
import o.C13754dXa;

/* JADX INFO: renamed from: o.epw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16759epw implements ViewBinding {
    public final OKRegularCell AEQbTJ;
    public final android.widget.ImageView OLrzqt;
    public final OKRegularCell copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public OKRegularCell getRoot() {
        return this.copydefault;
    }

    public C16759epw(@androidx.annotation.NonNull OKRegularCell oKRegularCell, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull OKRegularCell oKRegularCell2) {
        this.copydefault = oKRegularCell;
        this.OLrzqt = imageView;
        this.AEQbTJ = oKRegularCell2;
    }

    public static C16759epw EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.DcMfJKffREWX, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C16759epw KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.zeUJxr;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            OKRegularCell oKRegularCell = (OKRegularCell) view;
            return new C16759epw(oKRegularCell, imageView, oKRegularCell);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
