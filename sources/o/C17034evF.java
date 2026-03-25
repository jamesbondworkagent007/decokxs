package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.item.OKRegularCell;
import o.C13754dXa;

/* JADX INFO: renamed from: o.evF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C17034evF implements ViewBinding {
    public final OKRegularCell AEQbTJ;
    public final OKRegularCell KWHzl;
    public final android.widget.LinearLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.copydefault;
    }

    public C17034evF(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull OKRegularCell oKRegularCell, @androidx.annotation.NonNull OKRegularCell oKRegularCell2) {
        this.copydefault = linearLayout;
        this.KWHzl = oKRegularCell;
        this.AEQbTJ = oKRegularCell2;
    }

    public static C17034evF AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.DsfknC, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C17034evF KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.invokespecialDPHOMC;
        OKRegularCell oKRegularCell = (OKRegularCell) ViewBindings.findChildViewById(view, i);
        if (oKRegularCell != null) {
            i = C13754dXa.ActionBar.invokespecialROgMPW;
            OKRegularCell oKRegularCell2 = (OKRegularCell) ViewBindings.findChildViewById(view, i);
            if (oKRegularCell2 != null) {
                return new C17034evF((android.widget.LinearLayout) view, oKRegularCell, oKRegularCell2);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
