package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hHj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21654hHj implements ViewBinding {
    public final C55008xbo AEQbTJ;
    public final C55008xbo EZpvd;
    public final LinearLayoutCompat KWHzl;
    public final LinearLayoutCompat OLrzqt;
    public final C28055kNf copydefault;
    public final AppCompatTextView djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.OLrzqt;
    }

    public C21654hHj(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C55008xbo c55008xbo, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull C55008xbo c55008xbo2, @androidx.annotation.NonNull C28055kNf c28055kNf, @androidx.annotation.NonNull AppCompatTextView appCompatTextView) {
        this.OLrzqt = linearLayoutCompat;
        this.EZpvd = c55008xbo;
        this.KWHzl = linearLayoutCompat2;
        this.AEQbTJ = c55008xbo2;
        this.copydefault = c28055kNf;
        this.djBIcL = appCompatTextView;
    }

    public static C21654hHj KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.jFiva, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C21654hHj EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.GqbzPL;
        C55008xbo c55008xbo = (C55008xbo) ViewBindings.findChildViewById(view, i);
        if (c55008xbo != null) {
            i = C23274hvD.Application.Dff;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat != null) {
                i = C23274hvD.Application.GzAsTt;
                C55008xbo c55008xbo2 = (C55008xbo) ViewBindings.findChildViewById(view, i);
                if (c55008xbo2 != null) {
                    i = C23274hvD.Application.OeZisf;
                    C28055kNf c28055kNf = (C28055kNf) ViewBindings.findChildViewById(view, i);
                    if (c28055kNf != null) {
                        i = C23274hvD.Application.onDrawerStateChanged;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView != null) {
                            return new C21654hHj((LinearLayoutCompat) view, c55008xbo, linearLayoutCompat, c55008xbo2, c28055kNf, appCompatTextView);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
