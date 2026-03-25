package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rcr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42781rcr implements ViewBinding {
    public final C55113xdn AEQbTJ;
    public final C40499qYc EZpvd;
    public final jKC KWHzl;
    public final LinearLayoutCompat OLrzqt;
    public final C55173xeu copydefault;
    public final AppCompatTextView djBIcL;
    public final RecyclerView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C40499qYc getRoot() {
        return this.EZpvd;
    }

    public C42781rcr(@androidx.annotation.NonNull C40499qYc c40499qYc, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull jKC jkc, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView) {
        this.EZpvd = c40499qYc;
        this.copydefault = c55173xeu;
        this.AEQbTJ = c55113xdn;
        this.KWHzl = jkc;
        this.OLrzqt = linearLayoutCompat;
        this.valueOf = recyclerView;
        this.djBIcL = appCompatTextView;
    }

    public static C42781rcr KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.YqksP, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C42781rcr OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.Swccd;
        C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
        if (c55173xeu != null) {
            i = qZH.StateListAnimator.pXZxY;
            C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
            if (c55113xdn != null) {
                i = qZH.StateListAnimator.gdwsGQ;
                jKC jkc = (jKC) ViewBindings.findChildViewById(view, i);
                if (jkc != null) {
                    i = qZH.StateListAnimator.DzOuPm;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                    if (linearLayoutCompat != null) {
                        i = qZH.StateListAnimator.zlzhuY;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                        if (recyclerView != null) {
                            i = qZH.StateListAnimator.warmup;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                            if (appCompatTextView != null) {
                                return new C42781rcr((C40499qYc) view, c55173xeu, c55113xdn, jkc, linearLayoutCompat, recyclerView, appCompatTextView);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
