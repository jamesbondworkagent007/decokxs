package o;

import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public class eVQ extends AbstractActivityC15827eWt {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public java.lang.String KWHzl = "DefiWalletAddressAssetDetailActivity";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public java.lang.String getTAG() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public void setTAG(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eVQ.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.eVQ$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void startActivity$default(TaskDescription taskDescription, android.content.Context context, java.lang.String str, java.util.ArrayList arrayList, long j, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                arrayList = null;
            }
            java.util.ArrayList arrayList2 = arrayList;
            if ((i & 8) != 0) {
                j = Long.MIN_VALUE;
            }
            long j2 = j;
            if ((i & 16) != 0) {
                str2 = "3";
            }
            taskDescription.KWHzl(context, str, arrayList2, j2, str2);
        }

        public final void KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, java.util.ArrayList<java.lang.Long> arrayList, long j, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) eVQ.class);
            intent.putExtra(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, str);
            intent.putExtra("chain_list", arrayList != null ? CollectionsKt___CollectionsKt.AuCTel((java.util.Collection<java.lang.Long>) arrayList) : null);
            intent.putExtra("chain_id", j);
            intent.putExtra("periodType", str2);
            context.startActivity(intent);
        }
    }

    private final java.lang.String AEQbTJ() {
        android.content.Intent intent = getIntent();
        java.lang.String stringExtra = intent != null ? intent.getStringExtra(WalletSearchRequest.SEARCH_SOURCE_ADDRESS) : null;
        return stringExtra == null ? "" : stringExtra;
    }

    private final java.util.List<java.lang.Long> AhwBna() {
        long[] longArrayExtra;
        java.util.List<java.lang.Long> listOLrzqt;
        android.content.Intent intent = getIntent();
        return (intent == null || (longArrayExtra = intent.getLongArrayExtra("chain_list")) == null || (listOLrzqt = yDV.OLrzqt(longArrayExtra)) == null) ? yDY.AhwBna() : listOLrzqt;
    }

    private final long valueOf() {
        android.content.Intent intent = getIntent();
        if (intent != null) {
            return intent.getLongExtra("chain_id", Long.MIN_VALUE);
        }
        return Long.MIN_VALUE;
    }

    private final java.lang.String djBIcL() {
        java.lang.String stringExtra;
        android.content.Intent intent = getIntent();
        return (intent == null || (stringExtra = intent.getStringExtra("periodType")) == null) ? "3" : stringExtra;
    }

    @Override // o.AbstractActivityC15827eWt, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C13754dXa.TaskDescription.OxVOHk);
        C33516mxt.EZpvd(this);
        if (AEQbTJ().length() == 0) {
            finish();
            return;
        }
        if (bundle == null) {
            androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction();
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
            fragmentTransactionBeginTransaction.replace(C13754dXa.ActionBar.XW, eVR.Companion.EZpvd(AEQbTJ(), new java.util.ArrayList<>(AhwBna()), valueOf(), djBIcL()));
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        }
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.eVS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                eVQ.EZpvd(this.KWHzl);
            }
        });
    }

    public static final void EZpvd(eVQ evq) {
        rVN.reportFullyDrawn$default((android.app.Activity) evq, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractActivityC15827eWt, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC15827eWt, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC15827eWt, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC15827eWt, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
