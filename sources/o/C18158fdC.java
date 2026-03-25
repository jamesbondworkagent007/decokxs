package o;

import android.os.Build;
import com.airbnb.lottie.LottieDrawable;
import com.google.android.material.navigation.NavigationBarView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.InterfaceC18198fdq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fdC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18158fdC extends AbstractC43215rlA implements InterfaceC18204fdw {
    public final NavigationBarView.OnItemSelectedListener KWHzl = new NavigationBarView.OnItemSelectedListener() { // from class: o.fdA
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener
        public final boolean onNavigationItemSelected(android.view.MenuItem menuItem) {
            return C18158fdC.AEQbTJ(this.copydefault, menuItem);
        }
    };
    public final NavigationBarView.OnItemSelectedListener OLrzqt = new NavigationBarView.OnItemSelectedListener() { // from class: o.fdz
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener
        public final boolean onNavigationItemSelected(android.view.MenuItem menuItem) {
            return C18158fdC.EZpvd(this.EZpvd, menuItem);
        }
    };
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;
    public static final int copydefault = C14319djH.OLrzqt.OLrzqt();

    @Override // o.InterfaceC18198fdq
    public int AYXKKw() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC18198fdq
    public NavigationBarView.OnItemSelectedListener gEmmrt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC18198fdq
    public java.lang.String isConnected() {
        return "HomeTabPage";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC18198fdq
    public NavigationBarView.OnItemSelectedListener valueOf() {
        return this.OLrzqt;
    }

    /* JADX INFO: renamed from: o.fdC$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fdC.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final int OLrzqt() {
            return C18158fdC.copydefault;
        }
    }

    public LottieDrawable AEQbTJ(@NotNull java.lang.String str, @NotNull NavigationBarView navigationBarView) {
        return InterfaceC18198fdq.ActionBar.OLrzqt(this, str, navigationBarView);
    }

    @Override // o.InterfaceC18198fdq
    public boolean AEQbTJ(@NotNull android.content.Context context) {
        return InterfaceC18198fdq.ActionBar.OLrzqt(this, context);
    }

    @Override // o.InterfaceC18198fdq
    public java.lang.String AhwBna() {
        return InterfaceC18198fdq.ActionBar.AEQbTJ(this);
    }

    @Override // o.InterfaceC18198fdq
    public java.lang.String AkhnZx() {
        return InterfaceC18198fdq.ActionBar.copydefault(this);
    }

    @Override // o.InterfaceC18198fdq
    public java.lang.String KWHzl() {
        return InterfaceC18198fdq.ActionBar.EZpvd(this);
    }

    public void copydefault(@NotNull LottieDrawable lottieDrawable, boolean z) {
        InterfaceC18198fdq.ActionBar.copydefault(this, lottieDrawable, z);
    }

    @Override // o.InterfaceC18198fdq
    public boolean copydefault() {
        return InterfaceC18198fdq.ActionBar.KWHzl(this);
    }

    @Override // o.InterfaceC18198fdq
    public java.lang.String djBIcL() {
        return InterfaceC18198fdq.ActionBar.OLrzqt(this);
    }

    @Override // o.InterfaceC18198fdq
    public android.view.MenuItem EZpvd(@NotNull NavigationBarView navigationBarView) {
        Intrinsics.checkNotNullParameter(navigationBarView, "");
        android.view.MenuItem menuItemAdd = navigationBarView.getMenu().add(0, copydefault, 0, C13754dXa.FragmentManager.processStrongAuthMessage);
        if (Build.VERSION.SDK_INT >= 26) {
            menuItemAdd.setContentDescription("web3HomeHomeTabId");
        }
        Intrinsics.checkNotNullExpressionValue(menuItemAdd, "");
        return menuItemAdd;
    }

    @Override // o.InterfaceC18198fdq
    public void copydefault(@NotNull android.view.MenuItem menuItem, @NotNull NavigationBarView navigationBarView, boolean z) {
        Intrinsics.checkNotNullParameter(menuItem, "");
        Intrinsics.checkNotNullParameter(navigationBarView, "");
        menuItem.setIcon(AEQbTJ(C33492mxV.OLrzqt() ? "web3_home_wallet_dark.lottie" : "web3_home_wallet_light.lottie", navigationBarView));
    }

    public static final boolean AEQbTJ(C18158fdC c18158fdC, android.view.MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "");
        dTU.onWeb3Event$default("app_home_click", null, null, 3, null);
        android.graphics.drawable.Drawable icon = menuItem.getIcon();
        LottieDrawable lottieDrawable = icon instanceof LottieDrawable ? (LottieDrawable) icon : null;
        if (lottieDrawable == null) {
            return true;
        }
        c18158fdC.copydefault(lottieDrawable, false);
        return true;
    }

    public static final boolean EZpvd(C18158fdC c18158fdC, android.view.MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "");
        android.graphics.drawable.Drawable icon = menuItem.getIcon();
        LottieDrawable lottieDrawable = icon instanceof LottieDrawable ? (LottieDrawable) icon : null;
        if (lottieDrawable != null) {
            c18158fdC.copydefault(lottieDrawable, true);
        }
        return true;
    }

    @Override // o.InterfaceC18198fdq
    public androidx.fragment.app.Fragment KWHzl(boolean z) {
        return eUD.Companion.copydefault(z);
    }

    @Override // o.InterfaceC18198fdq
    public int fetchVPNInfo() {
        return C9768bbn.gEmmrt;
    }
}
