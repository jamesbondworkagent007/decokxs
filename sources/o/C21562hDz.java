package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.chip.ChipGroup;
import com.okinc.business.market.widget.chart.RankingFilterEditView;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hDz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21562hDz implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final ConstraintLayout AYXKKw;
    public final android.widget.TextView AhwBna;
    public final NestedScrollView EZpvd;
    public final android.widget.TextView KWHzl;
    public final ConstraintLayout OLrzqt;
    public final RankingFilterEditView copydefault;
    public final C28055kNf djBIcL;
    public final ChipGroup gEmmrt;
    public final RankingFilterEditView isConnected;
    public final RankingFilterEditView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.EZpvd;
    }

    public C21562hDz(@androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull RankingFilterEditView rankingFilterEditView, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull ChipGroup chipGroup, @androidx.annotation.NonNull RankingFilterEditView rankingFilterEditView2, @androidx.annotation.NonNull C28055kNf c28055kNf, @androidx.annotation.NonNull RankingFilterEditView rankingFilterEditView3) {
        this.EZpvd = nestedScrollView;
        this.AEQbTJ = textView;
        this.OLrzqt = constraintLayout;
        this.KWHzl = textView2;
        this.copydefault = rankingFilterEditView;
        this.AhwBna = textView3;
        this.AYXKKw = constraintLayout2;
        this.gEmmrt = chipGroup;
        this.valueOf = rankingFilterEditView2;
        this.djBIcL = c28055kNf;
        this.isConnected = rankingFilterEditView3;
    }

    public static C21562hDz KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.DxnCrt, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C21562hDz KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.onLocationChanged;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C23274hvD.Application.MediaSessionCompatMediaSessionImplApi191;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = C23274hvD.Application.MediaSessionCompatMediaSessionImplApi28;
                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = C23274hvD.Application.getViewModelStore;
                    RankingFilterEditView rankingFilterEditView = (RankingFilterEditView) ViewBindings.findChildViewById(view, i);
                    if (rankingFilterEditView != null) {
                        i = C23274hvD.Application.getEnabledChangedCallbackactivity_release;
                        android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            i = C23274hvD.Application.addCancellable;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                            if (constraintLayout2 != null) {
                                i = C23274hvD.Application.isEnabled;
                                ChipGroup chipGroup = (ChipGroup) ViewBindings.findChildViewById(view, i);
                                if (chipGroup != null) {
                                    i = C23274hvD.Application.DisplayContext;
                                    RankingFilterEditView rankingFilterEditView2 = (RankingFilterEditView) ViewBindings.findChildViewById(view, i);
                                    if (rankingFilterEditView2 != null) {
                                        i = C23274hvD.Application.setId;
                                        C28055kNf c28055kNf = (C28055kNf) ViewBindings.findChildViewById(view, i);
                                        if (c28055kNf != null) {
                                            i = C23274hvD.Application.getInitialMenuPosition;
                                            RankingFilterEditView rankingFilterEditView3 = (RankingFilterEditView) ViewBindings.findChildViewById(view, i);
                                            if (rankingFilterEditView3 != null) {
                                                return new C21562hDz((NestedScrollView) view, textView, constraintLayout, textView2, rankingFilterEditView, textView3, constraintLayout2, chipGroup, rankingFilterEditView2, c28055kNf, rankingFilterEditView3);
                                            }
                                        }
                                    }
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
