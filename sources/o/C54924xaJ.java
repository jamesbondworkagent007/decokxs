package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C52761wXj;

/* JADX INFO: renamed from: o.xaJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54924xaJ implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final C55317xhf EZpvd;
    public final RecyclerView KWHzl;
    public final AppCompatTextView OLrzqt;
    public final AppCompatTextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.AEQbTJ;
    }

    public C54924xaJ(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C55317xhf c55317xhf, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2) {
        this.AEQbTJ = view;
        this.EZpvd = c55317xhf;
        this.KWHzl = recyclerView;
        this.copydefault = appCompatTextView;
        this.OLrzqt = appCompatTextView2;
    }

    public static C54924xaJ EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C52761wXj.Fragment.iZzfmt, viewGroup);
        return OLrzqt(viewGroup);
    }

    public static C54924xaJ OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C52761wXj.FragmentManager.QSBOWP;
        C55317xhf c55317xhf = (C55317xhf) ViewBindings.findChildViewById(view, i);
        if (c55317xhf != null) {
            i = C52761wXj.FragmentManager.fsSxsn;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = C52761wXj.FragmentManager.iCPUKe;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView != null) {
                    i = C52761wXj.FragmentManager.RAQtXZ;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView2 != null) {
                        return new C54924xaJ(view, c55317xhf, recyclerView, appCompatTextView, appCompatTextView2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
