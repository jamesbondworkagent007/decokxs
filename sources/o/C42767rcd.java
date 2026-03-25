package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.reminder.OKReminder;
import o.qZH;

/* JADX INFO: renamed from: o.rcd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42767rcd implements ViewBinding {
    public final RecyclerView AEQbTJ;
    public final OKReminder EZpvd;
    public final C41382qpk KWHzl;
    public final C33546myW OLrzqt;
    public final C41381qpj copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C41381qpj getRoot() {
        return this.copydefault;
    }

    public C42767rcd(@androidx.annotation.NonNull C41381qpj c41381qpj, @androidx.annotation.NonNull OKReminder oKReminder, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C33546myW c33546myW, @androidx.annotation.NonNull C41382qpk c41382qpk) {
        this.copydefault = c41381qpj;
        this.EZpvd = oKReminder;
        this.AEQbTJ = recyclerView;
        this.OLrzqt = c33546myW;
        this.KWHzl = c41382qpk;
    }

    public static C42767rcd EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.GiPPlLQAswws;
        OKReminder oKReminder = (OKReminder) ViewBindings.findChildViewById(view, i);
        if (oKReminder != null) {
            i = qZH.StateListAnimator.onStatusChanged;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = qZH.StateListAnimator.onProviderEnabled;
                C33546myW c33546myW = (C33546myW) ViewBindings.findChildViewById(view, i);
                if (c33546myW != null) {
                    i = qZH.StateListAnimator.fmdvVn;
                    C41382qpk c41382qpk = (C41382qpk) ViewBindings.findChildViewById(view, i);
                    if (c41382qpk != null) {
                        return new C42767rcd((C41381qpj) view, oKReminder, recyclerView, c33546myW, c41382qpk);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
