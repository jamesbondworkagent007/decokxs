package o;

import android.os.Build;
import com.airbnb.lottie.LottieDrawable;
import com.google.android.material.navigation.NavigationBarView;
import com.okinc.business.defi.wallet.home.tab.DexMarketTabPage$enabled$1;
import com.okinc.business.defi.wallet.home.tab.DexMarketTabPage$enabledEnter$1;
import com.okinc.components.track.TrackChannel;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import o.C13754dXa;
import o.InterfaceC18198fdq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fdo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18196fdo extends AbstractC43215rlA implements InterfaceC18198fdq {
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.fdp
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C18196fdo.AEQbTJ();
        }
    });
    public final NavigationBarView.OnItemSelectedListener copydefault = new NavigationBarView.OnItemSelectedListener() { // from class: o.fdx
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener
        public final boolean onNavigationItemSelected(android.view.MenuItem menuItem) {
            return C18196fdo.AEQbTJ(this.copydefault, menuItem);
        }
    };
    public final NavigationBarView.OnItemSelectedListener OLrzqt = new NavigationBarView.OnItemSelectedListener() { // from class: o.fdt
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener
        public final boolean onNavigationItemSelected(android.view.MenuItem menuItem) {
            return C18196fdo.KWHzl(this.AEQbTJ, menuItem);
        }
    };

    @Override // o.InterfaceC18198fdq
    public int AYXKKw() {
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC18198fdq
    public NavigationBarView.OnItemSelectedListener gEmmrt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC18198fdq
    public java.lang.String isConnected() {
        return "DexMarketTabPage";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC18198fdq
    public NavigationBarView.OnItemSelectedListener valueOf() {
        return this.OLrzqt;
    }

    @Override // o.InterfaceC18198fdq
    public java.lang.String AhwBna() {
        return InterfaceC18198fdq.ActionBar.AEQbTJ(this);
    }

    @Override // o.InterfaceC18198fdq
    public java.lang.String AkhnZx() {
        return InterfaceC18198fdq.ActionBar.copydefault(this);
    }

    public LottieDrawable KWHzl(@NotNull java.lang.String str, @NotNull NavigationBarView navigationBarView) {
        return InterfaceC18198fdq.ActionBar.OLrzqt(this, str, navigationBarView);
    }

    @Override // o.InterfaceC18198fdq
    public java.lang.String KWHzl() {
        return InterfaceC18198fdq.ActionBar.EZpvd(this);
    }

    public void OLrzqt(@NotNull LottieDrawable lottieDrawable, boolean z) {
        InterfaceC18198fdq.ActionBar.copydefault(this, lottieDrawable, z);
    }

    @Override // o.InterfaceC18198fdq
    public java.lang.String djBIcL() {
        return InterfaceC18198fdq.ActionBar.OLrzqt(this);
    }

    public final InterfaceC9771bbq EZpvd() {
        return (InterfaceC9771bbq) this.EZpvd.getValue();
    }

    public static final InterfaceC9771bbq AEQbTJ() {
        java.util.List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC9771bbq.class));
        if (listKWHzl != null) {
            return (InterfaceC9771bbq) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl);
        }
        return null;
    }

    @Override // o.InterfaceC18198fdq
    public android.view.MenuItem EZpvd(@NotNull NavigationBarView navigationBarView) {
        Intrinsics.checkNotNullParameter(navigationBarView, "");
        android.view.Menu menu = navigationBarView.getMenu();
        int iCopydefault = C14319djH.OLrzqt.copydefault();
        InterfaceC9771bbq interfaceC9771bbqEZpvd = EZpvd();
        android.view.MenuItem menuItemAdd = menu.add(0, iCopydefault, 0, interfaceC9771bbqEZpvd != null ? interfaceC9771bbqEZpvd.copydefault() : C13754dXa.FragmentManager.processStrongAuthMessage);
        if (Build.VERSION.SDK_INT >= 26) {
            menuItemAdd.setContentDescription("web3DexMarketTabId");
        }
        Intrinsics.checkNotNullExpressionValue(menuItemAdd, "");
        return menuItemAdd;
    }

    @Override // o.InterfaceC18198fdq
    public void copydefault(@NotNull android.view.MenuItem menuItem, @NotNull NavigationBarView navigationBarView, boolean z) {
        Intrinsics.checkNotNullParameter(menuItem, "");
        Intrinsics.checkNotNullParameter(navigationBarView, "");
        menuItem.setIcon(KWHzl(C33492mxV.OLrzqt() ? "web3_home_dex_market_dark.lottie" : "web3_home_dex_market_light.lottie", navigationBarView));
    }

    public static final boolean AEQbTJ(C18196fdo c18196fdo, android.view.MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "");
        C32866mlf.onEvent$default("DEXMarket_Home_Market_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        android.graphics.drawable.Drawable icon = menuItem.getIcon();
        LottieDrawable lottieDrawable = icon instanceof LottieDrawable ? (LottieDrawable) icon : null;
        if (lottieDrawable == null) {
            return true;
        }
        c18196fdo.OLrzqt(lottieDrawable, false);
        return true;
    }

    public static final boolean KWHzl(C18196fdo c18196fdo, android.view.MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "");
        android.graphics.drawable.Drawable icon = menuItem.getIcon();
        LottieDrawable lottieDrawable = icon instanceof LottieDrawable ? (LottieDrawable) icon : null;
        if (lottieDrawable != null) {
            c18196fdo.OLrzqt(lottieDrawable, true);
        }
        return true;
    }

    @Override // o.InterfaceC18198fdq
    public androidx.fragment.app.Fragment KWHzl(boolean z) {
        androidx.fragment.app.Fragment fragmentAEQbTJ;
        InterfaceC9771bbq interfaceC9771bbqEZpvd = EZpvd();
        return (interfaceC9771bbqEZpvd == null || (fragmentAEQbTJ = interfaceC9771bbqEZpvd.AEQbTJ()) == null) ? eUD.Companion.copydefault(z) : fragmentAEQbTJ;
    }

    @Override // o.InterfaceC18198fdq
    public int fetchVPNInfo() {
        return C9768bbn.copydefault;
    }

    @Override // o.InterfaceC18198fdq
    public boolean copydefault() {
        return ((java.lang.Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new DexMarketTabPage$enabled$1(this, null), 1, null)).booleanValue();
    }

    @Override // o.InterfaceC18198fdq
    public boolean AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return ((java.lang.Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new DexMarketTabPage$enabledEnter$1(this, context, null), 1, null)).booleanValue();
    }
}
