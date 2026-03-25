package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.reminder.OKReminder;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iNm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C23900iNm implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final C27250jre EZpvd;
    public final OKReminder KWHzl;
    public final C27228jrI OLrzqt;
    public final android.widget.TextView copydefault;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.AEQbTJ;
    }

    public C23900iNm(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C27228jrI c27228jrI, @androidx.annotation.NonNull C27250jre c27250jre, @androidx.annotation.NonNull OKReminder oKReminder, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.AEQbTJ = linearLayout;
        this.OLrzqt = c27228jrI;
        this.EZpvd = c27250jre;
        this.KWHzl = oKReminder;
        this.copydefault = textView;
        this.valueOf = textView2;
    }

    public static C23900iNm KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.aKhcqp, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C23900iNm OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.zbGDDc;
        C27228jrI c27228jrI = (C27228jrI) ViewBindings.findChildViewById(view, i);
        if (c27228jrI != null) {
            i = C25493ixk.ActionBar.OGitdB;
            C27250jre c27250jre = (C27250jre) ViewBindings.findChildViewById(view, i);
            if (c27250jre != null) {
                i = C25493ixk.ActionBar.FF;
                OKReminder oKReminder = (OKReminder) ViewBindings.findChildViewById(view, i);
                if (oKReminder != null) {
                    i = C25493ixk.ActionBar.zeUJxr;
                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = C25493ixk.ActionBar.GVpNrsfQMcgE;
                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            return new C23900iNm((android.widget.LinearLayout) view, c27228jrI, c27250jre, oKReminder, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
