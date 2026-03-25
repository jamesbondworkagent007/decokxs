package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.business.dex.trade.copytrading.edit.ui.widget.CopyTradingRangeFilterLayout;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hzx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C23532hzx implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.view.View AYXKKw;
    public final CopyTradingRangeFilterLayout AhwBna;
    public final android.widget.LinearLayout EZpvd;
    public final CopyTradingRangeFilterLayout KWHzl;
    public final CopyTradingRangeFilterLayout OLrzqt;
    public final CopyTradingRangeFilterLayout copydefault;
    public final C19933gUs gEmmrt;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.AYXKKw;
    }

    public C23532hzx(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull CopyTradingRangeFilterLayout copyTradingRangeFilterLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull CopyTradingRangeFilterLayout copyTradingRangeFilterLayout2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull CopyTradingRangeFilterLayout copyTradingRangeFilterLayout3, @androidx.annotation.NonNull CopyTradingRangeFilterLayout copyTradingRangeFilterLayout4, @androidx.annotation.NonNull C19933gUs c19933gUs, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.AYXKKw = view;
        this.copydefault = copyTradingRangeFilterLayout;
        this.AEQbTJ = imageView;
        this.KWHzl = copyTradingRangeFilterLayout2;
        this.EZpvd = linearLayout;
        this.OLrzqt = copyTradingRangeFilterLayout3;
        this.AhwBna = copyTradingRangeFilterLayout4;
        this.gEmmrt = c19933gUs;
        this.valueOf = textView;
    }

    public static C23532hzx KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C23274hvD.Activity.fjfviF, viewGroup);
        return KWHzl(viewGroup);
    }

    public static C23532hzx KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.hfdhUn;
        CopyTradingRangeFilterLayout copyTradingRangeFilterLayout = (CopyTradingRangeFilterLayout) ViewBindings.findChildViewById(view, i);
        if (copyTradingRangeFilterLayout != null) {
            i = C23274hvD.Application.UNDaji;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C23274hvD.Application.RatingCompat;
                CopyTradingRangeFilterLayout copyTradingRangeFilterLayout2 = (CopyTradingRangeFilterLayout) ViewBindings.findChildViewById(view, i);
                if (copyTradingRangeFilterLayout2 != null) {
                    i = C23274hvD.Application.MediaControllerCompatMediaControllerImplApi23;
                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = C23274hvD.Application.handleMediaPlayPauseKeySingleTapIfPending;
                        CopyTradingRangeFilterLayout copyTradingRangeFilterLayout3 = (CopyTradingRangeFilterLayout) ViewBindings.findChildViewById(view, i);
                        if (copyTradingRangeFilterLayout3 != null) {
                            i = C23274hvD.Application.ActivityResultContractsGetMultipleContents;
                            CopyTradingRangeFilterLayout copyTradingRangeFilterLayout4 = (CopyTradingRangeFilterLayout) ViewBindings.findChildViewById(view, i);
                            if (copyTradingRangeFilterLayout4 != null) {
                                i = C23274hvD.Application.ActivityResultContractsPickContact;
                                C19933gUs c19933gUs = (C19933gUs) ViewBindings.findChildViewById(view, i);
                                if (c19933gUs != null) {
                                    i = C23274hvD.Application.ActionBarTabListener;
                                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView != null) {
                                        return new C23532hzx(view, copyTradingRangeFilterLayout, imageView, copyTradingRangeFilterLayout2, linearLayout, copyTradingRangeFilterLayout3, copyTradingRangeFilterLayout4, c19933gUs, textView);
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
