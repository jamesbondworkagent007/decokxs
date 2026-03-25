package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C47501trL;

/* JADX INFO: renamed from: o.tOp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46283tOp implements ViewBinding {
    public final Flow AEQbTJ;
    public final Flow AYXKKw;
    public final Group AhwBna;
    public final C46466tVj AkhnZx;
    public final C46466tVj AuCTel;
    public final C55251xgS DbNXlk;
    public final C52794wYp EZpvd;
    public final Flow KWHzl;
    public final Barrier OLrzqt;
    public final C52794wYp copydefault;
    public final android.view.View djBIcL;
    public final C46466tVj ejfBZ;
    public final C46466tVj fARcdN;
    public final C46466tVj fIwbmz;
    public final C46466tVj fJNWhG;
    public final android.widget.TextView fetchVPNInfo;
    public final C55251xgS gEmmrt;
    public final AppCompatImageView getFieldNames;
    public final ConstraintLayout getNewProxyInstance;
    public final C55376xil hDKMBd;
    public final C55251xgS isConnected;
    public final C46466tVj iwGUEr;
    public final C46466tVj uzCIH;
    public final Flow valueOf;
    public final ConstraintLayout values;
    public final Barrier zLjUOn;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.values;
    }

    public C46283tOp(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull Barrier barrier, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull C52794wYp c52794wYp2, @androidx.annotation.NonNull Flow flow, @androidx.annotation.NonNull Flow flow2, @androidx.annotation.NonNull Flow flow3, @androidx.annotation.NonNull Flow flow4, @androidx.annotation.NonNull Group group, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C55251xgS c55251xgS, @androidx.annotation.NonNull C55251xgS c55251xgS2, @androidx.annotation.NonNull C55251xgS c55251xgS3, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C46466tVj c46466tVj, @androidx.annotation.NonNull C46466tVj c46466tVj2, @androidx.annotation.NonNull C46466tVj c46466tVj3, @androidx.annotation.NonNull C46466tVj c46466tVj4, @androidx.annotation.NonNull C46466tVj c46466tVj5, @androidx.annotation.NonNull C46466tVj c46466tVj6, @androidx.annotation.NonNull C46466tVj c46466tVj7, @androidx.annotation.NonNull C46466tVj c46466tVj8, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull C55376xil c55376xil, @androidx.annotation.NonNull Barrier barrier2) {
        this.values = constraintLayout;
        this.OLrzqt = barrier;
        this.copydefault = c52794wYp;
        this.EZpvd = c52794wYp2;
        this.AEQbTJ = flow;
        this.KWHzl = flow2;
        this.AYXKKw = flow3;
        this.valueOf = flow4;
        this.AhwBna = group;
        this.djBIcL = view;
        this.gEmmrt = c55251xgS;
        this.DbNXlk = c55251xgS2;
        this.isConnected = c55251xgS3;
        this.fetchVPNInfo = textView;
        this.AkhnZx = c46466tVj;
        this.fIwbmz = c46466tVj2;
        this.fJNWhG = c46466tVj3;
        this.AuCTel = c46466tVj4;
        this.fARcdN = c46466tVj5;
        this.ejfBZ = c46466tVj6;
        this.iwGUEr = c46466tVj7;
        this.uzCIH = c46466tVj8;
        this.getNewProxyInstance = constraintLayout2;
        this.getFieldNames = appCompatImageView;
        this.hDKMBd = c55376xil;
        this.zLjUOn = barrier2;
    }

    public static C46283tOp AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C47501trL.Application.UlJrfe, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C46283tOp EZpvd(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C47501trL.TaskDescription.AxsJAY;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
        if (barrier != null) {
            i = C47501trL.TaskDescription.RJOkX;
            C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
            if (c52794wYp != null) {
                i = C47501trL.TaskDescription.aKErDB;
                C52794wYp c52794wYp2 = (C52794wYp) ViewBindings.findChildViewById(view, i);
                if (c52794wYp2 != null) {
                    i = C47501trL.TaskDescription.DGUQLIekVPG;
                    Flow flow = (Flow) ViewBindings.findChildViewById(view, i);
                    if (flow != null) {
                        i = C47501trL.TaskDescription.gtCCJH;
                        Flow flow2 = (Flow) ViewBindings.findChildViewById(view, i);
                        if (flow2 != null) {
                            i = C47501trL.TaskDescription.DUUtXg;
                            Flow flow3 = (Flow) ViewBindings.findChildViewById(view, i);
                            if (flow3 != null) {
                                i = C47501trL.TaskDescription.DIIpTV;
                                Flow flow4 = (Flow) ViewBindings.findChildViewById(view, i);
                                if (flow4 != null) {
                                    i = C47501trL.TaskDescription.aJZHYI;
                                    Group group = (Group) ViewBindings.findChildViewById(view, i);
                                    if (group != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C47501trL.TaskDescription.DPhTBN))) != null) {
                                        i = C47501trL.TaskDescription.fupbxE;
                                        C55251xgS c55251xgS = (C55251xgS) ViewBindings.findChildViewById(view, i);
                                        if (c55251xgS != null) {
                                            i = C47501trL.TaskDescription.DcMfJKDGTeJD;
                                            C55251xgS c55251xgS2 = (C55251xgS) ViewBindings.findChildViewById(view, i);
                                            if (c55251xgS2 != null) {
                                                i = C47501trL.TaskDescription.QFTsTN;
                                                C55251xgS c55251xgS3 = (C55251xgS) ViewBindings.findChildViewById(view, i);
                                                if (c55251xgS3 != null) {
                                                    i = C47501trL.TaskDescription.iUnTnt;
                                                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView != null) {
                                                        i = C47501trL.TaskDescription.FYtjSf;
                                                        C46466tVj c46466tVj = (C46466tVj) ViewBindings.findChildViewById(view, i);
                                                        if (c46466tVj != null) {
                                                            i = C47501trL.TaskDescription.setPageName;
                                                            C46466tVj c46466tVj2 = (C46466tVj) ViewBindings.findChildViewById(view, i);
                                                            if (c46466tVj2 != null) {
                                                                i = C47501trL.TaskDescription.FSMca;
                                                                C46466tVj c46466tVj3 = (C46466tVj) ViewBindings.findChildViewById(view, i);
                                                                if (c46466tVj3 != null) {
                                                                    i = C47501trL.TaskDescription.finishInit;
                                                                    C46466tVj c46466tVj4 = (C46466tVj) ViewBindings.findChildViewById(view, i);
                                                                    if (c46466tVj4 != null) {
                                                                        i = C47501trL.TaskDescription.GFUIi;
                                                                        C46466tVj c46466tVj5 = (C46466tVj) ViewBindings.findChildViewById(view, i);
                                                                        if (c46466tVj5 != null) {
                                                                            i = C47501trL.TaskDescription.UJEglR;
                                                                            C46466tVj c46466tVj6 = (C46466tVj) ViewBindings.findChildViewById(view, i);
                                                                            if (c46466tVj6 != null) {
                                                                                i = C47501trL.TaskDescription.DuXjdv;
                                                                                C46466tVj c46466tVj7 = (C46466tVj) ViewBindings.findChildViewById(view, i);
                                                                                if (c46466tVj7 != null) {
                                                                                    i = C47501trL.TaskDescription.dlRikr;
                                                                                    C46466tVj c46466tVj8 = (C46466tVj) ViewBindings.findChildViewById(view, i);
                                                                                    if (c46466tVj8 != null) {
                                                                                        i = C47501trL.TaskDescription.fsw;
                                                                                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                                        if (constraintLayout != null) {
                                                                                            i = C47501trL.TaskDescription.OAhWiU;
                                                                                            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                                                                            if (appCompatImageView != null) {
                                                                                                i = C47501trL.TaskDescription.pause;
                                                                                                C55376xil c55376xil = (C55376xil) ViewBindings.findChildViewById(view, i);
                                                                                                if (c55376xil != null) {
                                                                                                    i = C47501trL.TaskDescription.HJWChPDXdlte;
                                                                                                    Barrier barrier2 = (Barrier) ViewBindings.findChildViewById(view, i);
                                                                                                    if (barrier2 != null) {
                                                                                                        return new C46283tOp((ConstraintLayout) view, barrier, c52794wYp, c52794wYp2, flow, flow2, flow3, flow4, group, viewFindChildViewById, c55251xgS, c55251xgS2, c55251xgS3, textView, c46466tVj, c46466tVj2, c46466tVj3, c46466tVj4, c46466tVj5, c46466tVj6, c46466tVj7, c46466tVj8, constraintLayout, appCompatImageView, c55376xil, barrier2);
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
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
