package o;

import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.TitleModuleModel;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gda, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class ActivityC20262gda extends AbstractActivityC17933fXr {
    public static final TaskDescription Companion = new TaskDescription(null);

    /* JADX INFO: renamed from: o.gda$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gda.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ android.content.Intent getIntent$default(TaskDescription taskDescription, android.content.Context context, OKWBaseTransaction oKWBaseTransaction, boolean z, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                z = true;
            }
            return taskDescription.KWHzl(context, oKWBaseTransaction, z);
        }

        public final android.content.Intent KWHzl(@NotNull android.content.Context context, @NotNull OKWBaseTransaction<?> oKWBaseTransaction, boolean z) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(oKWBaseTransaction, "");
            android.content.Intent intentAEQbTJ = AbstractActivityC17933fXr.Companion.AEQbTJ(oKWBaseTransaction);
            intentAEQbTJ.putExtra("firstOpen", z);
            intentAEQbTJ.setClass(context, ActivityC20262gda.class);
            return intentAEQbTJ;
        }

        public static /* synthetic */ android.content.Intent getIntent$default(TaskDescription taskDescription, android.content.Context context, OKWBaseTransaction oKWBaseTransaction, int i, TitleModuleModel titleModuleModel, boolean z, int i2, java.lang.Object obj) {
            if ((i2 & 8) != 0) {
                titleModuleModel = null;
            }
            TitleModuleModel titleModuleModel2 = titleModuleModel;
            if ((i2 & 16) != 0) {
                z = true;
            }
            return taskDescription.EZpvd(context, oKWBaseTransaction, i, titleModuleModel2, z);
        }

        public final android.content.Intent EZpvd(@NotNull android.content.Context context, @NotNull OKWBaseTransaction<?> oKWBaseTransaction, int i, TitleModuleModel titleModuleModel, boolean z) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(oKWBaseTransaction, "");
            android.content.Intent intentAEQbTJ = AbstractActivityC17933fXr.Companion.AEQbTJ(oKWBaseTransaction);
            intentAEQbTJ.putExtra("firstOpen", z);
            intentAEQbTJ.putExtra("index", i);
            intentAEQbTJ.putExtra("tx_title", titleModuleModel != null ? titleModuleModel.getData() : null);
            intentAEQbTJ.setClass(context, ActivityC20262gda.class);
            return intentAEQbTJ;
        }
    }

    @Override // o.AbstractActivityC17933fXr, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
    }

    @Override // o.AbstractActivityC17933fXr
    public void AEQbTJ(@NotNull OKWBaseTransaction<?> oKWBaseTransaction) {
        androidx.fragment.app.Fragment c20264gdc;
        Intrinsics.checkNotNullParameter(oKWBaseTransaction, "");
        if (oKWBaseTransaction instanceof InterfaceC9730bbB) {
            androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
            int i = C13754dXa.ActionBar.DfrfUJ;
            if (oKWBaseTransaction.dUDNAs().getFieldNames()) {
                c20264gdc = new C20188gcF();
            } else if (oKWBaseTransaction.zblBkD()) {
                if ((oKWBaseTransaction instanceof C8972bMm) && ((C8972bMm) oKWBaseTransaction).heceqZ()) {
                    c20264gdc = new C20265gdd();
                } else {
                    c20264gdc = new C20267gdf();
                }
            } else {
                c20264gdc = new C20264gdc();
            }
            c20264gdc.setArguments(getIntent().getExtras());
            Unit unit = Unit.INSTANCE;
            fragmentTransactionBeginTransaction.replace(i, c20264gdc).commitAllowingStateLoss();
        }
    }

    public final boolean AkhnZx() {
        return getIntent().getBooleanExtra("firstOpen", true);
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // o.AbstractActivityC17933fXr, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC17933fXr, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC17933fXr, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC17933fXr, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
