package o;

import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hzp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C23524hzp implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final C55113xdn AYXKKw;
    public final android.widget.ImageView AhwBna;
    public final android.widget.TextView AkhnZx;
    public final android.widget.TextView DbNXlk;
    public final android.view.View EZpvd;
    public final android.widget.ImageView KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final Group copydefault;
    public final android.view.View djBIcL;
    public final android.view.View fetchVPNInfo;
    public final android.widget.ImageView gEmmrt;
    public final android.widget.TextView isConnected;
    public final C55113xdn valueOf;
    public final android.view.View values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.values;
    }

    public C23524hzp(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.view.View view2, @androidx.annotation.NonNull android.view.View view3, @androidx.annotation.NonNull Group group, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.ImageView imageView3, @androidx.annotation.NonNull android.widget.ImageView imageView4, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull android.view.View view4, @androidx.annotation.NonNull C55113xdn c55113xdn2, @androidx.annotation.NonNull android.view.View view5, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3) {
        this.values = view;
        this.AEQbTJ = view2;
        this.EZpvd = view3;
        this.copydefault = group;
        this.KWHzl = imageView;
        this.OLrzqt = imageView2;
        this.gEmmrt = imageView3;
        this.AhwBna = imageView4;
        this.valueOf = c55113xdn;
        this.djBIcL = view4;
        this.AYXKKw = c55113xdn2;
        this.fetchVPNInfo = view5;
        this.DbNXlk = textView;
        this.AkhnZx = textView2;
        this.isConnected = textView3;
    }

    public static C23524hzp EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C23274hvD.Activity.QVsKAR, viewGroup);
        return KWHzl(viewGroup);
    }

    public static C23524hzp KWHzl(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        android.view.View viewFindChildViewById2;
        android.view.View viewFindChildViewById3;
        int i = C23274hvD.Application.GQzpsZsQwTVT;
        android.view.View viewFindChildViewById4 = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById4 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.GcnicV))) != null) {
            i = C23274hvD.Application.Ohcwxs;
            Group group = (Group) ViewBindings.findChildViewById(view, i);
            if (group != null) {
                i = C23274hvD.Application.UNDaji;
                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C23274hvD.Application.IPostMessageServiceDefault;
                    android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        i = C23274hvD.Application.ITrustedWebActivityCallbackDefault;
                        android.widget.ImageView imageView3 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView3 != null) {
                            i = C23274hvD.Application.access100;
                            android.widget.ImageView imageView4 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView4 != null) {
                                i = C23274hvD.Application.getRatingStyle;
                                C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                                if (c55113xdn != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.newUnratedRating))) != null) {
                                    i = C23274hvD.Application.getName;
                                    C55113xdn c55113xdn2 = (C55113xdn) ViewBindings.findChildViewById(view, i);
                                    if (c55113xdn2 != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.getIcon))) != null) {
                                        i = C23274hvD.Application.supportInvalidateOptionsMenu;
                                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView != null) {
                                            i = C23274hvD.Application.initWindowDecorActionBar;
                                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView2 != null) {
                                                i = C23274hvD.Application.AppCompatDelegateImplAutoBatteryNightModeManager;
                                                android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView3 != null) {
                                                    return new C23524hzp(view, viewFindChildViewById4, viewFindChildViewById, group, imageView, imageView2, imageView3, imageView4, c55113xdn, viewFindChildViewById2, c55113xdn2, viewFindChildViewById3, textView, textView2, textView3);
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
