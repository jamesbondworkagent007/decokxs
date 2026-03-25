package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hEB implements ViewBinding {
    public final Guideline AEQbTJ;
    public final android.widget.ImageView AYXKKw;
    public final android.widget.ImageView AhwBna;
    public final android.widget.LinearLayout AkhnZx;
    public final android.widget.TextView AuCTel;
    public final android.widget.TextView DbNXlk;
    public final android.view.View EZpvd;
    public final Guideline KWHzl;
    public final android.view.View OLrzqt;
    public final android.widget.FrameLayout copydefault;
    public final android.widget.LinearLayout djBIcL;
    public final android.widget.TextView ejfBZ;
    public final android.widget.TextView fARcdN;
    public final android.widget.TextView fIwbmz;
    public final AppCompatTextView fJNWhG;
    public final android.widget.TextView fetchVPNInfo;
    public final android.widget.ImageView gEmmrt;
    public final android.view.View getFieldNames;
    public final android.widget.TextView isConnected;
    public final android.view.View iwGUEr;
    public final android.widget.ImageView valueOf;
    public final ConstraintLayout values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.AkhnZx;
    }

    public hEB(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.view.View view2, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull Guideline guideline, @androidx.annotation.NonNull Guideline guideline2, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.ImageView imageView3, @androidx.annotation.NonNull android.widget.ImageView imageView4, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull android.widget.TextView textView6, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull android.widget.TextView textView7, @androidx.annotation.NonNull android.view.View view3, @androidx.annotation.NonNull android.view.View view4) {
        this.AkhnZx = linearLayout;
        this.EZpvd = view;
        this.OLrzqt = view2;
        this.copydefault = frameLayout;
        this.KWHzl = guideline;
        this.AEQbTJ = guideline2;
        this.AhwBna = imageView;
        this.gEmmrt = imageView2;
        this.AYXKKw = imageView3;
        this.valueOf = imageView4;
        this.djBIcL = linearLayout2;
        this.values = constraintLayout;
        this.isConnected = textView;
        this.DbNXlk = textView2;
        this.fetchVPNInfo = textView3;
        this.AuCTel = textView4;
        this.fIwbmz = textView5;
        this.ejfBZ = textView6;
        this.fJNWhG = appCompatTextView;
        this.fARcdN = textView7;
        this.getFieldNames = view3;
        this.iwGUEr = view4;
    }

    public static hEB copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.Dfm, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static hEB EZpvd(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        android.view.View viewFindChildViewById2;
        android.view.View viewFindChildViewById3;
        int i = C23274hvD.Application.aCSzUz;
        android.view.View viewFindChildViewById4 = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById4 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.Rtjmuc))) != null) {
            i = C23274hvD.Application.icKaHr;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = C23274hvD.Application.QhYuFg;
                Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                if (guideline != null) {
                    i = C23274hvD.Application.DcNNRp;
                    Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i);
                    if (guideline2 != null) {
                        i = C23274hvD.Application.onTransact;
                        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = C23274hvD.Application.getSessionToken;
                            android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView2 != null) {
                                i = C23274hvD.Application.getMediaItem;
                                android.widget.ImageView imageView3 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView3 != null) {
                                    i = C23274hvD.Application.unregisterCallbackMessenger;
                                    android.widget.ImageView imageView4 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView4 != null) {
                                        i = C23274hvD.Application.getPlaybackInfo;
                                        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                        if (linearLayout != null) {
                                            i = C23274hvD.Application.removeOnTrimMemoryListener;
                                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                            if (constraintLayout != null) {
                                                i = C23274hvD.Application.AlertControllerAlertParams4;
                                                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView != null) {
                                                    i = C23274hvD.Application.AlertControllerAlertParamsOnPrepareListViewListener;
                                                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView2 != null) {
                                                        i = C23274hvD.Application.AlertControllerRecycleListView;
                                                        android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView3 != null) {
                                                            i = C23274hvD.Application.hasStableIds;
                                                            android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView4 != null) {
                                                                i = C23274hvD.Application.getItemId;
                                                                android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView5 != null) {
                                                                    i = C23274hvD.Application.AlertDialog;
                                                                    android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                    if (textView6 != null) {
                                                                        i = C23274hvD.Application.parseItem;
                                                                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (appCompatTextView != null) {
                                                                            i = C23274hvD.Application.getStateDrawableIndex;
                                                                            android.widget.TextView textView7 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                            if (textView7 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.getSystemService))) != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.getTheme))) != null) {
                                                                                return new hEB((android.widget.LinearLayout) view, viewFindChildViewById4, viewFindChildViewById, frameLayout, guideline, guideline2, imageView, imageView2, imageView3, imageView4, linearLayout, constraintLayout, textView, textView2, textView3, textView4, textView5, textView6, appCompatTextView, textView7, viewFindChildViewById2, viewFindChildViewById3);
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
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
