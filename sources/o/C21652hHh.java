package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hHh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21652hHh implements ViewBinding {
    public final AppCompatTextView AEQbTJ;
    public final LinearLayoutCompat EZpvd;
    public final C55008xbo KWHzl;
    public final LinearLayoutCompat OLrzqt;
    public final C55008xbo copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.EZpvd;
    }

    public C21652hHh(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C55008xbo c55008xbo, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull C55008xbo c55008xbo2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView) {
        this.EZpvd = linearLayoutCompat;
        this.copydefault = c55008xbo;
        this.OLrzqt = linearLayoutCompat2;
        this.KWHzl = c55008xbo2;
        this.AEQbTJ = appCompatTextView;
    }

    public static C21652hHh copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.iMXFZQ, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C21652hHh EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.GqbzPL;
        C55008xbo c55008xbo = (C55008xbo) ViewBindings.findChildViewById(view, i);
        if (c55008xbo != null) {
            i = C23274hvD.Application.Dff;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat != null) {
                i = C23274hvD.Application.GzAsTt;
                C55008xbo c55008xbo2 = (C55008xbo) ViewBindings.findChildViewById(view, i);
                if (c55008xbo2 != null) {
                    i = C23274hvD.Application.onDrawerStateChanged;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView != null) {
                        return new C21652hHh((LinearLayoutCompat) view, c55008xbo, linearLayoutCompat, c55008xbo2, appCompatTextView);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
