package o;

import androidx.viewbinding.ViewBinding;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hxs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C23421hxs implements ViewBinding {
    public final C55113xdn KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C55113xdn getRoot() {
        return this.KWHzl;
    }

    public C23421hxs(@androidx.annotation.NonNull C55113xdn c55113xdn) {
        this.KWHzl = c55113xdn;
    }

    public static C23421hxs OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.AkhnZx, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C23421hxs KWHzl(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        return new C23421hxs((C55113xdn) view);
    }
}
