package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.business.dexui.main.swap.trade.status.widget.MemeErrorNoticeView;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hEw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21586hEw implements ViewBinding {
    public final MemeErrorNoticeView AEQbTJ;
    public final AppCompatTextView EZpvd;
    public final LinearLayoutCompat KWHzl;
    public final C25330iug OLrzqt;
    public final ConstraintLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.KWHzl;
    }

    public C21586hEw(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull MemeErrorNoticeView memeErrorNoticeView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull C25330iug c25330iug) {
        this.KWHzl = linearLayoutCompat;
        this.copydefault = constraintLayout;
        this.AEQbTJ = memeErrorNoticeView;
        this.EZpvd = appCompatTextView;
        this.OLrzqt = c25330iug;
    }

    public static C21586hEw EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.DuXjdv, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C21586hEw AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.DlABUU;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C23274hvD.Application.HJWChPQPAeHI;
            MemeErrorNoticeView memeErrorNoticeView = (MemeErrorNoticeView) ViewBindings.findChildViewById(view, i);
            if (memeErrorNoticeView != null) {
                i = C23274hvD.Application.getAutoBatteryNightModeManager;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView != null) {
                    i = C23274hvD.Application.isActionViewExpanded;
                    C25330iug c25330iug = (C25330iug) ViewBindings.findChildViewById(view, i);
                    if (c25330iug != null) {
                        return new C21586hEw((LinearLayoutCompat) view, constraintLayout, memeErrorNoticeView, appCompatTextView, c25330iug);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
