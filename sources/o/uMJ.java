package o;

import androidx.viewbinding.ViewBinding;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public final class uMJ implements ViewBinding {
    public final android.widget.LinearLayout EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.EZpvd;
    }

    public uMJ(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout) {
        this.EZpvd = linearLayout;
    }

    public static uMJ KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.hDKMBd, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static uMJ AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        return new uMJ((android.widget.LinearLayout) view);
    }
}
