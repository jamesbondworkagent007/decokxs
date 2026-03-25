package o;

import androidx.viewbinding.ViewBinding;
import o.C25493ixk;

/* JADX INFO: loaded from: classes18.dex */
public final class iIW implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.TextView getRoot() {
        return this.AEQbTJ;
    }

    public iIW(@androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.AEQbTJ = textView;
        this.KWHzl = textView2;
    }

    public static iIW copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.OFhtUX, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static iIW OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        android.widget.TextView textView = (android.widget.TextView) view;
        return new iIW(textView, textView);
    }
}
