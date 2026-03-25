package o;

import android.os.Build;
import com.airbnb.lottie.LottieDrawable;
import com.google.android.material.navigation.NavigationBarView;
import com.okinc.business.defi.wallet.home.DefiHomeContainerFragment;
import com.okinc.business.defi.wallet.home.tab.ScannerTabPageDefi$enabled$1;
import com.okinc.business.defi.wallet.home.tab.ScannerTabPageDefi$enabledEnter$1;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import o.C13754dXa;
import o.InterfaceC18204fdw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fdD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18159fdD extends AbstractC43215rlA implements InterfaceC18204fdw {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public static final int EZpvd = C14319djH.OLrzqt.AYXKKw();
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.fdI
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C18159fdD.AEQbTJ();
        }
    });
    public final NavigationBarView.OnItemSelectedListener OLrzqt = new NavigationBarView.OnItemSelectedListener() { // from class: o.fdJ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener
        public final boolean onNavigationItemSelected(android.view.MenuItem menuItem) {
            return C18159fdD.OLrzqt(this.KWHzl, menuItem);
        }
    };
    public final NavigationBarView.OnItemSelectedListener AEQbTJ = new NavigationBarView.OnItemSelectedListener() { // from class: o.fdL
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener
        public final boolean onNavigationItemSelected(android.view.MenuItem menuItem) {
            return C18159fdD.AEQbTJ(this.EZpvd, menuItem);
        }
    };

    @Override // o.InterfaceC18198fdq
    public int AYXKKw() {
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC18198fdq
    public int fetchVPNInfo() {
        return EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC18198fdq
    public NavigationBarView.OnItemSelectedListener gEmmrt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC18198fdq
    public java.lang.String isConnected() {
        return "ScannerTabPage";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC18198fdq
    public NavigationBarView.OnItemSelectedListener valueOf() {
        return this.AEQbTJ;
    }

    public LottieDrawable AEQbTJ(@NotNull java.lang.String str, @NotNull NavigationBarView navigationBarView) {
        return InterfaceC18204fdw.Activity.OLrzqt(this, str, navigationBarView);
    }

    @Override // o.InterfaceC18198fdq
    public java.lang.String AhwBna() {
        return InterfaceC18204fdw.Activity.KWHzl(this);
    }

    @Override // o.InterfaceC18198fdq
    public java.lang.String AkhnZx() {
        return InterfaceC18204fdw.Activity.AEQbTJ(this);
    }

    @Override // o.InterfaceC18198fdq
    public java.lang.String KWHzl() {
        return InterfaceC18204fdw.Activity.OLrzqt(this);
    }

    public void OLrzqt(@NotNull LottieDrawable lottieDrawable, boolean z) {
        InterfaceC18204fdw.Activity.EZpvd(this, lottieDrawable, z);
    }

    @Override // o.InterfaceC18198fdq
    public java.lang.String djBIcL() {
        return InterfaceC18204fdw.Activity.copydefault(this);
    }

    /* JADX INFO: renamed from: o.fdD$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fdD.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final InterfaceC9779bby OLrzqt() {
        return (InterfaceC9779bby) this.KWHzl.getValue();
    }

    public static final InterfaceC9779bby AEQbTJ() {
        java.util.List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC9779bby.class));
        if (listKWHzl != null) {
            return (InterfaceC9779bby) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl);
        }
        return null;
    }

    @Override // o.InterfaceC18198fdq
    public android.view.MenuItem EZpvd(@NotNull NavigationBarView navigationBarView) {
        Intrinsics.checkNotNullParameter(navigationBarView, "");
        android.view.Menu menu = navigationBarView.getMenu();
        int i = EZpvd;
        InterfaceC9779bby interfaceC9779bbyOLrzqt = OLrzqt();
        android.view.MenuItem menuItemAdd = menu.add(0, i, 0, interfaceC9779bbyOLrzqt != null ? interfaceC9779bbyOLrzqt.KWHzl() : C13754dXa.FragmentManager.processStrongAuthMessage);
        if (Build.VERSION.SDK_INT >= 26) {
            menuItemAdd.setContentDescription("web3ScannerHomeTabId");
        }
        Intrinsics.checkNotNullExpressionValue(menuItemAdd, "");
        return menuItemAdd;
    }

    @Override // o.InterfaceC18198fdq
    public void copydefault(@NotNull android.view.MenuItem menuItem, @NotNull NavigationBarView navigationBarView, boolean z) {
        Intrinsics.checkNotNullParameter(menuItem, "");
        Intrinsics.checkNotNullParameter(navigationBarView, "");
        menuItem.setIcon(AEQbTJ(C33492mxV.OLrzqt() ? "scanner_dark.lottie" : "scanner_light.lottie", navigationBarView));
    }

    public static final boolean OLrzqt(C18159fdD c18159fdD, android.view.MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "");
        android.graphics.drawable.Drawable icon = menuItem.getIcon();
        LottieDrawable lottieDrawable = icon instanceof LottieDrawable ? (LottieDrawable) icon : null;
        if (lottieDrawable == null) {
            return true;
        }
        c18159fdD.OLrzqt(lottieDrawable, false);
        return true;
    }

    public static final boolean AEQbTJ(C18159fdD c18159fdD, android.view.MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "");
        android.graphics.drawable.Drawable icon = menuItem.getIcon();
        LottieDrawable lottieDrawable = icon instanceof LottieDrawable ? (LottieDrawable) icon : null;
        if (lottieDrawable != null) {
            c18159fdD.OLrzqt(lottieDrawable, true);
        }
        return true;
    }

    @Override // o.InterfaceC18198fdq
    public androidx.fragment.app.Fragment KWHzl(boolean z) {
        androidx.fragment.app.Fragment fragmentCopydefault;
        InterfaceC9779bby interfaceC9779bbyOLrzqt = OLrzqt();
        return (interfaceC9779bbyOLrzqt == null || (fragmentCopydefault = interfaceC9779bbyOLrzqt.copydefault()) == null) ? DefiHomeContainerFragment.Companion.KWHzl(z) : fragmentCopydefault;
    }

    @Override // o.InterfaceC18198fdq
    public boolean copydefault() {
        return ((java.lang.Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new ScannerTabPageDefi$enabled$1(this, null), 1, null)).booleanValue();
    }

    @Override // o.InterfaceC18198fdq
    public boolean AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return ((java.lang.Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new ScannerTabPageDefi$enabledEnter$1(this, context, null), 1, null)).booleanValue();
    }
}
