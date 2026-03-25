package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eqd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C16793eqd implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final ShapeableImageView EZpvd;
    public final android.widget.TextView OLrzqt;
    public final ConstraintLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.copydefault;
    }

    public C16793eqd(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull ShapeableImageView shapeableImageView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.copydefault = constraintLayout;
        this.OLrzqt = textView;
        this.EZpvd = shapeableImageView;
        this.AEQbTJ = textView2;
    }

    public static C16793eqd OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.dbwnZN, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C16793eqd copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.AxsJAY;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C13754dXa.ActionBar.znKlvJ;
            ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
            if (shapeableImageView != null) {
                i = C13754dXa.ActionBar.MediaBrowserCompatMediaBrowserImplApi211;
                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    return new C16793eqd((ConstraintLayout) view, textView, shapeableImageView, textView2);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
