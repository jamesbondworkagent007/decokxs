package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C32549mfg;

/* JADX INFO: renamed from: o.mfk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C32553mfk implements ViewBinding {
    public final C55178xez AEQbTJ;
    public final C55113xdn EZpvd;
    public final LinearLayoutCompat KWHzl;
    public final LinearLayoutCompat OLrzqt;
    public final android.widget.FrameLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.copydefault;
    }

    public C32553mfk(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull C55178xez c55178xez) {
        this.copydefault = frameLayout;
        this.EZpvd = c55113xdn;
        this.KWHzl = linearLayoutCompat;
        this.OLrzqt = linearLayoutCompat2;
        this.AEQbTJ = c55178xez;
    }

    public static C32553mfk KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return OLrzqt(layoutInflater, null, false);
    }

    public static C32553mfk OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C32549mfg.TaskDescription.copydefault, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C32553mfk copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C32549mfg.ActionBar.EZpvd;
        C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
        if (c55113xdn != null) {
            i = C32549mfg.ActionBar.copydefault;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat != null) {
                i = C32549mfg.ActionBar.KWHzl;
                LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat2 != null) {
                    i = C32549mfg.ActionBar.OLrzqt;
                    C55178xez c55178xez = (C55178xez) ViewBindings.findChildViewById(view, i);
                    if (c55178xez != null) {
                        return new C32553mfk((android.widget.FrameLayout) view, c55113xdn, linearLayoutCompat, linearLayoutCompat2, c55178xez);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
