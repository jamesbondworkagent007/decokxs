package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hxu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C23423hxu implements ViewBinding {
    public final C55251xgS AEQbTJ;
    public final android.widget.ImageView AYXKKw;
    public final android.view.View AhwBna;
    public final android.widget.TextView AkhnZx;
    public final android.widget.ImageView AuCTel;
    public final android.widget.TextView DbNXlk;
    public final android.widget.ImageView EZpvd;
    public final android.widget.ImageView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final C55251xgS copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.LinearLayout ejfBZ;
    public final android.widget.TextView fARcdN;
    public final RecyclerView fIwbmz;
    public final android.widget.TextView fJNWhG;
    public final android.widget.TextView fetchVPNInfo;
    public final android.widget.TextView gEmmrt;
    public final android.widget.TextView isConnected;
    public final C55258xgZ valueOf;
    public final ConstraintLayout values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.values;
    }

    public C23423hxu(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C55251xgS c55251xgS, @androidx.annotation.NonNull C55251xgS c55251xgS2, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.ImageView imageView3, @androidx.annotation.NonNull C55258xgZ c55258xgZ, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull android.widget.TextView textView6, @androidx.annotation.NonNull android.widget.TextView textView7, @androidx.annotation.NonNull android.widget.ImageView imageView4, @androidx.annotation.NonNull android.widget.TextView textView8, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.TextView textView9) {
        this.values = constraintLayout;
        this.OLrzqt = textView;
        this.copydefault = c55251xgS;
        this.AEQbTJ = c55251xgS2;
        this.EZpvd = imageView;
        this.KWHzl = imageView2;
        this.gEmmrt = textView2;
        this.AhwBna = view;
        this.djBIcL = textView3;
        this.AYXKKw = imageView3;
        this.valueOf = c55258xgZ;
        this.AkhnZx = textView4;
        this.fetchVPNInfo = textView5;
        this.DbNXlk = textView6;
        this.isConnected = textView7;
        this.AuCTel = imageView4;
        this.fARcdN = textView8;
        this.fIwbmz = recyclerView;
        this.ejfBZ = linearLayout;
        this.fJNWhG = textView9;
    }

    public static C23423hxu copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.isConnected, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C23423hxu copydefault(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C23274hvD.Application.UeEOUB;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C23274hvD.Application.iZzfmt;
            C55251xgS c55251xgS = (C55251xgS) ViewBindings.findChildViewById(view, i);
            if (c55251xgS != null) {
                i = C23274hvD.Application.hrNTAI;
                C55251xgS c55251xgS2 = (C55251xgS) ViewBindings.findChildViewById(view, i);
                if (c55251xgS2 != null) {
                    i = C23274hvD.Application.GCXiNH;
                    android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = C23274hvD.Application.DRGLNw;
                        android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            i = C23274hvD.Application.FhERFw;
                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.hGuIrQ))) != null) {
                                i = C23274hvD.Application.HJWChPQdUnVm;
                                android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView3 != null) {
                                    i = C23274hvD.Application.fromRating;
                                    android.widget.ImageView imageView3 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView3 != null) {
                                        i = C23274hvD.Application.newStarRating;
                                        C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                                        if (c55258xgZ != null) {
                                            i = C23274hvD.Application.isThumbUp;
                                            android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView4 != null) {
                                                i = C23274hvD.Application.onPlaybackPositionUpdate;
                                                android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView5 != null) {
                                                    i = C23274hvD.Application.buildRccMetadata;
                                                    android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView6 != null) {
                                                        i = C23274hvD.Application.MediaSessionCompatMediaSessionImplApi181;
                                                        android.widget.TextView textView7 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView7 != null) {
                                                            i = C23274hvD.Application.onConfigurationChanged;
                                                            android.widget.ImageView imageView4 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                                            if (imageView4 != null) {
                                                                i = C23274hvD.Application.invalidateMenu;
                                                                android.widget.TextView textView8 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView8 != null) {
                                                                    i = C23274hvD.Application.onCreate;
                                                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                                    if (recyclerView != null) {
                                                                        i = C23274hvD.Application.onMultiWindowModeChanged;
                                                                        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                        if (linearLayout != null) {
                                                                            i = C23274hvD.Application.ActivityResultContractsCreateDocument;
                                                                            android.widget.TextView textView9 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                            if (textView9 != null) {
                                                                                return new C23423hxu((ConstraintLayout) view, textView, c55251xgS, c55251xgS2, imageView, imageView2, textView2, viewFindChildViewById, textView3, imageView3, c55258xgZ, textView4, textView5, textView6, textView7, imageView4, textView8, recyclerView, linearLayout, textView9);
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
