package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.item.OKRegularCell;
import o.C13754dXa;

/* JADX INFO: renamed from: o.epB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C16712epB implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final OKRegularCell EZpvd;
    public final android.widget.TextView KWHzl;
    public final OKRegularCell OLrzqt;
    public final LinearLayoutCompat copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public OKRegularCell getRoot() {
        return this.OLrzqt;
    }

    public C16712epB(@androidx.annotation.NonNull OKRegularCell oKRegularCell, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull OKRegularCell oKRegularCell2, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.OLrzqt = oKRegularCell;
        this.AEQbTJ = imageView;
        this.copydefault = linearLayoutCompat;
        this.EZpvd = oKRegularCell2;
        this.KWHzl = textView;
    }

    public static C16712epB EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.DcMfJKsgNvtZ, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C16712epB AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.validateAndPutInMap;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C13754dXa.ActionBar.extraCallbackWithResult;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat != null) {
                OKRegularCell oKRegularCell = (OKRegularCell) view;
                i = C13754dXa.ActionBar.ImmLeaksCleaner;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    return new C16712epB(oKRegularCell, imageView, linearLayoutCompat, oKRegularCell, textView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
