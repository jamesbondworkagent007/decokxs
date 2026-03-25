package o;

import android.os.Build;
import com.airbnb.lottie.LottieDrawable;
import com.google.android.material.navigation.NavigationBarView;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.InterfaceC18198fdq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fdn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18195fdn extends AbstractC43215rlA implements InterfaceC18204fdw {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public static final int OLrzqt = C14319djH.OLrzqt.EZpvd();
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.fdl
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C18195fdn.EZpvd();
        }
    });
    public final NavigationBarView.OnItemSelectedListener djBIcL = new NavigationBarView.OnItemSelectedListener() { // from class: o.fdj
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener
        public final boolean onNavigationItemSelected(android.view.MenuItem menuItem) {
            return C18195fdn.AEQbTJ(this.OLrzqt, menuItem);
        }
    };
    public final NavigationBarView.OnItemSelectedListener AhwBna = new NavigationBarView.OnItemSelectedListener() { // from class: o.fds
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener
        public final boolean onNavigationItemSelected(android.view.MenuItem menuItem) {
            return C18195fdn.EZpvd(this.OLrzqt, menuItem);
        }
    };
    public final java.lang.String gEmmrt = "navigation_boost";
    public final java.lang.String KWHzl = "navigation_boost";
    public final java.lang.String AEQbTJ = "navigation_boost";
    public final java.lang.String valueOf = "navigation_boost";

    @Override // o.InterfaceC18198fdq
    public int AYXKKw() {
        return 4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC18198fdq
    public java.lang.String AhwBna() {
        return this.gEmmrt;
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
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC18198fdq
    public java.lang.String isConnected() {
        return "BoostTabPage";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC18198fdq
    public NavigationBarView.OnItemSelectedListener valueOf() {
        return this.AhwBna;
    }

    /* JADX INFO: renamed from: o.fdn$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fdn.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public void EZpvd(@NotNull LottieDrawable lottieDrawable, boolean z) {
        InterfaceC18198fdq.ActionBar.copydefault(this, lottieDrawable, z);
    }

    public LottieDrawable copydefault(@NotNull java.lang.String str, @NotNull NavigationBarView navigationBarView) {
        return InterfaceC18198fdq.ActionBar.OLrzqt(this, str, navigationBarView);
    }

    public final java.util.List<InterfaceC9765bbk> OLrzqt() {
        return (java.util.List) this.copydefault.getValue();
    }

    public static final java.util.List EZpvd() {
        return C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC9765bbk.class));
    }

    @Override // o.InterfaceC18198fdq
    public android.view.MenuItem EZpvd(@NotNull NavigationBarView navigationBarView) {
        InterfaceC9765bbk interfaceC9765bbk;
        Intrinsics.checkNotNullParameter(navigationBarView, "");
        android.view.Menu menu = navigationBarView.getMenu();
        int i = OLrzqt;
        java.util.List<InterfaceC9765bbk> listOLrzqt = OLrzqt();
        android.view.MenuItem menuItemAdd = menu.add(0, i, 0, (listOLrzqt == null || (interfaceC9765bbk = (InterfaceC9765bbk) CollectionsKt___CollectionsKt.AuCTelauCTel(listOLrzqt)) == null) ? C13754dXa.FragmentManager.processStrongAuthMessage : interfaceC9765bbk.KWHzl());
        if (Build.VERSION.SDK_INT >= 26) {
            menuItemAdd.setContentDescription("web3BoostHomeTabId");
        }
        Intrinsics.checkNotNullExpressionValue(menuItemAdd, "");
        return menuItemAdd;
    }

    @Override // o.InterfaceC18198fdq
    public void copydefault(@NotNull android.view.MenuItem menuItem, @NotNull NavigationBarView navigationBarView, boolean z) {
        Intrinsics.checkNotNullParameter(menuItem, "");
        Intrinsics.checkNotNullParameter(navigationBarView, "");
        menuItem.setIcon(copydefault(C33492mxV.OLrzqt() ? "web3_home_boost_dark.lottie" : "web3_home_boost_light.lottie", navigationBarView));
    }

    public static final boolean AEQbTJ(C18195fdn c18195fdn, android.view.MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "");
        android.graphics.drawable.Drawable icon = menuItem.getIcon();
        LottieDrawable lottieDrawable = icon instanceof LottieDrawable ? (LottieDrawable) icon : null;
        if (lottieDrawable == null) {
            return true;
        }
        c18195fdn.EZpvd(lottieDrawable, false);
        return true;
    }

    public static final boolean EZpvd(C18195fdn c18195fdn, android.view.MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "");
        android.graphics.drawable.Drawable icon = menuItem.getIcon();
        LottieDrawable lottieDrawable = icon instanceof LottieDrawable ? (LottieDrawable) icon : null;
        if (lottieDrawable != null) {
            c18195fdn.EZpvd(lottieDrawable, true);
        }
        return true;
    }

    @Override // o.InterfaceC18198fdq
    public androidx.fragment.app.Fragment KWHzl(boolean z) {
        InterfaceC9765bbk interfaceC9765bbk;
        androidx.fragment.app.Fragment fragmentCopydefault;
        java.util.List<InterfaceC9765bbk> listOLrzqt = OLrzqt();
        return (listOLrzqt == null || (interfaceC9765bbk = (InterfaceC9765bbk) CollectionsKt___CollectionsKt.AuCTelauCTel(listOLrzqt)) == null || (fragmentCopydefault = interfaceC9765bbk.copydefault()) == null) ? eUD.Companion.copydefault(z) : fragmentCopydefault;
    }

    @Override // o.InterfaceC18198fdq
    public int fetchVPNInfo() {
        return C9768bbn.OLrzqt;
    }

    @Override // o.InterfaceC18198fdq
    public boolean copydefault() {
        java.util.List listKWHzl;
        xWA xwa;
        InterfaceC9765bbk interfaceC9765bbk;
        java.util.List<InterfaceC9765bbk> listOLrzqt = OLrzqt();
        return (listOLrzqt == null || (interfaceC9765bbk = (InterfaceC9765bbk) CollectionsKt___CollectionsKt.AuCTelauCTel(listOLrzqt)) == null || !interfaceC9765bbk.OLrzqt()) && (listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(xWA.class))) != null && (xwa = (xWA) CollectionsKt___CollectionsKt.AuCTelauCTel(listKWHzl)) != null && xwa.KWHzl();
    }

    @Override // o.InterfaceC18198fdq
    public boolean AEQbTJ(@NotNull android.content.Context context) {
        InterfaceC9765bbk interfaceC9765bbk;
        Intrinsics.checkNotNullParameter(context, "");
        java.util.List<InterfaceC9765bbk> listOLrzqt = OLrzqt();
        return !((listOLrzqt == null || (interfaceC9765bbk = (InterfaceC9765bbk) CollectionsKt___CollectionsKt.AuCTelauCTel(listOLrzqt)) == null) ? false : interfaceC9765bbk.EZpvd(context));
    }
}
