package o;

import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C47501trL;

/* JADX INFO: renamed from: o.tOw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46290tOw implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final C46466tVj AYXKKw;
    public final C46466tVj AhwBna;
    public final android.widget.TextView DbNXlk;
    public final Flow EZpvd;
    public final android.widget.TextView KWHzl;
    public final Flow OLrzqt;
    public final C46466tVj copydefault;
    public final C46466tVj djBIcL;
    public final C46466tVj gEmmrt;
    public final ConstraintLayout isConnected;
    public final C46466tVj valueOf;
    public final android.widget.TextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.isConnected;
    }

    public C46290tOw(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull Flow flow, @androidx.annotation.NonNull Flow flow2, @androidx.annotation.NonNull C46466tVj c46466tVj, @androidx.annotation.NonNull C46466tVj c46466tVj2, @androidx.annotation.NonNull C46466tVj c46466tVj3, @androidx.annotation.NonNull C46466tVj c46466tVj4, @androidx.annotation.NonNull C46466tVj c46466tVj5, @androidx.annotation.NonNull C46466tVj c46466tVj6, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4) {
        this.isConnected = constraintLayout;
        this.KWHzl = textView;
        this.AEQbTJ = textView2;
        this.OLrzqt = flow;
        this.EZpvd = flow2;
        this.copydefault = c46466tVj;
        this.djBIcL = c46466tVj2;
        this.gEmmrt = c46466tVj3;
        this.valueOf = c46466tVj4;
        this.AhwBna = c46466tVj5;
        this.AYXKKw = c46466tVj6;
        this.values = textView3;
        this.DbNXlk = textView4;
    }

    public static C46290tOw KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C47501trL.TaskDescription.QCjLjM;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C47501trL.TaskDescription.USBtdM;
            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = C47501trL.TaskDescription.DGUQLIekVPG;
                Flow flow = (Flow) ViewBindings.findChildViewById(view, i);
                if (flow != null) {
                    i = C47501trL.TaskDescription.gtCCJH;
                    Flow flow2 = (Flow) ViewBindings.findChildViewById(view, i);
                    if (flow2 != null) {
                        i = C47501trL.TaskDescription.DPHNDa;
                        C46466tVj c46466tVj = (C46466tVj) ViewBindings.findChildViewById(view, i);
                        if (c46466tVj != null) {
                            i = C47501trL.TaskDescription.Swccd;
                            C46466tVj c46466tVj2 = (C46466tVj) ViewBindings.findChildViewById(view, i);
                            if (c46466tVj2 != null) {
                                i = C47501trL.TaskDescription.fkESqH;
                                C46466tVj c46466tVj3 = (C46466tVj) ViewBindings.findChildViewById(view, i);
                                if (c46466tVj3 != null) {
                                    i = C47501trL.TaskDescription.geLlBI;
                                    C46466tVj c46466tVj4 = (C46466tVj) ViewBindings.findChildViewById(view, i);
                                    if (c46466tVj4 != null) {
                                        i = C47501trL.TaskDescription.RAQtXZ;
                                        C46466tVj c46466tVj5 = (C46466tVj) ViewBindings.findChildViewById(view, i);
                                        if (c46466tVj5 != null) {
                                            i = C47501trL.TaskDescription.RvdRAu;
                                            C46466tVj c46466tVj6 = (C46466tVj) ViewBindings.findChildViewById(view, i);
                                            if (c46466tVj6 != null) {
                                                i = C47501trL.TaskDescription.Hx;
                                                android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView3 != null) {
                                                    i = C47501trL.TaskDescription.DcMfJKfNLfdT;
                                                    android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView4 != null) {
                                                        return new C46290tOw((ConstraintLayout) view, textView, textView2, flow, flow2, c46466tVj, c46466tVj2, c46466tVj3, c46466tVj4, c46466tVj5, c46466tVj6, textView3, textView4);
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
