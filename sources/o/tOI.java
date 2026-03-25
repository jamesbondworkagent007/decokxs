package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.banner.OKAlertBanner;
import o.C47501trL;

/* JADX INFO: loaded from: classes10.dex */
public final class tOI implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final ConstraintLayout EZpvd;
    public final android.widget.TextView KWHzl;
    public final C46102tHx OLrzqt;
    public final OKAlertBanner copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.EZpvd;
    }

    public tOI(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull OKAlertBanner oKAlertBanner, @androidx.annotation.NonNull C46102tHx c46102tHx, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.EZpvd = constraintLayout;
        this.copydefault = oKAlertBanner;
        this.OLrzqt = c46102tHx;
        this.AEQbTJ = imageView;
        this.KWHzl = textView;
        this.AYXKKw = textView2;
    }

    public static tOI AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C47501trL.TaskDescription.gEmmrt;
        OKAlertBanner oKAlertBanner = (OKAlertBanner) ViewBindings.findChildViewById(view, i);
        if (oKAlertBanner != null) {
            i = C47501trL.TaskDescription.QVAiDq;
            C46102tHx c46102tHx = (C46102tHx) ViewBindings.findChildViewById(view, i);
            if (c46102tHx != null) {
                i = C47501trL.TaskDescription.ggKfIT;
                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C47501trL.TaskDescription.HJWChPUUMfbK;
                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = C47501trL.TaskDescription.DuR;
                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            return new tOI((ConstraintLayout) view, oKAlertBanner, c46102tHx, imageView, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
