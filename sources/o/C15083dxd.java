package o;

import androidx.databinding.DataBindingUtil;
import com.immomo.mls.InitData;
import com.okinc.business.defi.dapp.bridge.DappBridge;
import com.okinc.rxutils.RxBus;
import com.okinc.rxutils.SubHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.dLX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dxd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C15083dxd extends AbstractC14833dss {
    public java.lang.String AkhnZx;
    public AbstractC13468dMl djBIcL;
    public boolean valueOf;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;
    public java.lang.String AhwBna = "";
    public int copydefault = -1;
    public final java.lang.Object AYXKKw = new java.lang.Object();
    public final java.lang.String KWHzl = "DAppNewHome.lua";
    public final int gEmmrt = dLX.Fragment.valueOf;
    public C58216yxB OLrzqt = new C58216yxB();

    @Override // o.InterfaceC15111dyE
    public boolean az_() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43061riF
    public java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.gEmmrt;
    }

    @Override // o.AbstractC43061riF
    public android.view.ViewGroup EZpvd() {
        AbstractC13468dMl abstractC13468dMl = this.djBIcL;
        Intrinsics.copydefault(abstractC13468dMl);
        android.widget.FrameLayout frameLayout = abstractC13468dMl.KWHzl;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        copydefault(false);
    }

    @Override // o.AbstractC14833dss, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        copydefault(true);
        this.OLrzqt.dispose();
        SubHelper.AEQbTJ(this.AYXKKw);
    }

    @Override // o.AbstractC43061riF, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String string;
        super.onCreate(bundle);
        C15142dyj c15142dyj = C15142dyj.EZpvd;
        if (c15142dyj.KWHzl().isEmpty()) {
            C15142dyj.getRegexJson$default(c15142dyj, null, 1, null);
        }
        C33054mpH.copydefault(this);
        android.os.Bundle arguments = getArguments();
        this.valueOf = arguments != null ? arguments.getBoolean("showBottomNavigationView", false) : false;
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 == null || (string = arguments2.getString("rootPage")) == null) {
            string = "";
        }
        this.AhwBna = string;
        android.os.Bundle arguments3 = getArguments();
        this.copydefault = arguments3 != null ? arguments3.getInt("dappDefaultCategory") : -1;
        android.os.Bundle arguments4 = getArguments();
        this.AkhnZx = arguments4 != null ? arguments4.getString("source") : null;
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ(DappBridge.EVENT_KEY_CLOSE_DAPP_NEW_HOME_PAGE);
        final Function1 function1 = new Function1() { // from class: o.dxc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15083dxd.KWHzl(this.EZpvd, (java.lang.String) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58227yxM() { // from class: o.dxe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C15083dxd.AEQbTJ(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        yBK.EZpvd(interfaceC58217yxCAEQbTJ, this.OLrzqt);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C15083dxd c15083dxd, java.lang.String str) {
        c15083dxd.requireActivity().onBackPressed();
        c15083dxd.copydefault(true);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        android.view.View root;
        Intrinsics.checkNotNullParameter(view, "");
        AbstractC13468dMl abstractC13468dMl = (AbstractC13468dMl) DataBindingUtil.bind(view);
        this.djBIcL = abstractC13468dMl;
        if (abstractC13468dMl == null || (root = abstractC13468dMl.getRoot()) == null) {
            return;
        }
        root.setContentDescription("web3_discover_luahome_page_new");
    }

    @Override // o.AbstractC43061riF
    public InitData OLrzqt() {
        return C43056riA.createInitDataForMiniApp$default(C43056riA.AEQbTJ, "okluadiscover", "/dappHomeList", null, 4, null);
    }

    @Override // o.AbstractC43061riF
    public java.util.HashMap<java.lang.String, java.lang.Object> AEQbTJ() {
        java.util.HashMap<java.lang.String, java.lang.Object> map = new java.util.HashMap<>();
        map.put("rootPage", this.AhwBna);
        map.put("dappDefaultCategory", java.lang.Integer.valueOf(this.copydefault));
        java.lang.String str = this.AkhnZx;
        if (str != null) {
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                map.put("source", str);
            }
        }
        return map;
    }

    @Override // o.AbstractC14833dss, o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        copydefault(false);
    }

    @Override // o.AbstractC14833dss, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            return;
        }
        copydefault(false);
    }

    /* JADX INFO: renamed from: o.dxd$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dxd.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static /* synthetic */ C15083dxd newInstance$default(Activity activity, java.lang.String str, int i, java.lang.String str2, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = null;
            }
            if ((i2 & 2) != 0) {
                i = -1;
            }
            return activity.AEQbTJ(str, i, str2);
        }

        public final C15083dxd AEQbTJ(java.lang.String str, int i, java.lang.String str2) {
            C15083dxd c15083dxd = new C15083dxd();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("rootPage", str);
            bundle.putInt("dappDefaultCategory", i);
            if (str2 != null) {
                bundle.putString("source", str2);
            }
            c15083dxd.setArguments(bundle);
            return c15083dxd;
        }
    }

    private final void copydefault(boolean z) {
        ((xWN) C43251rlk.copydefault(xWN.class)).EZpvd(z);
    }
}
