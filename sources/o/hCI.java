package o;

import androidx.viewbinding.ViewBinding;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hCI implements ViewBinding {
    public final C22313hcx EZpvd;
    public final C22313hcx KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C22313hcx getRoot() {
        return this.EZpvd;
    }

    public hCI(@androidx.annotation.NonNull C22313hcx c22313hcx, @androidx.annotation.NonNull C22313hcx c22313hcx2) {
        this.EZpvd = c22313hcx;
        this.KWHzl = c22313hcx2;
    }

    public static hCI EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.DMb, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static hCI EZpvd(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        C22313hcx c22313hcx = (C22313hcx) view;
        return new hCI(c22313hcx, c22313hcx);
    }
}
