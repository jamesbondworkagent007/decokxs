package o;

import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C47501trL;

/* JADX INFO: renamed from: o.tOj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46277tOj implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final C55249xgQ AYXKKw;
    public final C54989xbV AhwBna;
    public final C54989xbV AkhnZx;
    public final ConstraintLayout DbNXlk;
    public final tWE EZpvd;
    public final tAP KWHzl;
    public final tAP OLrzqt;
    public final android.widget.TextView copydefault;
    public final android.widget.LinearLayout djBIcL;
    public final C54989xbV fetchVPNInfo;
    public final android.widget.LinearLayout gEmmrt;
    public final C54989xbV isConnected;
    public final Flow valueOf;
    public final C54989xbV values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.djBIcL;
    }

    public C46277tOj(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull tAP tap, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull tWE twe, @androidx.annotation.NonNull tAP tap2, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull Flow flow, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull C55249xgQ c55249xgQ, @androidx.annotation.NonNull C54989xbV c54989xbV, @androidx.annotation.NonNull C54989xbV c54989xbV2, @androidx.annotation.NonNull C54989xbV c54989xbV3, @androidx.annotation.NonNull C54989xbV c54989xbV4, @androidx.annotation.NonNull C54989xbV c54989xbV5, @androidx.annotation.NonNull ConstraintLayout constraintLayout) {
        this.djBIcL = linearLayout;
        this.OLrzqt = tap;
        this.copydefault = textView;
        this.EZpvd = twe;
        this.KWHzl = tap2;
        this.AEQbTJ = textView2;
        this.valueOf = flow;
        this.gEmmrt = linearLayout2;
        this.AYXKKw = c55249xgQ;
        this.AhwBna = c54989xbV;
        this.AkhnZx = c54989xbV2;
        this.values = c54989xbV3;
        this.fetchVPNInfo = c54989xbV4;
        this.isConnected = c54989xbV5;
        this.DbNXlk = constraintLayout;
    }

    public static C46277tOj OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C47501trL.TaskDescription.fetchVPNInfo;
        tAP tap = (tAP) ViewBindings.findChildViewById(view, i);
        if (tap != null) {
            i = C47501trL.TaskDescription.ejfBZ;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = C47501trL.TaskDescription.ffGIBT;
                tWE twe = (tWE) ViewBindings.findChildViewById(view, i);
                if (twe != null) {
                    i = C47501trL.TaskDescription.DBxZfM;
                    tAP tap2 = (tAP) ViewBindings.findChildViewById(view, i);
                    if (tap2 != null) {
                        i = C47501trL.TaskDescription.hCLrkq;
                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = C47501trL.TaskDescription.DGUQLIdZmdUa;
                            Flow flow = (Flow) ViewBindings.findChildViewById(view, i);
                            if (flow != null) {
                                i = C47501trL.TaskDescription.DQYQgr;
                                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout != null) {
                                    i = C47501trL.TaskDescription.GGlJim;
                                    C55249xgQ c55249xgQ = (C55249xgQ) ViewBindings.findChildViewById(view, i);
                                    if (c55249xgQ != null) {
                                        i = C47501trL.TaskDescription.QMuEJi;
                                        C54989xbV c54989xbV = (C54989xbV) ViewBindings.findChildViewById(view, i);
                                        if (c54989xbV != null) {
                                            i = C47501trL.TaskDescription.RcvFxC;
                                            C54989xbV c54989xbV2 = (C54989xbV) ViewBindings.findChildViewById(view, i);
                                            if (c54989xbV2 != null) {
                                                i = C47501trL.TaskDescription.OmJATG;
                                                C54989xbV c54989xbV3 = (C54989xbV) ViewBindings.findChildViewById(view, i);
                                                if (c54989xbV3 != null) {
                                                    i = C47501trL.TaskDescription.RihMUf;
                                                    C54989xbV c54989xbV4 = (C54989xbV) ViewBindings.findChildViewById(view, i);
                                                    if (c54989xbV4 != null) {
                                                        i = C47501trL.TaskDescription.fhUrPt;
                                                        C54989xbV c54989xbV5 = (C54989xbV) ViewBindings.findChildViewById(view, i);
                                                        if (c54989xbV5 != null) {
                                                            i = C47501trL.TaskDescription.getLocation;
                                                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                            if (constraintLayout != null) {
                                                                return new C46277tOj((android.widget.LinearLayout) view, tap, textView, twe, tap2, textView2, flow, linearLayout, c55249xgQ, c54989xbV, c54989xbV2, c54989xbV3, c54989xbV4, c54989xbV5, constraintLayout);
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
