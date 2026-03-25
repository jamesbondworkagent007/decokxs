package o;

import android.os.Build;
import com.airbnb.lottie.LottieDrawable;
import com.google.android.material.navigation.NavigationBarView;
import com.okinc.business.defi.wallet.home.tab.InvestTabPageDefi$enabled$1;
import com.okinc.business.defi.wallet.home.tab.InvestTabPageDefi$enabledEnter$1;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import o.C13754dXa;
import o.InterfaceC18198fdq;
import o.InterfaceC25429iwZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fdF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C18161fdF extends AbstractC43215rlA implements InterfaceC18204fdw {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public static final int OLrzqt = C14319djH.OLrzqt.AhwBna();
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.fdH
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C18161fdF.OLrzqt();
        }
    });
    public final NavigationBarView.OnItemSelectedListener gEmmrt = new NavigationBarView.OnItemSelectedListener() { // from class: o.fdE
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener
        public final boolean onNavigationItemSelected(android.view.MenuItem menuItem) {
            return C18161fdF.copydefault(this.KWHzl, menuItem);
        }
    };
    public final NavigationBarView.OnItemSelectedListener djBIcL = new NavigationBarView.OnItemSelectedListener() { // from class: o.fdG
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener
        public final boolean onNavigationItemSelected(android.view.MenuItem menuItem) {
            return C18161fdF.KWHzl(this.EZpvd, menuItem);
        }
    };
    public final java.lang.String AhwBna = "navigation_earn";
    public final java.lang.String KWHzl = "bottom_earn";
    public final java.lang.String AEQbTJ = "navigation_earn";
    public final java.lang.String valueOf = "navigation_earn";

    @Override // o.InterfaceC18198fdq
    public int AYXKKw() {
        return 3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC18198fdq
    public java.lang.String AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC18198fdq
    public java.lang.String AkhnZx() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC18198fdq
    public java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC18198fdq
    public java.lang.String djBIcL() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC18198fdq
    public NavigationBarView.OnItemSelectedListener gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC18198fdq
    public java.lang.String isConnected() {
        return "InvestTabPage";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC18198fdq
    public NavigationBarView.OnItemSelectedListener valueOf() {
        return this.djBIcL;
    }

    /* JADX INFO: renamed from: o.fdF$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fdF.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public LottieDrawable copydefault(@NotNull java.lang.String str, @NotNull NavigationBarView navigationBarView) {
        return InterfaceC18198fdq.ActionBar.OLrzqt(this, str, navigationBarView);
    }

    public void copydefault(@NotNull LottieDrawable lottieDrawable, boolean z) {
        InterfaceC18198fdq.ActionBar.copydefault(this, lottieDrawable, z);
    }

    public final java.util.List<InterfaceC9774bbt> EZpvd() {
        return (java.util.List) this.EZpvd.getValue();
    }

    public static final java.util.List OLrzqt() {
        return C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC9774bbt.class));
    }

    @Override // o.InterfaceC18198fdq
    public android.view.MenuItem EZpvd(@NotNull NavigationBarView navigationBarView) {
        InterfaceC9774bbt interfaceC9774bbt;
        Intrinsics.checkNotNullParameter(navigationBarView, "");
        android.view.Menu menu = navigationBarView.getMenu();
        int i = OLrzqt;
        java.util.List<InterfaceC9774bbt> listEZpvd = EZpvd();
        android.view.MenuItem menuItemAdd = menu.add(0, i, 0, (listEZpvd == null || (interfaceC9774bbt = (InterfaceC9774bbt) CollectionsKt___CollectionsKt.firstOrNull(listEZpvd)) == null) ? C13754dXa.FragmentManager.processStrongAuthMessage : interfaceC9774bbt.KWHzl());
        if (Build.VERSION.SDK_INT >= 26) {
            menuItemAdd.setContentDescription("web3TABHomeTabId");
        }
        Intrinsics.checkNotNullExpressionValue(menuItemAdd, "");
        return menuItemAdd;
    }

    @Override // o.InterfaceC18198fdq
    public void copydefault(@NotNull android.view.MenuItem menuItem, @NotNull NavigationBarView navigationBarView, boolean z) {
        Intrinsics.checkNotNullParameter(menuItem, "");
        Intrinsics.checkNotNullParameter(navigationBarView, "");
        menuItem.setIcon(copydefault(C33492mxV.OLrzqt() ? "web3_home_defi_dark.lottie" : "web3_home_defi_light.lottie", navigationBarView));
    }

    public static final boolean copydefault(C18161fdF c18161fdF, android.view.MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "");
        InterfaceC25429iwZ interfaceC25429iwZ = (InterfaceC25429iwZ) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(InterfaceC25429iwZ.class));
        if (interfaceC25429iwZ != null) {
            InterfaceC25429iwZ.TaskDescription.onHomepageTabAccessEvent$default(interfaceC25429iwZ, null, 1, null);
        }
        android.graphics.drawable.Drawable icon = menuItem.getIcon();
        LottieDrawable lottieDrawable = icon instanceof LottieDrawable ? (LottieDrawable) icon : null;
        if (lottieDrawable != null) {
            c18161fdF.copydefault(lottieDrawable, false);
        }
        return true;
    }

    public static final boolean KWHzl(C18161fdF c18161fdF, android.view.MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "");
        android.graphics.drawable.Drawable icon = menuItem.getIcon();
        LottieDrawable lottieDrawable = icon instanceof LottieDrawable ? (LottieDrawable) icon : null;
        if (lottieDrawable != null) {
            c18161fdF.copydefault(lottieDrawable, true);
        }
        return true;
    }

    @Override // o.InterfaceC18198fdq
    public androidx.fragment.app.Fragment KWHzl(boolean z) {
        InterfaceC9774bbt interfaceC9774bbt;
        androidx.fragment.app.Fragment fragmentOLrzqt;
        java.util.List<InterfaceC9774bbt> listEZpvd = EZpvd();
        return (listEZpvd == null || (interfaceC9774bbt = (InterfaceC9774bbt) CollectionsKt___CollectionsKt.firstOrNull(listEZpvd)) == null || (fragmentOLrzqt = interfaceC9774bbt.OLrzqt()) == null) ? eUD.Companion.copydefault(z) : fragmentOLrzqt;
    }

    @Override // o.InterfaceC18198fdq
    public int fetchVPNInfo() {
        return C9768bbn.AYXKKw;
    }

    @Override // o.InterfaceC18198fdq
    public boolean copydefault() {
        return ((java.lang.Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new InvestTabPageDefi$enabled$1(this, null), 1, null)).booleanValue();
    }

    @Override // o.InterfaceC18198fdq
    public boolean AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return ((java.lang.Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new InvestTabPageDefi$enabledEnter$1(this, context, null), 1, null)).booleanValue();
    }
}
