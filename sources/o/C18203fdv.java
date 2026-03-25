package o;

import android.os.Build;
import com.airbnb.lottie.LottieDrawable;
import com.google.android.material.navigation.NavigationBarView;
import com.okinc.business.defi.wallet.home.tab.DiscoverTabPageDefi$enabledEnter$1;
import com.okinc.components.track.TrackChannel;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import o.C13754dXa;
import o.InterfaceC18198fdq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fdv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18203fdv extends AbstractC43215rlA implements InterfaceC18198fdq {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public static final int copydefault = C14319djH.OLrzqt.KWHzl();
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.fdu
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C18203fdv.AEQbTJ();
        }
    });
    public final NavigationBarView.OnItemSelectedListener valueOf = new NavigationBarView.OnItemSelectedListener() { // from class: o.fdB
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener
        public final boolean onNavigationItemSelected(android.view.MenuItem menuItem) {
            return C18203fdv.EZpvd(this.copydefault, menuItem);
        }
    };
    public final NavigationBarView.OnItemSelectedListener djBIcL = new NavigationBarView.OnItemSelectedListener() { // from class: o.fdy
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener
        public final boolean onNavigationItemSelected(android.view.MenuItem menuItem) {
            return C18203fdv.KWHzl(this.KWHzl, menuItem);
        }
    };
    public final java.lang.String gEmmrt = "navigation_discover";
    public final java.lang.String EZpvd = "bottom_discover";
    public final java.lang.String KWHzl = "navigation_discover";
    public final java.lang.String AYXKKw = "navigation_discover";

    @Override // o.InterfaceC18198fdq
    public int AYXKKw() {
        return 5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC18198fdq
    public java.lang.String AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC18198fdq
    public java.lang.String AkhnZx() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC18198fdq
    public java.lang.String KWHzl() {
        return this.EZpvd;
    }

    @Override // o.InterfaceC18198fdq
    public boolean copydefault() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC18198fdq
    public java.lang.String djBIcL() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC18198fdq
    public NavigationBarView.OnItemSelectedListener gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC18198fdq
    public java.lang.String isConnected() {
        return "DiscoverTabPage";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC18198fdq
    public NavigationBarView.OnItemSelectedListener valueOf() {
        return this.djBIcL;
    }

    /* JADX INFO: renamed from: o.fdv$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fdv.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public LottieDrawable EZpvd(@NotNull java.lang.String str, @NotNull NavigationBarView navigationBarView) {
        return InterfaceC18198fdq.ActionBar.OLrzqt(this, str, navigationBarView);
    }

    public void OLrzqt(@NotNull LottieDrawable lottieDrawable, boolean z) {
        InterfaceC18198fdq.ActionBar.copydefault(this, lottieDrawable, z);
    }

    public final java.util.List<InterfaceC9769bbo> OLrzqt() {
        return (java.util.List) this.AEQbTJ.getValue();
    }

    public static final java.util.List AEQbTJ() {
        return C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC9769bbo.class));
    }

    @Override // o.InterfaceC18198fdq
    public android.view.MenuItem EZpvd(@NotNull NavigationBarView navigationBarView) {
        InterfaceC9769bbo interfaceC9769bbo;
        Intrinsics.checkNotNullParameter(navigationBarView, "");
        android.view.Menu menu = navigationBarView.getMenu();
        int i = copydefault;
        java.util.List<InterfaceC9769bbo> listOLrzqt = OLrzqt();
        android.view.MenuItem menuItemAdd = menu.add(0, i, 0, (listOLrzqt == null || (interfaceC9769bbo = (InterfaceC9769bbo) CollectionsKt___CollectionsKt.AuCTelauCTel(listOLrzqt)) == null) ? C13754dXa.FragmentManager.processStrongAuthMessage : interfaceC9769bbo.OLrzqt());
        if (Build.VERSION.SDK_INT >= 26) {
            menuItemAdd.setContentDescription("web3DiscoverHomeTabId");
        }
        Intrinsics.checkNotNullExpressionValue(menuItemAdd, "");
        return menuItemAdd;
    }

    @Override // o.InterfaceC18198fdq
    public void copydefault(@NotNull android.view.MenuItem menuItem, @NotNull NavigationBarView navigationBarView, boolean z) {
        Intrinsics.checkNotNullParameter(menuItem, "");
        Intrinsics.checkNotNullParameter(navigationBarView, "");
        menuItem.setIcon(EZpvd(C33492mxV.OLrzqt() ? "web3_home_discover_dark.lottie" : "web3_home_discover_light.lottie", navigationBarView));
    }

    public static final boolean EZpvd(C18203fdv c18203fdv, android.view.MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "");
        C32866mlf.onEvent$default("app_DApps_click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        android.graphics.drawable.Drawable icon = menuItem.getIcon();
        LottieDrawable lottieDrawable = icon instanceof LottieDrawable ? (LottieDrawable) icon : null;
        if (lottieDrawable == null) {
            return true;
        }
        c18203fdv.OLrzqt(lottieDrawable, false);
        return true;
    }

    public static final boolean KWHzl(C18203fdv c18203fdv, android.view.MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "");
        android.graphics.drawable.Drawable icon = menuItem.getIcon();
        LottieDrawable lottieDrawable = icon instanceof LottieDrawable ? (LottieDrawable) icon : null;
        if (lottieDrawable != null) {
            c18203fdv.OLrzqt(lottieDrawable, true);
        }
        return true;
    }

    @Override // o.InterfaceC18198fdq
    public androidx.fragment.app.Fragment KWHzl(boolean z) {
        InterfaceC9769bbo interfaceC9769bbo;
        androidx.fragment.app.Fragment fragmentAEQbTJ;
        java.util.List<InterfaceC9769bbo> listOLrzqt = OLrzqt();
        return (listOLrzqt == null || (interfaceC9769bbo = (InterfaceC9769bbo) CollectionsKt___CollectionsKt.AuCTelauCTel(listOLrzqt)) == null || (fragmentAEQbTJ = interfaceC9769bbo.AEQbTJ()) == null) ? eUD.Companion.copydefault(z) : fragmentAEQbTJ;
    }

    @Override // o.InterfaceC18198fdq
    public int fetchVPNInfo() {
        return C9768bbn.KWHzl;
    }

    @Override // o.InterfaceC18198fdq
    public boolean AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return ((java.lang.Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new DiscoverTabPageDefi$enabledEnter$1(this, context, null), 1, null)).booleanValue();
    }
}
