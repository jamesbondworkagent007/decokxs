package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.view.OKSortTextView;
import o.qZH;

/* JADX INFO: renamed from: o.rfd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42926rfd implements ViewBinding {
    public final OKSortTextView AEQbTJ;
    public final android.view.View EZpvd;
    public final OKSortTextView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.TextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.EZpvd;
    }

    public C42926rfd(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull OKSortTextView oKSortTextView, @androidx.annotation.NonNull OKSortTextView oKSortTextView2, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.EZpvd = view;
        this.OLrzqt = textView;
        this.AEQbTJ = oKSortTextView;
        this.KWHzl = oKSortTextView2;
        this.copydefault = textView2;
    }

    public static C42926rfd EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(qZH.ActionBar.DDjfYY, viewGroup);
        return OLrzqt(viewGroup);
    }

    public static C42926rfd OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.notifyNotificationWithChannel;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = qZH.StateListAnimator.getSmallIconId;
            OKSortTextView oKSortTextView = (OKSortTextView) ViewBindings.findChildViewById(view, i);
            if (oKSortTextView != null) {
                i = qZH.StateListAnimator.cancelAll;
                OKSortTextView oKSortTextView2 = (OKSortTextView) ViewBindings.findChildViewById(view, i);
                if (oKSortTextView2 != null) {
                    i = qZH.StateListAnimator.ITrustedWebActivityServiceStub;
                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        return new C42926rfd(view, textView, oKSortTextView, oKSortTextView2, textView2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
