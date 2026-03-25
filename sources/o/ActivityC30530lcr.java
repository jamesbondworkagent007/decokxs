package o;

import androidx.core.content.IntentCompat;
import com.okinc.business.dexui.main.shared.model.TradeMode;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageViewParam;
import com.okinc.business.trade.features.home.ui.advanced.swap.slippage.AdvanceSlippageParams;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;

/* JADX INFO: renamed from: o.lcr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class ActivityC30530lcr extends AbstractActivityC30491lcE {
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.lcA
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC30530lcr.AYXKKw(this.KWHzl);
        }
    });
    public final InterfaceC56387yDm KWHzl = C31200lpY.getSourceType$default((android.app.Activity) this, false, 1, (java.lang.Object) null);
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.lcz
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC30530lcr.copydefault(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.lcw
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC30530lcr.djBIcL(this.EZpvd);
        }
    });

    /* JADX INFO: renamed from: o.lcr$Activity */
    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TradeMode.values().length];
            try {
                iArr[TradeMode.Bridge.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TradeMode.SwapMarket.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
        }
    }

    public static final C21606hFp AYXKKw(ActivityC30530lcr activityC30530lcr) {
        return C21606hFp.AEQbTJ(activityC30530lcr.getLayoutInflater());
    }

    /* JADX DEBUG: Possible override for method o.lcE.AEQbTJ()V */
    public final C21606hFp AEQbTJ() {
        return (C21606hFp) this.copydefault.getValue();
    }

    private final java.lang.String valueOf() {
        return (java.lang.String) this.KWHzl.getValue();
    }

    private final AdvanceSlippageParams AhwBna() {
        return (AdvanceSlippageParams) this.AEQbTJ.getValue();
    }

    public static final AdvanceSlippageParams copydefault(ActivityC30530lcr activityC30530lcr) {
        android.content.Intent intent = activityC30530lcr.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "");
        return (AdvanceSlippageParams) ((android.os.Parcelable) IntentCompat.getParcelableExtra(intent, "data", AdvanceSlippageParams.class));
    }

    /* JADX DEBUG: Possible override for method o.lcE.OLrzqt()V */
    public final java.lang.String OLrzqt() {
        return (java.lang.String) this.OLrzqt.getValue();
    }

    public static final java.lang.String djBIcL(ActivityC30530lcr activityC30530lcr) {
        java.lang.String stringExtra = activityC30530lcr.getIntent().getStringExtra("slipPage");
        return stringExtra == null ? "" : stringExtra;
    }

    @Override // o.AbstractActivityC30491lcE, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(AEQbTJ().getRoot());
        gEmmrt();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.lcv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC30530lcr.AhwBna(this.AEQbTJ);
            }
        });
    }

    public static final void AhwBna(ActivityC30530lcr activityC30530lcr) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC30530lcr, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void gEmmrt() {
        androidx.fragment.app.Fragment fragmentAEQbTJ;
        SlippageViewParam slippageViewParamAEQbTJ;
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        int i = C23274hvD.Application.QWpYiD;
        AdvanceSlippageParams advanceSlippageParamsAhwBna = AhwBna();
        TradeMode tradeModeOLrzqt = (advanceSlippageParamsAhwBna == null || (slippageViewParamAEQbTJ = advanceSlippageParamsAhwBna.AEQbTJ()) == null) ? null : slippageViewParamAEQbTJ.OLrzqt();
        int i2 = tradeModeOLrzqt == null ? -1 : Activity.OLrzqt[tradeModeOLrzqt.ordinal()];
        if (i2 == 1 || i2 == 2) {
            fragmentAEQbTJ = C30525lcm.Companion.AEQbTJ(valueOf(), AhwBna());
        } else {
            fragmentAEQbTJ = C30515lcc.Companion.KWHzl(valueOf(), AhwBna(), OLrzqt());
        }
        fragmentTransactionBeginTransaction.replace(i, fragmentAEQbTJ).commitAllowingStateLoss();
        AEQbTJ().EZpvd.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.alsFma));
    }

    @Override // o.AbstractActivityC30491lcE, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC30491lcE, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC30491lcE, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC30491lcE, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
