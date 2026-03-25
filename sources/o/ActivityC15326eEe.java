package o;

import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.wallet.hardware.HardwareWalletEvmNetworkActivity$mergeOrAddWallet$1;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.rxutils.RxBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eEe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class ActivityC15326eEe extends AbstractActivityC33013moT {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public ChainAddress AYXKKw;
    public AbstractC16377eil OLrzqt;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.eEh
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC15326eEe.AhwBna();
        }
    });
    public int valueOf = 1;
    public java.lang.String copydefault = "";
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.eEf
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC15326eEe.EZpvd();
        }
    });

    /* JADX INFO: renamed from: o.eEe$Application */
    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    public ActivityC15326eEe() {
        final Function0 function0 = null;
        this.gEmmrt = new ViewModelLazy(C56524yIo.AEQbTJ(C15345eEx.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.hardware.HardwareWalletEvmNetworkActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.hardware.HardwareWalletEvmNetworkActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.hardware.HardwareWalletEvmNetworkActivity$special$$inlined$viewModels$default$3
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

    /* JADX INFO: renamed from: o.eEe$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eEe.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final void OLrzqt(@NotNull android.app.Activity activity, int i, @NotNull java.lang.String str, @NotNull ChainAddress chainAddress) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(chainAddress, "");
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) ActivityC15326eEe.class);
            intent.putExtra(OtcExtraKeys.MODE, i);
            intent.putExtra("from", str);
            intent.putExtra("chainAddress", chainAddress);
            activity.startActivity(intent);
        }
    }

    private final C59534zip AYXKKw() {
        return (C59534zip) this.AEQbTJ.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C59534zip AhwBna() {
        return new C59534zip();
    }

    public final C15345eEx copydefault() {
        return (C15345eEx) this.gEmmrt.getValue();
    }

    public static final eEG EZpvd() {
        return new eEG();
    }

    public final eEG AEQbTJ() {
        return (eEG) this.KWHzl.getValue();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.OLrzqt = (AbstractC16377eil) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.flVtFt);
        this.valueOf = getIntent().getIntExtra(OtcExtraKeys.MODE, 1);
        java.lang.String stringExtra = getIntent().getStringExtra("from");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.copydefault = stringExtra;
        ChainAddress chainAddress = (ChainAddress) getIntent().getParcelableExtra("chainAddress");
        if (chainAddress == null) {
            return;
        }
        this.AYXKKw = chainAddress;
        gEmmrt();
        isConnected();
        valueOf();
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(xXH.class, new java.lang.String[0]);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXKWHzl, this);
        final Function1 function1 = new Function1() { // from class: o.eEl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC15326eEe.EZpvd(this.OLrzqt, (xXH) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.eEn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC15326eEe.AYXKKw(function1, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(ActivityC15326eEe activityC15326eEe, xXH xxh) {
        activityC15326eEe.finish();
        return Unit.INSTANCE;
    }

    private final void gEmmrt() {
        AbstractC16377eil abstractC16377eil = this.OLrzqt;
        AbstractC16377eil abstractC16377eil2 = null;
        if (abstractC16377eil == null) {
            Intrinsics.gEmmrt("");
            abstractC16377eil = null;
        }
        abstractC16377eil.copydefault.setAdapter(AYXKKw());
        AbstractC16377eil abstractC16377eil3 = this.OLrzqt;
        if (abstractC16377eil3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16377eil3 = null;
        }
        abstractC16377eil3.copydefault.addItemDecoration(new C6987aZj(ContextCompat.getColor(this, C13754dXa.StateListAnimator.EZpvd), C33052mpF.copydefault(1.0f, (android.content.Context) this), 0, 0, C33052mpF.copydefault(16.0f, (android.content.Context) this), C33052mpF.copydefault(16.0f, (android.content.Context) this)));
        AbstractC16377eil abstractC16377eil4 = this.OLrzqt;
        if (abstractC16377eil4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16377eil2 = abstractC16377eil4;
        }
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgThrottleFirst = C8003auW.copydefault(abstractC16377eil2.AEQbTJ).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS);
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgThrottleFirst, "");
        C58156yvv.copydefault(abstractC58247yxgThrottleFirst, this).subscribe(new InterfaceC58227yxM() { // from class: o.eEr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC15326eEe.KWHzl(this.EZpvd, obj);
            }
        });
    }

    public static final void KWHzl(final ActivityC15326eEe activityC15326eEe, java.lang.Object obj) {
        ChainAddress chainAddress;
        ChainAddress chainAddress2 = activityC15326eEe.AYXKKw;
        ChainAddress chainAddress3 = null;
        if (chainAddress2 == null) {
            Intrinsics.gEmmrt("");
            chainAddress = null;
        } else {
            chainAddress = chainAddress2;
        }
        final eFI efi = new eFI(chainAddress, -1, null, null, null, 28, null);
        activityC15326eEe.AEQbTJ().OLrzqt(activityC15326eEe.valueOf);
        activityC15326eEe.AEQbTJ().KWHzl(activityC15326eEe.copydefault);
        eEG eegAEQbTJ = activityC15326eEe.AEQbTJ();
        ChainAddress chainAddress4 = activityC15326eEe.AYXKKw;
        if (chainAddress4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            chainAddress3 = chainAddress4;
        }
        AbstractC58260yxt abstractC58260yxtKWHzl = C58156yvv.KWHzl(eEG.judgeIfCanBeMerged$default(eegAEQbTJ, chainAddress3.getCoinId(), null, 2, null), activityC15326eEe);
        final Function1 function1 = new Function1() { // from class: o.eEm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return ActivityC15326eEe.copydefault(this.copydefault, efi, (java.lang.Boolean) obj2);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eEq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj2) {
                ActivityC15326eEe.KWHzl(function1, obj2);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.eEo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return ActivityC15326eEe.OLrzqt((java.lang.Throwable) obj2);
            }
        };
        activityC15326eEe.addDisposable(abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eEp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj2) {
                ActivityC15326eEe.OLrzqt(function12, obj2);
            }
        }));
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(final ActivityC15326eEe activityC15326eEe, final eFI efi, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            activityC15326eEe.AEQbTJ().EZpvd(activityC15326eEe, new Function0() { // from class: o.eEk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ActivityC15326eEe.copydefault(this.copydefault, efi);
                }
            });
        } else {
            activityC15326eEe.EZpvd(efi);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ActivityC15326eEe activityC15326eEe, eFI efi) {
        activityC15326eEe.EZpvd(efi);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    private final void isConnected() {
        AYXKKw().register(eFG.class, new C15379eGd());
        AYXKKw().register(eFM.class, new C15380eGe(new Function1() { // from class: o.eEj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC15326eEe.OLrzqt(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
    }

    public static final Unit OLrzqt(ActivityC15326eEe activityC15326eEe, boolean z) {
        activityC15326eEe.copydefault().KWHzl(z);
        return Unit.INSTANCE;
    }

    private final void valueOf() {
        C15345eEx c15345eExCopydefault = copydefault();
        ChainAddress chainAddress = this.AYXKKw;
        if (chainAddress == null) {
            Intrinsics.gEmmrt("");
            chainAddress = null;
        }
        c15345eExCopydefault.EZpvd(chainAddress.getAddress());
        showLoading();
        copydefault().AEQbTJ().observe(this, new Application(new Function1() { // from class: o.eEg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC15326eEe.AEQbTJ(this.OLrzqt, (java.util.ArrayList) obj);
            }
        }));
        copydefault().KWHzl().observe(this, new Application(new Function1() { // from class: o.eEi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC15326eEe.AEQbTJ(this.EZpvd, (java.lang.String) obj);
            }
        }));
    }

    public static final Unit AEQbTJ(ActivityC15326eEe activityC15326eEe, java.util.ArrayList arrayList) {
        activityC15326eEe.dismissLoading();
        C59534zip c59534zipAYXKKw = activityC15326eEe.AYXKKw();
        Intrinsics.copydefault(arrayList);
        C33064mpR.OLrzqt(c59534zipAYXKKw, arrayList);
        rVN.reportFullyDrawn$default((android.app.Activity) activityC15326eEe, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(ActivityC15326eEe activityC15326eEe, java.lang.String str) {
        activityC15326eEe.dismissLoading();
        C55326xho.toast$default(activityC15326eEe.getString(C13754dXa.FragmentManager.fromCustomAction), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        rVN.reportFullyDrawn$default((android.app.Activity) activityC15326eEe, false, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public final void EZpvd(eFI efi) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new HardwareWalletEvmNetworkActivity$mergeOrAddWallet$1(this, efi, null), 3, null);
    }

    public final void djBIcL() {
        C55326xho.toastWithFailedIcon$default(C13754dXa.FragmentManager.launchUnitdefault, 0, 1, (java.lang.Object) null);
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
