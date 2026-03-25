package o;

import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.business.defi.wallet.bean.SelectedNetworkData;
import com.okinc.business.defi.wallet.home.ChooseNetworkActivity$onNetworkSelected$1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C10614brl;
import o.C13754dXa;
import o.C18082fbg;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eLT extends AbstractActivityC33013moT implements C18082fbg.Activity {
    public static final TaskDescription Companion = new TaskDescription(null);

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C13754dXa.TaskDescription.OxVOHk);
        if (bundle == null) {
            boolean booleanExtra = getIntent().getBooleanExtra("showTotalAsset", true);
            long longExtra = getIntent().getLongExtra("chain_id", Long.MIN_VALUE);
            androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction();
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
            fragmentTransactionBeginTransaction.replace(C13754dXa.ActionBar.XW, C18006faJ.Companion.OLrzqt(longExtra, booleanExtra));
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        }
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.eLZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                eLT.KWHzl(this.AEQbTJ);
            }
        });
    }

    public static final void KWHzl(eLT elt) {
        rVN.reportFullyDrawn$default((android.app.Activity) elt, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.C18082fbg.Activity
    public void copydefault(@NotNull SelectedNetworkData selectedNetworkData) {
        Intrinsics.checkNotNullParameter(selectedNetworkData, "");
        if (!getIntent().getBooleanExtra("showTotalAsset", true)) {
            finish();
            return;
        }
        if (selectedNetworkData.valueOf().length() == 0) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ChooseNetworkActivity$onNetworkSelected$1(selectedNetworkData, this, null), 3, null);
            return;
        }
        if (selectedNetworkData.copydefault() == Long.MIN_VALUE) {
            C10614brl.TaskDescription.getInstance$default(C10614brl.Companion, null, 1, null).copydefault(selectedNetworkData.valueOf());
        } else {
            C10614brl instance$default = C10614brl.TaskDescription.getInstance$default(C10614brl.Companion, null, 1, null);
            java.lang.String strValueOf = selectedNetworkData.valueOf();
            long jCopydefault = selectedNetworkData.copydefault();
            long jKWHzl = selectedNetworkData.KWHzl();
            instance$default.KWHzl(strValueOf, java.lang.String.valueOf(jCopydefault), java.lang.String.valueOf(jKWHzl), selectedNetworkData.AhwBna(), selectedNetworkData.EZpvd(), selectedNetworkData.AEQbTJ());
        }
        finish();
    }

    @Override // o.AbstractActivityC33041mov
    public void addConfig() {
        super.addConfig();
        C33494mxX.copydefault.EZpvd(this, C52761wXj.Activity.copydefault);
        C33567myr.AEQbTJ(this, C52761wXj.Activity.copydefault);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eLT.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ void startActivity$default(TaskDescription taskDescription, android.content.Context context, long j, boolean z, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                j = Long.MIN_VALUE;
            }
            if ((i & 4) != 0) {
                z = true;
            }
            taskDescription.copydefault(context, j, z);
        }

        public final void copydefault(@NotNull android.content.Context context, long j, boolean z) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) eLT.class);
            intent.putExtra("chain_id", j);
            intent.putExtra("showTotalAsset", z);
            context.startActivity(intent);
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
