package o;

import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import o.C25493ixk;

/* JADX INFO: loaded from: classes18.dex */
public final class iHG implements ViewBinding {
    public final Flow AEQbTJ;
    public final Group AYXKKw;
    public final NestedScrollView AhwBna;
    public final C55244xgL AkhnZx;
    public final ConstraintLayout EZpvd;
    public final C27282jsJ KWHzl;
    public final C55173xeu OLrzqt;
    public final C55113xdn copydefault;
    public final ConstraintLayout djBIcL;
    public final ViewPager2 fetchVPNInfo;
    public final C27385juG gEmmrt;
    public final android.widget.TextView isConnected;
    public final RecyclerView valueOf;
    public final android.widget.TextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.djBIcL;
    }

    public iHG(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull Flow flow, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull C27282jsJ c27282jsJ, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C27385juG c27385juG, @androidx.annotation.NonNull Group group, @androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull C55244xgL c55244xgL, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull ViewPager2 viewPager2) {
        this.djBIcL = constraintLayout;
        this.OLrzqt = c55173xeu;
        this.AEQbTJ = flow;
        this.EZpvd = constraintLayout2;
        this.KWHzl = c27282jsJ;
        this.copydefault = c55113xdn;
        this.valueOf = recyclerView;
        this.gEmmrt = c27385juG;
        this.AYXKKw = group;
        this.AhwBna = nestedScrollView;
        this.AkhnZx = c55244xgL;
        this.values = textView;
        this.isConnected = textView2;
        this.fetchVPNInfo = viewPager2;
    }

    public static iHG KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.hrjNmC;
        C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
        if (c55173xeu != null) {
            i = C25493ixk.ActionBar.iqMDAV;
            Flow flow = (Flow) ViewBindings.findChildViewById(view, i);
            if (flow != null) {
                i = C25493ixk.ActionBar.siEkQe;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout != null) {
                    i = C25493ixk.ActionBar.svY;
                    C27282jsJ c27282jsJ = (C27282jsJ) ViewBindings.findChildViewById(view, i);
                    if (c27282jsJ != null) {
                        i = C25493ixk.ActionBar.HJWChPRAkuRW;
                        C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                        if (c55113xdn != null) {
                            i = C25493ixk.ActionBar.hQufeQ;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                            if (recyclerView != null) {
                                i = C25493ixk.ActionBar.UkCIYP;
                                C27385juG c27385juG = (C27385juG) ViewBindings.findChildViewById(view, i);
                                if (c27385juG != null) {
                                    i = C25493ixk.ActionBar.QYvkLl;
                                    Group group = (Group) ViewBindings.findChildViewById(view, i);
                                    if (group != null) {
                                        i = C25493ixk.ActionBar.QVMIlxQVMIlx;
                                        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                                        if (nestedScrollView != null) {
                                            i = C25493ixk.ActionBar.ikEgkI;
                                            C55244xgL c55244xgL = (C55244xgL) ViewBindings.findChildViewById(view, i);
                                            if (c55244xgL != null) {
                                                i = C25493ixk.ActionBar.ICustomTabsCallbackStub;
                                                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView != null) {
                                                    i = C25493ixk.ActionBar.read;
                                                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView2 != null) {
                                                        i = C25493ixk.ActionBar.IMediaControllerCallbackStub;
                                                        ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                                                        if (viewPager2 != null) {
                                                            return new iHG((ConstraintLayout) view, c55173xeu, flow, constraintLayout, c27282jsJ, c55113xdn, recyclerView, c27385juG, group, nestedScrollView, c55244xgL, textView, textView2, viewPager2);
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
