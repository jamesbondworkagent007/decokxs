package o;

import android.os.Build;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieDrawable;
import com.google.android.material.navigation.NavigationBarView;
import com.okinc.business.defi.wallet.home.tab.TradeTabPageDefi$enabled$1;
import com.okinc.business.defi.wallet.home.tab.TradeTabPageDefi$enabledEnter$1;
import com.okinc.components.track.TrackChannel;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import o.C13754dXa;
import o.C52761wXj;
import o.InterfaceC18198fdq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fdO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18170fdO extends AbstractC43215rlA implements InterfaceC18204fdw {
    public LottieDrawable EZpvd;
    public LottieDrawable KWHzl;
    public boolean OLrzqt;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;
    public static final int copydefault = C14319djH.OLrzqt.AEQbTJ();
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.fdR
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C18170fdO.OLrzqt();
        }
    });
    public final NavigationBarView.OnItemSelectedListener AhwBna = new NavigationBarView.OnItemSelectedListener() { // from class: o.fdQ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener
        public final boolean onNavigationItemSelected(android.view.MenuItem menuItem) {
            return C18170fdO.OLrzqt(this.OLrzqt, menuItem);
        }
    };
    public final NavigationBarView.OnItemSelectedListener AYXKKw = new NavigationBarView.OnItemSelectedListener() { // from class: o.fdT
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener
        public final boolean onNavigationItemSelected(android.view.MenuItem menuItem) {
            return C18170fdO.EZpvd(this.KWHzl, menuItem);
        }
    };
    public final java.lang.String isConnected = "navigation_trade";
    public final java.lang.String valueOf = "bottom_trade";
    public final java.lang.String gEmmrt = "navigation_trade";
    public final java.lang.String values = "navigation_trade";

    @Override // o.InterfaceC18198fdq
    public int AYXKKw() {
        return 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC18198fdq
    public java.lang.String AhwBna() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC18198fdq
    public java.lang.String AkhnZx() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC18198fdq
    public java.lang.String KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC18198fdq
    public java.lang.String djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC18198fdq
    public NavigationBarView.OnItemSelectedListener gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC18198fdq
    public java.lang.String isConnected() {
        return "DexTradeTabPage";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC18198fdq
    public NavigationBarView.OnItemSelectedListener valueOf() {
        return this.AYXKKw;
    }

    /* JADX INFO: renamed from: o.fdO$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fdO.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final int EZpvd() {
            return C18170fdO.copydefault;
        }
    }

    public void AEQbTJ(@NotNull LottieDrawable lottieDrawable, boolean z) {
        InterfaceC18198fdq.ActionBar.copydefault(this, lottieDrawable, z);
    }

    public LottieDrawable KWHzl(@NotNull java.lang.String str, @NotNull NavigationBarView navigationBarView) {
        return InterfaceC18198fdq.ActionBar.OLrzqt(this, str, navigationBarView);
    }

    public final java.util.List<InterfaceC9772bbr> DbNXlk() {
        return (java.util.List) this.djBIcL.getValue();
    }

    public static final java.util.List OLrzqt() {
        return C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC9772bbr.class));
    }

    @Override // o.InterfaceC18198fdq
    public android.view.MenuItem EZpvd(@NotNull NavigationBarView navigationBarView) {
        InterfaceC9772bbr interfaceC9772bbr;
        Intrinsics.checkNotNullParameter(navigationBarView, "");
        android.view.Menu menu = navigationBarView.getMenu();
        int i = copydefault;
        java.util.List<InterfaceC9772bbr> listDbNXlk = DbNXlk();
        android.view.MenuItem menuItemAdd = menu.add(0, i, 0, (listDbNXlk == null || (interfaceC9772bbr = (InterfaceC9772bbr) CollectionsKt___CollectionsKt.AuCTelauCTel(listDbNXlk)) == null) ? C13754dXa.FragmentManager.processStrongAuthMessage : interfaceC9772bbr.OLrzqt());
        if (Build.VERSION.SDK_INT >= 26) {
            menuItemAdd.setContentDescription("web3DexHomeTabId");
        }
        Intrinsics.checkNotNullExpressionValue(menuItemAdd, "");
        return menuItemAdd;
    }

    @Override // o.InterfaceC18198fdq
    public void copydefault(@NotNull android.view.MenuItem menuItem, @NotNull NavigationBarView navigationBarView, boolean z) {
        LottieDrawable lottieDrawableKWHzl;
        LottieDrawable lottieDrawableKWHzl2;
        Intrinsics.checkNotNullParameter(menuItem, "");
        Intrinsics.checkNotNullParameter(navigationBarView, "");
        this.OLrzqt = z;
        if (z) {
            if (C33492mxV.OLrzqt()) {
                lottieDrawableKWHzl = KWHzl("web3_home_dex_new_dark.lottie", navigationBarView);
            } else {
                LottieComposition value = LottieCompositionFactory.fromRawResSync(navigationBarView.getContext(), C52761wXj.PendingIntent.AkhnZx).getValue();
                if (value == null) {
                    throw new java.lang.IllegalStateException("dex enter lottie composition failed".toString());
                }
                LottieDrawable lottieDrawable = new LottieDrawable();
                lottieDrawable.setComposition(value);
                lottieDrawableKWHzl = lottieDrawable;
            }
            this.EZpvd = lottieDrawableKWHzl;
            if (C33492mxV.OLrzqt()) {
                lottieDrawableKWHzl2 = KWHzl("web3_home_dex_new_dark_unselect.lottie", navigationBarView);
            } else {
                LottieComposition value2 = LottieCompositionFactory.fromRawResSync(navigationBarView.getContext(), C52761wXj.PendingIntent.AuCTel).getValue();
                if (value2 == null) {
                    throw new java.lang.IllegalStateException("dex exit lottie composition failed".toString());
                }
                LottieDrawable lottieDrawable2 = new LottieDrawable();
                lottieDrawable2.setComposition(value2);
                lottieDrawableKWHzl2 = lottieDrawable2;
            }
            this.KWHzl = lottieDrawableKWHzl2;
            menuItem.setIcon(this.EZpvd);
            return;
        }
        menuItem.setIcon(KWHzl(C33492mxV.OLrzqt() ? "web3_home_dex_dark.lottie" : "web3_home_dex_light.lottie", navigationBarView));
    }

    public static final boolean OLrzqt(C18170fdO c18170fdO, android.view.MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "");
        C32866mlf.onEvent$default("app_metax_trade_click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        if (c18170fdO.OLrzqt) {
            LottieDrawable lottieDrawable = c18170fdO.EZpvd;
            if (lottieDrawable != null) {
                c18170fdO.AEQbTJ(lottieDrawable, false);
                lottieDrawable = lottieDrawable;
            }
            menuItem.setIcon(lottieDrawable);
            return true;
        }
        android.graphics.drawable.Drawable icon = menuItem.getIcon();
        lottieDrawable = icon instanceof LottieDrawable ? (LottieDrawable) icon : null;
        if (lottieDrawable == null) {
            return true;
        }
        c18170fdO.AEQbTJ(lottieDrawable, false);
        return true;
    }

    public static final boolean EZpvd(C18170fdO c18170fdO, android.view.MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "");
        if (c18170fdO.OLrzqt) {
            LottieDrawable lottieDrawable = c18170fdO.KWHzl;
            if (lottieDrawable != null) {
                c18170fdO.AEQbTJ(lottieDrawable, false);
                lottieDrawable = lottieDrawable;
            }
            menuItem.setIcon(lottieDrawable);
        } else {
            android.graphics.drawable.Drawable icon = menuItem.getIcon();
            lottieDrawable = icon instanceof LottieDrawable ? (LottieDrawable) icon : null;
            if (lottieDrawable != null) {
                c18170fdO.AEQbTJ(lottieDrawable, true);
            }
        }
        return true;
    }

    @Override // o.InterfaceC18198fdq
    public androidx.fragment.app.Fragment KWHzl(boolean z) {
        InterfaceC9772bbr interfaceC9772bbr;
        androidx.fragment.app.Fragment fragmentKWHzl;
        java.util.List<InterfaceC9772bbr> listDbNXlk = DbNXlk();
        return (listDbNXlk == null || (interfaceC9772bbr = (InterfaceC9772bbr) CollectionsKt___CollectionsKt.AuCTelauCTel(listDbNXlk)) == null || (fragmentKWHzl = interfaceC9772bbr.KWHzl()) == null) ? eUD.Companion.copydefault(z) : fragmentKWHzl;
    }

    @Override // o.InterfaceC18198fdq
    public int fetchVPNInfo() {
        return C9768bbn.EZpvd;
    }

    @Override // o.InterfaceC18198fdq
    public boolean copydefault() {
        return ((java.lang.Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new TradeTabPageDefi$enabled$1(this, null), 1, null)).booleanValue();
    }

    @Override // o.InterfaceC18198fdq
    public boolean AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return ((java.lang.Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new TradeTabPageDefi$enabledEnter$1(this, context, null), 1, null)).booleanValue();
    }
}
