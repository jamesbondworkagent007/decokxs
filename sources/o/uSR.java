package o;

import androidx.viewbinding.ViewBinding;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public final class uSR implements ViewBinding {
    public final C52834waB EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C52834waB getRoot() {
        return this.EZpvd;
    }

    public uSR(@androidx.annotation.NonNull C52834waB c52834waB) {
        this.EZpvd = c52834waB;
    }

    public static uSR copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.invokespecialatDTRm, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static uSR copydefault(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        return new uSR((C52834waB) view);
    }
}
