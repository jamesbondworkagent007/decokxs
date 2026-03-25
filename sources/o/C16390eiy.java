package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eiy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C16390eiy implements ViewBinding {
    public final C33537myN AEQbTJ;
    public final ViewPager2 AhwBna;
    public final LinearLayoutCompat EZpvd;
    public final C10316bmE KWHzl;
    public final C55113xdn OLrzqt;
    public final C55173xeu copydefault;
    public final TabLayout djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.EZpvd;
    }

    public C16390eiy(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C33537myN c33537myN, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C10316bmE c10316bmE, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull TabLayout tabLayout, @androidx.annotation.NonNull ViewPager2 viewPager2) {
        this.EZpvd = linearLayoutCompat;
        this.AEQbTJ = c33537myN;
        this.copydefault = c55173xeu;
        this.KWHzl = c10316bmE;
        this.OLrzqt = c55113xdn;
        this.djBIcL = tabLayout;
        this.AhwBna = viewPager2;
    }

    public static C16390eiy copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return EZpvd(layoutInflater, null, false);
    }

    public static C16390eiy EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.AxsJAYaxsJAY, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C16390eiy EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.DarRvM;
        C33537myN c33537myN = (C33537myN) ViewBindings.findChildViewById(view, i);
        if (c33537myN != null) {
            i = C13754dXa.ActionBar.zzJhsT;
            C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
            if (c55173xeu != null) {
                i = C13754dXa.ActionBar.INotificationSideChannelDefault;
                C10316bmE c10316bmE = (C10316bmE) ViewBindings.findChildViewById(view, i);
                if (c10316bmE != null) {
                    i = C13754dXa.ActionBar.INotificationSideChannelStubProxy;
                    C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                    if (c55113xdn != null) {
                        i = C13754dXa.ActionBar.MediaSessionCompatResultReceiverWrapper;
                        TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, i);
                        if (tabLayout != null) {
                            i = C13754dXa.ActionBar.otherwise;
                            ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                            if (viewPager2 != null) {
                                return new C16390eiy((LinearLayoutCompat) view, c33537myN, c55173xeu, c10316bmE, c55113xdn, tabLayout, viewPager2);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
