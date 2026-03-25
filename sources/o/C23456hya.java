package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hya, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23456hya implements ViewBinding {
    public final AppCompatImageView AEQbTJ;
    public final C55258xgZ EZpvd;
    public final AppCompatTextView KWHzl;
    public final ConstraintLayout OLrzqt;
    public final RecyclerView copydefault;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.OLrzqt;
    }

    public C23456hya(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C55258xgZ c55258xgZ, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.OLrzqt = constraintLayout;
        this.EZpvd = c55258xgZ;
        this.AEQbTJ = appCompatImageView;
        this.copydefault = recyclerView;
        this.KWHzl = appCompatTextView;
        this.valueOf = textView;
    }

    public static C23456hya AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.fZBcTu, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C23456hya EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.GPCHlQ;
        C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
        if (c55258xgZ != null) {
            i = C23274hvD.Application.ZpNRhN;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = C23274hvD.Application.ComponentActivityReportFullyDrawnExecutorApi16ImplExternalSyntheticLambda0;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = C23274hvD.Application.ActionBarDrawerToggle;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView != null) {
                        i = C23274hvD.Application.updateForNightMode;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            return new C23456hya((ConstraintLayout) view, c55258xgZ, appCompatImageView, recyclerView, appCompatTextView, textView);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
