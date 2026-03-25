package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.okinc.uilab.reminder.OKReminder;
import o.C46526tXp;

/* JADX INFO: loaded from: classes19.dex */
public final class tXC implements ViewBinding {
    public final C33537myN AEQbTJ;
    public final C55173xeu AhwBna;
    public final OKReminder EZpvd;
    public final ConstraintLayout KWHzl;
    public final RecyclerView OLrzqt;
    public final AppBarLayout copydefault;
    public final C55230xfy djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.KWHzl;
    }

    public tXC(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull AppBarLayout appBarLayout, @androidx.annotation.NonNull C33537myN c33537myN, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull OKReminder oKReminder, @androidx.annotation.NonNull C55230xfy c55230xfy, @androidx.annotation.NonNull C55173xeu c55173xeu) {
        this.KWHzl = constraintLayout;
        this.copydefault = appBarLayout;
        this.AEQbTJ = c33537myN;
        this.OLrzqt = recyclerView;
        this.EZpvd = oKReminder;
        this.djBIcL = c55230xfy;
        this.AhwBna = c55173xeu;
    }

    public static tXC KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return AEQbTJ(layoutInflater, null, false);
    }

    public static tXC AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C46526tXp.ActionBar.OLrzqt, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static tXC EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C46526tXp.Application.EZpvd;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i);
        if (appBarLayout != null) {
            i = C46526tXp.Application.OLrzqt;
            C33537myN c33537myN = (C33537myN) ViewBindings.findChildViewById(view, i);
            if (c33537myN != null) {
                i = C46526tXp.Application.isConnected;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = C46526tXp.Application.fJNWhG;
                    OKReminder oKReminder = (OKReminder) ViewBindings.findChildViewById(view, i);
                    if (oKReminder != null) {
                        i = C46526tXp.Application.AuCTel;
                        C55230xfy c55230xfy = (C55230xfy) ViewBindings.findChildViewById(view, i);
                        if (c55230xfy != null) {
                            i = C46526tXp.Application.ejfBZ;
                            C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                            if (c55173xeu != null) {
                                return new tXC((ConstraintLayout) view, appBarLayout, c33537myN, recyclerView, oKReminder, c55230xfy, c55173xeu);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
