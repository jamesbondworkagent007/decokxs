package o;

import androidx.core.app.FrameMetricsAggregator;
import com.okinc.business.dex.api.bean.SignalTabApi;
import com.okinc.business.market.features.smart_money.ranking.domain.model.SmartMoneyConfig;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C29542kvc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kxY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29644kxY extends AbstractC29641kxV<C21605hFo> {
    public static final Application Companion = new Application(null);
    public static final int gEmmrt = 8;
    public boolean AYXKKw;
    public java.lang.String AhwBna;
    public java.lang.String djBIcL;

    /* JADX INFO: renamed from: o.kxY$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kxY.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ C29644kxY newInstance$default(Application application, java.lang.String str, boolean z, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            return application.EZpvd(str, z, str2);
        }

        public final C29644kxY EZpvd(@NotNull java.lang.String str, boolean z, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            C29644kxY c29644kxY = new C29644kxY();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("module_name_english", str);
            bundle.putBoolean("isSmartAccount", z);
            if (str2 != null) {
                bundle.putString("param_signal_tab", str2);
            }
            c29644kxY.setArguments(bundle);
            return c29644kxY;
        }
    }

    @Override // o.AbstractC21846hOm, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String string;
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("module_name_english")) == null) {
            string = "--";
        }
        this.djBIcL = string;
        android.os.Bundle arguments2 = getArguments();
        this.AYXKKw = arguments2 != null ? arguments2.getBoolean("isSmartAccount", false) : false;
        android.os.Bundle arguments3 = getArguments();
        this.AhwBna = arguments3 != null ? arguments3.getString("param_signal_tab") : null;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC21846hOm
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C21605hFo KWHzl(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C21605hFo c21605hFoOLrzqt = C21605hFo.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21605hFoOLrzqt, "");
        return c21605hFoOLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.AbstractC21846hOm
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull C21605hFo c21605hFo, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(c21605hFo, "");
        C31197lpV c31197lpV = C31197lpV.EZpvd;
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c31197lpV.EZpvd(childFragmentManager, c21605hFo.copydefault.getId(), "tag.signal_fragment", new Function0() { // from class: o.kyf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29644kxY.AEQbTJ(this.EZpvd);
            }
        });
        c21605hFo.getRoot().post(new java.lang.Runnable() { // from class: o.kyg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C29644kxY.OLrzqt(this.AEQbTJ);
            }
        });
    }

    public static final androidx.fragment.app.Fragment AEQbTJ(C29644kxY c29644kxY) {
        C29542kvc.Application application = C29542kvc.Companion;
        SmartMoneyConfig smartMoneyConfig = new SmartMoneyConfig(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
        java.lang.String str = c29644kxY.djBIcL;
        if (str == null) {
            Intrinsics.gEmmrt("");
            str = null;
        }
        boolean z = c29644kxY.AYXKKw;
        java.lang.String tabValue = c29644kxY.AhwBna;
        if (tabValue == null) {
            tabValue = SignalTabApi.GEMS.getTabValue();
        }
        return application.OLrzqt(smartMoneyConfig, str, z, tabValue);
    }

    public static final void OLrzqt(C29644kxY c29644kxY) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c29644kxY, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractC21846hOm, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        ((xWN) C43251rlk.copydefault(xWN.class)).EZpvd(false);
        ((xWN) C43251rlk.copydefault(xWN.class)).KWHzl(false);
    }
}
