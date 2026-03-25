package o;

import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.buysell.api.BuySellOrderHistoryDetailParameters;
import com.okinc.buysell.api.BuySellTradeType;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import o.lIN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class lIJ extends lIV<AbstractC31409ltV> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public BuySellOrderHistoryDetailParameters copydefault;

    @Override // o.AbstractActivityC31906mIh
    public void EZpvd() {
    }

    public lIJ() {
        super(C31351lsQ.ActionBar.KWHzl);
        final Function0 function0 = null;
        this.AEQbTJ = new ViewModelLazy(C56524yIo.AEQbTJ(lIP.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.buysellconvert.transaction.buysell.BuySellOrderDetailActivityV2$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.buysellconvert.transaction.buysell.BuySellOrderDetailActivityV2$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.buysellconvert.transaction.buysell.BuySellOrderDetailActivityV2$special$$inlined$viewModels$default$3
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

    /* JADX DEBUG: Method merged with bridge method: OLrzqt()Lo/mJo; */
    /* JADX DEBUG: Possible override for method o.lIV.AEQbTJ()V */
    @Override // o.AbstractActivityC31906mIh
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public lIP OLrzqt() {
        return (lIP) this.AEQbTJ.getValue();
    }

    @Override // o.AbstractActivityC31906mIh
    public void AEQbTJ(@NotNull android.content.Intent intent, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(intent, "");
        BuySellOrderHistoryDetailParameters buySellOrderHistoryDetailParameters = (BuySellOrderHistoryDetailParameters) intent.getParcelableExtra("BUY_SELL_ORDER_DETAIL_PARAMS");
        if (buySellOrderHistoryDetailParameters == null) {
            buySellOrderHistoryDetailParameters = new BuySellOrderHistoryDetailParameters(BuySellTradeType.BUY, "", false, "");
        }
        this.copydefault = buySellOrderHistoryDetailParameters;
    }

    @Override // o.AbstractActivityC31906mIh
    public void KWHzl() {
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        int i = C31351lsQ.Application.OxVOHk;
        lIN.Activity activity = lIN.Companion;
        BuySellOrderHistoryDetailParameters buySellOrderHistoryDetailParameters = this.copydefault;
        if (buySellOrderHistoryDetailParameters == null) {
            Intrinsics.gEmmrt("");
            buySellOrderHistoryDetailParameters = null;
        }
        fragmentTransactionBeginTransaction.replace(i, activity.AEQbTJ(buySellOrderHistoryDetailParameters)).commitAllowingStateLoss();
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lIJ.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // o.lIV, o.AbstractActivityC31906mIh, o.AbstractActivityC33009moP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.lIV, o.AbstractActivityC31906mIh, o.AbstractActivityC33009moP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.lIV, o.AbstractActivityC31906mIh, o.AbstractActivityC33009moP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.lIV, o.AbstractActivityC31906mIh, o.AbstractActivityC33009moP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // o.lIV, o.AbstractActivityC31906mIh, o.AbstractActivityC33009moP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }
}
