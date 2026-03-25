package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.banner.OKAlertBanner;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ejp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C16434ejp implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.view.View AhwBna;
    public final C33546myW AkhnZx;
    public final AppCompatTextView AuCTel;
    public final android.widget.TextView DbNXlk;
    public final C52794wYp EZpvd;
    public final OKAlertBanner KWHzl;
    public final wYK OLrzqt;
    public final C55113xdn copydefault;
    public final android.widget.ImageView djBIcL;
    public final android.widget.TextView ejfBZ;
    public final C33603mza fARcdN;
    public final android.widget.LinearLayout fIwbmz;
    public final ConstraintLayout fJNWhG;
    public final RecyclerView fetchVPNInfo;
    public final android.widget.TextView gEmmrt;
    public final C55113xdn isConnected;
    public final android.widget.Space valueOf;
    public final android.widget.ImageView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.fIwbmz;
    }

    public C16434ejp(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull OKAlertBanner oKAlertBanner, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull wYK wyk, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.Space space, @androidx.annotation.NonNull C55113xdn c55113xdn2, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C33546myW c33546myW, @androidx.annotation.NonNull C33603mza c33603mza, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull AppCompatTextView appCompatTextView) {
        this.fIwbmz = linearLayout;
        this.KWHzl = oKAlertBanner;
        this.copydefault = c55113xdn;
        this.EZpvd = c52794wYp;
        this.OLrzqt = wyk;
        this.AEQbTJ = textView;
        this.gEmmrt = textView2;
        this.AYXKKw = textView3;
        this.djBIcL = imageView;
        this.AhwBna = view;
        this.valueOf = space;
        this.isConnected = c55113xdn2;
        this.DbNXlk = textView4;
        this.values = imageView2;
        this.fetchVPNInfo = recyclerView;
        this.AkhnZx = c33546myW;
        this.fARcdN = c33603mza;
        this.fJNWhG = constraintLayout;
        this.ejfBZ = textView5;
        this.AuCTel = appCompatTextView;
    }

    public static C16434ejp OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return AEQbTJ(layoutInflater, null, false);
    }

    public static C16434ejp AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.RdAHlO, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C16434ejp EZpvd(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C13754dXa.ActionBar.giSNqX;
        OKAlertBanner oKAlertBanner = (OKAlertBanner) ViewBindings.findChildViewById(view, i);
        if (oKAlertBanner != null) {
            i = C13754dXa.ActionBar.gasjUx;
            C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
            if (c55113xdn != null) {
                i = C13754dXa.ActionBar.DPhTBN;
                C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
                if (c52794wYp != null) {
                    i = C13754dXa.ActionBar.atDTRm;
                    wYK wyk = (wYK) ViewBindings.findChildViewById(view, i);
                    if (wyk != null) {
                        i = C13754dXa.ActionBar.QKDJJA;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = C13754dXa.ActionBar.DGGHxk;
                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = C13754dXa.ActionBar.Dfv;
                                android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView3 != null) {
                                    i = C13754dXa.ActionBar.onLocationChanged;
                                    android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C13754dXa.ActionBar.GVpNrsfQMcgE))) != null) {
                                        i = C13754dXa.ActionBar.RbMRq;
                                        android.widget.Space space = (android.widget.Space) ViewBindings.findChildViewById(view, i);
                                        if (space != null) {
                                            i = C13754dXa.ActionBar.ITrustedWebActivityServiceDefault;
                                            C55113xdn c55113xdn2 = (C55113xdn) ViewBindings.findChildViewById(view, i);
                                            if (c55113xdn2 != null) {
                                                i = C13754dXa.ActionBar.sendCustomAction;
                                                android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView4 != null) {
                                                    i = C13754dXa.ActionBar.onLoadChildren;
                                                    android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                                    if (imageView2 != null) {
                                                        i = C13754dXa.ActionBar.getTag;
                                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                        if (recyclerView != null) {
                                                            i = C13754dXa.ActionBar.next;
                                                            C33546myW c33546myW = (C33546myW) ViewBindings.findChildViewById(view, i);
                                                            if (c33546myW != null) {
                                                                i = C13754dXa.ActionBar.isTransportControlEnabled;
                                                                C33603mza c33603mza = (C33603mza) ViewBindings.findChildViewById(view, i);
                                                                if (c33603mza != null) {
                                                                    i = C13754dXa.ActionBar.getRemoteControlClient;
                                                                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                    if (constraintLayout != null) {
                                                                        i = C13754dXa.ActionBar.PlaybackStateCompatBuilder;
                                                                        android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                        if (textView5 != null) {
                                                                            i = C13754dXa.ActionBar.getSelectedNavigationIndex;
                                                                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (appCompatTextView != null) {
                                                                                return new C16434ejp((android.widget.LinearLayout) view, oKAlertBanner, c55113xdn, c52794wYp, wyk, textView, textView2, textView3, imageView, viewFindChildViewById, space, c55113xdn2, textView4, imageView2, recyclerView, c33546myW, c33603mza, constraintLayout, textView5, appCompatTextView);
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
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
