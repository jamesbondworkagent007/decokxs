package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C57406yhn;

/* JADX INFO: renamed from: o.yhY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C57391yhY implements ViewBinding {
    public final C55008xbo EZpvd;
    public final AppCompatTextView OLrzqt;
    public final android.view.View copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.copydefault;
    }

    public C57391yhY(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C55008xbo c55008xbo, @androidx.annotation.NonNull AppCompatTextView appCompatTextView) {
        this.copydefault = view;
        this.EZpvd = c55008xbo;
        this.OLrzqt = appCompatTextView;
    }

    public static C57391yhY copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C57406yhn.TaskDescription.ORxRYg, viewGroup);
        return AEQbTJ(viewGroup);
    }

    public static C57391yhY AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C57406yhn.StateListAnimator.uzCIH;
        C55008xbo c55008xbo = (C55008xbo) ViewBindings.findChildViewById(view, i);
        if (c55008xbo != null) {
            i = C57406yhn.StateListAnimator.Ufzxmz;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView != null) {
                return new C57391yhY(view, c55008xbo, appCompatTextView);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
