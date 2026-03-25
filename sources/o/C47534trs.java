package o;

import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textview.MaterialTextView;
import o.C47315tni;

/* JADX INFO: renamed from: o.trs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47534trs implements ViewBinding {
    public final Barrier AEQbTJ;
    public final C55251xgS AYXKKw;
    public final ConstraintLayout EZpvd;
    public final C52794wYp KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final android.widget.FrameLayout copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView gEmmrt;
    public final MaterialTextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.copydefault;
    }

    public C47534trs(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull Barrier barrier, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull C55251xgS c55251xgS, @androidx.annotation.NonNull MaterialTextView materialTextView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.copydefault = frameLayout;
        this.KWHzl = c52794wYp;
        this.AEQbTJ = barrier;
        this.EZpvd = constraintLayout;
        this.OLrzqt = imageView;
        this.AYXKKw = c55251xgS;
        this.valueOf = materialTextView;
        this.djBIcL = textView;
        this.gEmmrt = textView2;
    }

    public static C47534trs AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C47315tni.ActionBar.DWgRXt, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C47534trs AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C47315tni.TaskDescription.getFieldNames;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = C47315tni.TaskDescription.gasjUx;
            Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
            if (barrier != null) {
                i = C47315tni.TaskDescription.KDccX;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout != null) {
                    i = C47315tni.TaskDescription.DWgRXt;
                    android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = C47315tni.TaskDescription.pauseLocationServices;
                        C55251xgS c55251xgS = (C55251xgS) ViewBindings.findChildViewById(view, i);
                        if (c55251xgS != null) {
                            i = C47315tni.TaskDescription.scanPackages;
                            MaterialTextView materialTextView = (MaterialTextView) ViewBindings.findChildViewById(view, i);
                            if (materialTextView != null) {
                                i = C47315tni.TaskDescription.DcMfJKDCKfqP;
                                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView != null) {
                                    i = C47315tni.TaskDescription.DsL;
                                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView2 != null) {
                                        return new C47534trs((android.widget.FrameLayout) view, c52794wYp, barrier, constraintLayout, imageView, c55251xgS, materialTextView, textView, textView2);
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
