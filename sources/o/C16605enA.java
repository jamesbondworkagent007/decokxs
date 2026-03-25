package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import o.C13754dXa;

/* JADX INFO: renamed from: o.enA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16605enA implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final android.widget.ImageView AYXKKw;
    public final C55113xdn AhwBna;
    public final android.widget.TextView AkhnZx;
    public final C14784drw AuCTel;
    public final LinearLayoutCompat DbNXlk;
    public final Barrier EZpvd;
    public final C52794wYp KWHzl;
    public final Barrier OLrzqt;
    public final C52794wYp copydefault;
    public final C52794wYp djBIcL;
    public final AppCompatTextView ejfBZ;
    public final android.widget.ImageView fARcdN;
    public final ConstraintLayout fIwbmz;
    public final C55251xgS fJNWhG;
    public final ViewPager2 fetchVPNInfo;
    public final TabLayout gEmmrt;
    public final Group hDKMBd;
    public final android.view.View isConnected;
    public final android.view.View uzCIH;
    public final android.widget.ImageView valueOf;
    public final AppCompatTextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.DbNXlk;
    }

    public C16605enA(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull Barrier barrier, @androidx.annotation.NonNull Barrier barrier2, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C52794wYp c52794wYp2, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull C52794wYp c52794wYp3, @androidx.annotation.NonNull TabLayout tabLayout, @androidx.annotation.NonNull ViewPager2 viewPager2, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull C14784drw c14784drw, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull android.widget.ImageView imageView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull C55251xgS c55251xgS, @androidx.annotation.NonNull Group group, @androidx.annotation.NonNull android.view.View view2) {
        this.DbNXlk = linearLayoutCompat;
        this.EZpvd = barrier;
        this.OLrzqt = barrier2;
        this.KWHzl = c52794wYp;
        this.AEQbTJ = constraintLayout;
        this.copydefault = c52794wYp2;
        this.valueOf = imageView;
        this.AhwBna = c55113xdn;
        this.AYXKKw = imageView2;
        this.djBIcL = c52794wYp3;
        this.gEmmrt = tabLayout;
        this.fetchVPNInfo = viewPager2;
        this.isConnected = view;
        this.AkhnZx = textView;
        this.values = appCompatTextView;
        this.AuCTel = c14784drw;
        this.fIwbmz = constraintLayout2;
        this.fARcdN = imageView3;
        this.ejfBZ = appCompatTextView2;
        this.fJNWhG = c55251xgS;
        this.hDKMBd = group;
        this.uzCIH = view2;
    }

    public static C16605enA EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.UccSpe, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C16605enA EZpvd(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        android.view.View viewFindChildViewById2;
        int i = C13754dXa.ActionBar.USBtdM;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
        if (barrier != null) {
            i = C13754dXa.ActionBar.UlJrfe;
            Barrier barrier2 = (Barrier) ViewBindings.findChildViewById(view, i);
            if (barrier2 != null) {
                i = C13754dXa.ActionBar.fLIjIY;
                C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
                if (c52794wYp != null) {
                    i = C13754dXa.ActionBar.sIqKDg;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        i = C13754dXa.ActionBar.fruYXx;
                        C52794wYp c52794wYp2 = (C52794wYp) ViewBindings.findChildViewById(view, i);
                        if (c52794wYp2 != null) {
                            i = C13754dXa.ActionBar.QBiWsm;
                            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView != null) {
                                i = C13754dXa.ActionBar.INotificationSideChannelStub;
                                C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                                if (c55113xdn != null) {
                                    i = C13754dXa.ActionBar.MediaBrowserCompatMediaBrowserImplApi212;
                                    android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView2 != null) {
                                        i = C13754dXa.ActionBar.newArray;
                                        C52794wYp c52794wYp3 = (C52794wYp) ViewBindings.findChildViewById(view, i);
                                        if (c52794wYp3 != null) {
                                            i = C13754dXa.ActionBar.addQueueItem;
                                            TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, i);
                                            if (tabLayout != null) {
                                                i = C13754dXa.ActionBar.IMediaControllerCallbackStubProxy;
                                                ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                                                if (viewPager2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C13754dXa.ActionBar.MediaSessionCompatMediaSessionImpl))) != null) {
                                                    i = C13754dXa.ActionBar.PlaybackStateCompatBuilder;
                                                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView != null) {
                                                        i = C13754dXa.ActionBar.fromCustomAction;
                                                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                        if (appCompatTextView != null) {
                                                            i = C13754dXa.ActionBar.getAction;
                                                            C14784drw c14784drw = (C14784drw) ViewBindings.findChildViewById(view, i);
                                                            if (c14784drw != null) {
                                                                i = C13754dXa.ActionBar.PlaybackStateCompatCustomAction;
                                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                if (constraintLayout2 != null) {
                                                                    i = C13754dXa.ActionBar.getName;
                                                                    android.widget.ImageView imageView3 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                                                    if (imageView3 != null) {
                                                                        i = C13754dXa.ActionBar.PlaybackStateCompatCustomActionBuilder;
                                                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (appCompatTextView2 != null) {
                                                                            i = C13754dXa.ActionBar.ActivityViewModelLazyKtviewModelsfactoryPromise1;
                                                                            C55251xgS c55251xgS = (C55251xgS) ViewBindings.findChildViewById(view, i);
                                                                            if (c55251xgS != null) {
                                                                                i = C13754dXa.ActionBar.allOf;
                                                                                Group group = (Group) ViewBindings.findChildViewById(view, i);
                                                                                if (group != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C13754dXa.ActionBar.Size))) != null) {
                                                                                    return new C16605enA((LinearLayoutCompat) view, barrier, barrier2, c52794wYp, constraintLayout, c52794wYp2, imageView, c55113xdn, imageView2, c52794wYp3, tabLayout, viewPager2, viewFindChildViewById, textView, appCompatTextView, c14784drw, constraintLayout2, imageView3, appCompatTextView2, c55251xgS, group, viewFindChildViewById2);
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
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
