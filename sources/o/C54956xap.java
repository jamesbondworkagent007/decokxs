package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C52761wXj;

/* JADX INFO: renamed from: o.xap, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54956xap implements ViewBinding {
    public final AppCompatTextView AEQbTJ;
    public final wYK EZpvd;
    public final AppCompatTextView KWHzl;
    public final AppCompatImageView OLrzqt;
    public final C55055xci copydefault;
    public final android.widget.RelativeLayout gEmmrt;
    public final AppCompatTextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.RelativeLayout getRoot() {
        return this.gEmmrt;
    }

    public C54956xap(@androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout, @androidx.annotation.NonNull wYK wyk, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull C55055xci c55055xci, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3) {
        this.gEmmrt = relativeLayout;
        this.EZpvd = wyk;
        this.AEQbTJ = appCompatTextView;
        this.KWHzl = appCompatTextView2;
        this.copydefault = c55055xci;
        this.OLrzqt = appCompatImageView;
        this.valueOf = appCompatTextView3;
    }

    public static C54956xap AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C52761wXj.Fragment.QKVWgx, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C54956xap copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C52761wXj.FragmentManager.zLjUOn;
        wYK wyk = (wYK) ViewBindings.findChildViewById(view, i);
        if (wyk != null) {
            i = C52761wXj.FragmentManager.OcIXYQ;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView != null) {
                i = C52761wXj.FragmentManager.fFgQHt;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView2 != null) {
                    i = C52761wXj.FragmentManager.AxsJAYsNCnLh;
                    C55055xci c55055xci = (C55055xci) ViewBindings.findChildViewById(view, i);
                    if (c55055xci != null) {
                        i = C52761wXj.FragmentManager.RKDWNf;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                        if (appCompatImageView != null) {
                            i = C52761wXj.FragmentManager.iKEqwx;
                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                            if (appCompatTextView3 != null) {
                                return new C54956xap((android.widget.RelativeLayout) view, wyk, appCompatTextView, appCompatTextView2, c55055xci, appCompatImageView, appCompatTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
