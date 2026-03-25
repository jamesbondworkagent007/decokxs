package o;

import androidx.fragment.app.FragmentContainerView;
import com.okinc.business.dex.trade.component.orderandposition.ordertab.OrderAndPositionTabComponentFragment;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedLimitBy;
import com.okinc.business.trade.features.home.ui.cefi.placeorder.AdvancedPlaceOrderFragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lef, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30624lef {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final C21667hHw AEQbTJ;
    public final androidx.fragment.app.FragmentManager OLrzqt;

    public C30624lef(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull C21667hHw c21667hHw) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(c21667hHw, "");
        this.OLrzqt = fragmentManager;
        this.AEQbTJ = c21667hHw;
    }

    /* JADX INFO: renamed from: o.lef$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lef.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final void AhwBna() {
        C21667hHw c21667hHw = this.AEQbTJ;
        FragmentContainerView fragmentContainerView = c21667hHw.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(fragmentContainerView, "");
        AEQbTJ(fragmentContainerView, java.lang.String.valueOf(C56524yIo.AEQbTJ(C30677lff.class).valueOf()), new Function0() { // from class: o.leg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30624lef.KWHzl();
            }
        });
        FragmentContainerView fragmentContainerView2 = c21667hHw.AhwBna;
        Intrinsics.checkNotNullExpressionValue(fragmentContainerView2, "");
        AEQbTJ(fragmentContainerView2, java.lang.String.valueOf(C56524yIo.AEQbTJ(AdvancedPlaceOrderFragment.class).valueOf()), new Function0() { // from class: o.lee
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30624lef.djBIcL();
            }
        });
        FragmentContainerView fragmentContainerView3 = c21667hHw.valueOf;
        Intrinsics.checkNotNullExpressionValue(fragmentContainerView3, "");
        AEQbTJ(fragmentContainerView3, java.lang.String.valueOf(C56524yIo.AEQbTJ(C30693lfv.class).valueOf()), new Function0() { // from class: o.lel
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30624lef.valueOf();
            }
        });
        FragmentContainerView fragmentContainerView4 = c21667hHw.djBIcL;
        Intrinsics.checkNotNullExpressionValue(fragmentContainerView4, "");
        AEQbTJ(fragmentContainerView4, java.lang.String.valueOf(C56524yIo.AEQbTJ(OrderAndPositionTabComponentFragment.class).valueOf()), new Function0() { // from class: o.lek
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30624lef.AYXKKw();
            }
        });
    }

    public static final androidx.fragment.app.Fragment KWHzl() {
        return C30677lff.Companion.KWHzl();
    }

    public static final androidx.fragment.app.Fragment djBIcL() {
        return AdvancedPlaceOrderFragment.Companion.OLrzqt();
    }

    public static final androidx.fragment.app.Fragment valueOf() {
        return C30693lfv.Companion.EZpvd();
    }

    public static final androidx.fragment.app.Fragment AYXKKw() {
        return OrderAndPositionTabComponentFragment.Companion.EZpvd();
    }

    public final void AEQbTJ(@NotNull AdvancedLimitBy advancedLimitBy) {
        Intrinsics.checkNotNullParameter(advancedLimitBy, "");
        java.lang.String strValueOf = java.lang.String.valueOf(C56524yIo.AEQbTJ(C30677lff.class).valueOf());
        FragmentContainerView fragmentContainerView = this.AEQbTJ.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(fragmentContainerView, "");
        boolean z = fragmentContainerView.getVisibility() == 0;
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = this.OLrzqt.findFragmentByTag(strValueOf);
        C30677lff c30677lff = fragmentFindFragmentByTag instanceof C30677lff ? (C30677lff) fragmentFindFragmentByTag : null;
        if (c30677lff == null || !z) {
            return;
        }
        androidx.fragment.app.Fragment fragmentFindFragmentByTag2 = c30677lff.getChildFragmentManager().findFragmentByTag(java.lang.String.valueOf(C56524yIo.AEQbTJ(C30616leX.class).valueOf()));
        C30616leX c30616leX = fragmentFindFragmentByTag2 instanceof C30616leX ? (C30616leX) fragmentFindFragmentByTag2 : null;
        if (c30616leX == null || !C23317hvu.getNewProxyInstance()) {
            return;
        }
        c30616leX.OLrzqt(AdvancedLimitBy.Companion.KWHzl(advancedLimitBy));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: androidx.fragment.app.Fragment */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(FragmentContainerView fragmentContainerView, java.lang.String str, Function0<? extends androidx.fragment.app.Fragment> function0) {
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = this.OLrzqt.findFragmentByTag(str);
        if (fragmentFindFragmentByTag != 0 && (fragmentFindFragmentByTag instanceof InterfaceC30586ldu)) {
            if (fragmentFindFragmentByTag.isAdded() && !fragmentFindFragmentByTag.isDetached() && !fragmentFindFragmentByTag.isRemoving()) {
                ((InterfaceC30586ldu) fragmentFindFragmentByTag).KWHzl();
                return;
            } else {
                pUU.KWHzl("AdvancedFragmentsHandler", "Existing fragment is not active yet");
                return;
            }
        }
        if (fragmentFindFragmentByTag == 0 || !(fragmentFindFragmentByTag instanceof OrderAndPositionTabComponentFragment)) {
            fragmentContainerView.setVisibility(0);
            this.OLrzqt.beginTransaction().replace(fragmentContainerView.getId(), function0.invoke(), str).commitNowAllowingStateLoss();
        }
    }
}
