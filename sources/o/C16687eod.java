package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eod, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16687eod implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final android.widget.FrameLayout KWHzl;
    public final android.widget.LinearLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.copydefault;
    }

    public C16687eod(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.view.View view) {
        this.copydefault = linearLayout;
        this.KWHzl = frameLayout;
        this.AEQbTJ = view;
    }

    public static C16687eod AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.Rtjmuc, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C16687eod EZpvd(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C13754dXa.ActionBar.XW;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C13754dXa.ActionBar.MediaSessionCompatMediaSessionImplApi191))) != null) {
            return new C16687eod((android.widget.LinearLayout) view, frameLayout, viewFindChildViewById);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
