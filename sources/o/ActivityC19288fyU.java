package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.BundleKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.account.api.model.wallet.BoundWalletAccountsResult;
import com.okinc.business.defi.wallet.mine.walletbind.WalletBindActivity$onCreate$2;
import com.okinc.business.defi.wallet.mine.walletbind.viewmodel.WalletBindViewModel;
import com.okinc.web.WebActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C13754dXa;
import o.C55284xgz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fyU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC19288fyU extends AbstractActivityC19308fyo {
    public final InterfaceC56387yDm valueOf;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    @Override // o.AbstractActivityC33041mov, o.InterfaceC33507mxk
    public boolean needChangeUpDownColor() {
        return false;
    }

    public ActivityC19288fyU() {
        final Function0 function0 = null;
        this.valueOf = new ViewModelLazy(C56524yIo.AEQbTJ(WalletBindViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.mine.walletbind.WalletBindActivity$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.mine.walletbind.WalletBindActivity$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.mine.walletbind.WalletBindActivity$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WalletBindViewModel KWHzl() {
        return (WalletBindViewModel) this.valueOf.getValue();
    }

    @Override // o.AbstractActivityC19308fyo, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C13754dXa.TaskDescription.OHqIaq);
        C33537myN c33537myN = (C33537myN) findViewById(C13754dXa.ActionBar.accept);
        if (c33537myN != null) {
            c33537myN.setSubDoListener(new View.OnClickListener() { // from class: o.fyR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC19288fyU.OLrzqt(this.KWHzl, view);
                }
            });
        }
        if (bundle == null) {
            KWHzl(KWHzl().fARcdN());
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new WalletBindActivity$onCreate$2(this, null), 3, null);
        }
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.fyZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC19288fyU.KWHzl(this.AEQbTJ);
            }
        });
    }

    public static final void OLrzqt(ActivityC19288fyU activityC19288fyU, android.view.View view) {
        activityC19288fyU.KWHzl().AuCTelauCTel();
        WebActivity.TaskDescription.openPage$default(WebActivity.Companion, activityC19288fyU, BundleKt.bundleOf(C56390yDp.OLrzqt("url", activityC19288fyU.getString(C13754dXa.FragmentManager.onProviderDisabled))), null, 4, null);
    }

    public static final void KWHzl(ActivityC19288fyU activityC19288fyU) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC19288fyU, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(boolean z) {
        if (z) {
            androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction();
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction.replace(C13754dXa.ActionBar.XW, C19352fzf.class, null, null), "");
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
            return;
        }
        androidx.fragment.app.FragmentManager supportFragmentManager2 = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction2 = supportFragmentManager2.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction2, "");
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction2.replace(C13754dXa.ActionBar.XW, C19365fzs.class, null, null), "");
        fragmentTransactionBeginTransaction2.commitAllowingStateLoss();
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@NotNull android.content.Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        super.onNewIntent(intent);
        if (intent.getBooleanExtra("KEY_SHOW_BIND_SUCCESS", false)) {
            KWHzl(false);
            C55284xgz.Activity activity = C55284xgz.Companion;
            android.view.View viewFindViewById = findViewById(C13754dXa.ActionBar.accept);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            C55284xgz c55284xgzKWHzl = activity.KWHzl(viewFindViewById, C33070mpX.AYXKKw(C13754dXa.FragmentManager.OcIXYQ));
            C55284xgz c55284xgzIsConnected = c55284xgzKWHzl != null ? c55284xgzKWHzl.isConnected(3) : null;
            android.view.View viewAkhnZx = c55284xgzIsConnected != null ? c55284xgzIsConnected.AkhnZx() : null;
            if (viewAkhnZx != null) {
                ViewGroup.LayoutParams layoutParams = viewAkhnZx.getLayoutParams();
                Intrinsics.copydefault(layoutParams, "");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, C55298xhM.dpInt$default(80, (android.content.Context) null, 1, (java.lang.Object) null));
                viewAkhnZx.setLayoutParams(marginLayoutParams);
            }
            if (c55284xgzIsConnected != null) {
                c55284xgzIsConnected.hDKMBd();
            }
        }
    }

    /* JADX INFO: renamed from: o.fyU$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fyU.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final void AEQbTJ(@NotNull android.content.Context context, @NotNull BoundWalletAccountsResult boundWalletAccountsResult, boolean z) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(boundWalletAccountsResult, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC19288fyU.class);
            intent.putExtra("BOUND_WALLET_RESULT", boundWalletAccountsResult);
            intent.putExtra("KEY_SHOW_BIND_SUCCESS", z);
            context.startActivity(intent);
        }
    }

    @Override // o.AbstractActivityC19308fyo, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC19308fyo, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC19308fyo, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC19308fyo, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
