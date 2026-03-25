package o;

import androidx.viewbinding.ViewBinding;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iJa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C23780iJa implements ViewBinding {
    public final android.widget.TextView OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.TextView getRoot() {
        return this.OLrzqt;
    }

    public C23780iJa(@androidx.annotation.NonNull android.widget.TextView textView) {
        this.OLrzqt = textView;
    }

    public static C23780iJa OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.QCjLjM, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C23780iJa EZpvd(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        return new C23780iJa((android.widget.TextView) view);
    }
}
