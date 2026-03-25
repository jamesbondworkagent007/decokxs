package o;

import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.mAQ;

/* JADX INFO: loaded from: classes8.dex */
public final class mAO implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final Barrier AYXKKw;
    public final Guideline AhwBna;
    public final ConstraintLayout AkhnZx;
    public final android.widget.TextView AuCTel;
    public final PreviewView DbNXlk;
    public final android.widget.Button EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.LinearLayout copydefault;
    public final Guideline djBIcL;
    public final android.widget.TextView ejfBZ;
    public final ConstraintLayout fARcdN;
    public final android.widget.TextView fIwbmz;
    public final android.widget.TextView fJNWhG;
    public final ConstraintLayout fetchVPNInfo;
    public final android.widget.ImageView gEmmrt;
    public final C55249xgQ isConnected;
    public final C33524myA valueOf;
    public final ConstraintLayout values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.fetchVPNInfo;
    }

    public mAO(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.Button button, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull Barrier barrier, @androidx.annotation.NonNull Guideline guideline, @androidx.annotation.NonNull Guideline guideline2, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull C33524myA c33524myA, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull ConstraintLayout constraintLayout3, @androidx.annotation.NonNull PreviewView previewView, @androidx.annotation.NonNull C55249xgQ c55249xgQ, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull ConstraintLayout constraintLayout4) {
        this.fetchVPNInfo = constraintLayout;
        this.AEQbTJ = imageView;
        this.OLrzqt = textView;
        this.EZpvd = button;
        this.copydefault = linearLayout;
        this.KWHzl = linearLayout2;
        this.AYXKKw = barrier;
        this.djBIcL = guideline;
        this.AhwBna = guideline2;
        this.gEmmrt = imageView2;
        this.valueOf = c33524myA;
        this.AkhnZx = constraintLayout2;
        this.values = constraintLayout3;
        this.DbNXlk = previewView;
        this.isConnected = c55249xgQ;
        this.ejfBZ = textView2;
        this.AuCTel = textView3;
        this.fJNWhG = textView4;
        this.fIwbmz = textView5;
        this.fARcdN = constraintLayout4;
    }

    public static mAO OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return AEQbTJ(layoutInflater, null, false);
    }

    public static mAO AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(mAQ.StateListAnimator.AEQbTJ, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static mAO OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = mAQ.TaskDescription.KWHzl;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = mAQ.TaskDescription.AEQbTJ;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = mAQ.TaskDescription.OLrzqt;
                android.widget.Button button = (android.widget.Button) ViewBindings.findChildViewById(view, i);
                if (button != null) {
                    i = mAQ.TaskDescription.copydefault;
                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = mAQ.TaskDescription.EZpvd;
                        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout2 != null) {
                            i = mAQ.TaskDescription.AYXKKw;
                            Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
                            if (barrier != null) {
                                i = mAQ.TaskDescription.gEmmrt;
                                Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                                if (guideline != null) {
                                    i = mAQ.TaskDescription.AhwBna;
                                    Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i);
                                    if (guideline2 != null) {
                                        i = mAQ.TaskDescription.valueOf;
                                        android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                        if (imageView2 != null) {
                                            i = mAQ.TaskDescription.djBIcL;
                                            C33524myA c33524myA = (C33524myA) ViewBindings.findChildViewById(view, i);
                                            if (c33524myA != null) {
                                                i = mAQ.TaskDescription.fetchVPNInfo;
                                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                if (constraintLayout != null) {
                                                    i = mAQ.TaskDescription.values;
                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                    if (constraintLayout2 != null) {
                                                        i = mAQ.TaskDescription.DbNXlk;
                                                        PreviewView previewView = (PreviewView) ViewBindings.findChildViewById(view, i);
                                                        if (previewView != null) {
                                                            i = mAQ.TaskDescription.AkhnZx;
                                                            C55249xgQ c55249xgQ = (C55249xgQ) ViewBindings.findChildViewById(view, i);
                                                            if (c55249xgQ != null) {
                                                                i = mAQ.TaskDescription.isConnected;
                                                                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView2 != null) {
                                                                    i = mAQ.TaskDescription.ejfBZ;
                                                                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                    if (textView3 != null) {
                                                                        i = mAQ.TaskDescription.fJNWhG;
                                                                        android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                        if (textView4 != null) {
                                                                            i = mAQ.TaskDescription.AuCTel;
                                                                            android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                            if (textView5 != null) {
                                                                                i = mAQ.TaskDescription.fARcdN;
                                                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                                if (constraintLayout3 != null) {
                                                                                    return new mAO((ConstraintLayout) view, imageView, textView, button, linearLayout, linearLayout2, barrier, guideline, guideline2, imageView2, c33524myA, constraintLayout, constraintLayout2, previewView, c55249xgQ, textView2, textView3, textView4, textView5, constraintLayout3);
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
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
