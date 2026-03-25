package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.tabs.TabLayout;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eug, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C17008eug implements ViewBinding {
    public final C52794wYp AEQbTJ;
    public final ConstraintLayout AYXKKw;
    public final C55173xeu AhwBna;
    public final android.widget.ImageView AkhnZx;
    public final ConstraintLayout AuCTel;
    public final android.widget.LinearLayout DbNXlk;
    public final C52794wYp EZpvd;
    public final C55113xdn KWHzl;
    public final MaterialCardView OLrzqt;
    public final C33537myN copydefault;
    public final C55113xdn djBIcL;
    public final TabLayout ejfBZ;
    public final ViewPager2 fARcdN;
    public final android.widget.TextView fIwbmz;
    public final android.widget.TextView fJNWhG;
    public final android.view.View fetchVPNInfo;
    public final C55173xeu gEmmrt;
    public final android.widget.TextView getFieldNames;
    public final android.widget.TextView hDKMBd;
    public final android.widget.LinearLayout isConnected;
    public final android.widget.TextView uzCIH;
    public final C55113xdn valueOf;
    public final android.widget.LinearLayout values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AuCTel;
    }

    public C17008eug(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull C33537myN c33537myN, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull C52794wYp c52794wYp2, @androidx.annotation.NonNull MaterialCardView materialCardView, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C55173xeu c55173xeu2, @androidx.annotation.NonNull C55113xdn c55113xdn2, @androidx.annotation.NonNull C55113xdn c55113xdn3, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout3, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull TabLayout tabLayout, @androidx.annotation.NonNull ViewPager2 viewPager2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5) {
        this.AuCTel = constraintLayout;
        this.KWHzl = c55113xdn;
        this.copydefault = c33537myN;
        this.AEQbTJ = c52794wYp;
        this.EZpvd = c52794wYp2;
        this.OLrzqt = materialCardView;
        this.AYXKKw = constraintLayout2;
        this.AhwBna = c55173xeu;
        this.gEmmrt = c55173xeu2;
        this.djBIcL = c55113xdn2;
        this.valueOf = c55113xdn3;
        this.fetchVPNInfo = view;
        this.isConnected = linearLayout;
        this.values = linearLayout2;
        this.DbNXlk = linearLayout3;
        this.AkhnZx = imageView;
        this.ejfBZ = tabLayout;
        this.fARcdN = viewPager2;
        this.fJNWhG = textView;
        this.fIwbmz = textView2;
        this.getFieldNames = textView3;
        this.hDKMBd = textView4;
        this.uzCIH = textView5;
    }

    public static C17008eug AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return OLrzqt(layoutInflater, null, false);
    }

    public static C17008eug OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.DuR, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C17008eug EZpvd(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C13754dXa.ActionBar.ORxRYg;
        C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
        if (c55113xdn != null) {
            i = C13754dXa.ActionBar.accept;
            C33537myN c33537myN = (C33537myN) ViewBindings.findChildViewById(view, i);
            if (c33537myN != null) {
                i = C13754dXa.ActionBar.vLaW;
                C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
                if (c52794wYp != null) {
                    i = C13754dXa.ActionBar.frkDMe;
                    C52794wYp c52794wYp2 = (C52794wYp) ViewBindings.findChildViewById(view, i);
                    if (c52794wYp2 != null) {
                        i = C13754dXa.ActionBar.DcMfJK;
                        MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, i);
                        if (materialCardView != null) {
                            i = C13754dXa.ActionBar.registerUser;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                            if (constraintLayout != null) {
                                i = C13754dXa.ActionBar.zFtALg;
                                C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                                if (c55173xeu != null) {
                                    i = C13754dXa.ActionBar.HJWChPRGtXKCDKRTZD;
                                    C55173xeu c55173xeu2 = (C55173xeu) ViewBindings.findChildViewById(view, i);
                                    if (c55173xeu2 != null) {
                                        i = C13754dXa.ActionBar.HJWChPURsaBn;
                                        C55113xdn c55113xdn2 = (C55113xdn) ViewBindings.findChildViewById(view, i);
                                        if (c55113xdn2 != null) {
                                            i = C13754dXa.ActionBar.onServiceConnected;
                                            C55113xdn c55113xdn3 = (C55113xdn) ViewBindings.findChildViewById(view, i);
                                            if (c55113xdn3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C13754dXa.ActionBar.hkDICb))) != null) {
                                                i = C13754dXa.ActionBar.hijVBL;
                                                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                                if (linearLayout != null) {
                                                    i = C13754dXa.ActionBar.extraCommand;
                                                    android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                                    if (linearLayout2 != null) {
                                                        i = C13754dXa.ActionBar.cancelNotification;
                                                        android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                                        if (linearLayout3 != null) {
                                                            i = C13754dXa.ActionBar.writeTypedObject;
                                                            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                                            if (imageView != null) {
                                                                i = C13754dXa.ActionBar.addQueueItem;
                                                                TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, i);
                                                                if (tabLayout != null) {
                                                                    i = C13754dXa.ActionBar.IMediaControllerCallbackStubProxy;
                                                                    ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                                                                    if (viewPager2 != null) {
                                                                        i = C13754dXa.ActionBar.ActivityResultRegistryKtrememberLauncherForActivityResult1invokeinlinedonDispose1;
                                                                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                        if (textView != null) {
                                                                            i = C13754dXa.ActionBar.getVisualMimeTypeactivity_release;
                                                                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                            if (textView2 != null) {
                                                                                i = C13754dXa.ActionBar.ActivityResultContractsStartIntentSenderForResultCompanion;
                                                                                android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                if (textView3 != null) {
                                                                                    i = C13754dXa.ActionBar.CheckResult;
                                                                                    android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (textView4 != null) {
                                                                                        i = C13754dXa.ActionBar.ColorRes;
                                                                                        android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (textView5 != null) {
                                                                                            return new C17008eug((ConstraintLayout) view, c55113xdn, c33537myN, c52794wYp, c52794wYp2, materialCardView, constraintLayout, c55173xeu, c55173xeu2, c55113xdn2, c55113xdn3, viewFindChildViewById, linearLayout, linearLayout2, linearLayout3, imageView, tabLayout, viewPager2, textView, textView2, textView3, textView4, textView5);
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
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
