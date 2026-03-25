package o;

import androidx.viewbinding.ViewBinding;
import o.C8206ayP;

/* JADX INFO: renamed from: o.azh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C8277azh implements ViewBinding {
    public final C55178xez KWHzl;
    public final C55178xez OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C55178xez getRoot() {
        return this.OLrzqt;
    }

    public C8277azh(@androidx.annotation.NonNull C55178xez c55178xez, @androidx.annotation.NonNull C55178xez c55178xez2) {
        this.OLrzqt = c55178xez;
        this.KWHzl = c55178xez2;
    }

    public static C8277azh EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return KWHzl(layoutInflater, null, false);
    }

    public static C8277azh KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C8206ayP.Application.AYXKKw, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C8277azh AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        C55178xez c55178xez = (C55178xez) view;
        return new C8277azh(c55178xez, c55178xez);
    }
}
