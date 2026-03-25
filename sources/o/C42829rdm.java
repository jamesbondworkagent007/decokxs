package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.reminder.OKReminder;
import o.qZH;

/* JADX INFO: renamed from: o.rdm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42829rdm implements ViewBinding {
    public final C40369qTh AEQbTJ;
    public final OKReminder EZpvd;
    public final qSZ KWHzl;
    public final RecyclerView OLrzqt;
    public final C40363qTb copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C40369qTh getRoot() {
        return this.AEQbTJ;
    }

    public C42829rdm(@androidx.annotation.NonNull C40369qTh c40369qTh, @androidx.annotation.NonNull OKReminder oKReminder, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C40363qTb c40363qTb, @androidx.annotation.NonNull qSZ qsz) {
        this.AEQbTJ = c40369qTh;
        this.EZpvd = oKReminder;
        this.OLrzqt = recyclerView;
        this.copydefault = c40363qTb;
        this.KWHzl = qsz;
    }

    public static C42829rdm EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.HJWChP;
        OKReminder oKReminder = (OKReminder) ViewBindings.findChildViewById(view, i);
        if (oKReminder != null) {
            i = qZH.StateListAnimator.onStatusChanged;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = qZH.StateListAnimator.fmdvVn;
                C40363qTb c40363qTb = (C40363qTb) ViewBindings.findChildViewById(view, i);
                if (c40363qTb != null) {
                    i = qZH.StateListAnimator.fWSAZA;
                    qSZ qsz = (qSZ) ViewBindings.findChildViewById(view, i);
                    if (qsz != null) {
                        return new C42829rdm((C40369qTh) view, oKReminder, recyclerView, c40363qTb, qsz);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
