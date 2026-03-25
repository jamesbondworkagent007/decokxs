package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.item.OKRegularCell;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uOe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C48349uOe implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final OKRegularCell EZpvd;
    public final android.widget.ImageView KWHzl;
    public final ConstraintLayout OLrzqt;
    public final RecyclerView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.OLrzqt;
    }

    public C48349uOe(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull OKRegularCell oKRegularCell, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.OLrzqt = constraintLayout;
        this.copydefault = recyclerView;
        this.EZpvd = oKRegularCell;
        this.KWHzl = imageView;
        this.AEQbTJ = textView;
    }

    public static C48349uOe AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.OBJEWx, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C48349uOe AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.postWhenReportersAreDone;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = C48033uCm.Application.setHomeActionContentDescription;
            OKRegularCell oKRegularCell = (OKRegularCell) ViewBindings.findChildViewById(view, i);
            if (oKRegularCell != null) {
                i = C48033uCm.Application.setHomeButtonEnabled;
                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C48033uCm.Application.endOnGoingFadeAnimation;
                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        return new C48349uOe((ConstraintLayout) view, recyclerView, oKRegularCell, imageView, textView);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
