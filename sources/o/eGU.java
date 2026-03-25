package o;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.wallet.hardware.bluetooth.HardwareWalletBluetoothDelegate;
import com.okinc.business.defi.wallet.hardware.onekey.HardwareWalletOneKeyScanningActivity$onCreate$1;
import com.okinc.business.defi.wallet.hardware.onekey.HardwareWalletOneKeyScanningActivity$onCreate$2;
import com.okinc.business.defi.wallet.hardware.onekey.HardwareWalletOneKeyScanningViewModel;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.wallet.hardware.api.onekey.OneKeyConnectedDevice;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.ActivityC15412eHj;
import o.C13754dXa;
import o.C15433eId;
import o.InterfaceC15415eHm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eGU extends AbstractActivityC15409eHg implements C15433eId.StateListAnimator {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public C16378eim AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public final ActivityResultLauncher<ActivityC15412eHj.StateListAnimator> KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final C43316rmw copydefault;

    public eGU() {
        final Function0 function0 = null;
        this.AYXKKw = new ViewModelLazy(C56524yIo.AEQbTJ(HardwareWalletOneKeyScanningViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.hardware.onekey.HardwareWalletOneKeyScanningActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.hardware.onekey.HardwareWalletOneKeyScanningActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.hardware.onekey.HardwareWalletOneKeyScanningActivity$special$$inlined$viewModels$default$3
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
        C43316rmw c43316rmw = new C43316rmw();
        c43316rmw.register(eFO.class, new C15385eGj(C13754dXa.TaskDescription.hwXsuq, new Function1() { // from class: o.eGV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eGU.copydefault(this.copydefault, (eFO) obj);
            }
        }));
        this.copydefault = c43316rmw;
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.eGT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return eGU.EZpvd();
            }
        });
        ActivityResultLauncher<ActivityC15412eHj.StateListAnimator> activityResultLauncherRegisterForActivityResult = registerForActivityResult(ActivityC15412eHj.Application.AEQbTJ, new ActivityResultCallback() { // from class: o.eHc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                eGU.AEQbTJ(this.OLrzqt, (ActivityC15412eHj.ActionBar) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.KWHzl = activityResultLauncherRegisterForActivityResult;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eGU.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static final class TaskDescription extends ActivityResultContract<java.lang.Integer, java.lang.Boolean> {
        public static final TaskDescription copydefault = new TaskDescription();

        private TaskDescription() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.content.Context, java.lang.Object] */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* synthetic */ android.content.Intent createIntent(android.content.Context context, java.lang.Integer num) {
            return AEQbTJ(context, num.intValue());
        }

        public android.content.Intent AEQbTJ(@NotNull android.content.Context context, int i) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intentPutExtra = new android.content.Intent(context, (java.lang.Class<?>) eGU.class).putExtra(OtcExtraKeys.MODE, i);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            return intentPutExtra;
        }

        /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public java.lang.Boolean parseResult(int i, android.content.Intent intent) {
            return java.lang.Boolean.valueOf(i == -1);
        }
    }

    private final int AkhnZx() {
        android.content.Intent intent = getIntent();
        if (intent != null) {
            return intent.getIntExtra(OtcExtraKeys.MODE, 1);
        }
        return 1;
    }

    public final HardwareWalletOneKeyScanningViewModel gEmmrt() {
        return (HardwareWalletOneKeyScanningViewModel) this.AYXKKw.getValue();
    }

    public static final Unit copydefault(eGU egu, eFO efo) {
        Intrinsics.checkNotNullParameter(efo, "");
        egu.gEmmrt().EZpvd();
        C15433eId.Companion.copydefault(efo.AEQbTJ().getConnectId()).show(egu.getSupportFragmentManager(), "CheckWalletAddedDialog");
        return Unit.INSTANCE;
    }

    public static final HardwareWalletBluetoothDelegate EZpvd() {
        return new HardwareWalletBluetoothDelegate();
    }

    public final HardwareWalletBluetoothDelegate valueOf() {
        return (HardwareWalletBluetoothDelegate) this.OLrzqt.getValue();
    }

    public final InterfaceC57001yaF AhwBna() {
        return (InterfaceC57001yaF) C43251rlk.copydefault(InterfaceC57001yaF.class);
    }

    public static final void AEQbTJ(eGU egu, ActivityC15412eHj.ActionBar actionBar) {
        if (Intrinsics.EZpvd(actionBar, ActivityC15412eHj.ActionBar.StateListAnimator.AEQbTJ)) {
            egu.setResult(-1);
            egu.finish();
        } else {
            if (Intrinsics.EZpvd(actionBar, ActivityC15412eHj.ActionBar.Application.copydefault)) {
                return;
            }
            if (!(actionBar instanceof ActivityC15412eHj.ActionBar.C0833ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            C15406eHd.KWHzl(egu, ((ActivityC15412eHj.ActionBar.C0833ActionBar) actionBar).copydefault());
        }
    }

    @Override // o.AbstractActivityC15409eHg, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C16378eim c16378eimOLrzqt = C16378eim.OLrzqt(getLayoutInflater());
        this.AEQbTJ = c16378eimOLrzqt;
        if (c16378eimOLrzqt == null) {
            Intrinsics.gEmmrt("");
            c16378eimOLrzqt = null;
        }
        setContentView(c16378eimOLrzqt.getRoot());
        if (!AhwBna().copydefault()) {
            C55328xhq.show$default(C55328xhq.OLrzqt, java.lang.Integer.valueOf(C13754dXa.FragmentManager.MediaSessionCompatApi24), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
            finish();
            return;
        }
        if (!C57026yae.copydefault.OLrzqt(this)) {
            C55328xhq.show$default(C55328xhq.OLrzqt, java.lang.Integer.valueOf(C13754dXa.FragmentManager.getQueueItem), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
            finish();
            return;
        }
        getLifecycle().addObserver(valueOf());
        C16378eim c16378eim = this.AEQbTJ;
        if (c16378eim == null) {
            Intrinsics.gEmmrt("");
            c16378eim = null;
        }
        c16378eim.AhwBna.setText(C33069mpW.KWHzl(this, C13754dXa.FragmentManager.setFillInIntent, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("hardware", getString(C13754dXa.FragmentManager.sendBehavioSecData)))));
        C16378eim c16378eim2 = this.AEQbTJ;
        if (c16378eim2 == null) {
            Intrinsics.gEmmrt("");
            c16378eim2 = null;
        }
        c16378eim2.OLrzqt.setAdapter(this.copydefault);
        C16378eim c16378eim3 = this.AEQbTJ;
        if (c16378eim3 == null) {
            Intrinsics.gEmmrt("");
            c16378eim3 = null;
        }
        c16378eim3.copydefault.OLrzqt();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new HardwareWalletOneKeyScanningActivity$onCreate$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new HardwareWalletOneKeyScanningActivity$onCreate$2(this, null), 3, null);
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.eGZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                eGU.OLrzqt(this.AEQbTJ);
            }
        });
    }

    public static final void OLrzqt(eGU egu) {
        rVN.reportFullyDrawn$default((android.app.Activity) egu, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.C15433eId.StateListAnimator
    public void AEQbTJ(@NotNull OneKeyConnectedDevice oneKeyConnectedDevice) {
        Intrinsics.checkNotNullParameter(oneKeyConnectedDevice, "");
        this.KWHzl.launch(new ActivityC15412eHj.StateListAnimator(oneKeyConnectedDevice.getDevice().getConnectId(), oneKeyConnectedDevice.getDeviceId(), oneKeyConnectedDevice.getDevice().getDeviceType(), oneKeyConnectedDevice.getLabel(), AkhnZx()));
    }

    public final void OLrzqt(InterfaceC15415eHm interfaceC15415eHm) {
        boolean z = interfaceC15415eHm instanceof InterfaceC15415eHm.Activity;
        boolean z2 = z && (((InterfaceC15415eHm.Activity) interfaceC15415eHm).EZpvd().isEmpty() ^ true);
        C16378eim c16378eim = this.AEQbTJ;
        if (c16378eim == null) {
            Intrinsics.gEmmrt("");
            c16378eim = null;
        }
        android.widget.TextView textView = c16378eim.KWHzl;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(z2 ? 0 : 8);
        RecyclerView recyclerView = c16378eim.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        recyclerView.setVisibility(z2 ? 0 : 8);
        if (z) {
            InterfaceC15415eHm.Activity activity = (InterfaceC15415eHm.Activity) interfaceC15415eHm;
            if (!activity.EZpvd().isEmpty()) {
                KWHzl(activity.EZpvd());
                return;
            }
            return;
        }
        if (!Intrinsics.EZpvd(interfaceC15415eHm, InterfaceC15415eHm.TaskDescription.AEQbTJ)) {
            throw new NoWhenBranchMatchedException();
        }
        djBIcL();
    }

    public final void djBIcL() {
        valueOf().EZpvd(this, new Function0() { // from class: o.eGY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return eGU.OLrzqt();
            }
        }, new Function0() { // from class: o.eHb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return eGU.AEQbTJ(this.OLrzqt);
            }
        });
    }

    public static final Unit OLrzqt() {
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(eGU egu) {
        egu.finish();
        return Unit.INSTANCE;
    }

    private final void KWHzl(java.util.List<eFO> list) {
        this.copydefault.setItems(list);
        this.copydefault.notifyDataSetChanged();
    }

    @Override // o.AbstractActivityC15409eHg, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC15409eHg, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC15409eHg, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC15409eHg, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
