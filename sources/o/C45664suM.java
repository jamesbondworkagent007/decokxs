package o;

import android.os.Build;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieListener;
import com.google.android.material.navigation.NavigationBarView;
import com.okinc.components.track.TrackChannel;
import com.okinc.core.ok_app.api.bean.LiteNavigationTabEnum;
import com.okinc.okex.lite.hero.data.model.HeroSection;
import com.okinc.okex.lite.hero.data.model.HeroTabBarItem;
import java.util.zip.ZipInputStream;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C45716svX;
import o.InterfaceC33214msI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.suM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45664suM implements InterfaceC33214msI {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm<C45706svB> AEQbTJ;
    public final InterfaceC56387yDm<InterfaceC45723svf> AYXKKw;
    public boolean KWHzl;
    public final InterfaceC56387yDm<C45730svm> OLrzqt;
    public LottieDrawable copydefault;
    public final InterfaceC33217msL valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC33214msI
    public java.lang.String AEQbTJ() {
        return "hero";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC33214msI
    public java.lang.String KWHzl() {
        return "LiteHeroFragmentTag";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC33214msI
    public java.lang.String OLrzqt() {
        return "LiteHeroPageId";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC33214msI
    public InterfaceC33217msL copydefault() {
        return this.valueOf;
    }

    @Override // o.InterfaceC33214msI
    public void copydefault(android.content.Intent intent) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.yDm<? extends o.svf> */
    /* JADX WARN: Multi-variable type inference failed */
    @yCM
    public C45664suM(@NotNull InterfaceC56387yDm<C45706svB> interfaceC56387yDm, @NotNull InterfaceC56387yDm<? extends InterfaceC45723svf> interfaceC56387yDm2, @NotNull InterfaceC56387yDm<C45730svm> interfaceC56387yDm3) {
        Intrinsics.checkNotNullParameter(interfaceC56387yDm, "");
        Intrinsics.checkNotNullParameter(interfaceC56387yDm2, "");
        Intrinsics.checkNotNullParameter(interfaceC56387yDm3, "");
        this.AEQbTJ = interfaceC56387yDm;
        this.AYXKKw = interfaceC56387yDm2;
        this.OLrzqt = interfaceC56387yDm3;
        pUU.copydefault("LiteHeroPage", "bottom tab init");
    }

    @Override // o.InterfaceC33214msI
    public void AEQbTJ(@NotNull InterfaceC33218msM interfaceC33218msM) {
        InterfaceC33214msI.TaskDescription.copydefault(this, interfaceC33218msM);
    }

    @Override // o.InterfaceC33214msI
    public void copydefault(@NotNull android.view.View view) {
        InterfaceC33214msI.TaskDescription.KWHzl(this, view);
    }

    @Override // o.InterfaceC33214msI
    public void djBIcL() {
        InterfaceC33214msI.TaskDescription.AEQbTJ(this);
    }

    @Override // o.InterfaceC33214msI
    public boolean gEmmrt() {
        return InterfaceC33214msI.TaskDescription.OLrzqt(this);
    }

    public final HeroTabBarItem AhwBna() {
        HeroSection heroSectionCopydefault = this.AYXKKw.getValue().copydefault();
        if (heroSectionCopydefault != null) {
            return heroSectionCopydefault.AEQbTJ();
        }
        return null;
    }

    private final void OLrzqt(boolean z) {
        if (this.KWHzl == z) {
            return;
        }
        this.KWHzl = z;
        LottieDrawable lottieDrawable = this.copydefault;
        if (lottieDrawable != null) {
            lottieDrawable.setSpeed(z ? 1.0f : -1.0f);
            lottieDrawable.playAnimation();
        }
    }

    @Override // o.InterfaceC33214msI
    public InterfaceC33217msL AYXKKw() {
        return new C45661suJ(C45726svi.KWHzl);
    }

    @Override // o.InterfaceC33214msI
    public boolean EZpvd() {
        return this.AEQbTJ.getValue().copydefault(true, true) && !this.AYXKKw.getValue().EZpvd();
    }

    @Override // o.InterfaceC33214msI
    public boolean KWHzl(android.content.Intent intent) {
        android.os.Bundle extras;
        return ((intent == null || (extras = intent.getExtras()) == null) ? null : (LiteNavigationTabEnum) extras.getParcelable("tab_type")) == LiteNavigationTabEnum.HERO;
    }

    @Override // o.InterfaceC33214msI
    public android.view.MenuItem copydefault(@NotNull NavigationBarView navigationBarView) {
        Intrinsics.checkNotNullParameter(navigationBarView, "");
        android.view.Menu menu = navigationBarView.getMenu();
        int i = C45716svX.ActionBar.QOLQEE;
        HeroTabBarItem heroTabBarItemAhwBna = AhwBna();
        android.view.MenuItem menuItemAdd = menu.add(0, i, 0, heroTabBarItemAhwBna != null ? heroTabBarItemAhwBna.AEQbTJ() : null);
        Intrinsics.checkNotNullExpressionValue(menuItemAdd, "");
        return menuItemAdd;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    @Override // o.InterfaceC33214msI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void EZpvd(@NotNull final NavigationBarView navigationBarView) {
        java.lang.String strEZpvd;
        Intrinsics.checkNotNullParameter(navigationBarView, "");
        android.view.MenuItem menuItemFindItem = navigationBarView.getMenu().findItem(C45716svX.ActionBar.QOLQEE);
        if (menuItemFindItem != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                menuItemFindItem.setContentDescription("liteHeroTabID");
            }
            final LottieDrawable lottieDrawable = new LottieDrawable();
            if (C33492mxV.OLrzqt()) {
                HeroTabBarItem heroTabBarItemAhwBna = AhwBna();
                strEZpvd = heroTabBarItemAhwBna != null ? heroTabBarItemAhwBna.OLrzqt() : null;
            } else {
                HeroTabBarItem heroTabBarItemAhwBna2 = AhwBna();
                if (heroTabBarItemAhwBna2 != null) {
                    strEZpvd = heroTabBarItemAhwBna2.EZpvd();
                }
            }
            if (!new java.io.File(strEZpvd).exists()) {
                pUU.copydefault("LiteHeroPage", "File not found " + strEZpvd);
                OLrzqt(C33569myt.OLrzqt(navigationBarView.getContext()));
                return;
            }
            LottieCompositionFactory.fromZipStream(new ZipInputStream(new java.io.BufferedInputStream(new java.io.FileInputStream(strEZpvd), 1024)), strEZpvd).addListener(new LottieListener() { // from class: o.suN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.airbnb.lottie.LottieListener
                public final void onResult(java.lang.Object obj) {
                    C45664suM.EZpvd(lottieDrawable, this, (LottieComposition) obj);
                }
            }).addFailureListener(new LottieListener() { // from class: o.suO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.airbnb.lottie.LottieListener
                public final void onResult(java.lang.Object obj) {
                    C45664suM.AEQbTJ(this.OLrzqt, navigationBarView, (java.lang.Throwable) obj);
                }
            });
            menuItemFindItem.setIcon(lottieDrawable);
        }
    }

    public static final void EZpvd(LottieDrawable lottieDrawable, C45664suM c45664suM, LottieComposition lottieComposition) {
        lottieDrawable.setComposition(lottieComposition);
        c45664suM.copydefault = lottieDrawable;
        c45664suM.valueOf();
    }

    public static final void AEQbTJ(C45664suM c45664suM, NavigationBarView navigationBarView, java.lang.Throwable th) {
        c45664suM.OLrzqt(C33569myt.OLrzqt(navigationBarView.getContext()));
        pUU.AEQbTJ("Lottie", "Failed to load animation", th);
        pUU.copydefault("LiteHeroPage", "Failed to load tab animation " + th);
    }

    public final void OLrzqt(android.app.Activity activity) {
        this.OLrzqt.getValue().copydefault(activity);
    }

    public final void valueOf() {
        LottieDrawable lottieDrawable;
        if (!this.KWHzl || (lottieDrawable = this.copydefault) == null) {
            return;
        }
        lottieDrawable.setSpeed(1.0f);
        lottieDrawable.playAnimation();
    }

    @Override // o.InterfaceC33214msI
    public androidx.fragment.app.Fragment EZpvd(android.content.Intent intent) {
        pUU.copydefault("LiteHeroPage", "bottom tab createTabFragment");
        return new C45729svl();
    }

    @Override // o.InterfaceC33212msG
    public void OLrzqt(java.lang.String str, java.lang.String str2) {
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) str2)) {
            return;
        }
        OLrzqt(Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) AEQbTJ()));
        if (this.KWHzl) {
            C32866mlf.onEvent$default("Simpleherotab_Click_Tabclick_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        }
    }

    @Override // o.InterfaceC33214msI
    public void copydefault(@NotNull InterfaceC33215msJ interfaceC33215msJ) {
        Intrinsics.checkNotNullParameter(interfaceC33215msJ, "");
        this.OLrzqt.getValue().KWHzl(interfaceC33215msJ);
    }

    /* JADX INFO: renamed from: o.suM$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.suM.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
