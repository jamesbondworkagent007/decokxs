package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iLl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23845iLl implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final android.widget.TextView EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final ConstraintLayout copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView gEmmrt;
    public final C55251xgS valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.copydefault;
    }

    public C23845iLl(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull C55251xgS c55251xgS, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull android.widget.TextView textView6, @androidx.annotation.NonNull android.widget.TextView textView7) {
        this.copydefault = constraintLayout;
        this.AEQbTJ = constraintLayout2;
        this.OLrzqt = textView;
        this.EZpvd = textView2;
        this.KWHzl = textView3;
        this.djBIcL = textView4;
        this.valueOf = c55251xgS;
        this.AYXKKw = textView5;
        this.gEmmrt = textView6;
        this.AhwBna = textView7;
    }

    public static C23845iLl EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.cBPFI, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C23845iLl EZpvd(@androidx.annotation.NonNull android.view.View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = C25493ixk.ActionBar.arDRxL;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C25493ixk.ActionBar.areNotificationsEnabled;
            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = C25493ixk.ActionBar.removeSubscription;
                android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView3 != null) {
                    i = C25493ixk.ActionBar.getCallbacks;
                    android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView4 != null) {
                        i = C25493ixk.ActionBar.MediaBrowserCompatSubscription;
                        C55251xgS c55251xgS = (C55251xgS) ViewBindings.findChildViewById(view, i);
                        if (c55251xgS != null) {
                            i = C25493ixk.ActionBar.setMediaId;
                            android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView5 != null) {
                                i = C25493ixk.ActionBar.MediaDescriptionCompatApi21;
                                android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView6 != null) {
                                    i = C25493ixk.ActionBar.setSubtitle;
                                    android.widget.TextView textView7 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView7 != null) {
                                        return new C23845iLl(constraintLayout, constraintLayout, textView, textView2, textView3, textView4, c55251xgS, textView5, textView6, textView7);
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
