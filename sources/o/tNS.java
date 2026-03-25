package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import o.C47501trL;

/* JADX INFO: loaded from: classes19.dex */
public final class tNS implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final android.widget.TextView AkhnZx;
    public final android.widget.TextView DbNXlk;
    public final wYF EZpvd;
    public final CardView KWHzl;
    public final LottieAnimationView OLrzqt;
    public final android.view.View copydefault;
    public final android.widget.ScrollView djBIcL;
    public final android.widget.TextView gEmmrt;
    public final AppCompatTextView isConnected;
    public final android.view.View valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.ScrollView getRoot() {
        return this.djBIcL;
    }

    public tNS(@androidx.annotation.NonNull android.widget.ScrollView scrollView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull wYF wyf, @androidx.annotation.NonNull CardView cardView, @androidx.annotation.NonNull LottieAnimationView lottieAnimationView, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.view.View view2, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull android.widget.TextView textView6, @androidx.annotation.NonNull AppCompatTextView appCompatTextView) {
        this.djBIcL = scrollView;
        this.AEQbTJ = textView;
        this.EZpvd = wyf;
        this.KWHzl = cardView;
        this.OLrzqt = lottieAnimationView;
        this.copydefault = view;
        this.valueOf = view2;
        this.gEmmrt = textView2;
        this.AYXKKw = textView3;
        this.AhwBna = textView4;
        this.AkhnZx = textView5;
        this.DbNXlk = textView6;
        this.isConnected = appCompatTextView;
    }

    public static tNS KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C47501trL.Application.DCUTEI, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static tNS AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        android.view.View viewFindChildViewById2;
        int i = C47501trL.TaskDescription.UeEOUB;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C47501trL.TaskDescription.gkJEwt;
            wYF wyf = (wYF) ViewBindings.findChildViewById(view, i);
            if (wyf != null) {
                i = C47501trL.TaskDescription.zuWLRA;
                CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
                if (cardView != null) {
                    i = C47501trL.TaskDescription.fXYAwm;
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                    if (lottieAnimationView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C47501trL.TaskDescription.DcMfJKDCKfqP))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C47501trL.TaskDescription.DMb))) != null) {
                        i = C47501trL.TaskDescription.idLUrz;
                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = C47501trL.TaskDescription.pause;
                            android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView3 != null) {
                                i = C47501trL.TaskDescription.iLWfRf;
                                android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView4 != null) {
                                    i = C47501trL.TaskDescription.gdLjtZ;
                                    android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView5 != null) {
                                        i = C47501trL.TaskDescription.OxbLUn;
                                        android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView6 != null) {
                                            i = C47501trL.TaskDescription.znKlvJ;
                                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                            if (appCompatTextView != null) {
                                                return new tNS((android.widget.ScrollView) view, textView, wyf, cardView, lottieAnimationView, viewFindChildViewById, viewFindChildViewById2, textView2, textView3, textView4, textView5, textView6, appCompatTextView);
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
