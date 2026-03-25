package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uXs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48608uXs implements ViewBinding {
    public final C55258xgZ AEQbTJ;
    public final C53573wnz AYXKKw;
    public final C53573wnz AhwBna;
    public final uBL DbNXlk;
    public final Group EZpvd;
    public final AppCompatImageView KWHzl;
    public final C53553wnf OLrzqt;
    public final android.widget.LinearLayout copydefault;
    public final C53573wnz djBIcL;
    public final C53573wnz fetchVPNInfo;
    public final C53573wnz gEmmrt;
    public final C53573wnz isConnected;
    public final android.view.View valueOf;
    public final C53573wnz values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.valueOf;
    }

    public C48608uXs(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull Group group, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C55258xgZ c55258xgZ, @androidx.annotation.NonNull C53553wnf c53553wnf, @androidx.annotation.NonNull C53573wnz c53573wnz, @androidx.annotation.NonNull C53573wnz c53573wnz2, @androidx.annotation.NonNull C53573wnz c53573wnz3, @androidx.annotation.NonNull C53573wnz c53573wnz4, @androidx.annotation.NonNull C53573wnz c53573wnz5, @androidx.annotation.NonNull C53573wnz c53573wnz6, @androidx.annotation.NonNull C53573wnz c53573wnz7, @androidx.annotation.NonNull uBL ubl) {
        this.valueOf = view;
        this.KWHzl = appCompatImageView;
        this.EZpvd = group;
        this.copydefault = linearLayout;
        this.AEQbTJ = c55258xgZ;
        this.OLrzqt = c53553wnf;
        this.AYXKKw = c53573wnz;
        this.AhwBna = c53573wnz2;
        this.djBIcL = c53573wnz3;
        this.gEmmrt = c53573wnz4;
        this.fetchVPNInfo = c53573wnz5;
        this.isConnected = c53573wnz6;
        this.values = c53573wnz7;
        this.DbNXlk = ubl;
    }

    public static C48608uXs OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C48033uCm.Activity.ORWKdN, viewGroup);
        return KWHzl(viewGroup);
    }

    public static C48608uXs KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.hDKMBd;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = C48033uCm.Application.getNewProxyInstance;
            Group group = (Group) ViewBindings.findChildViewById(view, i);
            if (group != null) {
                i = C48033uCm.Application.zsXlph;
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = C48033uCm.Application.uzCIH;
                    C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                    if (c55258xgZ != null) {
                        i = C48033uCm.Application.SdSTJp;
                        C53553wnf c53553wnf = (C53553wnf) ViewBindings.findChildViewById(view, i);
                        if (c53553wnf != null) {
                            i = C48033uCm.Application.PlaybackStateCompatActions;
                            C53573wnz c53573wnz = (C53573wnz) ViewBindings.findChildViewById(view, i);
                            if (c53573wnz != null) {
                                i = C48033uCm.Application.getPosition;
                                C53573wnz c53573wnz2 = (C53573wnz) ViewBindings.findChildViewById(view, i);
                                if (c53573wnz2 != null) {
                                    i = C48033uCm.Application.ReportDrawn;
                                    C53573wnz c53573wnz3 = (C53573wnz) ViewBindings.findChildViewById(view, i);
                                    if (c53573wnz3 != null) {
                                        i = C48033uCm.Application.getData;
                                        C53573wnz c53573wnz4 = (C53573wnz) ViewBindings.findChildViewById(view, i);
                                        if (c53573wnz4 != null) {
                                            i = C48033uCm.Application.ActivityResultContractSynchronousResult;
                                            C53573wnz c53573wnz5 = (C53573wnz) ViewBindings.findChildViewById(view, i);
                                            if (c53573wnz5 != null) {
                                                i = C48033uCm.Application.getGmsPickeractivity_release;
                                                C53573wnz c53573wnz6 = (C53573wnz) ViewBindings.findChildViewById(view, i);
                                                if (c53573wnz6 != null) {
                                                    i = C48033uCm.Application.getSelectedTab;
                                                    C53573wnz c53573wnz7 = (C53573wnz) ViewBindings.findChildViewById(view, i);
                                                    if (c53573wnz7 != null) {
                                                        i = C48033uCm.Application.WindowDecorActionBarActionModeImpl;
                                                        uBL ubl = (uBL) ViewBindings.findChildViewById(view, i);
                                                        if (ubl != null) {
                                                            return new C48608uXs(view, appCompatImageView, group, linearLayout, c55258xgZ, c53553wnf, c53573wnz, c53573wnz2, c53573wnz3, c53573wnz4, c53573wnz5, c53573wnz6, c53573wnz7, ubl);
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
