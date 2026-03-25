package o;

import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textview.MaterialTextView;
import o.C47315tni;

/* JADX INFO: renamed from: o.trt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47535trt implements ViewBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final C55251xgS DbNXlk;
    public final android.widget.ImageView EZpvd;
    public final Barrier KWHzl;
    public final C52794wYp OLrzqt;
    public final ConstraintLayout copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView fetchVPNInfo;
    public final MaterialTextView gEmmrt;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.AEQbTJ;
    }

    public C47535trt(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull Barrier barrier, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull MaterialTextView materialTextView, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull C55251xgS c55251xgS, @androidx.annotation.NonNull android.widget.TextView textView5) {
        this.AEQbTJ = frameLayout;
        this.OLrzqt = c52794wYp;
        this.KWHzl = barrier;
        this.copydefault = constraintLayout;
        this.EZpvd = imageView;
        this.valueOf = textView;
        this.djBIcL = textView2;
        this.gEmmrt = materialTextView;
        this.AhwBna = textView3;
        this.AYXKKw = textView4;
        this.DbNXlk = c55251xgS;
        this.fetchVPNInfo = textView5;
    }

    public static C47535trt AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C47315tni.ActionBar.KDccX, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C47535trt OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C47315tni.TaskDescription.ejfBZ;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = C47315tni.TaskDescription.gasjUx;
            Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
            if (barrier != null) {
                i = C47315tni.TaskDescription.KDccX;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout != null) {
                    i = C47315tni.TaskDescription.heceqZ;
                    android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = C47315tni.TaskDescription.dzkkkq;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = C47315tni.TaskDescription.scanPackages;
                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = C47315tni.TaskDescription.registerUser;
                                MaterialTextView materialTextView = (MaterialTextView) ViewBindings.findChildViewById(view, i);
                                if (materialTextView != null) {
                                    i = C47315tni.TaskDescription.DMb;
                                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView3 != null) {
                                        i = C47315tni.TaskDescription.DcMfJKDCKfqP;
                                        android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView4 != null) {
                                            i = C47315tni.TaskDescription.cancel;
                                            C55251xgS c55251xgS = (C55251xgS) ViewBindings.findChildViewById(view, i);
                                            if (c55251xgS != null) {
                                                i = C47315tni.TaskDescription.DsL;
                                                android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView5 != null) {
                                                    return new C47535trt((android.widget.FrameLayout) view, c52794wYp, barrier, constraintLayout, imageView, textView, textView2, materialTextView, textView3, textView4, c55251xgS, textView5);
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
