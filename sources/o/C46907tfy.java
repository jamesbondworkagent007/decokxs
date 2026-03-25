package o;

import android.os.Build;
import androidx.collection.ArraySetKt;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieListener;
import com.google.android.material.navigation.NavigationBarView;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.p2p.api.OtcRouteConst;
import com.okinc.rxutils.RxBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC33220msO;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tfy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46907tfy extends AbstractC43215rlA implements InterfaceC33220msO {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public boolean AEQbTJ;
    public final InterfaceC47278tmy AYXKKw;
    public final NavigationBarView.OnItemSelectedListener AhwBna;
    public final java.util.Set<java.lang.String> EZpvd;
    public LottieDrawable KWHzl;
    public final NavigationBarView.OnItemReselectedListener OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC33220msO
    public java.util.Set<java.lang.String> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC33220msO
    public java.lang.String AhwBna() {
        return "SwitchMarketFragment";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC33220msO
    public NavigationBarView.OnItemSelectedListener EZpvd() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC33220msO
    public NavigationBarView.OnItemReselectedListener OLrzqt() {
        return this.OLrzqt;
    }

    @Override // o.InterfaceC33220msO
    public int djBIcL() {
        return 1;
    }

    public C46907tfy(@NotNull InterfaceC47278tmy interfaceC47278tmy) {
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        this.AYXKKw = interfaceC47278tmy;
        this.AhwBna = new NavigationBarView.OnItemSelectedListener() { // from class: o.tfF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener
            public final boolean onNavigationItemSelected(android.view.MenuItem menuItem) {
                return C46907tfy.copydefault(this.AEQbTJ, menuItem);
            }
        };
        this.OLrzqt = new NavigationBarView.OnItemReselectedListener() { // from class: o.tfC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.navigation.NavigationBarView.OnItemReselectedListener
            public final void onNavigationItemReselected(android.view.MenuItem menuItem) {
                C46907tfy.AEQbTJ(this.AEQbTJ, menuItem);
            }
        };
        this.EZpvd = ArraySetKt.arraySetOf("main/market");
    }

    @Override // o.InterfaceC33220msO
    public InterfaceC55083xdJ EZpvd(@NotNull android.content.Context context) {
        return InterfaceC33220msO.StateListAnimator.AEQbTJ(this, context);
    }

    @Override // o.InterfaceC33220msO
    public void copydefault(@NotNull android.content.Intent intent) {
        InterfaceC33220msO.StateListAnimator.EZpvd(this, intent);
    }

    /* JADX INFO: renamed from: o.tfy$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tfy.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @Override // o.InterfaceC33220msO
    public boolean KWHzl() {
        return !C27563jxZ.OLrzqt.fetchVPNInfo() && AYXKKw();
    }

    public final void EZpvd(boolean z) {
        this.AEQbTJ = z;
        OLrzqt(z);
    }

    public final boolean AYXKKw() {
        return !this.AYXKKw.fJNWhG() || ((InterfaceC43033rhe) C43251rlk.copydefault(InterfaceC43033rhe.class)).valueOf();
    }

    public final void OLrzqt(boolean z) {
        LottieDrawable lottieDrawable = this.KWHzl;
        if (lottieDrawable != null) {
            lottieDrawable.cancelAnimation();
        }
        LottieDrawable lottieDrawable2 = this.KWHzl;
        if (lottieDrawable2 != null) {
            lottieDrawable2.setProgress(z ? 0.0f : 1.0f);
        }
        LottieDrawable lottieDrawable3 = this.KWHzl;
        if (lottieDrawable3 != null) {
            lottieDrawable3.setSpeed(z ? 1.0f : -1.0f);
        }
        LottieDrawable lottieDrawable4 = this.KWHzl;
        if (lottieDrawable4 != null) {
            lottieDrawable4.playAnimation();
        }
    }

    @Override // o.InterfaceC33220msO
    public android.view.MenuItem copydefault(@NotNull final NavigationBarView navigationBarView) {
        Intrinsics.checkNotNullParameter(navigationBarView, "");
        final android.view.MenuItem menuItemAdd = navigationBarView.getMenu().add(0, qZH.StateListAnimator.dSJNDS, 0, qZH.PendingIntent.iRxXKY);
        navigationBarView.post(new java.lang.Runnable() { // from class: o.tfB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C46907tfy.copydefault(this.EZpvd, navigationBarView, menuItemAdd);
            }
        });
        Intrinsics.checkNotNullExpressionValue(menuItemAdd, "");
        return menuItemAdd;
    }

    public static final void copydefault(final C46907tfy c46907tfy, final NavigationBarView navigationBarView, final android.view.MenuItem menuItem) {
        c46907tfy.KWHzl = new LottieDrawable();
        LottieCompositionFactory.fromRawRes(navigationBarView.getContext(), qZH.LoaderManager.AEQbTJ).addListener(new LottieListener() { // from class: o.tfD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.airbnb.lottie.LottieListener
            public final void onResult(java.lang.Object obj) {
                C46907tfy.EZpvd(this.AEQbTJ, menuItem, navigationBarView, (LottieComposition) obj);
            }
        });
        if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription("proHomeMarketTabId");
        }
    }

    public static final void EZpvd(C46907tfy c46907tfy, android.view.MenuItem menuItem, NavigationBarView navigationBarView, LottieComposition lottieComposition) {
        LottieDrawable lottieDrawable = c46907tfy.KWHzl;
        if (lottieDrawable != null) {
            lottieDrawable.setComposition(lottieComposition);
        }
        menuItem.setIcon(c46907tfy.KWHzl);
        LottieDrawable lottieDrawable2 = c46907tfy.KWHzl;
        if (lottieDrawable2 != null) {
            lottieDrawable2.setProgress(navigationBarView.getSelectedItemId() == qZH.StateListAnimator.dSJNDS ? 1.0f : 0.0f);
        }
    }

    public static final boolean copydefault(final C46907tfy c46907tfy, android.view.MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "");
        c46907tfy.EZpvd(true);
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.AEQbTJ("BottomTab_Footer_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.tfE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C46907tfy.copydefault(this.OLrzqt, (EventParamsList) obj);
            }
        });
        return true;
    }

    public static final Unit copydefault(C46907tfy c46907tfy, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("page_id", "page_markets", true);
        if (c46907tfy.AYXKKw.fJNWhG()) {
            eventParamsList.put("environment", "demo_trade", false);
        }
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(C46907tfy c46907tfy, android.view.MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "");
        c46907tfy.EZpvd(true);
        RxBus.KWHzl("event.main_market_tab_reselect");
    }

    @Override // o.InterfaceC33220msO
    public void OLrzqt(@NotNull NavigationBarView navigationBarView, @NotNull android.view.MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(navigationBarView, "");
        Intrinsics.checkNotNullParameter(menuItem, "");
        InterfaceC33220msO.StateListAnimator.copydefault(this, navigationBarView, menuItem);
        EZpvd(false);
    }

    @Override // o.InterfaceC33220msO
    public androidx.fragment.app.Fragment copydefault() {
        return ((InterfaceC43033rhe) C43251rlk.copydefault(InterfaceC43033rhe.class)).EZpvd();
    }

    @Override // o.InterfaceC33220msO
    public boolean AEQbTJ(@NotNull java.lang.String str, @NotNull NavigationBarView navigationBarView, @NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(navigationBarView, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (!AYXKKw()) {
            return false;
        }
        if (C27563jxZ.OLrzqt.fetchVPNInfo()) {
            int selectedItemId = navigationBarView.getSelectedItemId();
            int i = qZH.StateListAnimator.Qsauvs;
            if (selectedItemId != i) {
                navigationBarView.setSelectedItemId(i);
            }
        } else {
            navigationBarView.setSelectedItemId(qZH.StateListAnimator.dSJNDS);
        }
        java.lang.String string = bundle.getString(OtcRouteConst.MAIN_ROUTE_NAV);
        if (string != null && string.length() != 0) {
            RxBus.KWHzl(new C6814aWV(string, bundle));
        }
        return true;
    }
}
