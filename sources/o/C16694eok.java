package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eok, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16694eok implements ViewBinding {
    public final LinearLayoutCompat AEQbTJ;
    public final C55230xfy AYXKKw;
    public final AppCompatImageView EZpvd;
    public final AppCompatTextView KWHzl;
    public final AppCompatImageView OLrzqt;
    public final AppCompatTextView copydefault;
    public final ConstraintLayout djBIcL;
    public final RecyclerView gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.AEQbTJ;
    }

    public C16694eok(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull C55230xfy c55230xfy, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull RecyclerView recyclerView) {
        this.AEQbTJ = linearLayoutCompat;
        this.KWHzl = appCompatTextView;
        this.EZpvd = appCompatImageView;
        this.OLrzqt = appCompatImageView2;
        this.copydefault = appCompatTextView2;
        this.AYXKKw = c55230xfy;
        this.djBIcL = constraintLayout;
        this.gEmmrt = recyclerView;
    }

    public static C16694eok KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.aKhcqp, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C16694eok AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.DztXDE;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
        if (appCompatTextView != null) {
            i = C13754dXa.ActionBar.HJWChPdNQGVJ;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = C13754dXa.ActionBar.fromMediaItemList;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView2 != null) {
                    i = C13754dXa.ActionBar.getDescription;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView2 != null) {
                        i = C13754dXa.ActionBar.getCallingPackage;
                        C55230xfy c55230xfy = (C55230xfy) ViewBindings.findChildViewById(view, i);
                        if (c55230xfy != null) {
                            i = C13754dXa.ActionBar.MediaSessionCompat1;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                            if (constraintLayout != null) {
                                i = C13754dXa.ActionBar.getSelectedTab;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                if (recyclerView != null) {
                                    return new C16694eok((LinearLayoutCompat) view, appCompatTextView, appCompatImageView, appCompatImageView2, appCompatTextView2, c55230xfy, constraintLayout, recyclerView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
