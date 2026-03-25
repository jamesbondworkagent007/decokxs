package o;

import android.os.Build;
import androidx.collection.ArraySetKt;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieListener;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.navigation.NavigationBarView;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.okuser.data.User;
import com.okinc.p2p.api.OtcRouteConst;
import com.okinc.planet.biz_onboarding.data.OrbitBeanResp;
import com.okinc.planet.service.PlanetTabPageService$getOrCreateMenuItem$1$3;
import com.okinc.rxutils.RxBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.ActivityC45902tAm;
import o.C46388tSm;
import o.C47501trL;
import o.C52761wXj;
import o.InterfaceC33220msO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tTJ extends AbstractC43215rlA implements InterfaceC33220msO {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public NavigationBarView AEQbTJ;
    public final NavigationBarView.OnItemSelectedListener AYXKKw;
    public final InterfaceC47278tmy AhwBna;
    public final java.util.Set<java.lang.String> EZpvd;
    public boolean KWHzl;
    public LottieDrawable copydefault;
    public final NavigationBarView.OnItemReselectedListener gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC33220msO
    public java.util.Set<java.lang.String> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC33220msO
    public java.lang.String AhwBna() {
        return "SwitchPlanetFragment";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC33220msO
    public NavigationBarView.OnItemSelectedListener EZpvd() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC33220msO
    public NavigationBarView.OnItemReselectedListener OLrzqt() {
        return this.gEmmrt;
    }

    @Override // o.InterfaceC33220msO
    public int djBIcL() {
        return 5;
    }

    public tTJ(@NotNull InterfaceC47278tmy interfaceC47278tmy) {
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        this.AhwBna = interfaceC47278tmy;
        this.AYXKKw = new NavigationBarView.OnItemSelectedListener() { // from class: o.tTK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener
            public final boolean onNavigationItemSelected(android.view.MenuItem menuItem) {
                return tTJ.OLrzqt(this.KWHzl, menuItem);
            }
        };
        this.gEmmrt = new NavigationBarView.OnItemReselectedListener() { // from class: o.tTG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.navigation.NavigationBarView.OnItemReselectedListener
            public final void onNavigationItemReselected(android.view.MenuItem menuItem) {
                tTJ.KWHzl(this.copydefault, menuItem);
            }
        };
        this.EZpvd = ArraySetKt.arraySetOf("main/planet");
    }

    @Override // o.InterfaceC33220msO
    public InterfaceC55083xdJ EZpvd(@NotNull android.content.Context context) {
        return InterfaceC33220msO.StateListAnimator.AEQbTJ(this, context);
    }

    @Override // o.InterfaceC33220msO
    public void copydefault(@NotNull android.content.Intent intent) {
        InterfaceC33220msO.StateListAnimator.EZpvd(this, intent);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tTJ.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // o.InterfaceC33220msO
    public boolean KWHzl() {
        return ((tWL) C43251rlk.copydefault(tWL.class)).AhwBna();
    }

    public final void EZpvd(boolean z) {
        this.KWHzl = z;
        OLrzqt(z);
    }

    public final void OLrzqt(boolean z) {
        if (z) {
            LottieDrawable lottieDrawable = this.copydefault;
            if (lottieDrawable != null) {
                lottieDrawable.stop();
                lottieDrawable.setProgress(0.0f);
                lottieDrawable.setSpeed(1.0f);
                lottieDrawable.playAnimation();
                return;
            }
            return;
        }
        LottieDrawable lottieDrawable2 = this.copydefault;
        if (lottieDrawable2 != null) {
            lottieDrawable2.stop();
        }
        LottieDrawable lottieDrawable3 = this.copydefault;
        if (lottieDrawable3 != null) {
            lottieDrawable3.setProgress(0.0f);
        }
    }

    @Override // o.InterfaceC33220msO
    public android.view.MenuItem copydefault(@NotNull final NavigationBarView navigationBarView) {
        LifecycleCoroutineScope lifecycleScope;
        Intrinsics.checkNotNullParameter(navigationBarView, "");
        this.AEQbTJ = navigationBarView;
        android.view.MenuItem menuItemAdd = navigationBarView.getMenu().add(0, C47501trL.TaskDescription.getSessionID, 0, C47501trL.Fragment.accept);
        final LottieDrawable lottieDrawable = new LottieDrawable();
        LottieCompositionFactory.fromRawRes(navigationBarView.getContext(), C47501trL.PendingIntent.OLrzqt).addListener(new LottieListener() { // from class: o.tTH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.airbnb.lottie.LottieListener
            public final void onResult(java.lang.Object obj) {
                tTJ.KWHzl(lottieDrawable, navigationBarView, this, (LottieComposition) obj);
            }
        });
        this.copydefault = lottieDrawable;
        menuItemAdd.setIcon(lottieDrawable);
        if (Build.VERSION.SDK_INT >= 26) {
            menuItemAdd.setContentDescription("proHomePlanetTabId");
        }
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(navigationBarView);
        if (lifecycleOwner != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
            BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, new PlanetTabPageService$getOrCreateMenuItem$1$3(navigationBarView, this, menuItemAdd, null), 3, null);
        }
        Intrinsics.checkNotNullExpressionValue(menuItemAdd, "");
        return menuItemAdd;
    }

    public static final void KWHzl(LottieDrawable lottieDrawable, NavigationBarView navigationBarView, tTJ ttj, LottieComposition lottieComposition) {
        lottieDrawable.setComposition(lottieComposition);
        if (navigationBarView.getSelectedItemId() == C47501trL.TaskDescription.getSessionID) {
            ttj.EZpvd(true);
        } else {
            lottieDrawable.setProgress(0.0f);
        }
    }

    public final void copydefault(NavigationBarView navigationBarView, int i) {
        BadgeDrawable orCreateBadge = navigationBarView.getOrCreateBadge(i);
        orCreateBadge.setBackgroundColor(ContextCompat.getColor(navigationBarView.getContext(), C52761wXj.Activity.DQzvGN));
        orCreateBadge.setHorizontalOffset(C55298xhM.dpInt$default(2.0f, (android.content.Context) null, 1, (java.lang.Object) null));
        orCreateBadge.setVerticalOffset(C55298xhM.dpInt$default(2.0f, (android.content.Context) null, 1, (java.lang.Object) null));
        orCreateBadge.setVisible(true);
    }

    public static final boolean OLrzqt(tTJ ttj, android.view.MenuItem menuItem) {
        java.lang.Integer hasVisitedOrbitGuide;
        Intrinsics.checkNotNullParameter(menuItem, "");
        C46386tSk c46386tSk = C46386tSk.copydefault;
        if (C46386tSk.shouldShowOrbitIntroduction$default(c46386tSk, null, 1, null)) {
            ActivityC45902tAm.TaskDescription taskDescription = ActivityC45902tAm.Companion;
            NavigationBarView navigationBarView = ttj.AEQbTJ;
            taskDescription.EZpvd(navigationBarView != null ? navigationBarView.getContext() : null);
        } else if (ttj.AhwBna.values() && !C46386tSk.shouldShowOrbitIntroduction$default(c46386tSk, null, 1, null)) {
            User userOLrzqt = ttj.AhwBna.OLrzqt();
            if (c46386tSk.wlaJM(userOLrzqt != null ? userOLrzqt.getUid() : null)) {
                C46388tSm.TaskDescription taskDescription2 = C46388tSm.Companion;
                OrbitBeanResp orbitBeanRespEZpvd = taskDescription2.KWHzl().EZpvd();
                if (orbitBeanRespEZpvd != null && (hasVisitedOrbitGuide = orbitBeanRespEZpvd.getHasVisitedOrbitGuide()) != null && hasVisitedOrbitGuide.intValue() == 0 && !taskDescription2.KWHzl().AYXKKw()) {
                    android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
                    if (activityAEQbTJ instanceof FragmentActivity) {
                        User userOLrzqt2 = ttj.AhwBna.OLrzqt();
                        c46386tSk.getNewProxyInstance(userOLrzqt2 != null ? userOLrzqt2.getUid() : null);
                        C45899tAj.copydefault.copydefault((FragmentActivity) activityAEQbTJ);
                    }
                } else {
                    User userOLrzqt3 = ttj.AhwBna.OLrzqt();
                    c46386tSk.getNewProxyInstance(userOLrzqt3 != null ? userOLrzqt3.getUid() : null);
                }
            }
        }
        RxBus.KWHzl(new C47889tyd(null, 1, null));
        ttj.EZpvd(true);
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.AEQbTJ("HomePage_Tab_Planet_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.tTI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tTJ.AEQbTJ((EventParamsList) obj);
            }
        });
        android.graphics.drawable.Drawable icon = menuItem.getIcon();
        LottieDrawable lottieDrawable = icon instanceof LottieDrawable ? (LottieDrawable) icon : null;
        if (lottieDrawable != null) {
            lottieDrawable.playAnimation();
        }
        return true;
    }

    public static final Unit AEQbTJ(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("page_id", "page_planet", true);
        return Unit.INSTANCE;
    }

    public static final void KWHzl(tTJ ttj, android.view.MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "");
        ttj.EZpvd(true);
        RxBus.KWHzl("event.main_planet_tab_reselect");
        C32866mlf.onEvent$default("HomePage_Tab_Planet_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
    }

    @Override // o.InterfaceC33220msO
    public androidx.fragment.app.Fragment copydefault() {
        return new C47893tyh();
    }

    @Override // o.InterfaceC33220msO
    public boolean AEQbTJ(@NotNull java.lang.String str, @NotNull NavigationBarView navigationBarView, @NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(navigationBarView, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (!KWHzl()) {
            return false;
        }
        navigationBarView.setSelectedItemId(C47501trL.TaskDescription.getSessionID);
        java.lang.String string = bundle.getString(OtcRouteConst.MAIN_ROUTE_NAV);
        if (string != null && string.length() != 0) {
            RxBus.KWHzl(new C6814aWV(string, bundle));
        }
        return true;
    }

    @Override // o.InterfaceC33220msO
    public void OLrzqt(@NotNull NavigationBarView navigationBarView, @NotNull android.view.MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(navigationBarView, "");
        Intrinsics.checkNotNullParameter(menuItem, "");
        InterfaceC33220msO.StateListAnimator.copydefault(this, navigationBarView, menuItem);
        EZpvd(false);
    }
}
