package o;

import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.business.dex.market.common.DexFragmentNavigator;
import com.okinc.business.dexui.main.market.MarketHomeFragment$onInvisible$1;
import com.okinc.business.dexui.main.market.MarketParams;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hOh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21841hOh extends hNU implements gLC {
    public static final Activity Companion = new Activity(null);
    public static final int djBIcL = 8;
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.hOq
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C21841hOh.copydefault(this.EZpvd);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C23274hvD.Activity.getLabel;
    }

    /* JADX INFO: renamed from: o.hOh$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hOh.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C21841hOh EZpvd(@NotNull MarketParams marketParams) {
            Intrinsics.checkNotNullParameter(marketParams, "");
            C21841hOh c21841hOh = new C21841hOh();
            android.os.Bundle bundle = new android.os.Bundle();
            C31200lpY.EZpvd(bundle, "default_trade");
            bundle.putParcelable("key.market", marketParams);
            c21841hOh.setArguments(bundle);
            return c21841hOh;
        }

        public final C21841hOh OLrzqt() {
            C21841hOh c21841hOh = new C21841hOh();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("KEY_OPEN_SCANNER", true);
            c21841hOh.setArguments(bundle);
            return c21841hOh;
        }

        public final C21841hOh OLrzqt(@NotNull java.lang.String str, java.lang.String str2, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            C21841hOh c21841hOh = new C21841hOh();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("KEY_OPEN_SMART_MONEY", true);
            bundle.putString("KEY_SMART_MONEY_MODULE_NAME", str);
            if (str2 != null) {
                bundle.putString("KEY_SMART_MONEY_SIGNAL_TAB", str2);
            }
            bundle.putBoolean("KEY_SMART_MONEY_IS_SMART_ACCOUNT", z);
            c21841hOh.setArguments(bundle);
            return c21841hOh;
        }
    }

    public final DexFragmentNavigator djBIcL() {
        return (DexFragmentNavigator) this.AhwBna.getValue();
    }

    public static final DexFragmentNavigator copydefault(C21841hOh c21841hOh) {
        return DexFragmentNavigator.Companion.copydefault(c21841hOh, C23274hvD.Application.zeUYeG);
    }

    /* JADX DEBUG: Possible override for method o.hNU.OLrzqt()V */
    @Override // o.gLC
    public DexFragmentNavigator OLrzqt() {
        return djBIcL();
    }

    @Override // o.AbstractC23346hwW, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // o.AbstractC23346hwW, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        MarketParams marketParams;
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        valueOf();
        view.post(new java.lang.Runnable() { // from class: o.hOo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C21841hOh.KWHzl(this.KWHzl);
            }
        });
        if (getChildFragmentManager().findFragmentById(C23274hvD.Application.zeUYeG) == null) {
            android.os.Bundle arguments = getArguments();
            boolean z = arguments != null ? arguments.getBoolean("KEY_OPEN_SCANNER", false) : false;
            android.os.Bundle arguments2 = getArguments();
            if (arguments2 != null && arguments2.getBoolean("KEY_OPEN_SMART_MONEY", false)) {
                android.os.Bundle arguments3 = getArguments();
                java.lang.String string = arguments3 != null ? arguments3.getString("KEY_SMART_MONEY_MODULE_NAME") : null;
                java.lang.String str = string != null ? string : "";
                android.os.Bundle arguments4 = getArguments();
                java.lang.String string2 = arguments4 != null ? arguments4.getString("KEY_SMART_MONEY_SIGNAL_TAB") : null;
                android.os.Bundle arguments5 = getArguments();
                getChildFragmentManager().beginTransaction().replace(C23274hvD.Application.zeUYeG, C29644kxY.Companion.EZpvd(str, arguments5 != null ? arguments5.getBoolean("KEY_SMART_MONEY_IS_SMART_ACCOUNT", false) : false, string2), C29644kxY.class.getName()).commit();
                return;
            }
            if (z) {
                getChildFragmentManager().beginTransaction().replace(C23274hvD.Application.zeUYeG, new C29280kqf(), C29280kqf.class.getName()).commit();
                return;
            }
            android.os.Bundle arguments6 = getArguments();
            if (arguments6 == null || (marketParams = (MarketParams) arguments6.getParcelable("key.market")) == null) {
                marketParams = (MarketParams) C31200lpY.throwIfDebug$default(new MarketParams("", null, null, 6, null), null, 2, null);
            }
            getChildFragmentManager().beginTransaction().replace(C23274hvD.Application.zeUYeG, hNW.Companion.copydefault(marketParams), hNW.class.getName()).commit();
        }
    }

    public static final void KWHzl(C21841hOh c21841hOh) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c21841hOh, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractC23346hwW, o.AbstractC32998moE
    public void onInvisible() {
        super.onInvisible();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new MarketHomeFragment$onInvisible$1(this, null), 3, null);
    }

    private final void valueOf() {
        OnBackPressedDispatcher onBackPressedDispatcher;
        FragmentActivity activity = getActivity();
        if (activity == null || (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) == null) {
            return;
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        onBackPressedDispatcher.addCallback(viewLifecycleOwner, new Application());
    }

    /* JADX INFO: renamed from: o.hOh$Application */
    public static final class Application extends OnBackPressedCallback {
        public Application() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            if (C21841hOh.this.isAdded() && C21841hOh.this.isVisible()) {
                DexFragmentNavigator dexFragmentNavigatorAEQbTJ = C27723kAz.AEQbTJ(C21841hOh.this);
                if (dexFragmentNavigatorAEQbTJ == null || dexFragmentNavigatorAEQbTJ.EZpvd()) {
                    return;
                }
                setEnabled(false);
                FragmentActivity activity = C21841hOh.this.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
                setEnabled(true);
                return;
            }
            setEnabled(false);
            FragmentActivity activity2 = C21841hOh.this.getActivity();
            if (activity2 != null) {
                activity2.onBackPressed();
            }
            setEnabled(true);
        }
    }
}
