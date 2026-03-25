package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.view.OKSortTextView;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hCd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21513hCd implements ViewBinding {
    public final OKSortTextView AEQbTJ;
    public final C55173xeu AYXKKw;
    public final android.widget.LinearLayout AhwBna;
    public final C55173xeu AkhnZx;
    public final android.widget.TextView DbNXlk;
    public final AppCompatImageView EZpvd;
    public final OKSortTextView KWHzl;
    public final AppCompatImageView OLrzqt;
    public final AppCompatImageView copydefault;
    public final C55173xeu djBIcL;
    public final RecyclerView gEmmrt;
    public final C55113xdn valueOf;
    public final android.widget.ViewFlipper values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.AhwBna;
    }

    public C21513hCd(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2, @androidx.annotation.NonNull AppCompatImageView appCompatImageView3, @androidx.annotation.NonNull OKSortTextView oKSortTextView, @androidx.annotation.NonNull OKSortTextView oKSortTextView2, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C55173xeu c55173xeu2, @androidx.annotation.NonNull C55173xeu c55173xeu3, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.ViewFlipper viewFlipper) {
        this.AhwBna = linearLayout;
        this.copydefault = appCompatImageView;
        this.OLrzqt = appCompatImageView2;
        this.EZpvd = appCompatImageView3;
        this.AEQbTJ = oKSortTextView;
        this.KWHzl = oKSortTextView2;
        this.valueOf = c55113xdn;
        this.gEmmrt = recyclerView;
        this.djBIcL = c55173xeu;
        this.AYXKKw = c55173xeu2;
        this.AkhnZx = c55173xeu3;
        this.DbNXlk = textView;
        this.values = viewFlipper;
    }

    public static C21513hCd AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return KWHzl(layoutInflater, null, false);
    }

    public static C21513hCd KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.invokespecialhlXVux, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C21513hCd EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.getSmallIconId;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = C23274hvD.Application.MediaBrowserCompatItemCallbackItemCallbackApi23;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView2 != null) {
                i = C23274hvD.Application.onLoadChildren;
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView3 != null) {
                    i = C23274hvD.Application.getOptionsList;
                    OKSortTextView oKSortTextView = (OKSortTextView) ViewBindings.findChildViewById(view, i);
                    if (oKSortTextView != null) {
                        i = C23274hvD.Application.getIconBitmap;
                        OKSortTextView oKSortTextView2 = (OKSortTextView) ViewBindings.findChildViewById(view, i);
                        if (oKSortTextView2 != null) {
                            i = C23274hvD.Application.MediaControllerCompatApi24TransportControls;
                            C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                            if (c55113xdn != null) {
                                i = C23274hvD.Application.FullyDrawnReporter;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                if (recyclerView != null) {
                                    i = C23274hvD.Application.getToolbarNavigationClickListener;
                                    C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                                    if (c55173xeu != null) {
                                        i = C23274hvD.Application.onDrawerStateChanged;
                                        C55173xeu c55173xeu2 = (C55173xeu) ViewBindings.findChildViewById(view, i);
                                        if (c55173xeu2 != null) {
                                            i = C23274hvD.Application.AppCompatDelegateImpl5;
                                            C55173xeu c55173xeu3 = (C55173xeu) ViewBindings.findChildViewById(view, i);
                                            if (c55173xeu3 != null) {
                                                i = C23274hvD.Application.scheduleDrawable;
                                                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView != null) {
                                                    i = C23274hvD.Application.getActionModeWrapper;
                                                    android.widget.ViewFlipper viewFlipper = (android.widget.ViewFlipper) ViewBindings.findChildViewById(view, i);
                                                    if (viewFlipper != null) {
                                                        return new C21513hCd((android.widget.LinearLayout) view, appCompatImageView, appCompatImageView2, appCompatImageView3, oKSortTextView, oKSortTextView2, c55113xdn, recyclerView, c55173xeu, c55173xeu2, c55173xeu3, textView, viewFlipper);
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
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
