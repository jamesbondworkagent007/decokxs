package o;

import androidx.viewbinding.ViewBinding;
import o.C25493ixk;

/* JADX INFO: loaded from: classes18.dex */
public final class iIS implements ViewBinding {
    public final android.view.View EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.EZpvd;
    }

    public iIS(@androidx.annotation.NonNull android.view.View view) {
        this.EZpvd = view;
    }

    public static iIS EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.dmfpNf, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static iIS copydefault(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        return new iIS(view);
    }
}
