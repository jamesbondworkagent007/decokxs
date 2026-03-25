package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uSn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48468uSn implements ViewBinding {
    public final C47988uAv AEQbTJ;
    public final C53539wnR EZpvd;
    public final android.widget.TextView KWHzl;
    public final C47988uAv OLrzqt;
    public final LinearLayoutCompat copydefault;
    public final C47988uAv gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.copydefault;
    }

    public C48468uSn(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C53539wnR c53539wnR, @androidx.annotation.NonNull C47988uAv c47988uAv, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C47988uAv c47988uAv2, @androidx.annotation.NonNull C47988uAv c47988uAv3) {
        this.copydefault = linearLayoutCompat;
        this.EZpvd = c53539wnR;
        this.AEQbTJ = c47988uAv;
        this.KWHzl = textView;
        this.OLrzqt = c47988uAv2;
        this.gEmmrt = c47988uAv3;
    }

    public static C48468uSn AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.DQzvGNdrmXxu, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C48468uSn EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.TarCU;
        C53539wnR c53539wnR = (C53539wnR) ViewBindings.findChildViewById(view, i);
        if (c53539wnR != null) {
            i = C48033uCm.Application.sTbpmZ;
            C47988uAv c47988uAv = (C47988uAv) ViewBindings.findChildViewById(view, i);
            if (c47988uAv != null) {
                i = C48033uCm.Application.MediaControllerCompatTransportControls;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = C48033uCm.Application.ReportDrawnKtReportDrawn1;
                    C47988uAv c47988uAv2 = (C47988uAv) ViewBindings.findChildViewById(view, i);
                    if (c47988uAv2 != null) {
                        i = C48033uCm.Application.onMenuKeyEvent;
                        C47988uAv c47988uAv3 = (C47988uAv) ViewBindings.findChildViewById(view, i);
                        if (c47988uAv3 != null) {
                            return new C48468uSn((LinearLayoutCompat) view, c53539wnR, c47988uAv, textView, c47988uAv2, c47988uAv3);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
