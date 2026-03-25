package o;

import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hzE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23487hzE implements ViewBinding {
    public final NestedScrollView EZpvd;
    public final android.widget.TextView KWHzl;
    public final RecyclerView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.EZpvd;
    }

    public C23487hzE(@androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull RecyclerView recyclerView) {
        this.EZpvd = nestedScrollView;
        this.KWHzl = textView;
        this.copydefault = recyclerView;
    }

    public static C23487hzE OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.Dmq, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C23487hzE AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.onChildrenLoaded;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C23274hvD.Application.setDescription;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                return new C23487hzE((NestedScrollView) view, textView, recyclerView);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
