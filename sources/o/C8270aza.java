package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.auth.impl.widget.SimpleToolBar;
import com.okinc.uilab.item.OKRegularCell;
import o.C8206ayP;

/* JADX INFO: renamed from: o.aza, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C8270aza implements ViewBinding {
    public final SimpleToolBar AEQbTJ;
    public final OKRegularCell AYXKKw;
    public final android.widget.TextView AhwBna;
    public final ConstraintLayout AkhnZx;
    public final C52794wYp DbNXlk;
    public final OKRegularCell EZpvd;
    public final OKRegularCell KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.TextView copydefault;
    public final OKRegularCell djBIcL;
    public final android.widget.TextView gEmmrt;
    public final C55067xcu valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AkhnZx;
    }

    public C8270aza(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull SimpleToolBar simpleToolBar, @androidx.annotation.NonNull OKRegularCell oKRegularCell, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull OKRegularCell oKRegularCell2, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull OKRegularCell oKRegularCell3, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull C55067xcu c55067xcu, @androidx.annotation.NonNull OKRegularCell oKRegularCell4, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull C52794wYp c52794wYp) {
        this.AkhnZx = constraintLayout;
        this.AEQbTJ = simpleToolBar;
        this.KWHzl = oKRegularCell;
        this.OLrzqt = textView;
        this.EZpvd = oKRegularCell2;
        this.copydefault = textView2;
        this.AYXKKw = oKRegularCell3;
        this.gEmmrt = textView3;
        this.valueOf = c55067xcu;
        this.djBIcL = oKRegularCell4;
        this.AhwBna = textView4;
        this.DbNXlk = c52794wYp;
    }

    public static C8270aza EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return copydefault(layoutInflater, null, false);
    }

    public static C8270aza copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C8206ayP.Application.djBIcL, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C8270aza KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C8206ayP.StateListAnimator.AEQbTJ;
        SimpleToolBar simpleToolBar = (SimpleToolBar) ViewBindings.findChildViewById(view, i);
        if (simpleToolBar != null) {
            i = C8206ayP.StateListAnimator.dxcTrN;
            OKRegularCell oKRegularCell = (OKRegularCell) ViewBindings.findChildViewById(view, i);
            if (oKRegularCell != null) {
                i = C8206ayP.StateListAnimator.dvKsVJ;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = C8206ayP.StateListAnimator.gkJEwt;
                    OKRegularCell oKRegularCell2 = (OKRegularCell) ViewBindings.findChildViewById(view, i);
                    if (oKRegularCell2 != null) {
                        i = C8206ayP.StateListAnimator.hUfVAv;
                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = C8206ayP.StateListAnimator.zuWLRA;
                            OKRegularCell oKRegularCell3 = (OKRegularCell) ViewBindings.findChildViewById(view, i);
                            if (oKRegularCell3 != null) {
                                i = C8206ayP.StateListAnimator.ffGIBT;
                                android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView3 != null) {
                                    i = C8206ayP.StateListAnimator.OBJEWx;
                                    C55067xcu c55067xcu = (C55067xcu) ViewBindings.findChildViewById(view, i);
                                    if (c55067xcu != null) {
                                        i = C8206ayP.StateListAnimator.QSBOWP;
                                        OKRegularCell oKRegularCell4 = (OKRegularCell) ViewBindings.findChildViewById(view, i);
                                        if (oKRegularCell4 != null) {
                                            i = C8206ayP.StateListAnimator.QkdxfA;
                                            android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView4 != null) {
                                                i = C8206ayP.StateListAnimator.gUEfcq;
                                                C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
                                                if (c52794wYp != null) {
                                                    return new C8270aza((ConstraintLayout) view, simpleToolBar, oKRegularCell, textView, oKRegularCell2, textView2, oKRegularCell3, textView3, c55067xcu, oKRegularCell4, textView4, c52794wYp);
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
