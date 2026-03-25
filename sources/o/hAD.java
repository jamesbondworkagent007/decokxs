package o;

import androidx.viewbinding.ViewBinding;
import o.C23274hvD;

/* JADX INFO: loaded from: classes23.dex */
public final class hAD implements ViewBinding {
    public final C22088hXl KWHzl;
    public final C22088hXl OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C22088hXl getRoot() {
        return this.KWHzl;
    }

    public hAD(@androidx.annotation.NonNull C22088hXl c22088hXl, @androidx.annotation.NonNull C22088hXl c22088hXl2) {
        this.KWHzl = c22088hXl;
        this.OLrzqt = c22088hXl2;
    }

    public static hAD EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.sVXHln, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static hAD AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        C22088hXl c22088hXl = (C22088hXl) view;
        return new hAD(c22088hXl, c22088hXl);
    }
}
