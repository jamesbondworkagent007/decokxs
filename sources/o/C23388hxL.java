package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hxL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C23388hxL implements ViewBinding {
    public final AppCompatImageView AEQbTJ;
    public final AppCompatTextView AYXKKw;
    public final RecyclerView EZpvd;
    public final LinearLayoutCompat KWHzl;
    public final LinearLayoutCompat OLrzqt;
    public final LinearLayoutCompat copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.copydefault;
    }

    public C23388hxL(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat3, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView) {
        this.copydefault = linearLayoutCompat;
        this.OLrzqt = linearLayoutCompat2;
        this.AEQbTJ = appCompatImageView;
        this.KWHzl = linearLayoutCompat3;
        this.EZpvd = recyclerView;
        this.AYXKKw = appCompatTextView;
    }

    public static C23388hxL KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return copydefault(layoutInflater, null, false);
    }

    public static C23388hxL copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.ORxRYg, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C23388hxL KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.DcMfJKRKUgwx;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
        if (linearLayoutCompat != null) {
            i = C23274hvD.Application.WFXFk;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) view;
                i = C23274hvD.Application.isAttachedToWindow;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = C23274hvD.Application.getOutline;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView != null) {
                        return new C23388hxL(linearLayoutCompat2, linearLayoutCompat, appCompatImageView, linearLayoutCompat2, recyclerView, appCompatTextView);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
