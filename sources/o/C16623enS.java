package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.enS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C16623enS implements ViewBinding {
    public final C55008xbo AEQbTJ;
    public final C57440yiU AYXKKw;
    public final C16411ejS AhwBna;
    public final ConstraintLayout AkhnZx;
    public final android.widget.TextView DbNXlk;
    public final AppCompatImageView EZpvd;
    public final C52794wYp KWHzl;
    public final C55008xbo OLrzqt;
    public final C33537myN copydefault;
    public final android.widget.LinearLayout djBIcL;
    public final android.widget.TextView fetchVPNInfo;
    public final android.view.View gEmmrt;
    public final android.widget.ImageView isConnected;
    public final C55113xdn valueOf;
    public final ConstraintLayout values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AkhnZx;
    }

    public C16623enS(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C55008xbo c55008xbo, @androidx.annotation.NonNull C33537myN c33537myN, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull C55008xbo c55008xbo2, @androidx.annotation.NonNull C57440yiU c57440yiU, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C16411ejS c16411ejS, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.AkhnZx = constraintLayout;
        this.AEQbTJ = c55008xbo;
        this.copydefault = c33537myN;
        this.KWHzl = c52794wYp;
        this.EZpvd = appCompatImageView;
        this.OLrzqt = c55008xbo2;
        this.AYXKKw = c57440yiU;
        this.djBIcL = linearLayout;
        this.gEmmrt = view;
        this.AhwBna = c16411ejS;
        this.valueOf = c55113xdn;
        this.values = constraintLayout2;
        this.DbNXlk = textView;
        this.isConnected = imageView;
        this.fetchVPNInfo = textView2;
    }

    public static C16623enS KWHzl(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        android.view.View viewFindChildViewById2;
        int i = C13754dXa.ActionBar.OcIXYQ;
        C55008xbo c55008xbo = (C55008xbo) ViewBindings.findChildViewById(view, i);
        if (c55008xbo != null) {
            i = C13754dXa.ActionBar.iZzfmt;
            C33537myN c33537myN = (C33537myN) ViewBindings.findChildViewById(view, i);
            if (c33537myN != null) {
                i = C13754dXa.ActionBar.TarCU;
                C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
                if (c52794wYp != null) {
                    i = C13754dXa.ActionBar.UscePu;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                    if (appCompatImageView != null) {
                        i = C13754dXa.ActionBar.MediaBrowserCompatMediaBrowserImplApi21;
                        C55008xbo c55008xbo2 = (C55008xbo) ViewBindings.findChildViewById(view, i);
                        if (c55008xbo2 != null) {
                            i = C13754dXa.ActionBar.getStateLabel;
                            C57440yiU c57440yiU = (C57440yiU) ViewBindings.findChildViewById(view, i);
                            if (c57440yiU != null) {
                                i = C13754dXa.ActionBar.isCurrent;
                                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C13754dXa.ActionBar.MediaBrowserCompatMediaBrowserImplApi26))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C13754dXa.ActionBar.MediaBrowserCompatMediaBrowserImplBase4))) != null) {
                                    C16411ejS c16411ejSCopydefault = C16411ejS.copydefault(viewFindChildViewById2);
                                    i = C13754dXa.ActionBar.MediaBrowserCompatMediaBrowserImplBase3;
                                    C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                                    if (c55113xdn != null) {
                                        i = C13754dXa.ActionBar.MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection;
                                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                        if (constraintLayout != null) {
                                            i = C13754dXa.ActionBar.createFromParcel;
                                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView != null) {
                                                i = C13754dXa.ActionBar.setFlags;
                                                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                                if (imageView != null) {
                                                    i = C13754dXa.ActionBar.setCallback;
                                                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView2 != null) {
                                                        return new C16623enS((ConstraintLayout) view, c55008xbo, c33537myN, c52794wYp, appCompatImageView, c55008xbo2, c57440yiU, linearLayout, viewFindChildViewById, c16411ejSCopydefault, c55113xdn, constraintLayout, textView, imageView, textView2);
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
