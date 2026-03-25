package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.item.OKRegularCell;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hDb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21538hDb implements ViewBinding {
    public final AppCompatImageView EZpvd;
    public final OKRegularCell KWHzl;
    public final OKRegularCell OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public OKRegularCell getRoot() {
        return this.OLrzqt;
    }

    public C21538hDb(@androidx.annotation.NonNull OKRegularCell oKRegularCell, @androidx.annotation.NonNull OKRegularCell oKRegularCell2, @androidx.annotation.NonNull AppCompatImageView appCompatImageView) {
        this.OLrzqt = oKRegularCell;
        this.KWHzl = oKRegularCell2;
        this.EZpvd = appCompatImageView;
    }

    public static C21538hDb copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.DcMfJKdMCrTj, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C21538hDb EZpvd(@androidx.annotation.NonNull android.view.View view) {
        OKRegularCell oKRegularCell = (OKRegularCell) view;
        int i = C23274hvD.Application.onReceiveResult;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            return new C21538hDb(oKRegularCell, oKRegularCell, appCompatImageView);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
