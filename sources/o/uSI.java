package o;

import androidx.viewbinding.ViewBinding;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public final class uSI implements ViewBinding {
    public final C47988uAv KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C47988uAv getRoot() {
        return this.KWHzl;
    }

    public uSI(@androidx.annotation.NonNull C47988uAv c47988uAv) {
        this.KWHzl = c47988uAv;
    }

    public static uSI EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return OLrzqt(layoutInflater, null, false);
    }

    public static uSI OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.invokespecialDaTmkG, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static uSI AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        return new uSI((C47988uAv) view);
    }
}
