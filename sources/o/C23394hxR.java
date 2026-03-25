package o;

import androidx.viewbinding.ViewBinding;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hxR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C23394hxR implements ViewBinding {
    public final android.widget.TextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.TextView getRoot() {
        return this.copydefault;
    }

    public C23394hxR(@androidx.annotation.NonNull android.widget.TextView textView) {
        this.copydefault = textView;
    }

    public static C23394hxR EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.QVAiDq, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C23394hxR OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        return new C23394hxR((android.widget.TextView) view);
    }
}
