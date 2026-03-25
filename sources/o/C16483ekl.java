package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ekl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C16483ekl implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.FrameLayout AYXKKw;
    public final android.widget.RelativeLayout AhwBna;
    public final android.widget.TextView AkhnZx;
    public final C55008xbo DbNXlk;
    public final C55008xbo EZpvd;
    public final C55018xby KWHzl;
    public final C52794wYp OLrzqt;
    public final ConstraintLayout copydefault;
    public final C55008xbo djBIcL;
    public final android.widget.FrameLayout fetchVPNInfo;
    public final C55239xgG gEmmrt;
    public final android.widget.LinearLayout isConnected;
    public final C55008xbo valueOf;
    public final C14693dqK values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.fetchVPNInfo;
    }

    public C16483ekl(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull C55018xby c55018xby, @androidx.annotation.NonNull C55008xbo c55008xbo, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull C55239xgG c55239xgG, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2, @androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout, @androidx.annotation.NonNull C55008xbo c55008xbo2, @androidx.annotation.NonNull C55008xbo c55008xbo3, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C14693dqK c14693dqK, @androidx.annotation.NonNull C55008xbo c55008xbo4, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.fetchVPNInfo = frameLayout;
        this.copydefault = constraintLayout;
        this.OLrzqt = c52794wYp;
        this.KWHzl = c55018xby;
        this.EZpvd = c55008xbo;
        this.AEQbTJ = imageView;
        this.gEmmrt = c55239xgG;
        this.AYXKKw = frameLayout2;
        this.AhwBna = relativeLayout;
        this.valueOf = c55008xbo2;
        this.djBIcL = c55008xbo3;
        this.isConnected = linearLayout;
        this.values = c14693dqK;
        this.DbNXlk = c55008xbo4;
        this.AkhnZx = textView;
    }

    public static C16483ekl AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.profile;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C13754dXa.ActionBar.clearRegistrations;
            C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
            if (c52794wYp != null) {
                i = C13754dXa.ActionBar.fdt;
                C55018xby c55018xby = (C55018xby) ViewBindings.findChildViewById(view, i);
                if (c55018xby != null) {
                    i = C13754dXa.ActionBar.finishInit;
                    C55008xbo c55008xbo = (C55008xbo) ViewBindings.findChildViewById(view, i);
                    if (c55008xbo != null) {
                        i = C13754dXa.ActionBar.GiPPlLgiPPlL;
                        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = C13754dXa.ActionBar.fZc;
                            C55239xgG c55239xgG = (C55239xgG) ViewBindings.findChildViewById(view, i);
                            if (c55239xgG != null) {
                                i = C13754dXa.ActionBar.fAklCm;
                                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                                if (frameLayout != null) {
                                    i = C13754dXa.ActionBar.extraCallbackWithResult;
                                    android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) ViewBindings.findChildViewById(view, i);
                                    if (relativeLayout != null) {
                                        i = C13754dXa.ActionBar.onNavigationEvent;
                                        C55008xbo c55008xbo2 = (C55008xbo) ViewBindings.findChildViewById(view, i);
                                        if (c55008xbo2 != null) {
                                            i = C13754dXa.ActionBar.onRelationshipValidationResult;
                                            C55008xbo c55008xbo3 = (C55008xbo) ViewBindings.findChildViewById(view, i);
                                            if (c55008xbo3 != null) {
                                                i = C13754dXa.ActionBar.asInterface;
                                                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                                if (linearLayout != null) {
                                                    i = C13754dXa.ActionBar.asBinder;
                                                    C14693dqK c14693dqK = (C14693dqK) ViewBindings.findChildViewById(view, i);
                                                    if (c14693dqK != null) {
                                                        i = C13754dXa.ActionBar.getDefaultImpl;
                                                        C55008xbo c55008xbo4 = (C55008xbo) ViewBindings.findChildViewById(view, i);
                                                        if (c55008xbo4 != null) {
                                                            i = C13754dXa.ActionBar.MediaSessionCompatApi24Callback;
                                                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView != null) {
                                                                return new C16483ekl((android.widget.FrameLayout) view, constraintLayout, c52794wYp, c55018xby, c55008xbo, imageView, c55239xgG, frameLayout, relativeLayout, c55008xbo2, c55008xbo3, linearLayout, c14693dqK, c55008xbo4, textView);
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
