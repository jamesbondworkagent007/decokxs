package o;

import androidx.viewbinding.ViewBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vbe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50835vbe implements ViewBinding {
    public final C55021xcA AEQbTJ;
    public final C55021xcA KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C55021xcA getRoot() {
        return this.AEQbTJ;
    }

    public C50835vbe(@androidx.annotation.NonNull C55021xcA c55021xcA, @androidx.annotation.NonNull C55021xcA c55021xcA2) {
        this.AEQbTJ = c55021xcA;
        this.KWHzl = c55021xcA2;
    }

    public static C50835vbe EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.HJWChPfrwjPh, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C50835vbe AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        C55021xcA c55021xcA = (C55021xcA) view;
        return new C50835vbe(c55021xcA, c55021xcA);
    }
}
