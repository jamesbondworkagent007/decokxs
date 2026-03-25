package o;

import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: o.hAe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C21460hAe implements ViewBinding {
    public final C19927gUm AEQbTJ;
    public final C19927gUm copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C19927gUm getRoot() {
        return this.copydefault;
    }

    public C21460hAe(@androidx.annotation.NonNull C19927gUm c19927gUm, @androidx.annotation.NonNull C19927gUm c19927gUm2) {
        this.copydefault = c19927gUm;
        this.AEQbTJ = c19927gUm2;
    }

    public static C21460hAe AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        C19927gUm c19927gUm = (C19927gUm) view;
        return new C21460hAe(c19927gUm, c19927gUm);
    }
}
