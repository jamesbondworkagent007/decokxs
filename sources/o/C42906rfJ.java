package o;

import androidx.viewbinding.ViewBinding;
import o.qZH;

/* JADX INFO: renamed from: o.rfJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42906rfJ implements ViewBinding {
    public final C52794wYp EZpvd;
    public final C52794wYp copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C52794wYp getRoot() {
        return this.copydefault;
    }

    public C42906rfJ(@androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull C52794wYp c52794wYp2) {
        this.copydefault = c52794wYp;
        this.EZpvd = c52794wYp2;
    }

    public static C42906rfJ AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.GFUIi, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C42906rfJ EZpvd(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        C52794wYp c52794wYp = (C52794wYp) view;
        return new C42906rfJ(c52794wYp, c52794wYp);
    }
}
