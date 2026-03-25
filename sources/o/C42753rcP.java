package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.reminder.OKReminder;
import o.qZH;

/* JADX INFO: renamed from: o.rcP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42753rcP implements ViewBinding {
    public final OKReminder AEQbTJ;
    public final C40363qTb EZpvd;
    public final C40369qTh KWHzl;
    public final AppCompatTextView OLrzqt;
    public final RecyclerView copydefault;
    public final qSI valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C40369qTh getRoot() {
        return this.KWHzl;
    }

    public C42753rcP(@androidx.annotation.NonNull C40369qTh c40369qTh, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull OKReminder oKReminder, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C40363qTb c40363qTb, @androidx.annotation.NonNull qSI qsi) {
        this.KWHzl = c40369qTh;
        this.OLrzqt = appCompatTextView;
        this.AEQbTJ = oKReminder;
        this.copydefault = recyclerView;
        this.EZpvd = c40363qTb;
        this.valueOf = qsi;
    }

    public static C42753rcP copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.ROgMPW;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
        if (appCompatTextView != null) {
            i = qZH.StateListAnimator.aappFQ;
            OKReminder oKReminder = (OKReminder) ViewBindings.findChildViewById(view, i);
            if (oKReminder != null) {
                i = qZH.StateListAnimator.onStatusChanged;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = qZH.StateListAnimator.fmdvVn;
                    C40363qTb c40363qTb = (C40363qTb) ViewBindings.findChildViewById(view, i);
                    if (c40363qTb != null) {
                        i = qZH.StateListAnimator.fWSAZA;
                        qSI qsi = (qSI) ViewBindings.findChildViewById(view, i);
                        if (qsi != null) {
                            return new C42753rcP((C40369qTh) view, appCompatTextView, oKReminder, recyclerView, c40363qTb, qsi);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
