package o;

import androidx.viewbinding.ViewBinding;
import o.C25493ixk;

/* JADX INFO: loaded from: classes18.dex */
public final class iIV implements ViewBinding {
    public final android.widget.TextView OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.TextView getRoot() {
        return this.OLrzqt;
    }

    public iIV(@androidx.annotation.NonNull android.widget.TextView textView) {
        this.OLrzqt = textView;
    }

    public static iIV OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.ODXsMY, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static iIV KWHzl(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        return new iIV((android.widget.TextView) view);
    }
}
