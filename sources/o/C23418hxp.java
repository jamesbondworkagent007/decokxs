package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.reminder.OKReminder;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hxp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23418hxp implements ViewBinding {
    public final C30383laC AEQbTJ;
    public final LinearLayoutCompat AYXKKw;
    public final AppCompatTextView AhwBna;
    public final C30509lcW EZpvd;
    public final LinearLayoutCompat KWHzl;
    public final OKReminder OLrzqt;
    public final C52794wYp copydefault;
    public final C55251xgS djBIcL;
    public final AppCompatImageView gEmmrt;
    public final android.widget.TextView isConnected;
    public final LinearLayoutCompat valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.AYXKKw;
    }

    public C23418hxp(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C30383laC c30383laC, @androidx.annotation.NonNull C30509lcW c30509lcW, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull OKReminder oKReminder, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat3, @androidx.annotation.NonNull C55251xgS c55251xgS, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.AYXKKw = linearLayoutCompat;
        this.AEQbTJ = c30383laC;
        this.EZpvd = c30509lcW;
        this.copydefault = c52794wYp;
        this.OLrzqt = oKReminder;
        this.KWHzl = linearLayoutCompat2;
        this.gEmmrt = appCompatImageView;
        this.valueOf = linearLayoutCompat3;
        this.djBIcL = c55251xgS;
        this.AhwBna = appCompatTextView;
        this.isConnected = textView;
    }

    public static C23418hxp OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.gEmmrt, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C23418hxp copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.gGvvIC;
        C30383laC c30383laC = (C30383laC) ViewBindings.findChildViewById(view, i);
        if (c30383laC != null) {
            i = C23274hvD.Application.QKudOq;
            C30509lcW c30509lcW = (C30509lcW) ViewBindings.findChildViewById(view, i);
            if (c30509lcW != null) {
                i = C23274hvD.Application.fsSxsn;
                C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
                if (c52794wYp != null) {
                    i = C23274hvD.Application.siEkQe;
                    OKReminder oKReminder = (OKReminder) ViewBindings.findChildViewById(view, i);
                    if (oKReminder != null) {
                        i = C23274hvD.Application.dbwnZN;
                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                        if (linearLayoutCompat != null) {
                            i = C23274hvD.Application.DbvGUJ;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                            if (appCompatImageView != null) {
                                i = C23274hvD.Application.setVolumeTo;
                                LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                if (linearLayoutCompat2 != null) {
                                    i = C23274hvD.Application.createIntent;
                                    C55251xgS c55251xgS = (C55251xgS) ViewBindings.findChildViewById(view, i);
                                    if (c55251xgS != null) {
                                        i = C23274hvD.Application.EmptySuper;
                                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatTextView != null) {
                                            i = C23274hvD.Application.indexOfKeyframe;
                                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView != null) {
                                                return new C23418hxp((LinearLayoutCompat) view, c30383laC, c30509lcW, c52794wYp, oKReminder, linearLayoutCompat, appCompatImageView, linearLayoutCompat2, c55251xgS, appCompatTextView, textView);
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
