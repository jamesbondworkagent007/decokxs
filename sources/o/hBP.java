package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.business.dexui.main.swap.trade.status.widget.ErrorNoticeView;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hBP implements ViewBinding {
    public final C24614ihE AEQbTJ;
    public final C25049ipQ AYXKKw;
    public final android.widget.TextView AhwBna;
    public final ErrorNoticeView EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final C24795ika OLrzqt;
    public final android.view.View copydefault;
    public final C25049ipQ djBIcL;
    public final android.widget.LinearLayout gEmmrt;
    public final C25035ipC valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C25049ipQ getRoot() {
        return this.djBIcL;
    }

    public hBP(@androidx.annotation.NonNull C25049ipQ c25049ipQ, @androidx.annotation.NonNull C24614ihE c24614ihE, @androidx.annotation.NonNull ErrorNoticeView errorNoticeView, @androidx.annotation.NonNull C24795ika c24795ika, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C25035ipC c25035ipC, @androidx.annotation.NonNull C25049ipQ c25049ipQ2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2) {
        this.djBIcL = c25049ipQ;
        this.AEQbTJ = c24614ihE;
        this.EZpvd = errorNoticeView;
        this.OLrzqt = c24795ika;
        this.copydefault = view;
        this.KWHzl = linearLayout;
        this.AhwBna = textView;
        this.valueOf = c25035ipC;
        this.AYXKKw = c25049ipQ2;
        this.gEmmrt = linearLayout2;
    }

    public static hBP KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.RzdrRQ, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static hBP EZpvd(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C23274hvD.Application.hvKCwS;
        C24614ihE c24614ihE = (C24614ihE) ViewBindings.findChildViewById(view, i);
        if (c24614ihE != null) {
            i = C23274hvD.Application.fDu;
            ErrorNoticeView errorNoticeView = (ErrorNoticeView) ViewBindings.findChildViewById(view, i);
            if (errorNoticeView != null) {
                i = C23274hvD.Application.aVPvww;
                C24795ika c24795ika = (C24795ika) ViewBindings.findChildViewById(view, i);
                if (c24795ika != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.ActivityViewModelLazyKtviewModels3))) != null) {
                    i = C23274hvD.Application.ActivityViewModelLazyKtviewModels1;
                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = C23274hvD.Application.ActivityViewModelLazyKtviewModelsfactoryPromise2;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = C23274hvD.Application.addOnTrimMemoryListener;
                            C25035ipC c25035ipC = (C25035ipC) ViewBindings.findChildViewById(view, i);
                            if (c25035ipC != null) {
                                C25049ipQ c25049ipQ = (C25049ipQ) view;
                                i = C23274hvD.Application.codename;
                                android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout2 != null) {
                                    return new hBP(c25049ipQ, c24614ihE, errorNoticeView, c24795ika, viewFindChildViewById, linearLayout, textView, c25035ipC, c25049ipQ, linearLayout2);
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
