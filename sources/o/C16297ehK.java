package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.edit.OKEditText;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ehK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C16297ehK implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView AhwBna;
    public final C33537myN EZpvd;
    public final OKEditText KWHzl;
    public final C52794wYp OLrzqt;
    public final wYF copydefault;
    public final C52794wYp djBIcL;
    public final ConstraintLayout gEmmrt;
    public final android.widget.ScrollView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.gEmmrt;
    }

    public C16297ehK(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C33537myN c33537myN, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull wYF wyf, @androidx.annotation.NonNull OKEditText oKEditText, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C52794wYp c52794wYp2, @androidx.annotation.NonNull android.widget.ScrollView scrollView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.gEmmrt = constraintLayout;
        this.EZpvd = c33537myN;
        this.OLrzqt = c52794wYp;
        this.copydefault = wyf;
        this.KWHzl = oKEditText;
        this.AEQbTJ = textView;
        this.djBIcL = c52794wYp2;
        this.valueOf = scrollView;
        this.AhwBna = textView2;
    }

    public static C16297ehK KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return KWHzl(layoutInflater, null, false);
    }

    public static C16297ehK KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.OcIXYQ, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C16297ehK KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.accept;
        C33537myN c33537myN = (C33537myN) ViewBindings.findChildViewById(view, i);
        if (c33537myN != null) {
            i = C13754dXa.ActionBar.DcMfJKDGTeJD;
            C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
            if (c52794wYp != null) {
                i = C13754dXa.ActionBar.DcMfJKfNUfqk;
                wYF wyf = (wYF) ViewBindings.findChildViewById(view, i);
                if (wyf != null) {
                    i = C13754dXa.ActionBar.DBAlnt;
                    OKEditText oKEditText = (OKEditText) ViewBindings.findChildViewById(view, i);
                    if (oKEditText != null) {
                        i = C13754dXa.ActionBar.idLUrz;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = C13754dXa.ActionBar.getString;
                            C52794wYp c52794wYp2 = (C52794wYp) ViewBindings.findChildViewById(view, i);
                            if (c52794wYp2 != null) {
                                i = C13754dXa.ActionBar.ensureClassLoader;
                                android.widget.ScrollView scrollView = (android.widget.ScrollView) ViewBindings.findChildViewById(view, i);
                                if (scrollView != null) {
                                    i = C13754dXa.ActionBar.PlaybackStateCompatBuilder;
                                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView2 != null) {
                                        return new C16297ehK((ConstraintLayout) view, c33537myN, c52794wYp, wyf, oKEditText, textView, c52794wYp2, scrollView, textView2);
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
