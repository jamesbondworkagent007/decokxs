package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C52761wXj;

/* JADX INFO: renamed from: o.xam, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54953xam implements ViewBinding {
    public final Group EZpvd;
    public final wYK KWHzl;
    public final AppCompatTextView OLrzqt;
    public final android.view.View copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.copydefault;
    }

    public C54953xam(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull wYK wyk, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull Group group) {
        this.copydefault = view;
        this.KWHzl = wyk;
        this.OLrzqt = appCompatTextView;
        this.EZpvd = group;
    }

    public static C54953xam OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C52761wXj.Fragment.zuBGHE, viewGroup);
        return copydefault(viewGroup);
    }

    public static C54953xam copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C52761wXj.FragmentManager.zLjUOn;
        wYK wyk = (wYK) ViewBindings.findChildViewById(view, i);
        if (wyk != null) {
            i = C52761wXj.FragmentManager.dxcTrN;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView != null) {
                i = C52761wXj.FragmentManager.ODWQjV;
                Group group = (Group) ViewBindings.findChildViewById(view, i);
                if (group != null) {
                    return new C54953xam(view, wyk, appCompatTextView, group);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
