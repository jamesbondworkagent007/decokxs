package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ewi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17116ewi implements ViewBinding {
    public final ConstraintLayout EZpvd;
    public final C54989xbV KWHzl;
    public final android.widget.TextView OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.EZpvd;
    }

    public C17116ewi(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C54989xbV c54989xbV, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.EZpvd = constraintLayout;
        this.KWHzl = c54989xbV;
        this.OLrzqt = textView;
    }

    public static C17116ewi OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.OAjjVP, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C17116ewi AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.invokespecialgBtXYZ;
        C54989xbV c54989xbV = (C54989xbV) ViewBindings.findChildViewById(view, i);
        if (c54989xbV != null) {
            i = C13754dXa.ActionBar.DrawableRes;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                return new C17116ewi((ConstraintLayout) view, c54989xbV, textView);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
