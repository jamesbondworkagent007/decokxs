package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eoc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16686eoc implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final AppCompatTextView AYXKKw;
    public final RecyclerView AhwBna;
    public final android.widget.TextView AkhnZx;
    public final FragmentContainerView DbNXlk;
    public final C55113xdn EZpvd;
    public final ViewPager2 KWHzl;
    public final C55254xgV OLrzqt;
    public final AppBarLayout copydefault;
    public final ConstraintLayout djBIcL;
    public final CoordinatorLayout gEmmrt;
    public final AppCompatTextView isConnected;
    public final CoordinatorLayout valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.valueOf;
    }

    public C16686eoc(@androidx.annotation.NonNull CoordinatorLayout coordinatorLayout, @androidx.annotation.NonNull AppBarLayout appBarLayout, @androidx.annotation.NonNull C55254xgV c55254xgV, @androidx.annotation.NonNull ViewPager2 viewPager2, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull CoordinatorLayout coordinatorLayout2, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView) {
        this.valueOf = coordinatorLayout;
        this.copydefault = appBarLayout;
        this.OLrzqt = c55254xgV;
        this.KWHzl = viewPager2;
        this.EZpvd = c55113xdn;
        this.AEQbTJ = constraintLayout;
        this.gEmmrt = coordinatorLayout2;
        this.djBIcL = constraintLayout2;
        this.AhwBna = recyclerView;
        this.AYXKKw = appCompatTextView;
        this.isConnected = appCompatTextView2;
        this.AkhnZx = textView;
        this.DbNXlk = fragmentContainerView;
    }

    public static C16686eoc EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.AxsJAYsNCnLh;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i);
        if (appBarLayout != null) {
            i = C13754dXa.ActionBar.DzOuPm;
            C55254xgV c55254xgV = (C55254xgV) ViewBindings.findChildViewById(view, i);
            if (c55254xgV != null) {
                i = C13754dXa.ActionBar.adwzgZ;
                ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                if (viewPager2 != null) {
                    i = C13754dXa.ActionBar.INotificationSideChannelStubProxy;
                    C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                    if (c55113xdn != null) {
                        i = C13754dXa.ActionBar.getBundle;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout != null) {
                            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
                            i = C13754dXa.ActionBar.MediaDescriptionCompatApi21Builder;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                            if (constraintLayout2 != null) {
                                i = C13754dXa.ActionBar.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                if (recyclerView != null) {
                                    i = C13754dXa.ActionBar.ActivityResultContractsGetMultipleContents;
                                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatTextView != null) {
                                        i = C13754dXa.ActionBar.ActivityResultContractsOpenMultipleDocuments;
                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatTextView2 != null) {
                                            i = C13754dXa.ActionBar.ComponentActivity1;
                                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView != null) {
                                                i = C13754dXa.ActionBar.getHideOffset;
                                                FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
                                                if (fragmentContainerView != null) {
                                                    return new C16686eoc(coordinatorLayout, appBarLayout, c55254xgV, viewPager2, c55113xdn, constraintLayout, coordinatorLayout, constraintLayout2, recyclerView, appCompatTextView, appCompatTextView2, textView, fragmentContainerView);
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
