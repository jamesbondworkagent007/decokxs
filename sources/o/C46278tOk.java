package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C47501trL;

/* JADX INFO: renamed from: o.tOk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46278tOk implements ViewBinding {
    public final C55251xgS AEQbTJ;
    public final ConstraintLayout AYXKKw;
    public final tUA AhwBna;
    public final tOJ AkhnZx;
    public final C46290tOw EZpvd;
    public final android.view.View KWHzl;
    public final AppCompatImageView OLrzqt;
    public final Flow copydefault;
    public final C55251xgS djBIcL;
    public final android.widget.TextView fetchVPNInfo;
    public final C55251xgS gEmmrt;
    public final ConstraintLayout valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.valueOf;
    }

    public C46278tOk(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C46290tOw c46290tOw, @androidx.annotation.NonNull Flow flow, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull C55251xgS c55251xgS, @androidx.annotation.NonNull C55251xgS c55251xgS2, @androidx.annotation.NonNull C55251xgS c55251xgS3, @androidx.annotation.NonNull tUA tua, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull tOJ toj) {
        this.valueOf = constraintLayout;
        this.KWHzl = view;
        this.EZpvd = c46290tOw;
        this.copydefault = flow;
        this.OLrzqt = appCompatImageView;
        this.AEQbTJ = c55251xgS;
        this.gEmmrt = c55251xgS2;
        this.djBIcL = c55251xgS3;
        this.AhwBna = tua;
        this.AYXKKw = constraintLayout2;
        this.fetchVPNInfo = textView;
        this.AkhnZx = toj;
    }

    public static C46278tOk AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C47501trL.Application.QVsKAR, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C46278tOk KWHzl(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        android.view.View viewFindChildViewById2;
        int i = C47501trL.TaskDescription.alsFma;
        android.view.View viewFindChildViewById3 = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C47501trL.TaskDescription.DQzvGNdrmXxu))) != null) {
            C46290tOw c46290tOwKWHzl = C46290tOw.KWHzl(viewFindChildViewById);
            i = C47501trL.TaskDescription.RbVjfb;
            Flow flow = (Flow) ViewBindings.findChildViewById(view, i);
            if (flow != null) {
                i = C47501trL.TaskDescription.RzdrRQ;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView != null) {
                    i = C47501trL.TaskDescription.fupbxE;
                    C55251xgS c55251xgS = (C55251xgS) ViewBindings.findChildViewById(view, i);
                    if (c55251xgS != null) {
                        i = C47501trL.TaskDescription.DDjfYY;
                        C55251xgS c55251xgS2 = (C55251xgS) ViewBindings.findChildViewById(view, i);
                        if (c55251xgS2 != null) {
                            i = C47501trL.TaskDescription.QWpYiD;
                            C55251xgS c55251xgS3 = (C55251xgS) ViewBindings.findChildViewById(view, i);
                            if (c55251xgS3 != null) {
                                i = C47501trL.TaskDescription.OAhWiU;
                                tUA tua = (tUA) ViewBindings.findChildViewById(view, i);
                                if (tua != null) {
                                    i = C47501trL.TaskDescription.GhqvEQ;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                    if (constraintLayout != null) {
                                        i = C47501trL.TaskDescription.pause;
                                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C47501trL.TaskDescription.fmdvVn))) != null) {
                                            return new C46278tOk((ConstraintLayout) view, viewFindChildViewById3, c46290tOwKWHzl, flow, appCompatImageView, c55251xgS, c55251xgS2, c55251xgS3, tua, constraintLayout, textView, tOJ.OLrzqt(viewFindChildViewById2));
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
