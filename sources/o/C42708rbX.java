package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.reminder.OKReminder;
import o.qZH;

/* JADX INFO: renamed from: o.rbX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42708rbX implements ViewBinding {
    public final C41382qpk AEQbTJ;
    public final C33546myW EZpvd;
    public final C41381qpj KWHzl;
    public final RecyclerView OLrzqt;
    public final OKReminder copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C41381qpj getRoot() {
        return this.KWHzl;
    }

    public C42708rbX(@androidx.annotation.NonNull C41381qpj c41381qpj, @androidx.annotation.NonNull OKReminder oKReminder, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C33546myW c33546myW, @androidx.annotation.NonNull C41382qpk c41382qpk) {
        this.KWHzl = c41381qpj;
        this.copydefault = oKReminder;
        this.OLrzqt = recyclerView;
        this.EZpvd = c33546myW;
        this.AEQbTJ = c41382qpk;
    }

    public static C42708rbX AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.resume;
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
                        return new C42708rbX((C41381qpj) view, oKReminder, recyclerView, c33546myW, c41382qpk);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
