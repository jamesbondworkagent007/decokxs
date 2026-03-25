package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.flexbox.FlexboxLayout;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uRz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C48453uRz implements ViewBinding {
    public final FlexboxLayout AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final LinearLayoutCompat AhwBna;
    public final C55320xhi AkhnZx;
    public final C55320xhi AuCTel;
    public final C55320xhi DbNXlk;
    public final wYD EZpvd;
    public final AppCompatTextView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final C55320xhi copydefault;
    public final android.widget.ImageView djBIcL;
    public final android.view.View ejfBZ;
    public final C55320xhi fARcdN;
    public final C55320xhi fIwbmz;
    public final C55320xhi fJNWhG;
    public final C55320xhi fetchVPNInfo;
    public final LinearLayoutCompat gEmmrt;
    public final LinearLayoutCompat isConnected;
    public final LinearLayoutCompat valueOf;
    public final C55320xhi values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.isConnected;
    }

    public C48453uRz(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull wYD wyd, @androidx.annotation.NonNull C55320xhi c55320xhi, @androidx.annotation.NonNull FlexboxLayout flexboxLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat3, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat4, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull C55320xhi c55320xhi2, @androidx.annotation.NonNull C55320xhi c55320xhi3, @androidx.annotation.NonNull C55320xhi c55320xhi4, @androidx.annotation.NonNull C55320xhi c55320xhi5, @androidx.annotation.NonNull C55320xhi c55320xhi6, @androidx.annotation.NonNull C55320xhi c55320xhi7, @androidx.annotation.NonNull C55320xhi c55320xhi8, @androidx.annotation.NonNull C55320xhi c55320xhi9, @androidx.annotation.NonNull android.view.View view) {
        this.isConnected = linearLayoutCompat;
        this.KWHzl = appCompatTextView;
        this.EZpvd = wyd;
        this.copydefault = c55320xhi;
        this.AEQbTJ = flexboxLayout;
        this.OLrzqt = textView;
        this.djBIcL = imageView;
        this.AhwBna = linearLayoutCompat2;
        this.valueOf = linearLayoutCompat3;
        this.gEmmrt = linearLayoutCompat4;
        this.AYXKKw = textView2;
        this.values = c55320xhi2;
        this.AkhnZx = c55320xhi3;
        this.DbNXlk = c55320xhi4;
        this.fetchVPNInfo = c55320xhi5;
        this.fJNWhG = c55320xhi6;
        this.AuCTel = c55320xhi7;
        this.fIwbmz = c55320xhi8;
        this.fARcdN = c55320xhi9;
        this.ejfBZ = view;
    }

    public static C48453uRz EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.DGUQLIhJrIAr, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C48453uRz EZpvd(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C48033uCm.Application.invokespecialatDTRm;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
        if (appCompatTextView != null) {
            i = C48033uCm.Application.DeEinT;
            wYD wyd = (wYD) ViewBindings.findChildViewById(view, i);
            if (wyd != null) {
                i = C48033uCm.Application.OxbLUn;
                C55320xhi c55320xhi = (C55320xhi) ViewBindings.findChildViewById(view, i);
                if (c55320xhi != null) {
                    i = C48033uCm.Application.itxZVF;
                    FlexboxLayout flexboxLayout = (FlexboxLayout) ViewBindings.findChildViewById(view, i);
                    if (flexboxLayout != null) {
                        i = C48033uCm.Application.DzCpqu;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = C48033uCm.Application.ITrustedWebActivityServiceStubProxy;
                            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView != null) {
                                i = C48033uCm.Application.onStop;
                                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                if (linearLayoutCompat != null) {
                                    i = C48033uCm.Application.setSessionImpl;
                                    LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                    if (linearLayoutCompat2 != null) {
                                        LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) view;
                                        i = C48033uCm.Application.setCurrentControllerInfo;
                                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView2 != null) {
                                            i = C48033uCm.Application.setLocalNightMode;
                                            C55320xhi c55320xhi2 = (C55320xhi) ViewBindings.findChildViewById(view, i);
                                            if (c55320xhi2 != null) {
                                                i = C48033uCm.Application.AppCompatDelegateNightMode;
                                                C55320xhi c55320xhi3 = (C55320xhi) ViewBindings.findChildViewById(view, i);
                                                if (c55320xhi3 != null) {
                                                    i = C48033uCm.Application.invalidatePanelMenu;
                                                    C55320xhi c55320xhi4 = (C55320xhi) ViewBindings.findChildViewById(view, i);
                                                    if (c55320xhi4 != null) {
                                                        i = C48033uCm.Application.performPanelShortcut;
                                                        C55320xhi c55320xhi5 = (C55320xhi) ViewBindings.findChildViewById(view, i);
                                                        if (c55320xhi5 != null) {
                                                            i = C48033uCm.Application.getApplyableNightMode;
                                                            C55320xhi c55320xhi6 = (C55320xhi) ViewBindings.findChildViewById(view, i);
                                                            if (c55320xhi6 != null) {
                                                                i = C48033uCm.Application.setActionBarCallback;
                                                                C55320xhi c55320xhi7 = (C55320xhi) ViewBindings.findChildViewById(view, i);
                                                                if (c55320xhi7 != null) {
                                                                    i = C48033uCm.Application.setup;
                                                                    C55320xhi c55320xhi8 = (C55320xhi) ViewBindings.findChildViewById(view, i);
                                                                    if (c55320xhi8 != null) {
                                                                        i = C48033uCm.Application.onChange;
                                                                        C55320xhi c55320xhi9 = (C55320xhi) ViewBindings.findChildViewById(view, i);
                                                                        if (c55320xhi9 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C48033uCm.Application.WindowDecorActionBar3))) != null) {
                                                                            return new C48453uRz(linearLayoutCompat3, appCompatTextView, wyd, c55320xhi, flexboxLayout, textView, imageView, linearLayoutCompat, linearLayoutCompat2, linearLayoutCompat3, textView2, c55320xhi2, c55320xhi3, c55320xhi4, c55320xhi5, c55320xhi6, c55320xhi7, c55320xhi8, c55320xhi9, viewFindChildViewById);
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
