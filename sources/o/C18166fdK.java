package o;

import com.airbnb.lottie.LottieDrawable;
import com.google.android.material.navigation.NavigationBarView;
import com.okinc.business.defi.wallet.home.DefiHomeContainerFragment;
import com.okinc.business.defi.wallet.home.tab.TrackerTabPageDefi$enabled$1;
import com.okinc.business.defi.wallet.home.tab.TrackerTabPageDefi$enabledEnter$1;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import o.C13754dXa;
import o.InterfaceC18204fdw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fdK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18166fdK extends AbstractC43215rlA implements InterfaceC18204fdw {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public static final int OLrzqt = C14319djH.OLrzqt.gEmmrt();
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.fdM
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C18166fdK.EZpvd();
        }
    });
    public final NavigationBarView.OnItemSelectedListener KWHzl = new NavigationBarView.OnItemSelectedListener() { // from class: o.fdN
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener
        public final boolean onNavigationItemSelected(android.view.MenuItem menuItem) {
            return C18166fdK.OLrzqt(this.AEQbTJ, menuItem);
        }
    };
    public final NavigationBarView.OnItemSelectedListener AEQbTJ = new NavigationBarView.OnItemSelectedListener() { // from class: o.fdP
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener
        public final boolean onNavigationItemSelected(android.view.MenuItem menuItem) {
            return C18166fdK.AEQbTJ(this.EZpvd, menuItem);
        }
    };

    @Override // o.InterfaceC18198fdq
    public int AYXKKw() {
        return 3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC18198fdq
    public int fetchVPNInfo() {
        return OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC18198fdq
    public NavigationBarView.OnItemSelectedListener gEmmrt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC18198fdq
    public java.lang.String isConnected() {
        return "web3TrackerTabId";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC18198fdq
    public NavigationBarView.OnItemSelectedListener valueOf() {
        return this.AEQbTJ;
    }

    @Override // o.InterfaceC18198fdq
    public java.lang.String AhwBna() {
        return InterfaceC18204fdw.Activity.KWHzl(this);
    }

    @Override // o.InterfaceC18198fdq
    public java.lang.String AkhnZx() {
        return InterfaceC18204fdw.Activity.AEQbTJ(this);
    }

    public void EZpvd(@NotNull LottieDrawable lottieDrawable, boolean z) {
        InterfaceC18204fdw.Activity.EZpvd(this, lottieDrawable, z);
    }

    @Override // o.InterfaceC18198fdq
    public java.lang.String KWHzl() {
        return InterfaceC18204fdw.Activity.OLrzqt(this);
    }

    public LottieDrawable OLrzqt(@NotNull java.lang.String str, @NotNull NavigationBarView navigationBarView) {
        return InterfaceC18204fdw.Activity.OLrzqt(this, str, navigationBarView);
    }

    @Override // o.InterfaceC18198fdq
    public java.lang.String djBIcL() {
        return InterfaceC18204fdw.Activity.copydefault(this);
    }

    /* JADX INFO: renamed from: o.fdK$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fdK.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final InterfaceC9777bbw AEQbTJ() {
        return (InterfaceC9777bbw) this.copydefault.getValue();
    }

    public static final InterfaceC9777bbw EZpvd() {
        java.util.List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC9777bbw.class));
        if (listKWHzl != null) {
            return (InterfaceC9777bbw) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl);
        }
        return null;
    }

    @Override // o.InterfaceC18198fdq
    public android.view.MenuItem EZpvd(@NotNull NavigationBarView navigationBarView) {
        Intrinsics.checkNotNullParameter(navigationBarView, "");
        android.view.Menu menu = navigationBarView.getMenu();
        int i = OLrzqt;
        InterfaceC9777bbw interfaceC9777bbwAEQbTJ = AEQbTJ();
        android.view.MenuItem menuItemAdd = menu.add(0, i, 0, interfaceC9777bbwAEQbTJ != null ? interfaceC9777bbwAEQbTJ.copydefault() : C13754dXa.FragmentManager.processStrongAuthMessage);
        Intrinsics.checkNotNullExpressionValue(menuItemAdd, "");
        return menuItemAdd;
    }

    @Override // o.InterfaceC18198fdq
    public void copydefault(@NotNull android.view.MenuItem menuItem, @NotNull NavigationBarView navigationBarView, boolean z) {
        Intrinsics.checkNotNullParameter(menuItem, "");
        Intrinsics.checkNotNullParameter(navigationBarView, "");
        menuItem.setIcon(OLrzqt(C33492mxV.OLrzqt() ? "tracker_dark.lottie" : "tracker_light.lottie", navigationBarView));
    }

    public static final boolean OLrzqt(C18166fdK c18166fdK, android.view.MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "");
        dTU.onWeb3Event$default("App_TabBar_Tracker_Click", null, null, 3, null);
        android.graphics.drawable.Drawable icon = menuItem.getIcon();
        LottieDrawable lottieDrawable = icon instanceof LottieDrawable ? (LottieDrawable) icon : null;
        if (lottieDrawable == null) {
            return true;
        }
        c18166fdK.EZpvd(lottieDrawable, false);
        return true;
    }

    public static final boolean AEQbTJ(C18166fdK c18166fdK, android.view.MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "");
        android.graphics.drawable.Drawable icon = menuItem.getIcon();
        LottieDrawable lottieDrawable = icon instanceof LottieDrawable ? (LottieDrawable) icon : null;
        if (lottieDrawable != null) {
            c18166fdK.EZpvd(lottieDrawable, true);
        }
        return true;
    }

    @Override // o.InterfaceC18198fdq
    public androidx.fragment.app.Fragment KWHzl(boolean z) {
        androidx.fragment.app.Fragment fragmentKWHzl;
        InterfaceC9777bbw interfaceC9777bbwAEQbTJ = AEQbTJ();
        return (interfaceC9777bbwAEQbTJ == null || (fragmentKWHzl = interfaceC9777bbwAEQbTJ.KWHzl()) == null) ? DefiHomeContainerFragment.Companion.KWHzl(z) : fragmentKWHzl;
    }

    @Override // o.InterfaceC18198fdq
    public boolean copydefault() {
        return ((java.lang.Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new TrackerTabPageDefi$enabled$1(this, null), 1, null)).booleanValue();
    }

    @Override // o.InterfaceC18198fdq
    public boolean AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return ((java.lang.Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new TrackerTabPageDefi$enabledEnter$1(this, context, null), 1, null)).booleanValue();
    }
}
