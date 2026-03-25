package o;

import com.immomo.mls.InitData;
import com.okinc.rxutils.RxBus;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.dLX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dtR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14859dtR extends AbstractC43061riF {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final int AEQbTJ = dLX.Fragment.djBIcL;
    public java.lang.String AhwBna = "";
    public AbstractC13469dMm EZpvd;
    public boolean KWHzl;
    public InterfaceC58217yxC OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43061riF
    public java.lang.String copydefault() {
        return "DAppTabWalletHome.lua";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
    }

    /* JADX INFO: renamed from: o.dtR$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dtR.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ C14859dtR newInstance$default(StateListAnimator stateListAnimator, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return stateListAnimator.AEQbTJ(str, z);
        }

        public final C14859dtR AEQbTJ(java.lang.String str, boolean z) {
            C14859dtR c14859dtR = new C14859dtR();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("rootPage", str);
            bundle.putBoolean("isRootPage", z);
            c14859dtR.setArguments(bundle);
            return c14859dtR;
        }
    }

    @Override // o.AbstractC43061riF
    public android.view.ViewGroup EZpvd() {
        AbstractC13469dMm abstractC13469dMm = this.EZpvd;
        if (abstractC13469dMm != null) {
            return abstractC13469dMm.copydefault;
        }
        return null;
    }

    @Override // o.AbstractC43061riF
    public java.util.HashMap<java.lang.String, java.lang.Object> AEQbTJ() {
        return C56424yEw.AYXKKw(C56390yDp.OLrzqt("appearance", "alternativeweb3"), C56390yDp.OLrzqt("rootPage", this.AhwBna));
    }

    @Override // o.AbstractC43061riF, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String string;
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("rootPage")) == null) {
            string = "";
        }
        this.AhwBna = string;
        android.os.Bundle arguments2 = getArguments();
        this.KWHzl = arguments2 != null ? arguments2.getBoolean("isRootPage") : false;
        if (bundle == null || !C33129mqd.OLrzqt((java.lang.CharSequence) this.AhwBna)) {
            return;
        }
        C15148dyp c15148dyp = C15148dyp.copydefault;
        java.lang.String str = this.AhwBna;
        androidx.fragment.app.Fragment parentFragment = getParentFragment();
        C15148dyp.storeFragmentData$default(c15148dyp, str, parentFragment != null ? parentFragment.getParentFragmentManager() : null, null, null, null, 28, null);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        AbstractC13469dMm abstractC13469dMmAEQbTJ = AbstractC13469dMm.AEQbTJ(getLayoutInflater(), viewGroup, false);
        this.EZpvd = abstractC13469dMmAEQbTJ;
        if (abstractC13469dMmAEQbTJ != null) {
            return abstractC13469dMmAEQbTJ.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("changedWallet");
        final Function1 function1 = new Function1() { // from class: o.dtU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14859dtR.copydefault(this.AEQbTJ, (java.lang.String) obj);
            }
        };
        this.OLrzqt = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58227yxM() { // from class: o.dtT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14859dtR.AEQbTJ(function1, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C14859dtR c14859dtR, java.lang.String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("canRefreshAll", java.lang.Boolean.TRUE);
        c14859dtR.KWHzl("RefreshDAppTabAfterWalletChanged", linkedHashMap);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC43061riF
    public InitData OLrzqt() {
        return C43056riA.createInitDataForMiniApp$default(C43056riA.AEQbTJ, "okluadiscover", "/dappTabWalletHome", null, 4, null);
    }

    @Override // o.AbstractC32996moC, o.InterfaceC33016moW
    public boolean onRefresh(@NotNull java.lang.Object obj, @NotNull InterfaceC33014moU interfaceC33014moU) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(interfaceC33014moU, "");
        java.lang.Boolean bool = obj instanceof java.lang.Boolean ? (java.lang.Boolean) obj : null;
        if (bool != null && bool.booleanValue()) {
            AEQbTJ(false);
        }
        return super.onRefresh(obj, interfaceC33014moU);
    }

    public final void AEQbTJ(boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("canRefresh", java.lang.Boolean.TRUE);
        linkedHashMap.put("allRefresh", java.lang.Boolean.valueOf(z));
        KWHzl("DAppTabRefresh", linkedHashMap);
    }

    public final void KWHzl(java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        InterfaceC7298ahG interfaceC7298ahGKWHzl = C7323ahf.KWHzl();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        if (interfaceC7298ahGKWHzl != null) {
            interfaceC7298ahGKWHzl.AEQbTJ(str, null, linkedHashMap);
        }
    }

    @Override // o.AbstractC43061riF, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        InterfaceC58217yxC interfaceC58217yxC = this.OLrzqt;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }
}
