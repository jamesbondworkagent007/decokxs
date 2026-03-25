package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.item.OKRegularCell;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hGk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21628hGk implements ViewBinding {
    public final OKRegularCell AEQbTJ;
    public final AppCompatImageView KWHzl;
    public final OKRegularCell OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public OKRegularCell getRoot() {
        return this.OLrzqt;
    }

    public C21628hGk(@androidx.annotation.NonNull OKRegularCell oKRegularCell, @androidx.annotation.NonNull OKRegularCell oKRegularCell2, @androidx.annotation.NonNull AppCompatImageView appCompatImageView) {
        this.OLrzqt = oKRegularCell;
        this.AEQbTJ = oKRegularCell2;
        this.KWHzl = appCompatImageView;
    }

    public static C21628hGk OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.gCNefq, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C21628hGk KWHzl(@androidx.annotation.NonNull android.view.View view) {
        OKRegularCell oKRegularCell = (OKRegularCell) view;
        int i = C23274hvD.Application.addPreRequisiteCollector;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            return new C21628hGk(oKRegularCell, oKRegularCell, appCompatImageView);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
