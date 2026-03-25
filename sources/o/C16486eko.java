package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eko, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C16486eko implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final AppCompatTextView AYXKKw;
    public final AppCompatTextView AhwBna;
    public final AppCompatTextView AkhnZx;
    public final AppCompatTextView DbNXlk;
    public final RecyclerView EZpvd;
    public final NestedScrollView KWHzl;
    public final AppCompatTextView OLrzqt;
    public final android.view.View copydefault;
    public final android.view.View djBIcL;
    public final AppCompatTextView fetchVPNInfo;
    public final AppCompatTextView gEmmrt;
    public final AppCompatTextView isConnected;
    public final AppCompatTextView valueOf;
    public final ConstraintLayout values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.KWHzl;
    }

    public C16486eko(@androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.view.View view2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4, @androidx.annotation.NonNull AppCompatTextView appCompatTextView5, @androidx.annotation.NonNull AppCompatTextView appCompatTextView6, @androidx.annotation.NonNull AppCompatTextView appCompatTextView7, @androidx.annotation.NonNull AppCompatTextView appCompatTextView8, @androidx.annotation.NonNull AppCompatTextView appCompatTextView9, @androidx.annotation.NonNull ConstraintLayout constraintLayout) {
        this.KWHzl = nestedScrollView;
        this.AEQbTJ = imageView;
        this.OLrzqt = appCompatTextView;
        this.EZpvd = recyclerView;
        this.copydefault = view;
        this.djBIcL = view2;
        this.gEmmrt = appCompatTextView2;
        this.AYXKKw = appCompatTextView3;
        this.AhwBna = appCompatTextView4;
        this.valueOf = appCompatTextView5;
        this.fetchVPNInfo = appCompatTextView6;
        this.DbNXlk = appCompatTextView7;
        this.AkhnZx = appCompatTextView8;
        this.isConnected = appCompatTextView9;
        this.values = constraintLayout;
    }

    public static C16486eko EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.heceqZ, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C16486eko KWHzl(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        android.view.View viewFindChildViewById2;
        int i = C13754dXa.ActionBar.znKlvJ;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C13754dXa.ActionBar.onConnectionSuspended;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView != null) {
                i = C13754dXa.ActionBar.getMaxVolume;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C13754dXa.ActionBar.ActivityViewModelLazyKtviewModels4))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C13754dXa.ActionBar.ActivityViewModelLazyKtviewModels2))) != null) {
                    i = C13754dXa.ActionBar.ActivityResultCaller;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView2 != null) {
                        i = C13754dXa.ActionBar.registerForActivityResultlambda0;
                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView3 != null) {
                            i = C13754dXa.ActionBar.ActivityResultCallerLauncher;
                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                            if (appCompatTextView4 != null) {
                                i = C13754dXa.ActionBar.ActivityResultCallerKtExternalSyntheticLambda0;
                                AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView5 != null) {
                                    i = C13754dXa.ActionBar.registerForActivityResultlambda1;
                                    AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatTextView6 != null) {
                                        i = C13754dXa.ActionBar.ActivityResultCallerKtExternalSyntheticLambda1;
                                        AppCompatTextView appCompatTextView7 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatTextView7 != null) {
                                            i = C13754dXa.ActionBar.getCallerInput;
                                            AppCompatTextView appCompatTextView8 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                            if (appCompatTextView8 != null) {
                                                i = C13754dXa.ActionBar.getCallerContract;
                                                AppCompatTextView appCompatTextView9 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                if (appCompatTextView9 != null) {
                                                    i = C13754dXa.ActionBar.level;
                                                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                    if (constraintLayout != null) {
                                                        return new C16486eko((NestedScrollView) view, imageView, appCompatTextView, recyclerView, viewFindChildViewById, viewFindChildViewById2, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6, appCompatTextView7, appCompatTextView8, appCompatTextView9, constraintLayout);
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
