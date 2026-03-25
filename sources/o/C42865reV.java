package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.view.OKSortTextView;
import o.qZH;

/* JADX INFO: renamed from: o.reV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C42865reV implements ViewBinding {
    public final OKSortTextView AEQbTJ;
    public final OKSortTextView AhwBna;
    public final AppCompatTextView EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.view.View OLrzqt;
    public final OKSortTextView copydefault;
    public final OKSortTextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.OLrzqt;
    }

    public C42865reV(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull OKSortTextView oKSortTextView, @androidx.annotation.NonNull OKSortTextView oKSortTextView2, @androidx.annotation.NonNull OKSortTextView oKSortTextView3, @androidx.annotation.NonNull OKSortTextView oKSortTextView4) {
        this.OLrzqt = view;
        this.EZpvd = appCompatTextView;
        this.KWHzl = textView;
        this.AEQbTJ = oKSortTextView;
        this.copydefault = oKSortTextView2;
        this.AhwBna = oKSortTextView3;
        this.valueOf = oKSortTextView4;
    }

    public static C42865reV OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(qZH.ActionBar.glVQsU, viewGroup);
        return AEQbTJ(viewGroup);
    }

    public static C42865reV AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.QqiRNA;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
        if (appCompatTextView != null) {
            i = qZH.StateListAnimator.areNotificationsEnabled;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = qZH.StateListAnimator.getSmallIconBitmap;
                OKSortTextView oKSortTextView = (OKSortTextView) ViewBindings.findChildViewById(view, i);
                if (oKSortTextView != null) {
                    i = qZH.StateListAnimator.cancelNotification;
                    OKSortTextView oKSortTextView2 = (OKSortTextView) ViewBindings.findChildViewById(view, i);
                    if (oKSortTextView2 != null) {
                        i = qZH.StateListAnimator.getSmallIconId;
                        OKSortTextView oKSortTextView3 = (OKSortTextView) ViewBindings.findChildViewById(view, i);
                        if (oKSortTextView3 != null) {
                            i = qZH.StateListAnimator.ITrustedWebActivityServiceDefault;
                            OKSortTextView oKSortTextView4 = (OKSortTextView) ViewBindings.findChildViewById(view, i);
                            if (oKSortTextView4 != null) {
                                return new C42865reV(view, appCompatTextView, textView, oKSortTextView, oKSortTextView2, oKSortTextView3, oKSortTextView4);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
