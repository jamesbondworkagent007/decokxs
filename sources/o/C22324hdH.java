package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.reminder.OKReminder;
import o.C22366hdx;

/* JADX INFO: renamed from: o.hdH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C22324hdH implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final C55173xeu AYXKKw;
    public final android.widget.TextView AhwBna;
    public final RecyclerView EZpvd;
    public final C52794wYp KWHzl;
    public final C52794wYp OLrzqt;
    public final OKReminder copydefault;
    public final ConstraintLayout djBIcL;
    public final C55113xdn gEmmrt;
    public final android.view.View valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.djBIcL;
    }

    public C22324hdH(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull OKReminder oKReminder, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull C52794wYp c52794wYp2, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.view.View view) {
        this.djBIcL = constraintLayout;
        this.AEQbTJ = linearLayout;
        this.copydefault = oKReminder;
        this.EZpvd = recyclerView;
        this.KWHzl = c52794wYp;
        this.OLrzqt = c52794wYp2;
        this.AYXKKw = c55173xeu;
        this.gEmmrt = c55113xdn;
        this.AhwBna = textView;
        this.valueOf = view;
    }

    public static C22324hdH AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C22366hdx.Activity.DbNXlk, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C22324hdH AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C22366hdx.ActionBar.KWHzl;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C22366hdx.ActionBar.EZpvd;
            OKReminder oKReminder = (OKReminder) ViewBindings.findChildViewById(view, i);
            if (oKReminder != null) {
                i = C22366hdx.ActionBar.AYXKKw;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = C22366hdx.ActionBar.djBIcL;
                    C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
                    if (c52794wYp != null) {
                        i = C22366hdx.ActionBar.valueOf;
                        C52794wYp c52794wYp2 = (C52794wYp) ViewBindings.findChildViewById(view, i);
                        if (c52794wYp2 != null) {
                            i = C22366hdx.ActionBar.zsXlph;
                            C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                            if (c55173xeu != null) {
                                i = C22366hdx.ActionBar.getPostValueLengthLimit;
                                C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                                if (c55113xdn != null) {
                                    i = C22366hdx.ActionBar.swzYdv;
                                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C22366hdx.ActionBar.DTg))) != null) {
                                        return new C22324hdH((ConstraintLayout) view, linearLayout, oKReminder, recyclerView, c52794wYp, c52794wYp2, c55173xeu, c55113xdn, textView, viewFindChildViewById);
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
